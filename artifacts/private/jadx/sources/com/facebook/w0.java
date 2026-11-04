package com.facebook;

import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f102166d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f102167e = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f102168f = "com.facebook.sdk.EXTRA_OLD_PROFILE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f102169g = "com.facebook.sdk.EXTRA_NEW_PROFILE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile w0 f102170h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.localbroadcastmanager.content.a f102171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v0 f102172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Profile f102173c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final synchronized w0 a() {
            w0 w0Var;
            try {
                if (w0.f102170h == null) {
                    g0 g0Var = g0.f99617a;
                    androidx.localbroadcastmanager.content.a aVarB = androidx.localbroadcastmanager.content.a.b(g0.n());
                    Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance(applicationContext)");
                    w0.f102170h = new w0(aVarB, new v0());
                }
                w0Var = w0.f102170h;
                if (w0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return w0Var;
        }

        private a() {
        }
    }

    public w0(@NotNull androidx.localbroadcastmanager.content.a localBroadcastManager, @NotNull v0 profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.f102171a = localBroadcastManager;
        this.f102172b = profileCache;
    }

    @oj.n
    @NotNull
    public static final synchronized w0 d() {
        return f102166d.a();
    }

    private final void f(Profile profile, Profile profile2) {
        Intent intent = new Intent(f102167e);
        intent.putExtra(f102168f, profile);
        intent.putExtra(f102169g, profile2);
        this.f102171a.d(intent);
    }

    private final void h(Profile profile, boolean z10) {
        Profile profile2 = this.f102173c;
        this.f102173c = profile;
        if (z10) {
            if (profile != null) {
                this.f102172b.c(profile);
            } else {
                this.f102172b.a();
            }
        }
        com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
        if (com.facebook.internal.e1.e(profile2, profile)) {
            return;
        }
        f(profile2, profile);
    }

    @Nullable
    public final Profile c() {
        return this.f102173c;
    }

    public final boolean e() {
        Profile profileB = this.f102172b.b();
        if (profileB == null) {
            return false;
        }
        h(profileB, false);
        return true;
    }

    public final void g(@Nullable Profile profile) {
        h(profile, true);
    }
}
