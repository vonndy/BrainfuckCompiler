package visitor;

public class Minus implements BrainFuckLexemes {
    @Override
    public void accept(Visitor visitor){
        visitor.visitMinus();
    }

    @Override
    public char getSymbol() {
        return '-';
    }
}
