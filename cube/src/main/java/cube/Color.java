package cube;

public enum Color {
    RED('R'),
    ORANGE('O'),
    YELLOW('Y'),
    GREEN('G'),
    BLUE('B'),
    PURPLE('P');

    private final char representation;

    Color(char representation){
        this.representation = representation;
    }

    public char getRepresentation() {
        return representation;
    }
}
