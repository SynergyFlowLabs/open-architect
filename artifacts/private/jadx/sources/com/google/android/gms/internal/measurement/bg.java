package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class bg implements ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v9 f108318a;

    static {
        p9 p9VarB = new p9(k9.a("com.google.android.gms.measurement")).a().b();
        p9VarB.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f108318a = p9VarB.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        p9VarB.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean a() {
        return ((Boolean) f108318a.d()).booleanValue();
    }
}
