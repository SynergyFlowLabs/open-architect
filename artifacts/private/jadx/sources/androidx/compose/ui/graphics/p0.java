package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f38096b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38097c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f38098d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38099a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return p0.f38097c;
        }

        public final int b() {
            return p0.f38098d;
        }

        private a() {
        }
    }

    private /* synthetic */ p0(int i10) {
        this.f38099a = i10;
    }

    public static final /* synthetic */ p0 c(int i10) {
        return new p0(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof p0) && i10 == ((p0) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String h(int i10) {
        if (f(i10, f38097c)) {
            return "Difference";
        }
        return f(i10, f38098d) ? "Intersect" : com.facebook.internal.a.f99697t;
    }

    public boolean equals(Object obj) {
        return e(this.f38099a, obj);
    }

    public int hashCode() {
        return g(this.f38099a);
    }

    public final /* synthetic */ int i() {
        return this.f38099a;
    }

    @NotNull
    public String toString() {
        return h(this.f38099a);
    }
}
