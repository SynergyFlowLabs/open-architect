package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.CLASS, jj.b.ANNOTATION_CLASS, jj.b.TYPE_PARAMETER, jj.b.PROPERTY, jj.b.FIELD, jj.b.LOCAL_VARIABLE, jj.b.VALUE_PARAMETER, jj.b.CONSTRUCTOR, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.TYPE, jj.b.EXPRESSION, jj.b.FILE, jj.b.TYPEALIAS})
@jj.e(jj.a.SOURCE)
public @interface j1 {
    String[] names();
}
