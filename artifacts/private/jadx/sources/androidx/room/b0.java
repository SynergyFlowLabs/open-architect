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
public @interface b0 {
    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
