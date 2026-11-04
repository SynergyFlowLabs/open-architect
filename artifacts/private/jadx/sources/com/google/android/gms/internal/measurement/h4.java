package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h4 extends qb implements zc {
    private static final h4 zzi;
    private int zzb;
    private int zzd;
    private zb zze = qb.z();
    private zb zzf = qb.z();
    private boolean zzg;
    private boolean zzh;

    static {
        h4 h4Var = new h4();
        zzi = h4Var;
        qb.t(h4.class, h4Var);
    }

    private h4() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", r4.class, "zzf", j4.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new h4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new g4(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean E() {
        boolean z10 = true | true;
        return (this.zzb & 1) != 0;
    }

    public final int F() {
        return this.zzd;
    }

    public final List G() {
        return this.zze;
    }

    public final int H() {
        return this.zze.size();
    }

    public final r4 I(int i10) {
        return (r4) this.zze.get(i10);
    }

    public final List J() {
        return this.zzf;
    }

    public final int K() {
        return this.zzf.size();
    }

    public final j4 L(int i10) {
        return (j4) this.zzf.get(i10);
    }

    final /* synthetic */ void M(int i10, r4 r4Var) {
        r4Var.getClass();
        zb zbVar = this.zze;
        if (!zbVar.a()) {
            this.zze = qb.A(zbVar);
        }
        this.zze.set(i10, r4Var);
    }

    final /* synthetic */ void N(int i10, j4 j4Var) {
        j4Var.getClass();
        zb zbVar = this.zzf;
        if (!zbVar.a()) {
            this.zzf = qb.A(zbVar);
        }
        this.zzf.set(i10, j4Var);
    }
}
