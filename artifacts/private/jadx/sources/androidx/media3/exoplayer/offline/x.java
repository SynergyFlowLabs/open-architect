package androidx.media3.exoplayer.offline;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface x {

    public interface a {
        void a(long j10, long j11, float f10);
    }

    void a(@p0 a aVar) throws InterruptedException, IOException;

    void cancel();

    void remove();
}
