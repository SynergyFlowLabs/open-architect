package com.planner5d.library.model.manager;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
@SourceDebugExtension({"SMAP\nSuperwallEventListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallEventListener.kt\ncom/planner5d/library/model/manager/SuperwallEventListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public final class h4 implements com.planner5d.library.model.manager.statistics.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.a0 f191502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.f1 f191503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<com.planner5d.library.model.manager.statistics.events.h3> f191504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private WeakReference<Activity> f191505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f191506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f191507f;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.SuperwallEventListener$sendEvents$1", f = "SuperwallEventListener.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191508a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f191510c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f191510c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return h4.this.new a(this.f191510c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.planner5d.library.model.manager.statistics.events.h3 h3Var;
            Activity activity;
            com.planner5d.library.model.manager.payments.a0 a0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191508a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            do {
                List list = h4.this.f191504c;
                h4 h4Var = h4.this;
                synchronized (list) {
                    try {
                        h3Var = !h4Var.f191504c.isEmpty() ? (com.planner5d.library.model.manager.statistics.events.h3) h4Var.f191504c.remove(0) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (h3Var == null) {
                    h4.this.f191507f.set(false);
                    return Unit.f312394a;
                }
                h4 h4Var2 = h4.this;
                activity = this.f191510c;
                a0Var = h4Var2.f191502a;
                this.f191508a = 1;
            } while (a0Var.i(activity, h3Var, this) != objL);
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h4(@NotNull com.planner5d.library.model.manager.payments.a0 superwallPurchaseService, @NotNull com.planner5d.library.services.utility.f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(superwallPurchaseService, "superwallPurchaseService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f191502a = superwallPurchaseService;
        this.f191503b = coroutineScope;
        this.f191504c = new ArrayList();
        this.f191505d = new WeakReference<>(null);
        this.f191506e = new Object();
        this.f191507f = new AtomicBoolean(false);
    }

    private final void r() {
        Activity activity;
        synchronized (this.f191506e) {
            try {
                activity = this.f191505d.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (activity == null || this.f191507f.getAndSet(true)) {
            return;
        }
        kotlinx.coroutines.k.f(this.f191503b, com.planner5d.library.services.utility.s.f229729a.h(), null, new a(activity, null), 2, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void a() {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void b(@NotNull com.planner5d.library.model.manager.statistics.g0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f191502a.b(user);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void c(@Nullable Intent intent) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void d(@Nullable com.planner5d.library.model.manager.statistics.events.h3 h3Var) {
        if (h3Var != null) {
            if (StringsKt.u2(h3Var.b().n(), com.planner5d.library.model.manager.statistics.events.u3.f217525e, false, 2, null)) {
                return;
            }
            synchronized (this.f191504c) {
                this.f191504c.add(h3Var);
            }
        }
        r();
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void e(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void f(@Nullable Activity activity) {
        synchronized (this.f191506e) {
            try {
                this.f191505d = new WeakReference<>(activity);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void g(@Nullable Activity activity, @NotNull com.planner5d.library.model.manager.statistics.j purchase, @NotNull String paymentMethod, @NotNull String placement) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(placement, "placement");
        if (purchase.x()) {
            this.f191502a.g();
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void h(@Nullable String str) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void i(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public boolean isEnabled() {
        return this.f191502a.isEnabled();
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void k(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void m() {
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Object p() {
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(new JSONObject());
    }
}
