package com.planner5d.library.activity.fragment.profile.orders;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.payments.u;
import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.s;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOrdersHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersHistoryViewModel.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n46#2,4:141\n1#3:145\n*S KotlinDebug\n*F\n+ 1 OrdersHistoryViewModel.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryViewModel\n*L\n76#1:141,4\n*E\n"})
public final class l extends f2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f134786j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.j f134787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f134788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t0 f134789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p0 f134790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f134791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final b4 f134792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Application f134793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c1<List<h>> f134794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f134795i;

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f134796c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f134797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f134798b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(false, 0 == true ? 1 : 0, 3, null);
            boolean z10 = false;
        }

        public final int a() {
            return this.f134798b;
        }

        public final boolean b() {
            return this.f134797a;
        }

        public a(boolean z10, int i10) {
            this.f134797a = z10;
            this.f134798b = i10;
        }

        public /* synthetic */ a(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.orders.OrdersHistoryViewModel$getOrdersFromDb$1", f = "OrdersHistoryViewModel.kt", i = {0}, l = {52}, m = "invokeSuspend", n = {AttributeType.LIST}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nOrdersHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersHistoryViewModel.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryViewModel$getOrdersFromDb$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,140:1\n13409#2,2:141\n*S KotlinDebug\n*F\n+ 1 OrdersHistoryViewModel.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryViewModel$getOrdersFromDb$1\n*L\n52#1:141,2\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f134800b;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.orders.OrdersHistoryViewModel$getOrdersFromDb$1$1", f = "OrdersHistoryViewModel.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Payment[]>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f134802a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f134803b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f134803b = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f134803b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f134802a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.j jVar = this.f134803b.f134787a;
                this.f134802a = 1;
                Object objI0 = jVar.i0(this);
                return objI0 == objL ? objL : objI0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Payment[]> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(l lVar, com.planner5d.library.model.payments.a aVar, String str, fd.i iVar) {
            lVar.s0(aVar, str, iVar.c());
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objH;
            List<h> list;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134800b;
            boolean z10 = false;
            if (i10 == 0) {
                ResultKt.m(obj);
                l.this.i0().r(kotlin.coroutines.jvm.internal.b.a(true));
                List<h> listMutableListOf = CollectionsKt.mutableListOf(new j(com.planner5d.library.f.s.E1, l.this.l0(), l.this.p0(), l.this.q0()), new j(com.planner5d.library.f.s.I1, l.this.m0(), "-", l.this.r0()), new k());
                z1 z1VarH = s.f229729a.h();
                a aVar = new a(l.this, null);
                this.f134799a = listMutableListOf;
                this.f134800b = 1;
                objH = kotlinx.coroutines.i.h(z1VarH, aVar, this);
                if (objH == objL) {
                    return objL;
                }
                list = listMutableListOf;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.f134799a;
                ResultKt.m(obj);
                objH = obj;
            }
            Object[] objArr = (Object[]) objH;
            final l lVar = l.this;
            int length = objArr.length;
            int i11 = 0;
            while (i11 < length) {
                Payment payment = (Payment) objArr[i11];
                final com.planner5d.library.model.payments.a aVarS = payment.s();
                final String strA = Payment.f222462a.a(payment.y());
                try {
                    id.a aVarA = lVar.f134788b.a();
                    final fd.i iVarD = aVarS.d(x.a(aVarA));
                    boolean z11 = z10;
                    list.add(new i(lVar.f134793g, lVar.f134790d, lVar.f134791e, aVarA, payment, iVarD, aVarS, new Function0() { // from class: com.planner5d.library.activity.fragment.profile.orders.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l.b.m(lVar, aVarS, strA, iVarD);
                        }
                    }));
                    i11++;
                    z10 = z11;
                } catch (u.a e10) {
                    timber.log.b.f381052a.e(e10);
                    return Unit.f312394a;
                }
            }
            l.this.k0().r(list);
            l.this.i0().r(kotlin.coroutines.jvm.internal.b.a(z10));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 OrdersHistoryViewModel.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryViewModel\n*L\n1#1,48:1\n77#2,3:49\n*E\n"})
    public static final class c extends kotlin.coroutines.a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f134804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o0.b bVar, l lVar) {
            super(bVar);
            this.f134804a = lVar;
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            timber.log.b.f381052a.e(th2);
            this.f134804a.i0().r(Boolean.FALSE);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.orders.OrdersHistoryViewModel$syncOrders$2", f = "OrdersHistoryViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160732u0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134805a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134805a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.payments.j jVar = l.this.f134787a;
                id.a aVarA = l.this.f134788b.a();
                this.f134805a = 1;
                if (jVar.A0(aVarA, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            l.this.j0();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@NotNull com.planner5d.library.model.manager.payments.j paymentManager, @NotNull t userAuthorization, @NotNull t0 userPurchases, @NotNull p0 formatter, @NotNull com.planner5d.library.application.d configuration, @NotNull b4 snapshotManager, @NotNull Application context) {
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f134787a = paymentManager;
        this.f134788b = userAuthorization;
        this.f134789c = userPurchases;
        this.f134790d = formatter;
        this.f134791e = configuration;
        this.f134792f = snapshotManager;
        this.f134793g = context;
        this.f134794h = new c1<>();
        this.f134795i = new c1<>(Boolean.FALSE);
    }

    private final a g0() {
        id.a aVarA = this.f134788b.a();
        return new a(this.f134789c.q(aVarA), this.f134789c.p(aVarA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a h0() {
        id.a aVarA = this.f134788b.a();
        if (!this.f134789c.u(aVarA) && !this.f134789c.P()) {
            return new a(false, 0 == true ? 1 : 0, 3, null);
        }
        return new a(this.f134789c.Z(aVarA), this.f134789c.L(aVarA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l0() {
        return n0(g0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m0() {
        return n0(h0());
    }

    private final String n0(a aVar) {
        String string = aVar.b() ? this.f134793g.getString(com.planner5d.library.f.s.qw) : this.f134793g.getString(com.planner5d.library.f.s.Tc, this.f134790d.y(aVar.a()));
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final String o0(a aVar) {
        String string = aVar.b() ? this.f134793g.getString(com.planner5d.library.f.s.qw) : this.f134793g.getString(com.planner5d.library.f.s.f169045cn, Integer.valueOf(aVar.a()), "");
        Intrinsics.checkNotNull(string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p0() {
        return o0(t0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q0() {
        String string = this.f134793g.getString(com.planner5d.library.f.s.f169045cn, Integer.valueOf(this.f134789c.H()), "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r0() {
        String string = this.f134793g.getString(com.planner5d.library.f.s.f169045cn, 0, "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(com.planner5d.library.model.payments.a aVar, String str, String str2) {
        String str3 = str + ", " + aVar.b() + ", " + str2;
        ClipboardManager clipboardManager = (ClipboardManager) androidx.core.content.d.s(this.f134793g, ClipboardManager.class);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str3, str3));
        }
        Application application = this.f134793g;
        Toast.makeText(application, application.getString(com.planner5d.library.f.s.f169052d5, str3), 1).show();
    }

    private final a t0() {
        return new a(false, this.f134792f.J() ? this.f134789c.R(this.f134788b.a()) : 0);
    }

    @NotNull
    public final c1<Boolean> i0() {
        return this.f134795i;
    }

    public final void j0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(null), 3, null);
    }

    @NotNull
    public final c1<List<h>> k0() {
        return this.f134794h;
    }

    public final void u0() {
        this.f134795i.r(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), new c(o0.L2, this), null, new d(null), 2, null);
    }
}
