package jpabook.jpashop.repository;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MemberRepositoryTest {
    @Autowired MemberRepository memberRepository;

//    @Test
//    @Transactional
//    @Rollback(false)
//    public void testMember() {
//        // given : member 생성
//        Member member = new Member();
//        member.setUsername("memberA");
//        Long saveId = memberRepository.save(member);
//
//        // when : Member 조회
//        Member findMember = memberRepository.find(saveId);
//
//        // then
//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//        Assertions.assertThat(findMember).isEqualTo(member);
//    }
}