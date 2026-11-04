package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.internal.p;
import com.google.android.gms.auth.api.signin.internal.q;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a {
    private a() {
    }

    @NonNull
    public static GoogleSignInAccount a(@NonNull Context context, @NonNull d dVar) {
        w.s(context, "please provide a valid Context object");
        w.s(dVar, "please provide valid GoogleSignInOptionsExtension");
        GoogleSignInAccount googleSignInAccountE = e(context);
        if (googleSignInAccountE == null) {
            googleSignInAccountE = GoogleSignInAccount.O1();
        }
        return googleSignInAccountE.U2(n(dVar.c()));
    }

    @NonNull
    public static GoogleSignInAccount b(@NonNull Context context, @NonNull Scope scope, @NonNull Scope... scopeArr) {
        w.s(context, "please provide a valid Context object");
        w.s(scope, "please provide at least one valid scope");
        GoogleSignInAccount googleSignInAccountE = e(context);
        if (googleSignInAccountE == null) {
            googleSignInAccountE = GoogleSignInAccount.O1();
        }
        googleSignInAccountE.U2(scope);
        googleSignInAccountE.U2(scopeArr);
        return googleSignInAccountE;
    }

    @NonNull
    public static c c(@NonNull Activity activity, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new c(activity, (GoogleSignInOptions) w.r(googleSignInOptions));
    }

    @NonNull
    public static c d(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new c(context, (GoogleSignInOptions) w.r(googleSignInOptions));
    }

    @p0
    public static GoogleSignInAccount e(@NonNull Context context) {
        return q.c(context).a();
    }

    @NonNull
    public static Task<GoogleSignInAccount> f(@p0 Intent intent) {
        e eVarD = p.d(intent);
        GoogleSignInAccount googleSignInAccountA = eVarD.a();
        if (eVarD.t().q2() && googleSignInAccountA != null) {
            return com.google.android.gms.tasks.n.g(googleSignInAccountA);
        }
        return com.google.android.gms.tasks.n.f(com.google.android.gms.common.internal.c.a(eVarD.t()));
    }

    public static boolean g(@p0 GoogleSignInAccount googleSignInAccount, @NonNull d dVar) {
        w.s(dVar, "Please provide a non-null GoogleSignInOptionsExtension");
        return h(googleSignInAccount, n(dVar.c()));
    }

    public static boolean h(@p0 GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.q2().containsAll(hashSet);
    }

    public static void i(@NonNull Activity activity, int i10, @p0 GoogleSignInAccount googleSignInAccount, @NonNull d dVar) {
        w.s(activity, "Please provide a non-null Activity");
        w.s(dVar, "Please provide a non-null GoogleSignInOptionsExtension");
        j(activity, i10, googleSignInAccount, n(dVar.c()));
    }

    public static void j(@NonNull Activity activity, int i10, @p0 GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        w.s(activity, "Please provide a non-null Activity");
        w.s(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(m(activity, googleSignInAccount, scopeArr), i10);
    }

    public static void k(@NonNull Fragment fragment, int i10, @p0 GoogleSignInAccount googleSignInAccount, @NonNull d dVar) {
        w.s(fragment, "Please provide a non-null Fragment");
        w.s(dVar, "Please provide a non-null GoogleSignInOptionsExtension");
        l(fragment, i10, googleSignInAccount, n(dVar.c()));
    }

    public static void l(@NonNull Fragment fragment, int i10, @p0 GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        w.s(fragment, "Please provide a non-null Fragment");
        w.s(scopeArr, "Please provide at least one scope");
        fragment.startActivityForResult(m(fragment.getActivity(), googleSignInAccount, scopeArr), i10);
    }

    @NonNull
    private static Intent m(@NonNull Activity activity, @p0 GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a();
        if (scopeArr.length > 0) {
            int i10 = 3 << 0;
            aVar.g(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.f2())) {
            aVar.j((String) w.r(googleSignInAccount.f2()));
        }
        return new c(activity, aVar.b()).K0();
    }

    @NonNull
    private static Scope[] n(@p0 List list) {
        return list == null ? new Scope[0] : (Scope[]) list.toArray(new Scope[list.size()]);
    }
}
