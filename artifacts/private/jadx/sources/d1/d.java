package d1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@c.a({@c(name = "Red", wallpaper = 0), @c(name = "Blue", wallpaper = 2), @c(name = "Green", wallpaper = 1), @c(name = "Yellow", wallpaper = 3)})
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.FUNCTION})
@jj.e(jj.a.BINARY)
public @interface d {
}
