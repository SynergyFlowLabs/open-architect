package el;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import yl.f0;
import yl.i0;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@yl.e({i0.LOCAL_VARIABLE, i0.RESOURCE_VARIABLE})
@f0({})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface e {
    Class<?> value() default Object.class;
}
