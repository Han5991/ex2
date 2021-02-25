package org.zerock.ex2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.ex2.entity.Memo;

import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass(){
        System.out.println(memoRepository.getClass().getName());
    }
    @Test
    public void testInsertDummies(){
        IntStream.rangeClosed(1,100).forEach(i->{
            Memo memo = Memo.builder().memoText("sample..."+i).build();
            memoRepository.save(memo);
        });
    }
    @Test
    public void testUpdate(){
        Memo memo = Memo.builder().mno(100L).memoText("Update Text").build();
        System.out.println("===========================");
        System.out.println(memoRepository.save(memo));
        System.out.println("---------------------------");
    }
    @Test
    public void testDelete(){
        Long mno=100L;
        memoRepository.deleteById(mno);
    }
}
