package androidx.media2.exoplayer.external.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.drm.t;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d0<T extends t> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final DrmInitData f53825d = new DrmInitData(new DrmInitData.SchemeData[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConditionVariable f53826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n<T> f53827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f53828c;

    class a implements k {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.drm.k
        public void O() {
            d0.this.f53826a.open();
        }

        @Override // androidx.media2.exoplayer.external.drm.k
        public void g(Exception e10) {
            d0.this.f53826a.open();
        }

        @Override // androidx.media2.exoplayer.external.drm.k
        public void k() {
            d0.this.f53826a.open();
        }

        @Override // androidx.media2.exoplayer.external.drm.k
        public void p() {
            j.a(this);
        }

        @Override // androidx.media2.exoplayer.external.drm.k
        public void s() {
            j.b(this);
        }

        @Override // androidx.media2.exoplayer.external.drm.k
        public void u() {
            d0.this.f53826a.open();
        }
    }

    public d0(UUID uuid, u<T> mediaDrm, c0 callback, @p0 HashMap<String, String> optionalKeyRequestParameters) {
        HandlerThread handlerThread = new HandlerThread("OfflineLicenseHelper");
        this.f53828c = handlerThread;
        handlerThread.start();
        this.f53826a = new ConditionVariable();
        a aVar = new a();
        n<T> nVar = new n<>(uuid, mediaDrm, callback, optionalKeyRequestParameters);
        this.f53827b = nVar;
        nVar.h(new Handler(handlerThread.getLooper()), aVar);
    }

    private byte[] b(int licenseMode, @p0 byte[] offlineLicenseKeySetId, DrmInitData drmInitData) throws p.a {
        p<T> pVarJ = j(licenseMode, offlineLicenseKeySetId, drmInitData);
        p.a aVarT = pVarJ.T();
        byte[] bArrV = pVarJ.V();
        pVarJ.X();
        if (aVarT == null) {
            return (byte[]) androidx.media2.exoplayer.external.util.a.g(bArrV);
        }
        throw aVarT;
    }

    public static d0<v> g(String defaultLicenseUrl, androidx.media2.exoplayer.external.upstream.e0.b httpDataSourceFactory) throws e0 {
        return i(defaultLicenseUrl, false, httpDataSourceFactory, null);
    }

    public static d0<v> h(String defaultLicenseUrl, boolean forceDefaultLicenseUrl, androidx.media2.exoplayer.external.upstream.e0.b httpDataSourceFactory) throws e0 {
        return i(defaultLicenseUrl, forceDefaultLicenseUrl, httpDataSourceFactory, null);
    }

    public static d0<v> i(String defaultLicenseUrl, boolean forceDefaultLicenseUrl, androidx.media2.exoplayer.external.upstream.e0.b httpDataSourceFactory, @p0 HashMap<String, String> optionalKeyRequestParameters) throws e0 {
        UUID uuid = androidx.media2.exoplayer.external.c.f53750z1;
        return new d0<>(uuid, y.B(uuid), new z(defaultLicenseUrl, forceDefaultLicenseUrl, httpDataSourceFactory), optionalKeyRequestParameters);
    }

    private p<T> j(int licenseMode, @p0 byte[] offlineLicenseKeySetId, DrmInitData drmInitData) {
        this.f53827b.s(licenseMode, offlineLicenseKeySetId);
        this.f53826a.close();
        p<T> pVarD = this.f53827b.d(this.f53828c.getLooper(), drmInitData);
        this.f53826a.block();
        return pVarD;
    }

    public synchronized byte[] c(DrmInitData drmInitData) throws p.a {
        try {
            androidx.media2.exoplayer.external.util.a.a(drmInitData != null);
        } catch (Throwable th2) {
            throw th2;
        }
        return b(2, null, drmInitData);
    }

    public synchronized Pair<Long, Long> d(byte[] offlineLicenseKeySetId) throws p.a {
        try {
            androidx.media2.exoplayer.external.util.a.g(offlineLicenseKeySetId);
            p<T> pVarJ = j(1, offlineLicenseKeySetId, f53825d);
            p.a aVarT = pVarJ.T();
            Pair<Long, Long> pairB = f0.b(pVarJ);
            pVarJ.X();
            if (aVarT == null) {
                return (Pair) androidx.media2.exoplayer.external.util.a.g(pairB);
            }
            if (!(aVarT.getCause() instanceof a0)) {
                throw aVarT;
            }
            return Pair.create(0L, 0L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized byte[] e(String key) {
        return this.f53827b.j(key);
    }

    public synchronized String f(String key) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f53827b.k(key);
    }

    public void k() {
        this.f53828c.quit();
    }

    public synchronized void l(byte[] offlineLicenseKeySetId) throws p.a {
        try {
            androidx.media2.exoplayer.external.util.a.g(offlineLicenseKeySetId);
            b(3, offlineLicenseKeySetId, f53825d);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized byte[] m(byte[] offlineLicenseKeySetId) throws p.a {
        try {
            androidx.media2.exoplayer.external.util.a.g(offlineLicenseKeySetId);
        } catch (Throwable th2) {
            throw th2;
        }
        return b(2, offlineLicenseKeySetId, f53825d);
    }

    public synchronized void n(String key, byte[] value) {
        try {
            this.f53827b.t(key, value);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void o(String key, String value) {
        this.f53827b.u(key, value);
    }
}
