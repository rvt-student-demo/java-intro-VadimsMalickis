package lv.rvt.connecticut;


// Tagad mēs varam izmatot Card klasi, tikai ka super/parent klasi
// Priekš citām klasēm
public abstract class Card {

    // Pataisa šo klases mainīgo neredzamo priekš citām klasēm!
    //
    // Izņemot! visas dotās klases (Card) sub/child klases
    protected String recipient;

    public abstract void printGreeting();

    public String getType() {
        return "CARD"; // Funkcionalitāte
    }
}
