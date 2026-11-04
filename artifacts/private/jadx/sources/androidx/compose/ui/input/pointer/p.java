package androidx.compose.ui.input.pointer;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39104a;

    private /* synthetic */ p(int i10) {
        this.f39104a = i10;
    }

    public static final /* synthetic */ p a(int i10) {
        return new p(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof p) && i10 == ((p) obj).g();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return "PointerButtons(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f39104a, obj);
    }

    public final /* synthetic */ int g() {
        return this.f39104a;
    }

    public int hashCode() {
        return e(this.f39104a);
    }

    public String toString() {
        return f(this.f39104a);
    }
}
