package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("PhenotypeConstants.class")
    private static final androidx.collection.a f107715a = new androidx.collection.a();

    public static synchronized Uri a(String str) {
        try {
            androidx.collection.a aVar = f107715a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            aVar.put("com.google.android.gms.auth_account", uri2);
            return uri2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
