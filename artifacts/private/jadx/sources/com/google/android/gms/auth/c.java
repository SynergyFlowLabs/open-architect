package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import com.google.android.gms.common.internal.w;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public static final String f105693l = "com.google";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public static final String f105694m = "com.google.work";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public static final String f105695n = "suppressProgressScreen";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f105696o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f105697p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f105698q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f105699r = 4;

    private c() {
    }

    @NonNull
    public static String A(@NonNull Context context, @NonNull Account account, @NonNull String str, @NonNull Bundle bundle) throws IOException, b {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putBoolean("handle_notification", true);
        return G(context, account, str, bundle2, 0L).O1();
    }

    @NonNull
    public static String B(@NonNull Context context, @NonNull Account account, @NonNull String str, @NonNull Bundle bundle, @NonNull Intent intent) throws IOException, b {
        r.p(intent);
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putParcelable("callback_intent", intent);
        bundle2.putBoolean("handle_notification", true);
        return G(context, account, str, bundle2, 0L).O1();
    }

    @NonNull
    public static String C(@NonNull Context context, @NonNull Account account, @NonNull String str, @NonNull Bundle bundle, @NonNull String str2, @NonNull Bundle bundle2) throws IOException, b {
        w.m(str2, "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle3 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle3.putString("authority", str2);
        bundle3.putBundle("sync_extras", bundle2);
        bundle3.putBoolean("handle_notification", true);
        return G(context, account, str, bundle3, 0L).O1();
    }

    @NonNull
    @Deprecated
    public static String D(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws IOException, b {
        return A(context, new Account(str, "com.google"), str2, bundle);
    }

    @NonNull
    @Deprecated
    public static String E(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, @NonNull Intent intent) throws IOException, b {
        return B(context, new Account(str, "com.google"), str2, bundle, intent);
    }

    @NonNull
    @Deprecated
    public static String F(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, @NonNull String str3, @NonNull Bundle bundle2) throws IOException, b {
        return C(context, new Account(str, "com.google"), str2, bundle, str3, bundle2);
    }

    private static TokenData G(Context context, Account account, String str, Bundle bundle, long j10) throws b, IOException {
        try {
            TokenData tokenDataK = r.k(context, account, str, bundle, 0L, null);
            com.google.android.gms.common.k.a(context);
            return tokenDataK;
        } catch (d e10) {
            com.google.android.gms.common.j.B(e10.c(), context);
            throw new f("User intervention required. Notification has been pushed.", e10);
        } catch (UserRecoverableAuthException e11) {
            com.google.android.gms.common.k.a(context);
            throw new f("User intervention required. Notification has been pushed.", e11);
        }
    }

    public static void a(@NonNull Context context, @NonNull String str) throws b, IOException {
        r.a(context, str);
    }

    @NonNull
    public static List<AccountChangeEvent> b(@NonNull Context context, int i10, @NonNull String str) throws b, IOException {
        return r.b(context, i10, str);
    }

    @NonNull
    public static String c(@NonNull Context context, @NonNull String str) throws b, IOException {
        return r.c(context, str);
    }

    @NonNull
    public static String d(@NonNull Context context, @NonNull Account account, @NonNull String str) throws IOException, b {
        return r.d(context, account, str);
    }

    @NonNull
    public static String e(@NonNull Context context, @NonNull Account account, @NonNull String str, @NonNull Bundle bundle) throws IOException, b {
        return r.e(context, account, str, bundle);
    }

    @NonNull
    @Deprecated
    public static String f(@NonNull Context context, @NonNull String str, @NonNull String str2) throws IOException, b {
        return r.f(context, str, str2);
    }

    @NonNull
    @Deprecated
    public static String g(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws IOException, b {
        return r.g(context, str, str2, bundle);
    }

    @a1("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void h(@NonNull Context context, @NonNull String str) {
        r.h(context, str);
    }

    @NonNull
    @e.b(23)
    public static Bundle i(@NonNull Context context, @NonNull Account account) throws b, IOException {
        return r.i(context, account);
    }

    @NonNull
    @e.b(26)
    public static Boolean j(@NonNull Context context) throws b, IOException {
        return r.j(context);
    }
}
