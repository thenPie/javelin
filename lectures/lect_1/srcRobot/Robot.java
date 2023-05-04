
package srcRobot;

import java.util.ArrayList;

public class Robot {

    /**
     * Два возможных состояния
     */
    enum State {
        on, off
    }

    private static Integer defIndex;
    private static ArrayList<String> names;

    static {
        defIndex = 1;
        names = new ArrayList<String>();
    }
    
    /**
     * Имя робота.
     */
    private String name;

    /**
     * Уровень робота.
     */
    private Integer level;

    private State state;

    /**
     * Возвращает имя робота.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает уровень робота.
     * @return
     */
    public Integer getLevel() {
        return level;
    }
    
    /**
     * Создание робота.
     * @param name - задаёт имя роботу.
     * @param level - задаёт уровень роботу.
     */
    public Robot(String name, Integer level) {
        if ((name.isEmpty() || Character.isDigit(name.charAt(0))) || Robot.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defIndex++);
        } else {
            this.name = name;
        }

        Robot.names.add(this.name);
        this.level = level;
        this.state = State.off;

    }

    // Правильные конструкторы, don't repeat yourself
    
    public Robot(String name) {
        this(name, 1);
    }

    public Robot() {
        this("");
    }

    /**
     * Метод вкл/выкл робота
     */
    public void power() {
        if (this.state == state.off) {
            this.powerON();
            this.state = State.on;
        } else {
            this.powerOFF();
            this.state = State.off;
            System.out.println();
        }
    }

    /**
     * Включает робота.
     */
    private void powerON() {
        startBIOS();
        startOS();
    }

    /**
     * Выключает робота.
     */
    private void powerOFF() {
        finishOS();
        finishBIOS();
    }

    /**
     * Включает БИОС
     */
    private void startBIOS() {
        System.out.println("Turning on BIOS");
    }

    /**
     * Включает ОС
     */
    private void startOS() {
        System.out.println("Turning on OS");
    }

    /**
     * Выключает ОС
     */
    private void finishOS() {
        System.out.println("Turning off OS");
    }

    /**
     * Выключает БИОС
     */
    private void finishBIOS() {
        System.out.println("Turning off BIOS");
    }

    /**
     * Выполнение работы роботом.
     */
    public void work() {
        if (this.state == State.on) {
            System.out.println("Working...");
        }
    }
    
    @Override
    public String toString() {
        return name + " " + level;
    }

}
