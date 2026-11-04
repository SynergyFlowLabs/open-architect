package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@jj.c
@Documented
@Retention(RetentionPolicy.CLASS)
@jj.e(jj.a.BINARY)
public @interface l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f10083e = a.f10088a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10084f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10085g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10086h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10087i = 5;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f10088a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f10089b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f10090c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f10091d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f10092e = 5;

        private a() {
        }
    }

    int otherwise() default 2;
}
