package androidx.compose.ui.input.pointer;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38977a;

    private /* synthetic */ b0(long j10) {
        this.f38977a = j10;
    }

    public static final /* synthetic */ b0 a(long j10) {
        return new b0(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof b0) && j10 == ((b0) obj).h();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final long e() {
        return this.f38977a;
    }

    public boolean equals(Object obj) {
        return c(this.f38977a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f38977a;
    }

    public int hashCode() {
        return f(this.f38977a);
    }

    public String toString() {
        return g(this.f38977a);
    }
}
