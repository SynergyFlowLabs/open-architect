package androidx.media2.exoplayer.external.source;

import androidx.media2.exoplayer.external.offline.StreamKey;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public interface x extends w0 {

    public interface a extends w0.a<x> {
        void g(x mediaPeriod);
    }

    @Override // androidx.media2.exoplayer.external.source.w0
    long b();

    @Override // androidx.media2.exoplayer.external.source.w0
    void c(long positionUs);

    @Override // androidx.media2.exoplayer.external.source.w0
    long e();

    List<StreamKey> f(List<androidx.media2.exoplayer.external.trackselection.m> trackSelections);

    long h(long positionUs);

    long i();

    @Override // androidx.media2.exoplayer.external.source.w0
    boolean k(long positionUs);

    TrackGroupArray m();

    long n(long positionUs, androidx.media2.exoplayer.external.x0 seekParameters);

    void o() throws IOException;

    void p(long positionUs, boolean toKeyframe);

    void r(a callback, long positionUs);

    long s(androidx.media2.exoplayer.external.trackselection.m[] selections, boolean[] mayRetainStreamFlags, v0[] streams, boolean[] streamResetFlags, long positionUs);
}
