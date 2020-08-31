package visitor;

public class ClosingSquareBracket implements BrainFuckLexemes {
    @Override
    public void accept(Visitor visitor){
        visitor.visitClosingSquareBracket();
    }

    @Override
    public char getSymbol() {
        return ']';
    }
}
