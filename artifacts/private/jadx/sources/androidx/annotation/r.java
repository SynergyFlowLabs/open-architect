package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@jj.c
@Documented
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.FUNCTION, jj.b.PROPERTY_GETTER, jj.b.PROPERTY_SETTER, jj.b.VALUE_PARAMETER, jj.b.FIELD, jj.b.LOCAL_VARIABLE, jj.b.ANNOTATION_CLASS})
@jj.e(jj.a.BINARY)
public @interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f10093a = a.f10097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10094b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10095c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10096d = 2;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f10097a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f10098b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10099c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10100d = 2;

        private a() {
        }
    }

    int unit() default 1;
}
