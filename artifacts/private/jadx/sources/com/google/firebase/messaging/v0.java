package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes5.dex */
final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f123793a = "com.google.firebase.messaging";

    private v0() {
    }

    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @androidx.annotation.m1
    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    @androidx.annotation.m1
    static boolean d(SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z10;
    }

    @androidx.annotation.m1
    static void e(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z10);
        editorEdit.apply();
    }

    @androidx.annotation.m1
    static void f(final Context context, j0 j0Var, final boolean z10) {
        if (com.google.android.gms.common.util.v.p() && !d(b(context), z10)) {
            j0Var.k(z10).k(new androidx.media3.exoplayer.offline.b(), new com.google.android.gms.tasks.g() { // from class: com.google.firebase.messaging.u0
                @Override // com.google.android.gms.tasks.g
                public final void b(Object obj) {
                    v0.g(context, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.m1
    public static void g(Context context, boolean z10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_retention", z10);
        editorEdit.apply();
    }
}
