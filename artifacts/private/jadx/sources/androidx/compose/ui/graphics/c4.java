package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37561b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37562c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37563d = e(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37564e = e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37565a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return c4.f37564e;
        }

        public final int b() {
            return c4.f37563d;
        }

        public final int c() {
            return c4.f37562c;
        }

        private a() {
        }
    }

    private /* synthetic */ c4(int i10) {
        this.f37565a = i10;
    }

    public static final /* synthetic */ c4 d(int i10) {
        return new c4(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof c4) && i10 == ((c4) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String i(int i10) {
        if (g(i10, f37562c)) {
            return "Triangles";
        }
        if (g(i10, f37563d)) {
            return "TriangleStrip";
        }
        return g(i10, f37564e) ? "TriangleFan" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return f(this.f37565a, obj);
    }

    public int hashCode() {
        return h(this.f37565a);
    }

    public final /* synthetic */ int j() {
        return this.f37565a;
    }

    @NotNull
    public String toString() {
        return i(this.f37565a);
    }
}
