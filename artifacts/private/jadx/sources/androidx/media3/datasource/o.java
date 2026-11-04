package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface o {

    public interface a {
        o a();
    }

    void c(x xVar) throws IOException;

    void close() throws IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
