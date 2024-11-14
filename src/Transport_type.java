public enum Transport_type {
    CAR ("car"),
    PLANE ("plane"),
    TRAIN ("train"),
    SHIP ("ship");

    private String title;

    Transport_type(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
