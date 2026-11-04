package h;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jj.e;
import jj.f;
import kotlin.b1;
import kotlin.l;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@l(message = "This annotation has been replaced by `@OptIn`", replaceWith = @b1(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@Retention(RetentionPolicy.CLASS)
@f(allowedTargets = {jj.b.CLASS, jj.b.PROPERTY, jj.b.LOCAL_VARIABLE, jj.b.VALUE_PARAMETER, jj.b.CONSTRUCTOR, jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.FILE, jj.b.TYPEALIAS})
@e(jj.a.BINARY)
public @interface c {
    Class<? extends Annotation>[] markerClass();
}
