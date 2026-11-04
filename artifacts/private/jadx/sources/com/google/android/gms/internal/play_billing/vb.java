package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class vb extends e7 implements i8 {
    private static final vb zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        vb vbVar = new vb();
        zzb = vbVar;
        e7.z(vb.class, vbVar);
    }

    private vb() {
    }

    static /* synthetic */ void D(vb vbVar, boolean z10) {
        vbVar.zzd |= 2;
        vbVar.zzf = true;
    }

    public static tb E() {
        return (tb) zzb.o();
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new vb();
        }
        ub ubVar = null;
        if (i11 == 4) {
            return new tb(ubVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
