package group.yuyue.Utils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Create by lp on 2020/6/6
 * 用来记录日志的公共类
 */
@Component
@Aspect
public class Log {
    @Pointcut("execution(* group.yuyue.Repository.ImpUserDAO_4.*(..))")
    public void pt() {
    }

    //@Before("pt()")
    public void beforePrintLog(JoinPoint joinPoint) {
        /*前置通知记录日志文件*/
        String fileName = joinPoint.getSignature().getName();
        System.out.println(String.format("前置通知开始记录方法：%s的日志", fileName));
    }

    //@AfterReturning("pt()")
    public void afterPrintLog(JoinPoint joinPoint) {
        /*后置通知记录日志文件*/
        String fileName = joinPoint.getSignature().getName();
        System.out.println(String.format("后置通知开始记录方法：%s的日志", fileName));
    }

    //@AfterThrowing("pt()")
    public void exceptionPrintLog(JoinPoint joinPoint) {
        /*异常通知记录日志文件*/
        String fileName = joinPoint.getSignature().getName();
        System.out.println(String.format("异常通知开始记录方法：%s的日志", fileName));
    }

    //@After("pt()")
    public void finalPrintLog(JoinPoint joinPoint) {
        /*最终通知记录日志文件*/
        String fileName = joinPoint.getSignature().getName();
        System.out.println(String.format("最终通知开始记录方法：%s的日志", fileName));
    }

    @Around("pt()")
    public Object aroundPrintLog(ProceedingJoinPoint proceedingJoinPoint) {
        /*环绕通知记录日志文件*/
        Object[] args = proceedingJoinPoint.getArgs();
        Object rtvule = null;
        try {
            System.out.println("执行环绕通知的前置通知");
            rtvule = proceedingJoinPoint.proceed(args);
            System.out.println("执行环绕通知的后置通知");
        } catch (Throwable t) {
            System.out.println("执行环绕通知的异常通知");
            throw new RuntimeException(t);
        } finally {
            System.out.println("执行环绕通知的最终通知");
            return rtvule;

        }

    }
}
