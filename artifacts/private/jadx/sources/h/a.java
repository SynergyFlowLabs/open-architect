package h;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jj.e;
import jj.f;
import kotlin.b1;
import kotlin.l;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@l(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @b1(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@Retention(RetentionPolicy.CLASS)
@f(allowedTargets = {jj.b.ANNOTATION_CLASS})
@e(jj.a.BINARY)
public @interface a {

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    public enum EnumC1911a {
        WARNING,
        ERROR
    }

    EnumC1911a level() default EnumC1911a.ERROR;
}
