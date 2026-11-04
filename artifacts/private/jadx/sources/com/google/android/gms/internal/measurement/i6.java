package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class i6 extends qb implements zc {
    private static final i6 zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        i6 i6Var = new i6();
        zzk = i6Var;
        qb.t(i6.class, i6Var);
    }

    private i6() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new i6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new h6(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }
}
