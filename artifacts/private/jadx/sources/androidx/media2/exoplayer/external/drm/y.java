package androidx.media2.exoplayer.external.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@e.b(23)
@b1({b1.a.LIBRARY_GROUP})
public final class y implements u<v> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f53917i = "cenc";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f53918j = "https://x";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f53919k = "<LA_URL>https://x</LA_URL>";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f53920l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f53921m = "FrameworkMediaDrm";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final UUID f53922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MediaDrm f53923h;

    private y(UUID uuid) throws UnsupportedSchemeException {
        androidx.media2.exoplayer.external.util.a.g(uuid);
        androidx.media2.exoplayer.external.util.a.b(!androidx.media2.exoplayer.external.c.f53743x1.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f53922g = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f53923h = mediaDrm;
        if (androidx.media2.exoplayer.external.c.f53750z1.equals(uuid) && A()) {
            w(mediaDrm);
        }
    }

    private static boolean A() {
        return "ASUS_Z00AD".equals(q0.f57629d);
    }

    public static y B(UUID uuid) throws e0 {
        try {
            return new y(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new e0(1, e10);
        } catch (Exception e11) {
            throw new e0(2, e11);
        }
    }

    private static byte[] q(byte[] data) {
        androidx.media2.exoplayer.external.util.x xVar = new androidx.media2.exoplayer.external.util.x(data);
        int iO = xVar.o();
        short sR = xVar.r();
        short sR2 = xVar.r();
        if (sR != 1 || sR2 != 1) {
            androidx.media2.exoplayer.external.util.p.h(f53921m, "Unexpected record count or type. Skipping LA_URL workaround.");
            return data;
        }
        String strB = xVar.B(xVar.r(), Charset.forName("UTF-16LE"));
        if (strB.contains("<LA_URL>")) {
            return data;
        }
        int iIndexOf = strB.indexOf("</DATA>");
        if (iIndexOf == -1) {
            androidx.media2.exoplayer.external.util.p.l(f53921m, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String strSubstring = strB.substring(0, iIndexOf);
        String strSubstring2 = strB.substring(iIndexOf);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + 26 + String.valueOf(strSubstring2).length());
        sb2.append(strSubstring);
        sb2.append(f53919k);
        sb2.append(strSubstring2);
        String string = sb2.toString();
        int i10 = iO + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sR);
        byteBufferAllocate.putShort(sR2);
        byteBufferAllocate.putShort((short) (string.length() * 2));
        byteBufferAllocate.put(string.getBytes(Charset.forName("UTF-16LE")));
        return byteBufferAllocate.array();
    }

    private static byte[] r(UUID uuid, byte[] requestData) {
        return androidx.media2.exoplayer.external.c.f53747y1.equals(uuid) ? a.a(requestData) : requestData;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[RETURN] */
    private static byte[] s(UUID uuid, byte[] initData) {
        byte[] bArrE;
        UUID uuid2 = androidx.media2.exoplayer.external.c.A1;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = androidx.media2.exoplayer.external.extractor.mp4.j.e(initData, uuid);
            if (bArrE2 != null) {
                initData = bArrE2;
            }
            initData = androidx.media2.exoplayer.external.extractor.mp4.j.a(uuid2, q(initData));
        }
        if (q0.f57626a < 21 && androidx.media2.exoplayer.external.c.f53750z1.equals(uuid)) {
            bArrE = androidx.media2.exoplayer.external.extractor.mp4.j.e(initData, uuid);
            if (bArrE != null) {
                return bArrE;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(q0.f57628c)) {
            String str = q0.f57629d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str)) {
                bArrE = androidx.media2.exoplayer.external.extractor.mp4.j.e(initData, uuid);
                if (bArrE != null) {
                    return bArrE;
                }
            }
        }
        return initData;
    }

    private static String t(UUID uuid, String mimeType) {
        return (q0.f57626a < 26 && androidx.media2.exoplayer.external.c.f53747y1.equals(uuid) && ("video/mp4".equals(mimeType) || "audio/mp4".equals(mimeType))) ? "cenc" : mimeType;
    }

    private static UUID u(UUID uuid) {
        if (q0.f57626a < 27 && androidx.media2.exoplayer.external.c.f53747y1.equals(uuid)) {
            uuid = androidx.media2.exoplayer.external.c.f53743x1;
        }
        return uuid;
    }

    @e.a({"WrongConstant"})
    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData x(UUID uuid, List<DrmInitData.SchemeData> schemeDatas) {
        if (!androidx.media2.exoplayer.external.c.f53750z1.equals(uuid)) {
            return schemeDatas.get(0);
        }
        if (q0.f57626a >= 28 && schemeDatas.size() > 1) {
            DrmInitData.SchemeData schemeData = schemeDatas.get(0);
            int i10 = 0;
            int length = 0;
            while (true) {
                if (i10 >= schemeDatas.size()) {
                    byte[] bArr = new byte[length];
                    int i11 = 0;
                    for (int i12 = 0; i12 < schemeDatas.size(); i12++) {
                        byte[] bArr2 = (byte[]) q0.i(schemeDatas.get(i12).f53819e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i11, length2);
                        i11 += length2;
                    }
                    return schemeData.c(bArr);
                }
                DrmInitData.SchemeData schemeData2 = schemeDatas.get(i10);
                byte[] bArr3 = (byte[]) q0.i(schemeData2.f53819e);
                if (!q0.b(schemeData2.f53818d, schemeData.f53818d) || !q0.b(schemeData2.f53817c, schemeData.f53817c) || !androidx.media2.exoplayer.external.extractor.mp4.j.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i10++;
            }
        }
        for (int i13 = 0; i13 < schemeDatas.size(); i13++) {
            DrmInitData.SchemeData schemeData3 = schemeDatas.get(i13);
            int iG = androidx.media2.exoplayer.external.extractor.mp4.j.g((byte[]) q0.i(schemeData3.f53819e));
            int i14 = q0.f57626a;
            if ((i14 < 23 && iG == 0) || (i14 >= 23 && iG == 1)) {
                return schemeData3;
            }
        }
        return schemeDatas.get(0);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public Map<String, String> a(byte[] sessionId) {
        return this.f53923h.queryKeyStatus(sessionId);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public u.e b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f53923h.getProvisionRequest();
        return new u.e(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public byte[] c() throws MediaDrmException {
        return this.f53923h.openSession();
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public void d(byte[] sessionId, byte[] keySetId) {
        this.f53923h.restoreKeys(sessionId, keySetId);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public void e(String propertyName, String value) {
        this.f53923h.setPropertyString(propertyName, value);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public void f(String propertyName, byte[] value) {
        this.f53923h.setPropertyByteArray(propertyName, value);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public String g(String propertyName) {
        return this.f53923h.getPropertyString(propertyName);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    @p0
    public byte[] h(byte[] scope, byte[] response) throws DeniedByServerException, NotProvisionedException {
        if (androidx.media2.exoplayer.external.c.f53747y1.equals(this.f53922g)) {
            response = a.b(response);
        }
        return this.f53923h.provideKeyResponse(scope, response);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public void i(byte[] response) throws DeniedByServerException {
        this.f53923h.provideProvisionResponse(response);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public void j(byte[] sessionId) {
        this.f53923h.closeSession(sessionId);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public byte[] k(String propertyName) {
        return this.f53923h.getPropertyByteArray(propertyName);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public u.a l(byte[] scope, @p0 List<DrmInitData.SchemeData> schemeDatas, int keyType, @p0 HashMap<String, String> optionalParameters) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataX;
        byte[] bArrS;
        String strT;
        if (schemeDatas != null) {
            schemeDataX = x(this.f53922g, schemeDatas);
            bArrS = s(this.f53922g, (byte[]) androidx.media2.exoplayer.external.util.a.g(schemeDataX.f53819e));
            strT = t(this.f53922g, schemeDataX.f53818d);
        } else {
            schemeDataX = null;
            bArrS = null;
            strT = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f53923h.getKeyRequest(scope, bArrS, strT, keyType, optionalParameters);
        byte[] bArrR = r(this.f53922g, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if (f53918j.equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeDataX != null && !TextUtils.isEmpty(schemeDataX.f53817c)) {
            defaultUrl = schemeDataX.f53817c;
        }
        return new u.a(bArrR, defaultUrl);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public Class<v> m() {
        return v.class;
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public void n(final u.d<? super v> listener) {
        if (q0.f57626a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f53923h.setOnKeyStatusChangeListener(listener == null ? null : new MediaDrm.OnKeyStatusChangeListener(this, listener) { // from class: androidx.media2.exoplayer.external.drm.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final y f53915a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final u.d f53916b;

            {
                this.f53915a = this;
                this.f53916b = listener;
            }

            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
                this.f53915a.z(this.f53916b, mediaDrm, bArr, list, z10);
            }
        }, (Handler) null);
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public void o(final u.c<? super v> listener) {
        this.f53923h.setOnEventListener(listener == null ? null : new MediaDrm.OnEventListener(this, listener) { // from class: androidx.media2.exoplayer.external.drm.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final y f53913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final u.c f53914b;

            {
                this.f53913a = this;
                this.f53914b = listener;
            }

            @Override // android.media.MediaDrm.OnEventListener
            public void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f53913a.y(this.f53914b, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    public void release() {
        this.f53923h.release();
    }

    @Override // androidx.media2.exoplayer.external.drm.u
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public v p(byte[] initData) throws MediaCryptoException {
        return new v(u(this.f53922g), initData, q0.f57626a < 21 && androidx.media2.exoplayer.external.c.f53750z1.equals(this.f53922g) && "L3".equals(g("securityLevel")));
    }

    final /* synthetic */ void y(u.c cVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        cVar.a(this, bArr, i10, i11, bArr2);
    }

    final /* synthetic */ void z(u.d dVar, MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new u.b(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        dVar.a(this, bArr, arrayList, z10);
    }
}
