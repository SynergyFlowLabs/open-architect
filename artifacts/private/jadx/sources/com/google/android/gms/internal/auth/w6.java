package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class w6 implements v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f107865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f107866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1 f107867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z1 f107868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z1 f107869e;

    static {
        v1 v1VarA = new v1(n1.a("com.google.android.gms.auth_account")).b().a();
        f107865a = v1VarA.e("Aang__create_auth_exception_with_pending_intent", false);
        f107866b = v1VarA.e("Aang__enable_add_account_restrictions", false);
        f107867c = v1VarA.e("Aang__log_missing_gaia_id_event", true);
        f107868d = v1VarA.e("Aang__log_obfuscated_gaiaid_status", true);
        f107869e = v1VarA.e("Aang__switch_clear_token_to_aang", false);
    }

    @Override // com.google.android.gms.internal.auth.v6
    public final boolean a() {
        return ((Boolean) f107865a.b()).booleanValue();
    }
}
