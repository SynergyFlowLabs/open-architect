package androidx.media2.exoplayer.external.decoder;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.Exception;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface c<I, O, E extends Exception> {
    @p0
    O a() throws Exception;

    void b(I inputBuffer) throws Exception;

    @p0
    I c() throws Exception;

    void flush();

    String getName();

    void release();
}
