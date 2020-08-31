package compiler;

import command.Command;
import visitor.*;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Program {
    private Memory memory;
    private StringBuilder output;
    private ArrayDeque<ArrayList<Command>> commands;

    public Program(){
        memory = new Memory();
        output = new StringBuilder();
        commands = new ArrayDeque<>();
        commands.add(new ArrayList<>());
    }
    public Memory getMemory(){
        return memory;
    }

    public void addToOutput(char symbol) {
        output.append(symbol);
    }

    public void addLoop(){
        commands.push(new ArrayList<>());
    }

    public ArrayList<Command> endLoop(){
        return commands.pop();
    }

    public void addCommand(Command command) {
        commands.getFirst().add(command);
    }

    private void fromSymbolsToCommands(String input){
        BrainFuckLexemes[] lexemes = {new Plus(),
                new Dot(),
                new Minus(),
                new OpeningSquareBracket(),
                new OpeningTriangleBracket(),
                new ClosingSquareBracket(),
                new ClosingTriangleBracket()};
        ArrayList<BrainFuckLexemes> listOfLexemes = new ArrayList<>();
        for(char symbol: input.toCharArray())
            for(BrainFuckLexemes l: lexemes)
                if(symbol == l.getSymbol())
                    listOfLexemes.add(l);
        ProgramVisitor programVisitor = new ProgramVisitor(this);
        for(BrainFuckLexemes l: listOfLexemes)
            l.accept(programVisitor);
    }

    public String run(String input){
        if(input != null) {
            fromSymbolsToCommands(input);
            for (Command command : commands.getFirst()) {
                command.execute();
            }
            return output.toString();
        } else return null;
    }
}
