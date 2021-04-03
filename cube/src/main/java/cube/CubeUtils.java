package cube;

import java.util.*;

import static cube.Cube.SIZE;

public class CubeUtils {

    private CubeUtils() {
    }

    public static Map<Plan, char[][]> createNormalPlanMap() {
        return createPlanMap(makeNormalColorList());
    }

    public static Map<Plan, char[][]> createRandomPlanMap() {
        return createPlanMap(makeRandomColorList());
    }

    private static Map<Plan, char[][]> createPlanMap(List<Character> colorList) {
        Map<Plan, char[][]> planMap = new HashMap<>();
        int count = 0;
        for (Plan plan : Plan.values()) {
            planMap.put(plan, createColorPlan(colorList, count++));
        }
        return planMap;
    }

    private static char[][] createColorPlan(List<Character> colorList, int count) {
        char[][] plan = new char[SIZE][SIZE];
        int index = count * SIZE * SIZE;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                plan[i][j] = colorList.get(i * SIZE + j + index);
            }
        }
        return plan;
    }

    private static List<Character> makeNormalColorList() {
        List<Character> colorList = new ArrayList<>();
        for (Color color : Color.values()) {
            for (int i = 0; i < SIZE * SIZE; i++) {
                colorList.add(color.getRepresentation());
            }
        }
        return colorList;
    }

    private static List<Character> makeRandomColorList() {
        List<Character> colorList = makeNormalColorList();
        Collections.shuffle(colorList);
        return colorList;
    }
}
