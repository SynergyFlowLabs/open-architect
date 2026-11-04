package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f102160b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f102161c = "com.facebook.ProfileManager.CachedProfile";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f102162d = "com.facebook.AccessTokenManager.SharedPreferences";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f102163a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public v0() {
        g0 g0Var = g0.f99617a;
        SharedPreferences sharedPreferences = g0.n().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f102163a = sharedPreferences;
    }

    public final void a() {
        this.f102163a.edit().remove(f102161c).apply();
    }

    @Nullable
    public final Profile b() {
        String string = this.f102163a.getString(f102161c, null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(@NotNull Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        JSONObject jSONObjectN = profile.n();
        if (jSONObjectN != null) {
            this.f102163a.edit().putString(f102161c, jSONObjectN.toString()).apply();
        }
    }
}
