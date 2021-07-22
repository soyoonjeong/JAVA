package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

// 테스트 주도 개발(TDD) : 테스트 케이스를 작성한 후 구현 클래스를 작성하는 방법
public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }
    // 테스트를 독립적으로 실행하기 위해 각 테스트 종료할 때마다 메모리 DB에 저장된 데이터 삭제

    @Test
    public void save(){
        Member member = new Member();
        member.setName("soyoon");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        // getId()의 반환값이 Optional이기 떄문에 get()해줘야 함

        Assertions.assertThat(result).isEqualTo(member);
        //Assertions.assertEquals(member,result)로 대체가능

    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result =  repository.findByName("spring1").get();

        Assertions.assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result =  repository.findAll();

        Assertions.assertThat(result.size()).isEqualTo(2);
    }
}
