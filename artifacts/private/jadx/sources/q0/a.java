package q0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import oj.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@g
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2461a f350233b = new C2461a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f350234c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f350235d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f350236a;

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    public static final class C2461a {
        public /* synthetic */ C2461a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f350235d;
        }

        public final int b() {
            return a.f350234c;
        }

        private C2461a() {
        }
    }

    private /* synthetic */ a(int i10) {
        this.f350236a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof a) && i10 == ((a) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f350234c)) {
            return "Touch";
        }
        return f(i10, f350235d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f350236a, obj);
    }

    public int hashCode() {
        return g(this.f350236a);
    }

    public final /* synthetic */ int i() {
        return this.f350236a;
    }

    @NotNull
    public String toString() {
        return h(this.f350236a);
    }
}
