package androidx.media2.exoplayer.external.upstream;

import android.os.Handler;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface d {

    public interface a {
        void l(int elapsedMs, long bytesTransferred, long bitrateEstimate);
    }

    long b();

    @androidx.annotation.p0
    q0 e();

    void f(a eventListener);

    void g(Handler eventHandler, a eventListener);
}
