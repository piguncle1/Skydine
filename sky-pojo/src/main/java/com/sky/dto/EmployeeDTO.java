package com.sky.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {


        private Long id;

        @NotBlank(message = "账号名不能为空")
        @Size(min = 3,message = "长度不得小于三位")
        private String name;

        @NotBlank(message = "username不能为空")
        private String username;

        @NotBlank(message = "手机号不能为空")
        @Pattern(regexp = "^1[3-9]\\d{9}$",message = "手机号格式错误")
        private String phone;

        private String sex;

        @NotBlank(message = "身份证号不能为空")
        @Pattern(regexp = "^\\d{17}[\\dXx]$",message = "身份证号格式错误")
        private String idNumber;
}
