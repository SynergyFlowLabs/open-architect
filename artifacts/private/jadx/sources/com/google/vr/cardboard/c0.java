package com.google.vr.cardboard;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public class c0 {
    public static Uri a(String str, String str2) {
        return new Uri.Builder().scheme(FirebaseAnalytics.d.P).authority(str).path(str2).build();
    }
}
