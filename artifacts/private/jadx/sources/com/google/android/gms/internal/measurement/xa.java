package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class xa implements ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wa f108973a;

    private xa(wa waVar) {
        byte[] bArr = ac.f108281b;
        this.f108973a = waVar;
        waVar.f108947a = this;
    }

    public static xa M(wa waVar) {
        xa xaVar = waVar.f108947a;
        return xaVar != null ? xaVar : new xa(waVar);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void A(int i10, Object obj) throws IOException {
        boolean z10 = obj instanceof ra;
        wa waVar = this.f108973a;
        if (z10) {
            waVar.v(i10, (ra) obj);
        } else {
            waVar.u(i10, (yc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void B(int i10, boolean z10) throws IOException {
        this.f108973a.o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void C(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof rb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += wa.a(((Integer) list.get(i12)).intValue());
            }
            waVar.z(iA);
            while (i11 < list.size()) {
                waVar.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        rb rbVar = (rb) list;
        if (!z10) {
            while (i11 < rbVar.size()) {
                this.f108973a.j(i10, rbVar.k(i11));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < rbVar.size(); i13++) {
            iA2 += wa.a(rbVar.k(i13));
        }
        waVar2.z(iA2);
        while (i11 < rbVar.size()) {
            waVar2.y(rbVar.k(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void D(int i10, Object obj, jd jdVar) throws IOException {
        this.f108973a.t(i10, (yc) obj, jdVar);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void E(int i10, long j10) throws IOException {
        wa waVar = this.f108973a;
        waVar.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.ie
    @Deprecated
    public final void F(int i10) throws IOException {
        this.f108973a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    @Deprecated
    public final void G(int i10) throws IOException {
        this.f108973a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void H(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof rb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    wa waVar = this.f108973a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    waVar.k(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            wa waVar2 = this.f108973a;
            waVar2.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iG += wa.G((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            waVar2.z(iG);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                waVar2.z((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        rb rbVar = (rb) list;
        if (!z10) {
            while (i11 < rbVar.size()) {
                wa waVar3 = this.f108973a;
                int iK = rbVar.k(i11);
                waVar3.k(i10, (iK >> 31) ^ (iK + iK));
                i11++;
            }
            return;
        }
        wa waVar4 = this.f108973a;
        waVar4.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < rbVar.size(); i13++) {
            int iK2 = rbVar.k(i13);
            iG2 += wa.G((iK2 >> 31) ^ (iK2 + iK2));
        }
        waVar4.z(iG2);
        while (i11 < rbVar.size()) {
            int iK3 = rbVar.k(i11);
            waVar4.z((iK3 >> 31) ^ (iK3 + iK3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void I(int i10, Object obj, jd jdVar) throws IOException {
        wa waVar = this.f108973a;
        waVar.i(i10, 3);
        jdVar.f((yc) obj, waVar.f108947a);
        int i11 = 0 << 4;
        waVar.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void J(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof mc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += wa.a(((Long) list.get(i12)).longValue());
            }
            waVar.z(iA);
            while (i11 < list.size()) {
                waVar.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mc mcVar = (mc) list;
        if (!z10) {
            while (i11 < mcVar.size()) {
                this.f108973a.m(i10, mcVar.o2(i11));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < mcVar.size(); i13++) {
            iA2 += wa.a(mcVar.o2(i13));
        }
        waVar2.z(iA2);
        while (i11 < mcVar.size()) {
            waVar2.B(mcVar.o2(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void K(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof rb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            waVar.z(i12);
            while (i11 < list.size()) {
                waVar.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        rb rbVar = (rb) list;
        if (!z10) {
            while (i11 < rbVar.size()) {
                this.f108973a.l(i10, rbVar.k(i11));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < rbVar.size(); i15++) {
            rbVar.k(i15);
            i14 += 4;
        }
        waVar2.z(i14);
        while (i11 < rbVar.size()) {
            waVar2.A(rbVar.k(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void L(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof rb) {
            rb rbVar = (rb) list;
            if (z10) {
                wa waVar = this.f108973a;
                waVar.i(i10, 2);
                int iA = 0;
                for (int i12 = 0; i12 < rbVar.size(); i12++) {
                    iA += wa.a(rbVar.k(i12));
                }
                waVar.z(iA);
                while (i11 < rbVar.size()) {
                    waVar.y(rbVar.k(i11));
                    i11++;
                }
            } else {
                while (i11 < rbVar.size()) {
                    this.f108973a.j(i10, rbVar.k(i11));
                    i11++;
                }
            }
        } else if (z10) {
            wa waVar2 = this.f108973a;
            waVar2.i(i10, 2);
            int iA2 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                iA2 += wa.a(((Integer) list.get(i13)).intValue());
            }
            waVar2.z(iA2);
            while (i11 < list.size()) {
                waVar2.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f108973a.j(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void a(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof mc) {
            mc mcVar = (mc) list;
            if (z10) {
                wa waVar = this.f108973a;
                waVar.i(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < mcVar.size(); i13++) {
                    mcVar.o2(i13);
                    i12 += 8;
                }
                waVar.z(i12);
                while (i11 < mcVar.size()) {
                    waVar.C(mcVar.o2(i11));
                    i11++;
                }
            } else {
                while (i11 < mcVar.size()) {
                    this.f108973a.n(i10, mcVar.o2(i11));
                    i11++;
                }
            }
        } else if (z10) {
            wa waVar2 = this.f108973a;
            waVar2.i(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((Long) list.get(i15)).getClass();
                i14 += 8;
            }
            waVar2.z(i14);
            while (i11 < list.size()) {
                waVar2.C(((Long) list.get(i11)).longValue());
                i11++;
            }
        } else {
            while (i11 < list.size()) {
                this.f108973a.n(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void b(int i10, double d10) throws IOException {
        this.f108973a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void c(int i10, int i11) throws IOException {
        this.f108973a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void d(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof mc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            waVar.z(i12);
            while (i11 < list.size()) {
                waVar.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mc mcVar = (mc) list;
        if (!z10) {
            while (i11 < mcVar.size()) {
                this.f108973a.n(i10, mcVar.o2(i11));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < mcVar.size(); i15++) {
            mcVar.o2(i15);
            i14 += 8;
        }
        waVar2.z(i14);
        while (i11 < mcVar.size()) {
            waVar2.C(mcVar.o2(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void e(int i10, int i11) throws IOException {
        this.f108973a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void f(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof ya)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            waVar.z(i12);
            while (i11 < list.size()) {
                waVar.C(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z10) {
            while (i11 < yaVar.size()) {
                this.f108973a.n(i10, Double.doubleToRawLongBits(yaVar.d(i11)));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < yaVar.size(); i15++) {
            yaVar.d(i15);
            i14 += 8;
        }
        waVar2.z(i14);
        while (i11 < yaVar.size()) {
            waVar2.C(Double.doubleToRawLongBits(yaVar.d(i11)));
            i11++;
        }
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
    @Override // com.google.android.gms.internal.measurement.ie
    public final void g(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof ha)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            waVar.z(i12);
            while (i11 < list.size()) {
                waVar.x(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        ha haVar = (ha) list;
        if (!z10) {
            while (i11 < haVar.size()) {
                this.f108973a.o(i10, haVar.d(i11));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < haVar.size(); i15++) {
            haVar.d(i15);
            i14++;
        }
        waVar2.z(i14);
        while (i11 < haVar.size()) {
            waVar2.x(haVar.d(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void h(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof mc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    wa waVar = this.f108973a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    waVar.m(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            wa waVar2 = this.f108973a;
            waVar2.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += wa.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            waVar2.z(iA);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                waVar2.B((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        mc mcVar = (mc) list;
        if (!z10) {
            while (i11 < mcVar.size()) {
                wa waVar3 = this.f108973a;
                long jO2 = mcVar.o2(i11);
                waVar3.m(i10, (jO2 >> 63) ^ (jO2 + jO2));
                i11++;
            }
            return;
        }
        wa waVar4 = this.f108973a;
        waVar4.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < mcVar.size(); i13++) {
            long jO3 = mcVar.o2(i13);
            iA2 += wa.a((jO3 >> 63) ^ (jO3 + jO3));
        }
        waVar4.z(iA2);
        while (i11 < mcVar.size()) {
            long jO4 = mcVar.o2(i11);
            waVar4.B((jO4 >> 63) ^ (jO4 + jO4));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void i(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof mc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += wa.a(((Long) list.get(i12)).longValue());
            }
            waVar.z(iA);
            while (i11 < list.size()) {
                waVar.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mc mcVar = (mc) list;
        if (!z10) {
            while (i11 < mcVar.size()) {
                this.f108973a.m(i10, mcVar.o2(i11));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < mcVar.size(); i13++) {
            iA2 += wa.a(mcVar.o2(i13));
        }
        waVar2.z(iA2);
        while (i11 < mcVar.size()) {
            waVar2.B(mcVar.o2(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void j(int i10, int i11) throws IOException {
        this.f108973a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void k(int i10, qc qcVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            waVar.z(rc.c(qcVar, entry.getKey(), entry.getValue()));
            rc.b(waVar, qcVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void l(int i10, long j10) throws IOException {
        this.f108973a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void m(int i10, String str) throws IOException {
        this.f108973a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void n(int i10, int i11) throws IOException {
        this.f108973a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void o(int i10, long j10) throws IOException {
        this.f108973a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void p(int i10, float f10) throws IOException {
        this.f108973a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void q(int i10, ra raVar) throws IOException {
        this.f108973a.q(i10, raVar);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void r(int i10, long j10) throws IOException {
        this.f108973a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void s(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof rb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            waVar.z(i12);
            while (i11 < list.size()) {
                waVar.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        rb rbVar = (rb) list;
        if (!z10) {
            while (i11 < rbVar.size()) {
                this.f108973a.l(i10, rbVar.k(i11));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < rbVar.size(); i15++) {
            rbVar.k(i15);
            i14 += 4;
        }
        waVar2.z(i14);
        while (i11 < rbVar.size()) {
            waVar2.A(rbVar.k(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void t(int i10, long j10) throws IOException {
        this.f108973a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void u(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof rb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += wa.G(((Integer) list.get(i12)).intValue());
            }
            waVar.z(iG);
            while (i11 < list.size()) {
                waVar.z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        rb rbVar = (rb) list;
        if (!z10) {
            while (i11 < rbVar.size()) {
                this.f108973a.k(i10, rbVar.k(i11));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < rbVar.size(); i13++) {
            iG2 += wa.G(rbVar.k(i13));
        }
        waVar2.z(iG2);
        while (i11 < rbVar.size()) {
            waVar2.z(rbVar.k(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void v(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f108973a.q(i10, (ra) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void w(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof ib)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f108973a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            wa waVar = this.f108973a;
            waVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            waVar.z(i12);
            while (i11 < list.size()) {
                waVar.A(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        ib ibVar = (ib) list;
        if (!z10) {
            while (i11 < ibVar.size()) {
                this.f108973a.l(i10, Float.floatToRawIntBits(ibVar.d(i11)));
                i11++;
            }
            return;
        }
        wa waVar2 = this.f108973a;
        waVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ibVar.size(); i15++) {
            ibVar.d(i15);
            i14 += 4;
        }
        waVar2.z(i14);
        while (i11 < ibVar.size()) {
            waVar2.A(Float.floatToRawIntBits(ibVar.d(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void x(int i10, int i11) throws IOException {
        this.f108973a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void y(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof ic)) {
            while (i11 < list.size()) {
                this.f108973a.p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        ic icVar = (ic) list;
        while (i11 < list.size()) {
            Object objH = icVar.h();
            if (objH instanceof String) {
                this.f108973a.p(i10, (String) objH);
            } else {
                this.f108973a.q(i10, (ra) objH);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ie
    public final void z(int i10, int i11) throws IOException {
        wa waVar = this.f108973a;
        waVar.k(i10, (i11 >> 31) ^ (i11 + i11));
    }
}
