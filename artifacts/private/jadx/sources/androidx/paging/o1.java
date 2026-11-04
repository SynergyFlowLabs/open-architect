package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.l(message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.b1(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@SourceDebugExtension({"SMAP\nPageKeyedDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageKeyedDataSource.jvm.kt\nandroidx/paging/PageKeyedDataSource\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,351:1\n314#2,11:352\n314#2,11:363\n314#2,11:374\n1549#3:385\n1620#3,3:386\n1549#3:389\n1620#3,3:390\n*S KotlinDebug\n*F\n+ 1 PageKeyedDataSource.jvm.kt\nandroidx/paging/PageKeyedDataSource\n*L\n202#1:352,11\n236#1:363,11\n241#1:374,11\n344#1:385\n344#1:386,3\n349#1:389\n349#1:390,3\n*E\n"})
public abstract class o1<Key, Value> extends u<Key, Value> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f72404f;

    public static abstract class a<Key, Value> {
        public abstract void a(@NotNull List<? extends Value> list, @Nullable Key key);
    }

    public static abstract class b<Key, Value> {
        public abstract void a(@NotNull List<? extends Value> list, int i10, int i11, @Nullable Key key, @Nullable Key key2);

        public abstract void b(@NotNull List<? extends Value> list, @Nullable Key key, @Nullable Key key2);
    }

    public static class c<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f72405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final boolean f72406b;

        public c(int i10, boolean z10) {
            this.f72405a = i10;
            this.f72406b = z10;
        }
    }

    public static class d<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final Key f72407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final int f72408b;

        public d(@NotNull Key key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f72407a = key;
            this.f72408b = i10;
        }
    }

    public static final class e extends a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<u.a<Value>> f72409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f72410b;

        /* JADX WARN: Multi-variable type inference failed */
        e(kotlinx.coroutines.n<? super u.a<Value>> nVar, boolean z10) {
            this.f72409a = nVar;
            this.f72410b = z10;
        }

        @Override // androidx.paging.o1.a
        public void a(@NotNull List<? extends Value> data, @Nullable Key key) {
            Intrinsics.checkNotNullParameter(data, "data");
            kotlinx.coroutines.n<u.a<Value>> nVar = this.f72409a;
            Result.a aVar = Result.Companion;
            boolean z10 = this.f72410b;
            nVar.resumeWith(Result.m785constructorimpl(new u.a(data, z10 ? null : key, z10 ? key : null, 0, 0, 24, null)));
        }
    }

    public static final class f extends b<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<u.a<Value>> f72411a;

        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.n<? super u.a<Value>> nVar) {
            this.f72411a = nVar;
        }

        @Override // androidx.paging.o1.b
        public void a(@NotNull List<? extends Value> data, int i10, int i11, @Nullable Key key, @Nullable Key key2) {
            Intrinsics.checkNotNullParameter(data, "data");
            kotlinx.coroutines.n<u.a<Value>> nVar = this.f72411a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(new u.a(data, key, key2, i10, (i11 - data.size()) - i10)));
        }

        @Override // androidx.paging.o1.b
        public void b(@NotNull List<? extends Value> data, @Nullable Key key, @Nullable Key key2) {
            Intrinsics.checkNotNullParameter(data, "data");
            kotlinx.coroutines.n<u.a<Value>> nVar = this.f72411a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(new u.a(data, key, key2, 0, 0, 24, null)));
        }
    }

    public o1() {
        super(u.e.PAGE_KEYED);
    }

    public static /* synthetic */ void A() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(d<Key> dVar, kotlin.coroutines.d<? super u.a<Value>> dVar2) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar2), 1);
        pVar.p0();
        C(dVar, z(pVar, true));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(d<Key> dVar, kotlin.coroutines.d<? super u.a<Value>> dVar2) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar2), 1);
        pVar.p0();
        E(dVar, z(pVar, false));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(c<Key> cVar, kotlin.coroutines.d<? super u.a<Value>> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        G(cVar, new f(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List J(n.a function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List K(Function1 function, List list) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a<Key, Value> z(kotlinx.coroutines.n<? super u.a<Value>> nVar, boolean z10) {
        return new e(nVar, z10);
    }

    public abstract void C(@NotNull d<Key> dVar, @NotNull a<Key, Value> aVar);

    public abstract void E(@NotNull d<Key> dVar, @NotNull a<Key, Value> aVar);

    public abstract void G(@NotNull c<Key> cVar, @NotNull b<Key, Value> bVar);

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final <ToValue> o1<Key, ToValue> l(@NotNull final Function1<? super Value, ? extends ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.n1
            @Override // n.a
            public final Object apply(Object obj) {
                return o1.K(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final <ToValue> o1<Key, ToValue> m(@NotNull final n.a<Value, ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.l1
            @Override // n.a
            public final Object apply(Object obj) {
                return o1.J(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final <ToValue> o1<Key, ToValue> o(@NotNull final Function1<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.m1
            @Override // n.a
            public final Object apply(Object obj) {
                return o1.N(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final <ToValue> o1<Key, ToValue> p(@NotNull n.a<List<Value>, List<ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new m3(this, function);
    }

    @Override // androidx.paging.u
    @NotNull
    public Key e(@NotNull Value item) {
        Intrinsics.checkNotNullParameter(item, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.u
    public boolean f() {
        return this.f72404f;
    }

    @Override // androidx.paging.u
    @Nullable
    public final Object k(@NotNull u.f<Key> fVar, @NotNull kotlin.coroutines.d<? super u.a<Value>> dVar) {
        if (fVar.e() == a1.REFRESH) {
            return F(new c<>(fVar.a(), fVar.d()), dVar);
        }
        if (fVar.b() == null) {
            return u.a.f72622f.b();
        }
        if (fVar.e() == a1.PREPEND) {
            return D(new d<>(fVar.b(), fVar.c()), dVar);
        }
        if (fVar.e() == a1.APPEND) {
            return B(new d<>(fVar.b(), fVar.c()), dVar);
        }
        throw new IllegalArgumentException("Unsupported type " + fVar.e());
    }
}
