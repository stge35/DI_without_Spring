package basic.core;

import basic.core.discount.DiscountPolicy;
import basic.core.discount.FixDiscountPolicy;
import basic.core.member.MemberRepository;
import basic.core.member.MemberService;
import basic.core.member.MemberServiceImpl;
import basic.core.member.MemoryMemberRepository;
import basic.core.order.OrderService;
import basic.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }



    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
}
