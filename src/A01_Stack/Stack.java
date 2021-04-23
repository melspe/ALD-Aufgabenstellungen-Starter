package A01_Stack;


public class Stack<T>
{
	 private Node<T> first;
    /**
     * Oberstes Element entfernen und zur�ckliefern.
     * Existiert kein Element, wird eine Exception ausgel�st.
     * @throws StackEmptyException 
     */
    public T pop() throws StackEmptyException {

        if(first == null){
            throw new StackEmptyException();
        }

        Node temp = first;
        first = temp.getNext();
        return (T)temp.getData();

    }
    
    /**
     * �bergebenen T auf Stack (als oberstes Element) speichern.
     * @param i data
     */
    public void push(T i) {
        Node a = new Node<T>(i);
        a.setNext(first);
        first = a;

    }
    
    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {

        if(first == null){
            return 0;
        }

        Node temp = first;
        int i = 1;
        while (temp.getNext() !=null){
            i++;
            temp = temp.getNext();
        }

    	return i;
    }
}
