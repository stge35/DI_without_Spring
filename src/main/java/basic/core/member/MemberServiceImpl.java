package basic.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
        // memberRepository.save 를 호출을 하면 다형성에 의해서 MemoryMemberRepository 에 있는 save 가 호출이 된다.
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
