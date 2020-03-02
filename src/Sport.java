public enum Sport {
    VOLLEYBALL("Volleyball"),
    BASKETBALL("Basketball"),
    FOOTBALL("Football");
    private String sport;

    Sport(String _sport) {
        this.sport = _sport;
    }

    @Override
    public String toString() {
        return this.sport;
    }
}
