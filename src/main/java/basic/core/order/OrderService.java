package basic.core.order;

import basic.core.member.MemberService;
import basic.core.member.MemberServiceImpl;

public interface OrderService {
    // order 를 만드는 메서

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
