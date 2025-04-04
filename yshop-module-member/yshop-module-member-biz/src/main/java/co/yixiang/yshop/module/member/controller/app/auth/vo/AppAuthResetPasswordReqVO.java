package co.yixiang.yshop.module.member.controller.app.auth.vo;

import co.yixiang.yshop.framework.common.validation.Mobile;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


// TODO yshop：code review 相关逻辑
@Schema(description = "用户 APP - 重置密码 Request VO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppAuthResetPasswordReqVO {

    @Schema(description = "新密码", required = true, example = "buzhidao")
    @NotEmpty(message = "新密码不能为空")
    @Length(min = 4, max = 16, message = "密码长度为 4-16 位")
    private String password;

    @Schema(description = "手机验证码", required = true, example = "1024")
    @NotEmpty(message = "手机验证码不能为空")
    @Length(min = 4, max = 6, message = "手机验证码长度为 4-6 位")
    @Pattern(regexp = "^[0-9]+$", message = "手机验证码必须都是数字")
    private String code;

    @Schema(description = "手机号",required = true,example = "15878962356")
    @NotBlank(message = "手机号不能为空")
    @Mobile
    private String mobile;

}
