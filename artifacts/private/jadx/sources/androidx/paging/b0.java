package androidx.paging;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageController\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n120#2,10:282\n120#2,8:292\n129#2:305\n1559#3:300\n1590#3,4:301\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageController\n*L\n127#1:282,10\n137#1:292,8\n137#1:305\n141#1:300\n141#1:301,4\n*E\n"})
final class b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0<T> f71529a = new c0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f71530b = kotlinx.coroutines.sync.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f71531c = -1;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {287}, m = "getStateAsEvents", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f71532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f71533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f71534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0<T> f71535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71536e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0<T> b0Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f71535d = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f71534c = obj;
            this.f71536e |= Integer.MIN_VALUE;
            return this.f71535d.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 0}, l = {287}, m = "record", n = {"this", androidx.core.app.w.I0, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f71537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f71538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f71539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f71540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b0<T> f71541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f71542f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0<T> b0Var, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f71541e = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f71540d = obj;
            this.f71542f |= Integer.MIN_VALUE;
            return this.f71541e.c(null, this);
        }
    }

    @Nullable
    public final g1.b<T> a() {
        g1 g1Var = (g1) CollectionsKt.firstOrNull((List) this.f71529a.b());
        if (g1Var != null && (g1Var instanceof g1.b)) {
            g1.b<T> bVar = (g1.b) g1Var;
            if (bVar.p() == a1.REFRESH) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object b(@NotNull kotlin.coroutines.d<? super List<? extends IndexedValue<? extends g1<T>>>> dVar) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f71536e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f71536e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f71534c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f71536e;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar2 = this.f71530b;
            aVar.f71532a = this;
            aVar.f71533b = aVar2;
            aVar.f71536e = 1;
            if (aVar2.h(null, aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) aVar.f71533b;
            b0<T> b0Var = (b0) aVar.f71532a;
            ResultKt.m(obj);
            aVar2 = aVar3;
            this = b0Var;
        }
        try {
            List<g1<T>> listB = this.f71529a.b();
            int size = (this.f71531c - listB.size()) + 1;
            List<g1<T>> list = listB;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i12 = 0;
            for (T t10 : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new IndexedValue(i12 + size, (g1) t10));
                i12 = i13;
            }
            aVar2.i(null);
            return arrayList;
        } catch (Throwable th2) {
            aVar2.i(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object c(@NotNull IndexedValue<? extends g1<T>> indexedValue, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f71542f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f71542f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f71540d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f71542f;
        int i12 = 0 << 1;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f71530b;
            bVar.f71537a = this;
            bVar.f71538b = indexedValue;
            bVar.f71539c = aVar;
            bVar.f71542f = 1;
            if (aVar.h(null, bVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) bVar.f71539c;
            indexedValue = (IndexedValue) bVar.f71538b;
            b0<T> b0Var = (b0) bVar.f71537a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = b0Var;
        }
        try {
            this.f71531c = indexedValue.getIndex();
            this.f71529a.a(indexedValue.getValue());
            Unit unit = Unit.f312394a;
            aVar.i(null);
            return unit;
        } catch (Throwable th2) {
            aVar.i(null);
            throw th2;
        }
    }
}
