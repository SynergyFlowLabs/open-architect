package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class m5 extends qb implements zc {
    private static final m5 zzg;
    private int zzb;
    private String zzd = "";
    private zb zze = qb.z();
    private boolean zzf;

    static {
        m5 m5Var = new m5();
        zzg = m5Var;
        qb.t(m5.class, m5Var);
    }

    private m5() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", w5.class, "zzf"});
        }
        if (i11 == 3) {
            return new m5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new l5(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String E() {
        return this.zzd;
    }
}
