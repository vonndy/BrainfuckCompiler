package command;

import compiler.Program;

public class IncreaseByte implements Command {
    private Program program;

    public IncreaseByte(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.getMemory().setCurrentElement((short) (program.getMemory().getCurrentElement() + 1));
    }
}
