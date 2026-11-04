package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.model.manager.q2;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.widget.editor.helper.o3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public final class l0 implements com.planner5d.library.activity.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public q2 f136990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public x2 f136991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.w f136992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    public t3 f136993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.statistics.k f136994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.payments.j f136995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.y1 f136996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.activity.fragment.dialog.k f136997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.activity.fragment.dialog.z f136998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @ij.a
    public o3 f136999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.activity.fragment.x f137000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.activity.fragment.dialog.purchase.t f137001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.modules.user.user.w f137002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.services.utility.f1 f137003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private BroadcastReceiver f137004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private Activity f137005p;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.helper.HelperPayment$paymentWaitForFinish$2", f = "HelperPayment.kt", i = {}, l = {153, 170, 172}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f137006a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f137008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f137009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ fd.f f137010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f137011f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f137012g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(id.a aVar, long j10, fd.f fVar, String str, boolean z10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f137008c = aVar;
            this.f137009d = j10;
            this.f137010e = fVar;
            this.f137011f = str;
            this.f137012g = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l0.this.new a(this.f137008c, this.f137009d, this.f137010e, this.f137011f, this.f137012g, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00c5 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #1 {all -> 0x00dd, blocks: (B:8:0x0014, B:12:0x0025, B:31:0x00be, B:33:0x00c5, B:28:0x00a5), top: B:50:0x000b }] */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
        
            if (r1.l(r12, r11) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.helper.l0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nHelperPayment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperPayment.kt\ncom/planner5d/library/activity/helper/HelperPayment$resume$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (l0.this.f137005p != null) {
                l0.this.R();
            }
        }
    }

    static final class c implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f137014a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f137014a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f137014a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f137014a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.helper.HelperPayment$synchronizeOrders$1", f = "HelperPayment.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f137015a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l0.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f137015a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.payments.j jVarM = l0.this.m();
                    id.a aVarA = l0.this.u().a();
                    this.f137015a = 1;
                    if (jVarM.o(aVarA, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l0() {
    }

    private final void B(Activity activity) {
        BroadcastReceiver broadcastReceiver = this.f137004o;
        if (broadcastReceiver != null) {
            try {
                activity.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e10) {
                timber.log.b.f381052a.e(e10);
            }
            this.f137004o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        kotlinx.coroutines.k.f(g(), null, null, new d(null), 3, null);
    }

    private final Bundle f(String str) {
        return new com.planner5d.library.services.utility.i().j(com.planner5d.library.services.r.catalogItemId, str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(com.planner5d.library.model.payments.paymentmethod.e.a aVar) {
        return aVar == com.planner5d.library.model.payments.paymentmethod.e.a.Google ? "google" : "other";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(l0 l0Var, androidx.appcompat.app.d dVar, com.planner5d.library.services.b0.a aVar) {
        if (l0Var.n().b() != com.planner5d.library.model.payments.paymentmethod.e.a.None && aVar != null) {
            com.planner5d.library.activity.fragment.dialog.purchase.t tVarQ = l0Var.q();
            FragmentManager supportFragmentManager = dVar.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            tVarQ.c(new com.planner5d.library.activity.fragment.dialog.r(supportFragmentManager), aVar.b(), aVar.c(), l0Var.f(aVar.a()));
        }
        return Unit.f312394a;
    }

    public final void A(@NotNull y3.c source, @Nullable String str, @Nullable t3.d dVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!i().a(com.planner5d.library.model.manager.config.f.PremiumFeaturesScreen)) {
            q().c(h(), com.planner5d.library.model.manager.config.purchaseplacement.b.a.editing, y3.c.editing, f(str));
        } else {
            p().a(source, str, dVar);
            s().O0(t3.a.shown, t3.c.editor, null, dVar);
        }
    }

    public final void C(@Nullable Activity activity) {
        this.f137005p = activity;
        if (activity == null) {
            return;
        }
        B(activity);
        b bVar = new b();
        androidx.core.content.d.w(activity, bVar, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"), 4);
        this.f137004o = bVar;
        R();
    }

    public final void D(@NotNull com.planner5d.library.services.utility.f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<set-?>");
        this.f137003n = f1Var;
    }

    public final void E(@NotNull com.planner5d.library.activity.fragment.dialog.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f136997h = kVar;
    }

    public final void F(@NotNull com.planner5d.library.model.manager.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.f136992c = wVar;
    }

    public final void G(@NotNull o3 o3Var) {
        Intrinsics.checkNotNullParameter(o3Var, "<set-?>");
        this.f136999j = o3Var;
    }

    public final void H(@NotNull com.planner5d.library.model.manager.y1 y1Var) {
        Intrinsics.checkNotNullParameter(y1Var, "<set-?>");
        this.f136996g = y1Var;
    }

    public final void I(@NotNull com.planner5d.library.activity.fragment.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.f137000k = xVar;
    }

    public final void J(@NotNull com.planner5d.library.model.manager.payments.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f136995f = jVar;
    }

    public final void K(@NotNull q2 q2Var) {
        Intrinsics.checkNotNullParameter(q2Var, "<set-?>");
        this.f136990a = q2Var;
    }

    public final void L(@NotNull com.planner5d.library.activity.fragment.dialog.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<set-?>");
        this.f136998i = zVar;
    }

    public final void M(@NotNull com.planner5d.library.activity.fragment.dialog.purchase.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f137001l = tVar;
    }

    public final void N(@NotNull x2 x2Var) {
        Intrinsics.checkNotNullParameter(x2Var, "<set-?>");
        this.f136991b = x2Var;
    }

    public final void O(@NotNull t3 t3Var) {
        Intrinsics.checkNotNullParameter(t3Var, "<set-?>");
        this.f136993d = t3Var;
    }

    public final void P(@NotNull com.planner5d.library.model.manager.statistics.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f136994e = kVar;
    }

    public final void Q(@NotNull com.planner5d.library.modules.user.user.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        this.f137002m = wVar;
    }

    @Override // com.planner5d.library.activity.a
    @Nullable
    public androidx.appcompat.app.d a() {
        Activity activity = this.f137005p;
        if (activity instanceof androidx.appcompat.app.d) {
            return (androidx.appcompat.app.d) activity;
        }
        return null;
    }

    @NotNull
    public final com.planner5d.library.services.utility.f1 g() {
        com.planner5d.library.services.utility.f1 f1Var = this.f137003n;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.k h() {
        com.planner5d.library.activity.fragment.dialog.k kVar = this.f136997h;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.w i() {
        com.planner5d.library.model.manager.w wVar = this.f136992c;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureConfigManager");
        return null;
    }

    @NotNull
    public final o3 j() {
        o3 o3Var = this.f136999j;
        if (o3Var != null) {
            return o3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helperProjectPersistence");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.y1 k() {
        com.planner5d.library.model.manager.y1 y1Var = this.f136996g;
        if (y1Var != null) {
            return y1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.x l() {
        com.planner5d.library.activity.fragment.x xVar = this.f137000k;
        if (xVar != null) {
            return xVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.payments.j m() {
        com.planner5d.library.model.manager.payments.j jVar = this.f136995f;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentManager");
        return null;
    }

    @NotNull
    public final q2 n() {
        q2 q2Var = this.f136990a;
        if (q2Var != null) {
            return q2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentMethodIdProvider");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.z p() {
        com.planner5d.library.activity.fragment.dialog.z zVar = this.f136998i;
        if (zVar != null) {
            return zVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("premiumFeaturesDialogLauncher");
        return null;
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.dialog.purchase.t q() {
        com.planner5d.library.activity.fragment.dialog.purchase.t tVar = this.f137001l;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("purchaseDialogFactoryService");
        return null;
    }

    @NotNull
    public final x2 r() {
        x2 x2Var = this.f136991b;
        if (x2Var != null) {
            return x2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("purchaseUnlocksItemsConfiguration");
        return null;
    }

    @NotNull
    public final t3 s() {
        t3 t3Var = this.f136993d;
        if (t3Var != null) {
            return t3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsEventModalForm");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.statistics.k t() {
        com.planner5d.library.model.manager.statistics.k kVar = this.f136994e;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsManager");
        return null;
    }

    @NotNull
    public final com.planner5d.library.modules.user.user.w u() {
        com.planner5d.library.modules.user.user.w wVar = this.f137002m;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    public final void v(@NotNull final androidx.appcompat.app.d activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.planner5d.library.services.b0.f223959b.k(activity, new c(new Function1() { // from class: com.planner5d.library.activity.helper.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.w(this.f136984a, activity, (com.planner5d.library.services.b0.a) obj);
            }
        }));
    }

    public final void x() {
        Activity activity = this.f137005p;
        if (activity == null) {
            return;
        }
        B(activity);
        this.f137005p = null;
    }

    @Nullable
    public final Object y(@Nullable id.a aVar, @Nullable Activity activity, @Nullable fd.f fVar, @NotNull kotlin.coroutines.d<? super Long> dVar) {
        return m().z0(aVar, fVar, activity, dVar);
    }

    @Nullable
    public final Object z(@Nullable id.a aVar, long j10, @NotNull fd.f fVar, boolean z10, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.h(), new a(aVar, j10, fVar, str, z10, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }
}
