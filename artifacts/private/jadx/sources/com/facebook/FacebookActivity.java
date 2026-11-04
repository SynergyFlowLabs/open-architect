package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookActivity extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f98476c = "PassThrough";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f98477d = "SingleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Fragment f98479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f98475b = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f98478e = FacebookActivity.class.getName();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void E() {
        Intent requestIntent = getIntent();
        com.facebook.internal.w0 w0Var = com.facebook.internal.w0.f100148a;
        Intrinsics.checkNotNullExpressionValue(requestIntent, "requestIntent");
        u uVarU = com.facebook.internal.w0.u(com.facebook.internal.w0.z(requestIntent));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        setResult(0, com.facebook.internal.w0.n(intent, null, uVarU));
        finish();
    }

    @Nullable
    public final Fragment C() {
        return this.f98479a;
    }

    @NotNull
    protected Fragment D() {
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentW0 = supportFragmentManager.w0(f98477d);
        if (fragmentW0 != null) {
            return fragmentW0;
        }
        if (Intrinsics.areEqual(com.facebook.internal.o.f100020p2, intent.getAction())) {
            com.facebook.internal.o oVar = new com.facebook.internal.o();
            oVar.setRetainInstance(true);
            oVar.show(supportFragmentManager, f98477d);
            return oVar;
        }
        com.facebook.login.t tVar = new com.facebook.login.t();
        tVar.setRetainInstance(true);
        supportFragmentManager.w().c(l5.b.h.f316716v0, tVar, f98477d).m();
        return tVar;
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public void dump(@NotNull String prefix, @Nullable FileDescriptor fileDescriptor, @NotNull PrintWriter writer, @Nullable String[] strArr) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(writer, "writer");
            com.facebook.internal.logging.dumpsys.a aVarA = com.facebook.internal.logging.dumpsys.a.f99994a.a();
            if (Intrinsics.areEqual(aVarA == null ? null : Boolean.valueOf(aVarA.a(prefix, writer, strArr)), Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }

    @Override // androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.f98479a;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        g0 g0Var = g0.f99617a;
        if (!g0.N()) {
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            com.facebook.internal.e1.g0(f98478e, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            g0.V(applicationContext);
        }
        setContentView(l5.b.k.E);
        if (Intrinsics.areEqual(f98476c, intent.getAction())) {
            E();
        } else {
            this.f98479a = D();
        }
    }
}
