package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.exoplayer.analytics.j4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements a0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f63677j = "FrameworkMediaDrm";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b1
    public static final a0.g f63678k = new a0.g() { // from class: androidx.media3.exoplayer.drm.c0
        @Override // androidx.media3.exoplayer.drm.a0.g
        public final a0 a(UUID uuid) {
            return k0.w(uuid);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63679l = "cenc";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f63680m = "https://x";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f63681n = "<LA_URL>https://x</LA_URL>";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f63682o = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final UUID f63683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MediaDrm f63684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63685i;

    @androidx.annotation.w0(31)
    private static class a {
        private a() {
        }

        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, j4 j4Var) {
            LogSessionId logSessionIdA = j4Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            i0.a(androidx.media3.common.util.a.g(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private k0(UUID uuid) throws UnsupportedSchemeException {
        androidx.media3.common.util.a.g(uuid);
        androidx.media3.common.util.a.b(!androidx.media3.common.j.f60709l2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f63683g = uuid;
        MediaDrm mediaDrm = new MediaDrm(E(uuid));
        this.f63684h = mediaDrm;
        this.f63685i = 1;
        if (androidx.media3.common.j.f60719n2.equals(uuid) && L()) {
            H(mediaDrm);
        }
    }

    private String A(String str) {
        if (f63681n.equals(str)) {
            return "";
        }
        if (k1.f61540a >= 33 && "https://default.url".equals(str)) {
            String strG = g("version");
            if (Objects.equals(strG, "1.2") || Objects.equals(strG, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] B(UUID uuid, byte[] bArr) {
        return androidx.media3.common.j.f60714m2.equals(uuid) ? androidx.media3.exoplayer.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[RETURN] */
    private static byte[] C(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        androidx.media3.extractor.mp4.r.a aVarD;
        UUID uuid2 = androidx.media3.common.j.f60724o2;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = androidx.media3.extractor.mp4.r.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = androidx.media3.extractor.mp4.r.a(uuid2, z(bArr));
        }
        if (F(uuid) && (aVarD = androidx.media3.extractor.mp4.r.d(bArr)) != null) {
            bArr = androidx.media3.extractor.mp4.r.b(androidx.media3.common.j.f60709l2, aVarD.f68072d, aVarD.f68071c);
        }
        if (k1.f61540a < 23 && androidx.media3.common.j.f60719n2.equals(uuid)) {
            bArrE = androidx.media3.extractor.mp4.r.e(bArr, uuid);
            if (bArrE != null) {
                return bArrE;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrE = androidx.media3.extractor.mp4.r.e(bArr, uuid);
                if (bArrE != null) {
                    return bArrE;
                }
            }
        }
        return bArr;
    }

    private static String D(UUID uuid, String str) {
        return (k1.f61540a < 26 && androidx.media3.common.j.f60714m2.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID E(UUID uuid) {
        return F(uuid) ? androidx.media3.common.j.f60709l2 : uuid;
    }

    private static boolean F(UUID uuid) {
        return k1.f61540a < 27 && Objects.equals(uuid, androidx.media3.common.j.f60714m2);
    }

    private static void H(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData I(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!androidx.media3.common.j.f60719n2.equals(uuid)) {
            return list.get(0);
        }
        if (k1.f61540a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i10 = 0;
            int length = 0;
            while (true) {
                if (i10 >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        byte[] bArr2 = (byte[]) androidx.media3.common.util.a.g(list.get(i12).f60273e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i11, length2);
                        i11 += length2;
                    }
                    return schemeData.b(bArr);
                }
                DrmInitData.SchemeData schemeData2 = list.get(i10);
                byte[] bArr3 = (byte[]) androidx.media3.common.util.a.g(schemeData2.f60273e);
                if (!Objects.equals(schemeData2.f60272d, schemeData.f60272d) || !Objects.equals(schemeData2.f60271c, schemeData.f60271c) || !androidx.media3.extractor.mp4.r.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i10++;
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            DrmInitData.SchemeData schemeData3 = list.get(i13);
            int iG = androidx.media3.extractor.mp4.r.g((byte[]) androidx.media3.common.util.a.g(schemeData3.f60273e));
            int i14 = k1.f61540a;
            if ((i14 < 23 && iG == 0) || (i14 >= 23 && iG == 1)) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    public static boolean J(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(E(uuid));
    }

    @androidx.annotation.w0(31)
    private boolean K() {
        if (!this.f63683g.equals(androidx.media3.common.j.f60719n2)) {
            return this.f63683g.equals(androidx.media3.common.j.f60714m2);
        }
        String strG = g("version");
        return (strG.startsWith("v5.") || strG.startsWith("14.") || strG.startsWith("15.") || strG.startsWith("16.0")) ? false : true;
    }

    private static boolean L() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    @b1
    public static k0 M(UUID uuid) throws w0 {
        try {
            return new k0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new w0(1, e10);
        } catch (Exception e11) {
            throw new w0(2, e11);
        }
    }

    public static /* synthetic */ void v(k0 k0Var, a0.e eVar, MediaDrm mediaDrm, byte[] bArr, long j10) {
        k0Var.getClass();
        eVar.a(k0Var, bArr, j10);
    }

    public static /* synthetic */ a0 w(UUID uuid) {
        try {
            return M(uuid);
        } catch (w0 unused) {
            androidx.media3.common.util.z.d(f63677j, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    public static /* synthetic */ void x(k0 k0Var, a0.d dVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        k0Var.getClass();
        dVar.a(k0Var, bArr, i10, i11, bArr2);
    }

    public static /* synthetic */ void y(k0 k0Var, a0.f fVar, MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
        k0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new a0.c(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        fVar.a(k0Var, bArr, arrayList, z10);
    }

    private static byte[] z(byte[] bArr) {
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(bArr);
        int iW = o0Var.w();
        short sZ = o0Var.z();
        short sZ2 = o0Var.z();
        if (sZ != 1 || sZ2 != 1) {
            androidx.media3.common.util.z.h(f63677j, "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sZ3 = o0Var.z();
        Charset charset = StandardCharsets.UTF_16LE;
        String strJ = o0Var.J(sZ3, charset);
        if (strJ.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strJ.indexOf("</DATA>");
        if (iIndexOf == -1) {
            androidx.media3.common.util.z.n(f63677j, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strJ.substring(0, iIndexOf) + f63681n + strJ.substring(iIndexOf);
        int i10 = iW + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sZ);
        byteBufferAllocate.putShort(sZ2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b0 r(byte[] bArr) throws MediaCryptoException {
        return new b0(E(this.f63683g), bArr);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public Map<String, String> a(byte[] bArr) {
        return this.f63684h.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public synchronized void acquire() {
        androidx.media3.common.util.a.i(this.f63685i > 0);
        this.f63685i++;
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public a0.h b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f63684h.getProvisionRequest();
        return new a0.h(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public byte[] c() throws MediaDrmException {
        return this.f63684h.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public void d(byte[] bArr, byte[] bArr2) {
        this.f63684h.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public void e(String str, String str2) {
        this.f63684h.setPropertyString(str, str2);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public void f(String str, byte[] bArr) {
        this.f63684h.setPropertyByteArray(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public String g(String str) {
        return this.f63684h.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    @androidx.annotation.p0
    public PersistableBundle getMetrics() {
        if (k1.f61540a < 28) {
            return null;
        }
        return this.f63684h.getMetrics();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    @androidx.annotation.p0
    public byte[] h(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (androidx.media3.common.j.f60714m2.equals(this.f63683g)) {
            bArr2 = androidx.media3.exoplayer.drm.a.b(bArr2);
        }
        return this.f63684h.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public void i(byte[] bArr) throws DeniedByServerException {
        this.f63684h.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public void j(byte[] bArr) {
        this.f63684h.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public byte[] k(String str) {
        return this.f63684h.getPropertyByteArray(str);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    @e.a({"WrongConstant"})
    public a0.b l(byte[] bArr, @androidx.annotation.p0 List<DrmInitData.SchemeData> list, int i10, @androidx.annotation.p0 HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataI;
        byte[] bArrC;
        String strD;
        if (list != null) {
            schemeDataI = I(this.f63683g, list);
            bArrC = C(this.f63683g, (byte[]) androidx.media3.common.util.a.g(schemeDataI.f60273e));
            strD = D(this.f63683g, schemeDataI.f60272d);
        } else {
            schemeDataI = null;
            bArrC = null;
            strD = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f63684h.getKeyRequest(bArr, bArrC, strD, i10, map);
        byte[] bArrB = B(this.f63683g, keyRequest.getData());
        String strA = A(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strA) && schemeDataI != null && !TextUtils.isEmpty(schemeDataI.f60271c)) {
            strA = schemeDataI.f60271c;
        }
        return new a0.b(bArrB, strA, k1.f61540a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    @androidx.annotation.w0(29)
    public List<byte[]> m() {
        if (k1.f61540a >= 29) {
            return this.f63684h.getOfflineLicenseKeySetIds();
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    @androidx.annotation.w0(29)
    public void n(byte[] bArr) {
        if (k1.f61540a < 29) {
            throw new UnsupportedOperationException();
        }
        this.f63684h.removeOfflineLicense(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public void o(byte[] bArr, j4 j4Var) {
        if (k1.f61540a >= 31) {
            try {
                a.b(this.f63684h, bArr, j4Var);
            } catch (UnsupportedOperationException unused) {
                androidx.media3.common.util.z.n(f63677j, "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    @androidx.annotation.w0(23)
    public void p(@androidx.annotation.p0 final a0.e eVar) {
        if (k1.f61540a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f63684h.setOnExpirationUpdateListener(eVar == null ? null : new MediaDrm.OnExpirationUpdateListener() { // from class: androidx.media3.exoplayer.drm.d0
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j10) {
                k0.v(this.f63594a, eVar, mediaDrm, bArr, j10);
            }
        }, (Handler) null);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public int q() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public synchronized void release() {
        try {
            int i10 = this.f63685i - 1;
            this.f63685i = i10;
            if (i10 == 0) {
                this.f63684h.release();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    @androidx.annotation.w0(23)
    public void s(@androidx.annotation.p0 final a0.f fVar) {
        if (k1.f61540a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f63684h.setOnKeyStatusChangeListener(fVar == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: androidx.media3.exoplayer.drm.f0
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
                k0.y(this.f63599a, fVar, mediaDrm, bArr, list, z10);
            }
        }, (Handler) null);
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public boolean t(byte[] bArr, String str) throws Throwable {
        if (k1.f61540a >= 31 && K()) {
            MediaDrm mediaDrm = this.f63684h;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(E(this.f63683g), bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z10 = !this.f63683g.equals(androidx.media3.common.j.f60714m2);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z10;
                } catch (Throwable th2) {
                    th = th2;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // androidx.media3.exoplayer.drm.a0
    @b1
    public void u(@androidx.annotation.p0 final a0.d dVar) {
        this.f63684h.setOnEventListener(dVar == null ? null : new MediaDrm.OnEventListener() { // from class: androidx.media3.exoplayer.drm.e0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                k0.x(this.f63597a, dVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }
}
