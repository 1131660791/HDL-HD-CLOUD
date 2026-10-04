package com.hdl.gateway.service;

import java.io.IOException;
import com.hdl.common.core.exception.CaptchaException;
import com.hdl.common.core.web.domain.AjaxResult;

/**
 * 验证码处理
 *
 * @author hdl
 */
public interface ValidateCodeService
{
    /**
     * 生成验证码
     */
    public AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}
