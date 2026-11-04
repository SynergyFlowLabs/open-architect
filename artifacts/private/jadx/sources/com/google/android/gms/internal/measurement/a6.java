package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class a6 extends qb implements zc {
    private static final a6 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        a6 a6Var = new a6();
        zzi = a6Var;
        qb.t(a6.class, a6Var);
    }

    private a6() {
    }

    public static a6 I() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new a6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new z5(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String E() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }

    public final int G() {
        return this.zzg;
    }

    public final String H() {
        return this.zzh;
    }
}
