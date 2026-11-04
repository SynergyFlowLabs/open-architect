package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final long a(@NotNull q0.a aVar, long j10) {
        long j11 = 63 & j10;
        if (j11 >= 16) {
            j10 = (j10 & (-64)) | (j11 + 1);
        }
        return q0.t(kotlin.y1.n(j10));
    }

    public static final long b(long j10) {
        long j11 = 63 & j10;
        return Long.compareUnsigned(kotlin.y1.n(j11), 16L) < 0 ? j10 : kotlin.y1.n(kotlin.y1.n(j10 & kotlin.y1.n(-64L)) | kotlin.y1.n(kotlin.y1.n(j11) - 1));
    }
}
