package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class fb extends e7 implements i8 {
    private static final fb zzb;
    private i7 zzd = e7.u();

    static {
        fb fbVar = new fb();
        zzb = fbVar;
        e7.z(fb.class, fbVar);
    }

    private fb() {
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", db.class});
        }
        if (i11 == 3) {
            return new fb();
        }
        eb ebVar = null;
        if (i11 == 4) {
            return new ab(ebVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
