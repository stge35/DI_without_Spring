package basic.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        // given(환경이 주어졌을 때)
        Member  member = new Member(1L, "member", Grade.VIP);

        // when(이렇게 했을 때)
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then(이렇게 된다.)
        Assertions.assertThat(member).isEqualTo(findMember);

        // findMember 로 찾은 member 객체의 주소와 new Member로 선언한 객체의 주소가 같기 때문에 일치한다.

    }
}
