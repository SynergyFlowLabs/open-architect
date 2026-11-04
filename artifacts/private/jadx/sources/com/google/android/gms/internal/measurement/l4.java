package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class l4 extends qb implements zc {
    private static final l4 zzh;
    private int zzb;
    private v4 zzd;
    private p4 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        l4 l4Var = new l4();
        zzh = l4Var;
        qb.t(l4.class, l4Var);
    }

    private l4() {
    }

    public static l4 M() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new l4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new k4(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final v4 F() {
        v4 v4VarL = this.zzd;
        if (v4VarL == null) {
            v4VarL = v4.L();
        }
        return v4VarL;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final p4 H() {
        p4 p4VarN = this.zze;
        if (p4VarN == null) {
            p4VarN = p4.N();
        }
        return p4VarN;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final String L() {
        return this.zzg;
    }

    final /* synthetic */ void N(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
