package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class ua extends e7 implements i8 {
    private static final ua zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        ua uaVar = new ua();
        zzb = uaVar;
        e7.z(ua.class, uaVar);
    }

    private ua() {
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new ua();
        }
        ta taVar = null;
        if (i11 == 4) {
            return new sa(taVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
