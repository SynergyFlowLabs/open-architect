package com.google.android.gms.auth;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.w;
import com.superwall.sdk.network.Api;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private a() {
    }

    @NonNull
    public static String a(@NonNull String str, @p0 Boolean bool) {
        w.l(str);
        return (true != c(bool) ? "http" : Api.scheme) + "://" + str;
    }

    @NonNull
    public static String b(@p0 String str, @p0 String str2, @p0 String str3, @p0 String str4, @p0 Boolean bool, @p0 Boolean bool2, @p0 Long l10) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
        }
        if (c(bool)) {
            sb2.append(";HttpOnly");
        }
        if (c(bool2)) {
            sb2.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb2.append(";Domain=");
            sb2.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb2.append(";Path=");
            sb2.append(str4);
        }
        if (l10 != null && l10.longValue() > 0) {
            sb2.append(";Max-Age=");
            sb2.append(l10);
        }
        if (!TextUtils.isEmpty(null)) {
            sb2.append(";Priority=null");
        }
        if (!TextUtils.isEmpty(null)) {
            sb2.append(";SameSite=null");
        }
        if (c(null)) {
            sb2.append(";SameParty");
        }
        return sb2.toString();
    }

    private static boolean c(@p0 Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
