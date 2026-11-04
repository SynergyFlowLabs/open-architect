package androidx.media3.decoder;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.decoder.f;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface e<I, O, E extends f> {
    @p0
    O a() throws f;

    void b(I i10) throws f;

    @p0
    I c() throws f;

    void e(long j10);

    void flush();

    String getName();

    void release();
}
