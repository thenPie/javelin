
public class person {
    
    enum state {
        alive, dead
    }

    private String name;
    private Integer hp;
    private state state;

    public String getName() {
        return name;
    }

    public Integer getHp() {
        return hp;
    }

    public state getState() {
        return state;
    }

    private void setHp(Integer hp) {
        this.hp = hp;
    }

    private void setState(state state) {
        this.state = state;
    }

    public person(String name) {
        this.name = name;
        hp = 100;
        state = state.alive;
    }

    public void attack(person attacked) {
        if (attacked.state == state.alive) {
            attacked.setHp(attacked.getHp() - (int) ((Math.random() * (20 - 5)) + 5));
            System.out.println(getName() + " is attacking " + attacked.getName() + "\n" + attacked.getName() + " hp is " + attacked.getHp());
            if (attacked.getHp() <= 0) {
                attacked.state = state.dead;
                System.out.println(attacked.getName() + " is dead");
            }
        }
    }

    private void death(person attacked) {
        attacked.state = state.dead;
    }

}
