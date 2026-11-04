package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.ANNOTATION_TYPE})
@e1(version = "1.3")
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS})
@jj.e(jj.a.BINARY)
public @interface c1 {

    public enum a {
        WARNING,
        ERROR;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f312405d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f312405d;
        }
    }

    a level() default a.ERROR;

    String message() default "";
}
