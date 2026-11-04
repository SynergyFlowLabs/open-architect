package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class AuthenticationTokenManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f98447d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f98448e = "AuthenticationTokenManager";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f98449f = "com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f98450g = "com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f98451h = "com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f98452i = "com.facebook.AuthenticationTokenManager.SharedPreferences";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private static AuthenticationTokenManager f98453j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.localbroadcastmanager.content.a f98454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f98455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private AuthenticationToken f98456c;

    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f98453j;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.f98453j;
                if (authenticationTokenManager == null) {
                    g0 g0Var = g0.f99617a;
                    androidx.localbroadcastmanager.content.a aVarB = androidx.localbroadcastmanager.content.a.b(g0.n());
                    Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(aVarB, new i());
                    a aVar = AuthenticationTokenManager.f98447d;
                    AuthenticationTokenManager.f98453j = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }

        private a() {
        }
    }

    public AuthenticationTokenManager(@NotNull androidx.localbroadcastmanager.content.a localBroadcastManager, @NotNull i authenticationTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(authenticationTokenCache, "authenticationTokenCache");
        this.f98454a = localBroadcastManager;
        this.f98455b = authenticationTokenCache;
    }

    @oj.n
    @NotNull
    public static final AuthenticationTokenManager e() {
        return f98447d.a();
    }

    private final void g(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        g0 g0Var = g0.f99617a;
        Intent intent = new Intent(g0.n(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction(f98449f);
        intent.putExtra(f98450g, authenticationToken);
        intent.putExtra(f98451h, authenticationToken2);
        this.f98454a.d(intent);
    }

    private final void i(AuthenticationToken authenticationToken, boolean z10) {
        AuthenticationToken authenticationTokenD = d();
        this.f98456c = authenticationToken;
        if (z10) {
            if (authenticationToken != null) {
                this.f98455b.e(authenticationToken);
            } else {
                this.f98455b.a();
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                g0 g0Var = g0.f99617a;
                com.facebook.internal.e1.i(g0.n());
            }
        }
        com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
        if (!com.facebook.internal.e1.e(authenticationTokenD, authenticationToken)) {
            g(authenticationTokenD, authenticationToken);
        }
    }

    public final void c() {
        g(d(), d());
    }

    @Nullable
    public final AuthenticationToken d() {
        return this.f98456c;
    }

    public final boolean f() {
        AuthenticationToken authenticationTokenD = this.f98455b.d();
        if (authenticationTokenD == null) {
            return false;
        }
        i(authenticationTokenD, false);
        return true;
    }

    public final void h(@Nullable AuthenticationToken authenticationToken) {
        i(authenticationToken, true);
    }
}
