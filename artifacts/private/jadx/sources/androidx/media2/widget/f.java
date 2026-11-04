package androidx.media2.widget;

import android.graphics.Color;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f59687c = "Cea708CCParser";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f59688d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f59689e = new String("♫".getBytes(Charset.forName("UTF-8")), Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f59690f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f59691g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f59692h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f59693i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f59694j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f59695k = 6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f59696l = 7;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f59697m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f59698n = 9;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f59699o = 10;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f59700p = 11;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f59701q = 12;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f59702r = 13;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f59703s = 14;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f59704t = 15;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f59705u = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f59706a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f59707b;

    class a implements j {
        a() {
        }

        @Override // androidx.media2.widget.f.j
        public void d(c cVar) {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f59709e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f59710f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f59711g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f59712h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int[] f59713i = {0, 15, 240, 255};

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int[] f59714j = {255, com.planner5d.library.engine.input.f.b.X1, 128, 0};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f59717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f59718d;

        b(int i10, int i11, int i12, int i13) {
            this.f59715a = i10;
            this.f59716b = i11;
            this.f59717c = i12;
            this.f59718d = i13;
        }

        public int a() {
            int i10 = f59714j[this.f59715a];
            int[] iArr = f59713i;
            return Color.argb(i10, iArr[this.f59716b], iArr[this.f59717c], iArr[this.f59718d]);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f59720b;

        c(int i10, Object obj) {
            this.f59719a = i10;
            this.f59720b = obj;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f59721h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f59722i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f59723j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f59724k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f59725l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f59726m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f59729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f59730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f59731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f59732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f59733g;

        d(int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
            this.f59727a = i10;
            this.f59728b = i11;
            this.f59729c = i12;
            this.f59730d = i13;
            this.f59731e = i14;
            this.f59732f = z10;
            this.f59733g = z11;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f59734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f59735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f59736c;

        e(b bVar, b bVar2, b bVar3) {
            this.f59734a = bVar;
            this.f59735b = bVar2;
            this.f59736c = bVar3;
        }
    }

    /* JADX INFO: renamed from: androidx.media2.widget.f$f, reason: collision with other inner class name */
    public static class C0560f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59738b;

        C0560f(int i10, int i11) {
            this.f59737a = i10;
            this.f59738b = i11;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f59740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f59741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f59742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f59743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f59744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f59745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f59746h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f59747i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f59748j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f59749k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f59750l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f59751m;

        g(int i10, boolean z10, boolean z11, boolean z12, int i11, boolean z13, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f59739a = i10;
            this.f59740b = z10;
            this.f59741c = z11;
            this.f59742d = z12;
            this.f59743e = i11;
            this.f59744f = z13;
            this.f59745g = i12;
            this.f59746h = i13;
            this.f59747i = i14;
            this.f59748j = i15;
            this.f59749k = i16;
            this.f59750l = i17;
            this.f59751m = i18;
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f59752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f59753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f59754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f59755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f59756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f59757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f59758g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f59759h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f59760i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f59761j;

        h(b bVar, b bVar2, int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f59752a = bVar;
            this.f59753b = bVar2;
            this.f59754c = i10;
            this.f59755d = z10;
            this.f59756e = i11;
            this.f59757f = i12;
            this.f59758g = i13;
            this.f59759h = i14;
            this.f59760i = i15;
            this.f59761j = i16;
        }
    }

    private static class i {
        public static final int A = 24;
        public static final int B = 31;
        public static final int C = 128;
        public static final int D = 135;
        public static final int E = 136;
        public static final int F = 143;
        public static final int G = 0;
        public static final int H = 3;
        public static final int I = 8;
        public static final int J = 12;
        public static final int K = 13;
        public static final int L = 14;
        public static final int M = 16;
        public static final int N = 24;
        public static final int O = 127;
        public static final int P = 32;
        public static final int Q = 33;
        public static final int R = 48;
        public static final int S = 160;
        public static final int T = 128;
        public static final int U = 129;
        public static final int V = 130;
        public static final int W = 131;
        public static final int X = 132;
        public static final int Y = 133;
        public static final int Z = 134;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f59762a = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public static final int f59763a0 = 135;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f59764b = 31;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public static final int f59765b0 = 136;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f59766c = 128;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public static final int f59767c0 = 137;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f59768d = 159;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final int f59769d0 = 138;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f59770e = 32;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public static final int f59771e0 = 139;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f59772f = 127;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public static final int f59773f0 = 140;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f59774g = 160;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public static final int f59775g0 = 141;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f59776h = 255;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public static final int f59777h0 = 142;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f59778i = 0;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public static final int f59779i0 = 143;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f59780j = 31;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public static final int f59781j0 = 144;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f59782k = 128;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public static final int f59783k0 = 145;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f59784l = 159;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public static final int f59785l0 = 146;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f59786m = 32;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final int f59787m0 = 151;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f59788n = 127;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final int f59789n0 = 152;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f59790o = 160;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public static final int f59791o0 = 153;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f59792p = 255;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f59793p0 = 154;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f59794q = 24;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f59795q0 = 155;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f59796r = 31;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f59797r0 = 156;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f59798s = 16;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int f59799s0 = 157;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f59800t = 23;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final int f59801t0 = 158;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f59802u = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final int f59803u0 = 159;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f59804v = 7;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f59805w = 8;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f59806x = 15;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f59807y = 16;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f59808z = 23;

        private i() {
        }
    }

    interface j {
        void d(c cVar);
    }

    f(j jVar) {
        this.f59707b = new a();
        if (jVar != null) {
            this.f59707b = jVar;
        }
    }

    private void a() {
        if (this.f59706a.length() > 0) {
            this.f59707b.d(new c(1, this.f59706a.toString()));
            this.f59706a.setLength(0);
        }
    }

    private void b(c cVar) {
        a();
        this.f59707b.d(cVar);
    }

    private int d(int i10, byte[] bArr, int i11) {
        if (i10 >= 24 && i10 <= 31) {
            if (i10 == 24) {
                try {
                    if (bArr[i11] == 0) {
                        this.f59706a.append((char) bArr[i11 + 1]);
                    } else {
                        this.f59706a.append(new String(Arrays.copyOfRange(bArr, i11, i11 + 2), "EUC-KR"));
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
            return i11 + 2;
        }
        if (i10 >= 16 && i10 <= 23) {
            return i11 + 1;
        }
        if (i10 != 3 && i10 != 8) {
            switch (i10) {
                case 12:
                case 14:
                    break;
                case 13:
                    this.f59706a.append('\n');
                    return i11;
                default:
                    return i11;
            }
        }
        b(new c(2, Character.valueOf((char) i10)));
        return i11;
    }

    private int e(int i10, byte[] bArr, int i11) {
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                b(new c(3, Integer.valueOf(i10 - 128)));
                return i11;
            case 136:
                int i12 = i11 + 1;
                b(new c(4, Integer.valueOf(bArr[i11] & 255)));
                return i12;
            case i.f59767c0 /* 137 */:
                int i13 = i11 + 1;
                b(new c(5, Integer.valueOf(bArr[i11] & 255)));
                return i13;
            case 138:
                int i14 = i11 + 1;
                b(new c(6, Integer.valueOf(bArr[i11] & 255)));
                return i14;
            case 139:
                int i15 = i11 + 1;
                b(new c(7, Integer.valueOf(bArr[i11] & 255)));
                return i15;
            case i.f59773f0 /* 140 */:
                int i16 = i11 + 1;
                b(new c(8, Integer.valueOf(bArr[i11] & 255)));
                return i16;
            case i.f59775g0 /* 141 */:
                int i17 = i11 + 1;
                b(new c(9, Integer.valueOf(bArr[i11] & 255)));
                return i17;
            case i.f59777h0 /* 142 */:
                b(new c(10, null));
                return i11;
            case 143:
                b(new c(11, null));
                return i11;
            case 144:
                byte b10 = bArr[i11];
                int i18 = (b10 & 240) >> 4;
                int i19 = b10 & 3;
                int i20 = (b10 & com.google.common.base.c.f116461n) >> 2;
                byte b11 = bArr[i11 + 1];
                boolean z10 = (b11 & 128) != 0;
                boolean z11 = (b11 & com.google.common.primitives.t.f119782a) != 0;
                int i21 = (b11 & 56) >> 3;
                int i22 = b11 & 7;
                int i23 = i11 + 2;
                b(new c(12, new d(i19, i20, i18, i22, i21, z11, z10)));
                return i23;
            case 145:
                byte b12 = bArr[i11];
                b bVar = new b((b12 & org.msgpack.core.h.a.f339269e) >> 6, (b12 & 48) >> 4, (b12 & com.google.common.base.c.f116461n) >> 2, b12 & 3);
                byte b13 = bArr[i11 + 1];
                b bVar2 = new b((b13 & org.msgpack.core.h.a.f339269e) >> 6, (b13 & 48) >> 4, (b13 & com.google.common.base.c.f116461n) >> 2, b13 & 3);
                byte b14 = bArr[i11 + 2];
                b bVar3 = new b(0, (b14 & 48) >> 4, (b14 & com.google.common.base.c.f116461n) >> 2, b14 & 3);
                int i24 = i11 + 3;
                b(new c(13, new e(bVar, bVar2, bVar3)));
                return i24;
            case 146:
                int i25 = i11 + 2;
                b(new c(14, new C0560f(bArr[i11] & com.google.common.base.c.f116464q, bArr[i11 + 1] & 63)));
                return i25;
            case com.planner5d.library.engine.input.f.b.F1 /* 147 */:
            case com.planner5d.library.engine.input.f.b.G1 /* 148 */:
            case com.planner5d.library.engine.input.f.b.H1 /* 149 */:
            case 150:
            default:
                return i11;
            case 151:
                byte b15 = bArr[i11];
                b bVar4 = new b((b15 & org.msgpack.core.h.a.f339269e) >> 6, (b15 & 48) >> 4, (b15 & com.google.common.base.c.f116461n) >> 2, b15 & 3);
                byte b16 = bArr[i11 + 1];
                int i26 = i11 + 2;
                int i27 = ((b16 & org.msgpack.core.h.a.f339269e) >> 6) | ((bArr[i26] & 128) >> 5);
                b bVar5 = new b(0, (b16 & 48) >> 4, (b16 & com.google.common.base.c.f116461n) >> 2, b16 & 3);
                byte b17 = bArr[i26];
                boolean z12 = (b17 & com.google.common.primitives.t.f119782a) != 0;
                int i28 = (b17 & 48) >> 4;
                int i29 = (b17 & com.google.common.base.c.f116461n) >> 2;
                int i30 = b17 & 3;
                byte b18 = bArr[i11 + 3];
                int i31 = (b18 & 240) >> 4;
                int i32 = (b18 & com.google.common.base.c.f116461n) >> 2;
                int i33 = b18 & 3;
                int i34 = i11 + 4;
                b(new c(15, new h(bVar4, bVar5, i27, z12, i28, i29, i30, i32, i31, i33)));
                return i34;
            case 152:
            case 153:
            case i.f59793p0 /* 154 */:
            case 155:
            case i.f59797r0 /* 156 */:
            case i.f59799s0 /* 157 */:
            case i.f59801t0 /* 158 */:
            case 159:
                int i35 = i10 - 152;
                byte b19 = bArr[i11];
                boolean z13 = (b19 & 32) != 0;
                boolean z14 = (b19 & com.google.common.base.c.f116465r) != 0;
                boolean z15 = (b19 & 8) != 0;
                int i36 = b19 & 7;
                byte b20 = bArr[i11 + 1];
                boolean z16 = (b20 & 128) != 0;
                int i37 = b20 & 127;
                int i38 = bArr[i11 + 2] & 255;
                byte b21 = bArr[i11 + 3];
                int i39 = (b21 & 240) >> 4;
                int i40 = b21 & com.google.common.base.c.f116464q;
                int i41 = bArr[i11 + 4] & 63;
                byte b22 = bArr[i11 + 5];
                int i42 = (b22 & 56) >> 3;
                int i43 = b22 & 7;
                int i44 = i11 + 6;
                b(new c(16, new g(i35, z13, z14, z15, i36, z16, i37, i38, i39, i40, i41, i43, i42)));
                return i44;
        }
    }

    private int f(int i10, int i11) {
        if (i10 < 0 || i10 > 7) {
            if (i10 >= 8 && i10 <= 15) {
                return i11 + 1;
            }
            if (i10 >= 16 && i10 <= 23) {
                return i11 + 2;
            }
            if (i10 >= 24 && i10 <= 31) {
                i11 += 3;
            }
        }
        return i11;
    }

    private int g(int i10, int i11) {
        if (i10 < 128 || i10 > 135) {
            return (i10 < 136 || i10 > 143) ? i11 : i11 + 5;
        }
        return i11 + 4;
    }

    private int h(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = i10 + 1;
        if (i11 >= 0 && i11 <= 31) {
            return f(i11, i12);
        }
        if (i11 >= 128 && i11 <= 159) {
            return g(i11, i12);
        }
        if (i11 >= 32 && i11 <= 127) {
            k(i11);
            return i12;
        }
        if (i11 >= 160 && i11 <= 255) {
            l(i11);
        }
        return i12;
    }

    private void i(int i10) {
        if (i10 == 127) {
            this.f59706a.append(f59689e);
        } else {
            this.f59706a.append((char) i10);
        }
    }

    private void j(int i10) {
        this.f59706a.append((char) i10);
    }

    private void k(int i10) {
    }

    private void l(int i10) {
    }

    private int m(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = i10 + 1;
        if (i11 == 16) {
            return h(bArr, i12);
        }
        if (i11 >= 0 && i11 <= 31) {
            return d(i11, bArr, i12);
        }
        if (i11 >= 128 && i11 <= 159) {
            return e(i11, bArr, i12);
        }
        if (i11 >= 32 && i11 <= 127) {
            i(i11);
            return i12;
        }
        if (i11 >= 160 && i11 <= 255) {
            j(i11);
        }
        return i12;
    }

    public void c(byte[] bArr) {
        int iM = 0;
        while (iM < bArr.length) {
            iM = m(bArr, iM);
        }
        a();
    }
}
