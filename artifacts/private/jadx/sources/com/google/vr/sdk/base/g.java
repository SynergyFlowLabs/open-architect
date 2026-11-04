package com.google.vr.sdk.base;

import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.util.Base64;
import com.google.vr.sdk.deps.c7;

/* JADX INFO: loaded from: classes5.dex */
public class g {
    private static final float A = 0.035f;
    private static final float B = 0.039f;
    private static final String C = "Google, Inc.";
    private static final String D = "Cardboard v1";
    private static final float E = 0.06f;
    private static final b F;
    private static final float G = 0.035f;
    private static final float H = 0.042f;
    private static final g I;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f127554k = "GvrViewerParams";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f127557n = "google.com";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f127558o = "cardboard";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f127559p = "cardboard/cfg";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f127560q = "cardboard";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f127564u = "Google, Inc.";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f127565v = "Default Cardboard";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f127566w = "Google";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f127567x = "Cardboard";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f127568y = 0.064f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final b f127569z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f127570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f127571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f127572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f127573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f127574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f127575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f127576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f127577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f127578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.vr.sdk.proto.nano.a.c f127579j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f127561r = "v1.0.0";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Uri f127562s = new Uri.Builder().scheme("cardboard").authority(f127561r).build();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f127555l = "http";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f127556m = "g.co";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Uri f127563t = new Uri.Builder().scheme(f127555l).authority(f127556m).appendEncodedPath("cardboard").build();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f127580a;

        static {
            int[] iArr = new int[b.values().length];
            f127580a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127580a[b.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f127580a[b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        BOTTOM(com.google.vr.sdk.proto.a.f.c.BOTTOM),
        CENTER(com.google.vr.sdk.proto.a.f.c.CENTER),
        TOP(com.google.vr.sdk.proto.a.f.c.TOP);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.vr.sdk.proto.a.f.c f127585a;

        b(com.google.vr.sdk.proto.a.f.c cVar) {
            this.f127585a = cVar;
        }

        static b b(com.google.vr.sdk.proto.a.f.c cVar) {
            for (b bVar : values()) {
                if (bVar.f127585a == cVar) {
                    return bVar;
                }
            }
            String.format("Unknown alignment type from proto: %d", Integer.valueOf(cVar.i()));
            return BOTTOM;
        }

        final com.google.vr.sdk.proto.a.f.c k() {
            return this.f127585a;
        }
    }

    static {
        b bVar = b.BOTTOM;
        f127569z = bVar;
        F = bVar;
        I = new g();
    }

    public g() {
        t();
    }

    public static g a() {
        g gVar = new g();
        gVar.f127570a = "Google, Inc.";
        gVar.f127571b = D;
        gVar.f127572c = E;
        gVar.f127573d = F;
        gVar.f127574e = 0.035f;
        gVar.f127575f = H;
        gVar.f127576g = e.a();
        gVar.f127577h = true;
        gVar.f127578i = d.a();
        return gVar;
    }

    public static g b() {
        g gVar = new g();
        gVar.y();
        return gVar;
    }

    private void c(g gVar) {
        this.f127570a = gVar.f127570a;
        this.f127571b = gVar.f127571b;
        this.f127572c = gVar.f127572c;
        this.f127573d = gVar.f127573d;
        this.f127574e = gVar.f127574e;
        this.f127575f = gVar.f127575f;
        this.f127576g = new e(gVar.f127576g);
        this.f127577h = gVar.f127577h;
        this.f127578i = new d(gVar.f127578i);
        this.f127579j = gVar.f127579j;
    }

    public static g d(NdefMessage ndefMessage) {
        if (ndefMessage == null) {
            return null;
        }
        for (NdefRecord ndefRecord : ndefMessage.getRecords()) {
            g gVarE = e(ndefRecord.toUri());
            if (gVarE != null) {
                return gVarE;
            }
        }
        return null;
    }

    public static g e(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (s(uri)) {
            return a();
        }
        if (p(uri)) {
            return new g(com.google.vr.cardboard.d.c(uri));
        }
        String.format("URI \"%s\" not recognized as GVR viewer.", uri);
        return null;
    }

    private static boolean p(Uri uri) {
        return f127555l.equals(uri.getScheme()) && f127557n.equals(uri.getAuthority()) && "/cardboard/cfg".equals(uri.getPath());
    }

    public static boolean r(Uri uri) {
        return s(uri) || p(uri);
    }

    public static boolean s(Uri uri) {
        if (!f127563t.equals(uri)) {
            Uri uri2 = f127562s;
            if (!uri2.getScheme().equals(uri.getScheme()) || !uri2.getAuthority().equals(uri.getAuthority())) {
                return false;
            }
        }
        return true;
    }

    private void t() {
        y();
        this.f127570a = "Google, Inc.";
        this.f127571b = f127565v;
    }

    private void y() {
        this.f127570a = f127566w;
        this.f127571b = f127567x;
        this.f127572c = f127568y;
        this.f127573d = f127569z;
        this.f127574e = 0.035f;
        this.f127575f = B;
        this.f127576g = new e();
        this.f127577h = false;
        this.f127578i = new d();
    }

    public void A(b bVar) {
        this.f127573d = bVar;
    }

    public void B(float f10) {
        this.f127574e = f10;
    }

    byte[] C() {
        return c7.j(D());
    }

    public com.google.vr.sdk.proto.nano.a.c D() {
        com.google.vr.sdk.proto.nano.a.c cVar = this.f127579j;
        com.google.vr.sdk.proto.nano.a.c cVarL = cVar != null ? cVar.l() : new com.google.vr.sdk.proto.nano.a.c();
        cVarL.G(this.f127570a);
        cVarL.D(this.f127571b);
        cVarL.C(this.f127572c);
        cVarL.H(this.f127573d.k());
        if (this.f127573d == b.CENTER) {
            cVarL.F(0.035f);
        } else {
            cVarL.F(this.f127574e);
        }
        cVarL.E(this.f127575f);
        cVarL.f129885h = this.f127576g.n();
        cVarL.f129888k = this.f127578i.l();
        boolean z10 = this.f127577h;
        if (z10) {
            cVarL.B(z10);
        }
        return cVarL;
    }

    public Uri E() {
        byte[] bArrC = C();
        return new Uri.Builder().scheme(f127555l).authority(f127557n).appendEncodedPath(f127559p).appendQueryParameter("p", Base64.encodeToString(bArrC, 0, bArrC.length, 11)).build();
    }

    public boolean equals(Object obj) {
        b bVar;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f127570a.equals(gVar.f127570a) && this.f127571b.equals(gVar.f127571b) && this.f127572c == gVar.f127572c && (bVar = this.f127573d) == gVar.f127573d && ((bVar == b.CENTER || this.f127574e == gVar.f127574e) && this.f127575f == gVar.f127575f && this.f127576g.equals(gVar.f127576g) && this.f127578i.equals(gVar.f127578i) && this.f127577h == gVar.f127577h)) {
            return c7.h(this.f127579j, gVar.f127579j);
        }
        return false;
    }

    public d f() {
        return this.f127578i;
    }

    public boolean g() {
        return this.f127577h;
    }

    public float h() {
        return this.f127572c;
    }

    public e i() {
        return this.f127576g;
    }

    public String j() {
        return this.f127571b;
    }

    public float k() {
        return this.f127575f;
    }

    public String l() {
        return this.f127570a;
    }

    public b m() {
        return this.f127573d;
    }

    public float n() {
        return this.f127574e;
    }

    float o(m mVar) {
        int iOrdinal = m().ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 2 ? mVar.d() / 2.0f : mVar.d() - (n() - mVar.b());
        }
        return n() - mVar.b();
    }

    public boolean q() {
        return I.equals(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        String str = this.f127570a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 12);
        sb3.append("  vendor: ");
        sb3.append(str);
        sb3.append(",\n");
        sb2.append(sb3.toString());
        String str2 = this.f127571b;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 11);
        sb4.append("  model: ");
        sb4.append(str2);
        sb4.append(",\n");
        sb2.append(sb4.toString());
        float f10 = this.f127572c;
        StringBuilder sb5 = new StringBuilder(40);
        sb5.append("  inter_lens_distance: ");
        sb5.append(f10);
        sb5.append(",\n");
        sb2.append(sb5.toString());
        String strValueOf = String.valueOf(this.f127573d);
        StringBuilder sb6 = new StringBuilder(strValueOf.length() + 24);
        sb6.append("  vertical_alignment: ");
        sb6.append(strValueOf);
        sb6.append(",\n");
        sb2.append(sb6.toString());
        float f11 = this.f127574e;
        StringBuilder sb7 = new StringBuilder(53);
        sb7.append("  vertical_distance_to_lens_center: ");
        sb7.append(f11);
        sb7.append(",\n");
        sb2.append(sb7.toString());
        float f12 = this.f127575f;
        StringBuilder sb8 = new StringBuilder(44);
        sb8.append("  screen_to_lens_distance: ");
        sb8.append(f12);
        sb8.append(",\n");
        sb2.append(sb8.toString());
        String strReplace = this.f127576g.toString().replace("\n", "\n  ");
        StringBuilder sb9 = new StringBuilder(String.valueOf(strReplace).length() + 22);
        sb9.append("  left_eye_max_fov: ");
        sb9.append(strReplace);
        sb9.append(",\n");
        sb2.append(sb9.toString());
        String strReplace2 = this.f127578i.toString().replace("\n", "\n  ");
        StringBuilder sb10 = new StringBuilder(String.valueOf(strReplace2).length() + 16);
        sb10.append("  distortion: ");
        sb10.append(strReplace2);
        sb10.append(",\n");
        sb2.append(sb10.toString());
        boolean z10 = this.f127577h;
        StringBuilder sb11 = new StringBuilder(17);
        sb11.append("  magnet: ");
        sb11.append(z10);
        sb11.append(",\n");
        sb2.append(sb11.toString());
        sb2.append("}\n");
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f127577h = z10;
    }

    public void v(float f10) {
        this.f127572c = f10;
    }

    public void w(String str) {
        if (str == null) {
            str = "";
        }
        this.f127571b = str;
    }

    public void x(float f10) {
        this.f127575f = f10;
    }

    public void z(String str) {
        if (str == null) {
            str = "";
        }
        this.f127570a = str;
    }

    public g(g gVar) {
        c(gVar);
    }

    public g(com.google.vr.sdk.proto.nano.a.c cVar) {
        t();
        if (cVar == null) {
            return;
        }
        this.f127579j = cVar.l();
        this.f127570a = cVar.x();
        this.f127571b = cVar.u();
        this.f127572c = cVar.t();
        this.f127573d = b.b(cVar.z());
        this.f127574e = cVar.w();
        this.f127575f = cVar.v();
        e eVarG = e.g(cVar.f129885h);
        this.f127576g = eVarG;
        if (eVarG == null) {
            this.f127576g = new e();
        }
        d dVarH = d.h(cVar.f129888k);
        this.f127578i = dVarH;
        if (dVarH == null) {
            this.f127578i = new d();
        }
        this.f127577h = cVar.s();
    }
}
