package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@kotlin.l(message = "Replaced by the androidx.resourceinpsection package.")
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER})
@jj.e(jj.a.SOURCE)
public @interface e0 {

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.CLASS})
    @jj.e(jj.a.SOURCE)
    public @interface a {
        String name();

        int value();
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.CLASS})
    @jj.e(jj.a.SOURCE)
    public @interface b {
        int mask() default 0;

        String name();

        int target();
    }

    public enum c {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID;


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f10082i = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f10082i;
        }
    }

    int attributeId() default 0;

    a[] enumMapping() default {};

    b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    c valueType() default c.INFERRED;
}
