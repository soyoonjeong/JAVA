package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override //상속받은 메서드를 재정의할 때 메서드 이름이 틀리지 않게 쓰기 위한 어노테이션
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(),member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
        //Optional<T> 클래스는 Integer나 Double 클래스처럼 'T'타입의 객체를 포장해 주는 래퍼 클래스(Wrapper class)
        //ofNullable() 메소드는 명시된 값이 null이 아니면 명시된 값을 가지는 Optional 객체를 반환하며,
        // 명시된 값이 null이면 비어있는 Optional 객체를 반환합니다.
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member->member.getName().equals(name))
                .findAny();
        //stream API
        //stream() <- 스트림생성
        //filter < - 중간 연산 (스트림 변환) - 조건에 충족하는 요소를 Stream으로 생성
        //findAny <- 최종 연산 (스트림 사용) - 마지막에 단 한 번만 사용 가능합니다.
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}
