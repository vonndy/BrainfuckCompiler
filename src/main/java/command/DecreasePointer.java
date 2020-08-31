package command;

import compiler.Program;

public class DecreasePointer implements Command {
    private Program program;

    public DecreasePointer(Program program) {
        this.program = program;
    }

    @Override
    public void execute() {
        program.getMemory().setPointer(program.getMemory().getPointer() - 1);
    }
}
