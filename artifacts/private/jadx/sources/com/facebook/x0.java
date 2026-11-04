package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BroadcastReceiver f102174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.localbroadcastmanager.content.a f102175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102176c;

    private final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f102177a;

        public a(x0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f102177a = this$0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.areEqual(w0.f102167e, intent.getAction())) {
                this.f102177a.c((Profile) intent.getParcelableExtra(w0.f102168f), (Profile) intent.getParcelableExtra(w0.f102169g));
            }
        }
    }

    public x0() {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.w();
        this.f102174a = new a(this);
        g0 g0Var = g0.f99617a;
        androidx.localbroadcastmanager.content.a aVarB = androidx.localbroadcastmanager.content.a.b(g0.n());
        Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance(FacebookSdk.getApplicationContext())");
        this.f102175b = aVarB;
        d();
    }

    private final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(w0.f102167e);
        this.f102175b.c(this.f102174a, intentFilter);
    }

    public final boolean b() {
        return this.f102176c;
    }

    protected abstract void c(@Nullable Profile profile, @Nullable Profile profile2);

    public final void d() {
        if (this.f102176c) {
            return;
        }
        a();
        this.f102176c = true;
    }

    public final void e() {
        if (this.f102176c) {
            this.f102175b.f(this.f102174a);
            this.f102176c = false;
        }
    }
}
