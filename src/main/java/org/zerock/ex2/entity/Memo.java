package org.zerock.ex2.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity //엔티티=테이블
@Table(name = "tbl_memo")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    @Id//PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)//시퀀스
    private Long mno;
    @Column(length = 200, nullable = false)
    private String memoText;
}
