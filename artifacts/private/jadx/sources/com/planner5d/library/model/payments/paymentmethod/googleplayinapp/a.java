package com.planner5d.library.model.payments.paymentmethod.googleplayinapp;

import android.content.Context;
import androidx.annotation.m1;
import com.android.billingclient.api.d0;
import com.android.billingclient.api.h;
import com.android.billingclient.api.j;
import com.android.billingclient.api.n;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f222577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f222578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private AtomicReference<n> f222579c;

    /* JADX INFO: renamed from: com.planner5d.library.model.payments.paymentmethod.googleplayinapp.a$a, reason: collision with other inner class name */
    public static final class C1636a implements j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f222581b;

        C1636a(AtomicBoolean atomicBoolean) {
            this.f222581b = atomicBoolean;
        }

        @Override // com.android.billingclient.api.j
        public void onBillingServiceDisconnected() {
            this.f222581b.set(true);
        }

        @Override // com.android.billingclient.api.j
        public void onBillingSetupFinished(n billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            a.this.f222579c.set(billingResult);
            this.f222581b.set(true);
        }
    }

    public a(@NotNull Context context, @NotNull d0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f222577a = context;
        h hVarA = h.m(context).g(listener).d().a();
        Intrinsics.checkNotNullExpressionValue(hVarA, "build(...)");
        this.f222578b = hVarA;
        this.f222579c = new AtomicReference<>(null);
    }

    @m1
    private final h b() throws InterruptedException, d {
        n nVar = this.f222579c.get();
        if (nVar == null || nVar.b() != 0) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f222578b.w(new C1636a(atomicBoolean));
            while (!atomicBoolean.get()) {
                Thread.sleep(100L);
            }
            nVar = this.f222579c.get();
        }
        if (nVar == null || nVar.b() != 0) {
            throw new d(this.f222577a, nVar);
        }
        return this.f222578b;
    }

    @m1
    @NotNull
    public final h c() throws d {
        try {
            return b();
        } catch (d unused) {
            return b();
        }
    }
}
