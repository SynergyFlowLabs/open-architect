package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f315673b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f315674c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f315675d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f315676e = 1000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f315677f = 9223372036854L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f315678g = 4611686018427387903L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.internal.z0 f315672a = new kotlinx.coroutines.internal.z0("REMOVED_TASK");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.internal.z0 f315679h = new kotlinx.coroutines.internal.z0("CLOSED_EMPTY");

    public static final long c(long j10) {
        return j10 / 1000000;
    }

    public static final long d(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= f315677f) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
