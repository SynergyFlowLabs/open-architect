package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.collect.n6;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.p.a f63692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f63693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f63694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f63695d;

    public l0(@androidx.annotation.p0 String str, androidx.media3.datasource.p.a aVar) {
        this(str, false, aVar);
    }

    @Override // androidx.media3.exoplayer.drm.o0
    public byte[] a(UUID uuid, a0.b bVar) throws p0 {
        String str;
        String strB = bVar.b();
        if (this.f63694c || TextUtils.isEmpty(strB)) {
            strB = this.f63693b;
        }
        if (TextUtils.isEmpty(strB)) {
            androidx.media3.datasource.x.b bVar2 = new androidx.media3.datasource.x.b();
            Uri uri = Uri.EMPTY;
            throw new p0(bVar2.j(uri).a(), uri, n6.q(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = androidx.media3.common.j.f60724o2;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = androidx.media3.common.j.f60714m2.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f63695d) {
            try {
                map.putAll(this.f63695d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x.a(this.f63692a.a(), strB, bVar.a(), map);
    }

    @Override // androidx.media3.exoplayer.drm.o0
    public byte[] b(UUID uuid, a0.h hVar) throws p0 {
        return x.a(this.f63692a.a(), hVar.b() + "&signedRequest=" + k1.T(hVar.a()), null, Collections.EMPTY_MAP);
    }

    public void c() {
        synchronized (this.f63695d) {
            this.f63695d.clear();
        }
    }

    public void d(String str) {
        androidx.media3.common.util.a.g(str);
        synchronized (this.f63695d) {
            this.f63695d.remove(str);
        }
    }

    public void e(String str, String str2) {
        androidx.media3.common.util.a.g(str);
        androidx.media3.common.util.a.g(str2);
        synchronized (this.f63695d) {
            try {
                this.f63695d.put(str, str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l0(@androidx.annotation.p0 String str, boolean z10, androidx.media3.datasource.p.a aVar) {
        androidx.media3.common.util.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f63692a = aVar;
        this.f63693b = str;
        this.f63694c = z10;
        this.f63695d = new HashMap();
    }
}
