package fj;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@hj.c(applicableTo = CharSequence.class)
public @interface o {
    String value();

    hj.g when() default hj.g.ALWAYS;
}
