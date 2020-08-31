package command;

import compiler.Program;

public class IncreasePointer implements Command {
    private Program program;

    public IncreasePointer(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.getMemory().setPointer(program.getMemory().getPointer() + 1);
    }
}
