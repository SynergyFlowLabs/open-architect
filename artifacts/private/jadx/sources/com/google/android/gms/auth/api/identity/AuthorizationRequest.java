package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "AuthorizationRequestCreator")
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRequestedScopes", id = 1)
    private final List f105430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getServerClientId", id = 2)
    @p0
    private final String f105431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "isOfflineAccessRequested", id = 3)
    private final boolean f105432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "isIdTokenRequested", id = 4)
    private final boolean f105433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAccount", id = 5)
    @p0
    private final Account f105434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getHostedDomain", id = 6)
    @p0
    private final String f105435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSessionId", id = 7)
    @p0
    private final String f105436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "isForceCodeForRefreshToken", id = 8)
    private final boolean f105437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResourceParameters", id = 9)
    @p0
    private final Bundle f105438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "getOptOutIncludingGrantedScopes", id = 10)
    private final boolean f105439j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f105440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private String f105441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f105442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f105443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private Account f105444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private String f105445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private String f105446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f105447h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        private Bundle f105448i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f105449j;

        private final String k(String str) {
            com.google.android.gms.common.internal.w.r(str);
            String str2 = this.f105441b;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            com.google.android.gms.common.internal.w.b(z10, "two different server client ids provided");
            return str;
        }

        @NonNull
        public a a(@NonNull b bVar, @NonNull String str) {
            com.google.android.gms.common.internal.w.s(bVar, "Resource parameter cannot be null");
            com.google.android.gms.common.internal.w.s(str, "Resource parameter value cannot be null");
            if (this.f105448i == null) {
                this.f105448i = new Bundle();
            }
            this.f105448i.putString(bVar.f105453a, str);
            return this;
        }

        @NonNull
        public AuthorizationRequest b() {
            return new AuthorizationRequest(this.f105440a, this.f105441b, this.f105442c, this.f105443d, this.f105444e, this.f105445f, this.f105446g, this.f105447h, this.f105448i, this.f105449j);
        }

        @NonNull
        public a c(@NonNull String str) {
            this.f105445f = com.google.android.gms.common.internal.w.l(str);
            return this;
        }

        @NonNull
        public a d(@NonNull String str) {
            e(str, false);
            return this;
        }

        @NonNull
        public a e(@NonNull String str, boolean z10) {
            k(str);
            this.f105441b = str;
            this.f105442c = true;
            this.f105447h = z10;
            return this;
        }

        @NonNull
        public a f(@NonNull Account account) {
            this.f105444e = (Account) com.google.android.gms.common.internal.w.r(account);
            return this;
        }

        @NonNull
        public a g(boolean z10) {
            this.f105449j = z10;
            return this;
        }

        @NonNull
        public a h(@NonNull List<Scope> list) {
            boolean z10 = false;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            }
            com.google.android.gms.common.internal.w.b(z10, "requestedScopes cannot be null or empty");
            this.f105440a = list;
            return this;
        }

        @NonNull
        @a0
        public final a i(@NonNull String str) {
            k(str);
            this.f105441b = str;
            this.f105443d = true;
            return this;
        }

        @NonNull
        public final a j(@NonNull String str) {
            this.f105446g = str;
            return this;
        }
    }

    public enum b {
        ACCOUNT_SELECTION_TOKEN("account_selection_token"),
        ACCOUNT_SELECTION_STATE("account_selection_state");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f105453a;

        b(String str) {
            this.f105453a = str;
        }
    }

    @SafeParcelable.b
    AuthorizationRequest(@SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) @p0 String str, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 4) boolean z11, @SafeParcelable.e(id = 5) @p0 Account account, @SafeParcelable.e(id = 6) @p0 String str2, @SafeParcelable.e(id = 7) @p0 String str3, @SafeParcelable.e(id = 8) boolean z12, @SafeParcelable.e(id = 9) @p0 Bundle bundle, @SafeParcelable.e(id = 10) boolean z13) {
        boolean z14 = false;
        if (list != null && !list.isEmpty()) {
            z14 = true;
        }
        com.google.android.gms.common.internal.w.b(z14, "requestedScopes cannot be null or empty");
        this.f105430a = list;
        this.f105431b = str;
        this.f105432c = z10;
        this.f105433d = z11;
        this.f105434e = account;
        this.f105435f = str2;
        this.f105436g = str3;
        this.f105437h = z12;
        this.f105438i = bundle;
        this.f105439j = z13;
    }

    @NonNull
    public static a O1() {
        return new a();
    }

    @NonNull
    public static a u2(@NonNull AuthorizationRequest authorizationRequest) {
        b bVar;
        com.google.android.gms.common.internal.w.r(authorizationRequest);
        a aVarO1 = O1();
        aVarO1.h(authorizationRequest.e2());
        Bundle bundleN2 = authorizationRequest.n2();
        if (bundleN2 != null) {
            for (String str : bundleN2.keySet()) {
                String string = bundleN2.getString(str);
                b[] bVarArrValues = b.values();
                int length = bVarArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArrValues[i10];
                    if (bVar.f105453a.equals(str)) {
                        break;
                    }
                    i10++;
                }
                if (string != null && bVar != null) {
                    aVarO1.a(bVar, string);
                }
            }
        }
        boolean zQ2 = authorizationRequest.q2();
        String str2 = authorizationRequest.f105436g;
        String strT1 = authorizationRequest.T1();
        Account accountR = authorizationRequest.r();
        String strP2 = authorizationRequest.p2();
        if (str2 != null) {
            aVarO1.j(str2);
        }
        if (strT1 != null) {
            aVarO1.c(strT1);
        }
        if (accountR != null) {
            aVarO1.f(accountR);
        }
        if (authorizationRequest.f105433d && strP2 != null) {
            aVarO1.i(strP2);
        }
        if (authorizationRequest.s2() && strP2 != null) {
            aVarO1.e(strP2, zQ2);
        }
        aVarO1.g(authorizationRequest.f105439j);
        return aVarO1;
    }

    @p0
    public String T1() {
        return this.f105435f;
    }

    public boolean b2() {
        return this.f105439j;
    }

    @NonNull
    public List<Scope> e2() {
        return this.f105430a;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (this.f105430a.size() == authorizationRequest.f105430a.size() && this.f105430a.containsAll(authorizationRequest.f105430a)) {
            Bundle bundle = authorizationRequest.f105438i;
            Bundle bundle2 = this.f105438i;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : this.f105438i.keySet()) {
                        if (!com.google.android.gms.common.internal.u.b(this.f105438i.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f105432c == authorizationRequest.f105432c && this.f105437h == authorizationRequest.f105437h && this.f105433d == authorizationRequest.f105433d && this.f105439j == authorizationRequest.f105439j && com.google.android.gms.common.internal.u.b(this.f105431b, authorizationRequest.f105431b) && com.google.android.gms.common.internal.u.b(this.f105434e, authorizationRequest.f105434e) && com.google.android.gms.common.internal.u.b(this.f105435f, authorizationRequest.f105435f) && com.google.android.gms.common.internal.u.b(this.f105436g, authorizationRequest.f105436g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @p0
    public String f2(@NonNull b bVar) {
        Bundle bundle = this.f105438i;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(bVar.f105453a);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(this.f105430a, this.f105431b, Boolean.valueOf(this.f105432c), Boolean.valueOf(this.f105437h), Boolean.valueOf(this.f105433d), this.f105434e, this.f105435f, this.f105436g, this.f105438i, Boolean.valueOf(this.f105439j));
    }

    @p0
    public Bundle n2() {
        return this.f105438i;
    }

    @p0
    public String p2() {
        return this.f105431b;
    }

    public boolean q2() {
        return this.f105437h;
    }

    @p0
    public Account r() {
        return this.f105434e;
    }

    public boolean s2() {
        return this.f105432c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.d0(parcel, 1, e2(), false);
        i6.b.Y(parcel, 2, p2(), false);
        i6.b.g(parcel, 3, s2());
        i6.b.g(parcel, 4, this.f105433d);
        i6.b.S(parcel, 5, r(), i10, false);
        i6.b.Y(parcel, 6, T1(), false);
        i6.b.Y(parcel, 7, this.f105436g, false);
        i6.b.g(parcel, 8, q2());
        i6.b.k(parcel, 9, n2(), false);
        i6.b.g(parcel, 10, b2());
        i6.b.b(parcel, iA);
    }
}
