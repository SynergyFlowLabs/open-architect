package org.msgpack.value;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class a0 implements x {
    private static final long X = 32767;
    private static final long Y = -2147483648L;
    private static final long Z = 2147483647L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final BigInteger f339333o = BigInteger.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final BigInteger f339334s = BigInteger.valueOf(Long.MAX_VALUE);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f339335t = -128;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f339336v = 127;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f339337w = -32768;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f339338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f339339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f339340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f339341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f339342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f339343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f339344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k f339345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f339346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f339347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f339348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f339349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object f339350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f339351n;

    private abstract class b extends d implements u {
        private b() {
            super();
        }

        @Override // org.msgpack.value.u
        public float P() {
            if (a0.this.f339347j == n.f339367e) {
                return ((BigInteger) a0.this.f339350m).floatValue();
            }
            return a0.this.f339347j == n.f339368f ? (float) a0.this.f339349l : a0.this.f339348k;
        }

        @Override // org.msgpack.value.u
        public double R() {
            if (a0.this.f339347j == n.f339367e) {
                return ((BigInteger) a0.this.f339350m).doubleValue();
            }
            return a0.this.f339347j == n.f339368f ? a0.this.f339349l : a0.this.f339348k;
        }

        @Override // org.msgpack.value.u
        public byte S() {
            return a0.this.f339347j == n.f339367e ? ((BigInteger) a0.this.f339350m).byteValue() : (byte) a0.this.f339348k;
        }

        @Override // org.msgpack.value.u
        public short T() {
            return a0.this.f339347j == n.f339367e ? ((BigInteger) a0.this.f339350m).shortValue() : (short) a0.this.f339348k;
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public u Z() {
            return this;
        }

        @Override // org.msgpack.value.u
        public long h0() {
            return a0.this.f339347j == n.f339367e ? ((BigInteger) a0.this.f339350m).longValue() : a0.this.f339348k;
        }

        @Override // org.msgpack.value.u
        public BigInteger l0() {
            if (a0.this.f339347j == n.f339367e) {
                return (BigInteger) a0.this.f339350m;
            }
            return a0.this.f339347j == n.f339368f ? new BigDecimal(a0.this.f339349l).toBigInteger() : BigInteger.valueOf(a0.this.f339348k);
        }

        @Override // org.msgpack.value.u
        public int t0() {
            return a0.this.f339347j == n.f339367e ? ((BigInteger) a0.this.f339350m).intValue() : (int) a0.this.f339348k;
        }
    }

    private abstract class c extends d implements v {
        private c() {
            super();
        }

        @Override // org.msgpack.value.v
        public ByteBuffer D() {
            return ByteBuffer.wrap(k());
        }

        @Override // org.msgpack.value.v
        public byte[] k() {
            return (byte[]) a0.this.f339350m;
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.v
        public String toString() {
            byte[] bArr = (byte[]) a0.this.f339350m;
            try {
                CharsetDecoder charsetDecoderNewDecoder = org.msgpack.core.h.f339262a.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException e10) {
                throw new org.msgpack.core.l(e10);
            }
        }

        @Override // org.msgpack.value.v
        public String u() {
            byte[] bArr = (byte[]) a0.this.f339350m;
            try {
                CharsetDecoder charsetDecoderNewDecoder = org.msgpack.core.h.f339262a.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException e10) {
                throw new org.msgpack.core.l(e10);
            }
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public v v() {
            return this;
        }
    }

    private abstract class d implements x {
        private d() {
        }

        @Override // org.msgpack.value.x
        public boolean A() {
            return i1().l();
        }

        @Override // org.msgpack.value.x
        public boolean J() {
            return i1().w();
        }

        @Override // org.msgpack.value.x
        public boolean K() {
            return i1().t();
        }

        @Override // org.msgpack.value.x
        public boolean L() {
            return i1().p();
        }

        @Override // org.msgpack.value.x
        public String O() {
            return a0.this.O();
        }

        @Override // org.msgpack.value.x
        public org.msgpack.value.d V() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public boolean W() {
            return i1().k();
        }

        @Override // org.msgpack.value.x
        public boolean Y() {
            return i1().n();
        }

        @Override // org.msgpack.value.x
        public u Z() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public boolean b0() {
            return i1().v();
        }

        @Override // org.msgpack.value.x
        public boolean c0() {
            return i1().s();
        }

        @Override // org.msgpack.value.x
        public boolean equals(Object obj) {
            return a0.this.equals(obj);
        }

        public int hashCode() {
            return a0.this.hashCode();
        }

        @Override // org.msgpack.value.x
        public s i() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public r l() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public boolean m0() {
            return i1().o();
        }

        @Override // org.msgpack.value.x
        public org.msgpack.value.b n() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public t p() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public boolean p0() {
            return i1().q();
        }

        @Override // org.msgpack.value.x
        public boolean q0() {
            return i1().r();
        }

        @Override // org.msgpack.value.x
        public w r() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public org.msgpack.value.c s() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public org.msgpack.value.a t() {
            throw new org.msgpack.core.m();
        }

        public String toString() {
            return a0.this.toString();
        }

        @Override // org.msgpack.value.x
        public v v() {
            throw new org.msgpack.core.m();
        }

        @Override // org.msgpack.value.x
        public org.msgpack.value.e w() {
            throw new org.msgpack.core.m();
        }
    }

    private class e extends d implements org.msgpack.value.a {
        private e() {
            super();
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            List<x> listH1 = h1();
            jVar.g(listH1.size());
            Iterator<x> it = listH1.iterator();
            while (it.hasNext()) {
                it.next().N(jVar);
            }
        }

        @Override // org.msgpack.value.a
        public x Z2(int i10) {
            List<x> listH1 = h1();
            return (listH1.size() >= i10 || i10 < 0) ? listH1.get(i10) : y.y();
        }

        @Override // org.msgpack.value.a
        public x get(int i10) {
            return h1().get(i10);
        }

        @Override // org.msgpack.value.a
        public List<x> h1() {
            return (List) a0.this.f339350m;
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.ARRAY;
        }

        @Override // org.msgpack.value.a, java.lang.Iterable
        public Iterator<x> iterator() {
            return h1().iterator();
        }

        @Override // org.msgpack.value.a
        public int size() {
            return h1().size();
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public org.msgpack.value.a t() {
            return this;
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public org.msgpack.value.f M() {
            return y.c(h1());
        }
    }

    private class f extends c implements org.msgpack.value.b {
        private f() {
            super();
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            byte[] bArr = (byte[]) a0.this.f339350m;
            jVar.j(bArr.length);
            jVar.r0(bArr);
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.BINARY;
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public org.msgpack.value.b n() {
            return this;
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public org.msgpack.value.g M() {
            return y.f(k());
        }
    }

    private class g extends d implements org.msgpack.value.c {
        private g() {
            super();
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            jVar.l(a0.this.f339348k == 1);
        }

        @Override // org.msgpack.value.c
        public boolean Q() {
            return a0.this.f339348k == 1;
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.BOOLEAN;
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public org.msgpack.value.c s() {
            return this;
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public org.msgpack.value.h M() {
            return y.j(Q());
        }
    }

    private class h extends d implements org.msgpack.value.d {
        private h() {
            super();
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            ((org.msgpack.value.i) a0.this.f339350m).N(jVar);
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public org.msgpack.value.d V() {
            return this;
        }

        @Override // org.msgpack.value.d
        public byte c() {
            return ((org.msgpack.value.i) a0.this.f339350m).c();
        }

        @Override // org.msgpack.value.d
        public byte[] getData() {
            return ((org.msgpack.value.i) a0.this.f339350m).getData();
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.EXTENSION;
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public org.msgpack.value.i M() {
            return (org.msgpack.value.i) a0.this.f339350m;
        }
    }

    private class i extends b implements org.msgpack.value.e {
        private i() {
            super();
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            jVar.o(a0.this.f339349l);
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.FLOAT;
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public org.msgpack.value.j M() {
            return y.l(a0.this.f339349l);
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public org.msgpack.value.e w() {
            return this;
        }
    }

    private class j extends b implements r {
        private j() {
            super();
        }

        @Override // org.msgpack.value.r
        public boolean C() {
            return a0.this.f339347j != n.f339367e;
        }

        @Override // org.msgpack.value.r
        public boolean F() {
            if (a0.this.f339347j == n.f339367e || -2147483648L > a0.this.f339348k || a0.this.f339348k > 2147483647L) {
                return false;
            }
            boolean z10 = true & true;
            return true;
        }

        @Override // org.msgpack.value.r
        public byte G() {
            if (e0()) {
                return (byte) a0.this.f339348k;
            }
            throw new org.msgpack.core.f(a0.this.f339348k);
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            if (a0.this.f339347j == n.f339367e) {
                jVar.h((BigInteger) a0.this.f339350m);
            } else {
                jVar.x(a0.this.f339348k);
            }
        }

        @Override // org.msgpack.value.r
        public short U() {
            if (e0()) {
                return (short) a0.this.f339348k;
            }
            throw new org.msgpack.core.f(a0.this.f339348k);
        }

        @Override // org.msgpack.value.r
        public boolean a0() {
            if (a0.this.f339347j == n.f339367e || a0.f339337w > a0.this.f339348k || a0.this.f339348k > a0.X) {
                return false;
            }
            int i10 = 4 << 1;
            return true;
        }

        @Override // org.msgpack.value.r
        public boolean e0() {
            return a0.this.f339347j != n.f339367e && a0.f339335t <= a0.this.f339348k && a0.this.f339348k <= a0.f339336v;
        }

        @Override // org.msgpack.value.r
        public int i0() {
            if (F()) {
                return (int) a0.this.f339348k;
            }
            throw new org.msgpack.core.f(a0.this.f339348k);
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.INTEGER;
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public r l() {
            return this;
        }

        @Override // org.msgpack.value.r
        public long m() {
            if (C()) {
                return a0.this.f339348k;
            }
            throw new org.msgpack.core.f(a0.this.f339348k);
        }

        @Override // org.msgpack.value.r
        public org.msgpack.core.c n0() {
            return org.msgpack.value.impl.d.A0(this);
        }

        @Override // org.msgpack.value.r
        public BigInteger s0() {
            return a0.this.f339347j == n.f339367e ? (BigInteger) a0.this.f339350m : BigInteger.valueOf(a0.this.f339348k);
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public org.msgpack.value.k M() {
            return a0.this.f339347j == n.f339367e ? y.q((BigInteger) a0.this.f339350m) : y.p(a0.this.f339348k);
        }
    }

    private class k extends d implements s {
        private k() {
            super();
        }

        @Override // org.msgpack.value.s
        public x[] B() {
            Map<x, x> map = map();
            x[] xVarArr = new x[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<x, x> entry : map.entrySet()) {
                xVarArr[i10] = entry.getKey();
                xVarArr[i10 + 1] = entry.getValue();
                i10 += 2;
            }
            return xVarArr;
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            Map<x, x> map = map();
            jVar.g(map.size());
            for (Map.Entry<x, x> entry : map.entrySet()) {
                entry.getKey().N(jVar);
                entry.getValue().N(jVar);
            }
        }

        @Override // org.msgpack.value.s
        public Set<Map.Entry<x, x>> entrySet() {
            return map().entrySet();
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public s i() {
            return this;
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.MAP;
        }

        @Override // org.msgpack.value.s
        public Set<x> keySet() {
            return map().keySet();
        }

        @Override // org.msgpack.value.s
        public Map<x, x> map() {
            return (Map) a0.this.f339350m;
        }

        @Override // org.msgpack.value.s
        public int size() {
            return map().size();
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public org.msgpack.value.l M() {
            return y.s(map());
        }

        @Override // org.msgpack.value.s
        public Collection<x> values() {
            return map().values();
        }
    }

    private class l extends d implements t {
        private l() {
            super();
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            jVar.E();
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.NIL;
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public t p() {
            return this;
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public org.msgpack.value.m M() {
            return y.y();
        }
    }

    private class m extends c implements w {
        private m() {
            super();
        }

        @Override // org.msgpack.value.x
        public void N(org.msgpack.core.j jVar) throws IOException {
            byte[] bArr = (byte[]) a0.this.f339350m;
            jVar.H(bArr.length);
            jVar.r0(bArr);
        }

        @Override // org.msgpack.value.x
        public z i1() {
            return z.STRING;
        }

        @Override // org.msgpack.value.a0.d, org.msgpack.value.x
        public w r() {
            return this;
        }

        @Override // org.msgpack.value.x
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public p M() {
            return y.A((byte[]) a0.this.f339350m);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f339364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f339365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final n f339366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final n f339367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final n f339368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final n f339369g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final n f339370h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final n f339371i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final n f339372j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final n f339373k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ n[] f339374l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z f339375a;

        static {
            n nVar = new n("NULL", 0, z.NIL);
            f339364b = nVar;
            n nVar2 = new n("BOOLEAN", 1, z.BOOLEAN);
            f339365c = nVar2;
            z zVar = z.INTEGER;
            n nVar3 = new n("LONG", 2, zVar);
            f339366d = nVar3;
            n nVar4 = new n("BIG_INTEGER", 3, zVar);
            f339367e = nVar4;
            n nVar5 = new n("DOUBLE", 4, z.FLOAT);
            f339368f = nVar5;
            n nVar6 = new n("BYTE_ARRAY", 5, z.BINARY);
            f339369g = nVar6;
            n nVar7 = new n("RAW_STRING", 6, z.STRING);
            f339370h = nVar7;
            n nVar8 = new n("LIST", 7, z.ARRAY);
            f339371i = nVar8;
            n nVar9 = new n("MAP", 8, z.MAP);
            f339372j = nVar9;
            n nVar10 = new n("EXTENSION", 9, z.EXTENSION);
            f339373k = nVar10;
            f339374l = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10};
        }

        private n(String str, int i10, z zVar) {
            super(str, i10);
            this.f339375a = zVar;
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f339374l.clone();
        }

        public z k() {
            return this.f339375a;
        }
    }

    public a0() {
        this.f339338a = new l();
        this.f339339b = new g();
        this.f339340c = new j();
        this.f339341d = new i();
        this.f339342e = new f();
        this.f339343f = new m();
        this.f339344g = new e();
        this.f339345h = new k();
        this.f339346i = new h();
        E();
    }

    @Override // org.msgpack.value.x
    public boolean A() {
        return i1().l();
    }

    public a0 E() {
        this.f339347j = n.f339364b;
        this.f339351n = this.f339338a;
        return this;
    }

    public a0 H(String str) {
        return I(str.getBytes(org.msgpack.core.h.f339262a));
    }

    public a0 I(byte[] bArr) {
        this.f339347j = n.f339370h;
        this.f339351n = this.f339343f;
        this.f339350m = bArr;
        return this;
    }

    @Override // org.msgpack.value.x
    public boolean J() {
        return i1().w();
    }

    @Override // org.msgpack.value.x
    public boolean K() {
        return i1().t();
    }

    @Override // org.msgpack.value.x
    public boolean L() {
        return i1().p();
    }

    @Override // org.msgpack.value.x
    public q M() {
        return this.f339351n.M();
    }

    @Override // org.msgpack.value.x
    public void N(org.msgpack.core.j jVar) throws IOException {
        this.f339351n.N(jVar);
    }

    @Override // org.msgpack.value.x
    public String O() {
        return M().O();
    }

    @Override // org.msgpack.value.x
    public org.msgpack.value.d V() {
        if (m0()) {
            return (org.msgpack.value.d) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    @Override // org.msgpack.value.x
    public boolean W() {
        return i1().k();
    }

    @Override // org.msgpack.value.x
    public boolean Y() {
        return i1().n();
    }

    @Override // org.msgpack.value.x
    public u Z() {
        if (K()) {
            return (u) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    @Override // org.msgpack.value.x
    public boolean b0() {
        return i1().v();
    }

    @Override // org.msgpack.value.x
    public boolean c0() {
        return i1().s();
    }

    @Override // org.msgpack.value.x
    public boolean equals(Object obj) {
        return M().equals(obj);
    }

    public a0 f(List<x> list) {
        this.f339347j = n.f339371i;
        this.f339351n = this.f339344g;
        this.f339350m = list;
        return this;
    }

    public a0 g(byte[] bArr) {
        this.f339347j = n.f339369g;
        this.f339351n = this.f339342e;
        this.f339350m = bArr;
        return this;
    }

    public a0 h(boolean z10) {
        this.f339347j = n.f339365c;
        this.f339351n = this.f339339b;
        this.f339348k = z10 ? 1L : 0L;
        return this;
    }

    public int hashCode() {
        return M().hashCode();
    }

    @Override // org.msgpack.value.x
    public s i() {
        if (q0()) {
            return (s) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return this.f339347j.k();
    }

    public a0 j(byte b10, byte[] bArr) {
        this.f339347j = n.f339373k;
        this.f339351n = this.f339346i;
        this.f339350m = y.k(b10, bArr);
        return this;
    }

    @Override // org.msgpack.value.x
    public r l() {
        if (p0()) {
            return (r) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    @Override // org.msgpack.value.x
    public boolean m0() {
        return i1().o();
    }

    @Override // org.msgpack.value.x
    public org.msgpack.value.b n() {
        if (A()) {
            return (org.msgpack.value.b) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    public a0 o(double d10) {
        this.f339347j = n.f339368f;
        this.f339351n = this.f339341d;
        this.f339349l = d10;
        this.f339348k = (long) d10;
        return this;
    }

    @Override // org.msgpack.value.x
    public t p() {
        if (c0()) {
            return (t) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    @Override // org.msgpack.value.x
    public boolean p0() {
        return i1().q();
    }

    public a0 q(float f10) {
        this.f339347j = n.f339368f;
        this.f339351n = this.f339341d;
        this.f339348k = (long) f10;
        return this;
    }

    @Override // org.msgpack.value.x
    public boolean q0() {
        return i1().r();
    }

    @Override // org.msgpack.value.x
    public w r() {
        if (J()) {
            return (w) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    @Override // org.msgpack.value.x
    public org.msgpack.value.c s() {
        if (Y()) {
            return (org.msgpack.value.c) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    @Override // org.msgpack.value.x
    public org.msgpack.value.a t() {
        if (W()) {
            return (org.msgpack.value.a) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    public String toString() {
        return M().toString();
    }

    @Override // org.msgpack.value.x
    public v v() {
        if (b0()) {
            return (v) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    @Override // org.msgpack.value.x
    public org.msgpack.value.e w() {
        if (L()) {
            return (org.msgpack.value.e) this.f339351n;
        }
        throw new org.msgpack.core.m();
    }

    public a0 x(long j10) {
        this.f339347j = n.f339366d;
        this.f339351n = this.f339340c;
        this.f339348k = j10;
        return this;
    }

    public a0 y(BigInteger bigInteger) {
        if (bigInteger.compareTo(f339333o) < 0 || bigInteger.compareTo(f339334s) > 0) {
            this.f339347j = n.f339367e;
            this.f339351n = this.f339340c;
            this.f339350m = bigInteger;
            return this;
        }
        this.f339347j = n.f339366d;
        this.f339351n = this.f339340c;
        this.f339348k = bigInteger.longValue();
        return this;
    }

    public a0 z(Map<x, x> map) {
        this.f339347j = n.f339372j;
        this.f339351n = this.f339345h;
        this.f339350m = map;
        return this;
    }
}
