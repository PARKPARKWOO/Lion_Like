package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자 ID는 필수 입니다.")
    private String username;

    @NotEmpty(message = "비밀번호는 필수 사항입니다.")
    private String password1;

    @NotEmpty(message = "비밀번호를 확인해 주세요")
    private String password2;

    @NotEmpty(message = "이메일을 등록해주세요")
    @Email
    private String email;
}
