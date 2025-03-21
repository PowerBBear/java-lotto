package lotto;

import lotto.model.LottoNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoNumberTest {

    @DisplayName("로또 숫자 범위에 맞지 않으면 에러를 띄운다.")
    @Test
    void 로또_숫자_범위외() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new LottoNumber(46)).withMessage("로또 숫자의 범위가 올바르지 않았습니다.");
    }

    @DisplayName("로또 숫자를 출력한다.")
    @Test
    void 로또_숫자_출력() {
        assertThat(new LottoNumber(45).getLottoNumber()).isEqualTo(45);
    }
}
