package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class ob extends e7 implements i8 {
    private static final ob zzb;
    private int zzd;
    private fa zze;

    static {
        ob obVar = new ob();
        zzb = obVar;
        e7.z(ob.class, obVar);
    }

    private ob() {
    }

    static /* synthetic */ void D(ob obVar, fa faVar) {
        faVar.getClass();
        obVar.zze = faVar;
        obVar.zzd |= 1;
    }

    public static mb E() {
        return (mb) zzb.o();
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new ob();
        }
        nb nbVar = null;
        if (i11 == 4) {
            return new mb(nbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
