package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class p4 extends qb implements zc {
    private static final p4 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        p4 p4Var = new p4();
        zzi = p4Var;
        qb.t(p4.class, p4Var);
    }

    private p4() {
    }

    public static p4 N() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", n4.f108698a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new p4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new m4(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
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

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final String K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 16) != 0;
    }

    public final String M() {
        return this.zzh;
    }

    public final int P() {
        int iA = o4.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
