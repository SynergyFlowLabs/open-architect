package com.airbnb.lottie.parser.moshi;

import androidx.annotation.p0;
import com.facebook.internal.z0;
import java.io.EOFException;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.l;
import okio.n;
import okio.o;
import org.apache.commons.lang3.k;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes3.dex */
final class e extends c {
    private static final int H1 = 5;
    private static final int X = 0;
    private static final int Y = 1;
    private static final int Z = 2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f88717g3 = 7;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f88718h3 = 8;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f88719i3 = 9;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f88720j3 = 10;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f88721k3 = 11;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f88722l3 = 12;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f88723m3 = 13;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f88724n = -922337203685477580L;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final int f88725n3 = 14;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final int f88727o3 = 15;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f88728p0 = 3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f88729p1 = 4;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f88730p2 = 6;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f88731p3 = 16;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f88732q3 = 17;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final int f88733r3 = 18;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f88735s3 = 0;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f88737t3 = 1;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f88738u3 = 2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f88740v3 = 3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f88742w3 = 4;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final int f88743x3 = 5;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private static final int f88744y3 = 6;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final int f88745z3 = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n f88746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f88747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f88748j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f88749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f88750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private String f88751m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final o f88726o = o.x("'\\");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final o f88734s = o.x("\"\\");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final o f88736t = o.x("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final o f88739v = o.x("\n\r");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final o f88741w = o.x("*/");

    e(n nVar) {
        if (nVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f88746h = nVar;
        this.f88747i = nVar.c1();
        d(6);
    }

    private char E() throws IOException {
        int i10;
        if (!this.f88746h.request(1L)) {
            throw h("Unterminated escape sequence");
        }
        byte b10 = this.f88747i.readByte();
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
            return k.f337188d;
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            if (this.f88694e) {
                return (char) b10;
            }
            throw h("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f88746h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + S());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bI = this.f88747i.I(i11);
            char c11 = (char) (c10 << 4);
            if (bI >= 48 && bI <= 57) {
                i10 = bI + h.a.f339285u;
            } else if (bI >= 97 && bI <= 102) {
                i10 = bI - 87;
            } else {
                if (bI < 65 || bI > 70) {
                    throw h("\\u" + this.f88747i.u5(4L));
                }
                i10 = bI + h.a.f339278n;
            }
            c10 = (char) (c11 + i10);
        }
        this.f88747i.skip(4L);
        return c10;
    }

    private void H(o oVar) throws IOException {
        while (true) {
            long jP2 = this.f88746h.P2(oVar);
            if (jP2 == -1) {
                throw h("Unterminated string");
            }
            if (this.f88747i.I(jP2) != 92) {
                this.f88747i.skip(jP2 + 1);
                return;
            } else {
                this.f88747i.skip(jP2 + 1);
                E();
            }
        }
    }

    private boolean I() throws IOException {
        n nVar = this.f88746h;
        o oVar = f88741w;
        long jX2 = nVar.x2(oVar);
        boolean z10 = jX2 != -1;
        l lVar = this.f88747i;
        lVar.skip(z10 ? jX2 + ((long) oVar.v0()) : lVar.size());
        return z10;
    }

    private void N() throws IOException {
        long jP2 = this.f88746h.P2(f88739v);
        l lVar = this.f88747i;
        lVar.skip(jP2 != -1 ? jP2 + 1 : lVar.size());
    }

    private void R() throws IOException {
        long jP2 = this.f88746h.P2(f88736t);
        l lVar = this.f88747i;
        if (jP2 == -1) {
            jP2 = lVar.size();
        }
        lVar.skip(jP2);
    }

    private void j() throws IOException {
        if (!this.f88694e) {
            throw h("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int l() throws IOException {
        int[] iArr = this.f88691b;
        int i10 = this.f88690a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iQ = q(true);
            this.f88747i.readByte();
            if (iQ != 44) {
                if (iQ != 59) {
                    if (iQ != 93) {
                        throw h("Unterminated array");
                    }
                    this.f88748j = 4;
                    return 4;
                }
                j();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iQ2 = q(true);
                    this.f88747i.readByte();
                    if (iQ2 != 44) {
                        if (iQ2 != 59) {
                            if (iQ2 != 125) {
                                throw h("Unterminated object");
                            }
                            this.f88748j = 2;
                            return 2;
                        }
                        j();
                    }
                }
                int iQ3 = q(true);
                if (iQ3 == 34) {
                    this.f88747i.readByte();
                    this.f88748j = 13;
                    return 13;
                }
                if (iQ3 == 39) {
                    this.f88747i.readByte();
                    j();
                    this.f88748j = 12;
                    return 12;
                }
                if (iQ3 != 125) {
                    j();
                    if (!o((char) iQ3)) {
                        throw h("Expected name");
                    }
                    this.f88748j = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw h("Expected name");
                }
                this.f88747i.readByte();
                this.f88748j = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iQ4 = q(true);
                this.f88747i.readByte();
                if (iQ4 != 58) {
                    if (iQ4 != 61) {
                        throw h("Expected ':'");
                    }
                    j();
                    if (this.f88746h.request(1L) && this.f88747i.I(0L) == 62) {
                        this.f88747i.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (q(false) == -1) {
                    this.f88748j = 18;
                    return 18;
                }
                j();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iQ5 = q(true);
        if (iQ5 == 34) {
            this.f88747i.readByte();
            this.f88748j = 9;
            return 9;
        }
        if (iQ5 == 39) {
            j();
            this.f88747i.readByte();
            this.f88748j = 8;
            return 8;
        }
        if (iQ5 != 44 && iQ5 != 59) {
            if (iQ5 == 91) {
                this.f88747i.readByte();
                this.f88748j = 3;
                return 3;
            }
            if (iQ5 != 93) {
                if (iQ5 == 123) {
                    this.f88747i.readByte();
                    this.f88748j = 1;
                    return 1;
                }
                int iX = x();
                if (iX != 0) {
                    return iX;
                }
                int iY = y();
                if (iY != 0) {
                    return iY;
                }
                if (!o(this.f88747i.I(0L))) {
                    throw h("Expected value");
                }
                j();
                this.f88748j = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f88747i.readByte();
                this.f88748j = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw h("Unexpected value");
        }
        j();
        this.f88748j = 7;
        return 7;
    }

    private int m(String str, c.a aVar) {
        int length = aVar.f88696a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f88696a[i10])) {
                this.f88748j = 0;
                this.f88692c[this.f88690a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0040  */
    private boolean o(int i10) throws IOException {
        if (i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            if (i10 == 35) {
                j();
            } else if (i10 != 44) {
                if (i10 == 47 || i10 == 61) {
                    j();
                } else if (i10 != 123 && i10 != 125 && i10 != 58) {
                    if (i10 != 59) {
                        switch (i10) {
                            case com.planner5d.library.engine.input.f.b.f160711n0 /* 91 */:
                            case com.planner5d.library.engine.input.f.b.f160700j1 /* 93 */:
                                break;
                            case com.planner5d.library.engine.input.f.b.f160697i1 /* 92 */:
                                j();
                                break;
                            default:
                                return true;
                        }
                    } else {
                        j();
                    }
                }
            }
        }
        return false;
    }

    private int q(boolean z10) throws IOException {
        byte bI;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f88746h.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bI = this.f88747i.I(i10);
                if (bI != 10 && bI != 32 && bI != 13 && bI != 9) {
                    break;
                }
                i10 = i11;
            }
            this.f88747i.skip(i10);
            if (bI == 47) {
                if (this.f88746h.request(2L)) {
                    j();
                    byte bI2 = this.f88747i.I(1L);
                    if (bI2 == 42) {
                        this.f88747i.readByte();
                        this.f88747i.readByte();
                        if (!I()) {
                            throw h("Unterminated comment");
                        }
                    } else if (bI2 == 47) {
                        this.f88747i.readByte();
                        this.f88747i.readByte();
                        N();
                    }
                }
                return bI;
            }
            if (bI != 35) {
                return bI;
            }
            j();
            N();
        }
    }

    private String r(o oVar) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jP2 = this.f88746h.P2(oVar);
            if (jP2 == -1) {
                throw h("Unterminated string");
            }
            if (this.f88747i.I(jP2) != 92) {
                if (sb2 == null) {
                    String strU5 = this.f88747i.u5(jP2);
                    this.f88747i.readByte();
                    return strU5;
                }
                sb2.append(this.f88747i.u5(jP2));
                this.f88747i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f88747i.u5(jP2));
            this.f88747i.readByte();
            sb2.append(E());
        }
    }

    private String t() throws IOException {
        long jP2 = this.f88746h.P2(f88736t);
        l lVar = this.f88747i;
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
    private int x() throws IOException {
        String str;
        String str2;
        int i10;
        byte bI = this.f88747i.I(0L);
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
            if (!this.f88746h.request(i12)) {
                return 0;
            }
            byte bI2 = this.f88747i.I(i11);
            if (bI2 != str.charAt(i11) && bI2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f88746h.request(length + 1) && o(this.f88747i.I(length))) {
            return 0;
        }
        this.f88747i.skip(length);
        this.f88748j = i10;
        return i10;
    }

    private int y() throws IOException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f88746h.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bI = this.f88747i.I(i11);
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
                            if (!o(bI)) {
                                break;
                            }
                            return 0;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j11 = -(bI + h.a.f339285u);
                            c10 = 2;
                        } else if (c10 == 2) {
                            if (j11 == 0) {
                                return 0;
                            }
                            long j12 = (10 * j11) - ((long) (bI + h.a.f339285u));
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
            this.f88749k = j11;
            this.f88747i.skip(i11);
            this.f88748j = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f88750l = i11;
        this.f88748j = 17;
        return 17;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void F0() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 4) {
            throw new a("Expected END_ARRAY but was " + c() + " at path " + S());
        }
        int i10 = this.f88690a;
        this.f88690a = i10 - 1;
        int[] iArr = this.f88693d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f88748j = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void F1() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 2) {
            throw new a("Expected END_OBJECT but was " + c() + " at path " + S());
        }
        int i10 = this.f88690a;
        int i11 = i10 - 1;
        this.f88690a = i11;
        this.f88692c[i11] = null;
        int[] iArr = this.f88693d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f88748j = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void J0() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 3) {
            d(1);
            this.f88693d[this.f88690a - 1] = 0;
            this.f88748j = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + c() + " at path " + S());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void a9() throws IOException {
        if (this.f88695f) {
            throw new a("Cannot skip unexpected " + c() + " at " + S());
        }
        int i10 = 0;
        do {
            int iL = this.f88748j;
            if (iL == 0) {
                iL = l();
            }
            if (iL == 3) {
                d(1);
            } else {
                if (iL == 1) {
                    d(3);
                } else if (iL == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + c() + " at path " + S());
                    }
                    this.f88690a--;
                } else if (iL == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + c() + " at path " + S());
                    }
                    this.f88690a--;
                } else if (iL == 14 || iL == 10) {
                    R();
                } else if (iL == 9 || iL == 13) {
                    H(f88734s);
                } else if (iL == 8 || iL == 12) {
                    H(f88726o);
                } else if (iL == 17) {
                    this.f88747i.skip(this.f88750l);
                } else if (iL == 18) {
                    throw new a("Expected a value but was " + c() + " at path " + S());
                }
                this.f88748j = 0;
            }
            i10++;
            this.f88748j = 0;
        } while (i10 != 0);
        int[] iArr = this.f88693d;
        int i11 = this.f88690a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f88692c[i11 - 1] = AbstractJsonLexerKt.NULL;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public c.b c() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        switch (iL) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f88748j = 0;
        this.f88691b[0] = 8;
        this.f88690a = 1;
        this.f88747i.c();
        this.f88746h.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public int e(c.a aVar) throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL < 12 || iL > 15) {
            return -1;
        }
        if (iL == 15) {
            return m(this.f88751m, aVar);
        }
        int iXf = this.f88746h.xf(aVar.f88697b);
        if (iXf != -1) {
            this.f88748j = 0;
            this.f88692c[this.f88690a - 1] = aVar.f88696a[iXf];
            return iXf;
        }
        String str = this.f88692c[this.f88690a - 1];
        String strNa = na();
        int iM = m(strNa, aVar);
        if (iM == -1) {
            this.f88748j = 15;
            this.f88751m = strNa;
            this.f88692c[this.f88690a - 1] = str;
        }
        return iM;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void f() throws IOException {
        if (this.f88695f) {
            throw new a("Cannot skip unexpected " + c() + " at " + S());
        }
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            R();
        } else if (iL == 13) {
            H(f88734s);
        } else if (iL == 12) {
            H(f88726o);
        } else if (iL != 15) {
            throw new a("Expected a name but was " + c() + " at path " + S());
        }
        this.f88748j = 0;
        this.f88692c[this.f88690a - 1] = AbstractJsonLexerKt.NULL;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public boolean hasNext() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        return (iL == 2 || iL == 4 || iL == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public String jc() throws IOException {
        String strU5;
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 10) {
            strU5 = t();
        } else if (iL == 9) {
            strU5 = r(f88734s);
        } else if (iL == 8) {
            strU5 = r(f88726o);
        } else if (iL == 11) {
            strU5 = this.f88751m;
            this.f88751m = null;
        } else if (iL == 16) {
            strU5 = Long.toString(this.f88749k);
        } else {
            if (iL != 17) {
                throw new a("Expected a string but was " + c() + " at path " + S());
            }
            strU5 = this.f88747i.u5(this.f88750l);
        }
        this.f88748j = 0;
        int[] iArr = this.f88693d;
        int i10 = this.f88690a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strU5;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void m1() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 1) {
            d(3);
            this.f88748j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + c() + " at path " + S());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public String na() throws IOException {
        String strR;
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            strR = t();
        } else if (iL == 13) {
            strR = r(f88734s);
        } else if (iL == 12) {
            strR = r(f88726o);
        } else {
            if (iL != 15) {
                throw new a("Expected a name but was " + c() + " at path " + S());
            }
            strR = this.f88751m;
        }
        this.f88748j = 0;
        this.f88692c[this.f88690a - 1] = strR;
        return strR;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public boolean nextBoolean() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 5) {
            this.f88748j = 0;
            int[] iArr = this.f88693d;
            int i10 = this.f88690a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iL == 6) {
            this.f88748j = 0;
            int[] iArr2 = this.f88693d;
            int i11 = this.f88690a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + c() + " at path " + S());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public double nextDouble() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 16) {
            this.f88748j = 0;
            int[] iArr = this.f88693d;
            int i10 = this.f88690a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f88749k;
        }
        if (iL == 17) {
            this.f88751m = this.f88747i.u5(this.f88750l);
        } else if (iL == 9) {
            this.f88751m = r(f88734s);
        } else if (iL == 8) {
            this.f88751m = r(f88726o);
        } else if (iL == 10) {
            this.f88751m = t();
        } else if (iL != 11) {
            throw new a("Expected a double but was " + c() + " at path " + S());
        }
        this.f88748j = 11;
        try {
            double d10 = Double.parseDouble(this.f88751m);
            if (this.f88694e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f88751m = null;
                this.f88748j = 0;
                int[] iArr2 = this.f88693d;
                int i11 = this.f88690a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new b("JSON forbids NaN and infinities: " + d10 + " at path " + S());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f88751m + " at path " + S());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public int nextInt() throws IOException {
        int iL = this.f88748j;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 16) {
            long j10 = this.f88749k;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f88748j = 0;
                int[] iArr = this.f88693d;
                int i11 = this.f88690a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new a("Expected an int but was " + this.f88749k + " at path " + S());
        }
        if (iL == 17) {
            this.f88751m = this.f88747i.u5(this.f88750l);
        } else if (iL == 9 || iL == 8) {
            String strR = iL == 9 ? r(f88734s) : r(f88726o);
            this.f88751m = strR;
            try {
                int i12 = Integer.parseInt(strR);
                this.f88748j = 0;
                int[] iArr2 = this.f88693d;
                int i13 = this.f88690a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iL != 11) {
            throw new a("Expected an int but was " + c() + " at path " + S());
        }
        this.f88748j = 11;
        try {
            double d10 = Double.parseDouble(this.f88751m);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f88751m = null;
                this.f88748j = 0;
                int[] iArr3 = this.f88693d;
                int i15 = this.f88690a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f88751m + " at path " + S());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f88751m + " at path " + S());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f88746h + ")";
    }
}
