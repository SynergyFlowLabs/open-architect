package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@androidx.compose.runtime.o2
public final class e60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f27282b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f27283c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f27284d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27285a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e60.f27284d;
        }

        public final int b() {
            return e60.f27283c;
        }

        private a() {
        }
    }

    private /* synthetic */ e60(int i10) {
        this.f27285a = i10;
    }

    public static final /* synthetic */ e60 c(int i10) {
        return new e60(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof e60) && i10 == ((e60) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f27283c)) {
            return "Picker";
        }
        return f(i10, f27284d) ? "Input" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f27285a, obj);
    }

    public int hashCode() {
        return g(this.f27285a);
    }

    public final /* synthetic */ int i() {
        return this.f27285a;
    }

    @NotNull
    public String toString() {
        return h(this.f27285a);
    }
}
