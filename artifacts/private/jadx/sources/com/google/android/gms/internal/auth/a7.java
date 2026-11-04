package com.google.android.gms.internal.auth;

import android.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class a7 implements y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f107571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z1 f107572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1 f107573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z1 f107574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z1 f107575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z1 f107576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z1 f107577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z1 f107578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z1 f107579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z1 f107580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z1 f107581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z1 f107582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z1 f107583m;

    static {
        v1 v1VarA = new v1(n1.a("com.google.android.gms.auth_account")).b().a();
        f107571a = v1VarA.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f107572b = v1VarA.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f107573c = v1VarA.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f107574d = v1VarA.d("getTokenRefactor__android_id_shift", 0L);
        try {
            f107575e = v1VarA.f("getTokenRefactor__blocked_packages", t6.r(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), z6.f107908a);
            f107576f = v1VarA.e("getTokenRefactor__chimera_get_token_evolved", true);
            f107577g = v1VarA.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f107578h = v1VarA.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            f107579i = v1VarA.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            f107580j = v1VarA.e("getTokenRefactor__gaul_token_api_evolved", false);
            f107581k = v1VarA.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            f107582l = v1VarA.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            f107583m = v1VarA.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.y6
    public final t6 a() {
        return (t6) f107575e.b();
    }

    @Override // com.google.android.gms.internal.auth.y6
    public final boolean g() {
        return ((Boolean) f107579i.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.auth.y6
    public final boolean h() {
        return ((Boolean) f107580j.b()).booleanValue();
    }
}
