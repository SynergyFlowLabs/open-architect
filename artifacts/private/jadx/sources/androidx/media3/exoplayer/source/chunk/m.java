package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.datasource.x;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class m extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f64932j;

    public m(androidx.media3.datasource.p pVar, x xVar, w wVar, int i10, @p0 Object obj, long j10, long j11, long j12) {
        super(pVar, xVar, 1, wVar, i10, obj, j10, j11);
        androidx.media3.common.util.a.g(wVar);
        this.f64932j = j12;
    }

    public long g() {
        long j10 = this.f64932j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}
