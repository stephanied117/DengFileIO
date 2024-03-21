import java.util.ArrayList;

public class WebStack {
    private ArrayList<Webpage> internalList;

    public WebStack() {
        internalList = new ArrayList<Webpage>();
    }

    //isEmpty() returns true if nothing is on the top of the stack.
    //Otherwise, returns false.
    public boolean isEmpty() {
        if (internalList.size() == 0) {
            return true;
        }
        return false;
    }

    //push() adds an element to the top of the stack.
    public void push(Webpage item) {
        internalList.add(item);
    }

    //pop() removes and returns the top element of the stack.
    //If pop() is called when the stack is empty, returns null instead.
    public Webpage pop() {
        if (isEmpty() == false) {
            internalList.remove(internalList.size() - 1);
            return internalList.get(internalList.size() - 1);
        }
        return null;
    }

    //peek() returns the top element of the stack but does not remove it.
    //If pop() is called when the stack is empty, returns null instead.
    public Webpage peek() {
        if (isEmpty()) {
            return null;
        } else {
            return internalList.get(internalList.size() - 1);
        }
    }

    //size() returns the number of elements in the stack.
    public int size() {
        return internalList.size();
    }

    //clear() removes all elements from the stack.
    public void clear() {
        int count = internalList.size() - 1;
        while (internalList.size() > 0) {
            internalList.remove(count);
            count--;
        }
    }

    //toString() should return a String containing the name of each Webpage in the stack.
    //Each Webpage name should be on a new line and arranged such that
    //The top of the stack is the first line and the bottom of the stack is the last line.
    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < internalList.size(); i++) {
            temp = internalList.get(i).getName() + "\n" + temp;
        }
        return temp;
    }
}
