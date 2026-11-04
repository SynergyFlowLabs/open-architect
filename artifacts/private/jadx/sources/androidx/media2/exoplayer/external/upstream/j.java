package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface j {

    public interface a {
        j a();
    }

    void b(o dataSpec) throws IOException;

    void close() throws IOException;

    void write(byte[] buffer, int offset, int length) throws IOException;
}
