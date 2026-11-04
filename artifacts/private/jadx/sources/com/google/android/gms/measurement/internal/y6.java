package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public final class y6 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(com.google.android.gms.common.r.b.f106810a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @androidx.annotation.p0
    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_app_id", androidx.constraintlayout.core.motion.utils.v.b.f43988e, str2);
        int i10 = 6 ^ 0;
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @androidx.annotation.p0
    public static final Boolean c(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
