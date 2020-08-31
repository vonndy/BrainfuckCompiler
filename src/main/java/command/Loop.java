package command;

import compiler.Program;
import java.util.ArrayList;

public class Loop implements Command {
    private Program program;
    private ArrayList<Command> commands;

    public Loop(Program program, ArrayList<Command> commands) {
        this.program = program;
        this.commands = commands;
    }

    @Override
    public void execute() {
        while(program.getMemory().getCurrentElement() != 0)
            for (Command command : commands)
                command.execute();
    }
}
