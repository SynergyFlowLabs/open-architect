package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f39113b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f39114c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f39115d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f39116e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f39117f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f39118g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39119a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r0.f39118g;
        }

        public final int b() {
            return r0.f39116e;
        }

        public final int c() {
            return r0.f39117f;
        }

        public final int d() {
            return r0.f39115d;
        }

        public final int e() {
            return r0.f39114c;
        }

        private a() {
        }
    }

    static {
        int i10 = 5 >> 2;
    }

    private /* synthetic */ r0(int i10) {
        this.f39119a = i10;
    }

    public static final /* synthetic */ r0 f(int i10) {
        return new r0(i10);
    }

    private static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof r0) && i10 == ((r0) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String k(int i10) {
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            return "Mouse";
        }
        if (i10 != 3) {
            return i10 != 4 ? com.facebook.internal.a.f99697t : "Eraser";
        }
        return "Stylus";
    }

    public boolean equals(Object obj) {
        return h(this.f39119a, obj);
    }

    public int hashCode() {
        return j(this.f39119a);
    }

    public final /* synthetic */ int l() {
        return this.f39119a;
    }

    @NotNull
    public String toString() {
        return k(this.f39119a);
    }
}
