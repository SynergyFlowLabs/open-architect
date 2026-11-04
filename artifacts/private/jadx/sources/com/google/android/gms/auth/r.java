package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.a1;
import androidx.annotation.p0;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.auth.a6;
import com.google.android.gms.internal.auth.u0;
import com.google.android.gms.internal.auth.u6;
import com.google.android.gms.internal.auth.x2;
import com.google.android.gms.internal.auth.x6;
import com.google.android.gms.internal.auth.z1;
import com.google.android.gms.internal.auth.z4;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@a0
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f105728a = "com.google";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a0
    public static final String f105729b = "com.google.work";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f105731d = "suppressProgressScreen";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f105733f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105734g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f105735h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f105736i = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a0
    public static final String[] f105730c = {"com.google", "com.google.work", "cn.google"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e.a({"InlinedApi"})
    @a0
    public static final String f105732e = "androidPackageName";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ComponentName f105737j = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.google.android.gms.common.logging.a f105738k = j.a("GoogleAuthUtil");

    r() {
    }

    public static void a(Context context, String str) throws b, IOException {
        o(context, str, 0L);
    }

    public static List<AccountChangeEvent> b(Context context, int i10, String str) throws b, IOException {
        w.m(str, "accountName must be provided");
        w.q("Calling this from your main thread can lead to deadlock");
        u(context, 8400000);
        AccountChangeEventsRequest accountChangeEventsRequest = new AccountChangeEventsRequest();
        accountChangeEventsRequest.e2(str);
        accountChangeEventsRequest.f2(i10);
        z1.d(context);
        if (x6.d() && z(context)) {
            try {
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) s(a6.a(context).P(accountChangeEventsRequest), "account change events retrieval");
                t(accountChangeEventsResponse);
                return accountChangeEventsResponse.O1();
            } catch (com.google.android.gms.common.api.b e10) {
                v(e10, "account change events retrieval");
            }
        }
        return (List) r(context, f105737j, new o(accountChangeEventsRequest), 0L, null);
    }

    public static String c(Context context, String str) throws b, IOException {
        w.m(str, "accountName must be provided");
        w.q("Calling this from your main thread can lead to deadlock");
        u(context, 8400000);
        return g(context, str, "^^_account_id_^^", new Bundle());
    }

    public static String d(Context context, Account account, String str) throws IOException, b {
        return e(context, account, str, new Bundle());
    }

    public static String e(Context context, Account account, String str, Bundle bundle) throws IOException, b {
        y(account);
        return k(context, account, str, bundle, 0L, null).O1();
    }

    @Deprecated
    public static String f(Context context, String str, String str2) throws IOException, b {
        return d(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    public static String g(Context context, String str, String str2, Bundle bundle) throws IOException, b {
        return e(context, new Account(str, "com.google"), str2, bundle);
    }

    @a1("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void h(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    @e.b(23)
    @a0
    public static Bundle i(Context context, final Account account) throws b, IOException {
        w.r(context);
        y(account);
        u(context, 8400000);
        z1.d(context);
        if (x6.e() && z(context)) {
            try {
                Bundle bundle = (Bundle) s(a6.a(context).o(account), "account removal");
                t(bundle);
                return bundle;
            } catch (com.google.android.gms.common.api.b e10) {
                v(e10, "account removal");
            }
        }
        return (Bundle) r(context, f105737j, new q() { // from class: com.google.android.gms.auth.l
            @Override // com.google.android.gms.auth.q
            public final Object a(IBinder iBinder) throws RemoteException, IOException {
                Bundle bundleE6 = x2.k(iBinder).E6(account);
                if (bundleE6 != null) {
                    return bundleE6;
                }
                throw new IOException("Service call returned null.");
            }
        }, 0L, null);
    }

    @e.b(26)
    public static Boolean j(Context context) throws b, IOException {
        w.r(context);
        u(context, 11400000);
        String str = context.getApplicationInfo().packageName;
        z1.d(context);
        if (x6.e() && z(context)) {
            try {
                Bundle bundle = (Bundle) s(a6.a(context).a(str), "google accounts access request");
                String string = bundle.getString("Error");
                Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
                if (u0.SUCCESS.equals(u0.b(string))) {
                    return Boolean.TRUE;
                }
                x(context, "requestGoogleAccountsAccess", string, intent, pendingIntent);
                throw new b("Invalid state. Shouldn't happen");
            } catch (com.google.android.gms.common.api.b e10) {
                v(e10, "google accounts access request");
            }
        }
        return (Boolean) r(context, f105737j, new p(str, context), 0L, null);
    }

    @a0
    public static TokenData k(final Context context, final Account account, final String str, Bundle bundle, long j10, @p0 Executor executor) throws b, IOException {
        w.q("Calling this from your main thread can lead to deadlock");
        w.m(str, "Scope cannot be empty or null.");
        y(account);
        u(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        w(context, bundle2);
        z1.d(context);
        if (x6.e() && z(context)) {
            try {
                Bundle bundle3 = (Bundle) s(a6.a(context).V(account, str, bundle2), "token retrieval");
                t(bundle3);
                return q(context, "getTokenWithDetails", bundle3);
            } catch (com.google.android.gms.common.api.b e10) {
                v(e10, "token retrieval");
            }
        }
        return (TokenData) r(context, f105737j, new q() { // from class: com.google.android.gms.auth.m
            @Override // com.google.android.gms.auth.q
            public final Object a(IBinder iBinder) {
                return r.l(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData l(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws RemoteException, IOException, b {
        Bundle bundleVc = x2.k(iBinder).vc(account, str, bundle);
        if (bundleVc != null) {
            return q(context, "getTokenWithDetails", bundleVc);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object m(Object obj) throws IOException {
        t(obj);
        return obj;
    }

    @a0
    public static void o(Context context, String str, long j10) throws b, IOException {
        w.q("Calling this from your main thread can lead to deadlock");
        u(context, 8400000);
        Bundle bundle = new Bundle();
        w(context, bundle);
        z1.d(context);
        if (x6.e() && z(context)) {
            z4 z4VarA = a6.a(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.O1(str);
            try {
                s(z4VarA.Q(zzbwVar), "clear token");
                return;
            } catch (com.google.android.gms.common.api.b e10) {
                v(e10, "clear token");
            }
        }
        r(context, f105737j, new n(str, bundle), 0L, null);
    }

    static void p(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        try {
            Intent.parseUri(intent.toUri(1), 1);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    private static TokenData q(Context context, String str, Bundle bundle) throws b, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        x(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new b("Invalid state. Shouldn't happen");
    }

    private static Object r(Context context, ComponentName componentName, q qVar, long j10, @p0 Executor executor) throws IOException, b {
        com.google.android.gms.common.b bVar = new com.google.android.gms.common.b();
        com.google.android.gms.common.internal.l lVarE = com.google.android.gms.common.internal.l.e(context);
        try {
            if (!lVarE.b(componentName, bVar, "GoogleAuthUtil", null)) {
                throw new IOException("Could not bind to service.");
            }
            try {
                try {
                    Object objA = qVar.a(bVar.a());
                    lVarE.k(componentName, bVar, "GoogleAuthUtil");
                    return objA;
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    throw new IOException("Error on service connection.", e10);
                }
            } catch (Throwable th2) {
                lVarE.k(componentName, bVar, "GoogleAuthUtil");
                throw th2;
            }
        } catch (SecurityException e11) {
            String.format("SecurityException while bind to auth service: %s", e11.getMessage());
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object s(Task task, String str) throws IOException, com.google.android.gms.common.api.b {
        try {
            return com.google.android.gms.tasks.n.a(task);
        } catch (InterruptedException e10) {
            String str2 = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f105738k.j(str2, new Object[0]);
            throw new IOException(str2, e10);
        } catch (CancellationException e11) {
            String str3 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f105738k.j(str3, new Object[0]);
            throw new IOException(str3, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof com.google.android.gms.common.api.b) {
                throw ((com.google.android.gms.common.api.b) cause);
            }
            String str4 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f105738k.j(str4, new Object[0]);
            throw new IOException(str4, e12);
        }
    }

    private static Object t(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        f105738k.j("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void u(Context context, int i10) throws b {
        try {
            com.google.android.gms.common.k.c(context.getApplicationContext(), i10);
        } catch (GooglePlayServicesIncorrectManifestValueException | com.google.android.gms.common.h e10) {
            throw new b(e10.getMessage(), e10);
        } catch (com.google.android.gms.common.i e11) {
            throw new d(e11.b(), e11.getMessage(), e11.a());
        }
    }

    private static void v(com.google.android.gms.common.api.b bVar, String str) {
        f105738k.j("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void w(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f105732e;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(Context context, String str, @p0 String str2, @p0 Intent intent, @p0 PendingIntent pendingIntent) throws b, IOException {
        u0 u0VarB = u0.b(str2);
        com.google.android.gms.common.logging.a aVar = f105738k;
        aVar.j(String.format("[GoogleAuthUtil] error status:%s with method:%s", u0VarB, str), new Object[0]);
        if (!u0.BAD_AUTHENTICATION.equals(u0VarB) && !u0.CAPTCHA.equals(u0VarB) && !u0.NEED_PERMISSION.equals(u0VarB) && !u0.NEED_REMOTE_CONSENT.equals(u0VarB) && !u0.NEEDS_BROWSER.equals(u0VarB) && !u0.USER_CANCEL.equals(u0VarB) && !u0.DEVICE_MANAGEMENT_REQUIRED.equals(u0VarB) && !u0.DM_INTERNAL_ERROR.equals(u0VarB) && !u0.DM_SYNC_DISABLED.equals(u0VarB) && !u0.DM_ADMIN_BLOCKED.equals(u0VarB) && !u0.DM_ADMIN_PENDING_APPROVAL.equals(u0VarB) && !u0.DM_STALE_SYNC_REQUIRED.equals(u0VarB) && !u0.DM_DEACTIVATED.equals(u0VarB) && !u0.DM_REQUIRED.equals(u0VarB) && !u0.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(u0VarB) && !u0.DM_SCREENLOCK_REQUIRED.equals(u0VarB)) {
            if (!u0.NETWORK_ERROR.equals(u0VarB) && !u0.SERVICE_UNAVAILABLE.equals(u0VarB) && !u0.INTNERNAL_ERROR.equals(u0VarB) && !u0.AUTH_SECURITY_ERROR.equals(u0VarB) && !u0.ACCOUNT_NOT_PRESENT.equals(u0VarB)) {
                throw new b(str2);
            }
            throw new IOException(str2);
        }
        z1.d(context);
        if (!u6.c()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (com.google.android.gms.common.f.x().b(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            aVar.c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.MAX_VALUE, str, Integer.MAX_VALUE), new Object[0]);
        }
        if (intent == null) {
            aVar.c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void y(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f105730c;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean z(Context context) {
        if (com.google.android.gms.common.f.x().k(context, 17895000) != 0) {
            return false;
        }
        List listS = x6.b().s();
        String str = context.getApplicationInfo().packageName;
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
