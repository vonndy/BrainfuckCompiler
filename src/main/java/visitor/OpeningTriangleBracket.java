package visitor;

public class OpeningTriangleBracket implements BrainFuckLexemes {
    @Override
    public void accept(Visitor visitor){
        visitor.visitOpeningTriangleBracket();
    }

    @Override
    public char getSymbol() {
        return '<';
    }
}
