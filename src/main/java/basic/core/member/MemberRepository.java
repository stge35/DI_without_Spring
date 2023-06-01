package basic.core.member;


public interface MemberRepository {
    void save(Member member);

    basic.core.member.Member findById(Long memberId);
}
