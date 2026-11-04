package androidx.media2.exoplayer.external.upstream;

import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface l {

    public interface a {
        l a();
    }

    Map<String, List<String>> a();

    long b(o dataSpec) throws IOException;

    void c(q0 transferListener);

    void close() throws IOException;

    @androidx.annotation.p0
    Uri getUri();

    int read(byte[] buffer, int offset, int readLength) throws IOException;
}
