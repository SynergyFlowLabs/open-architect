package androidx.media2.exoplayer.external.extractor.ogg;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.q;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
interface g {
    q a();

    long b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException;

    void c(long targetGranule);
}
