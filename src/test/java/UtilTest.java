import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilTest {

    /**
     * 01. 입력한 문자열에 Comma(,)가 포함되어있는지 테스트 <br/>
     */
    @Test
    @DisplayName("01 문자열_구분_테스트")
    void 문자열_구분_테스트() {
        String carNames = "pobi,woni,jun\n";

        StringUtils util = new StringUtils();
        assertThat(util.isIncludeComma(carNames)).isEqualTo(true);
    }

    /**
     * 02. 입력한 carName이 5글자 이상일 떄 false인지 테스트 <br/>
     */
    @Test
    @DisplayName("02 차_이름_5글자_이상일_떄_테스트")
    void 차_이름_5글자_이상일_떄_테스트() {
        String carNameCase = "greentea";
        StringUtils util = new StringUtils();
        assertThat(util.validationCarName(carNameCase)).isEqualTo(false);
    }


    /**
     * 03. 입력할 carName은 5글자 이하만 받을 수 있어야함 <br/>
     */
    @Test
    @DisplayName("03 차_이름_5글자_이하일_떄_테스트")
    void 차_이름_5글자_이하일_떄_테스트() {
        String carNameCase = "pobi";
        StringUtils util = new StringUtils();
        assertThat(util.validationCarName(carNameCase)).isEqualTo(true);
    }
}
