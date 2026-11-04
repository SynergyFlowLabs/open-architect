package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.l(message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter", replaceWith = @kotlin.b1(expression = "PagingDataAdapter<T, VH>", imports = {"androidx.paging.PagingDataAdapter"}))
public abstract class r1<T, VH extends RecyclerView.g0> extends RecyclerView.h<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f<T> f72544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<q1<T>, q1<T>, Unit> f72545b;

    static final class a extends kotlin.jvm.internal.l0 implements Function2<q1<T>, q1<T>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r1<T, VH> f72546a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r1<T, VH> r1Var) {
            super(2);
            this.f72546a = r1Var;
        }

        public final void c(@Nullable q1<T> q1Var, @Nullable q1<T> q1Var2) {
            this.f72546a.o(q1Var2);
            this.f72546a.p(q1Var, q1Var2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            c((q1) obj, (q1) obj2);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function2<a1, x0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0<?> f72547a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0<?> y0Var) {
            super(2);
            this.f72547a = y0Var;
        }

        public final void c(@NotNull a1 loadType, @NotNull x0 loadState) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(loadState, "loadState");
            if (loadType == a1.APPEND) {
                this.f72547a.m(loadState);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(a1 a1Var, x0 x0Var) {
            c(a1Var, x0Var);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function2<a1, x0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0<?> f72548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0<?> y0Var) {
            super(2);
            this.f72548a = y0Var;
        }

        public final void c(@NotNull a1 loadType, @NotNull x0 loadState) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(loadState, "loadState");
            if (loadType == a1.PREPEND) {
                this.f72548a.m(loadState);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(a1 a1Var, x0 x0Var) {
            c(a1Var, x0Var);
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function2<a1, x0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0<?> f72549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0<?> f72550b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y0<?> y0Var, y0<?> y0Var2) {
            super(2);
            this.f72549a = y0Var;
            this.f72550b = y0Var2;
        }

        public final void c(@NotNull a1 loadType, @NotNull x0 loadState) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(loadState, "loadState");
            if (loadType == a1.PREPEND) {
                this.f72549a.m(loadState);
            } else if (loadType == a1.APPEND) {
                this.f72550b.m(loadState);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(a1 a1Var, x0 x0Var) {
            c(a1Var, x0Var);
            return Unit.f312394a;
        }
    }

    protected r1(@NotNull androidx.recyclerview.widget.k.f<T> diffCallback) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        a aVar = new a(this);
        this.f72545b = aVar;
        f<T> fVar = new f<>(this, diffCallback);
        this.f72544a = fVar;
        fVar.e(aVar);
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void l() {
    }

    private static /* synthetic */ void n() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f72544a.k();
    }

    public void h(@NotNull Function2<? super a1, ? super x0, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f72544a.c(listener);
    }

    @Nullable
    public q1<T> i() {
        return this.f72544a.h();
    }

    @NotNull
    public final f<T> k() {
        return this.f72544a;
    }

    @Nullable
    protected T m(int i10) {
        return this.f72544a.j(i10);
    }

    @kotlin.l(message = "Use the two argument variant instead.", replaceWith = @kotlin.b1(expression = "onCurrentListChanged(previousList, currentList)", imports = {}))
    public void o(@Nullable q1<T> q1Var) {
    }

    public void p(@Nullable q1<T> q1Var, @Nullable q1<T> q1Var2) {
    }

    public void q(@NotNull Function2<? super a1, ? super x0, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f72544a.y(listener);
    }

    public void r(@Nullable q1<T> q1Var) {
        this.f72544a.E(q1Var);
    }

    public void s(@Nullable q1<T> q1Var, @Nullable Runnable runnable) {
        this.f72544a.F(q1Var, runnable);
    }

    @NotNull
    public final androidx.recyclerview.widget.h t(@NotNull y0<?> footer) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        h(new b(footer));
        return new androidx.recyclerview.widget.h((RecyclerView.h<? extends RecyclerView.g0>[]) new RecyclerView.h[]{this, footer});
    }

    @NotNull
    public final androidx.recyclerview.widget.h u(@NotNull y0<?> header) {
        Intrinsics.checkNotNullParameter(header, "header");
        h(new c(header));
        return new androidx.recyclerview.widget.h((RecyclerView.h<? extends RecyclerView.g0>[]) new RecyclerView.h[]{header, this});
    }

    @NotNull
    public final androidx.recyclerview.widget.h v(@NotNull y0<?> header, @NotNull y0<?> footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        h(new d(header, footer));
        return new androidx.recyclerview.widget.h((RecyclerView.h<? extends RecyclerView.g0>[]) new RecyclerView.h[]{header, this, footer});
    }

    protected r1(@NotNull androidx.recyclerview.widget.c<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        a aVar = new a(this);
        this.f72545b = aVar;
        f<T> fVar = new f<>(new androidx.recyclerview.widget.b(this), config);
        this.f72544a = fVar;
        fVar.e(aVar);
    }
}
