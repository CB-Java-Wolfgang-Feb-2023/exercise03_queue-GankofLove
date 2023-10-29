# Queue

Eine Queue (dt. Warteschlange) ist eine Sammlung von Elementen, die nach dem First-In-First-Out (FIFO) Prinzip arbeitet. Das bedeutet, dass das erste Element, das in die Queue eingefügt wird, auch das erste ist, das wieder herausgenommen wird.

In Java ist Queue ein Interface aus dem java.util Paket, das die grundlegende Funktionalität einer Warteschlange definiert.

Die "Elemente" in einer Queue können in der Praxis nahezu beliebige Objekte oder Datenstrukturen sein, je nachdem, welches Problem mit der Queue gelöst werden soll.

### Beispiele:

1. **Datenpakete in Netzwerken:**
    - In Computernetzwerken werden oft Datenpakete in einer Queue gespeichert, bevor sie gesendet oder nach Erhalt verarbeitet werden.


2. **Aufträge für einen Drucker:**
    - In einem Büro könnten Druckaufträge in einer Queue gespeichert werden, sodass sie in der Reihenfolge, in der sie ankommen, gedruckt werden.


3. **Befehle in einer Befehlsausführung:**
    - Ein System könnte Befehle in einer Queue speichern, um sie der Reihe nach auszuführen.


4. **Kunden in einem Kundendienstsystem:**
    - Ein Callcenter könnte eingehende Anrufe in einer Warteschlange speichern, um sie in der Reihenfolge ihres Eingangs zu bearbeiten.


5. **Daten in einer Datenverarbeitungs-Pipeline:**
    - Bei der Datenverarbeitung könnten Datenpunkte oder -sätze in einer Queue gespeichert werden, um sie sequenziell zu verarbeiten.


6. **Tasks in einem Task-Management-System:**
    - Ein System könnte Tasks in einer Queue speichern, um sie nach Priorität oder nach ihrem Eingangszeitpunkt zu bearbeiten.


7. **Ereignisse in einem Event-basierten System:**
    - Ein ereignisgesteuertes System könnte Ereignisse in einer Queue speichern, um sie in der Reihenfolge ihres Eintreffens zu bearbeiten.


## Notizen zum Code

queue.dequeue(). 
Die dequeue-Methode entfernt und gibt das vorderste Element der Queue zurück. Der zurückgegebene Wert (das entfernte Element) wird dann mit "Entfernt: " in der Konsole ausgegeben.

Dieser Codeabschnitt durchläuft jedes Element in der Queue von vorne bis hinten und entfernt jedes Element nacheinander, während es gleichzeitig den Wert des entfernten Elements ausgibt. Am Ende dieses Abschnitts wird die Queue vollständig geleert sein.