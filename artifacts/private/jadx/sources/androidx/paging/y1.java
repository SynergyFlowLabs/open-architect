package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.g0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y1<T, VH extends RecyclerView.g0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f72759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g<T> f72760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<n> f72761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<Unit> f72762d;

    public static final class a extends RecyclerView.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y1<T, VH> f72763a;

        a(y1<T, VH> y1Var) {
            this.f72763a = y1Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            y1.h(this.f72763a);
            this.f72763a.unregisterAdapterDataObserver(this);
            super.d(i10, i11);
        }
    }

    public static final class b implements Function1<n, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f72764a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1<T, VH> f72765b;

        b(y1<T, VH> y1Var) {
            this.f72765b = y1Var;
        }

        public void c(@NotNull n loadStates) {
            Intrinsics.checkNotNullParameter(loadStates, "loadStates");
            if (this.f72764a) {
                this.f72764a = false;
            } else if (loadStates.f().k() instanceof x0.c) {
                y1.h(this.f72765b);
                this.f72765b.q(this);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            c(nVar);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<n, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0<?> f72766a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0<?> y0Var) {
            super(1);
            this.f72766a = y0Var;
        }

        public final void c(@NotNull n loadStates) {
            Intrinsics.checkNotNullParameter(loadStates, "loadStates");
            this.f72766a.m(loadStates.b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            c(nVar);
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<n, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0<?> f72767a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y0<?> y0Var) {
            super(1);
            this.f72767a = y0Var;
        }

        public final void c(@NotNull n loadStates) {
            Intrinsics.checkNotNullParameter(loadStates, "loadStates");
            this.f72767a.m(loadStates.d());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            c(nVar);
            return Unit.f312394a;
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<n, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0<?> f72768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0<?> f72769b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(y0<?> y0Var, y0<?> y0Var2) {
            super(1);
            this.f72768a = y0Var;
            this.f72769b = y0Var2;
        }

        public final void c(@NotNull n loadStates) {
            Intrinsics.checkNotNullParameter(loadStates, "loadStates");
            this.f72768a.m(loadStates.d());
            this.f72769b.m(loadStates.b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(n nVar) {
            c(nVar);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public y1(@NotNull androidx.recyclerview.widget.k.f<T> diffCallback) {
        this(diffCallback, (CoroutineContext) null, (CoroutineContext) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, VH extends RecyclerView.g0> void h(y1<T, VH> y1Var) {
        if (y1Var.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT || ((y1) y1Var).f72759a) {
            return;
        }
        y1Var.setStateRestorationPolicy(RecyclerView.h.a.ALLOW);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f72760b.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i10) {
        return super.getItemId(i10);
    }

    public final void j(@NotNull Function1<? super n, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f72760b.k(listener);
    }

    public final void k(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f72760b.m(listener);
    }

    @androidx.annotation.l0
    @Nullable
    protected final T l(@androidx.annotation.g0(from = 0) int i10) {
        return this.f72760b.p(i10);
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<n> m() {
        return this.f72761c;
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Unit> n() {
        return this.f72762d;
    }

    @androidx.annotation.l0
    @Nullable
    public final T o(@androidx.annotation.g0(from = 0) int i10) {
        return this.f72760b.v(i10);
    }

    public final void p() {
        this.f72760b.w();
    }

    public final void q(@NotNull Function1<? super n, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f72760b.x(listener);
    }

    public final void r(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f72760b.y(listener);
    }

    public final void s() {
        this.f72760b.z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setStateRestorationPolicy(@NotNull RecyclerView.h.a strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f72759a = true;
        super.setStateRestorationPolicy(strategy);
    }

    @NotNull
    public final q0<T> t() {
        return this.f72760b.A();
    }

    @Nullable
    public final Object u(@NotNull x1<T> x1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objB = this.f72760b.B(x1Var, dVar);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }

    public final void v(@NotNull androidx.lifecycle.c0 lifecycle, @NotNull x1<T> pagingData) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(pagingData, "pagingData");
        this.f72760b.C(lifecycle, pagingData);
    }

    @NotNull
    public final androidx.recyclerview.widget.h w(@NotNull y0<?> footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        j(new c(footer));
        return new androidx.recyclerview.widget.h((RecyclerView.h<? extends RecyclerView.g0>[]) new RecyclerView.h[]{this, footer});
    }

    @NotNull
    public final androidx.recyclerview.widget.h x(@NotNull y0<?> header) {
        Intrinsics.checkNotNullParameter(header, "header");
        j(new d(header));
        return new androidx.recyclerview.widget.h((RecyclerView.h<? extends RecyclerView.g0>[]) new RecyclerView.h[]{header, this});
    }

    @NotNull
    public final androidx.recyclerview.widget.h y(@NotNull y0<?> header, @NotNull y0<?> footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        j(new e(header, footer));
        return new androidx.recyclerview.widget.h((RecyclerView.h<? extends RecyclerView.g0>[]) new RecyclerView.h[]{header, this, footer});
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public y1(@NotNull androidx.recyclerview.widget.k.f<T> diffCallback, @NotNull CoroutineContext mainDispatcher) {
        this(diffCallback, mainDispatcher, (CoroutineContext) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    public /* synthetic */ y1(androidx.recyclerview.widget.k.f fVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? kotlinx.coroutines.l1.e() : coroutineContext, (i10 & 4) != 0 ? kotlinx.coroutines.l1.a() : coroutineContext2);
    }

    @oj.j
    public y1(@NotNull androidx.recyclerview.widget.k.f<T> diffCallback, @NotNull CoroutineContext mainDispatcher, @NotNull CoroutineContext workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        g<T> gVar = new g<>(diffCallback, new androidx.recyclerview.widget.b(this), mainDispatcher, workerDispatcher);
        this.f72760b = gVar;
        super.setStateRestorationPolicy(RecyclerView.h.a.PREVENT);
        registerAdapterDataObserver(new a(this));
        j(new b(this));
        this.f72761c = gVar.r();
        this.f72762d = gVar.t();
    }

    public /* synthetic */ y1(androidx.recyclerview.widget.k.f fVar, kotlinx.coroutines.n0 n0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? kotlinx.coroutines.l1.e() : n0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ y1(androidx.recyclerview.widget.k.f diffCallback, kotlinx.coroutines.n0 mainDispatcher) {
        this(diffCallback, (CoroutineContext) mainDispatcher, (CoroutineContext) kotlinx.coroutines.l1.a());
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
    }

    public /* synthetic */ y1(androidx.recyclerview.widget.k.f fVar, kotlinx.coroutines.n0 n0Var, kotlinx.coroutines.n0 n0Var2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? kotlinx.coroutines.l1.e() : n0Var, (i10 & 4) != 0 ? kotlinx.coroutines.l1.a() : n0Var2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ y1(androidx.recyclerview.widget.k.f diffCallback, kotlinx.coroutines.n0 mainDispatcher, kotlinx.coroutines.n0 workerDispatcher) {
        this(diffCallback, (CoroutineContext) mainDispatcher, (CoroutineContext) workerDispatcher);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
    }
}
