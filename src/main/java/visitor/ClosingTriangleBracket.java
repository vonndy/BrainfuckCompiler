package visitor;

public class ClosingTriangleBracket implements BrainFuckLexemes {
    @Override
    public void accept(Visitor visitor){
        visitor.visitClosingTriangleBracket();
    }

    @Override
    public char getSymbol() {
        return '>';
    }
}
