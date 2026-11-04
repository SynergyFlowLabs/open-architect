package hg;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@fg.f
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface a {
    Class<?> value();
}
