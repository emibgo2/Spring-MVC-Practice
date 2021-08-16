package hello.servlet.domain.member;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Member {
    private Long id;
    private String username;
    private int age;

    public Member() {

    }
    public Member( String username,int  age) {
        this.age = age;
        this.username = username;
    }
}
