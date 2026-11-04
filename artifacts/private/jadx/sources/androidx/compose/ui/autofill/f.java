package androidx.compose.ui.autofill;

/* JADX INFO: loaded from: classes.dex */
@oj.g
final class f implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36976b;

    private /* synthetic */ f(int i10) {
        this.f36976b = i10;
    }

    public static final /* synthetic */ f a(int i10) {
        return new f(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof f) && i10 == ((f) obj).h();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return "AndroidContentDataType(androidAutofillType=" + i10 + ')';
    }

    public final int e() {
        return this.f36976b;
    }

    public boolean equals(Object obj) {
        return c(this.f36976b, obj);
    }

    public final /* synthetic */ int h() {
        return this.f36976b;
    }

    public int hashCode() {
        return f(this.f36976b);
    }

    public String toString() {
        return g(this.f36976b);
    }
}
