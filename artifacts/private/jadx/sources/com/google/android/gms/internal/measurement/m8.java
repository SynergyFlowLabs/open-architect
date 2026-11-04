package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m8 extends qb implements zc {
    private static final m8 zzj;
    private int zzb;
    private int zzd;
    private zb zze = qb.z();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        m8 m8Var = new m8();
        zzj = m8Var;
        qb.t(m8.class, m8Var);
    }

    private m8() {
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", k8.f108599a, "zze", m8.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new m8();
        }
        int i12 = 3 & 4;
        byte[] bArr = null;
        if (i11 == 4) {
            return new j8(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List E() {
        return this.zze;
    }

    public final String F() {
        return this.zzf;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final String H() {
        return this.zzg;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zzb & 16) != 0;
    }

    public final double L() {
        return this.zzi;
    }

    public final int N() {
        int iA = l8.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
