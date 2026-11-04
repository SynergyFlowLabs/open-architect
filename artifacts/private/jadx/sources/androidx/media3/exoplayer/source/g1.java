package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.exoplayer.analytics.j4;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface g1 {

    public interface a {
        g1 a(j4 j4Var);
    }

    void a(long j10, long j11);

    void b(androidx.media3.common.l lVar, Uri uri, Map<String, List<String>> map, long j10, long j11, androidx.media3.extractor.t tVar) throws IOException;

    long c();

    void d();

    int e(androidx.media3.extractor.n0 n0Var) throws IOException;

    void release();
}
