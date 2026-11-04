package androidx.media2.exoplayer.external.drm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.drm.t;
import androidx.media2.exoplayer.external.util.q0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@e.b(18)
@b1({b1.a.LIBRARY_GROUP})
public class n<T extends t> implements r<T>, i.a<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f53868p = "PRCustomData";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f53869q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f53870r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f53871s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f53872t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f53873u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f53874v = "DefaultDrmSessionMgr";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UUID f53875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u<T> f53876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f53877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final HashMap<String, String> f53878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.i<k> f53879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f53880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.f0 f53881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<i<T>> f53882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<i<T>> f53883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private Looper f53884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private byte[] f53886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    volatile n<T>.c f53887o;

    private class b implements u.c<T> {
        private b() {
        }

        @Override // androidx.media2.exoplayer.external.drm.u.c
        public void a(u<? extends T> md2, @p0 byte[] sessionId, int event, int extra, @p0 byte[] data) {
            ((c) androidx.media2.exoplayer.external.util.a.g(n.this.f53887o)).obtainMessage(event, sessionId).sendToTarget();
        }
    }

    @e.a({"HandlerLeak"})
    private class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            byte[] bArr = (byte[]) msg.obj;
            if (bArr != null) {
                for (i iVar : n.this.f53882j) {
                    if (iVar.f(bArr)) {
                        iVar.m(msg.what);
                        break;
                    }
                }
            }
        }
    }

    public static final class d extends Exception {
        private d(UUID uuid) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 29);
            sb2.append("Media does not support uuid: ");
            sb2.append(strValueOf);
            super(sb2.toString());
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    static {
        q.a();
    }

    public n(UUID uuid, u<T> mediaDrm, c0 callback, @p0 HashMap<String, String> optionalKeyRequestParameters) {
        this(uuid, (u) mediaDrm, callback, optionalKeyRequestParameters, false, 3);
    }

    private static List<DrmInitData.SchemeData> l(DrmInitData drmInitData, UUID uuid, boolean allowMissingData) {
        ArrayList arrayList = new ArrayList(drmInitData.f53814d);
        for (int i10 = 0; i10 < drmInitData.f53814d; i10++) {
            DrmInitData.SchemeData schemeDataF = drmInitData.f(i10);
            if ((schemeDataF.f(uuid) || (androidx.media2.exoplayer.external.c.f53747y1.equals(uuid) && schemeDataF.f(androidx.media2.exoplayer.external.c.f53743x1))) && (schemeDataF.f53819e != null || allowMissingData)) {
                arrayList.add(schemeDataF);
            }
        }
        return arrayList;
    }

    public static n<v> n(UUID uuid, c0 callback, @p0 HashMap<String, String> optionalKeyRequestParameters) throws e0 {
        return new n<>(uuid, (u) y.B(uuid), callback, optionalKeyRequestParameters, false, 3);
    }

    public static n<v> o(c0 callback, @p0 String customData) throws e0 {
        HashMap map;
        if (TextUtils.isEmpty(customData)) {
            map = null;
        } else {
            map = new HashMap();
            map.put("PRCustomData", customData);
        }
        return n(androidx.media2.exoplayer.external.c.A1, callback, map);
    }

    public static n<v> p(c0 callback, @p0 HashMap<String, String> optionalKeyRequestParameters) throws e0 {
        return n(androidx.media2.exoplayer.external.c.f53750z1, callback, optionalKeyRequestParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void i(i<T> drmSession) {
        this.f53882j.remove(drmSession);
        if (this.f53883k.size() > 1 && this.f53883k.get(0) == drmSession) {
            this.f53883k.get(1).s();
        }
        this.f53883k.remove(drmSession);
    }

    @Override // androidx.media2.exoplayer.external.drm.r
    public int I() {
        return q.c(this);
    }

    @Override // androidx.media2.exoplayer.external.drm.i.a
    public void a() {
        Iterator<i<T>> it = this.f53883k.iterator();
        while (it.hasNext()) {
            it.next().n();
        }
        this.f53883k.clear();
    }

    @Override // androidx.media2.exoplayer.external.drm.i.a
    public void b(i<T> session) {
        if (!this.f53883k.contains(session)) {
            this.f53883k.add(session);
            if (this.f53883k.size() == 1) {
                session.s();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.drm.r
    public boolean c(DrmInitData drmInitData) {
        if (this.f53886n != null) {
            return true;
        }
        if (l(drmInitData, this.f53875c, true).isEmpty()) {
            if (drmInitData.f53814d != 1 || !drmInitData.f(0).f(androidx.media2.exoplayer.external.c.f53743x1)) {
                return false;
            }
            String strValueOf = String.valueOf(this.f53875c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 72);
            sb2.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb2.append(strValueOf);
            androidx.media2.exoplayer.external.util.p.l(f53874v, sb2.toString());
        }
        String str = drmInitData.f53813c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if (!"cbc1".equals(str) && !"cbcs".equals(str) && !"cens".equals(str)) {
            return true;
        }
        return q0.f57626a >= 25;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media2.exoplayer.external.drm.n$a] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.media2.exoplayer.external.drm.i, androidx.media2.exoplayer.external.drm.p<T extends androidx.media2.exoplayer.external.drm.t>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.media2.exoplayer.external.drm.i] */
    @Override // androidx.media2.exoplayer.external.drm.r
    public p<T> d(Looper looper, DrmInitData drmInitData) {
        List<DrmInitData.SchemeData> list;
        Looper looper2 = this.f53884l;
        androidx.media2.exoplayer.external.util.a.i(looper2 == null || looper2 == looper);
        if (this.f53882j.isEmpty()) {
            this.f53884l = looper;
            if (this.f53887o == null) {
                this.f53887o = new c(looper);
            }
        }
        i<T> iVar = 0;
        iVar = 0;
        if (this.f53886n == null) {
            List<DrmInitData.SchemeData> listL = l(drmInitData, this.f53875c, false);
            if (listL.isEmpty()) {
                final d dVar = new d(this.f53875c);
                this.f53879g.b(new androidx.media2.exoplayer.external.util.i.a(dVar) { // from class: androidx.media2.exoplayer.external.drm.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private final n.d f53866a;

                    {
                        this.f53866a = dVar;
                    }

                    @Override // androidx.media2.exoplayer.external.util.i.a
                    public void a(Object obj) {
                        ((k) obj).g(this.f53866a);
                    }
                });
                return new s(new p.a(dVar));
            }
            list = listL;
        } else {
            list = null;
        }
        if (this.f53880h) {
            for (i<T> iVar2 : this.f53882j) {
                if (q0.b(iVar2.f53839f, list)) {
                    iVar = iVar2;
                    break;
                }
            }
        } else if (!this.f53882j.isEmpty()) {
            iVar = this.f53882j.get(0);
        }
        if (iVar == 0) {
            i<T> iVar3 = new i<>(this.f53875c, this.f53876d, this, new i.b(this) { // from class: androidx.media2.exoplayer.external.drm.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final n f53867a;

                {
                    this.f53867a = this;
                }

                @Override // androidx.media2.exoplayer.external.drm.i.b
                public void a(i iVar4) {
                    this.f53867a.i(iVar4);
                }
            }, list, this.f53885m, this.f53886n, this.f53878f, this.f53877e, looper, this.f53879g, this.f53881i);
            this.f53882j.add(iVar3);
            iVar = iVar3;
        }
        ((i) iVar).Y();
        return (p<T>) iVar;
    }

    @Override // androidx.media2.exoplayer.external.drm.i.a
    public void e(Exception error) {
        Iterator<i<T>> it = this.f53883k.iterator();
        while (it.hasNext()) {
            it.next().o(error);
        }
        this.f53883k.clear();
    }

    @Override // androidx.media2.exoplayer.external.drm.r
    @p0
    public Class<T> f(DrmInitData drmInitData) {
        if (c(drmInitData)) {
            return this.f53876d.m();
        }
        return null;
    }

    public final void h(Handler handler, k eventListener) {
        this.f53879g.a(handler, eventListener);
    }

    public final byte[] j(String key) {
        return this.f53876d.k(key);
    }

    public final String k(String key) {
        return this.f53876d.g(key);
    }

    public final void r(k eventListener) {
        this.f53879g.c(eventListener);
    }

    public void s(int mode, @p0 byte[] offlineLicenseKeySetId) {
        androidx.media2.exoplayer.external.util.a.i(this.f53882j.isEmpty());
        if (mode == 1 || mode == 3) {
            androidx.media2.exoplayer.external.util.a.g(offlineLicenseKeySetId);
        }
        this.f53885m = mode;
        this.f53886n = offlineLicenseKeySetId;
    }

    public final void t(String key, byte[] value) {
        this.f53876d.f(key, value);
    }

    public final void u(String key, String value) {
        this.f53876d.e(key, value);
    }

    public n(UUID uuid, u<T> mediaDrm, c0 callback, @p0 HashMap<String, String> optionalKeyRequestParameters, boolean multiSession) {
        this(uuid, mediaDrm, callback, optionalKeyRequestParameters, multiSession, 3);
    }

    public n(UUID uuid, u<T> mediaDrm, c0 callback, @p0 HashMap<String, String> optionalKeyRequestParameters, boolean multiSession, int initialDrmRequestRetryCount) {
        this(uuid, mediaDrm, callback, optionalKeyRequestParameters, multiSession, new androidx.media2.exoplayer.external.upstream.x(initialDrmRequestRetryCount));
    }

    private n(UUID uuid, u<T> mediaDrm, c0 callback, @p0 HashMap<String, String> optionalKeyRequestParameters, boolean multiSession, androidx.media2.exoplayer.external.upstream.f0 loadErrorHandlingPolicy) {
        androidx.media2.exoplayer.external.util.a.g(uuid);
        androidx.media2.exoplayer.external.util.a.g(mediaDrm);
        androidx.media2.exoplayer.external.util.a.b(!androidx.media2.exoplayer.external.c.f53743x1.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f53875c = uuid;
        this.f53876d = mediaDrm;
        this.f53877e = callback;
        this.f53878f = optionalKeyRequestParameters;
        this.f53879g = new androidx.media2.exoplayer.external.util.i<>();
        this.f53880h = multiSession;
        this.f53881i = loadErrorHandlingPolicy;
        int i10 = 5 ^ 0;
        this.f53885m = 0;
        this.f53882j = new ArrayList();
        this.f53883k = new ArrayList();
        if (multiSession && androidx.media2.exoplayer.external.c.f53750z1.equals(uuid) && q0.f57626a >= 19) {
            mediaDrm.e("sessionSharing", "enable");
        }
        mediaDrm.o(new b());
    }
}
