package t5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jj.f;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
@f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.CLASS})
public @interface b {
    a[] value();
}
