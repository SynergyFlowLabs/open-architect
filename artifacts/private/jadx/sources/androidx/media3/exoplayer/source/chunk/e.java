package androidx.media3.exoplayer.source.chunk;

import android.net.Uri;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.datasource.p1;
import androidx.media3.datasource.x;
import androidx.media3.exoplayer.source.d0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class e implements androidx.media3.exoplayer.upstream.o.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f64880a = d0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f64881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f64883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final Object f64885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f64886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f64887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final p1 f64888i;

    public e(androidx.media3.datasource.p pVar, x xVar, int i10, w wVar, int i11, @p0 Object obj, long j10, long j11) {
        this.f64888i = new p1(pVar);
        this.f64881b = (x) androidx.media3.common.util.a.g(xVar);
        this.f64882c = i10;
        this.f64883d = wVar;
        this.f64884e = i11;
        this.f64885f = obj;
        this.f64886g = j10;
        this.f64887h = j11;
    }

    public final long c() {
        return this.f64888i.u();
    }

    public final long d() {
        return this.f64887h - this.f64886g;
    }

    public final Map<String, List<String>> e() {
        return this.f64888i.w();
    }

    public final Uri f() {
        return this.f64888i.v();
    }
}
