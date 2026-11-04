package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class hf implements gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v9 f108547b;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        p9VarB.d("measurement.collection.event_safelist", true);
        f108546a = p9VarB.d("measurement.service.store_null_safelist", true);
        f108547b = p9VarB.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.gf
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.gf
    public final boolean g() {
        return ((Boolean) f108546a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.gf
    public final boolean h() {
        return ((Boolean) f108547b.d()).booleanValue();
    }
}
