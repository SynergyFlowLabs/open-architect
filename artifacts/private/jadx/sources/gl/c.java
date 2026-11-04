package gl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.f0;
import yl.g0;
import yl.i0;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.TYPE_USE})
@f0({f.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@g0({i0.RECEIVER, i0.PARAMETER, i0.RETURN})
public @interface c {
    int value() default -1;
}
