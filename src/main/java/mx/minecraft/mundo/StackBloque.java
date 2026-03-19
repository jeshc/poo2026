package mx.unam.minecraft.mundo;

import java.util.ArrayList;

public class StackBloque<T> {
    private ArrayList<T> bloques;
    private int max;

    public StackBloque() {
        bloques = new ArrayList<>();
    }
    public void push(T bloque) {
        if(bloques.size() >= max) return;
        bloques.add(bloque);
    }
    public T pop() {
        if(bloques.size() <= 0) return null;
        return bloques.remove(bloques.size()-1);
    }

}
