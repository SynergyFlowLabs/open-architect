package com.planner5d.library.activity.fragment.settings.orders;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.payments.u;
import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.widget.y1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@l(message = "Use OrdersHistoryFragment")
@ij.f
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f135324f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.model.manager.payments.j f135325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public f f135326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    public ij.c<com.planner5d.library.activity.fragment.settings.orders.a> f135327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    public t f135328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ij.a
    public s0 f135329e;

    public static final class a extends h implements y1.b, com.planner5d.library.activity.fragment.settings.orders.a.InterfaceC1484a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f135330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f135331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f135332f;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.settings.orders.i$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.orders.OrdersViewFactory$factory$1$onPageSelected$1", f = "OrdersViewFactory.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "invokeSuspend", n = {}, s = {})
        static final class C1485a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f135333a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f135335c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f135336d;

            /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.settings.orders.i$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.orders.OrdersViewFactory$factory$1$onPageSelected$1$data$1", f = "OrdersViewFactory.kt", i = {}, l = {60, 60}, m = "invokeSuspend", n = {}, s = {})
            static final class C1486a extends o implements Function2<s0, kotlin.coroutines.d<? super Pair<? extends String[], ? extends Payment[]>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f135337a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f135338b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ i f135339c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1486a(i iVar, kotlin.coroutines.d<? super C1486a> dVar) {
                    super(2, dVar);
                    this.f135339c = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1486a(this.f135339c, dVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Pair<? extends String[], ? extends Payment[]>> dVar) {
                    return invoke2(s0Var, (kotlin.coroutines.d<? super Pair<String[], Payment[]>>) dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object obj2;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f135338b;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        f fVarD = this.f135339c.d();
                        this.f135338b = 1;
                        obj = fVarD.n(this);
                        if (obj != objL) {
                        }
                        return objL;
                    }
                    if (i10 == 1) {
                        ResultKt.m(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f135337a;
                        ResultKt.m(obj);
                    }
                    return TuplesKt.to(obj2, obj);
                    com.planner5d.library.model.manager.payments.j jVarE = this.f135339c.e();
                    this.f135337a = obj;
                    this.f135338b = 2;
                    Object objI0 = jVarE.i0(this);
                    if (objI0 != objL) {
                        Object obj3 = obj;
                        obj = objI0;
                        obj2 = obj3;
                        return TuplesKt.to(obj2, obj);
                    }
                    return objL;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super Pair<String[], Payment[]>> dVar) {
                    return ((C1486a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1485a(i iVar, a aVar, kotlin.coroutines.d<? super C1485a> dVar) {
                super(2, dVar);
                this.f135335c = iVar;
                this.f135336d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return a.this.new C1485a(this.f135335c, this.f135336d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f135333a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        z1 z1VarD = s.f229729a.d();
                        C1486a c1486a = new C1486a(this.f135335c, null);
                        this.f135333a = 1;
                        obj = kotlinx.coroutines.i.h(z1VarD, c1486a, this);
                        if (obj == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    Pair pair = (Pair) obj;
                    a.this.setAdapter(this.f135335c.c().get().i((String[]) pair.getFirst(), (Payment[]) pair.getSecond()).j(this.f135336d));
                    a.this.setLoaded(null);
                } catch (Exception e10) {
                    a.this.setLoaded(e10);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1485a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.orders.OrdersViewFactory$factory$1$onUpdateOrdersClick$1", f = "OrdersViewFactory.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f135340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f135341b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i iVar, kotlin.coroutines.d<? super b> dVar) {
                super(1, dVar);
                this.f135341b = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new b(this.f135341b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f135340a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.model.manager.payments.j jVarE = this.f135341b.e();
                    id.a aVarA = this.f135341b.f().a();
                    this.f135340a = 1;
                    if (jVarE.A0(aVarA, this) == objL) {
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
                return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public static final class c extends com.planner5d.library.services.rx.e<Unit> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f135342d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f135343e;

            c(Context context, a aVar) {
                this.f135342d = context;
                this.f135343e = aVar;
            }

            @Override // com.planner5d.library.services.rx.e
            public void c(Throwable th2) {
                Toast.makeText(this.f135342d, th2 == null ? ErrorMessageException.getError(this.f135342d, "payments refresh failed") : ErrorMessageException.getError(this.f135342d, th2), 1).show();
                this.f135343e.setLoaded(null);
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onNext(Unit ignored) {
                Intrinsics.checkNotNullParameter(ignored, "ignored");
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onCompleted() {
                this.f135343e.f135330d.getAndSet(false);
                this.f135343e.j();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, i iVar) {
            super(context);
            this.f135331e = context;
            this.f135332f = iVar;
            this.f135330d = new AtomicBoolean(false);
        }

        @Override // com.planner5d.library.activity.fragment.settings.orders.a.InterfaceC1484a
        @l(message = "Moved to OrdersHistoryViewModel")
        public void b(Payment payment) throws JSONException {
            String strC;
            Intrinsics.checkNotNullParameter(payment, "payment");
            com.planner5d.library.model.payments.a aVarS = payment.s();
            String strA = Payment.f222462a.a(payment.y());
            try {
                strC = aVarS.d(this.f135332f.f().e()).c();
            } catch (u.a unused) {
                strC = com.planner5d.library.model.payments.a.f222474i;
            }
            String str = strA + ", " + aVarS.b() + ", " + strC;
            ClipboardManager clipboardManager = (ClipboardManager) androidx.core.content.d.s(this.f135331e, ClipboardManager.class);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
            }
            Context context = this.f135331e;
            Toast.makeText(context, context.getString(com.planner5d.library.f.s.f169052d5, str), 1).show();
        }

        @Override // com.planner5d.library.activity.fragment.settings.orders.a.InterfaceC1484a
        public void i() {
            w();
            c0.F(c0.f225068a, null, new b(this.f135332f, null), 1, null).subscribe((Subscriber) new c(this.f135331e, this));
        }

        @Override // com.planner5d.library.widget.y1.b
        public void j() {
            if (this.f135330d.getAndSet(true)) {
                return;
            }
            kotlinx.coroutines.k.f(this.f135332f.b(), null, null, new C1485a(this.f135332f, this, null), 3, null);
        }
    }

    @ij.a
    public i() {
    }

    @NotNull
    public final View a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(context, this);
    }

    @NotNull
    public final s0 b() {
        s0 s0Var = this.f135329e;
        if (s0Var != null) {
            return s0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    @NotNull
    public final ij.c<com.planner5d.library.activity.fragment.settings.orders.a> c() {
        ij.c<com.planner5d.library.activity.fragment.settings.orders.a> cVar = this.f135327c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ordersAdapter");
        return null;
    }

    @NotNull
    public final f d() {
        f fVar = this.f135326b;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ordersSummary");
        return null;
    }

    @NotNull
    public final com.planner5d.library.model.manager.payments.j e() {
        com.planner5d.library.model.manager.payments.j jVar = this.f135325a;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentManager");
        return null;
    }

    @NotNull
    public final t f() {
        t tVar = this.f135328d;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    public final void g(@NotNull s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "<set-?>");
        this.f135329e = s0Var;
    }

    public final void h(@NotNull ij.c<com.planner5d.library.activity.fragment.settings.orders.a> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f135327c = cVar;
    }

    public final void i(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f135326b = fVar;
    }

    public final void j(@NotNull com.planner5d.library.model.manager.payments.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f135325a = jVar;
    }

    public final void k(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f135328d = tVar;
    }
}
