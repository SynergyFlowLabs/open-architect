package androidx.compose.ui.node;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class m1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39911a;

    private /* synthetic */ m1(int i10) {
        this.f39911a = i10;
    }

    public static final /* synthetic */ m1 a(int i10) {
        return new m1(i10);
    }

    public static <T> int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        if ((obj instanceof m1) && i10 == ((m1) obj).j()) {
            return true;
        }
        return false;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static final int g(int i10, int i11) {
        return i10 | i11;
    }

    public static final int h(int i10, int i11) {
        return i10 | i11;
    }

    public static String i(int i10) {
        return "NodeKind(mask=" + i10 + ')';
    }

    public final int e() {
        return this.f39911a;
    }

    public boolean equals(Object obj) {
        return c(this.f39911a, obj);
    }

    public int hashCode() {
        return f(this.f39911a);
    }

    public final /* synthetic */ int j() {
        return this.f39911a;
    }

    public String toString() {
        return i(this.f39911a);
    }
}
