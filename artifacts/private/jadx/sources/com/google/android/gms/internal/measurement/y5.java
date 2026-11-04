package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class y5 extends qb implements zc {
    private static final y5 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        y5 y5Var = new y5();
        zzf = y5Var;
        qb.t(y5.class, y5Var);
    }

    private y5() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new y5();
        }
        int i12 = 0 | 4;
        byte[] bArr = null;
        if (i11 == 4) {
            return new x5(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String E() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }
}
