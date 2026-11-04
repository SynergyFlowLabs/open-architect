package com.squareup.moshi;

import com.facebook.internal.z0;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.l0;

/* JADX INFO: loaded from: classes13.dex */
final class o extends m {
    private static final int A3 = 7;
    private static final int H1 = 4;
    private static final int Y = 0;
    private static final int Z = 1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f267201g3 = 6;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f267202h3 = 7;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f267203i3 = 8;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f267204j3 = 9;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f267205k3 = 10;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f267206l3 = 11;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f267207m3 = 12;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f267208n3 = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f267209o = -922337203685477580L;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f267210o3 = 14;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f267211p0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f267212p1 = 3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f267213p2 = 5;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f267214p3 = 15;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f267215q3 = 16;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int f267216r3 = 17;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f267218s3 = 18;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f267220t3 = 0;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f267221u3 = 1;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f267223v3 = 2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f267225w3 = 3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final int f267226x3 = 4;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final int f267227y3 = 5;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final int f267228z3 = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final okio.n f267229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final okio.l f267230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f267231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f267232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f267233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @fj.h
    private String f267234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @fj.h
    private r f267235n;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final okio.o f267217s = okio.o.x("'\\");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final okio.o f267219t = okio.o.x("\"\\");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final okio.o f267222v = okio.o.x("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final okio.o f267224w = okio.o.x("\n\r");
    private static final okio.o X = okio.o.x("*/");

    o(okio.n nVar) {
        this.f267231j = 0;
        if (nVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f267229h = nVar;
        this.f267230i = nVar.n();
        j(6);
    }

    private void H() throws IOException {
        if (!this.f267175e) {
            throw x("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int I() throws IOException {
        int[] iArr = this.f267172b;
        int i10 = this.f267171a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iX = X(true);
            this.f267230i.readByte();
            if (iX != 44) {
                if (iX != 59) {
                    if (iX != 93) {
                        throw x("Unterminated array");
                    }
                    this.f267231j = 4;
                    return 4;
                }
                H();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iX2 = X(true);
                    this.f267230i.readByte();
                    if (iX2 != 44) {
                        if (iX2 != 59) {
                            if (iX2 != 125) {
                                throw x("Unterminated object");
                            }
                            this.f267231j = 2;
                            return 2;
                        }
                        H();
                    }
                }
                int iX3 = X(true);
                if (iX3 == 34) {
                    this.f267230i.readByte();
                    this.f267231j = 13;
                    return 13;
                }
                if (iX3 == 39) {
                    this.f267230i.readByte();
                    H();
                    this.f267231j = 12;
                    return 12;
                }
                if (iX3 != 125) {
                    H();
                    if (!T((char) iX3)) {
                        throw x("Expected name");
                    }
                    this.f267231j = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw x("Expected name");
                }
                this.f267230i.readByte();
                this.f267231j = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iX4 = X(true);
                this.f267230i.readByte();
                if (iX4 != 58) {
                    if (iX4 != 61) {
                        throw x("Expected ':'");
                    }
                    H();
                    if (this.f267229h.request(1L) && this.f267230i.I(0L) == 62) {
                        this.f267230i.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (X(false) == -1) {
                    this.f267231j = 18;
                    return 18;
                }
                H();
            } else {
                if (i11 == 9) {
                    this.f267235n.b();
                    this.f267235n = null;
                    this.f267171a--;
                    return I();
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iX5 = X(true);
        if (iX5 == 34) {
            this.f267230i.readByte();
            this.f267231j = 9;
            return 9;
        }
        if (iX5 == 39) {
            H();
            this.f267230i.readByte();
            this.f267231j = 8;
            return 8;
        }
        if (iX5 != 44 && iX5 != 59) {
            if (iX5 == 91) {
                this.f267230i.readByte();
                this.f267231j = 3;
                return 3;
            }
            if (iX5 != 93) {
                if (iX5 == 123) {
                    this.f267230i.readByte();
                    this.f267231j = 1;
                    return 1;
                }
                int iF0 = f0();
                if (iF0 != 0) {
                    return iF0;
                }
                int iG0 = g0();
                if (iG0 != 0) {
                    return iG0;
                }
                if (!T(this.f267230i.I(0L))) {
                    throw x("Expected value");
                }
                H();
                this.f267231j = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f267230i.readByte();
                this.f267231j = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw x("Unexpected value");
        }
        H();
        this.f267231j = 7;
        return 7;
    }

    private int N(String str, m.b bVar) {
        int length = bVar.f267179a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f267179a[i10])) {
                this.f267231j = 0;
                this.f267173c[this.f267171a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private int R(String str, m.b bVar) {
        int length = bVar.f267179a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f267179a[i10])) {
                this.f267231j = 0;
                int[] iArr = this.f267174d;
                int i11 = this.f267171a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0040  */
    private boolean T(int i10) throws IOException {
        if (i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            if (i10 == 35) {
                H();
            } else if (i10 != 44) {
                if (i10 == 47 || i10 == 61) {
                    H();
                } else if (i10 != 123 && i10 != 125 && i10 != 58) {
                    if (i10 != 59) {
                        switch (i10) {
                            case com.planner5d.library.engine.input.f.b.f160711n0 /* 91 */:
                            case com.planner5d.library.engine.input.f.b.f160700j1 /* 93 */:
                                break;
                            case com.planner5d.library.engine.input.f.b.f160697i1 /* 92 */:
                                H();
                                break;
                            default:
                                int i11 = 7 ^ 1;
                                return true;
                        }
                    } else {
                        H();
                    }
                }
            }
        }
        return false;
    }

    private int X(boolean z10) throws IOException {
        byte bI;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f267229h.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bI = this.f267230i.I(i10);
                if (bI != 10 && bI != 32 && bI != 13 && bI != 9) {
                    break;
                }
                i10 = i11;
            }
            this.f267230i.skip(i10);
            if (bI == 47) {
                if (this.f267229h.request(2L)) {
                    H();
                    byte bI2 = this.f267230i.I(1L);
                    if (bI2 == 42) {
                        this.f267230i.readByte();
                        this.f267230i.readByte();
                        if (!o0()) {
                            throw x("Unterminated comment");
                        }
                    } else if (bI2 == 47) {
                        this.f267230i.readByte();
                        this.f267230i.readByte();
                        r0();
                    }
                }
                return bI;
            }
            if (bI != 35) {
                return bI;
            }
            H();
            r0();
        }
    }

    private String Y(okio.o oVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jP2 = this.f267229h.P2(oVar);
            if (jP2 == -1) {
                throw x("Unterminated string");
            }
            if (this.f267230i.I(jP2) != 92) {
                if (sb2 == null) {
                    String strU5 = this.f267230i.u5(jP2);
                    this.f267230i.readByte();
                    return strU5;
                }
                sb2.append(this.f267230i.u5(jP2));
                this.f267230i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f267230i.u5(jP2));
            this.f267230i.readByte();
            sb2.append(j0());
        }
    }

    private String d0() throws IOException {
        long jP2 = this.f267229h.P2(f267222v);
        okio.l lVar = this.f267230i;
        return jP2 != -1 ? lVar.u5(jP2) : lVar.O7();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int f0() throws IOException {
        String str;
        String str2;
        int i10;
        byte bI = this.f267230i.I(0L);
        if (bI == 116 || bI == 84) {
            str = z0.P;
            str2 = "TRUE";
            i10 = 5;
        } else if (bI == 102 || bI == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bI != 110 && bI != 78) {
                return 0;
            }
            str = AbstractJsonLexerKt.NULL;
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f267229h.request(i12)) {
                return 0;
            }
            byte bI2 = this.f267230i.I(i11);
            if (bI2 != str.charAt(i11) && bI2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f267229h.request(length + 1) && T(this.f267230i.I(length))) {
            return 0;
        }
        this.f267230i.skip(length);
        this.f267231j = i10;
        return i10;
    }

    private int g0() throws IOException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f267229h.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bI = this.f267230i.I(i11);
            i10 = 0;
            if (bI != 43) {
                if (bI == 69 || bI == 101) {
                    if (c10 != 2 && c10 != 4) {
                        return 0;
                    }
                    c10 = 5;
                } else if (bI != 45) {
                    if (bI != 46) {
                        if (bI < 48 || bI > 57) {
                            if (!T(bI)) {
                                break;
                            }
                            return 0;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j11 = -(bI + org.msgpack.core.h.a.f339285u);
                            c10 = 2;
                        } else if (c10 == 2) {
                            if (j11 == 0) {
                                return 0;
                            }
                            long j12 = (10 * j11) - ((long) (bI + org.msgpack.core.h.a.f339285u));
                            z10 &= j11 > -922337203685477580L || (j11 == -922337203685477580L && j12 < j11);
                            j11 = j12;
                        } else if (c10 == 3) {
                            c10 = 4;
                        } else if (c10 == 5 || c10 == 6) {
                            c10 = 7;
                        }
                    } else {
                        if (c10 != 2) {
                            return 0;
                        }
                        c10 = 3;
                    }
                } else if (c10 == 0) {
                    c10 = 1;
                    z11 = true;
                } else if (c10 != 5) {
                    return 0;
                }
                i11 = i12;
            } else if (c10 != 5) {
                return 0;
            }
            c10 = 6;
            i11 = i12;
        }
        if (c10 == 2 && z10 && ((j11 != Long.MIN_VALUE || z11) && (j11 != j10 || !z11))) {
            if (!z11) {
                j11 = -j11;
            }
            this.f267232k = j11;
            this.f267230i.skip(i11);
            this.f267231j = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f267233l = i11;
        this.f267231j = 17;
        return 17;
    }

    private char j0() throws IOException {
        int i10;
        if (!this.f267229h.request(1L)) {
            throw x("Unterminated escape sequence");
        }
        byte b10 = this.f267230i.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return org.apache.commons.lang3.k.f337188d;
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            if (this.f267175e) {
                return (char) b10;
            }
            throw x("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f267229h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + S());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bI = this.f267230i.I(i11);
            char c11 = (char) (c10 << 4);
            if (bI >= 48 && bI <= 57) {
                i10 = bI + org.msgpack.core.h.a.f339285u;
            } else if (bI >= 97 && bI <= 102) {
                i10 = bI - 87;
            } else {
                if (bI < 65 || bI > 70) {
                    throw x("\\u" + this.f267230i.u5(4L));
                }
                i10 = bI + org.msgpack.core.h.a.f339278n;
            }
            c10 = (char) (c11 + i10);
        }
        this.f267230i.skip(4L);
        return c10;
    }

    private void k0(okio.o oVar) throws IOException {
        while (true) {
            long jP2 = this.f267229h.P2(oVar);
            if (jP2 == -1) {
                throw x("Unterminated string");
            }
            if (this.f267230i.I(jP2) != 92) {
                this.f267230i.skip(jP2 + 1);
                return;
            } else {
                this.f267230i.skip(jP2 + 1);
                j0();
            }
        }
    }

    private boolean o0() throws IOException {
        okio.n nVar = this.f267229h;
        okio.o oVar = X;
        long jX2 = nVar.x2(oVar);
        boolean z10 = jX2 != -1;
        okio.l lVar = this.f267230i;
        lVar.skip(z10 ? jX2 + ((long) oVar.v0()) : lVar.size());
        return z10;
    }

    private void r0() throws IOException {
        long jP2 = this.f267229h.P2(f267224w);
        okio.l lVar = this.f267230i;
        lVar.skip(jP2 != -1 ? jP2 + 1 : lVar.size());
    }

    private void w0() throws IOException {
        long jP2 = this.f267229h.P2(f267222v);
        okio.l lVar = this.f267230i;
        if (jP2 == -1) {
            jP2 = lVar.size();
        }
        lVar.skip(jP2);
    }

    @Override // com.squareup.moshi.m
    public void F0() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I != 4) {
            throw new j("Expected END_ARRAY but was " + f() + " at path " + S());
        }
        int i10 = this.f267171a;
        this.f267171a = i10 - 1;
        int[] iArr = this.f267174d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f267231j = 0;
    }

    @Override // com.squareup.moshi.m
    public void F1() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I != 2) {
            throw new j("Expected END_OBJECT but was " + f() + " at path " + S());
        }
        int i10 = this.f267171a;
        int i11 = i10 - 1;
        this.f267171a = i11;
        this.f267173c[i11] = null;
        int[] iArr = this.f267174d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f267231j = 0;
    }

    @Override // com.squareup.moshi.m
    public void J0() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 3) {
            j(1);
            this.f267174d[this.f267171a - 1] = 0;
            this.f267231j = 0;
        } else {
            throw new j("Expected BEGIN_ARRAY but was " + f() + " at path " + S());
        }
    }

    @Override // com.squareup.moshi.m
    public void a9() throws IOException {
        if (this.f267176f) {
            throw new j("Cannot skip unexpected " + f() + " at " + S());
        }
        int i10 = 4 ^ 0;
        int i11 = 0;
        do {
            int I = this.f267231j;
            if (I == 0) {
                I = I();
            }
            if (I == 3) {
                j(1);
            } else {
                if (I == 1) {
                    j(3);
                } else if (I == 4) {
                    i11--;
                    if (i11 < 0) {
                        throw new j("Expected a value but was " + f() + " at path " + S());
                    }
                    this.f267171a--;
                } else if (I == 2) {
                    i11--;
                    if (i11 < 0) {
                        throw new j("Expected a value but was " + f() + " at path " + S());
                    }
                    this.f267171a--;
                } else if (I == 14 || I == 10) {
                    w0();
                } else if (I == 9 || I == 13) {
                    k0(f267219t);
                } else if (I == 8 || I == 12) {
                    k0(f267217s);
                } else if (I == 17) {
                    this.f267230i.skip(this.f267233l);
                } else if (I == 18) {
                    throw new j("Expected a value but was " + f() + " at path " + S());
                }
                this.f267231j = 0;
            }
            i11++;
            this.f267231j = 0;
        } while (i11 != 0);
        int[] iArr = this.f267174d;
        int i12 = this.f267171a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f267173c[i12 - 1] = AbstractJsonLexerKt.NULL;
    }

    @Override // com.squareup.moshi.m
    @fj.h
    public <T> T c() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 7) {
            this.f267231j = 0;
            int[] iArr = this.f267174d;
            int i10 = this.f267171a - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new j("Expected null but was " + f() + " at path " + S());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f267231j = 0;
        this.f267172b[0] = 8;
        this.f267171a = 1;
        this.f267230i.c();
        this.f267229h.close();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    @Override // com.squareup.moshi.m
    public okio.n d() throws IOException {
        int i10;
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        okio.l lVar = new okio.l();
        okio.o oVar = r.f267251m;
        if (I != 3) {
            if (I == 1) {
                lVar.pa("{");
                oVar = r.f267246h;
            } else {
                if (I == 9) {
                    lVar.pa("\"");
                    oVar = r.f267248j;
                } else if (I == 8) {
                    lVar.pa("'");
                    oVar = r.f267247i;
                } else if (I == 17 || I == 16 || I == 10) {
                    lVar.pa(jc());
                } else if (I == 5) {
                    lVar.pa(z0.P);
                } else if (I == 6) {
                    lVar.pa("false");
                } else if (I == 7) {
                    lVar.pa(AbstractJsonLexerKt.NULL);
                } else {
                    if (I != 11) {
                        throw new j("Expected a value but was " + f() + " at path " + S());
                    }
                    String strJc = jc();
                    t tVarR = t.r(lVar);
                    try {
                        tVarR.f0(strJc);
                        tVarR.close();
                    } catch (Throwable th2) {
                        if (tVarR != null) {
                            try {
                                tVarR.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                i10 = 0;
            }
            if (this.f267231j != 0) {
                int[] iArr = this.f267174d;
                int i11 = this.f267171a - 1;
                iArr[i11] = iArr[i11] + 1;
                this.f267231j = 0;
            }
            this.f267235n = new r(this.f267229h, lVar, oVar, i10);
            j(9);
            return l0.e(this.f267235n);
        }
        lVar.pa("[");
        oVar = r.f267246h;
        i10 = 1;
        if (this.f267231j != 0) {
            int[] iArr2 = this.f267174d;
            int i12 = this.f267171a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            this.f267231j = 0;
        }
        this.f267235n = new r(this.f267229h, lVar, oVar, i10);
        j(9);
        return l0.e(this.f267235n);
    }

    @Override // com.squareup.moshi.m
    public m.c f() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        switch (I) {
            case 1:
                return m.c.BEGIN_OBJECT;
            case 2:
                return m.c.END_OBJECT;
            case 3:
                return m.c.BEGIN_ARRAY;
            case 4:
                return m.c.END_ARRAY;
            case 5:
            case 6:
                return m.c.BOOLEAN;
            case 7:
                return m.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return m.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return m.c.NAME;
            case 16:
            case 17:
                return m.c.NUMBER;
            case 18:
                return m.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.m
    public m g() {
        return new o(this);
    }

    @Override // com.squareup.moshi.m
    public void h() throws IOException {
        if (hasNext()) {
            this.f267234m = na();
            this.f267231j = 11;
        }
    }

    @Override // com.squareup.moshi.m
    public boolean hasNext() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        return (I == 2 || I == 4 || I == 18) ? false : true;
    }

    @Override // com.squareup.moshi.m
    public String jc() throws IOException {
        String strU5;
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 10) {
            strU5 = d0();
        } else if (I == 9) {
            strU5 = Y(f267219t);
        } else if (I == 8) {
            strU5 = Y(f267217s);
        } else if (I == 11) {
            strU5 = this.f267234m;
            this.f267234m = null;
        } else if (I == 16) {
            strU5 = Long.toString(this.f267232k);
        } else {
            if (I != 17) {
                throw new j("Expected a string but was " + f() + " at path " + S());
            }
            strU5 = this.f267230i.u5(this.f267233l);
        }
        this.f267231j = 0;
        int[] iArr = this.f267174d;
        int i10 = this.f267171a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strU5;
    }

    @Override // com.squareup.moshi.m
    public int m(m.b bVar) throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I < 12 || I > 15) {
            return -1;
        }
        if (I == 15) {
            return N(this.f267234m, bVar);
        }
        int iXf = this.f267229h.xf(bVar.f267180b);
        if (iXf != -1) {
            this.f267231j = 0;
            this.f267173c[this.f267171a - 1] = bVar.f267179a[iXf];
            return iXf;
        }
        String str = this.f267173c[this.f267171a - 1];
        String strNa = na();
        int iN = N(strNa, bVar);
        if (iN == -1) {
            this.f267231j = 15;
            this.f267234m = strNa;
            this.f267173c[this.f267171a - 1] = str;
        }
        return iN;
    }

    @Override // com.squareup.moshi.m
    public void m1() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 1) {
            j(3);
            this.f267231j = 0;
            return;
        }
        throw new j("Expected BEGIN_OBJECT but was " + f() + " at path " + S());
    }

    @Override // com.squareup.moshi.m
    public String na() throws IOException {
        String strY;
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 14) {
            strY = d0();
        } else if (I == 13) {
            strY = Y(f267219t);
        } else if (I == 12) {
            strY = Y(f267217s);
        } else {
            if (I != 15) {
                throw new j("Expected a name but was " + f() + " at path " + S());
            }
            strY = this.f267234m;
            this.f267234m = null;
        }
        this.f267231j = 0;
        this.f267173c[this.f267171a - 1] = strY;
        return strY;
    }

    @Override // com.squareup.moshi.m
    public boolean nextBoolean() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 5) {
            this.f267231j = 0;
            int[] iArr = this.f267174d;
            int i10 = this.f267171a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (I == 6) {
            this.f267231j = 0;
            int[] iArr2 = this.f267174d;
            int i11 = this.f267171a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new j("Expected a boolean but was " + f() + " at path " + S());
    }

    @Override // com.squareup.moshi.m
    public double nextDouble() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 16) {
            this.f267231j = 0;
            int[] iArr = this.f267174d;
            int i10 = this.f267171a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f267232k;
        }
        if (I == 17) {
            this.f267234m = this.f267230i.u5(this.f267233l);
        } else if (I == 9) {
            this.f267234m = Y(f267219t);
        } else if (I == 8) {
            this.f267234m = Y(f267217s);
        } else if (I == 10) {
            this.f267234m = d0();
        } else if (I != 11) {
            throw new j("Expected a double but was " + f() + " at path " + S());
        }
        this.f267231j = 11;
        try {
            double d10 = Double.parseDouble(this.f267234m);
            if (this.f267175e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f267234m = null;
                this.f267231j = 0;
                int[] iArr2 = this.f267174d;
                int i11 = this.f267171a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new k("JSON forbids NaN and infinities: " + d10 + " at path " + S());
        } catch (NumberFormatException unused) {
            throw new j("Expected a double but was " + this.f267234m + " at path " + S());
        }
    }

    @Override // com.squareup.moshi.m
    public int nextInt() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 16) {
            long j10 = this.f267232k;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f267231j = 0;
                int[] iArr = this.f267174d;
                int i11 = this.f267171a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new j("Expected an int but was " + this.f267232k + " at path " + S());
        }
        if (I == 17) {
            this.f267234m = this.f267230i.u5(this.f267233l);
        } else if (I == 9 || I == 8) {
            String strY = I == 9 ? Y(f267219t) : Y(f267217s);
            this.f267234m = strY;
            try {
                int i12 = Integer.parseInt(strY);
                this.f267231j = 0;
                int[] iArr2 = this.f267174d;
                int i13 = this.f267171a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (I != 11) {
            throw new j("Expected an int but was " + f() + " at path " + S());
        }
        this.f267231j = 11;
        try {
            double d10 = Double.parseDouble(this.f267234m);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f267234m = null;
                this.f267231j = 0;
                int[] iArr3 = this.f267174d;
                int i15 = this.f267171a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new j("Expected an int but was " + this.f267234m + " at path " + S());
        } catch (NumberFormatException unused2) {
            throw new j("Expected an int but was " + this.f267234m + " at path " + S());
        }
    }

    @Override // com.squareup.moshi.m
    public long nextLong() throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 16) {
            this.f267231j = 0;
            int[] iArr = this.f267174d;
            int i10 = this.f267171a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f267232k;
        }
        if (I == 17) {
            this.f267234m = this.f267230i.u5(this.f267233l);
        } else if (I == 9 || I == 8) {
            String strY = I == 9 ? Y(f267219t) : Y(f267217s);
            this.f267234m = strY;
            try {
                long j10 = Long.parseLong(strY);
                this.f267231j = 0;
                int[] iArr2 = this.f267174d;
                int i11 = this.f267171a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (I != 11) {
            throw new j("Expected a long but was " + f() + " at path " + S());
        }
        this.f267231j = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f267234m).longValueExact();
            this.f267234m = null;
            this.f267231j = 0;
            int[] iArr3 = this.f267174d;
            int i12 = this.f267171a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new j("Expected a long but was " + this.f267234m + " at path " + S());
        }
    }

    @Override // com.squareup.moshi.m
    public int o(m.b bVar) throws IOException {
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I < 8 || I > 11) {
            return -1;
        }
        if (I == 11) {
            return R(this.f267234m, bVar);
        }
        int iXf = this.f267229h.xf(bVar.f267180b);
        if (iXf != -1) {
            this.f267231j = 0;
            int[] iArr = this.f267174d;
            int i10 = this.f267171a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iXf;
        }
        String strJc = jc();
        int iR = R(strJc, bVar);
        if (iR == -1) {
            this.f267231j = 11;
            this.f267234m = strJc;
            int[] iArr2 = this.f267174d;
            int i11 = this.f267171a - 1;
            iArr2[i11] = iArr2[i11] - 1;
        }
        return iR;
    }

    @Override // com.squareup.moshi.m
    public void t() throws IOException {
        if (this.f267176f) {
            m.c cVarF = f();
            na();
            throw new j("Cannot skip unexpected " + cVarF + " at " + S());
        }
        int I = this.f267231j;
        if (I == 0) {
            I = I();
        }
        if (I == 14) {
            w0();
        } else if (I == 13) {
            k0(f267219t);
        } else if (I == 12) {
            k0(f267217s);
        } else if (I != 15) {
            throw new j("Expected a name but was " + f() + " at path " + S());
        }
        this.f267231j = 0;
        this.f267173c[this.f267171a - 1] = AbstractJsonLexerKt.NULL;
    }

    public String toString() {
        return "JsonReader(" + this.f267229h + ")";
    }

    o(o oVar) {
        super(oVar);
        this.f267231j = 0;
        okio.n nVarPeek = oVar.f267229h.peek();
        this.f267229h = nVarPeek;
        this.f267230i = nVarPeek.n();
        this.f267231j = oVar.f267231j;
        this.f267232k = oVar.f267232k;
        this.f267233l = oVar.f267233l;
        this.f267234m = oVar.f267234m;
        try {
            nVarPeek.q1(oVar.f267230i.size());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
