package androidx.media2.exoplayer.external.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@e.b(18)
@b1({b1.a.LIBRARY_GROUP})
public final class z implements c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f53924e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.e0.b f53925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f53927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f53928d;

    public z(String defaultLicenseUrl, androidx.media2.exoplayer.external.upstream.e0.b dataSourceFactory) {
        this(defaultLicenseUrl, false, dataSourceFactory);
    }

    private static byte[] e(androidx.media2.exoplayer.external.upstream.e0.b dataSourceFactory, String url, @p0 byte[] httpBody, @p0 Map<String, String> requestProperties) throws IOException {
        int i10;
        boolean z10;
        androidx.media2.exoplayer.external.upstream.e0 e0VarA = dataSourceFactory.a();
        if (requestProperties != null) {
            for (Map.Entry<String, String> entry : requestProperties.entrySet()) {
                e0VarA.j(entry.getKey(), entry.getValue());
            }
        }
        String str = url;
        int i11 = 0;
        while (true) {
            androidx.media2.exoplayer.external.upstream.n nVar = new androidx.media2.exoplayer.external.upstream.n(e0VarA, new androidx.media2.exoplayer.external.upstream.o(Uri.parse(str), 2, httpBody, 0L, 0L, -1L, null, 1));
            try {
                byte[] bArrU0 = q0.U0(nVar);
                q0.o(nVar);
                return bArrU0;
            } catch (androidx.media2.exoplayer.external.upstream.e0.e e10) {
                try {
                    if (e10.f57280f == 307 || e10.f57280f == 308) {
                        i10 = i11 + 1;
                        if (i11 < 5) {
                            z10 = true;
                        } else {
                            i11 = i10;
                            i10 = i11;
                            z10 = false;
                        }
                    } else {
                        i10 = i11;
                        z10 = false;
                    }
                    String strF = z10 ? f(e10) : null;
                    if (strF == null) {
                        throw e10;
                    }
                    q0.o(nVar);
                    str = strF;
                    i11 = i10;
                } catch (Throwable th2) {
                    q0.o(nVar);
                    throw th2;
                }
            }
        }
    }

    @p0
    private static String f(androidx.media2.exoplayer.external.upstream.e0.e exception) {
        List<String> list;
        Map<String, List<String>> map = exception.f57282h;
        if (map == null || (list = map.get(com.google.common.net.d.f119539t0)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // androidx.media2.exoplayer.external.drm.c0
    public byte[] a(UUID uuid, u.e request) throws IOException {
        String strB = request.b();
        String strC = q0.C(request.a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(strB).length() + 15 + String.valueOf(strC).length());
        sb2.append(strB);
        sb2.append("&signedRequest=");
        sb2.append(strC);
        boolean z10 = false | false;
        return e(this.f53925a, sb2.toString(), null, null);
    }

    @Override // androidx.media2.exoplayer.external.drm.c0
    public byte[] b(UUID uuid, u.a request) throws Exception {
        String str;
        String strB = request.b();
        if (this.f53927c || TextUtils.isEmpty(strB)) {
            strB = this.f53926b;
        }
        HashMap map = new HashMap();
        UUID uuid2 = androidx.media2.exoplayer.external.c.A1;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = androidx.media2.exoplayer.external.c.f53747y1.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f53928d) {
            try {
                map.putAll(this.f53928d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e(this.f53925a, strB, request.a(), map);
    }

    public void c() {
        synchronized (this.f53928d) {
            this.f53928d.clear();
        }
    }

    public void d(String name) {
        androidx.media2.exoplayer.external.util.a.g(name);
        synchronized (this.f53928d) {
            this.f53928d.remove(name);
        }
    }

    public void g(String name, String value) {
        androidx.media2.exoplayer.external.util.a.g(name);
        androidx.media2.exoplayer.external.util.a.g(value);
        synchronized (this.f53928d) {
            try {
                this.f53928d.put(name, value);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public z(String defaultLicenseUrl, boolean forceDefaultLicenseUrl, androidx.media2.exoplayer.external.upstream.e0.b dataSourceFactory) {
        this.f53925a = dataSourceFactory;
        this.f53926b = defaultLicenseUrl;
        this.f53927c = forceDefaultLicenseUrl;
        this.f53928d = new HashMap();
    }
}
