package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k5 extends qb implements zc {
    private static final k5 zzi;
    private int zzb;
    private boolean zzg;
    private zb zzd = qb.z();
    private zb zze = qb.z();
    private zb zzf = qb.z();
    private zb zzh = qb.z();

    static {
        k5 k5Var = new k5();
        zzi = k5Var;
        qb.t(k5.class, k5Var);
    }

    private k5() {
    }

    public static k5 K() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", y4.class, "zze", a5.class, "zzf", h5.class, "zzg", "zzh", y4.class});
        }
        if (i11 == 3) {
            return new k5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new w4(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List E() {
        return this.zzd;
    }

    public final List F() {
        return this.zze;
    }

    public final List G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 1) != 0;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final List J() {
        return this.zzh;
    }
}
