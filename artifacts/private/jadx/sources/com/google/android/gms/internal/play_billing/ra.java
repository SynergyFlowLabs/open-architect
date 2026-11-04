package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class ra extends e7 implements i8 {
    private static final ra zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        ra raVar = new ra();
        zzb = raVar;
        e7.z(ra.class, raVar);
    }

    private ra() {
    }

    static /* synthetic */ void D(ra raVar, int i10) {
        raVar.zzd |= 4;
        raVar.zzg = i10;
    }

    static /* synthetic */ void E(ra raVar, long j10) {
        raVar.zzd |= 8;
        raVar.zzh = j10;
    }

    static /* synthetic */ void F(ra raVar, String str) {
        str.getClass();
        raVar.zzd |= 2;
        raVar.zzf = str;
    }

    static /* synthetic */ void G(ra raVar, String str) {
        str.getClass();
        raVar.zzd |= 1;
        raVar.zze = str;
    }

    public static pa H() {
        return (pa) zzb.o();
    }

    @Override // com.google.android.gms.internal.play_billing.e7
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return e7.w(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new ra();
        }
        qa qaVar = null;
        if (i11 == 4) {
            return new pa(qaVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
