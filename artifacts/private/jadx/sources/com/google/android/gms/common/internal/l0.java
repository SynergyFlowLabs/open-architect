package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.h3;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h3 f106601a = new h3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private static Locale f106602b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.wrappers.d.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(f6.a.e.f275069d);
        }
        if (i10 != 2) {
            return i10 != 3 ? resources.getString(R.string.ok) : resources.getString(f6.a.e.f275066a);
        }
        return resources.getString(f6.a.e.f275075j);
    }

    @NonNull
    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 == 1) {
            return resources.getString(f6.a.e.f275070e, strA);
        }
        if (i10 == 2) {
            return com.google.android.gms.common.util.l.n(context) ? resources.getString(f6.a.e.f275079n) : resources.getString(f6.a.e.f275076k, strA);
        }
        if (i10 == 3) {
            return resources.getString(f6.a.e.f275067b, strA);
        }
        if (i10 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i10 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i10 == 9) {
            return resources.getString(f6.a.e.f275074i, strA);
        }
        if (i10 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i10) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(f6.a.e.f275078m, strA);
            default:
                return resources.getString(com.google.android.gms.common.r.b.f106810a, strA);
        }
    }

    @NonNull
    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i10);
    }

    @NonNull
    public static String e(Context context, int i10) {
        String strH = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i10);
        return strH == null ? context.getResources().getString(f6.a.e.f275073h) : strH;
    }

    @androidx.annotation.p0
    public static String f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(f6.a.e.f275071f);
            case 2:
                return resources.getString(f6.a.e.f275077l);
            case 3:
                return resources.getString(f6.a.e.f275068c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                return h(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                return null;
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(com.google.android.gms.common.r.b.f106810a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    @androidx.annotation.p0
    private static String h(Context context, String str) {
        h3 h3Var = f106601a;
        synchronized (h3Var) {
            try {
                Locale localeD = androidx.core.os.g.a(context.getResources().getConfiguration()).d(0);
                if (!localeD.equals(f106602b)) {
                    h3Var.clear();
                    f106602b = localeD;
                }
                String str2 = (String) h3Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesJ = com.google.android.gms.common.j.j(context);
                if (resourcesJ == null) {
                    return null;
                }
                int identifier = resourcesJ.getIdentifier(str, androidx.constraintlayout.core.motion.utils.v.b.f43988e, "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = resourcesJ.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                h3Var.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
