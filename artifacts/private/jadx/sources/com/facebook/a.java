package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0895a f98571d = new C0895a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f98572e = "com.facebook.AccessTokenManager.CachedAccessToken";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f98573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f98574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private s0 f98575c;

    /* JADX INFO: renamed from: com.facebook.a$a, reason: collision with other inner class name */
    public static final class C0895a {
        public /* synthetic */ C0895a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0895a() {
        }
    }

    public static final class b {
        @NotNull
        public final s0 a() {
            g0 g0Var = g0.f99617a;
            int i10 = 0 << 2;
            return new s0(g0.n(), null, 2, null);
        }
    }

    public a(@NotNull SharedPreferences sharedPreferences, @NotNull b tokenCachingStrategyFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f98573a = sharedPreferences;
        this.f98574b = tokenCachingStrategyFactory;
    }

    private final AccessToken b() {
        AccessToken accessTokenD = null;
        String string = this.f98573a.getString(f98572e, null);
        if (string != null) {
            try {
                accessTokenD = AccessToken.f98366l.d(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return accessTokenD;
    }

    private final AccessToken c() {
        Bundle bundleL = d().l();
        if (bundleL == null || !s0.f101772c.j(bundleL)) {
            return null;
        }
        return AccessToken.f98366l.e(bundleL);
    }

    private final s0 d() {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            if (this.f98575c == null) {
                synchronized (this) {
                    try {
                        if (this.f98575c == null) {
                            this.f98575c = this.f98574b.a();
                        }
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            s0 s0Var = this.f98575c;
            if (s0Var != null) {
                return s0Var;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
            return null;
        }
    }

    private final boolean e() {
        return this.f98573a.contains(f98572e);
    }

    private final boolean h() {
        g0 g0Var = g0.f99617a;
        return g0.O();
    }

    public final void a() {
        this.f98573a.edit().remove(f98572e).apply();
        if (h()) {
            d().a();
        }
    }

    @Nullable
    public final AccessToken f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        AccessToken accessTokenC = c();
        if (accessTokenC != null) {
            g(accessTokenC);
            d().a();
        }
        return accessTokenC;
    }

    public final void g(@NotNull AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        try {
            this.f98573a.edit().putString(f98572e, accessToken.E().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        g0 g0Var = g0.f99617a;
        SharedPreferences sharedPreferences = g0.n().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new b());
    }
}
