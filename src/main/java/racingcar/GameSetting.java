package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashMap;

public class GameSetting {

    public InputDataHandler inputDataHandler = new InputDataHandler();
    private HashMap<String, Integer> cars = new HashMap<>();
    private String[] inputCarNames;
    private int attemptNumber;


    public HashMap<String, Integer> createCarName() {
        cars = inputDataHandler.getStringFromPlayer();
        return cars;
    }

    public String getCarName(int index) {
        return inputCarNames[index];
    }

    public void setAttemptNumber() {
        inputDataHandler
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