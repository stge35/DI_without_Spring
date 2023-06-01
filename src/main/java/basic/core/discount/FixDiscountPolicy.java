package basic.core.discount;

import basic.core.member.Grade;
import basic.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){ // Enum type 은 ==
            return discountFixAmount;
        }else{
            return 0;
        }
    }
}
