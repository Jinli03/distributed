package game;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAspect {
    @Before("execution(* game.Battle.start(Player, Monster))")
    public void logBefore() {
        System.out.println("你进入了一个神秘世界。。。");
    }

    @AfterReturning("execution(* game.Battle.start(Player, Monster))")
    public void logAfter() {
        System.out.println("勇士从不言败。。。");
    }
}
