package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface p extends androidx.media3.common.l {

    public interface a {
        @androidx.media3.common.util.b1
        p a();
    }

    @androidx.media3.common.util.b1
    default Map<String, List<String>> a() {
        return Collections.EMPTY_MAP;
    }

    @androidx.media3.common.util.b1
    long c(x xVar) throws IOException;

    @androidx.media3.common.util.b1
    void close() throws IOException;

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    Uri getUri();

    @androidx.media3.common.util.b1
    void s(r1 r1Var);
}
