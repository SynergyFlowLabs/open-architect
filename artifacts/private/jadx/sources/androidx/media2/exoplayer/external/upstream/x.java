package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class x implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57492b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57493c = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f57494d = 60000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f57495e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57496a;

    public x() {
        this(-1);
    }

    @Override // androidx.media2.exoplayer.external.upstream.f0
    public int a(int dataType) {
        int i10 = this.f57496a;
        if (i10 == -1) {
            return dataType == 7 ? 6 : 3;
        }
        return i10;
    }

    @Override // androidx.media2.exoplayer.external.upstream.f0
    public long b(int dataType, long loadDurationMs, IOException exception, int errorCount) {
        if (!(exception instanceof e0.e)) {
            return -9223372036854775807L;
        }
        int i10 = ((e0.e) exception).f57280f;
        return (i10 == 404 || i10 == 410) ? 60000L : -9223372036854775807L;
    }

    @Override // androidx.media2.exoplayer.external.upstream.f0
    public long c(int dataType, long loadDurationMs, IOException exception, int errorCount) {
        if ((exception instanceof androidx.media2.exoplayer.external.k0) || (exception instanceof FileNotFoundException) || (exception instanceof g0.i)) {
            return -9223372036854775807L;
        }
        return Math.min((errorCount - 1) * 1000, 5000);
    }

    public x(int minimumLoadableRetryCount) {
        this.f57496a = minimumLoadableRetryCount;
    }
}
