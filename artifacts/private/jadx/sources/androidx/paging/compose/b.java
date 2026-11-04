package androidx.paging.compose;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.ui.platform.l0;
import androidx.paging.a2;
import androidx.paging.n;
import androidx.paging.q0;
import androidx.paging.x1;
import androidx.paging.z1;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyPagingItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItems\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,230:1\n81#2:231\n107#2,2:232\n81#2:234\n107#2,2:235\n*S KotlinDebug\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItems\n*L\n88#1:231\n88#1:232,2\n160#1:234\n160#1:235,2\n*E\n"})
public final class b<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f71648f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i<x1<T>> f71649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f71650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f71651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f71652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n3 f71653e;

    static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<T> f71654a;

        a(b<T> bVar) {
            this.f71654a = bVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull n nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            this.f71654a.n(nVar);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.compose.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    static final class C0641b extends o implements Function2<x1<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f71656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T> f71657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0641b(b<T> bVar, kotlin.coroutines.d<? super C0641b> dVar) {
            super(2, dVar);
            this.f71657c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            C0641b c0641b = new C0641b(this.f71657c, dVar);
            c0641b.f71656b = obj;
            return c0641b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71655a;
            if (i10 == 0) {
                ResultKt.m(obj);
                x1<T> x1Var = (x1) this.f71656b;
                c cVar = ((b) this.f71657c).f71651c;
                this.f71655a = 1;
                if (cVar.o(x1Var, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull x1<T> x1Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0641b) create(x1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class c extends a2<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ b<T> f71658m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b<T> bVar, CoroutineContext coroutineContext, x1<T> x1Var) {
            super(coroutineContext, x1Var);
            this.f71658m = bVar;
        }

        @Override // androidx.paging.a2
        @Nullable
        public Object v(@NotNull z1<T> z1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            this.f71658m.o();
            return Unit.f312394a;
        }
    }

    public b(@NotNull i<x1<T>> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f71649a = flow;
        CoroutineContext coroutineContextB = l0.f40623l.b();
        this.f71650b = coroutineContextB;
        c cVar = new c(this, coroutineContextB, flow instanceof o0 ? (x1) CollectionsKt.firstOrNull((List) ((o0) flow).a()) : null);
        this.f71651c = cVar;
        this.f71652d = d7.g(cVar.B(), null, 2, null);
        n value = cVar.q().getValue();
        this.f71653e = d7.g(value == null ? new n(androidx.paging.compose.c.f71660b.k(), androidx.paging.compose.c.f71660b.j(), androidx.paging.compose.c.f71660b.i(), androidx.paging.compose.c.f71660b, null, 16, null) : value, null, 2, null);
    }

    private final void m(q0<T> q0Var) {
        this.f71652d.setValue(q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(n nVar) {
        this.f71653e.setValue(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        m(this.f71651c.B());
    }

    @Nullable
    public final Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objCollect = k.v0(this.f71651c.q()).collect(new a(this), dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    @Nullable
    public final Object e(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 2 | 0;
        Object objC = k.C(this.f71649a, new C0641b(this, null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @Nullable
    public final T f(int i10) {
        this.f71651c.p(i10);
        return h().get(i10);
    }

    public final int g() {
        return h().size();
    }

    @NotNull
    public final q0<T> h() {
        return (q0) this.f71652d.getValue();
    }

    @NotNull
    public final n i() {
        return (n) this.f71653e.getValue();
    }

    @Nullable
    public final T j(int i10) {
        return h().get(i10);
    }

    public final void k() {
        this.f71651c.w();
    }

    public final void l() {
        this.f71651c.z();
    }
}
