package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.l(message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer", replaceWith = @kotlin.b1(expression = "AsyncPagingDataDiffer<T>", imports = {"androidx.paging.AsyncPagingDataDiffer"}))
@SourceDebugExtension({"SMAP\nAsyncPagedListDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncPagedListDiffer.kt\nandroidx/paging/AsyncPagedListDiffer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1855#2,2:595\n*S KotlinDebug\n*F\n+ 1 AsyncPagedListDiffer.kt\nandroidx/paging/AsyncPagedListDiffer\n*L\n505#1:595,2\n*E\n"})
public class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.v f71834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.c<T> f71835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Executor f71836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<b<T>> f71837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private q1<T> f71838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private q1<T> f71839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f71840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final q1.f f71841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.i<Unit> f71842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<Function2<a1, x0, Unit>> f71843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final q1.c f71844k;

    private static final class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function2<q1<T>, q1<T>, Unit> f71845a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function2<? super q1<T>, ? super q1<T>, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f71845a = callback;
        }

        @Override // androidx.paging.f.b
        public void a(@Nullable q1<T> q1Var, @Nullable q1<T> q1Var2) {
            this.f71845a.invoke(q1Var, q1Var2);
        }

        @NotNull
        public final Function2<q1<T>, q1<T>, Unit> b() {
            return this.f71845a;
        }
    }

    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData")
    public interface b<T> {
        void a(@Nullable q1<T> q1Var, @Nullable q1<T> q1Var2);
    }

    /* synthetic */ class c extends kotlin.jvm.internal.g0 implements Function2<a1, x0, Unit> {
        c(Object obj) {
            super(2, obj, q1.f.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
        }

        public final void X(@NotNull a1 p10, @NotNull x0 p11) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            Intrinsics.checkNotNullParameter(p11, "p1");
            ((q1.f) this.receiver).i(p10, p11);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(a1 a1Var, x0 x0Var) {
            X(a1Var, x0Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncPagedListDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncPagedListDiffer.kt\nandroidx/paging/AsyncPagedListDiffer$loadStateManager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1855#2,2:595\n*S KotlinDebug\n*F\n+ 1 AsyncPagedListDiffer.kt\nandroidx/paging/AsyncPagedListDiffer$loadStateManager$1\n*L\n157#1:595,2\n*E\n"})
    public static final class d extends q1.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f<T> f71846d;

        d(f<T> fVar) {
            this.f71846d = fVar;
        }

        @Override // androidx.paging.q1.f
        public void e(@NotNull a1 type, @NotNull x0 state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            Iterator<T> it = this.f71846d.n().iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(type, state);
            }
        }
    }

    public static final class e extends q1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f<T> f71847a;

        e(f<T> fVar) {
            this.f71847a = fVar;
        }

        @Override // androidx.paging.q1.c
        public void a(int i10, int i11) {
            this.f71847a.v().a(i10, i11, null);
        }

        @Override // androidx.paging.q1.c
        public void b(int i10, int i11) {
            this.f71847a.v().b(i10, i11);
        }

        @Override // androidx.paging.q1.c
        public void c(int i10, int i11) {
            this.f71847a.v().c(i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.f$f, reason: collision with other inner class name */
    static final class C0652f extends kotlin.jvm.internal.l0 implements Function1<b<T>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<q1<T>, q1<T>, Unit> f71848a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0652f(Function2<? super q1<T>, ? super q1<T>, Unit> function2) {
            super(1);
            this.f71848a = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b<T> bVar) {
            return Boolean.valueOf((bVar instanceof a) && ((a) bVar).b() == this.f71848a);
        }
    }

    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public f(@NotNull RecyclerView.h<?> adapter, @NotNull androidx.recyclerview.widget.k.f<T> diffCallback) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Executor executorI = androidx.arch.core.executor.c.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "getMainThreadExecutor()");
        this.f71836c = executorI;
        this.f71837d = new CopyOnWriteArrayList<>();
        d dVar = new d(this);
        this.f71841h = dVar;
        this.f71842i = new c(dVar);
        this.f71843j = new CopyOnWriteArrayList();
        this.f71844k = new e(this);
        D(new androidx.recyclerview.widget.b(adapter));
        androidx.recyclerview.widget.c<T> cVarA = new androidx.recyclerview.widget.c.a(diffCallback).a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "Builder(diffCallback).build()");
        this.f71835b = cVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(final q1 q1Var, final q1 newSnapshot, final f this$0, final int i10, final q1 q1Var2, final r2 recordingCallback, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(newSnapshot, "$newSnapshot");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordingCallback, "$recordingCallback");
        l2<T> l2VarM = q1Var.M();
        l2<T> l2VarM2 = newSnapshot.M();
        androidx.recyclerview.widget.k.f<T> fVarB = this$0.f71835b.b();
        Intrinsics.checkNotNullExpressionValue(fVarB, "config.diffCallback");
        final k2 k2VarA = m2.a(l2VarM, l2VarM2, fVarB);
        this$0.f71836c.execute(new Runnable() { // from class: androidx.paging.d
            @Override // java.lang.Runnable
            public final void run() {
                f.H(this.f71673a, i10, q1Var2, newSnapshot, k2VarA, recordingCallback, q1Var, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(f this$0, int i10, q1 q1Var, q1 newSnapshot, k2 result, r2 recordingCallback, q1 q1Var2, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newSnapshot, "$newSnapshot");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(recordingCallback, "$recordingCallback");
        if (this$0.f71840g == i10) {
            this$0.w(q1Var, newSnapshot, result, recordingCallback, q1Var2.U(), runnable);
        }
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void m() {
    }

    private static /* synthetic */ void o() {
    }

    public static /* synthetic */ void r() {
    }

    private static /* synthetic */ void s() {
    }

    private static /* synthetic */ void t() {
    }

    private static /* synthetic */ void u() {
    }

    private final void x(q1<T> q1Var, q1<T> q1Var2, Runnable runnable) {
        Iterator<T> it = this.f71837d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(q1Var, q1Var2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void A(@NotNull Function2<? super q1<T>, ? super q1<T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt.removeAll((List) this.f71837d, (Function1) new C0652f(callback));
    }

    public final void B(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.f71836c = executor;
    }

    public final void C(int i10) {
        this.f71840g = i10;
    }

    public final void D(@NotNull androidx.recyclerview.widget.v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.f71834a = vVar;
    }

    public void E(@Nullable q1<T> q1Var) {
        F(q1Var, null);
    }

    public void F(@Nullable final q1<T> q1Var, @Nullable final Runnable runnable) {
        final int i10 = this.f71840g + 1;
        this.f71840g = i10;
        q1<T> q1Var2 = this.f71838e;
        if (q1Var == q1Var2) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (q1Var2 == null || !(q1Var instanceof j0)) {
                q1<T> q1VarH = h();
                if (q1Var == null) {
                    int iK = k();
                    if (q1Var2 != null) {
                        q1Var2.c0(this.f71844k);
                        q1Var2.e0((Function2) this.f71842i);
                        this.f71838e = null;
                    } else if (this.f71839f != null) {
                        this.f71839f = null;
                    }
                    v().c(0, iK);
                    x(q1VarH, null, runnable);
                    return;
                }
                if (h() == null) {
                    this.f71838e = q1Var;
                    q1Var.t((Function2) this.f71842i);
                    q1Var.r(this.f71844k);
                    v().b(0, q1Var.size());
                    x(null, q1Var, runnable);
                    return;
                }
                q1<T> q1Var3 = this.f71838e;
                if (q1Var3 != null) {
                    q1Var3.c0(this.f71844k);
                    q1Var3.e0((Function2) this.f71842i);
                    List<T> listN0 = q1Var3.n0();
                    Intrinsics.checkNotNull(listN0, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer.submitList$lambda$0>");
                    this.f71839f = (q1) listN0;
                    this.f71838e = null;
                }
                final q1<T> q1Var4 = this.f71839f;
                if (q1Var4 == null || this.f71838e != null) {
                    throw new IllegalStateException("must be in snapshot state to diff");
                }
                List<T> listN1 = q1Var.n0();
                Intrinsics.checkNotNull(listN1, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>");
                final q1 q1Var5 = (q1) listN1;
                final r2 r2Var = new r2();
                q1Var.r(r2Var);
                this.f71835b.a().execute(new Runnable() { // from class: androidx.paging.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.G(q1Var4, q1Var5, this, i10, q1Var, r2Var, runnable);
                    }
                });
                return;
            }
            q1Var2.c0(this.f71844k);
            q1Var2.e0((Function2) this.f71842i);
            this.f71841h.i(a1.REFRESH, x0.b.f72692b);
            this.f71841h.i(a1.PREPEND, new x0.c(false));
            this.f71841h.i(a1.APPEND, new x0.c(false));
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void c(@NotNull Function2<? super a1, ? super x0, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        q1<T> q1Var = this.f71838e;
        if (q1Var != null) {
            q1Var.t(listener);
        } else {
            this.f71841h.a(listener);
        }
        this.f71843j.add(listener);
    }

    public void d(@NotNull b<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71837d.add(listener);
    }

    public final void e(@NotNull Function2<? super q1<T>, ? super q1<T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f71837d.add(new a(callback));
    }

    @NotNull
    public final androidx.recyclerview.widget.c<T> f() {
        return this.f71835b;
    }

    @Nullable
    public q1<T> h() {
        q1<T> q1Var = this.f71839f;
        return q1Var == null ? this.f71838e : q1Var;
    }

    @Nullable
    public T j(int i10) {
        q1<T> q1Var = this.f71839f;
        q1<T> q1Var2 = this.f71838e;
        if (q1Var != null) {
            return q1Var.get(i10);
        }
        if (q1Var2 == null) {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        q1Var2.V(i10);
        return q1Var2.get(i10);
    }

    public int k() {
        q1<T> q1VarH = h();
        if (q1VarH != null) {
            return q1VarH.size();
        }
        return 0;
    }

    @NotNull
    public final CopyOnWriteArrayList<b<T>> l() {
        return this.f71837d;
    }

    @NotNull
    public final List<Function2<a1, x0, Unit>> n() {
        return this.f71843j;
    }

    @NotNull
    public final Executor p() {
        return this.f71836c;
    }

    public final int q() {
        return this.f71840g;
    }

    @NotNull
    public final androidx.recyclerview.widget.v v() {
        androidx.recyclerview.widget.v vVar = this.f71834a;
        if (vVar != null) {
            return vVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateCallback");
        return null;
    }

    public final void w(@NotNull q1<T> newList, @NotNull q1<T> diffSnapshot, @NotNull k2 diffResult, @NotNull r2 recordingCallback, int i10, @Nullable Runnable runnable) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffSnapshot, "diffSnapshot");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        Intrinsics.checkNotNullParameter(recordingCallback, "recordingCallback");
        q1<T> q1Var = this.f71839f;
        if (q1Var == null || this.f71838e != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.f71838e = newList;
        newList.t((Function2) this.f71842i);
        this.f71839f = null;
        m2.b(q1Var.M(), v(), diffSnapshot.M(), diffResult);
        recordingCallback.d(this.f71844k);
        newList.r(this.f71844k);
        if (!newList.isEmpty()) {
            newList.V(kotlin.ranges.r.I(m2.c(q1Var.M(), diffResult, diffSnapshot.M(), i10), 0, newList.size() - 1));
        }
        x(q1Var, this.f71838e, runnable);
    }

    public void y(@NotNull Function2<? super a1, ? super x0, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71843j.remove(listener);
        q1<T> q1Var = this.f71838e;
        if (q1Var != null) {
            q1Var.e0(listener);
        }
    }

    public void z(@NotNull b<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71837d.remove(listener);
    }

    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.b1(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                config.diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public f(@NotNull androidx.recyclerview.widget.v listUpdateCallback, @NotNull androidx.recyclerview.widget.c<T> config) {
        Intrinsics.checkNotNullParameter(listUpdateCallback, "listUpdateCallback");
        Intrinsics.checkNotNullParameter(config, "config");
        Executor executorI = androidx.arch.core.executor.c.i();
        Intrinsics.checkNotNullExpressionValue(executorI, "getMainThreadExecutor()");
        this.f71836c = executorI;
        this.f71837d = new CopyOnWriteArrayList<>();
        d dVar = new d(this);
        this.f71841h = dVar;
        this.f71842i = new c(dVar);
        this.f71843j = new CopyOnWriteArrayList();
        this.f71844k = new e(this);
        D(listUpdateCallback);
        this.f71835b = config;
    }
}
