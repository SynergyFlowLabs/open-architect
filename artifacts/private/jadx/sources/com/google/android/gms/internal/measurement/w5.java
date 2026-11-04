package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class w5 extends qb implements zc {
    private static final w5 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        w5 w5Var = new w5();
        zzf = w5Var;
        qb.t(w5.class, w5Var);
    }

    private w5() {
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
            return new w5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new v5(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
