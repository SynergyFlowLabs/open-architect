package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class v3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38275b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38276c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38277d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f38278e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38279a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return v3.f38278e;
        }

        public final int b() {
            return v3.f38276c;
        }

        public final int c() {
            return v3.f38277d;
        }

        private a() {
        }
    }

    private /* synthetic */ v3(int i10) {
        this.f38279a = i10;
    }

    public static final /* synthetic */ v3 d(int i10) {
        return new v3(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof v3) && i10 == ((v3) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f38276c)) {
            return "Miter";
        }
        if (g(i10, f38277d)) {
            return "Round";
        }
        return g(i10, f38278e) ? "Bevel" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return f(this.f38279a, obj);
    }

    public int hashCode() {
        return h(this.f38279a);
    }

    public final /* synthetic */ int j() {
        return this.f38279a;
    }

    @NotNull
    public String toString() {
        return i(this.f38279a);
    }
}
