package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.exoplayer.analytics.j4;
import androidx.media3.extractor.u0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface f {

    public interface a {
        @z7.a
        default a a(androidx.media3.extractor.text.r.a aVar) {
            return this;
        }

        @z7.a
        default a b(int i10) {
            return this;
        }

        @p0
        f c(int i10, w wVar, boolean z10, List<w> list, @p0 u0 u0Var, j4 j4Var);

        @z7.a
        default a d(boolean z10) {
            return this;
        }

        default w e(w wVar) {
            return wVar;
        }
    }

    public interface b {
        u0 a(int i10, int i11);
    }

    boolean b(androidx.media3.extractor.s sVar) throws IOException;

    void c(@p0 b bVar, long j10, long j11);

    @p0
    androidx.media3.extractor.g d();

    @p0
    w[] e();

    void release();
}
