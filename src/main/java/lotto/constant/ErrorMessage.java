package lotto.constant;

import static lotto.constant.PurchaseConfig.*;

public enum ErrorMessage {
    ERROR_HEADER("[ERROR]"),
    INVALID_NUMBER_FORMAT("[ERROR] 올바른 숫자를 입력해주세요."),


    INVALID_LOTTO_COUNT("로또 번호는 6개여야 합니다."),
    INVALID_LOTTO_RANGE("로또 숫자 범위는 1~45 사이입니다."),
    INVALID_LOTTO_NUMBER_DUPLICATION("중복된 번호가 존재합니다."),


    INVALID_PURCHASE_UNIT(String.format("[ERROR] 구입금액은 %d원 단위로 입력되어야 합니다.", PURCHASE_UNIT)),
    INVALID_PURCHASE_RANGE(String.format("[ERROR] 구입금액은 %d원 이상, %d원 이하의 수여야 합니다. (%d원 단위 입력)", MIN_PURCHASE, MAX_PURCHASE, PURCHASE_UNIT));

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_HEADER.message + " " + message;
    }
}