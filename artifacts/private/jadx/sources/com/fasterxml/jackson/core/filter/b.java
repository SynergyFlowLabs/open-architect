package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.util.i;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class b extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected d f102334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f102335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f102336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    protected boolean f102337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected n f102338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected n f102339m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected e f102340n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected e f102341o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected d f102342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f102343t;

    public b(JsonParser jsonParser, d dVar, boolean z10, boolean z11) {
        super(jsonParser);
        this.f102334h = dVar;
        this.f102342s = dVar;
        this.f102340n = e.y(dVar);
        this.f102336j = z10;
        this.f102335i = z11;
    }

    private n t3(e eVar) throws IOException {
        this.f102341o = eVar;
        n nVarD = eVar.D();
        if (nVarD != null) {
            return nVarD;
        }
        while (eVar != this.f102340n) {
            eVar = this.f102341o.z(eVar);
            this.f102341o = eVar;
            if (eVar == null) {
                throw f("Unexpected problem: chain of filtered context broken");
            }
            n nVarD2 = eVar.D();
            if (nVarD2 != null) {
                return nVarD2;
            }
        }
        throw f("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean x3() throws IOException {
        int i10 = this.f102343t;
        if (i10 != 0 && !this.f102335i) {
            return false;
        }
        this.f102343t = i10 + 1;
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public boolean B1(boolean z10) throws IOException {
        return this.f102822g.B1(z10);
    }

    public int C3() {
        return this.f102343t;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public double E1() throws IOException {
        return this.f102822g.E1();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0198  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c2  */
    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public n E2() throws IOException {
        d dVarT;
        n nVarW3;
        boolean zC;
        d dVarA;
        d dVarT2;
        n nVarW4;
        d dVarQ;
        n nVarW5;
        d dVarT3;
        n nVar;
        if (!this.f102335i && (nVar = this.f102338l) != null && this.f102341o == null && nVar.r() && !this.f102340n.C() && !this.f102336j && this.f102342s == d.f102345a) {
            this.f102338l = null;
            return null;
        }
        e eVarZ = this.f102341o;
        if (eVarZ != null) {
            while (true) {
                n nVarD = eVarZ.D();
                if (nVarD != null) {
                    this.f102338l = nVarD;
                    return nVarD;
                }
                e eVar = this.f102340n;
                if (eVarZ == eVar) {
                    this.f102341o = null;
                    if (!eVarZ.k()) {
                        break;
                    }
                    n nVarG0 = this.f102822g.g0();
                    this.f102338l = nVarG0;
                    return nVarG0;
                }
                eVarZ = eVar.z(eVarZ);
                this.f102341o = eVarZ;
                if (eVarZ == null) {
                    throw f("Unexpected problem: chain of filtered context broken");
                }
            }
        }
        n nVarE2 = this.f102822g.E2();
        if (nVarE2 == null) {
            this.f102338l = nVarE2;
            return nVarE2;
        }
        int iO = nVarE2.o();
        if (iO == 1) {
            d dVar = this.f102342s;
            d dVar2 = d.f102345a;
            if (dVar == dVar2) {
                this.f102340n = this.f102340n.x(dVar, true);
                this.f102338l = nVarE2;
                return nVarE2;
            }
            if (dVar == null || (dVarT = this.f102340n.t(dVar)) == null) {
                this.f102822g.r3();
            } else {
                if (dVarT != dVar2) {
                    dVarT = dVarT.e();
                }
                this.f102342s = dVarT;
                if (dVarT == dVar2) {
                    this.f102340n = this.f102340n.x(dVarT, true);
                    this.f102338l = nVarE2;
                    return nVarE2;
                }
                e eVarX = this.f102340n.x(dVarT, false);
                this.f102340n = eVarX;
                if (this.f102336j && (nVarW3 = w3(eVarX)) != null) {
                    this.f102338l = nVarW3;
                    return nVarW3;
                }
            }
        } else if (iO != 2) {
            int i10 = 0 >> 3;
            if (iO == 3) {
                d dVar3 = this.f102342s;
                d dVar4 = d.f102345a;
                if (dVar3 == dVar4) {
                    this.f102340n = this.f102340n.w(dVar3, true);
                    this.f102338l = nVarE2;
                    return nVarE2;
                }
                if (dVar3 == null || (dVarT2 = this.f102340n.t(dVar3)) == null) {
                    this.f102822g.r3();
                } else {
                    if (dVarT2 != dVar4) {
                        dVarT2 = dVarT2.d();
                    }
                    this.f102342s = dVarT2;
                    if (dVarT2 == dVar4) {
                        this.f102340n = this.f102340n.w(dVarT2, true);
                        this.f102338l = nVarE2;
                        return nVarE2;
                    }
                    e eVarW = this.f102340n.w(dVarT2, false);
                    this.f102340n = eVarW;
                    if (this.f102336j && (nVarW4 = w3(eVarW)) != null) {
                        this.f102338l = nVarW4;
                        return nVarW4;
                    }
                }
            } else if (iO == 4) {
                zC = this.f102340n.C();
                dVarA = this.f102340n.A();
                if (dVarA != null && dVarA != d.f102345a) {
                    dVarA.b();
                }
                e eVarE = this.f102340n.e();
                this.f102340n = eVarE;
                this.f102342s = eVarE.A();
                if (zC) {
                    this.f102338l = nVarE2;
                    return nVarE2;
                }
            } else if (iO != 5) {
                d dVar5 = this.f102342s;
                d dVar6 = d.f102345a;
                if (dVar5 == dVar6) {
                    this.f102338l = nVarE2;
                    return nVarE2;
                }
                if (dVar5 != null && (((dVarT3 = this.f102340n.t(dVar5)) == dVar6 || (dVarT3 != null && dVarT3.u(this.f102822g))) && x3())) {
                    this.f102338l = nVarE2;
                    return nVarE2;
                }
            } else {
                String strF0 = this.f102822g.f0();
                d dVarF = this.f102340n.F(strF0);
                d dVar7 = d.f102345a;
                if (dVarF == dVar7) {
                    this.f102342s = dVarF;
                    if (!this.f102336j && this.f102337k && !this.f102340n.C()) {
                        nVarE2 = this.f102340n.D();
                        this.f102341o = this.f102340n;
                    }
                    this.f102338l = nVarE2;
                    return nVarE2;
                }
                if (dVarF == null || (dVarQ = dVarF.q(strF0)) == null) {
                    this.f102822g.E2();
                    this.f102822g.r3();
                } else {
                    this.f102342s = dVarQ;
                    if (dVarQ == dVar7) {
                        if (!x3()) {
                            this.f102822g.E2();
                            this.f102822g.r3();
                        } else if (this.f102336j) {
                            this.f102338l = nVarE2;
                            return nVarE2;
                        }
                    }
                    if (this.f102336j && (nVarW5 = w3(this.f102340n)) != null) {
                        this.f102338l = nVarW5;
                        return nVarW5;
                    }
                }
            }
        } else {
            zC = this.f102340n.C();
            dVarA = this.f102340n.A();
            if (dVarA != null) {
                dVarA.b();
            }
            e eVarE2 = this.f102340n.e();
            this.f102340n = eVarE2;
            this.f102342s = eVarE2.A();
            if (zC) {
                this.f102338l = nVarE2;
                return nVarE2;
            }
        }
        return v3();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public n G2() throws IOException {
        n nVarE2 = E2();
        return nVarE2 == n.FIELD_NAME ? E2() : nVarE2;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public BigInteger I() throws IOException {
        return this.f102822g.I();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public double J1(double d10) throws IOException {
        return this.f102822g.J1(d10);
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public void J2(String str) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public int M0() throws IOException {
        return this.f102822g.M0();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public n O0() {
        return this.f102339m;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public int O1() throws IOException {
        return this.f102822g.O1();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public int O2(com.fasterxml.jackson.core.a aVar, OutputStream outputStream) throws IOException {
        return this.f102822g.O2(aVar, outputStream);
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public long Q0() throws IOException {
        return this.f102822g.Q0();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public byte[] R(com.fasterxml.jackson.core.a aVar) throws IOException {
        return this.f102822g.R(aVar);
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public boolean T() throws IOException {
        return this.f102822g.T();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public JsonParser.b T0() throws IOException {
        return this.f102822g.T0();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public int T1(int i10) throws IOException {
        return this.f102822g.T1(i10);
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public Number U0() throws IOException {
        return this.f102822g.U0();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public byte X() throws IOException {
        return this.f102822g.X();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public long b2() throws IOException {
        return this.f102822g.b2();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public long c2(long j10) throws IOException {
        return this.f102822g.c2(j10);
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i d0() {
        return this.f102822g.d0();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public m d1() {
        return s3();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public String d2() throws IOException {
        return this.f102822g.d2();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public String e2(String str) throws IOException {
        return this.f102822g.e2(str);
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public String f0() throws IOException {
        m mVarS3 = s3();
        n nVar = this.f102338l;
        if (nVar != n.START_OBJECT && nVar != n.START_ARRAY) {
            return mVarS3.b();
        }
        m mVarE = mVarS3.e();
        if (mVarE == null) {
            return null;
        }
        return mVarE.b();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public boolean f2() {
        return this.f102338l != null;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public n g0() {
        return this.f102338l;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public short g1() throws IOException {
        return this.f102822g.g1();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public boolean i2() {
        return this.f102822g.i2();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public final int j0() {
        n nVar = this.f102338l;
        if (nVar == null) {
            return 0;
        }
        return nVar.o();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public String j1() throws IOException {
        return this.f102822g.j1();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public char[] l1() throws IOException {
        return this.f102822g.l1();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public final boolean n2(n nVar) {
        return this.f102338l == nVar;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public void o() {
        n nVar = this.f102338l;
        if (nVar != null) {
            this.f102339m = nVar;
            this.f102338l = null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public BigDecimal o0() throws IOException {
        return this.f102822g.o0();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public int o1() throws IOException {
        return this.f102822g.o1();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public boolean o2(int i10) {
        n nVar = this.f102338l;
        if (nVar == null) {
            return i10 == 0;
        }
        return nVar.o() == i10;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public int p1() throws IOException {
        return this.f102822g.p1();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public boolean q2() {
        return this.f102338l == n.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public double r0() throws IOException {
        return this.f102822g.r0();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public JsonParser r3() throws IOException {
        n nVar = this.f102338l;
        if (nVar == n.START_OBJECT || nVar == n.START_ARRAY) {
            int i10 = 1;
            while (true) {
                n nVarE2 = E2();
                if (nVarE2 == null) {
                    break;
                }
                if (!nVarE2.t()) {
                    if (nVarE2.s() && (i10 = i10 - 1) == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.i s1() {
        return this.f102822g.s1();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public boolean s2() {
        return this.f102338l == n.START_OBJECT;
    }

    protected m s3() {
        e eVar = this.f102341o;
        return eVar != null ? eVar : this.f102340n;
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public n t() {
        return this.f102338l;
    }

    protected final n v3() throws IOException {
        d dVarT;
        n nVarW3;
        n nVarW4;
        n nVarW5;
        while (true) {
            n nVarE2 = this.f102822g.E2();
            if (nVarE2 == null) {
                this.f102338l = nVarE2;
                return nVarE2;
            }
            int iO = nVarE2.o();
            if (iO != 1) {
                if (iO != 2) {
                    if (iO == 3) {
                        d dVar = this.f102342s;
                        d dVar2 = d.f102345a;
                        if (dVar == dVar2) {
                            this.f102340n = this.f102340n.w(dVar, true);
                            this.f102338l = nVarE2;
                            return nVarE2;
                        }
                        if (dVar == null) {
                            this.f102822g.r3();
                        } else {
                            d dVarT2 = this.f102340n.t(dVar);
                            if (dVarT2 == null) {
                                this.f102822g.r3();
                            } else {
                                if (dVarT2 != dVar2) {
                                    dVarT2 = dVarT2.d();
                                }
                                this.f102342s = dVarT2;
                                if (dVarT2 == dVar2) {
                                    this.f102340n = this.f102340n.w(dVarT2, true);
                                    this.f102338l = nVarE2;
                                    return nVarE2;
                                }
                                e eVarW = this.f102340n.w(dVarT2, false);
                                this.f102340n = eVarW;
                                if (this.f102336j && (nVarW4 = w3(eVarW)) != null) {
                                    this.f102338l = nVarW4;
                                    return nVarW4;
                                }
                            }
                        }
                    } else if (iO != 4) {
                        if (iO != 5) {
                            d dVar3 = this.f102342s;
                            d dVar4 = d.f102345a;
                            if (dVar3 == dVar4) {
                                this.f102338l = nVarE2;
                                return nVarE2;
                            }
                            if (dVar3 != null && ((dVarT = this.f102340n.t(dVar3)) == dVar4 || (dVarT != null && dVarT.u(this.f102822g)))) {
                                if (x3()) {
                                    this.f102338l = nVarE2;
                                    return nVarE2;
                                }
                            }
                        } else {
                            String strF0 = this.f102822g.f0();
                            d dVarF = this.f102340n.F(strF0);
                            d dVar5 = d.f102345a;
                            if (dVarF == dVar5) {
                                this.f102342s = dVarF;
                                this.f102338l = nVarE2;
                                return nVarE2;
                            }
                            if (dVarF == null) {
                                this.f102822g.E2();
                                this.f102822g.r3();
                            } else {
                                d dVarQ = dVarF.q(strF0);
                                if (dVarQ == null) {
                                    this.f102822g.E2();
                                    this.f102822g.r3();
                                } else {
                                    this.f102342s = dVarQ;
                                    if (dVarQ == dVar5) {
                                        if (x3() && this.f102336j) {
                                            this.f102338l = nVarE2;
                                            return nVarE2;
                                        }
                                    } else if (this.f102336j && (nVarW3 = w3(this.f102340n)) != null) {
                                        this.f102338l = nVarW3;
                                        return nVarW3;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean zC = this.f102340n.C();
                d dVarA = this.f102340n.A();
                if (dVarA != null && dVarA != d.f102345a) {
                    dVarA.b();
                }
                e eVarE = this.f102340n.e();
                this.f102340n = eVarE;
                this.f102342s = eVarE.A();
                if (zC) {
                    this.f102338l = nVarE2;
                    return nVarE2;
                }
            } else {
                d dVar6 = this.f102342s;
                d dVar7 = d.f102345a;
                if (dVar6 == dVar7) {
                    this.f102340n = this.f102340n.x(dVar6, true);
                    this.f102338l = nVarE2;
                    return nVarE2;
                }
                if (dVar6 == null) {
                    this.f102822g.r3();
                } else {
                    d dVarT3 = this.f102340n.t(dVar6);
                    if (dVarT3 == null) {
                        this.f102822g.r3();
                    } else {
                        if (dVarT3 != dVar7) {
                            dVarT3 = dVarT3.e();
                        }
                        this.f102342s = dVarT3;
                        if (dVarT3 == dVar7) {
                            this.f102340n = this.f102340n.x(dVarT3, true);
                            this.f102338l = nVarE2;
                            return nVarE2;
                        }
                        e eVarX = this.f102340n.x(dVarT3, false);
                        this.f102340n = eVarX;
                        if (this.f102336j && (nVarW5 = w3(eVarX)) != null) {
                            this.f102338l = nVarW5;
                            return nVarW5;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public Object w0() throws IOException {
        return this.f102822g.w0();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public boolean w1() throws IOException {
        return this.f102822g.w1();
    }

    protected final n w3(e eVar) throws IOException {
        d dVarT;
        while (true) {
            n nVarE2 = this.f102822g.E2();
            if (nVarE2 == null) {
                return nVarE2;
            }
            int iO = nVarE2.o();
            boolean z10 = false;
            if (iO != 1) {
                if (iO != 2) {
                    if (iO == 3) {
                        d dVarT2 = this.f102340n.t(this.f102342s);
                        if (dVarT2 == null) {
                            this.f102822g.r3();
                        } else {
                            d dVar = d.f102345a;
                            if (dVarT2 != dVar) {
                                dVarT2 = dVarT2.d();
                            }
                            this.f102342s = dVarT2;
                            if (dVarT2 == dVar) {
                                this.f102340n = this.f102340n.w(dVarT2, true);
                                return t3(eVar);
                            }
                            this.f102340n = this.f102340n.w(dVarT2, false);
                        }
                    } else if (iO != 4) {
                        if (iO != 5) {
                            d dVar2 = this.f102342s;
                            d dVar3 = d.f102345a;
                            if (dVar2 == dVar3) {
                                return t3(eVar);
                            }
                            if (dVar2 != null && ((dVarT = this.f102340n.t(dVar2)) == dVar3 || (dVarT != null && dVarT.u(this.f102822g)))) {
                                if (x3()) {
                                    return t3(eVar);
                                }
                            }
                        } else {
                            String strF0 = this.f102822g.f0();
                            d dVarF = this.f102340n.F(strF0);
                            d dVar4 = d.f102345a;
                            if (dVarF == dVar4) {
                                this.f102342s = dVarF;
                                return t3(eVar);
                            }
                            if (dVarF == null) {
                                this.f102822g.E2();
                                this.f102822g.r3();
                            } else {
                                d dVarQ = dVarF.q(strF0);
                                if (dVarQ == null) {
                                    this.f102822g.E2();
                                    this.f102822g.r3();
                                } else {
                                    this.f102342s = dVarQ;
                                    if (dVarQ != dVar4) {
                                        continue;
                                    } else {
                                        if (x3()) {
                                            return t3(eVar);
                                        }
                                        this.f102342s = this.f102340n.F(strF0);
                                    }
                                }
                            }
                        }
                    }
                }
                d dVarA = this.f102340n.A();
                if (dVarA != null && dVarA != d.f102345a) {
                    dVarA.b();
                }
                e eVar2 = this.f102340n;
                if (eVar2 == eVar && eVar2.C()) {
                    z10 = true;
                }
                e eVarE = this.f102340n.e();
                this.f102340n = eVarE;
                this.f102342s = eVarE.A();
                if (z10) {
                    return nVarE2;
                }
            } else {
                d dVar5 = this.f102342s;
                d dVar6 = d.f102345a;
                if (dVar5 == dVar6) {
                    this.f102340n = this.f102340n.x(dVar5, true);
                    return nVarE2;
                }
                if (dVar5 == null) {
                    this.f102822g.r3();
                } else {
                    d dVarT3 = this.f102340n.t(dVar5);
                    if (dVarT3 == null) {
                        this.f102822g.r3();
                    } else {
                        if (dVarT3 != dVar6) {
                            dVarT3 = dVarT3.e();
                        }
                        this.f102342s = dVarT3;
                        if (dVarT3 == dVar6) {
                            this.f102340n = this.f102340n.x(dVarT3, true);
                            return t3(eVar);
                        }
                        this.f102340n = this.f102340n.x(dVarT3, false);
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public final int x() {
        n nVar = this.f102338l;
        if (nVar == null) {
            return 0;
        }
        return nVar.o();
    }

    @Override // com.fasterxml.jackson.core.util.i, com.fasterxml.jackson.core.JsonParser
    public float y0() throws IOException {
        return this.f102822g.y0();
    }

    public d y3() {
        return this.f102334h;
    }
}
