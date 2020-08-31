package visitor;

public interface Visitor {
    void visitPlus();
    void visitMinus();
    void visitOpeningSquareBracket();
    void visitClosingSquareBracket();
    void visitDot();
    void visitOpeningTriangleBracket();
    void visitClosingTriangleBracket();
}