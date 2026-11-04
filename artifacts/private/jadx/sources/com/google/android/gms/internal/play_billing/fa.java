package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class fa extends e7 implements i8 {
    private static final fa zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        fa faVar = new fa();
        zzb = faVar;
        e7.z(fa.class, faVar);
    }

    private fa() {
    }

    static /* synthetic */ void D(fa faVar, String str) {
        faVar.zzd |= 8;
        faVar.zzh = str;
    }

    static /* synthetic */ void E(fa faVar, String str) {
        str.getClass();
        faVar.zzd |= 2;
        faVar.zzf = str;
    }

    static /* synthetic */ void F(fa faVar, int i10) {
        faVar.zzd |= 1;
        faVar.zze = i10;
    }

    static /* synthetic */ void G(fa faVar, int i10) {
        faVar.zzg = i10 - 1;
        faVar.zzd |= 4;
    }

    public static ba H() {
        return (ba) zzb.o();
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", ca.f109075a, "zzh"});
        }
        if (i11 == 3) {
            return new fa();
        }
        ea eaVar = null;
        if (i11 == 4) {
            return new ba(eaVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
