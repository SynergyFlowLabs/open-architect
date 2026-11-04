package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37801b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37802c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37803d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37804a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j2.f37802c;
        }

        public final int b() {
            return j2.f37803d;
        }

        private a() {
        }
    }

    private /* synthetic */ j2(int i10) {
        this.f37804a = i10;
    }

    public static final /* synthetic */ j2 c(int i10) {
        return new j2(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof j2) && i10 == ((j2) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f37802c)) {
            return "Fill";
        }
        return f(i10, f37803d) ? "Stroke" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f37804a, obj);
    }

    public int hashCode() {
        return g(this.f37804a);
    }

    public final /* synthetic */ int i() {
        return this.f37804a;
    }

    @NotNull
    public String toString() {
        return h(this.f37804a);
    }
}
