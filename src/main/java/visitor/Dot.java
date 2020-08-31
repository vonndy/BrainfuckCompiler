package visitor;

public class Dot implements BrainFuckLexemes {
    @Override
    public void accept(Visitor visitor){
        visitor.visitDot();
    }

    @Override
    public char getSymbol() {
        return '.';
    }
}
