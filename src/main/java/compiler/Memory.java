package compiler;

public class Memory {
    private short [] cpu;
    private int pointer;
    public Memory(){
        pointer = 0;
        cpu = new short[30000];
    }

    public short getCurrentElement(){
        return cpu[pointer];
    }
    public void setCurrentElement(short element){
        cpu[pointer] = element;
    }
    public int getPointer(){
        return pointer;
    }
    public void setPointer(int newPointer){
        pointer = newPointer;
    }
}
