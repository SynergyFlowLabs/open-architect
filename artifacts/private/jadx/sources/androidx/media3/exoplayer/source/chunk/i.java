package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface i {
    void a() throws IOException;

    int b(long j10, List<? extends m> list);

    boolean c(e eVar, boolean z10, androidx.media3.exoplayer.upstream.m.d dVar, androidx.media3.exoplayer.upstream.m mVar);

    void d(e eVar);

    void e(t3 t3Var, long j10, List<? extends m> list, g gVar);

    boolean f(long j10, e eVar, List<? extends m> list);

    long g(long j10, f5 f5Var);

    void release();
}
