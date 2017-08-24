package AOP;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by traitorwtf on 24.08.2017.
 */
@Component(value = "logger")
@Aspect
public class Logger {

    @Pointcut("execution(public * fight(..)) && within(Fighters.*)")
    private void logAll(){

    }
    @Before("logAll()")
    public void logMethod(){
        System.out.println("=================");
        System.out.println("Method was logged");
        System.out.println("=================");
    }
}
