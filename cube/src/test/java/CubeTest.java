import cube.Color;
import cube.Cube;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CubeTest {
    private Cube normalCube;
    private Cube randomCube;

    @BeforeEach
    void createCube() {
        normalCube = Cube.createNormal();
        randomCube = Cube.createRandom();
    }

    @DisplayName("normal 큐브가 잘 만들어지는지 확인")
    @Test
    void createNormalCube() {
        char[][] front = {{'R', 'R', 'R'}, {'R', 'R', 'R'}, {'R', 'R', 'R'}};
        char[][] back = {{'O', 'O', 'O'}, {'O', 'O', 'O'}, {'O', 'O', 'O'}};
        char[][] right = {{'Y', 'Y', 'Y'}, {'Y', 'Y', 'Y'}, {'Y', 'Y', 'Y'}};
        char[][] left = {{'G', 'G', 'G'}, {'G', 'G', 'G'}, {'G', 'G', 'G'}};
        char[][] top = {{'B', 'B', 'B'}, {'B', 'B', 'B'}, {'B', 'B', 'B'}};
        char[][] bottom = {{'P', 'P', 'P'}, {'P', 'P', 'P'}, {'P', 'P', 'P'}};

        assertAll(
                () -> assertThat(normalCube.getFront()).isEqualTo(front),
                () -> assertThat(normalCube.getBack()).isEqualTo(back),
                () -> assertThat(normalCube.getRight()).isEqualTo(right),
                () -> assertThat(normalCube.getLeft()).isEqualTo(left),
                () -> assertThat(normalCube.getTop()).isEqualTo(top),
                () -> assertThat(normalCube.getBottom()).isEqualTo(bottom)
        );
    }

    @DisplayName("random 큐브가 잘 만들어지는 확인")
    @Test
    void createRandomCube() {
        print(randomCube.getFront());
        print(randomCube.getBack());
        print(randomCube.getRight());
        print(randomCube.getLeft());
        print(randomCube.getTop());
        print(randomCube.getBottom());
    }

    private void print(char[][] plan) {
        for (int i = 0; i < Cube.SIZE; i++) {
            for (int j =0; j<Cube.SIZE; j++){
                System.out.print(plan[i][j]);
            }
        }
        System.out.println();
    }
}