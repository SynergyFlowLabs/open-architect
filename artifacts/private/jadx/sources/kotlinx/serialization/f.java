package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Target({})
@jj.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
@jj.f(allowedTargets = {jj.b.PROPERTY})
@g
public @interface f {

    @g
    public enum a {
        ALWAYS,
        NEVER;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f315876d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f315876d;
        }
    }

    a mode() default a.ALWAYS;
}
