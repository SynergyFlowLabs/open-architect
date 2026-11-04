package com.planner5d.library.activity.fragment.dialog.purchase;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.l1;
import com.planner5d.library.activity.helper.l0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.l2;
import com.planner5d.library.model.manager.statistics.events.v1;
import com.planner5d.library.model.manager.statistics.events.w3;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.f1;
import java.io.Serializable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class f0 extends f2 {

    @NotNull
    public static final String X = "purchase_payment_state";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final a f132590v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f132591w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f132592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l1 f132593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f132594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final l0 f132595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.j f132596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final b2 f132597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f1 f132598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private fd.k f132599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<fd.k> f132600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<e0> f132601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Long f132602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f132603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f132604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private y3.c f132605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private fd.e f132606o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private com.planner5d.library.model.manager.config.purchaseplacement.b.a f132607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f132608t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @gg.b
    public interface b extends com.planner5d.library.services.utility.f<f0> {
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132609a;

        static {
            int[] iArr = new int[fd.k.values().length];
            try {
                iArr[fd.k.RENDERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.k.CATALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fd.k.TEXTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fd.k.PLAN_RECOGNITIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fd.k.DESIGN_GENERATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f132609a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.purchase.PurchaseViewModel$purchaseWithMoney$1", f = "PurchaseViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPurchaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseViewModel$purchaseWithMoney$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132610a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f132612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fd.f f132613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ fd.k f132614e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Activity activity, fd.f fVar, fd.k kVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f132612c = activity;
            this.f132613d = fVar;
            this.f132614e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f0.this.new d(this.f132612c, this.f132613d, this.f132614e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132610a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0 l0Var = f0.this.f132595d;
                id.a aVarA = f0.this.f132594c.a();
                Activity activity = this.f132612c;
                fd.f fVar = this.f132613d;
                this.f132610a = 1;
                obj = l0Var.y(aVarA, activity, fVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            long jLongValue = ((Number) obj).longValue();
            f0 f0Var = f0.this;
            f0Var.f132602k = kotlin.coroutines.jvm.internal.b.g(jLongValue);
            f0Var.u0(jLongValue, this.f132613d, this.f132614e);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.purchase.PurchaseViewModel$refreshPayments$1", f = "PurchaseViewModel.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132615a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return f0.this.new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132615a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.j jVar = f0.this.f132596e;
                id.a aVarA = f0.this.f132594c.a();
                this.f132615a = 1;
                if (jVar.A0(aVarA, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nPurchaseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseViewModel.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/PurchaseViewModel$refreshPayments$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
    public static final class f extends Subscriber<Unit> {
        f() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(Unit ignored) {
            Intrinsics.checkNotNullParameter(ignored, "ignored");
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th2) {
            if (th2 != null) {
                f0.this.f132597f.c(th2);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.purchase.PurchaseViewModel$waitForPurchaseFinish$1", f = "PurchaseViewModel.kt", i = {}, l = {okhttp3.internal.ws.g.f334652s}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132618a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f132620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fd.f f132621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ fd.k f132622e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, fd.f fVar, fd.k kVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f132620c = j10;
            this.f132621d = fVar;
            this.f132622e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f0.this.new g(this.f132620c, this.f132621d, this.f132622e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Throwable th2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132618a;
            if (i10 == 0) {
                ResultKt.m(obj);
                try {
                    l0 l0Var = f0.this.f132595d;
                    id.a aVarA = f0.this.f132594c.a();
                    long j10 = this.f132620c;
                    fd.f fVar = this.f132621d;
                    boolean z10 = f0.this.f132604m;
                    String strN = f0.this.f132607s.n();
                    this.f132618a = 1;
                    gVar = this;
                    try {
                        if (l0Var.z(aVarA, j10, fVar, z10, strN, gVar) == objL) {
                            return objL;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        f0.this.t0(new e0(kotlin.coroutines.jvm.internal.b.g(gVar.f132620c), gVar.f132622e, gVar.f132621d, th2));
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gVar = this;
                    th2 = th;
                    f0.this.t0(new e0(kotlin.coroutines.jvm.internal.b.g(gVar.f132620c), gVar.f132622e, gVar.f132621d, th2));
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.m(obj);
                    gVar = this;
                } catch (Throwable th5) {
                    th2 = th5;
                    gVar = this;
                    try {
                        f0.this.t0(new e0(kotlin.coroutines.jvm.internal.b.g(gVar.f132620c), gVar.f132622e, gVar.f132621d, th2));
                    } finally {
                        f0.this.f132603l = false;
                    }
                }
            }
            f0.this.t0(new e0(kotlin.coroutines.jvm.internal.b.g(gVar.f132620c), gVar.f132622e, gVar.f132621d));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @gg.c
    public f0(@NotNull com.planner5d.library.application.b application, @gg.a @NotNull l1 savedStateHandle, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull l0 helperPayment, @NotNull com.planner5d.library.model.manager.payments.j paymentManager, @NotNull b2 messageManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(helperPayment, "helperPayment");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f132592a = application;
        this.f132593b = savedStateHandle;
        this.f132594c = userAuthorization;
        this.f132595d = helperPayment;
        this.f132596e = paymentManager;
        this.f132597f = messageManager;
        this.f132598g = coroutineScope;
        this.f132600i = new c1<>(fd.k.CATALOG);
        Bundle bundle = (Bundle) savedStateHandle.e(X);
        this.f132601j = new c1<>(bundle != null ? new e0(bundle) : null);
        this.f132606o = fd.e.Default;
        this.f132607s = com.planner5d.library.model.manager.config.purchaseplacement.b.a.profile;
    }

    private final void o0(fd.f fVar, fd.k kVar, Activity activity) {
        fd.i iVarK;
        if (kVar == null) {
            t0(new e0(null, null, fVar, new ErrorMessageException(com.planner5d.library.f.s.f169418sa, new String[0])));
            return;
        }
        try {
            if (!this.f132594c.b() && (iVarK = fVar.k()) != null && iVarK.n()) {
                t0(new e0(null, kVar, fVar, new ErrorMessageException(com.planner5d.library.f.s.sx, new String[0])));
            } else {
                t0(new e0(null, kVar, com.planner5d.library.f.s.tx, fVar, false));
                kotlinx.coroutines.k.f(this.f132598g, null, null, new d(activity, fVar, kVar, null), 3, null);
            }
        } catch (com.planner5d.library.model.manager.payments.u.a e10) {
            timber.log.b.f381052a.e(e10);
            t0(new e0(null, kVar, fVar, new ErrorMessageException(com.planner5d.library.f.s.N8, new String[0])));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(e0 e0Var) {
        this.f132601j.r(e0Var);
        this.f132593b.n(X, e0Var.j(this.f132592a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(long j10, fd.f fVar, fd.k kVar) {
        this.f132603l = true;
        int i10 = 3 >> 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new g(j10, fVar, kVar, null), 3, null);
    }

    @NotNull
    public final com.planner5d.library.model.manager.config.purchaseplacement.b.a f0() {
        return this.f132607s;
    }

    @Nullable
    public final fd.k g0() {
        return this.f132599h;
    }

    @NotNull
    public final c1<e0> h0() {
        return this.f132601j;
    }

    @NotNull
    public final c1<fd.k> i0() {
        return this.f132600i;
    }

    public final boolean j0() {
        return this.f132608t;
    }

    public final boolean k0() {
        return this.f132607s != com.planner5d.library.model.manager.config.purchaseplacement.b.a.onboarding;
    }

    public final void l0(@NotNull d0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        fd.e eVarA = config.a();
        this.f132606o = eVarA;
        v1.y1(v1.f217591b, w3.a.popup_view, eVarA, this.f132607s, null, 8, null);
    }

    public final void m0() {
        boolean z10 = false & false;
        v1.y1(v1.f217591b, w3.a.popup_close, this.f132606o, this.f132607s, null, 8, null);
    }

    public final void n0(@NotNull fd.g productRow, @NotNull Activity activity) {
        y3.e eVar;
        Intrinsics.checkNotNullParameter(productRow, "productRow");
        Intrinsics.checkNotNullParameter(activity, "activity");
        fd.f fVar = productRow.f275144a;
        fd.i iVarK = fVar.k();
        if (iVarK != null) {
            v1.f217591b.x1(w3.a.paywall_popup_continue, this.f132606o, this.f132607s, iVarK.c());
            l2 l2Var = l2.f217094b;
            l2Var.u(this.f132605n, iVarK.c());
            fd.k kVarI = iVarK.i();
            int i10 = 3 & (-1);
            int i11 = kVarI == null ? -1 : c.f132609a[kVarI.ordinal()];
            if (i11 == -1) {
                eVar = null;
            } else if (i11 == 1) {
                eVar = y3.e.snapshots;
            } else if (i11 == 2) {
                eVar = y3.e.catalog;
            } else if (i11 == 3) {
                eVar = y3.e.textures;
            } else if (i11 == 4) {
                eVar = y3.e.plan_recognitions;
            } else {
                if (i11 != 5) {
                    throw new k0();
                }
                eVar = y3.e.design_generator;
            }
            if (eVar != null) {
                l2Var.y(eVar, iVarK.c());
            }
            o0(fVar, iVarK.i(), activity);
        }
    }

    public final void p0(@Nullable Bundle bundle) {
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        Serializable serializableS = jVar.s(com.planner5d.library.services.r.placementName, com.planner5d.library.model.manager.config.purchaseplacement.b.a.unknown);
        Intrinsics.checkNotNull(serializableS, "null cannot be cast to non-null type com.planner5d.library.model.manager.config.purchaseplacement.PurchasePlacement.Name");
        this.f132607s = (com.planner5d.library.model.manager.config.purchaseplacement.b.a) serializableS;
        this.f132608t = jVar.f(com.planner5d.library.services.r.fallback, false);
    }

    public final void q0() {
        com.planner5d.library.services.utility.c0.F(com.planner5d.library.services.utility.c0.f225068a, null, new e(null), 1, null).subscribe((Subscriber) new f());
    }

    public final void r0(@Nullable y3.c cVar) {
        this.f132605n = cVar;
    }

    public final void s0(@Nullable fd.k kVar) {
        this.f132599h = kVar;
    }
}
