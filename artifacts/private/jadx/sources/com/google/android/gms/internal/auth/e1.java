package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.h3 f107625a;

    e1(androidx.collection.h3 h3Var) {
        this.f107625a = h3Var;
    }

    @fj.h
    public final String a(@fj.h Uri uri, @fj.h String str, @fj.h String str2, String str3) {
        androidx.collection.h3 h3Var;
        if (uri != null) {
            h3Var = (androidx.collection.h3) this.f107625a.get(uri.toString());
        } else {
            h3Var = null;
        }
        if (h3Var == null) {
            return null;
        }
        return (String) h3Var.get("".concat(str3));
    }
}
