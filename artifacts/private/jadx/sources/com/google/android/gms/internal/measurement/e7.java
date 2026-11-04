package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class e7 extends qb implements zc {
    private static final e7 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private i6 zzf;

    static {
        e7 e7Var = new e7();
        zzg = e7Var;
        qb.t(e7.class, e7Var);
    }

    private e7() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new e7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new d7(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
