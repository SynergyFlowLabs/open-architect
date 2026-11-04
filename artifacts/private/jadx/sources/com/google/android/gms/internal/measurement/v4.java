package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v4 extends qb implements zc {
    private static final v4 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private zb zzg = qb.z();

    static {
        v4 v4Var = new v4();
        zzh = v4Var;
        qb.t(v4.class, v4Var);
    }

    private v4() {
    }

    public static v4 L() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", t4.f108865a, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new v4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new s4(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final List J() {
        return this.zzg;
    }

    public final int K() {
        return this.zzg.size();
    }

    public final int N() {
        int iA = u4.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
