package androidx.emoji2.text.flatbuffer;

import com.rabbitmq.client.k0;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.e2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static final int A = 26;
    public static final int B = 36;
    private static final q C = new androidx.emoji2.text.flatbuffer.a(new byte[]{0}, 1);
    static final /* synthetic */ boolean D = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51138a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f51139b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f51140c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51141d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51142e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f51143f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51144g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51145h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f51146i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f51147j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51148k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f51149l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f51150m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f51151n = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f51152o = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f51153p = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f51154q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f51155r = 17;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f51156s = 18;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f51157t = 19;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f51158u = 20;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f51159v = 21;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f51160w = 22;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f51161x = 23;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f51162y = 24;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f51163z = 25;

    public static class a extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final a f51164e = new a(j.C, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f51165f = false;

        a(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
        }

        public static a d() {
            return f51164e;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f51169a.l(this.f51170b, b()));
            sb2.append('\"');
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public ByteBuffer c() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f51169a.K());
            byteBufferWrap.position(this.f51170b);
            byteBufferWrap.limit(this.f51170b + b());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i10) {
            return this.f51169a.get(this.f51170b + i10);
        }

        public byte[] f() {
            int iB = b();
            byte[] bArr = new byte[iB];
            for (int i10 = 0; i10 < iB; i10++) {
                bArr[i10] = this.f51169a.get(this.f51170b + i10);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.f
        public String toString() {
            return this.f51169a.l(this.f51170b, b());
        }
    }

    public static class b extends RuntimeException {
        b(String str) {
            super(str);
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f51166d = new c(j.C, 0, 0);

        c(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
        }

        public static c d() {
            return f51166d;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        int c(byte[] bArr) {
            byte b10;
            byte b11;
            int i10 = this.f51170b;
            int i11 = 0;
            do {
                b10 = this.f51169a.get(i10);
                b11 = bArr[i11];
                if (b10 == 0) {
                    return b10 - b11;
                }
                i10++;
                i11++;
                if (i11 == bArr.length) {
                    return b10 - b11;
                }
            } while (b10 == b11);
            return b10 - b11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f51170b == this.f51170b && cVar.f51171c == this.f51171c;
        }

        public int hashCode() {
            return this.f51171c ^ this.f51170b;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.f
        public String toString() {
            int i10 = this.f51170b;
            while (this.f51169a.get(i10) != 0) {
                i10++;
            }
            int i11 = this.f51170b;
            return this.f51169a.l(i11, i10 - i11);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f51167a;

        d(i iVar) {
            this.f51167a = iVar;
        }

        public c a(int i10) {
            if (i10 >= b()) {
                return c.f51166d;
            }
            i iVar = this.f51167a;
            int i11 = iVar.f51170b + (i10 * iVar.f51171c);
            i iVar2 = this.f51167a;
            q qVar = iVar2.f51169a;
            int i12 = 3 ^ 1;
            return new c(qVar, j.i(qVar, i11, iVar2.f51171c), 1);
        }

        public int b() {
            return this.f51167a.b();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (int i10 = 0; i10 < this.f51167a.b(); i10++) {
                this.f51167a.d(i10).z(sb2);
                if (i10 != this.f51167a.b() - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class e extends k {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final e f51168f = new e(j.C, 1, 1);

        e(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
        }

        private int f(d dVar, byte[] bArr) {
            int iB = dVar.b() - 1;
            int i10 = 0;
            while (i10 <= iB) {
                int i11 = (i10 + iB) >>> 1;
                int iC = dVar.a(i11).c(bArr);
                if (iC < 0) {
                    i10 = i11 + 1;
                } else {
                    if (iC <= 0) {
                        return i11;
                    }
                    iB = i11 - 1;
                }
            }
            return -(i10 + 1);
        }

        public static e g() {
            return f51168f;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.k, androidx.emoji2.text.flatbuffer.j.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("{ ");
            d dVarJ = j();
            int iB = b();
            k kVarK = k();
            for (int i10 = 0; i10 < iB; i10++) {
                sb2.append('\"');
                sb2.append(dVarJ.a(i10).toString());
                sb2.append("\" : ");
                sb2.append(kVarK.d(i10).toString());
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public g h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public g i(byte[] bArr) {
            d dVarJ = j();
            int iB = dVarJ.b();
            int iF = f(dVarJ, bArr);
            return (iF < 0 || iF >= iB) ? g.f51172f : d(iF);
        }

        public d j() {
            int i10 = this.f51170b - (this.f51171c * 3);
            q qVar = this.f51169a;
            int i11 = j.i(qVar, i10, this.f51171c);
            q qVar2 = this.f51169a;
            int i12 = this.f51171c;
            return new d(new i(qVar, i11, j.n(qVar2, i10 + i12, i12), 4));
        }

        public k k() {
            return new k(this.f51169a, this.f51170b, this.f51171c);
        }
    }

    private static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        q f51169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f51170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f51171c;

        f(q qVar, int i10, int i11) {
            this.f51169a = qVar;
            this.f51170b = i10;
            this.f51171c = i11;
        }

        public abstract StringBuilder a(StringBuilder sb2);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final g f51172f = new g(j.C, 0, 1, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f51173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51177e;

        static {
            int i10 = 5 & 1;
        }

        g(q qVar, int i10, int i11, int i12) {
            this(qVar, i10, i11, 1 << (i12 & 3), i12 >> 2);
        }

        public a b() {
            if (!m() && !v()) {
                return a.d();
            }
            q qVar = this.f51173a;
            return new a(qVar, j.i(qVar, this.f51174b, this.f51175c), this.f51176d);
        }

        public boolean c() {
            if (n()) {
                return this.f51173a.get(this.f51174b) != 0;
            }
            return j() != 0;
        }

        public double d() {
            int i10 = this.f51177e;
            if (i10 == 3) {
                return j.m(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 1) {
                return j.n(this.f51173a, this.f51174b, this.f51175c);
            }
            int i11 = 4 & 2;
            if (i10 != 2) {
                if (i10 == 5) {
                    return Double.parseDouble(i());
                }
                if (i10 == 6) {
                    q qVar = this.f51173a;
                    return j.n(qVar, j.i(qVar, this.f51174b, this.f51175c), this.f51176d);
                }
                if (i10 == 7) {
                    q qVar2 = this.f51173a;
                    return j.p(qVar2, j.i(qVar2, this.f51174b, this.f51175c), this.f51176d);
                }
                if (i10 == 8) {
                    q qVar3 = this.f51173a;
                    return j.m(qVar3, j.i(qVar3, this.f51174b, this.f51175c), this.f51176d);
                }
                if (i10 == 10) {
                    return k().b();
                }
                if (i10 != 26) {
                    return 0.0d;
                }
            }
            return j.p(this.f51173a, this.f51174b, this.f51175c);
        }

        public int e() {
            int i10 = this.f51177e;
            if (i10 == 1) {
                return j.n(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 2) {
                return (int) j.p(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 3) {
                return (int) j.m(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 5) {
                return Integer.parseInt(i());
            }
            if (i10 == 6) {
                q qVar = this.f51173a;
                return j.n(qVar, j.i(qVar, this.f51174b, this.f51175c), this.f51176d);
            }
            if (i10 == 7) {
                q qVar2 = this.f51173a;
                return (int) j.p(qVar2, j.i(qVar2, this.f51174b, this.f51175c), this.f51175c);
            }
            if (i10 == 8) {
                q qVar3 = this.f51173a;
                return (int) j.m(qVar3, j.i(qVar3, this.f51174b, this.f51175c), this.f51176d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0;
            }
            return j.n(this.f51173a, this.f51174b, this.f51175c);
        }

        public c f() {
            if (!r()) {
                return c.d();
            }
            q qVar = this.f51173a;
            return new c(qVar, j.i(qVar, this.f51174b, this.f51175c), this.f51176d);
        }

        public long g() {
            int i10 = this.f51177e;
            if (i10 == 1) {
                return j.o(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 2) {
                return j.p(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 3) {
                return (long) j.m(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 5) {
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i10 == 6) {
                q qVar = this.f51173a;
                return j.o(qVar, j.i(qVar, this.f51174b, this.f51175c), this.f51176d);
            }
            if (i10 == 7) {
                q qVar2 = this.f51173a;
                return j.p(qVar2, j.i(qVar2, this.f51174b, this.f51175c), this.f51175c);
            }
            if (i10 == 8) {
                q qVar3 = this.f51173a;
                return (long) j.m(qVar3, j.i(qVar3, this.f51174b, this.f51175c), this.f51176d);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 != 26) {
                return 0L;
            }
            return j.n(this.f51173a, this.f51174b, this.f51175c);
        }

        public e h() {
            if (!s()) {
                return e.g();
            }
            q qVar = this.f51173a;
            return new e(qVar, j.i(qVar, this.f51174b, this.f51175c), this.f51176d);
        }

        public String i() {
            if (v()) {
                int i10 = j.i(this.f51173a, this.f51174b, this.f51175c);
                q qVar = this.f51173a;
                int i11 = this.f51176d;
                return this.f51173a.l(i10, (int) j.p(qVar, i10 - i11, i11));
            }
            if (!r()) {
                return "";
            }
            int i12 = j.i(this.f51173a, this.f51174b, this.f51176d);
            int i13 = i12;
            while (this.f51173a.get(i13) != 0) {
                i13++;
            }
            return this.f51173a.l(i12, i13 - i12);
        }

        public long j() {
            int i10 = this.f51177e;
            if (i10 == 2) {
                return j.p(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 1) {
                return j.o(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 3) {
                return (long) j.m(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 10) {
                return k().b();
            }
            if (i10 == 26) {
                return j.n(this.f51173a, this.f51174b, this.f51175c);
            }
            if (i10 == 5) {
                return Long.parseLong(i());
            }
            if (i10 == 6) {
                q qVar = this.f51173a;
                return j.o(qVar, j.i(qVar, this.f51174b, this.f51175c), this.f51176d);
            }
            if (i10 == 7) {
                q qVar2 = this.f51173a;
                return j.p(qVar2, j.i(qVar2, this.f51174b, this.f51175c), this.f51176d);
            }
            if (i10 != 8) {
                return 0L;
            }
            q qVar3 = this.f51173a;
            return (long) j.m(qVar3, j.i(qVar3, this.f51174b, this.f51175c), this.f51175c);
        }

        public k k() {
            if (y()) {
                q qVar = this.f51173a;
                return new k(qVar, j.i(qVar, this.f51174b, this.f51175c), this.f51176d);
            }
            int i10 = this.f51177e;
            if (i10 == 15) {
                q qVar2 = this.f51173a;
                return new i(qVar2, j.i(qVar2, this.f51174b, this.f51175c), this.f51176d, 4);
            }
            if (!j.k(i10)) {
                return k.c();
            }
            q qVar3 = this.f51173a;
            return new i(qVar3, j.i(qVar3, this.f51174b, this.f51175c), this.f51176d, j.r(this.f51177e));
        }

        public int l() {
            return this.f51177e;
        }

        public boolean m() {
            return this.f51177e == 25;
        }

        public boolean n() {
            return this.f51177e == 26;
        }

        public boolean o() {
            int i10 = this.f51177e;
            return i10 == 3 || i10 == 8;
        }

        public boolean p() {
            int i10 = this.f51177e;
            return i10 == 1 || i10 == 6;
        }

        public boolean q() {
            return p() || x();
        }

        public boolean r() {
            return this.f51177e == 4;
        }

        public boolean s() {
            return this.f51177e == 9;
        }

        public boolean t() {
            return this.f51177e == 0;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            return q() || o();
        }

        public boolean v() {
            return this.f51177e == 5;
        }

        public boolean w() {
            return j.k(this.f51177e);
        }

        public boolean x() {
            int i10 = this.f51177e;
            return i10 == 2 || i10 == 7;
        }

        public boolean y() {
            int i10 = this.f51177e;
            return i10 == 10 || i10 == 9;
        }

        StringBuilder z(StringBuilder sb2) {
            int i10 = this.f51177e;
            if (i10 != 36) {
                switch (i10) {
                    case 0:
                        sb2.append(AbstractJsonLexerKt.NULL);
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(g());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(j());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(d());
                        return sb2;
                    case 4:
                        c cVarF = f();
                        sb2.append('\"');
                        StringBuilder sbA = cVarF.a(sb2);
                        sbA.append('\"');
                        return sbA;
                    case 5:
                        sb2.append('\"');
                        sb2.append(i());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        return h().a(sb2);
                    case 10:
                        return k().a(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new b("not_implemented:" + this.f51177e);
                    case 25:
                        return b().a(sb2);
                    case 26:
                        sb2.append(c());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(k());
            return sb2;
        }

        g(q qVar, int i10, int i11, int i12, int i13) {
            this.f51173a = qVar;
            this.f51174b = i10;
            this.f51175c = i11;
            this.f51176d = i12;
            this.f51177e = i13;
        }
    }

    private static abstract class h extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final int f51178d;

        h(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
            this.f51178d = j.n(this.f51169a, i10 - i11, i11);
        }

        public int b() {
            return this.f51178d;
        }
    }

    public static class i extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final i f51179g = new i(j.C, 1, 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f51180f;

        i(q qVar, int i10, int i11, int i12) {
            super(qVar, i10, i11);
            this.f51180f = i12;
        }

        public static i f() {
            return f51179g;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.k
        public g d(int i10) {
            if (i10 >= b()) {
                return g.f51172f;
            }
            return new g(this.f51169a, this.f51170b + (i10 * this.f51171c), this.f51171c, 1, this.f51180f);
        }

        public int g() {
            return this.f51180f;
        }

        public boolean h() {
            return this == f51179g;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.j$j, reason: collision with other inner class name */
    static class C0463j {
        C0463j() {
        }

        static int a(byte b10) {
            return b10 & 255;
        }

        static long b(int i10) {
            return ((long) i10) & k0.f265952a;
        }

        static int c(short s10) {
            return s10 & e2.f312492d;
        }
    }

    public static class k extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final k f51181e = new k(j.C, 1, 1);

        k(q qVar, int i10, int i11) {
            super(qVar, i10, i11);
        }

        public static k c() {
            return f51181e;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.f
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("[ ");
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                d(i10).z(sb2);
                if (i10 != iB - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" ]");
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.h
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public g d(int i10) {
            long jB = b();
            long j10 = i10;
            if (j10 >= jB) {
                return g.f51172f;
            }
            return new g(this.f51169a, this.f51170b + (i10 * this.f51171c), this.f51171c, C0463j.a(this.f51169a.get((int) (((long) this.f51170b) + (jB * ((long) this.f51171c)) + j10))));
        }

        public boolean e() {
            return this == f51181e;
        }

        @Override // androidx.emoji2.text.flatbuffer.j.f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static g g(q qVar) {
        int iLimit = qVar.limit();
        byte b10 = qVar.get(iLimit - 1);
        int i10 = iLimit - 2;
        return new g(qVar, i10 - b10, b10, C0463j.a(qVar.get(i10)));
    }

    @Deprecated
    public static g h(ByteBuffer byteBuffer) {
        return g(byteBuffer.hasArray() ? new androidx.emoji2.text.flatbuffer.a(byteBuffer.array(), byteBuffer.limit()) : new androidx.emoji2.text.flatbuffer.d(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(q qVar, int i10, int i11) {
        return (int) (((long) i10) - p(qVar, i10, i11));
    }

    static boolean j(int i10) {
        return i10 <= 3 || i10 == 26;
    }

    static boolean k(int i10) {
        return (i10 >= 11 && i10 <= 15) || i10 == 36;
    }

    static boolean l(int i10) {
        return (i10 >= 1 && i10 <= 4) || i10 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double m(q qVar, int i10, int i11) {
        if (i11 == 4) {
            return qVar.getFloat(i10);
        }
        if (i11 != 8) {
            return -1.0d;
        }
        return qVar.getDouble(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(q qVar, int i10, int i11) {
        return (int) o(qVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o(q qVar, int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = qVar.get(i10);
        } else if (i11 == 2) {
            i12 = qVar.getShort(i10);
        } else {
            if (i11 != 4) {
                if (i11 != 8) {
                    return -1L;
                }
                return qVar.getLong(i10);
            }
            i12 = qVar.getInt(i10);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long p(q qVar, int i10, int i11) {
        if (i11 == 1) {
            return C0463j.a(qVar.get(i10));
        }
        if (i11 == 2) {
            return C0463j.c(qVar.getShort(i10));
        }
        if (i11 == 4) {
            return C0463j.b(qVar.getInt(i10));
        }
        if (i11 != 8) {
            return -1L;
        }
        return qVar.getLong(i10);
    }

    static int q(int i10, int i11) {
        if (i11 == 0) {
            return i10 + 10;
        }
        if (i11 == 2) {
            return i10 + 15;
        }
        if (i11 == 3) {
            return i10 + 18;
        }
        if (i11 != 4) {
            return 0;
        }
        return i10 + 21;
    }

    static int r(int i10) {
        return i10 - 10;
    }
}
