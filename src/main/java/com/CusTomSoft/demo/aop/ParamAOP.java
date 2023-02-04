package com.CusTomSoft.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ParamAOP {

    @Before("bean(memberService) && args(param, ..)")
    public void before(JoinPoint joinPoint, Object param) {
        log.info("Data = {}", param);
    }
}
