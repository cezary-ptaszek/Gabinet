package pl.uam.gabinet.exceptions;

public class VisitNotFoundException extends Exception {
    public VisitNotFoundException() {
        super("Visit not found");
    }
}
