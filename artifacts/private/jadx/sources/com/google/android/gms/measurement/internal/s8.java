package com.google.android.gms.measurement.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
public final class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f110475a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", FirebaseAnalytics.c.f120615a, FirebaseAnalytics.c.A, "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f110476b = {FirebaseAnalytics.c.f120615a};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f110477c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", com.google.firebase.messaging.e.f.f123542l, "_err", "_f", "_v", "_iap", com.google.firebase.messaging.e.f.f123545o, com.google.firebase.messaging.e.f.f123546p, com.google.firebase.messaging.e.f.f123544n, com.google.firebase.messaging.e.f.f123543m, "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", com.google.firebase.messaging.e.f.f123542l};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f110478d = {FirebaseAnalytics.c.D, FirebaseAnalytics.c.E, FirebaseAnalytics.c.f120616b, FirebaseAnalytics.c.C, FirebaseAnalytics.c.f120617c, FirebaseAnalytics.c.f120618d, FirebaseAnalytics.c.f120620f, FirebaseAnalytics.c.B, FirebaseAnalytics.c.F, FirebaseAnalytics.c.G, FirebaseAnalytics.c.H, FirebaseAnalytics.c.f120637w, FirebaseAnalytics.c.f120638x, FirebaseAnalytics.c.I, "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", FirebaseAnalytics.c.f120630p, FirebaseAnalytics.c.f120639y};

    public static String a(String str) {
        return db.c(str, f110477c, f110475a);
    }

    public static String b(String str) {
        return db.c(str, f110475a, f110477c);
    }
}
