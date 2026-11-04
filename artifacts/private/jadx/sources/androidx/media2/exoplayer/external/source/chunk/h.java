package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.x0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface h {
    void a() throws IOException;

    int b(long playbackPositionUs, List<? extends l> queue);

    void c(long playbackPositionUs, long loadPositionUs, List<? extends l> queue, f out);

    boolean d(d chunk, boolean cancelable, Exception e10, long blacklistDurationMs);

    void e(d chunk);

    long n(long positionUs, x0 seekParameters);
}
