package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38048b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38049c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38050d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38051a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return m2.f38050d;
        }

        public final int b() {
            return m2.f38049c;
        }

        private a() {
        }
    }

    private /* synthetic */ m2(int i10) {
        this.f38051a = i10;
    }

    public static final /* synthetic */ m2 c(int i10) {
        return new m2(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof m2) && i10 == ((m2) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f38049c)) {
            return "NonZero";
        }
        return f(i10, f38050d) ? "EvenOdd" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f38051a, obj);
    }

    public int hashCode() {
        return g(this.f38051a);
    }

    public final /* synthetic */ int i() {
        return this.f38051a;
    }

    @NotNull
    public String toString() {
        return h(this.f38051a);
    }
}
