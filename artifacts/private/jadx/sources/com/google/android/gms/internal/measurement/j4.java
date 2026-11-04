package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j4 extends qb implements zc {
    private static final j4 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private zb zzf = qb.z();
    private boolean zzg;
    private p4 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        j4 j4Var = new j4();
        zzl = j4Var;
        qb.t(j4.class, j4Var);
    }

    private j4() {
    }

    public static i4 Q() {
        return (i4) zzl.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        int i12 = 6 ^ 2;
        if (i11 == 2) {
            return qb.u(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", l4.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new j4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new i4(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final List H() {
        return this.zzf;
    }

    public final int I() {
        return this.zzf.size();
    }

    public final l4 J(int i10) {
        return (l4) this.zzf.get(i10);
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final p4 L() {
        p4 p4VarN = this.zzh;
        if (p4VarN == null) {
            p4VarN = p4.N();
        }
        return p4VarN;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        return (this.zzb & 64) != 0;
    }

    public final boolean P() {
        return this.zzk;
    }

    final /* synthetic */ void R(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void S(int i10, l4 l4Var) {
        l4Var.getClass();
        zb zbVar = this.zzf;
        if (!zbVar.a()) {
            this.zzf = qb.A(zbVar);
        }
        this.zzf.set(i10, l4Var);
    }
}
