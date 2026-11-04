package androidx.emoji2.text.flatbuffer;

import androidx.collection.g3;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51182h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f51183i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f51184j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51185k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f51186l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f51187m = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f51188n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f51189o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f51190p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f51191q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final /* synthetic */ boolean f51192r = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f51193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f51194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Integer> f51195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, Integer> f51196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Comparator<b> f51199g;

    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b10;
            byte b11;
            int i10 = bVar.f51206e;
            int i11 = bVar2.f51206e;
            do {
                b10 = k.this.f51193a.get(i10);
                b11 = k.this.f51193a.get(i11);
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
            } while (b10 == b11);
            return b10 - b11;
        }
    }

    public k(int i10) {
        this(new androidx.emoji2.text.flatbuffer.a(i10), 1);
    }

    private void A(String str, long j10) {
        this.f51194b.add(b.w(u(str), j10));
    }

    static int E(long j10) {
        if (j10 <= j.C0463j.a((byte) -1)) {
            return 0;
        }
        if (j10 <= j.C0463j.c((short) -1)) {
            return 1;
        }
        return j10 <= j.C0463j.b(-1) ? 2 : 3;
    }

    private void F(b bVar, int i10) {
        int i11 = bVar.f51202a;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                H(bVar.f51204c, i10);
                return;
            } else if (i11 != 26) {
                J(bVar.f51205d, i10);
                return;
            }
        }
        I(bVar.f51205d, i10);
    }

    private b G(int i10, byte[] bArr, int i11, boolean z10) {
        int iE = E(bArr.length);
        I(bArr.length, b(iE));
        int i12 = this.f51193a.i();
        this.f51193a.n(bArr, 0, bArr.length);
        if (z10) {
            this.f51193a.j((byte) 0);
        }
        return b.f(i10, i12, i11, iE);
    }

    private void H(double d10, int i10) {
        if (i10 == 4) {
            this.f51193a.a((float) d10);
        } else if (i10 == 8) {
            this.f51193a.d(d10);
        }
    }

    private void I(long j10, int i10) {
        if (i10 == 1) {
            this.f51193a.j((byte) j10);
            return;
        }
        if (i10 == 2) {
            this.f51193a.e((short) j10);
        } else if (i10 == 4) {
            this.f51193a.b((int) j10);
        } else {
            if (i10 != 8) {
                return;
            }
            this.f51193a.c(j10);
        }
    }

    private void J(long j10, int i10) {
        I((int) (((long) this.f51193a.i()) - j10), i10);
    }

    private b K(int i10, String str) {
        return G(i10, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int b(int i10) {
        int i11 = 1 << i10;
        int iQ = b.q(this.f51193a.i(), i11);
        while (true) {
            int i12 = iQ - 1;
            if (iQ == 0) {
                return i11;
            }
            this.f51193a.j((byte) 0);
            iQ = i12;
        }
    }

    private b c(int i10, int i11) {
        long j10 = i11;
        int iMax = Math.max(0, E(j10));
        int i12 = i10;
        while (i12 < this.f51194b.size()) {
            int i13 = i12 + 1;
            iMax = Math.max(iMax, b.i(4, 0, this.f51194b.get(i12).f51206e, this.f51193a.i(), i13));
            i12 = i13;
        }
        int iB = b(iMax);
        I(j10, iB);
        int i14 = this.f51193a.i();
        while (i10 < this.f51194b.size()) {
            int i15 = this.f51194b.get(i10).f51206e;
            J(this.f51194b.get(i10).f51206e, iB);
            i10++;
        }
        return new b(-1, j.q(4, 0), iMax, i14);
    }

    private b d(int i10, int i11, int i12, boolean z10, boolean z11, b bVar) {
        int i13;
        int iQ;
        int i14 = i12;
        long j10 = i14;
        int iMax = Math.max(0, E(j10));
        if (bVar != null) {
            iMax = Math.max(iMax, bVar.h(this.f51193a.i(), 0));
            i13 = 3;
        } else {
            i13 = 1;
        }
        int i15 = 4;
        int iMax2 = iMax;
        for (int i16 = i11; i16 < this.f51194b.size(); i16++) {
            iMax2 = Math.max(iMax2, this.f51194b.get(i16).h(this.f51193a.i(), i16 + i13));
            if (z10 && i16 == i11) {
                i15 = this.f51194b.get(i16).f51202a;
                if (!j.l(i15)) {
                    throw new j.b("TypedVector does not support this element type");
                }
            }
        }
        int i17 = i11;
        int iB = b(iMax2);
        if (bVar != null) {
            J(bVar.f51205d, iB);
            I(1 << bVar.f51203b, iB);
        }
        if (!z11) {
            I(j10, iB);
        }
        int i18 = this.f51193a.i();
        for (int i19 = i17; i19 < this.f51194b.size(); i19++) {
            F(this.f51194b.get(i19), iB);
        }
        if (!z10) {
            while (i17 < this.f51194b.size()) {
                this.f51193a.j(this.f51194b.get(i17).s(iMax2));
                i17++;
            }
        }
        if (bVar != null) {
            iQ = 9;
        } else if (z10) {
            if (!z11) {
                i14 = 0;
            }
            iQ = j.q(i15, i14);
        } else {
            iQ = 10;
        }
        return new b(i10, iQ, iMax2, i18);
    }

    private int u(String str) {
        if (str == null) {
            return -1;
        }
        int i10 = this.f51193a.i();
        if ((this.f51197e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f51193a.n(bytes, 0, bytes.length);
            this.f51193a.j((byte) 0);
            this.f51195c.put(str, Integer.valueOf(i10));
            return i10;
        }
        Integer num = this.f51195c.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f51193a.n(bytes2, 0, bytes2.length);
        this.f51193a.j((byte) 0);
        this.f51195c.put(str, Integer.valueOf(i10));
        return i10;
    }

    private void z(String str, long j10) {
        b bVarV;
        int iU = u(str);
        int iE = E(j10);
        if (iE == 0) {
            bVarV = b.x(iU, (int) j10);
        } else if (iE == 1) {
            bVarV = b.u(iU, (int) j10);
        } else {
            bVarV = iE == 2 ? b.v(iU, (int) j10) : b.w(iU, j10);
        }
        this.f51194b.add(bVarV);
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.f51194b.size();
    }

    public int D() {
        return this.f51194b.size();
    }

    public int e(String str, int i10) {
        int iU = u(str);
        ArrayList<b> arrayList = this.f51194b;
        Collections.sort(arrayList.subList(i10, arrayList.size()), this.f51199g);
        b bVarD = d(iU, i10, this.f51194b.size() - i10, false, false, c(i10, this.f51194b.size() - i10));
        while (this.f51194b.size() > i10) {
            ArrayList<b> arrayList2 = this.f51194b;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f51194b.add(bVarD);
        return (int) bVarD.f51205d;
    }

    public int f(String str, int i10, boolean z10, boolean z11) {
        b bVarD = d(u(str), i10, this.f51194b.size() - i10, z10, z11, null);
        while (this.f51194b.size() > i10) {
            ArrayList<b> arrayList = this.f51194b;
            arrayList.remove(arrayList.size() - 1);
        }
        this.f51194b.add(bVarD);
        return (int) bVarD.f51205d;
    }

    public ByteBuffer g() {
        int iB = b(this.f51194b.get(0).h(this.f51193a.i(), 0));
        F(this.f51194b.get(0), iB);
        this.f51193a.j(this.f51194b.get(0).r());
        this.f51193a.j((byte) iB);
        this.f51198f = true;
        return ByteBuffer.wrap(this.f51193a.K(), 0, this.f51193a.i());
    }

    public r h() {
        return this.f51193a;
    }

    public int i(String str, byte[] bArr) {
        b bVarG = G(u(str), bArr, 25, false);
        this.f51194b.add(bVarG);
        return (int) bVarG.f51205d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z10) {
        this.f51194b.add(b.g(u(str), z10));
    }

    public void l(boolean z10) {
        k(null, z10);
    }

    public void m(double d10) {
        o(null, d10);
    }

    public void n(float f10) {
        p(null, f10);
    }

    public void o(String str, double d10) {
        this.f51194b.add(b.k(u(str), d10));
    }

    public void p(String str, float f10) {
        this.f51194b.add(b.j(u(str), f10));
    }

    public void q(int i10) {
        s(null, i10);
    }

    public void r(long j10) {
        t(null, j10);
    }

    public void s(String str, int i10) {
        t(str, i10);
    }

    public void t(String str, long j10) {
        int iU = u(str);
        if (-128 <= j10 && j10 <= 127) {
            this.f51194b.add(b.o(iU, (int) j10));
            return;
        }
        if (-32768 <= j10 && j10 <= 32767) {
            this.f51194b.add(b.l(iU, (int) j10));
        } else if (g3.f12261h > j10 || j10 > g3.f12256c) {
            this.f51194b.add(b.n(iU, j10));
        } else {
            this.f51194b.add(b.m(iU, (int) j10));
        }
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int iU = u(str);
        if ((this.f51197e & 2) == 0) {
            b bVarK = K(iU, str2);
            this.f51194b.add(bVarK);
            return (int) bVarK.f51205d;
        }
        Integer num = this.f51196d.get(str2);
        if (num == null) {
            b bVarK2 = K(iU, str2);
            this.f51196d.put(str2, Integer.valueOf((int) bVarK2.f51205d));
            this.f51194b.add(bVarK2);
            return (int) bVarK2.f51205d;
        }
        int i10 = 2 >> 5;
        this.f51194b.add(b.f(iU, num.intValue(), 5, E(str2.length())));
        return num.intValue();
    }

    public void x(int i10) {
        z(null, i10);
    }

    public void y(long j10) {
        z(null, j10);
    }

    public k() {
        this(256);
    }

    @Deprecated
    public k(ByteBuffer byteBuffer, int i10) {
        this(new androidx.emoji2.text.flatbuffer.a(byteBuffer.array()), i10);
    }

    public k(r rVar, int i10) {
        this.f51194b = new ArrayList<>();
        this.f51195c = new HashMap<>();
        this.f51196d = new HashMap<>();
        this.f51198f = false;
        this.f51199g = new a();
        this.f51193a = rVar;
        this.f51197e = i10;
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f51201f = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f51202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f51203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final double f51204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f51205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51206e;

        b(int i10, int i11, int i12, long j10) {
            this.f51206e = i10;
            this.f51202a = i11;
            this.f51203b = i12;
            this.f51205d = j10;
            this.f51204c = Double.MIN_VALUE;
        }

        static b f(int i10, int i11, int i12, int i13) {
            return new b(i10, i12, i13, i11);
        }

        static b g(int i10, boolean z10) {
            return new b(i10, 26, 0, z10 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i10, int i11) {
            return i(this.f51202a, this.f51203b, this.f51205d, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int i(int i10, int i11, long j10, int i12, int i13) {
            if (j.j(i10)) {
                return i11;
            }
            for (int i14 = 1; i14 <= 32; i14 *= 2) {
                int iE = k.E((int) (((long) ((q(i12, i14) + i12) + (i13 * i14))) - j10));
                if ((1 << iE) == i14) {
                    return iE;
                }
            }
            return 3;
        }

        static b j(int i10, float f10) {
            return new b(i10, 3, 2, f10);
        }

        static b k(int i10, double d10) {
            return new b(i10, 3, 3, d10);
        }

        static b l(int i10, int i11) {
            return new b(i10, 1, 1, i11);
        }

        static b m(int i10, int i11) {
            int i12 = 2 << 1;
            return new b(i10, 1, 2, i11);
        }

        static b n(int i10, long j10) {
            return new b(i10, 1, 3, j10);
        }

        static b o(int i10, int i11) {
            return new b(i10, 1, 0, i11);
        }

        private static byte p(int i10, int i11) {
            return (byte) (i10 | (i11 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int q(int i10, int i11) {
            return ((~i10) + 1) & (i11 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte r() {
            return s(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte s(int i10) {
            return p(t(i10), this.f51202a);
        }

        private int t(int i10) {
            return j.j(this.f51202a) ? Math.max(this.f51203b, i10) : this.f51203b;
        }

        static b u(int i10, int i11) {
            return new b(i10, 2, 1, i11);
        }

        static b v(int i10, int i11) {
            return new b(i10, 2, 2, i11);
        }

        static b w(int i10, long j10) {
            return new b(i10, 2, 3, j10);
        }

        static b x(int i10, int i11) {
            return new b(i10, 2, 0, i11);
        }

        b(int i10, int i11, int i12, double d10) {
            this.f51206e = i10;
            this.f51202a = i11;
            this.f51203b = i12;
            this.f51204c = d10;
            this.f51205d = Long.MIN_VALUE;
        }
    }

    public k(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
