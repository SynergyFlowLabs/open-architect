package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class l6 implements s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k6 f109195a;

    private l6(k6 k6Var) {
        byte[] bArr = j7.f109152b;
        this.f109195a = k6Var;
        k6Var.f109165a = this;
    }

    public static l6 L(k6 k6Var) {
        l6 l6Var = k6Var.f109165a;
        return l6Var != null ? l6Var : new l6(k6Var);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void A(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof s7)) {
            while (i11 < list.size()) {
                this.f109195a.s(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        s7 s7Var = (s7) list;
        while (i11 < list.size()) {
            Object objH = s7Var.h();
            if (objH instanceof String) {
                this.f109195a.s(i10, (String) objH);
            } else {
                this.f109195a.h(i10, (d6) objH);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void B(int i10, long j10) throws IOException {
        this.f109195a.w(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void C(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f109195a.h(i10, (d6) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void D(int i10, long j10) throws IOException {
        this.f109195a.w(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void E(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof f7) {
            f7 f7Var = (f7) list;
            if (z10) {
                this.f109195a.t(i10, 2);
                int iA = 0;
                for (int i12 = 0; i12 < f7Var.size(); i12++) {
                    iA += k6.a(f7Var.d(i12));
                }
                this.f109195a.v(iA);
                while (i11 < f7Var.size()) {
                    this.f109195a.n(f7Var.d(i11));
                    i11++;
                }
            } else {
                while (i11 < f7Var.size()) {
                    this.f109195a.m(i10, f7Var.d(i11));
                    i11++;
                }
            }
        } else if (z10) {
            this.f109195a.t(i10, 2);
            int iA2 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iA2 += k6.a(((Integer) list.get(i13)).intValue());
            }
            this.f109195a.v(iA2);
            while (i11 < list.size()) {
                this.f109195a.n(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f109195a.m(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void F(int i10, int i11) throws IOException {
        this.f109195a.m(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void G(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof w7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.k(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.f109195a.v(i12);
            while (i11 < list.size()) {
                this.f109195a.l(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        w7 w7Var = (w7) list;
        if (!z10) {
            while (i11 < w7Var.size()) {
                this.f109195a.k(i10, w7Var.d(i11));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < w7Var.size(); i15++) {
            w7Var.d(i15);
            i14 += 8;
        }
        this.f109195a.v(i14);
        while (i11 < w7Var.size()) {
            this.f109195a.l(w7Var.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void H(int i10, int i11) throws IOException {
        this.f109195a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void I(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof x6)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.i(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f109195a.v(i12);
            while (i11 < list.size()) {
                this.f109195a.j(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        x6 x6Var = (x6) list;
        if (!z10) {
            while (i11 < x6Var.size()) {
                this.f109195a.i(i10, Float.floatToRawIntBits(x6Var.d(i11)));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < x6Var.size(); i15++) {
            x6Var.d(i15);
            i14 += 4;
        }
        this.f109195a.v(i14);
        while (i11 < x6Var.size()) {
            this.f109195a.j(Float.floatToRawIntBits(x6Var.d(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void J(int i10, long j10) throws IOException {
        this.f109195a.k(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void K(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof w7) {
            w7 w7Var = (w7) list;
            if (z10) {
                this.f109195a.t(i10, 2);
                int iA = 0;
                for (int i12 = 0; i12 < w7Var.size(); i12++) {
                    iA += k6.a(w7Var.d(i12));
                }
                this.f109195a.v(iA);
                while (i11 < w7Var.size()) {
                    this.f109195a.x(w7Var.d(i11));
                    i11++;
                }
            } else {
                while (i11 < w7Var.size()) {
                    this.f109195a.w(i10, w7Var.d(i11));
                    i11++;
                }
            }
        } else if (z10) {
            this.f109195a.t(i10, 2);
            int iA2 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iA2 += k6.a(((Long) list.get(i13)).longValue());
            }
            this.f109195a.v(iA2);
            while (i11 < list.size()) {
                this.f109195a.x(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f109195a.w(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void a(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof w7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.k(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.f109195a.v(i12);
            while (i11 < list.size()) {
                this.f109195a.l(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        w7 w7Var = (w7) list;
        if (!z10) {
            while (i11 < w7Var.size()) {
                this.f109195a.k(i10, w7Var.d(i11));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < w7Var.size(); i15++) {
            w7Var.d(i15);
            i14 += 8;
        }
        this.f109195a.v(i14);
        while (i11 < w7Var.size()) {
            this.f109195a.l(w7Var.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void b(int i10, double d10) throws IOException {
        this.f109195a.k(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void c(int i10, int i11) throws IOException {
        this.f109195a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void d(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof f7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.u(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += k6.B(((Integer) list.get(i12)).intValue());
            }
            this.f109195a.v(iB);
            while (i11 < list.size()) {
                this.f109195a.v(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f7 f7Var = (f7) list;
        if (!z10) {
            while (i11 < f7Var.size()) {
                this.f109195a.u(i10, f7Var.d(i11));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < f7Var.size(); i13++) {
            iB2 += k6.B(f7Var.d(i13));
        }
        this.f109195a.v(iB2);
        while (i11 < f7Var.size()) {
            this.f109195a.v(f7Var.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void e(int i10, int i11) throws IOException {
        this.f109195a.m(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void f(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof f7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    k6 k6Var = this.f109195a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    k6Var.u(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iB += k6.B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f109195a.v(iB);
            while (i11 < list.size()) {
                k6 k6Var2 = this.f109195a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                k6Var2.v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        f7 f7Var = (f7) list;
        if (!z10) {
            while (i11 < f7Var.size()) {
                k6 k6Var3 = this.f109195a;
                int iD = f7Var.d(i11);
                k6Var3.u(i10, (iD >> 31) ^ (iD + iD));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < f7Var.size(); i13++) {
            int iD2 = f7Var.d(i13);
            iB2 += k6.B((iD2 >> 31) ^ (iD2 + iD2));
        }
        this.f109195a.v(iB2);
        while (i11 < f7Var.size()) {
            k6 k6Var4 = this.f109195a;
            int iD3 = f7Var.d(i11);
            k6Var4.v((iD3 >> 31) ^ (iD3 + iD3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void g(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof w7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    k6 k6Var = this.f109195a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    k6Var.w(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += k6.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f109195a.v(iA);
            while (i11 < list.size()) {
                k6 k6Var2 = this.f109195a;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                k6Var2.x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        w7 w7Var = (w7) list;
        if (!z10) {
            while (i11 < w7Var.size()) {
                k6 k6Var3 = this.f109195a;
                long jD = w7Var.d(i11);
                k6Var3.w(i10, (jD >> 63) ^ (jD + jD));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < w7Var.size(); i13++) {
            long jD2 = w7Var.d(i13);
            iA2 += k6.a((jD2 >> 63) ^ (jD2 + jD2));
        }
        this.f109195a.v(iA2);
        while (i11 < w7Var.size()) {
            k6 k6Var4 = this.f109195a;
            long jD3 = w7Var.d(i11);
            k6Var4.x((jD3 >> 63) ^ (jD3 + jD3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void h(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof w7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.w(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += k6.a(((Long) list.get(i12)).longValue());
            }
            this.f109195a.v(iA);
            while (i11 < list.size()) {
                this.f109195a.x(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        w7 w7Var = (w7) list;
        if (!z10) {
            while (i11 < w7Var.size()) {
                this.f109195a.w(i10, w7Var.d(i11));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < w7Var.size(); i13++) {
            iA2 += k6.a(w7Var.d(i13));
        }
        this.f109195a.v(iA2);
        while (i11 < w7Var.size()) {
            this.f109195a.x(w7Var.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void i(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof f7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.i(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f109195a.v(i12);
            while (i11 < list.size()) {
                this.f109195a.j(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f7 f7Var = (f7) list;
        if (!z10) {
            while (i11 < f7Var.size()) {
                this.f109195a.i(i10, f7Var.d(i11));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < f7Var.size(); i15++) {
            f7Var.d(i15);
            i14 += 4;
        }
        this.f109195a.v(i14);
        while (i11 < f7Var.size()) {
            this.f109195a.j(f7Var.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void j(int i10, Object obj, s8 s8Var) throws IOException {
        this.f109195a.p(i10, (h8) obj, s8Var);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void k(int i10, String str) throws IOException {
        this.f109195a.s(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void l(int i10, boolean z10) throws IOException {
        this.f109195a.g(i10, z10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.s9
    public final void m(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof u5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.g(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            this.f109195a.v(i12);
            while (i11 < list.size()) {
                this.f109195a.f(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z10) {
            while (i11 < u5Var.size()) {
                this.f109195a.g(i10, u5Var.i(i11));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < u5Var.size(); i15++) {
            u5Var.i(i15);
            i14++;
        }
        this.f109195a.v(i14);
        while (i11 < u5Var.size()) {
            this.f109195a.f(u5Var.i(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void n(int i10, Object obj, s8 s8Var) throws IOException {
        k6 k6Var = this.f109195a;
        k6Var.t(i10, 3);
        s8Var.e((h8) obj, k6Var.f109165a);
        k6Var.t(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void o(int i10, long j10) throws IOException {
        k6 k6Var = this.f109195a;
        k6Var.w(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void p(int i10, int i11) throws IOException {
        k6 k6Var = this.f109195a;
        k6Var.u(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    @Deprecated
    public final void q(int i10) throws IOException {
        this.f109195a.t(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    @Deprecated
    public final void r(int i10) throws IOException {
        this.f109195a.t(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void s(int i10, int i11) throws IOException {
        this.f109195a.u(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void t(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof f7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.i(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f109195a.v(i12);
            while (i11 < list.size()) {
                this.f109195a.j(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f7 f7Var = (f7) list;
        if (!z10) {
            while (i11 < f7Var.size()) {
                this.f109195a.i(i10, f7Var.d(i11));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < f7Var.size(); i15++) {
            f7Var.d(i15);
            i14 += 4;
        }
        this.f109195a.v(i14);
        while (i11 < f7Var.size()) {
            this.f109195a.j(f7Var.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void u(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof f7)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f109195a.m(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f109195a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += k6.a(((Integer) list.get(i12)).intValue());
            }
            this.f109195a.v(iA);
            while (i11 < list.size()) {
                this.f109195a.n(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        f7 f7Var = (f7) list;
        if (!z10) {
            while (i11 < f7Var.size()) {
                this.f109195a.m(i10, f7Var.d(i11));
                i11++;
            }
            return;
        }
        this.f109195a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < f7Var.size(); i13++) {
            iA2 += k6.a(f7Var.d(i13));
        }
        this.f109195a.v(iA2);
        while (i11 < f7Var.size()) {
            this.f109195a.n(f7Var.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void v(int i10, float f10) throws IOException {
        this.f109195a.i(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void w(int i10, Object obj) throws IOException {
        boolean z10 = obj instanceof d6;
        k6 k6Var = this.f109195a;
        if (z10) {
            k6Var.r(i10, (d6) obj);
        } else {
            k6Var.q(i10, (h8) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void x(int i10, d6 d6Var) throws IOException {
        this.f109195a.h(i10, d6Var);
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void y(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof m6) {
            m6 m6Var = (m6) list;
            if (z10) {
                this.f109195a.t(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < m6Var.size(); i13++) {
                    m6Var.d(i13);
                    i12 += 8;
                }
                this.f109195a.v(i12);
                while (i11 < m6Var.size()) {
                    this.f109195a.l(Double.doubleToRawLongBits(m6Var.d(i11)));
                    i11++;
                }
            } else {
                while (i11 < m6Var.size()) {
                    this.f109195a.k(i10, Double.doubleToRawLongBits(m6Var.d(i11)));
                    i11++;
                }
            }
        } else if (z10) {
            this.f109195a.t(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Double) list.get(i15)).getClass();
                i14 += 8;
            }
            this.f109195a.v(i14);
            while (i11 < list.size()) {
                this.f109195a.l(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f109195a.k(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s9
    public final void z(int i10, long j10) throws IOException {
        this.f109195a.k(i10, j10);
    }
}
