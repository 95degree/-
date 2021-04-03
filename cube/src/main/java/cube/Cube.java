package cube;

import java.util.*;

public class Cube {
    public static final int SIZE = 3;
    private final char[][] front;
    private final char[][] back;
    private final char[][] right;
    private final char[][] left;
    private final char[][] top;
    private final char[][] bottom;

    private Cube(Map<Plan, char[][]> planMap) {
        this.front = planMap.get(Plan.FRONT);
        this.back = planMap.get(Plan.BACK);
        this.right = planMap.get(Plan.RIGHT);
        this.left = planMap.get(Plan.LEFT);
        this.top = planMap.get(Plan.TOP);
        this.bottom = planMap.get(Plan.BOTTOM);
    }

    public static Cube createNormal() {
        return new Cube(CubeUtils.createNormalPlanMap());
    }

    public static Cube createRandom(){
        return new Cube(CubeUtils.createRandomPlanMap());
    }

    public char[][] getFront() {
        return front;
    }

    public char[][] getBack() {
        return back;
    }

    public char[][] getRight() {
        return right;
    }

    public char[][] getLeft() {
        return left;
    }

    public char[][] getTop() {
        return top;
    }

    public char[][] getBottom() {
        return bottom;
    }
}
