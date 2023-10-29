package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashMap;

public class Player {

    private HashMap<String, Integer> cars = new HashMap<>();
    private String[] inputCarNames;
    private int attemptNumber;


    public void setCarName() {
        inputCarNames = Console.readLine().split(",");
        for (String inputCarName : inputCarNames) {
            cars.put(inputCarName, 0);
        }
    }

    public HashMap<String, Integer> getCarName() {
        return cars;
    }

    public String getCarName(int index) {
        return inputCarNames[index];
    }

    public void setAttemptNumber() {
        attemptNumber = Integer.parseInt(Console.readLine());
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public int getCarMoveForward(String carName) {
        return cars.get(carName);
    }

    public int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

}
