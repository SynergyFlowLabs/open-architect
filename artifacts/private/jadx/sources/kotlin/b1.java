package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({})
@jj.c
@Documented
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {})
@jj.e(jj.a.BINARY)
public @interface b1 {
    String expression();

    String[] imports();
}
