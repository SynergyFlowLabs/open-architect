package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class o5 extends qb implements zc {
    private static final o5 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        o5 o5Var = new o5();
        zzh = o5Var;
        qb.t(o5.class, o5Var);
    }

    private o5() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new o5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new n5(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String E() {
        return this.zzd;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final boolean G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final int K() {
        return this.zzg;
    }

    final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
