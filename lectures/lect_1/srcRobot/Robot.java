
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
        this.name = name;
        this.level = level;
    }

    /**
     * Включает робота.
     */
    public void powerON() {
        startBIOS();
        startOS();
    }

    /**
     * Выключает робота.
     */
    public void powerOFF() {
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
     * Робот работает
     */
    public void work() {
        System.out.println("Working...");
    }

}
