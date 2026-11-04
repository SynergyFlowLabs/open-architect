package s8;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import r8.c;

/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@c
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface b {
    String value();
}
