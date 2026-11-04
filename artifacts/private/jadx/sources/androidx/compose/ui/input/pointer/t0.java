package androidx.compose.ui.input.pointer;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39126a;

    private /* synthetic */ t0(int i10) {
        this.f39126a = i10;
    }

    public static final /* synthetic */ t0 a(int i10) {
        return new t0(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof t0) && i10 == ((t0) obj).k();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean e(int i10) {
        return (i10 & 4) != 0;
    }

    public static final boolean f(int i10) {
        return (i10 & 2) != 0;
    }

    public static final boolean g(int i10) {
        return (i10 & 1) != 0;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static String j(int i10) {
        return "ProcessResult(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f39126a, obj);
    }

    public final int h() {
        return this.f39126a;
    }

    public int hashCode() {
        return i(this.f39126a);
    }

    public final /* synthetic */ int k() {
        return this.f39126a;
    }

    public String toString() {
        return j(this.f39126a);
    }
}
