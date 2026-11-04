package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class u3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38256b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38257c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38258d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38259e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38260a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u3.f38257c;
        }

        public final int b() {
            return u3.f38258d;
        }

        public final int c() {
            return u3.f38259e;
        }

        private a() {
        }
    }

    static {
        int i10 = 7 & 1;
    }

    private /* synthetic */ u3(int i10) {
        this.f38260a = i10;
    }

    public static final /* synthetic */ u3 d(int i10) {
        return new u3(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        if ((obj instanceof u3) && i10 == ((u3) obj).j()) {
            return true;
        }
        return false;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f38257c)) {
            return "Butt";
        }
        if (g(i10, f38258d)) {
            return "Round";
        }
        return g(i10, f38259e) ? "Square" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return f(this.f38260a, obj);
    }

    public int hashCode() {
        return h(this.f38260a);
    }

    public final /* synthetic */ int j() {
        return this.f38260a;
    }

    @NotNull
    public String toString() {
        return i(this.f38260a);
    }
}
