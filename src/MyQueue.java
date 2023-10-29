public class MyQueue {
    // Maximale Größe der Queue
    private int maxSize;

    // Index des ersten Elements (vorne)
    private int front;

    // Index des letzten Elements (hinten)
    private int rear;

    // Aktuelle Anzahl der Elemente in der Queue
    private int currentSize;

    // Array zur Speicherung der Queue-Elemente (Strings in diesem Fall)
    private String[] array;

    public MyQueue(int size) {
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
        this.array = new String[maxSize];
    }

    // Überprüft, ob die Queue leer ist
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Überprüft, ob die Queue voll ist
    public boolean isFull() {
        return currentSize == maxSize;
    }

    // Fügt ein Element am Ende der Queue hinzu
    public void enqueue(String item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }
        // Zirkuläres Array: wenn rear das Ende des Arrays erreicht, geht es wieder zum Anfang
        rear = (rear + 1) % maxSize;
        array[rear] = item;
        currentSize++;
    }

    // Entfernt und gibt das vorderste Element der Queue zurück
    public String dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        // Speichern des vordersten Elements temporär zum späteren Zurückgeben
        String temp = array[front];
        // Zirkuläres Array: wenn front das Ende des Arrays erreicht, geht es wieder zum Anfang
        front = (front + 1) % maxSize;
        currentSize--;
        return temp;
    }
}
