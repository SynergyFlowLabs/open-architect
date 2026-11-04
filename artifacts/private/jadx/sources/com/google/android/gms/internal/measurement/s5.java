package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class s5 extends qb implements zc {
    private static final s5 zzd;
    private zb zzb = qb.z();

    static {
        s5 s5Var = new s5();
        zzd = s5Var;
        qb.t(s5.class, s5Var);
    }

    private s5() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new s5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new r5(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
