package com.google.zxing.oned.rss.expanded.decoders;

import kotlin.text.b0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.a f130721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f130722b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StringBuilder f130723c = new StringBuilder();

    s(com.google.zxing.common.a aVar) {
        this.f130721a = aVar;
    }

    private n b(int i10) {
        char c10;
        int iF = f(i10, 5);
        if (iF == 15) {
            return new n(i10 + 5, '$');
        }
        if (iF >= 5 && iF < 15) {
            return new n(i10 + 5, (char) (iF + 43));
        }
        int iF2 = f(i10, 6);
        if (iF2 >= 32 && iF2 < 58) {
            return new n(i10 + 6, (char) (iF2 + 33));
        }
        switch (iF2) {
            case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                c10 = '*';
                break;
            case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                c10 = AbstractJsonLexerKt.COMMA;
                break;
            case 60:
                c10 = org.apache.commons.codec.language.l.f335457d;
                break;
            case 61:
                c10 = '.';
                break;
            case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(iF2)));
        }
        return new n(i10 + 6, c10);
    }

    private n d(int i10) throws com.google.zxing.h {
        int iF = f(i10, 5);
        if (iF == 15) {
            return new n(i10 + 5, '$');
        }
        char c10 = '+';
        if (iF >= 5 && iF < 15) {
            return new n(i10 + 5, (char) (iF + 43));
        }
        int iF2 = f(i10, 7);
        if (iF2 >= 64 && iF2 < 90) {
            return new n(i10 + 7, (char) (iF2 + 1));
        }
        if (iF2 >= 90 && iF2 < 116) {
            return new n(i10 + 7, (char) (iF2 + 7));
        }
        switch (f(i10, 8)) {
            case 232:
                c10 = '!';
                break;
            case 233:
                c10 = '\"';
                break;
            case 234:
                c10 = '%';
                break;
            case 235:
                c10 = b0.f313279d;
                break;
            case 236:
                c10 = '\'';
                break;
            case 237:
                c10 = '(';
                break;
            case 238:
                c10 = ')';
                break;
            case 239:
                c10 = '*';
                break;
            case 240:
                break;
            case 241:
                c10 = AbstractJsonLexerKt.COMMA;
                break;
            case 242:
                c10 = org.apache.commons.codec.language.l.f335457d;
                break;
            case com.planner5d.library.engine.input.f.b.M1 /* 243 */:
                c10 = '.';
                break;
            case 244:
                c10 = '/';
                break;
            case com.planner5d.library.engine.input.f.b.O1 /* 245 */:
                c10 = AbstractJsonLexerKt.COLON;
                break;
            case com.planner5d.library.engine.input.f.b.P1 /* 246 */:
                c10 = ';';
                break;
            case com.planner5d.library.engine.input.f.b.Q1 /* 247 */:
                c10 = b0.f313280e;
                break;
            case com.planner5d.library.engine.input.f.b.R1 /* 248 */:
                c10 = '=';
                break;
            case com.planner5d.library.engine.input.f.b.S1 /* 249 */:
                c10 = b0.f313281f;
                break;
            case 250:
                c10 = '?';
                break;
            case com.planner5d.library.engine.input.f.b.U1 /* 251 */:
                c10 = '_';
                break;
            case com.planner5d.library.engine.input.f.b.V1 /* 252 */:
                c10 = ' ';
                break;
            default:
                throw com.google.zxing.h.a();
        }
        return new n(i10 + 8, c10);
    }

    private p e(int i10) throws com.google.zxing.h {
        int i11 = i10 + 7;
        if (i11 > this.f130721a.l()) {
            int iF = f(i10, 4);
            return iF == 0 ? new p(this.f130721a.l(), 10, 10) : new p(this.f130721a.l(), iF - 1, 10);
        }
        int iF2 = f(i10, 7) - 8;
        return new p(i11, iF2 / 11, iF2 % 11);
    }

    static int g(com.google.zxing.common.a aVar, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (aVar.h(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    private boolean h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f130721a.l()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f130721a.h(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private boolean i(int i10) {
        int i11;
        if (i10 + 1 > this.f130721a.l()) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i11 = i12 + i10) < this.f130721a.l(); i12++) {
            if (i12 == 2) {
                if (!this.f130721a.h(i10 + 2)) {
                    return false;
                }
            } else if (this.f130721a.h(i11)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(int i10) {
        int i11;
        if (i10 + 1 > this.f130721a.l()) {
            return false;
        }
        for (int i12 = 0; i12 < 4 && (i11 = i12 + i10) < this.f130721a.l(); i12++) {
            if (this.f130721a.h(i11)) {
                return false;
            }
        }
        return true;
    }

    private boolean k(int i10) {
        if (i10 + 5 > this.f130721a.l()) {
            return false;
        }
        int iF = f(i10, 5);
        if (iF >= 5 && iF < 16) {
            return true;
        }
        if (i10 + 6 > this.f130721a.l()) {
            return false;
        }
        int iF2 = f(i10, 6);
        return iF2 >= 16 && iF2 < 63;
    }

    private boolean l(int i10) {
        int iF;
        if (i10 + 5 > this.f130721a.l()) {
            return false;
        }
        int iF2 = f(i10, 5);
        if (iF2 >= 5 && iF2 < 16) {
            return true;
        }
        if (i10 + 7 > this.f130721a.l()) {
            return false;
        }
        int iF3 = f(i10, 7);
        if (iF3 < 64 || iF3 >= 116) {
            return i10 + 8 <= this.f130721a.l() && (iF = f(i10, 8)) >= 232 && iF < 253;
        }
        return true;
    }

    private boolean m(int i10) {
        if (i10 + 7 > this.f130721a.l()) {
            return i10 + 4 <= this.f130721a.l();
        }
        int i11 = i10;
        while (true) {
            int i12 = i10 + 3;
            if (i11 >= i12) {
                return this.f130721a.h(i12);
            }
            if (this.f130721a.h(i11)) {
                return true;
            }
            i11++;
        }
    }

    private l n() {
        while (k(this.f130722b.a())) {
            n nVarB = b(this.f130722b.a());
            this.f130722b.i(nVarB.a());
            if (nVarB.c()) {
                return new l(new o(this.f130722b.a(), this.f130723c.toString()), true);
            }
            this.f130723c.append(nVarB.b());
        }
        if (h(this.f130722b.a())) {
            this.f130722b.b(3);
            this.f130722b.h();
        } else if (i(this.f130722b.a())) {
            if (this.f130722b.a() + 5 < this.f130721a.l()) {
                this.f130722b.b(5);
            } else {
                this.f130722b.i(this.f130721a.l());
            }
            this.f130722b.g();
        }
        return new l(false);
    }

    private o o() throws com.google.zxing.h {
        l lVarQ;
        boolean zB;
        do {
            int iA = this.f130722b.a();
            if (this.f130722b.c()) {
                lVarQ = n();
                zB = lVarQ.b();
            } else if (this.f130722b.d()) {
                lVarQ = p();
                zB = lVarQ.b();
            } else {
                lVarQ = q();
                zB = lVarQ.b();
            }
            if (iA == this.f130722b.a() && !zB) {
                break;
            }
        } while (!zB);
        return lVarQ.a();
    }

    private l p() throws com.google.zxing.h {
        while (l(this.f130722b.a())) {
            n nVarD = d(this.f130722b.a());
            this.f130722b.i(nVarD.a());
            if (nVarD.c()) {
                return new l(new o(this.f130722b.a(), this.f130723c.toString()), true);
            }
            this.f130723c.append(nVarD.b());
        }
        if (h(this.f130722b.a())) {
            this.f130722b.b(3);
            this.f130722b.h();
        } else if (i(this.f130722b.a())) {
            if (this.f130722b.a() + 5 < this.f130721a.l()) {
                this.f130722b.b(5);
            } else {
                this.f130722b.i(this.f130721a.l());
            }
            this.f130722b.f();
        }
        return new l(false);
    }

    private l q() throws com.google.zxing.h {
        while (m(this.f130722b.a())) {
            p pVarE = e(this.f130722b.a());
            this.f130722b.i(pVarE.a());
            if (pVarE.f()) {
                return new l(pVarE.g() ? new o(this.f130722b.a(), this.f130723c.toString()) : new o(this.f130722b.a(), this.f130723c.toString(), pVarE.c()), true);
            }
            this.f130723c.append(pVarE.b());
            if (pVarE.g()) {
                return new l(new o(this.f130722b.a(), this.f130723c.toString()), true);
            }
            this.f130723c.append(pVarE.c());
        }
        if (j(this.f130722b.a())) {
            this.f130722b.f();
            this.f130722b.b(4);
        }
        return new l(false);
    }

    String a(StringBuilder sb2, int i10) throws com.google.zxing.m, com.google.zxing.h {
        String str = null;
        while (true) {
            o oVarC = c(i10, str);
            String strA = r.a(oVarC.b());
            if (strA != null) {
                sb2.append(strA);
            }
            String strValueOf = oVarC.d() ? String.valueOf(oVarC.c()) : null;
            if (i10 == oVarC.a()) {
                return sb2.toString();
            }
            i10 = oVarC.a();
            str = strValueOf;
        }
    }

    o c(int i10, String str) throws com.google.zxing.h {
        this.f130723c.setLength(0);
        if (str != null) {
            this.f130723c.append(str);
        }
        this.f130722b.i(i10);
        o oVarO = o();
        return (oVarO == null || !oVarO.d()) ? new o(this.f130722b.a(), this.f130723c.toString()) : new o(this.f130722b.a(), this.f130723c.toString(), oVarO.c());
    }

    int f(int i10, int i11) {
        return g(this.f130721a, i10, i11);
    }
}
