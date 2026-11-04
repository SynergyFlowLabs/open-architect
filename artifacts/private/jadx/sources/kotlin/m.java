package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@e1(version = "1.4")
@jj.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.FUNCTION, jj.b.PROPERTY, jj.b.ANNOTATION_CLASS, jj.b.CONSTRUCTOR, jj.b.PROPERTY_SETTER, jj.b.PROPERTY_GETTER, jj.b.TYPEALIAS})
public @interface m {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
