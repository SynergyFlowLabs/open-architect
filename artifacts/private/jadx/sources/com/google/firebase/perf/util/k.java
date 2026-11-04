package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.net.URI;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f124251a;

    public static boolean a(@NonNull URI uri, @NonNull Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        com.google.firebase.perf.logging.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f124251a == null) {
            f124251a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f124251a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
