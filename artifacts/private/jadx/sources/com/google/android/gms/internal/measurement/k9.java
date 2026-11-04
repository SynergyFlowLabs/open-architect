package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("PhenotypeConstants.class")
    private static final androidx.collection.a f108600a = new androidx.collection.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f108601b = 0;

    public static synchronized Uri a(String str) {
        try {
            androidx.collection.a aVar = f108600a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", uri2);
            return uri2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
