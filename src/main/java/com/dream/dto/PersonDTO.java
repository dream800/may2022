package com.dream.dto;

import com.dream.dto.validators.PasswordEqual;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
//@PasswordEqual
public class PersonDTO {


    @NotNull
    private String name;

//    @Pattern(regexp = "[01]", message = "只能传入0或者1")
//    @Digits(integer = 10, fraction = 0)
    @NotNull(message = "不能没有age吧")
//    @Range(min = 0, max = 1, message = "参数不符合要求")
    @PositiveOrZero
    private Integer  age;



    private String password1;

    private String password2;


//    public boolean isValidAge()
//    {
//
//    }

}
