package visitor;

public class Plus implements BrainFuckLexemes {
    @Override
    public void accept(Visitor visitor){
        visitor.visitPlus();
    }

    @Override
    public char getSymbol() {
        return '+';
    }
}
