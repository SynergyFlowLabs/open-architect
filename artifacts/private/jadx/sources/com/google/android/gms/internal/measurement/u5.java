package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class u5 extends qb implements zc {
    private static final u5 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        u5 u5Var = new u5();
        zzi = u5Var;
        qb.t(u5.class, u5Var);
    }

    private u5() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new u5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new t5(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }
}
