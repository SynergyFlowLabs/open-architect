package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f64954h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f64955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.datasource.x f64956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f64957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f64958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f64959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f64960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f64961g;

    public d0(long j10, androidx.media3.datasource.x xVar, long j11) {
        this(j10, xVar, xVar.f62594a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f64954h.getAndIncrement();
    }

    public d0(long j10, androidx.media3.datasource.x xVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f64955a = j10;
        this.f64956b = xVar;
        this.f64957c = uri;
        this.f64958d = map;
        this.f64959e = j11;
        this.f64960f = j12;
        this.f64961g = j13;
    }
}
