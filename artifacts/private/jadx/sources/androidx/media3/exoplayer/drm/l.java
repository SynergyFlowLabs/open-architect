package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.b1;
import com.google.common.collect.nb;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f63686a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private androidx.media3.common.k0.f f63687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private u f63688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.datasource.p.a f63689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private String f63690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.exoplayer.upstream.m f63691f;

    private u b(androidx.media3.common.k0.f fVar) {
        androidx.media3.datasource.p.a aVarL = this.f63689d;
        if (aVarL == null) {
            aVarL = new androidx.media3.datasource.a0.b().l(this.f63690e);
        }
        Uri uri = fVar.f60879c;
        l0 l0Var = new l0(uri == null ? null : uri.toString(), fVar.f60884h, aVarL);
        nb<Map.Entry<String, String>> it = fVar.f60881e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            l0Var.e(next.getKey(), next.getValue());
        }
        h.b bVarG = new h.b().h(fVar.f60877a, k0.f63678k).d(fVar.f60882f).e(fVar.f60883g).g(com.google.common.primitives.l.E(fVar.f60886j));
        androidx.media3.exoplayer.upstream.m mVar = this.f63691f;
        if (mVar != null) {
            bVarG.c(mVar);
        }
        h hVarA = bVarG.a(l0Var);
        hVarA.F(0, fVar.d());
        return hVarA;
    }

    @Override // androidx.media3.exoplayer.drm.w
    public u a(androidx.media3.common.k0 k0Var) {
        u uVar;
        androidx.media3.common.util.a.g(k0Var.f60822b);
        androidx.media3.common.k0.f fVar = k0Var.f60822b.f60922c;
        if (fVar == null) {
            return u.f63739a;
        }
        synchronized (this.f63686a) {
            try {
                if (!fVar.equals(this.f63687b)) {
                    this.f63687b = fVar;
                    this.f63688c = b(fVar);
                }
                uVar = (u) androidx.media3.common.util.a.g(this.f63688c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public void c(@androidx.annotation.p0 androidx.media3.datasource.p.a aVar) {
        this.f63689d = aVar;
    }

    public void d(androidx.media3.exoplayer.upstream.m mVar) {
        this.f63691f = mVar;
    }

    @Deprecated
    public void e(@androidx.annotation.p0 String str) {
        this.f63690e = str;
    }
}
