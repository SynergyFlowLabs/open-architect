package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedSetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1511:1\n1855#2,2:1512\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedSetWrapper\n*L\n1438#1:1512,2\n*E\n"})
class y2<E> implements Set<E>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w2<E> f12519a;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", i = {0, 0, 0, 0}, l = {1454}, m = "invokeSuspend", n = {"$this$iterator", "elements$iv", "nodes$iv", "previousNode$iv"}, s = {"L$0", "L$1", "L$2", "I$0"})
    @SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedSetWrapper$iterator$1\n+ 2 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 3 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1511:1\n301#2,7:1512\n308#2,4:1520\n1123#3:1519\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedSetWrapper$iterator$1\n*L\n1454#1:1512,7\n1454#1:1520,4\n1454#1:1519\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super E>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f12521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f12524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y2<E> f12525f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y2<E> y2Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f12525f = y2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f12525f, dVar);
            aVar.f12524e = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object[] objArr;
            long[] jArr;
            kotlin.sequences.n nVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f12523d;
            if (i11 == 0) {
                ResultKt.m(obj);
                kotlin.sequences.n nVar2 = (kotlin.sequences.n) this.f12524e;
                w2 w2Var = ((y2) this.f12525f).f12519a;
                Object[] objArr2 = w2Var.f12498b;
                long[] jArr2 = w2Var.f12499c;
                i10 = w2Var.f12501e;
                objArr = objArr2;
                jArr = jArr2;
                nVar = nVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f12522c;
                jArr = (long[]) this.f12521b;
                objArr = (Object[]) this.f12520a;
                nVar = (kotlin.sequences.n) this.f12524e;
                ResultKt.m(obj);
            }
            while (i10 != Integer.MAX_VALUE) {
                int i12 = (int) ((jArr[i10] >> 31) & g3.f12256c);
                Object obj2 = objArr[i10];
                this.f12524e = nVar;
                this.f12520a = objArr;
                this.f12521b = jArr;
                this.f12522c = i12;
                this.f12523d = 1;
                if (nVar.b(obj2, this) == objL) {
                    return objL;
                }
                i10 = i12;
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super E> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public y2(@NotNull w2<E> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f12519a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f12519a.e(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f12519a.e((E) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.f12519a, ((y2) obj).f12519a);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f12519a.hashCode();
    }

    public int i() {
        return this.f12519a.f12503g;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f12519a.v();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return kotlin.sequences.o.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    @NotNull
    public String toString() {
        return this.f12519a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
