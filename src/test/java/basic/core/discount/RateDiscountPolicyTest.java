package basic.core.discount;

import basic.core.member.Grade;
import basic.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 는 10% 할인이 되어야 한다.")
    void vipO() {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when
        int discount = discountPolicy.discount(member, 10000);

        // then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP 가 아니면 할인이 적용되지 않아야 한다.")
    void vipX() {
        //given
        Member member = new Member(2L, "memberB", Grade.BASIC);

        //when
        int discount = discountPolicy.discount(member, 20000);

        //then
        assertThat(discount).isEqualTo(0);
    }

}