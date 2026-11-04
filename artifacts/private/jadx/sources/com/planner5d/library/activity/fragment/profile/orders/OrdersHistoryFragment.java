package com.planner5d.library.activity.fragment.profile.orders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.p0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.planner5d.library.databinding.i1;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOrdersHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersHistoryFragment.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,68:1\n12#2,6:69\n28#2:75\n*S KotlinDebug\n*F\n+ 1 OrdersHistoryFragment.kt\ncom/planner5d/library/activity/fragment/profile/orders/OrdersHistoryFragment\n*L\n22#1:69,6\n22#1:75\n*E\n"})
public final class OrdersHistoryFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f134719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f134720b;

    @ij.a
    public fg.e<com.planner5d.library.modules.user.user.t> userAuthorization;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134721a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134721a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f134721a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134721a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.profile.orders.OrdersHistoryFragment$setupSwipeRefresh$1$1", f = "OrdersHistoryFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134722a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SwipeRefreshLayout f134724c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SwipeRefreshLayout swipeRefreshLayout, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f134724c = swipeRefreshLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return OrdersHistoryFragment.this.new b(this.f134724c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f134722a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            OrdersHistoryFragment.this.w().u0();
            this.f134724c.setRefreshing(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public OrdersHistoryFragment() {
        t3 t3Var = t3.f229751a;
        this.f134719a = new i2(j1.d(l.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f134720b = new t();
        com.planner5d.library.application.b.f142455c.a().q0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(OrdersHistoryFragment ordersHistoryFragment, SwipeRefreshLayout swipeRefreshLayout) {
        kotlinx.coroutines.k.f(p0.a(ordersHistoryFragment), null, null, ordersHistoryFragment.new b(swipeRefreshLayout, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l w() {
        return (l) this.f134719a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(com.planner5d.library.activity.fragment.profile.orders.b bVar, List list) {
        Intrinsics.checkNotNull(list);
        bVar.h(list);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(OrdersHistoryFragment ordersHistoryFragment, Boolean bool) {
        h0 h0VarA = ordersHistoryFragment.f134720b.a();
        if (bool.booleanValue()) {
            h0VarA.p(ordersHistoryFragment.getString(com.planner5d.library.f.s.gF), true);
        } else {
            h0VarA.b();
        }
        return Unit.f312394a;
    }

    private final void z(final SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.setEnabled(true);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.planner5d.library.activity.fragment.profile.orders.d
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                OrdersHistoryFragment.A(this.f134755a, swipeRefreshLayout);
            }
        });
    }

    @NotNull
    public final fg.e<com.planner5d.library.modules.user.user.t> getUserAuthorization() {
        fg.e<com.planner5d.library.modules.user.user.t> eVar = this.userAuthorization;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAuthorization");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(com.planner5d.library.f.m.f168629a2, viewGroup, false);
        i1 i1VarA = i1.a(viewInflate);
        final com.planner5d.library.activity.fragment.profile.orders.b bVar = new com.planner5d.library.activity.fragment.profile.orders.b(getUserAuthorization());
        i1VarA.f159107b.setAdapter(bVar);
        w().k0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.orders.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrdersHistoryFragment.x(bVar, (List) obj);
            }
        }));
        w().i0().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.orders.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrdersHistoryFragment.y(this.f134758a, (Boolean) obj);
            }
        }));
        this.f134720b.b(i1VarA.f159108c);
        w().j0();
        SwipeRefreshLayout ordersHistorySwipeRefresh = i1VarA.f159109d;
        Intrinsics.checkNotNullExpressionValue(ordersHistorySwipeRefresh, "ordersHistorySwipeRefresh");
        z(ordersHistorySwipeRefresh);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }

    public final void setUserAuthorization(@NotNull fg.e<com.planner5d.library.modules.user.user.t> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.userAuthorization = eVar;
    }
}
