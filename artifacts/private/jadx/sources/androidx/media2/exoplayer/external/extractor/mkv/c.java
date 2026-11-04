package androidx.media2.exoplayer.external.extractor.mkv;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.j;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
interface c {
    boolean b(j input) throws InterruptedException, IOException;

    void c(b processor);

    void reset();
}
