package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class db extends e7 implements i8 {
    private static final db zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        db dbVar = new db();
        zzb = dbVar;
        e7.z(db.class, dbVar);
    }

    private db() {
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", cb.f109076a, "zzf"});
        }
        if (i11 == 3) {
            return new db();
        }
        eb ebVar = null;
        if (i11 == 4) {
            return new bb(ebVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
