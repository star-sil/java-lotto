package lotto.type;

/**
 * 출력 문구 상수를 모아둔 Enum 클래스
 */
public enum TextType {
    PURCHASE_INPUT_MESSAGE("구입금액을 입력해 주세요."),
    LOTTO_COUNT_MESSAGE("개를 구매했습니다."),
    WIN_NUMBER_INPUT_MESSAGE("\n당첨 번호를 입력해 주세요"),
    BONUS_NUMBER_INPUT_MESSAGE("\n보너스 번호를 입력해 주세요.");

    private final String text;

    TextType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
