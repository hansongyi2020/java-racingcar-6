package model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class RaceCar {
    private final String name;
    private int moveForwardCount;

    public RaceCar(String name) {
        this.name = name;
    }

    public void MoveForward() {
        ++moveForwardCount;
    }

    public String getName() {
        return new String(name);
    }

    public int getMoveForwardCount() {
        int copyMoveForwardCount = moveForwardCount;

        return copyMoveForwardCount;
    }

}
