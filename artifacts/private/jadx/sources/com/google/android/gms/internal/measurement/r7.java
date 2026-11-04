package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r7 extends qb implements zc {
    private static final r7 zzf;
    private int zzb;
    private int zzd;
    private yb zze = qb.x();

    static {
        r7 r7Var = new r7();
        zzf = r7Var;
        qb.t(r7.class, r7Var);
    }

    private r7() {
    }

    public static q7 J() {
        return (q7) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.qb
    protected final Object D(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return qb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new r7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new q7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean E() {
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

    public final long I(int i10) {
        return this.zze.o2(i10);
    }

    final /* synthetic */ void K(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void L(Iterable iterable) {
        yb ybVar = this.zze;
        if (!ybVar.a()) {
            this.zze = qb.y(ybVar);
        }
        ba.i(iterable, this.zze);
    }
}
