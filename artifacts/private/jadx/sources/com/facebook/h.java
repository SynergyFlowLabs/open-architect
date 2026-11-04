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
public abstract class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f99644d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f99645e = h.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BroadcastReceiver f99646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.localbroadcastmanager.content.a f99647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f99648c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f99649a;

        public b(h this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f99649a = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual(f.f99552h, intent.getAction())) {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.g0(h.f99645e, "AccessTokenChanged");
                this.f99649a.d((AccessToken) intent.getParcelableExtra(f.f99553i), (AccessToken) intent.getParcelableExtra(f.f99554j));
            }
        }
    }

    public h() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        this.f99646a = new b(this);
        g0 g0Var = g0.f99617a;
        androidx.localbroadcastmanager.content.a aVarB = androidx.localbroadcastmanager.content.a.b(g0.n());
        Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance(FacebookSdk.getApplicationContext())");
        this.f99647b = aVarB;
        e();
    }

    private final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f.f99552h);
        this.f99647b.c(this.f99646a, intentFilter);
    }

    public final boolean c() {
        return this.f99648c;
    }

    protected abstract void d(@Nullable AccessToken accessToken, @Nullable AccessToken accessToken2);

    public final void e() {
        if (this.f99648c) {
            return;
        }
        b();
        this.f99648c = true;
    }

    public final void f() {
        if (this.f99648c) {
            this.f99647b.f(this.f99646a);
            this.f99648c = false;
        }
    }
}
