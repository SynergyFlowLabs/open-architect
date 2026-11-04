package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@jj.f(allowedTargets = {jj.b.FIELD, jj.b.FUNCTION})
@jj.e(jj.a.BINARY)
public @interface i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final b f74852j = b.f74866a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f74853k = "[field-name]";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f74854l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f74855m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f74856n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f74857o = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f74858p = 5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f74859q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f74860r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f74861s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f74862t = 4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.w0(21)
    public static final int f74863u = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.w0(21)
    public static final int f74864v = 6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f74865w = "[value-unspecified]";

    @androidx.annotation.w0(21)
    @Retention(RetentionPolicy.CLASS)
    @jj.e(jj.a.BINARY)
    public @interface a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f74866a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f74867b = "[field-name]";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f74868c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f74869d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f74870e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f74871f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f74872g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f74873h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f74874i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f74875j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f74876k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.w0(21)
        public static final int f74877l = 5;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.w0(21)
        public static final int f74878m = 6;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final String f74879n = "[value-unspecified]";

        private b() {
        }
    }

    @Retention(RetentionPolicy.CLASS)
    @jj.e(jj.a.BINARY)
    public @interface c {
    }

    @a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @c
    int typeAffinity() default 1;
}
