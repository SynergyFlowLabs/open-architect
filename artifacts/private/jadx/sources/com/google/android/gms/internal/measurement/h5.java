package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class h5 extends qb implements zc {
    private static final h5 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        h5 h5Var = new h5();
        zzf = h5Var;
        qb.t(h5.class, h5Var);
    }

    private h5() {
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
            return new h5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new g5(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String E() {
        return this.zzd;
    }
}
