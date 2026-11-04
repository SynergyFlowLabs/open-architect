package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38235b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38236c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38237d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38238e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f38239f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f38240g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38241a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return t2.f38236c;
        }

        public final int b() {
            return t2.f38237d;
        }

        public final int c() {
            return t2.f38240g;
        }

        public final int d() {
            return t2.f38238e;
        }

        public final int e() {
            return t2.f38239f;
        }

        private a() {
        }
    }

    private /* synthetic */ t2(int i10) {
        this.f38241a = i10;
    }

    public static final /* synthetic */ t2 f(int i10) {
        return new t2(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof t2) && i10 == ((t2) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String k(int i10) {
        if (i(i10, f38236c)) {
            return "Difference";
        }
        if (i(i10, f38237d)) {
            return "Intersect";
        }
        if (i(i10, f38238e)) {
            return "Union";
        }
        if (i(i10, f38239f)) {
            return "Xor";
        }
        return i(i10, f38240g) ? "ReverseDifference" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return h(this.f38241a, obj);
    }

    public int hashCode() {
        return j(this.f38241a);
    }

    public final /* synthetic */ int l() {
        return this.f38241a;
    }

    @NotNull
    public String toString() {
        return k(this.f38241a);
    }
}
