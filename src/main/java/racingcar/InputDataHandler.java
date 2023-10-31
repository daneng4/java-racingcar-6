package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputDataHandler {

    public InputValidator inputValidator = new InputValidator();
    public String[] carNames;
    private String input;
    private String attemptNumber;

    public String[] getStringFromPlayer(){
        input = Console.readLine();
        carNames = seperateString(input);
        inputValidator.checkString(carNames);

        return carNames;
    }

    public int getNumberFromPlayer(){
        attemptNumber = Console.readLine();
        inputValidator.checkNumber(attemptNumber);
        return Integer.parseInt(attemptNumber);
    }

    public String[] seperateString(String inputCarNames){
        return inputCarNames.split(",");
    }
}
