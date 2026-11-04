package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.s;
import com.fasterxml.jackson.core.util.h;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public class a extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected d f102327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f102328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f102329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    protected boolean f102330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected e f102331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected d f102332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f102333j;

    public a(com.fasterxml.jackson.core.h hVar, d dVar, boolean z10, boolean z11) {
        super(hVar, false);
        this.f102327d = dVar;
        this.f102332i = dVar;
        this.f102331h = e.y(dVar);
        this.f102329f = z10;
        this.f102328e = z11;
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void B1(s sVar) throws IOException {
        d dVarF = this.f102331h.F(sVar.getValue());
        if (dVarF == null) {
            this.f102332i = null;
            return;
        }
        d dVar = d.f102345a;
        if (dVarF == dVar) {
            this.f102332i = dVarF;
            this.f102820b.B1(sVar);
            return;
        }
        d dVarQ = dVarF.q(sVar.getValue());
        this.f102332i = dVarQ;
        if (dVarQ == dVar) {
            w3();
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void B2(String str) throws IOException {
        if (this.f102332i != null) {
            this.f102820b.B2(str);
        }
    }

    public m C3() {
        return this.f102331h;
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void D2(char c10) throws IOException {
        if (x3()) {
            this.f102820b.D2(c10);
        }
    }

    public int D3() {
        return this.f102333j;
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void E1(String str) throws IOException {
        d dVarF = this.f102331h.F(str);
        if (dVarF == null) {
            this.f102332i = null;
            return;
        }
        d dVar = d.f102345a;
        if (dVarF == dVar) {
            this.f102332i = dVarF;
            this.f102820b.E1(str);
        } else {
            d dVarQ = dVarF.q(str);
            this.f102332i = dVarQ;
            if (dVarQ == dVar) {
                w3();
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void E2(s sVar) throws IOException {
        if (x3()) {
            this.f102820b.E2(sVar);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void G2(String str) throws IOException {
        if (x3()) {
            this.f102820b.G2(str);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void J1() throws IOException {
        d dVar = this.f102332i;
        if (dVar != null) {
            d dVar2 = d.f102345a;
            if (dVar != dVar2) {
                d dVarT = this.f102331h.t(dVar);
                if (dVarT != null && (dVarT == dVar2 || dVarT.j())) {
                    v3();
                }
            }
            this.f102820b.J1();
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void J2(String str, int i10, int i11) throws IOException {
        if (x3()) {
            this.f102820b.G2(str);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void L2(char[] cArr, int i10, int i11) throws IOException {
        if (x3()) {
            this.f102820b.L2(cArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void N2(byte[] bArr, int i10, int i11) throws IOException {
        if (x3()) {
            this.f102820b.N2(bArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void Q2(String str) throws IOException {
        if (x3()) {
            this.f102820b.G2(str);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void R2(String str, int i10, int i11) throws IOException {
        if (x3()) {
            this.f102820b.J2(str, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void T1(double d10) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.k(d10)) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.T1(d10);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void T2(char[] cArr, int i10, int i11) throws IOException {
        if (x3()) {
            this.f102820b.L2(cArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void U2() throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            this.f102331h = this.f102331h.w(null, false);
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar == dVar2) {
            this.f102331h = this.f102331h.w(dVar, true);
            this.f102820b.U2();
            return;
        }
        d dVarT = this.f102331h.t(dVar);
        this.f102332i = dVarT;
        if (dVarT == null) {
            this.f102331h = this.f102331h.w(null, false);
            return;
        }
        if (dVarT != dVar2) {
            this.f102332i = dVarT.d();
        }
        d dVar3 = this.f102332i;
        if (dVar3 != dVar2) {
            this.f102331h = this.f102331h.w(dVar3, false);
            return;
        }
        v3();
        this.f102331h = this.f102331h.w(this.f102332i, true);
        this.f102820b.U2();
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void W2(int i10) throws IOException {
        d dVar = this.f102332i;
        int i11 = 0 << 0;
        if (dVar == null) {
            this.f102331h = this.f102331h.w(null, false);
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar == dVar2) {
            this.f102331h = this.f102331h.w(dVar, true);
            this.f102820b.W2(i10);
            return;
        }
        d dVarT = this.f102331h.t(dVar);
        this.f102332i = dVarT;
        if (dVarT == null) {
            this.f102331h = this.f102331h.w(null, false);
            return;
        }
        if (dVarT != dVar2) {
            this.f102332i = dVarT.d();
        }
        d dVar3 = this.f102332i;
        if (dVar3 != dVar2) {
            this.f102331h = this.f102331h.w(dVar3, false);
            return;
        }
        v3();
        this.f102331h = this.f102331h.w(this.f102332i, true);
        this.f102820b.W2(i10);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public m X() {
        return this.f102331h;
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void X2() throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            this.f102331h = this.f102331h.x(dVar, false);
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar == dVar2) {
            this.f102331h = this.f102331h.x(dVar, true);
            this.f102820b.X2();
            return;
        }
        d dVarT = this.f102331h.t(dVar);
        if (dVarT == null) {
            return;
        }
        if (dVarT != dVar2) {
            dVarT = dVarT.e();
        }
        if (dVarT != dVar2) {
            this.f102331h = this.f102331h.x(dVarT, false);
            return;
        }
        v3();
        this.f102331h = this.f102331h.x(dVarT, true);
        this.f102820b.X2();
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void Y2(Object obj) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            this.f102331h = this.f102331h.x(dVar, false);
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar == dVar2) {
            this.f102331h = this.f102331h.x(dVar, true);
            this.f102820b.Y2(obj);
            return;
        }
        d dVarT = this.f102331h.t(dVar);
        if (dVarT == null) {
            return;
        }
        if (dVarT != dVar2) {
            dVarT = dVarT.e();
        }
        if (dVarT != dVar2) {
            this.f102331h = this.f102331h.x(dVarT, false);
            return;
        }
        v3();
        this.f102331h = this.f102331h.x(dVarT, true);
        this.f102820b.Y2(obj);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void Z2(s sVar) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.t(sVar.getValue())) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.Z2(sVar);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public int b1(com.fasterxml.jackson.core.a aVar, InputStream inputStream, int i10) throws IOException {
        if (t3()) {
            return this.f102820b.b1(aVar, inputStream, i10);
        }
        return -1;
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void b2(float f10) throws IOException {
        d dVar = this.f102332i;
        if (dVar != null) {
            d dVar2 = d.f102345a;
            if (dVar != dVar2) {
                d dVarT = this.f102331h.t(dVar);
                if (dVarT != null && (dVarT == dVar2 || dVarT.l(f10))) {
                    v3();
                }
            }
            this.f102820b.b2(f10);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void c2(int i10) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.m(i10)) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.c2(i10);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void d2(long j10) throws IOException {
        d dVar = this.f102332i;
        if (dVar != null) {
            d dVar2 = d.f102345a;
            if (dVar != dVar2) {
                d dVarT = this.f102331h.t(dVar);
                if (dVarT != null && (dVarT == dVar2 || dVarT.n(j10))) {
                    v3();
                }
            }
            this.f102820b.d2(j10);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void e1(com.fasterxml.jackson.core.a aVar, byte[] bArr, int i10, int i11) throws IOException {
        if (t3()) {
            this.f102820b.e1(aVar, bArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void e2(String str) throws UnsupportedOperationException, IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.r()) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.e2(str);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void e3(String str) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.t(str)) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.e3(str);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void f2(BigDecimal bigDecimal) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.o(bigDecimal)) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.f2(bigDecimal);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void f3(char[] cArr, int i10, int i11) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            String str = new String(cArr, i10, i11);
            d dVarT = this.f102331h.t(this.f102332i);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.t(str)) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.f3(cArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void i2(BigInteger bigInteger) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.p(bigInteger)) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.i2(bigInteger);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void l1(boolean z10) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.g(z10)) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.l1(z10);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void l3(Object obj) throws IOException {
        if (this.f102332i != null) {
            this.f102820b.l3(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void n2(short s10) throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return;
        }
        d dVar2 = d.f102345a;
        if (dVar != dVar2) {
            d dVarT = this.f102331h.t(dVar);
            if (dVarT == null) {
                return;
            }
            if (dVarT != dVar2 && !dVarT.m(s10)) {
                return;
            } else {
                v3();
            }
        }
        this.f102820b.n2(s10);
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void r3(byte[] bArr, int i10, int i11) throws IOException {
        if (x3()) {
            this.f102820b.r3(bArr, i10, i11);
        }
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void s1() throws IOException {
        e eVarU = this.f102331h.u(this.f102820b);
        this.f102331h = eVarU;
        if (eVarU != null) {
            this.f102332i = eVarU.A();
        }
    }

    protected boolean t3() throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return false;
        }
        if (dVar == d.f102345a) {
            return true;
        }
        if (!dVar.f()) {
            return false;
        }
        v3();
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void u1() throws IOException {
        e eVarV = this.f102331h.v(this.f102820b);
        this.f102331h = eVarV;
        if (eVarV != null) {
            this.f102332i = eVarV.A();
        }
    }

    protected void v3() throws IOException {
        this.f102333j++;
        if (this.f102329f) {
            this.f102331h.I(this.f102820b);
        }
        if (!this.f102328e) {
            this.f102331h.G();
        }
    }

    protected void w3() throws IOException {
        this.f102333j++;
        if (this.f102329f) {
            this.f102331h.I(this.f102820b);
        } else if (this.f102330g) {
            this.f102331h.H(this.f102820b);
        }
        if (this.f102328e) {
            return;
        }
        this.f102331h.G();
    }

    protected boolean x3() throws IOException {
        d dVar = this.f102332i;
        if (dVar == null) {
            return false;
        }
        if (dVar == d.f102345a) {
            return true;
        }
        if (!dVar.r()) {
            return false;
        }
        v3();
        return true;
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void y2(Object obj) throws IOException {
        if (this.f102332i != null) {
            this.f102820b.y2(obj);
        }
    }

    public d y3() {
        return this.f102327d;
    }

    @Override // com.fasterxml.jackson.core.util.h, com.fasterxml.jackson.core.h
    public void z2(Object obj) throws IOException {
        if (this.f102332i != null) {
            this.f102820b.z2(obj);
        }
    }
}
