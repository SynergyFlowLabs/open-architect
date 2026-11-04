package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u6 extends qb implements zc {
    private static final u6 zzd;
    private zb zzb = qb.z();

    static {
        u6 u6Var = new u6();
        zzd = u6Var;
        qb.t(u6.class, u6Var);
    }

    private u6() {
    }

    public static n6 F() {
        return (n6) zzd.p();
    }

    public static u6 G() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", r6.class});
        }
        if (i11 == 3) {
            return new u6();
        }
        byte[] bArr = null;
        int i12 = 7 | 0;
        if (i11 == 4) {
            return new n6(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List E() {
        return this.zzb;
    }

    final /* synthetic */ void H(Iterable iterable) {
        zb zbVar = this.zzb;
        if (!zbVar.a()) {
            this.zzb = qb.A(zbVar);
        }
        ba.i(iterable, this.zzb);
    }
}
