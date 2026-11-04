package androidx.media3.common;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class k4 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f60965a;

    public k4(String str) {
        this(str, -9223372036854775807L);
    }

    public static k4 a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static k4 b(Exception exc, long j10) {
        return exc instanceof k4 ? (k4) exc : new k4(exc, j10);
    }

    public k4(String str, long j10) {
        super(str);
        this.f60965a = j10;
    }

    public k4(String str, Throwable th2) {
        this(str, th2, -9223372036854775807L);
    }

    public k4(String str, Throwable th2, long j10) {
        super(str, th2);
        this.f60965a = j10;
    }

    public k4(Throwable th2) {
        this(th2, -9223372036854775807L);
    }

    public k4(Throwable th2, long j10) {
        super(th2);
        this.f60965a = j10;
    }
}
