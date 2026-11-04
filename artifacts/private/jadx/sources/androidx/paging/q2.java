package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.l(message = "PositionalDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.b1(expression = "PagingSource<Int, T>", imports = {"androidx.paging.PagingSource"}))
@SourceDebugExtension({"SMAP\nPositionalDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionalDataSource.jvm.kt\nandroidx/paging/PositionalDataSource\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,501:1\n314#2,11:502\n314#2,11:513\n1549#3:524\n1620#3,3:525\n1549#3:528\n1620#3,3:529\n*S KotlinDebug\n*F\n+ 1 PositionalDataSource.jvm.kt\nandroidx/paging/PositionalDataSource\n*L\n355#1:502,11\n423#1:513,11\n495#1:524\n495#1:525,3\n499#1:528\n499#1:529,3\n*E\n"})
public abstract class q2<T> extends u<Integer, T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f72491g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f72492f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public final int a(@NotNull c params, int i10) {
            Intrinsics.checkNotNullParameter(params, "params");
            int i11 = params.f72493a;
            int i12 = params.f72494b;
            int i13 = params.f72495c;
            return Math.max(0, Math.min(((((i10 - i12) + i13) - 1) / i13) * i13, (i11 / i13) * i13));
        }

        @oj.n
        public final int b(@NotNull c params, int i10, int i11) {
            Intrinsics.checkNotNullParameter(params, "params");
            return Math.min(i11 - i10, params.f72494b);
        }

        private a() {
        }
    }

    public static abstract class b<T> {
        public abstract void a(@NotNull List<? extends T> list, int i10);

        public abstract void b(@NotNull List<? extends T> list, int i10, int i11);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f72493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final int f72494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        public final int f72495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        public final boolean f72496d;

        public c(int i10, int i11, int i12, boolean z10) {
            this.f72493a = i10;
            this.f72494b = i11;
            this.f72495c = i12;
            this.f72496d = z10;
            if (i10 < 0) {
                throw new IllegalStateException(("invalid start position: " + i10).toString());
            }
            if (i11 < 0) {
                throw new IllegalStateException(("invalid load size: " + i11).toString());
            }
            if (i12 >= 0) {
                return;
            }
            throw new IllegalStateException(("invalid page size: " + i12).toString());
        }
    }

    public static abstract class d<T> {
        public abstract void a(@NotNull List<? extends T> list);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f72497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final int f72498b;

        public e(int i10, int i11) {
            this.f72497a = i10;
            this.f72498b = i11;
        }
    }

    public static final class f extends b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q2<T> f72499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<u.a<T>> f72500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f72501c;

        /* JADX WARN: Multi-variable type inference failed */
        f(q2<T> q2Var, kotlinx.coroutines.n<? super u.a<T>> nVar, c cVar) {
            this.f72499a = q2Var;
            this.f72500b = nVar;
            this.f72501c = cVar;
        }

        private final void c(c cVar, u.a<T> aVar) {
            if (cVar.f72496d) {
                aVar.e(cVar.f72495c);
            }
            kotlinx.coroutines.n<u.a<T>> nVar = this.f72500b;
            Result.a aVar2 = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(aVar));
        }

        @Override // androidx.paging.q2.b
        public void a(@NotNull List<? extends T> data, int i10) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!this.f72499a.j()) {
                c(this.f72501c, new u.a<>(data, i10 == 0 ? null : Integer.valueOf(i10), Integer.valueOf(data.size() + i10), i10, Integer.MIN_VALUE));
                return;
            }
            kotlinx.coroutines.n<u.a<T>> nVar = this.f72500b;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(u.a.f72622f.b()));
        }

        @Override // androidx.paging.q2.b
        public void b(@NotNull List<? extends T> data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!this.f72499a.j()) {
                int size = data.size() + i10;
                c(this.f72501c, new u.a<>(data, i10 == 0 ? null : Integer.valueOf(i10), size != i11 ? Integer.valueOf(size) : null, i10, (i11 - data.size()) - i10));
            } else {
                kotlinx.coroutines.n<u.a<T>> nVar = this.f72500b;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(u.a.f72622f.b()));
            }
        }
    }

    public static final class g extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f72502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q2<T> f72503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<u.a<T>> f72504c;

        /* JADX WARN: Multi-variable type inference failed */
        g(e eVar, q2<T> q2Var, kotlinx.coroutines.n<? super u.a<T>> nVar) {
            this.f72502a = eVar;
            this.f72503b = q2Var;
            this.f72504c = nVar;
        }

        @Override // androidx.paging.q2.d
        public void a(@NotNull List<? extends T> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            int i10 = this.f72502a.f72497a;
            Integer numValueOf = i10 == 0 ? null : Integer.valueOf(i10);
            if (this.f72503b.j()) {
                kotlinx.coroutines.n<u.a<T>> nVar = this.f72504c;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(u.a.f72622f.b()));
            } else {
                kotlinx.coroutines.n<u.a<T>> nVar2 = this.f72504c;
                Result.a aVar2 = Result.Companion;
                boolean z10 = false | false;
                nVar2.resumeWith(Result.m785constructorimpl(new u.a(data, numValueOf, Integer.valueOf(this.f72502a.f72497a + data.size()), 0, 0, 24, null)));
            }
        }
    }

    public q2() {
        super(u.e.POSITIONAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(e eVar, kotlin.coroutines.d<? super u.a<T>> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        D(eVar, new g(eVar, this, pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List G(n.a function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List H(Function1 function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List K(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    @oj.n
    public static final int w(@NotNull c cVar, int i10) {
        return f72491g.a(cVar, i10);
    }

    @oj.n
    public static final int x(@NotNull c cVar, int i10, int i11) {
        return f72491g.b(cVar, i10, i11);
    }

    public static /* synthetic */ void z() {
    }

    @androidx.annotation.m1
    public abstract void A(@NotNull c cVar, @NotNull b<T> bVar);

    @androidx.annotation.l1
    @Nullable
    public final Object B(@NotNull c cVar, @NotNull kotlin.coroutines.d<? super u.a<T>> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        A(cVar, new f(this, pVar, cVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @androidx.annotation.m1
    public abstract void D(@NotNull e eVar, @NotNull d<T> dVar);

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final <V> q2<V> l(@NotNull final Function1<? super T, ? extends V> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.p2
            @Override // n.a
            public final Object apply(Object obj) {
                return q2.H(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final <V> q2<V> m(@NotNull final n.a<T, V> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.o2
            @Override // n.a
            public final Object apply(Object obj) {
                return q2.G(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final <V> q2<V> o(@NotNull final Function1<? super List<? extends T>, ? extends List<? extends V>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.n2
            @Override // n.a
            public final Object apply(Object obj) {
                return q2.K(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final <V> q2<V> p(@NotNull n.a<List<T>, List<V>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new n3(this, function);
    }

    @Override // androidx.paging.u
    public boolean i() {
        return this.f72492f;
    }

    @Override // androidx.paging.u
    @Nullable
    public final Object k(@NotNull u.f<Integer> fVar, @NotNull kotlin.coroutines.d<? super u.a<T>> dVar) {
        if (fVar.e() != a1.REFRESH) {
            Integer numB = fVar.b();
            Intrinsics.checkNotNull(numB);
            int iIntValue = numB.intValue();
            int iC = fVar.c();
            if (fVar.e() == a1.PREPEND) {
                iC = Math.min(iC, iIntValue);
                iIntValue -= iC;
            }
            return C(new e(iIntValue, iC), dVar);
        }
        int iA = fVar.a();
        int iMax = 0;
        if (fVar.b() != null) {
            int iIntValue2 = fVar.b().intValue();
            if (fVar.d()) {
                iA = Math.max(iA / fVar.c(), 2) * fVar.c();
                iMax = Math.max(0, ((iIntValue2 - (iA / 2)) / fVar.c()) * fVar.c());
            } else {
                iMax = Math.max(0, iIntValue2 - (iA / 2));
            }
        }
        return B(new c(iMax, iA, fVar.c(), fVar.d()), dVar);
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Integer e(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }
}
