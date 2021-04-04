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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(planArrayToString(cubePlanMap.get(Plan.TOP)));
        for (int i = 0; i < SIZE; i++) {
            stringBuilder.append(planArrayToStringByRow(cubePlanMap.get(Plan.FRONT), i))
                    .append(planArrayToStringByRow(cubePlanMap.get(Plan.LEFT), i))
                    .append(planArrayToStringByRow(cubePlanMap.get(Plan.RIGHT), i))
                    .append(planArrayToStringByRow(cubePlanMap.get(Plan.BACK), i))
                    .append("\n");
        }
        stringBuilder.append(planArrayToString(cubePlanMap.get(Plan.BOTTOM)));
        return stringBuilder.toString();
    }

    private String planArrayToString(char[][] planArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            stringBuilder.append("       ");
            for (int j = 0; j < SIZE; j++) {
                stringBuilder.append(planArray[i][j])
                        .append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private String planArrayToStringByRow(char[][] planArray, int row) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            stringBuilder.append(planArray[row][i])
                    .append(" ");
        }
        stringBuilder.append(" ");
        return stringBuilder.toString();
    }
}
