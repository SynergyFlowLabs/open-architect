package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class ib extends e7 implements i8 {
    private static final ib zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private ra zzg;
    private ua zzh;

    static {
        ib ibVar = new ib();
        zzb = ibVar;
        e7.z(ib.class, ibVar);
    }

    private ib() {
    }

    static /* synthetic */ void D(ib ibVar, v9 v9Var) {
        ibVar.zzf = v9Var;
        ibVar.zze = 2;
    }

    static /* synthetic */ void E(ib ibVar, aa aaVar) {
        ibVar.zzf = aaVar;
        ibVar.zze = 3;
    }

    static /* synthetic */ void F(ib ibVar, ia iaVar) {
        iaVar.getClass();
        ibVar.zzf = iaVar;
        ibVar.zze = 7;
    }

    static /* synthetic */ void G(ib ibVar, ra raVar) {
        raVar.getClass();
        ibVar.zzg = raVar;
        ibVar.zzd |= 1;
    }

    static /* synthetic */ void H(ib ibVar, ob obVar) {
        obVar.getClass();
        ibVar.zzf = obVar;
        ibVar.zze = 8;
    }

    static /* synthetic */ void I(ib ibVar, sb sbVar) {
        ibVar.zzf = sbVar;
        ibVar.zze = 4;
    }

    public static gb J() {
        return (gb) zzb.o();
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", v9.class, aa.class, sb.class, oa.class, "zzh", ia.class, ob.class});
        }
        if (i11 == 3) {
            return new ib();
        }
        hb hbVar = null;
        if (i11 == 4) {
            return new gb(hbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
