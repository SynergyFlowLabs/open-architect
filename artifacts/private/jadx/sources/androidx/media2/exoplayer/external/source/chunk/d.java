package androidx.media2.exoplayer.external.source.chunk;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.upstream.g0;
import androidx.media2.exoplayer.external.upstream.o0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class d implements g0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media2.exoplayer.external.upstream.o f55774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Format f55776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Object f55778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f55779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f55780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final o0 f55781h;

    public d(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, int type, Format trackFormat, int trackSelectionReason, @p0 Object trackSelectionData, long startTimeUs, long endTimeUs) {
        this.f55781h = new o0(dataSource);
        this.f55774a = (androidx.media2.exoplayer.external.upstream.o) androidx.media2.exoplayer.external.util.a.g(dataSpec);
        this.f55775b = type;
        this.f55776c = trackFormat;
        this.f55777d = trackSelectionReason;
        this.f55778e = trackSelectionData;
        this.f55779f = startTimeUs;
        this.f55780g = endTimeUs;
    }

    public final long c() {
        return this.f55781h.d();
    }

    public final long d() {
        return this.f55780g - this.f55779f;
    }

    public final Map<String, List<String>> e() {
        return this.f55781h.g();
    }

    public final Uri f() {
        return this.f55781h.e();
    }
}
