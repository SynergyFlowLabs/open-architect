package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@androidx.compose.runtime.o2
public final class ed {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f27323b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f27324c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f27325d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27326a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ed.f27325d;
        }

        public final int b() {
            return ed.f27324c;
        }

        private a() {
        }
    }

    private /* synthetic */ ed(int i10) {
        this.f27326a = i10;
    }

    public static final /* synthetic */ ed c(int i10) {
        return new ed(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof ed) && i10 == ((ed) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f27324c)) {
            return "Picker";
        }
        return f(i10, f27325d) ? "Input" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f27326a, obj);
    }

    public int hashCode() {
        return g(this.f27326a);
    }

    public final /* synthetic */ int i() {
        return this.f27326a;
    }

    @NotNull
    public String toString() {
        return h(this.f27326a);
    }
}
