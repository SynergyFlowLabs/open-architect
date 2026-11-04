package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f100296d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f100297e = j.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BroadcastReceiver f100298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.localbroadcastmanager.content.a f100299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f100300c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f100301a;

        public b(j this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f100301a = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual(AuthenticationTokenManager.f98449f, intent.getAction())) {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.g0(j.f100297e, "AuthenticationTokenChanged");
                this.f100301a.d((AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.f98450g), (AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.f98451h));
            }
        }
    }

    public j() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        this.f100298a = new b(this);
        g0 g0Var = g0.f99617a;
        androidx.localbroadcastmanager.content.a aVarB = androidx.localbroadcastmanager.content.a.b(g0.n());
        Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance(FacebookSdk.getApplicationContext())");
        this.f100299b = aVarB;
        e();
    }

    private final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AuthenticationTokenManager.f98449f);
        this.f100299b.c(this.f100298a, intentFilter);
    }

    public final boolean c() {
        return this.f100300c;
    }

    protected abstract void d(@Nullable AuthenticationToken authenticationToken, @Nullable AuthenticationToken authenticationToken2);

    public final void e() {
        if (this.f100300c) {
            return;
        }
        b();
        this.f100300c = true;
    }

    public final void f() {
        if (this.f100300c) {
            this.f100299b.f(this.f100298a);
            this.f100300c = false;
        }
    }
}
