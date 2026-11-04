package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38249b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38250c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38251d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38252e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38253f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f38254g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38255a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u1.f38251d;
        }

        public final int b() {
            return u1.f38250c;
        }

        public final int c() {
            return u1.f38253f;
        }

        public final int d() {
            return u1.f38254g;
        }

        public final int e() {
            return u1.f38252e;
        }

        private a() {
        }
    }

    private /* synthetic */ u1(int i10) {
        this.f38255a = i10;
    }

    public static final /* synthetic */ u1 f(int i10) {
        return new u1(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof u1) && i10 == ((u1) obj).m();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String l(int i10) {
        if (i(i10, f38250c)) {
            return "Argb8888";
        }
        if (i(i10, f38251d)) {
            return "Alpha8";
        }
        if (i(i10, f38252e)) {
            return "Rgb565";
        }
        if (i(i10, f38253f)) {
            return "F16";
        }
        return i(i10, f38254g) ? "Gpu" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return h(this.f38255a, obj);
    }

    public int hashCode() {
        return k(this.f38255a);
    }

    public final int j() {
        return this.f38255a;
    }

    public final /* synthetic */ int m() {
        return this.f38255a;
    }

    @NotNull
    public String toString() {
        return l(this.f38255a);
    }
}
