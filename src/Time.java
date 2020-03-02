public enum Time {
    FIRST("16:20"),
    SECOND("17:00"),
    THIRD("17:40");
    private String time;

    private Time(String _time) {
        this.time = _time;
    }

    @Override
    public String toString() {
        return this.time;
    }
}
