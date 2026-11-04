package androidx.media3.common;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.l6;
import com.google.common.collect.x7;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    @androidx.media3.common.util.b1
    public static final int P = 1;

    @androidx.media3.common.util.b1
    public static final int Q = 2;
    public static final int R = -1;

    @androidx.media3.common.util.b1
    public static final long S = Long.MAX_VALUE;

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public final byte[] A;

    @androidx.media3.common.util.b1
    public final int B;

    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public final k C;

    @androidx.media3.common.util.b1
    public final int D;
    public final int E;
    public final int F;

    @androidx.media3.common.util.b1
    public final int G;

    @androidx.media3.common.util.b1
    public final int H;

    @androidx.media3.common.util.b1
    public final int I;

    @androidx.media3.common.util.b1
    public final int J;

    @androidx.media3.common.util.b1
    public final int K;

    @androidx.media3.common.util.b1
    public final int L;

    @androidx.media3.common.util.b1
    public final int M;

    @androidx.media3.common.util.b1
    public final int N;
    private int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f61747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f61748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final List<j0> f61749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f61750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f61751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f61753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f61754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f61755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f61756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f61757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public final r0 f61758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public final Object f61759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f61760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f61761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f61762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f61763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final List<byte[]> f61764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.media3.common.util.b1
    @androidx.annotation.p0
    public final DrmInitData f61765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final long f61766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final boolean f61767u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f61768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f61769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f61770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f61771y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f61772z;
    private static final w T = new b().N();
    private static final String U = androidx.media3.common.util.k1.c1(0);
    private static final String V = androidx.media3.common.util.k1.c1(1);
    private static final String W = androidx.media3.common.util.k1.c1(2);
    private static final String X = androidx.media3.common.util.k1.c1(3);
    private static final String Y = androidx.media3.common.util.k1.c1(4);
    private static final String Z = androidx.media3.common.util.k1.c1(5);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f61721a0 = androidx.media3.common.util.k1.c1(6);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f61722b0 = androidx.media3.common.util.k1.c1(7);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f61723c0 = androidx.media3.common.util.k1.c1(8);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f61724d0 = androidx.media3.common.util.k1.c1(9);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f61725e0 = androidx.media3.common.util.k1.c1(10);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f61726f0 = androidx.media3.common.util.k1.c1(11);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f61727g0 = androidx.media3.common.util.k1.c1(12);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f61728h0 = androidx.media3.common.util.k1.c1(13);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f61729i0 = androidx.media3.common.util.k1.c1(14);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f61730j0 = androidx.media3.common.util.k1.c1(15);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f61731k0 = androidx.media3.common.util.k1.c1(16);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f61732l0 = androidx.media3.common.util.k1.c1(17);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f61733m0 = androidx.media3.common.util.k1.c1(18);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f61734n0 = androidx.media3.common.util.k1.c1(19);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f61735o0 = androidx.media3.common.util.k1.c1(20);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f61736p0 = androidx.media3.common.util.k1.c1(21);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String f61737q0 = androidx.media3.common.util.k1.c1(22);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f61738r0 = androidx.media3.common.util.k1.c1(23);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f61739s0 = androidx.media3.common.util.k1.c1(24);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final String f61740t0 = androidx.media3.common.util.k1.c1(25);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final String f61741u0 = androidx.media3.common.util.k1.c1(26);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f61742v0 = androidx.media3.common.util.k1.c1(27);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f61743w0 = androidx.media3.common.util.k1.c1(28);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final String f61744x0 = androidx.media3.common.util.k1.c1(29);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final String f61745y0 = androidx.media3.common.util.k1.c1(30);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f61746z0 = androidx.media3.common.util.k1.c1(31);
    private static final String A0 = androidx.media3.common.util.k1.c1(32);
    private static final String B0 = androidx.media3.common.util.k1.c1(33);
    private static final String C0 = androidx.media3.common.util.k1.c1(34);

    @androidx.media3.common.util.b1
    public static final class b {
        private int A;

        @androidx.annotation.p0
        private k B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;
        private int H;
        private int I;

        @androidx.media3.common.util.b1
        private int J;
        private int K;
        private int L;
        private int M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private String f61773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private String f61774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<j0> f61775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private String f61776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f61777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f61778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f61779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f61780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f61781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private String f61782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        private r0 f61783k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f61784l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.p0
        private String f61785m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @androidx.annotation.p0
        private String f61786n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f61787o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f61788p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @androidx.annotation.p0
        private List<byte[]> f61789q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @androidx.annotation.p0
        private DrmInitData f61790r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private long f61791s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f61792t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f61793u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f61794v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private float f61795w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f61796x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f61797y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f61798z;

        @z7.a
        public b A0(int i10) {
            this.L = i10;
            return this;
        }

        @z7.a
        public b B0(int i10) {
            this.f61793u = i10;
            return this;
        }

        public w N() {
            return new w(this);
        }

        @z7.a
        public b O(int i10) {
            this.I = i10;
            return this;
        }

        @z7.a
        public b P(int i10) {
            this.f61779g = i10;
            return this;
        }

        @z7.a
        public b Q(int i10) {
            this.f61780h = i10;
            return this;
        }

        @z7.a
        public b R(int i10) {
            this.D = i10;
            return this;
        }

        @z7.a
        public b S(@androidx.annotation.p0 String str) {
            this.f61782j = str;
            return this;
        }

        @z7.a
        public b T(@androidx.annotation.p0 k kVar) {
            this.B = kVar;
            return this;
        }

        @z7.a
        public b U(@androidx.annotation.p0 String str) {
            this.f61785m = s0.w(str);
            return this;
        }

        @z7.a
        public b V(int i10) {
            this.M = i10;
            return this;
        }

        @z7.a
        public b W(int i10) {
            this.J = i10;
            return this;
        }

        @androidx.media3.common.util.b1
        @z7.a
        public b X(@androidx.annotation.p0 Object obj) {
            this.f61784l = obj;
            return this;
        }

        @z7.a
        public b Y(@androidx.annotation.p0 DrmInitData drmInitData) {
            this.f61790r = drmInitData;
            return this;
        }

        @z7.a
        public b Z(int i10) {
            this.G = i10;
            return this;
        }

        @z7.a
        public b a0(int i10) {
            this.H = i10;
            return this;
        }

        @z7.a
        public b b0(float f10) {
            this.f61795w = f10;
            return this;
        }

        @z7.a
        public b c0(boolean z10) {
            this.f61792t = z10;
            return this;
        }

        @z7.a
        public b d0(int i10) {
            this.f61794v = i10;
            return this;
        }

        @z7.a
        public b e0(int i10) {
            this.f61773a = Integer.toString(i10);
            return this;
        }

        @z7.a
        public b f0(@androidx.annotation.p0 String str) {
            this.f61773a = str;
            return this;
        }

        @z7.a
        public b g0(@androidx.annotation.p0 List<byte[]> list) {
            this.f61789q = list;
            return this;
        }

        @z7.a
        public b h0(@androidx.annotation.p0 String str) {
            this.f61774b = str;
            return this;
        }

        @z7.a
        public b i0(List<j0> list) {
            this.f61775c = l6.w(list);
            return this;
        }

        @z7.a
        public b j0(@androidx.annotation.p0 String str) {
            this.f61776d = str;
            return this;
        }

        @z7.a
        public b k0(int i10) {
            this.f61787o = i10;
            return this;
        }

        @z7.a
        public b l0(int i10) {
            this.f61788p = i10;
            return this;
        }

        @z7.a
        public b m0(int i10) {
            this.C = i10;
            return this;
        }

        @z7.a
        public b n0(@androidx.annotation.p0 r0 r0Var) {
            this.f61783k = r0Var;
            return this;
        }

        @z7.a
        public b o0(int i10) {
            this.F = i10;
            return this;
        }

        @z7.a
        public b p0(int i10) {
            this.f61781i = i10;
            return this;
        }

        @z7.a
        public b q0(float f10) {
            this.f61797y = f10;
            return this;
        }

        @z7.a
        public b r0(@androidx.annotation.p0 byte[] bArr) {
            this.f61798z = bArr;
            return this;
        }

        @z7.a
        public b s0(int i10) {
            this.f61778f = i10;
            return this;
        }

        @z7.a
        public b t0(int i10) {
            this.f61796x = i10;
            return this;
        }

        @z7.a
        public b u0(@androidx.annotation.p0 String str) {
            this.f61786n = s0.w(str);
            return this;
        }

        @z7.a
        public b v0(int i10) {
            this.E = i10;
            return this;
        }

        @z7.a
        public b w0(int i10) {
            this.f61777e = i10;
            return this;
        }

        @z7.a
        public b x0(int i10) {
            this.A = i10;
            return this;
        }

        @z7.a
        public b y0(long j10) {
            this.f61791s = j10;
            return this;
        }

        @z7.a
        public b z0(int i10) {
            this.K = i10;
            return this;
        }

        public b() {
            this.f61775c = l6.F();
            this.f61780h = -1;
            this.f61781i = -1;
            this.f61787o = -1;
            this.f61788p = -1;
            this.f61791s = Long.MAX_VALUE;
            this.f61793u = -1;
            this.f61794v = -1;
            this.f61795w = -1.0f;
            this.f61797y = 1.0f;
            this.A = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.I = -1;
            this.J = 1;
            this.K = -1;
            this.L = -1;
            this.M = 0;
            this.f61779g = 0;
        }

        private b(w wVar) {
            this.f61773a = wVar.f61747a;
            this.f61774b = wVar.f61748b;
            this.f61775c = wVar.f61749c;
            this.f61776d = wVar.f61750d;
            this.f61777e = wVar.f61751e;
            this.f61778f = wVar.f61752f;
            this.f61780h = wVar.f61754h;
            this.f61781i = wVar.f61755i;
            this.f61782j = wVar.f61757k;
            this.f61783k = wVar.f61758l;
            this.f61784l = wVar.f61759m;
            this.f61785m = wVar.f61760n;
            this.f61786n = wVar.f61761o;
            this.f61787o = wVar.f61762p;
            this.f61788p = wVar.f61763q;
            this.f61789q = wVar.f61764r;
            this.f61790r = wVar.f61765s;
            this.f61791s = wVar.f61766t;
            this.f61792t = wVar.f61767u;
            this.f61793u = wVar.f61768v;
            this.f61794v = wVar.f61769w;
            this.f61795w = wVar.f61770x;
            this.f61796x = wVar.f61771y;
            this.f61797y = wVar.f61772z;
            this.f61798z = wVar.A;
            this.A = wVar.B;
            this.B = wVar.C;
            this.C = wVar.D;
            this.D = wVar.E;
            this.E = wVar.F;
            this.F = wVar.G;
            this.G = wVar.H;
            this.H = wVar.I;
            this.I = wVar.J;
            this.J = wVar.K;
            this.K = wVar.L;
            this.L = wVar.M;
            this.M = wVar.N;
        }
    }

    @androidx.media3.common.util.b1
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static /* synthetic */ String a(j0 j0Var) {
        return j0Var.f60783a + ": " + j0Var.f60784b;
    }

    @androidx.annotation.p0
    private static <T> T d(@androidx.annotation.p0 T t10, @androidx.annotation.p0 T t11) {
        return t10 != null ? t10 : t11;
    }

    @androidx.media3.common.util.b1
    public static w e(Bundle bundle) {
        b bVar = new b();
        androidx.media3.common.util.i.c(bundle);
        String string = bundle.getString(U);
        w wVar = T;
        bVar.f0((String) d(string, wVar.f61747a)).h0((String) d(bundle.getString(V), wVar.f61748b));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0);
        bVar.i0(parcelableArrayList == null ? l6.F() : androidx.media3.common.util.i.d(new com.google.common.base.t() { // from class: androidx.media3.common.u
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return j0.a((Bundle) obj);
            }
        }, parcelableArrayList)).j0((String) d(bundle.getString(W), wVar.f61750d)).w0(bundle.getInt(X, wVar.f61751e)).s0(bundle.getInt(Y, wVar.f61752f)).P(bundle.getInt(B0, wVar.f61753g)).Q(bundle.getInt(Z, wVar.f61754h)).p0(bundle.getInt(f61721a0, wVar.f61755i)).S((String) d(bundle.getString(f61722b0), wVar.f61757k)).U((String) d(bundle.getString(f61724d0), wVar.f61760n)).u0((String) d(bundle.getString(f61725e0), wVar.f61761o)).k0(bundle.getInt(f61726f0, wVar.f61762p));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(j(i10));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        b bVarY = bVar.g0(arrayList).Y((DrmInitData) bundle.getParcelable(f61728h0));
        String str = f61729i0;
        w wVar2 = T;
        bVarY.y0(bundle.getLong(str, wVar2.f61766t)).B0(bundle.getInt(f61730j0, wVar2.f61768v)).d0(bundle.getInt(f61731k0, wVar2.f61769w)).b0(bundle.getFloat(f61732l0, wVar2.f61770x)).t0(bundle.getInt(f61733m0, wVar2.f61771y)).q0(bundle.getFloat(f61734n0, wVar2.f61772z)).r0(bundle.getByteArray(f61735o0)).x0(bundle.getInt(f61736p0, wVar2.B)).m0(bundle.getInt(C0, wVar2.D));
        Bundle bundle2 = bundle.getBundle(f61737q0);
        if (bundle2 != null) {
            bVar.T(k.i(bundle2));
        }
        bVar.R(bundle.getInt(f61738r0, wVar2.E)).v0(bundle.getInt(f61739s0, wVar2.F)).o0(bundle.getInt(f61740t0, wVar2.G)).Z(bundle.getInt(f61741u0, wVar2.H)).a0(bundle.getInt(f61742v0, wVar2.I)).O(bundle.getInt(f61743w0, wVar2.J)).z0(bundle.getInt(f61745y0, wVar2.L)).A0(bundle.getInt(f61746z0, wVar2.M)).V(bundle.getInt(f61744x0, wVar2.N));
        return bVar.N();
    }

    private static String f(List<j0> list, @androidx.annotation.p0 String str) {
        for (j0 j0Var : list) {
            if (TextUtils.equals(j0Var.f60783a, str)) {
                return j0Var.f60784b;
            }
        }
        return list.get(0).f60784b;
    }

    private static boolean i(b bVar) {
        if (bVar.f61775c.isEmpty() && bVar.f61774b == null) {
            return true;
        }
        for (int i10 = 0; i10 < bVar.f61775c.size(); i10++) {
            if (((j0) bVar.f61775c.get(i10)).f60784b.equals(bVar.f61774b)) {
                return true;
            }
        }
        return false;
    }

    private static String j(int i10) {
        return f61727g0 + "_" + Integer.toString(i10, 36);
    }

    @androidx.media3.common.util.b1
    public static String l(@androidx.annotation.p0 w wVar) {
        if (wVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        com.google.common.base.a0 a0VarO = com.google.common.base.a0.o(AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(wVar.f61747a);
        sb2.append(", mimeType=");
        sb2.append(wVar.f61761o);
        if (wVar.f61760n != null) {
            sb2.append(", container=");
            sb2.append(wVar.f61760n);
        }
        if (wVar.f61756j != -1) {
            sb2.append(", bitrate=");
            sb2.append(wVar.f61756j);
        }
        if (wVar.f61757k != null) {
            sb2.append(", codecs=");
            sb2.append(wVar.f61757k);
        }
        if (wVar.f61765s != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                DrmInitData drmInitData = wVar.f61765s;
                if (i10 >= drmInitData.f60268d) {
                    break;
                }
                UUID uuid = drmInitData.f(i10).f60270b;
                if (uuid.equals(j.f60709l2)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(j.f60714m2)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(j.f60724o2)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(j.f60719n2)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(j.f60704k2)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i10++;
            }
            sb2.append(", drm=[");
            a0VarO.f(sb2, linkedHashSet);
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        if (wVar.f61768v != -1 && wVar.f61769w != -1) {
            sb2.append(", res=");
            sb2.append(wVar.f61768v);
            sb2.append("x");
            sb2.append(wVar.f61769w);
        }
        if (!com.google.common.math.c.d(wVar.f61772z, 1.0d, 0.001d)) {
            sb2.append(", par=");
            sb2.append(androidx.media3.common.util.k1.S("%.3f", Float.valueOf(wVar.f61772z)));
        }
        k kVar = wVar.C;
        if (kVar != null && kVar.n()) {
            sb2.append(", color=");
            sb2.append(wVar.C.s());
        }
        if (wVar.f61770x != -1.0f) {
            sb2.append(", fps=");
            sb2.append(wVar.f61770x);
        }
        if (wVar.D != -1) {
            sb2.append(", maxSubLayers=");
            sb2.append(wVar.D);
        }
        if (wVar.E != -1) {
            sb2.append(", channels=");
            sb2.append(wVar.E);
        }
        if (wVar.F != -1) {
            sb2.append(", sample_rate=");
            sb2.append(wVar.F);
        }
        if (wVar.f61750d != null) {
            sb2.append(", language=");
            sb2.append(wVar.f61750d);
        }
        if (!wVar.f61749c.isEmpty()) {
            sb2.append(", labels=[");
            a0VarO.f(sb2, x7.D(wVar.f61749c, new com.google.common.base.t() { // from class: androidx.media3.common.v
                @Override // com.google.common.base.t
                public final Object apply(Object obj) {
                    return w.a((j0) obj);
                }
            }));
            sb2.append("]");
        }
        if (wVar.f61751e != 0) {
            sb2.append(", selectionFlags=[");
            a0VarO.f(sb2, androidx.media3.common.util.k1.H0(wVar.f61751e));
            sb2.append("]");
        }
        if (wVar.f61752f != 0) {
            sb2.append(", roleFlags=[");
            a0VarO.f(sb2, androidx.media3.common.util.k1.G0(wVar.f61752f));
            sb2.append("]");
        }
        if (wVar.f61759m != null) {
            sb2.append(", customData=");
            sb2.append(wVar.f61759m);
        }
        if ((wVar.f61752f & 32768) != 0) {
            sb2.append(", auxiliaryTrackType=");
            sb2.append(androidx.media3.common.util.k1.c0(wVar.f61753g));
        }
        return sb2.toString();
    }

    @androidx.media3.common.util.b1
    public b b() {
        return new b();
    }

    @androidx.media3.common.util.b1
    public w c(int i10) {
        return b().V(i10).N();
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            int i11 = this.O;
            if (i11 != 0 && (i10 = wVar.O) != 0 && i11 != i10) {
                return false;
            }
            if (this.f61751e == wVar.f61751e && this.f61752f == wVar.f61752f && this.f61753g == wVar.f61753g && this.f61754h == wVar.f61754h && this.f61755i == wVar.f61755i && this.f61762p == wVar.f61762p && this.f61766t == wVar.f61766t && this.f61768v == wVar.f61768v && this.f61769w == wVar.f61769w && this.f61771y == wVar.f61771y && this.B == wVar.B && this.D == wVar.D && this.E == wVar.E && this.F == wVar.F && this.G == wVar.G && this.H == wVar.H && this.I == wVar.I && this.J == wVar.J && this.L == wVar.L && this.M == wVar.M && this.N == wVar.N && Float.compare(this.f61770x, wVar.f61770x) == 0 && Float.compare(this.f61772z, wVar.f61772z) == 0 && Objects.equals(this.f61747a, wVar.f61747a) && Objects.equals(this.f61748b, wVar.f61748b) && this.f61749c.equals(wVar.f61749c) && Objects.equals(this.f61757k, wVar.f61757k) && Objects.equals(this.f61760n, wVar.f61760n) && Objects.equals(this.f61761o, wVar.f61761o) && Objects.equals(this.f61750d, wVar.f61750d) && Arrays.equals(this.A, wVar.A) && Objects.equals(this.f61758l, wVar.f61758l) && Objects.equals(this.C, wVar.C) && Objects.equals(this.f61765s, wVar.f61765s) && h(wVar) && Objects.equals(this.f61759m, wVar.f61759m)) {
                return true;
            }
        }
        return false;
    }

    @androidx.media3.common.util.b1
    public int g() {
        int i10;
        int i11 = this.f61768v;
        if (i11 != -1 && (i10 = this.f61769w) != -1) {
            return i11 * i10;
        }
        return -1;
    }

    @androidx.media3.common.util.b1
    public boolean h(w wVar) {
        if (this.f61764r.size() != wVar.f61764r.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f61764r.size(); i10++) {
            if (!Arrays.equals(this.f61764r.get(i10), wVar.f61764r.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.O == 0) {
            String str = this.f61747a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f61748b;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f61749c.hashCode()) * 31;
            String str3 = this.f61750d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f61751e) * 31) + this.f61752f) * 31) + this.f61753g) * 31) + this.f61754h) * 31) + this.f61755i) * 31;
            String str4 = this.f61757k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            r0 r0Var = this.f61758l;
            int iHashCode5 = (iHashCode4 + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
            Object obj = this.f61759m;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f61760n;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f61761o;
            this.O = ((((((((((((((((((((((((((((((((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f61762p) * 31) + ((int) this.f61766t)) * 31) + this.f61768v) * 31) + this.f61769w) * 31) + Float.floatToIntBits(this.f61770x)) * 31) + this.f61771y) * 31) + Float.floatToIntBits(this.f61772z)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.L) * 31) + this.M) * 31) + this.N;
        }
        return this.O;
    }

    @androidx.media3.common.util.b1
    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString(U, this.f61747a);
        bundle.putString(V, this.f61748b);
        bundle.putParcelableArrayList(A0, androidx.media3.common.util.i.i(this.f61749c, new com.google.common.base.t() { // from class: androidx.media3.common.t
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return ((j0) obj).b();
            }
        }));
        bundle.putString(W, this.f61750d);
        bundle.putInt(X, this.f61751e);
        bundle.putInt(Y, this.f61752f);
        int i10 = this.f61753g;
        if (i10 != T.f61753g) {
            bundle.putInt(B0, i10);
        }
        bundle.putInt(Z, this.f61754h);
        bundle.putInt(f61721a0, this.f61755i);
        bundle.putString(f61722b0, this.f61757k);
        bundle.putString(f61724d0, this.f61760n);
        bundle.putString(f61725e0, this.f61761o);
        bundle.putInt(f61726f0, this.f61762p);
        for (int i11 = 0; i11 < this.f61764r.size(); i11++) {
            bundle.putByteArray(j(i11), this.f61764r.get(i11));
        }
        bundle.putParcelable(f61728h0, this.f61765s);
        bundle.putLong(f61729i0, this.f61766t);
        bundle.putInt(f61730j0, this.f61768v);
        bundle.putInt(f61731k0, this.f61769w);
        bundle.putFloat(f61732l0, this.f61770x);
        bundle.putInt(f61733m0, this.f61771y);
        bundle.putFloat(f61734n0, this.f61772z);
        bundle.putByteArray(f61735o0, this.A);
        bundle.putInt(f61736p0, this.B);
        k kVar = this.C;
        if (kVar != null) {
            bundle.putBundle(f61737q0, kVar.r());
        }
        bundle.putInt(C0, this.D);
        bundle.putInt(f61738r0, this.E);
        bundle.putInt(f61739s0, this.F);
        bundle.putInt(f61740t0, this.G);
        bundle.putInt(f61741u0, this.H);
        bundle.putInt(f61742v0, this.I);
        bundle.putInt(f61743w0, this.J);
        bundle.putInt(f61745y0, this.L);
        bundle.putInt(f61746z0, this.M);
        bundle.putInt(f61744x0, this.N);
        return bundle;
    }

    @androidx.media3.common.util.b1
    public w m(w wVar) {
        String str;
        if (this == wVar) {
            return this;
        }
        int iM = s0.m(this.f61761o);
        String str2 = wVar.f61747a;
        int i10 = wVar.L;
        int i11 = wVar.M;
        String str3 = wVar.f61748b;
        if (str3 == null) {
            str3 = this.f61748b;
        }
        List<j0> list = !wVar.f61749c.isEmpty() ? wVar.f61749c : this.f61749c;
        String str4 = this.f61750d;
        if ((iM == 3 || iM == 1) && (str = wVar.f61750d) != null) {
            str4 = str;
        }
        int i12 = this.f61754h;
        if (i12 == -1) {
            i12 = wVar.f61754h;
        }
        int i13 = this.f61755i;
        if (i13 == -1) {
            i13 = wVar.f61755i;
        }
        String str5 = this.f61757k;
        if (str5 == null) {
            String strI0 = androidx.media3.common.util.k1.i0(wVar.f61757k, iM);
            if (androidx.media3.common.util.k1.n2(strI0).length == 1) {
                str5 = strI0;
            }
        }
        r0 r0Var = this.f61758l;
        r0 r0VarB = r0Var == null ? wVar.f61758l : r0Var.b(wVar.f61758l);
        float f10 = this.f61770x;
        if (f10 == -1.0f && iM == 2) {
            f10 = wVar.f61770x;
        }
        return b().f0(str2).h0(str3).i0(list).j0(str4).w0(this.f61751e | wVar.f61751e).s0(this.f61752f | wVar.f61752f).Q(i12).p0(i13).S(str5).n0(r0VarB).Y(DrmInitData.e(wVar.f61765s, this.f61765s)).b0(f10).z0(i10).A0(i11).N();
    }

    public String toString() {
        return "Format(" + this.f61747a + ", " + this.f61748b + ", " + this.f61760n + ", " + this.f61761o + ", " + this.f61757k + ", " + this.f61756j + ", " + this.f61750d + ", [" + this.f61768v + ", " + this.f61769w + ", " + this.f61770x + ", " + this.C + "], [" + this.E + ", " + this.F + "])";
    }

    private w(b bVar) {
        this.f61747a = bVar.f61773a;
        String strG1 = androidx.media3.common.util.k1.G1(bVar.f61776d);
        this.f61750d = strG1;
        if (bVar.f61775c.isEmpty() && bVar.f61774b != null) {
            this.f61749c = l6.G(new j0(strG1, bVar.f61774b));
            this.f61748b = bVar.f61774b;
        } else if (bVar.f61775c.isEmpty() || bVar.f61774b != null) {
            androidx.media3.common.util.a.i(i(bVar));
            this.f61749c = bVar.f61775c;
            this.f61748b = bVar.f61774b;
        } else {
            this.f61749c = bVar.f61775c;
            this.f61748b = f(bVar.f61775c, strG1);
        }
        this.f61751e = bVar.f61777e;
        int i10 = 0;
        androidx.media3.common.util.a.j(bVar.f61779g == 0 || (bVar.f61778f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f61752f = bVar.f61778f;
        this.f61753g = bVar.f61779g;
        int i11 = bVar.f61780h;
        this.f61754h = i11;
        int i12 = bVar.f61781i;
        this.f61755i = i12;
        this.f61756j = i12 != -1 ? i12 : i11;
        this.f61757k = bVar.f61782j;
        this.f61758l = bVar.f61783k;
        this.f61759m = bVar.f61784l;
        this.f61760n = bVar.f61785m;
        this.f61761o = bVar.f61786n;
        this.f61762p = bVar.f61787o;
        this.f61763q = bVar.f61788p;
        this.f61764r = bVar.f61789q == null ? Collections.EMPTY_LIST : bVar.f61789q;
        DrmInitData drmInitData = bVar.f61790r;
        this.f61765s = drmInitData;
        this.f61766t = bVar.f61791s;
        this.f61767u = bVar.f61792t;
        this.f61768v = bVar.f61793u;
        this.f61769w = bVar.f61794v;
        this.f61770x = bVar.f61795w;
        this.f61771y = bVar.f61796x == -1 ? 0 : bVar.f61796x;
        this.f61772z = bVar.f61797y == -1.0f ? 1.0f : bVar.f61797y;
        this.A = bVar.f61798z;
        this.B = bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        this.G = bVar.F;
        this.H = bVar.G == -1 ? 0 : bVar.G;
        if (bVar.H != -1) {
            i10 = bVar.H;
        }
        this.I = i10;
        this.J = bVar.I;
        this.K = bVar.J;
        this.L = bVar.K;
        this.M = bVar.L;
        if (bVar.M != 0 || drmInitData == null) {
            this.N = bVar.M;
        } else {
            this.N = 1;
        }
    }
}
