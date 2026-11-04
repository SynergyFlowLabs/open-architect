package com.google.vr.ndk.base;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f127020a = "beta-settings-key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f127021b;

    static {
        HashMap map = new HashMap();
        f127021b = map;
        map.put(f127020a, "beta_enabled");
    }

    public static boolean a(Context context, String str, boolean z10, boolean z11) {
        String str2 = f127021b.get(str);
        return str2 != null && k.x(context, str2, false);
    }
}
