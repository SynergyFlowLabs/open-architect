package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.logging.a f105686a = new com.google.android.gms.common.logging.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f105686a.a("getFallbackSignInIntent()", new Object[0]);
        Intent intentC = c(context, googleSignInOptions);
        intentC.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentC;
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        f105686a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentC = c(context, googleSignInOptions);
        intentC.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentC;
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        f105686a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @p0
    public static com.google.android.gms.auth.api.signin.e d(@p0 Intent intent) {
        if (intent == null) {
            return new com.google.android.gms.auth.api.signin.e(null, Status.f105888h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new com.google.android.gms.auth.api.signin.e(googleSignInAccount, Status.f105886f);
        }
        if (status == null) {
            status = Status.f105888h;
        }
        return new com.google.android.gms.auth.api.signin.e(null, status);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0022  */
    public static com.google.android.gms.common.api.o e(com.google.android.gms.common.api.l lVar, Context context, GoogleSignInOptions googleSignInOptions, boolean z10) {
        GoogleSignInAccount googleSignInAccountA;
        com.google.android.gms.auth.api.signin.e eVar;
        com.google.android.gms.common.logging.a aVar = f105686a;
        aVar.a("silentSignIn()", new Object[0]);
        aVar.a("getEligibleSavedSignInResult()", new Object[0]);
        com.google.android.gms.common.internal.w.r(googleSignInOptions);
        GoogleSignInOptions googleSignInOptionsB = q.c(context).b();
        if (googleSignInOptionsB == null) {
            eVar = null;
        } else {
            Account accountR = googleSignInOptionsB.r();
            Account accountR2 = googleSignInOptions.r();
            if (accountR != null ? !accountR.equals(accountR2) : accountR2 != null) {
                eVar = null;
            } else if (!googleSignInOptions.q2() && ((!googleSignInOptions.p2() || (googleSignInOptionsB.p2() && com.google.android.gms.common.internal.u.b(googleSignInOptions.f2(), googleSignInOptionsB.f2()))) && new HashSet(googleSignInOptionsB.e2()).containsAll(new HashSet(googleSignInOptions.e2())) && (googleSignInAccountA = q.c(context).a()) != null && !googleSignInAccountA.D2())) {
                eVar = new com.google.android.gms.auth.api.signin.e(googleSignInAccountA, Status.f105886f);
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            aVar.a("Eligible saved sign in result found", new Object[0]);
            return com.google.android.gms.common.api.q.e(eVar, lVar);
        }
        if (z10) {
            return com.google.android.gms.common.api.q.e(new com.google.android.gms.auth.api.signin.e(null, new Status(4)), lVar);
        }
        aVar.a("trySilentSignIn()", new Object[0]);
        return new com.google.android.gms.common.api.internal.s(lVar.l(new j(lVar, context, googleSignInOptions)));
    }

    public static com.google.android.gms.common.api.p f(com.google.android.gms.common.api.l lVar, Context context, boolean z10) {
        f105686a.a("Revoking access", new Object[0]);
        String strE = b.b(context).e();
        h(context);
        return z10 ? e.a(strE) : lVar.m(new n(lVar));
    }

    public static com.google.android.gms.common.api.p g(com.google.android.gms.common.api.l lVar, Context context, boolean z10) {
        f105686a.a("Signing out", new Object[0]);
        h(context);
        return z10 ? com.google.android.gms.common.api.q.g(Status.f105886f, lVar) : lVar.m(new l(lVar));
    }

    private static void h(Context context) {
        q.c(context).d();
        Iterator<com.google.android.gms.common.api.l> it = com.google.android.gms.common.api.l.n().iterator();
        while (it.hasNext()) {
            it.next().z();
        }
        com.google.android.gms.common.api.internal.i.a();
    }
}
