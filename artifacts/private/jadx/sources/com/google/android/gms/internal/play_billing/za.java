package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class za extends e7 implements i8 {
    private static final za zzb;
    private int zzd;
    private int zze;

    static {
        za zaVar = new za();
        zzb = zaVar;
        e7.z(za.class, zaVar);
    }

    private za() {
    }

    static /* synthetic */ void D(za zaVar, int i10) {
        zaVar.zze = i10 - 1;
        zaVar.zzd |= 1;
    }

    public static va E() {
        return (va) zzb.o();
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", wa.f109423a});
        }
        if (i11 == 3) {
            return new za();
        }
        ya yaVar = null;
        if (i11 == 4) {
            return new va(yaVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
