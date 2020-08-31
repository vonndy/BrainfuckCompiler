package visitor;

import command.*;
import compiler.Program;

public class ProgramVisitor implements Visitor {
    private Program program;

    public ProgramVisitor(Program program){
        this.program = program;
    }

    @Override
    public void visitPlus() {
        program.addCommand(new IncreaseByte(program));
    }

    @Override
    public void visitMinus() {
        program.addCommand(new DecreaseByte(program));
    }

    @Override
    public void visitOpeningSquareBracket() {
        program.addLoop();
    }

    @Override
    public void visitClosingSquareBracket() {
        program.addCommand(new Loop(program, program.endLoop()));
    }

    @Override
    public void visitDot() {
        program.addCommand(new PrintByte(program));
    }

    @Override
    public void visitOpeningTriangleBracket() {
        program.addCommand(new DecreasePointer(program));
    }

    @Override
    public void visitClosingTriangleBracket() {
        program.addCommand(new IncreasePointer(program));
    }
}
