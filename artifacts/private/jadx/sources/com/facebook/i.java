package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f99652b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f99653c = "com.facebook.AuthenticationManager.CachedAuthenticationToken";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f99654a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f99654a = sharedPreferences;
    }

    private final AuthenticationToken b() {
        String string = this.f99654a.getString(f99653c, null);
        if (string == null) {
            return null;
        }
        try {
            return new AuthenticationToken(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final boolean c() {
        return this.f99654a.contains(f99653c);
    }

    public final void a() {
        this.f99654a.edit().remove(f99653c).apply();
    }

    @Nullable
    public final AuthenticationToken d() {
        if (c()) {
            return b();
        }
        return null;
    }

    public final void e(@NotNull AuthenticationToken authenticationToken) {
        Intrinsics.checkNotNullParameter(authenticationToken, "authenticationToken");
        try {
            this.f99654a.edit().putString(f99653c, authenticationToken.j().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i() {
        g0 g0Var = g0.f99617a;
        SharedPreferences sharedPreferences = g0.n().getSharedPreferences(AuthenticationTokenManager.f98452i, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this(sharedPreferences);
    }
}
