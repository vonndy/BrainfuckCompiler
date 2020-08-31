package command;

import compiler.Program;

public class PrintByte implements Command {
    private Program program;

    public PrintByte(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.addToOutput((char)(program.getMemory().getCurrentElement()));
    }
}
