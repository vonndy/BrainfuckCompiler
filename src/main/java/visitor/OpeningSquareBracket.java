package visitor;

public class OpeningSquareBracket implements BrainFuckLexemes {
    @Override
    public void accept(Visitor visitor){
        visitor.visitOpeningSquareBracket();
    }

    @Override
    public char getSymbol() {
        return '[';
    }
}
