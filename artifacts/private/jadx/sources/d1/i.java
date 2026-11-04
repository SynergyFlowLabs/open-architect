package d1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@c.a({@c(device = b.R, name = "Phone", showSystemUi = true), @c(device = "spec:width=411dp,height=891dp,orientation=landscape,dpi=420", name = "Phone - Landscape", showSystemUi = true), @c(device = b.S, name = "Unfolded Foldable", showSystemUi = true), @c(device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait", name = "Tablet", showSystemUi = true), @c(device = b.T, name = "Tablet - Landscape", showSystemUi = true), @c(device = b.U, name = "Desktop", showSystemUi = true)})
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.FUNCTION})
@jj.e(jj.a.BINARY)
public @interface i {
}
