package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f96341a = 512;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f96342b = 384;

    private b() {
    }

    public static boolean a(Uri uri) {
        return b(uri) && !e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && FirebaseAnalytics.d.P.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b(uri) && e(uri);
    }

    public static boolean d(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
