package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@androidx.annotation.w0(16)
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.CLASS})
@jj.e(jj.a.BINARY)
public @interface c0 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    d0.a matchInfo() default d0.a.FTS4;

    String[] notIndexed() default {};

    d0.b order() default d0.b.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
