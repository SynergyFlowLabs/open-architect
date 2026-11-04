package androidx.media2.exoplayer.external;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.source.TrackGroupArray;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface f0 {
    void a();

    boolean b();

    void c();

    long d();

    androidx.media2.exoplayer.external.upstream.b e();

    void f();

    boolean g(long bufferedDurationUs, float playbackSpeed, boolean rebuffering);

    void h(t0[] renderers, TrackGroupArray trackGroups, androidx.media2.exoplayer.external.trackselection.p trackSelections);

    boolean i(long bufferedDurationUs, float playbackSpeed);
}
