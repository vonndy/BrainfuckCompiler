package command;

import compiler.Program;

public class DecreaseByte implements Command {
    private Program program;

    public DecreaseByte(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.getMemory().setCurrentElement((short) (program.getMemory().getCurrentElement() - 1));
    }
}
