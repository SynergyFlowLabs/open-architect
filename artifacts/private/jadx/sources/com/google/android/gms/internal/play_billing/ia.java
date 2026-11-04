package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class ia extends e7 implements i8 {
    private static final ia zzb;

    static {
        ia iaVar = new ia();
        zzb = iaVar;
        e7.z(ia.class, iaVar);
    }

    private ia() {
    }

    public static ia C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        ha haVar = null;
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new ia();
        }
        if (i11 == 4) {
            return new ga(haVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
