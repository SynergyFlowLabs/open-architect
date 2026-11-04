package androidx.media2.exoplayer.external.analytics;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.z0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface f {

    public interface a {
        void E(c.a eventTime, String contentSessionId, String adSessionId);

        void a(c.a eventTime, String sessionId, boolean automaticTransitionToNextPlayback);

        void c(c.a eventTime, String sessionId);

        void j(c.a eventTime, String sessionId);
    }

    void a(c.a eventTime);

    String b(z0 timeline, z.a mediaPeriodId);

    void c(c.a eventTime);

    boolean d(c.a eventTime, String sessionId);

    void e(a listener);

    void f(c.a eventTime, int reason);
}
