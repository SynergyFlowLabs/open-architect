package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@androidx.compose.runtime.o2
@af
public final class f80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f27609b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f27610c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f27611d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27612a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return f80.f27610c;
        }

        public final int b() {
            return f80.f27611d;
        }

        private a() {
        }
    }

    private /* synthetic */ f80(int i10) {
        this.f27612a = i10;
    }

    public static final /* synthetic */ f80 c(int i10) {
        return new f80(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        if ((obj instanceof f80) && i10 == ((f80) obj).i()) {
            return true;
        }
        return false;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f27610c)) {
            return "Horizontal";
        }
        return f(i10, f27611d) ? "Vertical" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f27612a, obj);
    }

    public int hashCode() {
        return g(this.f27612a);
    }

    public final /* synthetic */ int i() {
        return this.f27612a;
    }

    @NotNull
    public String toString() {
        return h(this.f27612a);
    }
}
