package HospitalManagementSystem.UI;

import java.util.ArrayList;
// import something.GUILibrary

public class Window {
    private String title;
    private int[] size;
    private ArrayList<ArrayList<Byte>> currentFrame;

    public Window() {
        size = new int[2];
    }

    public void display() {
        // GUILibrary.display(currentFrame);
    }

    public void interact() {
        // GUILibrary.interact(currentFrame);
    }

    public void close() {
        size = new int[]{0, 0};
    }


    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
