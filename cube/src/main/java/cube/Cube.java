package cube;

import plan.Plan;

import java.util.*;

public class Cube {
    public static final int SIZE = 3;
    private final Map<Plan, char[][]> cubePlanMap;

    public Cube(Map<Plan, char[][]> cubePlanMap) {
        this.cubePlanMap = cubePlanMap;
    }

    public Map<Plan, char[][]> getCubePlanMap() {
        return cubePlanMap;
    }
}
