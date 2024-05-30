class Potion extends Item {
    private int duration;
    private int effectPoint;
    private String type;
    public Potion(String name, String rank, double price, int duration, int effectPoint, String type) {
        super(name, rank, price);
        this.duration = duration;
        this.effectPoint = effectPoint;
        this.type = type;
    }
    public void use() {
        if ("Attack".equalsIgnoreCase(type)) {
            System.out.println("Damage dealt by " + effectPoint);
        } else if ("Heal".equalsIgnoreCase(type)) {
            System.out.println("Healed by " + effectPoint);
        }
    }
    // Getter methods
    public int getDuration() {
        return duration;
    }
    public int getEffectPoint() {
        return effectPoint;
    }
    public String getType() {
        return type;
    }
}