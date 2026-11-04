package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.h3 f108296a;

    b9(androidx.collection.h3 h3Var) {
        this.f108296a = h3Var;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        androidx.collection.h3 h3Var = uri != null ? (androidx.collection.h3) this.f108296a.get(uri.toString()) : null;
        if (h3Var == null) {
            return null;
        }
        return (String) h3Var.get("".concat(str3));
    }
}
