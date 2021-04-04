package plan;

import java.util.*;

import static cube.Cube.SIZE;

public class CubePlan {

    public  Map<Plan, char[][]> createNormalCubePlanMap() {
        return createCubePlanMap(makeNormalColorList());
    }

    public Map<Plan, char[][]> createRandomCubePlanMap() {
        return createCubePlanMap(makeRandomColorList());
    }

    private  Map<Plan, char[][]> createCubePlanMap(List<Character> colorList) {
        Map<Plan, char[][]> planMap = new HashMap<>();
        int count = 0;
        for (Plan plan : Plan.values()) {
            planMap.put(plan, createColorPlan(colorList, count++));
        }
        return planMap;
    }

    private  char[][] createColorPlan(List<Character> colorList, int count) {
        char[][] plan = new char[SIZE][SIZE];
        int index = count * SIZE * SIZE;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                plan[i][j] = colorList.get(i * SIZE + j + index);
            }
        }
        return plan;
    }

    private  List<Character> makeNormalColorList() {
        List<Character> colorList = new ArrayList<>();
        for (Color color : Color.values()) {
            for (int i = 0; i < SIZE * SIZE; i++) {
                colorList.add(color.getRepresentation());
            }
        }
        return colorList;
    }

    private List<Character> makeRandomColorList() {
        List<Character> colorList = makeNormalColorList();
        Collections.shuffle(colorList);
        return colorList;
    }
}
