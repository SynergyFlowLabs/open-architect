package androidx.media2.exoplayer.external.trackselection;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.u0;
import androidx.media2.exoplayer.external.z0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private a f57227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private androidx.media2.exoplayer.external.upstream.d f57228b;

    public interface a {
        void b();
    }

    protected final androidx.media2.exoplayer.external.upstream.d a() {
        return (androidx.media2.exoplayer.external.upstream.d) androidx.media2.exoplayer.external.util.a.g(this.f57228b);
    }

    public final void b(a listener, androidx.media2.exoplayer.external.upstream.d bandwidthMeter) {
        this.f57227a = listener;
        this.f57228b = bandwidthMeter;
    }

    protected final void c() {
        a aVar = this.f57227a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public abstract void d(Object info);

    public abstract s e(u0[] rendererCapabilities, TrackGroupArray trackGroups, z.a periodId, z0 timeline) throws androidx.media2.exoplayer.external.i;
}
