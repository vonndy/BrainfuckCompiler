package visitor;

public interface BrainFuckLexemes {
    void accept(Visitor visitor);
    char getSymbol();
}
