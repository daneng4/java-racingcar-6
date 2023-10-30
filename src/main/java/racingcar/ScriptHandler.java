package racingcar;

public class ScriptHandler {

    private static final String REQUIRE_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String REQUIRE_ATTEMPT_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String PROGRESS_RESULT = "실행결과";

    public void printGetCarNameScript(){
        System.out.println(REQUIRE_CAR_NAME_MESSAGE);
    }

    public void printGetAttemptScript(){
        System.out.println(REQUIRE_ATTEMPT_NUMBER_MESSAGE);
    }

    public void printSimpleResultScript(){
        System.out.println(PROGRESS_RESULT);
    }

    public void printCarMovement(){

    }

    public void printSoloWinner(){

    }

    public void printJointWinner(){

    }
}
