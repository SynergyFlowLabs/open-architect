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
@kotlin.l(message = "ItemKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.b1(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@SourceDebugExtension({"SMAP\nItemKeyedDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemKeyedDataSource.jvm.kt\nandroidx/paging/ItemKeyedDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n1#2:351\n314#3,11:352\n314#3,11:363\n314#3,11:374\n1549#4:385\n1620#4,3:386\n1549#4:389\n1620#4,3:390\n*S KotlinDebug\n*F\n+ 1 ItemKeyedDataSource.jvm.kt\nandroidx/paging/ItemKeyedDataSource\n*L\n187#1:352,11\n232#1:363,11\n238#1:374,11\n343#1:385\n343#1:386,3\n348#1:389\n348#1:390,3\n*E\n"})
public abstract class p0<Key, Value> extends u<Key, Value> {

    public static abstract class a<Value> {
        public abstract void a(@NotNull List<? extends Value> list);
    }

    public static abstract class b<Value> extends a<Value> {
        public abstract void b(@NotNull List<? extends Value> list, int i10, int i11);
    }

    public static class c<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Key f72413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final int f72414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        public final boolean f72415c;

        public c(@Nullable Key key, int i10, boolean z10) {
            this.f72413a = key;
            this.f72414b = i10;
            this.f72415c = z10;
        }
    }

    public static class d<Key> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final Key f72416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final int f72417b;

        public d(@NotNull Key key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f72416a = key;
            this.f72417b = i10;
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72418a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72418a = iArr;
        }
    }

    public static final class f extends a<Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<u.a<Value>> f72419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0<Key, Value> f72420b;

        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.n<? super u.a<Value>> nVar, p0<Key, Value> p0Var) {
            this.f72419a = nVar;
            this.f72420b = p0Var;
        }

        @Override // androidx.paging.p0.a
        public void a(@NotNull List<? extends Value> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            kotlinx.coroutines.n<u.a<Value>> nVar = this.f72419a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(new u.a(data, this.f72420b.z(data), this.f72420b.y(data), 0, 0, 24, null)));
        }
    }

    public static final class g extends b<Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<u.a<Value>> f72421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0<Key, Value> f72422b;

        /* JADX WARN: Multi-variable type inference failed */
        g(kotlinx.coroutines.n<? super u.a<Value>> nVar, p0<Key, Value> p0Var) {
            this.f72421a = nVar;
            this.f72422b = p0Var;
        }

        @Override // androidx.paging.p0.a
        public void a(@NotNull List<? extends Value> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            kotlinx.coroutines.n<u.a<Value>> nVar = this.f72421a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(new u.a(data, this.f72422b.z(data), this.f72422b.y(data), 0, 0, 24, null)));
        }

        @Override // androidx.paging.p0.b
        public void b(@NotNull List<? extends Value> data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            kotlinx.coroutines.n<u.a<Value>> nVar = this.f72421a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m785constructorimpl(new u.a(data, this.f72422b.z(data), this.f72422b.y(data), i10, (i11 - data.size()) - i10)));
        }
    }

    public p0() {
        super(u.e.ITEM_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List I(n.a function, List list) {
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
    public static final List J(Function1 function, List list) {
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
    public static final List M(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f w(kotlinx.coroutines.n<? super u.a<Value>> nVar) {
        return new f(nVar, this);
    }

    public abstract void A(@NotNull d<Key> dVar, @NotNull a<Value> aVar);

    @androidx.annotation.l1
    @Nullable
    public final Object B(@NotNull d<Key> dVar, @NotNull kotlin.coroutines.d<? super u.a<Value>> dVar2) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar2), 1);
        pVar.p0();
        A(dVar, w(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return objU;
    }

    public abstract void C(@NotNull d<Key> dVar, @NotNull a<Value> aVar);

    @androidx.annotation.l1
    @Nullable
    public final Object D(@NotNull d<Key> dVar, @NotNull kotlin.coroutines.d<? super u.a<Value>> dVar2) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar2), 1);
        pVar.p0();
        C(dVar, w(pVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return objU;
    }

    public abstract void E(@NotNull c<Key> cVar, @NotNull b<Value> bVar);

    @androidx.annotation.l1
    @Nullable
    public final Object F(@NotNull c<Key> cVar, @NotNull kotlin.coroutines.d<? super u.a<Value>> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        E(cVar, new g(pVar, this));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final <ToValue> p0<Key, ToValue> l(@NotNull final Function1<? super Value, ? extends ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.m0
            @Override // n.a
            public final Object apply(Object obj) {
                return p0.J(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final <ToValue> p0<Key, ToValue> m(@NotNull final n.a<Value, ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.o0
            @Override // n.a
            public final Object apply(Object obj) {
                return p0.I(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final <ToValue> p0<Key, ToValue> o(@NotNull final Function1<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.n0
            @Override // n.a
            public final Object apply(Object obj) {
                return p0.M(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.u
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final <ToValue> p0<Key, ToValue> p(@NotNull n.a<List<Value>, List<ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new l3(this, function);
    }

    @Override // androidx.paging.u
    @NotNull
    public Key e(@NotNull Value item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return x(item);
    }

    @Override // androidx.paging.u
    @Nullable
    public final Object k(@NotNull u.f<Key> fVar, @NotNull kotlin.coroutines.d<? super u.a<Value>> dVar) {
        int i10 = e.f72418a[fVar.e().ordinal()];
        if (i10 == 1) {
            return F(new c<>(fVar.b(), fVar.a(), fVar.d()), dVar);
        }
        if (i10 == 2) {
            Key keyB = fVar.b();
            Intrinsics.checkNotNull(keyB);
            return D(new d<>(keyB, fVar.c()), dVar);
        }
        if (i10 != 3) {
            throw new kotlin.k0();
        }
        Key keyB2 = fVar.b();
        Intrinsics.checkNotNull(keyB2);
        return B(new d<>(keyB2, fVar.c()), dVar);
    }

    @NotNull
    public abstract Key x(@NotNull Value value);

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Key y(@NotNull List<? extends Value> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
        if (objLastOrNull != null) {
            return (Key) x(objLastOrNull);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Key z(@NotNull List<? extends Value> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list);
        if (objFirstOrNull != null) {
            return (Key) x(objFirstOrNull);
        }
        return null;
    }
}
