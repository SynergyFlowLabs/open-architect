package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class lb extends e7 implements i8 {
    private static final lb zzb;
    private int zzd;
    private int zzf;
    private i7 zze = e7.u();
    private String zzg = "";

    static {
        lb lbVar = new lb();
        zzb = lbVar;
        e7.z(lb.class, lbVar);
    }

    private lb() {
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        int i12 = 1 ^ 3;
        if (i11 == 3) {
            return new lb();
        }
        int i13 = i12 >> 4;
        kb kbVar = null;
        if (i11 == 4) {
            return new jb(kbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
