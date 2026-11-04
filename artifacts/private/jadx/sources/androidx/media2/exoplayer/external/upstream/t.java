package androidx.media2.exoplayer.external.upstream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class t implements l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f57446m = "DefaultDataSource";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f57447n = "asset";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f57448o = "content";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f57449p = "rtmp";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f57450q = "udp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f57451r = "rawresource";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f57452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<q0> f57453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f57454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private l f57455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private l f57456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private l f57457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private l f57458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private l f57459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private l f57460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private l f57461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private l f57462l;

    public t(Context context, String userAgent, boolean allowCrossProtocolRedirects) {
        this(context, userAgent, 8000, 8000, allowCrossProtocolRedirects);
    }

    private void d(l dataSource) {
        for (int i10 = 0; i10 < this.f57453c.size(); i10++) {
            dataSource.c(this.f57453c.get(i10));
        }
    }

    private l e() {
        if (this.f57456f == null) {
            c cVar = new c(this.f57452b);
            this.f57456f = cVar;
            d(cVar);
        }
        return this.f57456f;
    }

    private l g() {
        if (this.f57457g == null) {
            h hVar = new h(this.f57452b);
            this.f57457g = hVar;
            d(hVar);
        }
        return this.f57457g;
    }

    private l i() {
        if (this.f57460j == null) {
            i iVar = new i();
            this.f57460j = iVar;
            d(iVar);
        }
        return this.f57460j;
    }

    private l k() {
        if (this.f57455e == null) {
            a0 a0Var = new a0();
            this.f57455e = a0Var;
            d(a0Var);
        }
        return this.f57455e;
    }

    private l l() {
        if (this.f57461k == null) {
            l0 l0Var = new l0(this.f57452b);
            this.f57461k = l0Var;
            d(l0Var);
        }
        return this.f57461k;
    }

    private l m() {
        if (this.f57458h == null) {
            try {
                l lVar = (l) Class.forName("androidx.media2.exoplayer.external.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f57458h = lVar;
                d(lVar);
            } catch (ClassNotFoundException unused) {
                androidx.media2.exoplayer.external.util.p.l(f57446m, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f57458h == null) {
                this.f57458h = this.f57454d;
            }
        }
        return this.f57458h;
    }

    private l n() {
        if (this.f57459i == null) {
            r0 r0Var = new r0();
            this.f57459i = r0Var;
            d(r0Var);
        }
        return this.f57459i;
    }

    private void o(@androidx.annotation.p0 l dataSource, q0 listener) {
        if (dataSource != null) {
            dataSource.c(listener);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public Map<String, List<String>> a() {
        l lVar = this.f57462l;
        return lVar == null ? Collections.EMPTY_MAP : lVar.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public long b(o dataSpec) throws IOException {
        androidx.media2.exoplayer.external.util.a.i(this.f57462l == null);
        String scheme = dataSpec.f57370a.getScheme();
        if (androidx.media2.exoplayer.external.util.q0.q0(dataSpec.f57370a)) {
            String path = dataSpec.f57370a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f57462l = k();
            } else {
                this.f57462l = e();
            }
        } else if (f57447n.equals(scheme)) {
            this.f57462l = e();
        } else if ("content".equals(scheme)) {
            this.f57462l = g();
        } else if (f57449p.equals(scheme)) {
            this.f57462l = m();
        } else if (f57450q.equals(scheme)) {
            this.f57462l = n();
        } else if ("data".equals(scheme)) {
            this.f57462l = i();
        } else if ("rawresource".equals(scheme)) {
            this.f57462l = l();
        } else {
            this.f57462l = this.f57454d;
        }
        return this.f57462l.b(dataSpec);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void c(q0 transferListener) {
        this.f57454d.c(transferListener);
        this.f57453c.add(transferListener);
        o(this.f57455e, transferListener);
        o(this.f57456f, transferListener);
        o(this.f57457g, transferListener);
        o(this.f57458h, transferListener);
        o(this.f57459i, transferListener);
        o(this.f57460j, transferListener);
        o(this.f57461k, transferListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        l lVar = this.f57462l;
        if (lVar != null) {
            try {
                lVar.close();
                this.f57462l = null;
            } catch (Throwable th2) {
                this.f57462l = null;
                throw th2;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @androidx.annotation.p0
    public Uri getUri() {
        l lVar = this.f57462l;
        if (lVar == null) {
            return null;
        }
        return lVar.getUri();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public int read(byte[] buffer, int offset, int readLength) throws IOException {
        return ((l) androidx.media2.exoplayer.external.util.a.g(this.f57462l)).read(buffer, offset, readLength);
    }

    public t(Context context, String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
        this(context, new v(userAgent, null, connectTimeoutMillis, readTimeoutMillis, allowCrossProtocolRedirects, null));
    }

    public t(Context context, l baseDataSource) {
        this.f57452b = context.getApplicationContext();
        this.f57454d = (l) androidx.media2.exoplayer.external.util.a.g(baseDataSource);
        this.f57453c = new ArrayList();
    }
}
