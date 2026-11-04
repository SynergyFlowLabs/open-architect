package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface c3 {

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n+ 4 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SieveCache.kt\nandroidx/collection/SieveCacheKt\n*L\n1#1,1351:1\n1863#2,2:1352\n938#3,2:1354\n941#3,4:1370\n945#3:1380\n1009#3,3:1381\n1013#3,4:1398\n1017#3:1408\n269#4,7:1356\n280#4,3:1364\n283#4,2:1368\n286#4,6:1374\n269#4,7:1384\n280#4,3:1392\n283#4,2:1396\n286#4,6:1402\n301#4,7:1409\n308#4,4:1417\n301#4,7:1421\n308#4,4:1429\n1399#5:1363\n1270#5:1367\n1399#5:1391\n1270#5:1395\n1123#6:1416\n1123#6:1428\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet\n*L\n406#1:1352,2\n441#1:1354,2\n441#1:1370,4\n441#1:1380\n457#1:1381,3\n457#1:1398,4\n457#1:1408\n441#1:1356,7\n441#1:1364,3\n441#1:1368,2\n441#1:1374,6\n457#1:1384,7\n457#1:1392,3\n457#1:1396,2\n457#1:1402,6\n478#1:1409,7\n478#1:1417,4\n489#1:1421,7\n489#1:1429,4\n441#1:1363\n441#1:1367\n457#1:1391\n457#1:1395\n478#1:1416\n489#1:1428\n*E\n"})
    public static final class a implements Collection<Object>, qj.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39289b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.collection.i2<Object> f39290a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @kotlin.a1
        public static /* synthetic */ void l() {
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final boolean add(@Nullable Object obj) {
            return this.f39290a.M(obj);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f39290a.V();
        }

        @Override // java.util.Collection
        public boolean contains(@Nullable Object obj) {
            return this.f39290a.e(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(@NotNull Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f39290a.e(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final void d(@NotNull Function1<Object, Unit> function1) {
            androidx.collection.i2<Object> i2VarK = k();
            Object[] objArr = i2VarK.f12498b;
            long[] jArr = i2VarK.f12499c;
            int i10 = i2VarK.f12501e;
            while (i10 != Integer.MAX_VALUE) {
                int i11 = (int) ((jArr[i10] >> 31) & androidx.collection.g3.f12256c);
                function1.invoke(objArr[i10]);
                i10 = i11;
            }
        }

        public final void i(@NotNull Function1<Object, Unit> function1) {
            androidx.collection.i2<Object> i2Var = this.f39290a;
            Object[] objArr = i2Var.f12498b;
            long[] jArr = i2Var.f12499c;
            int i10 = i2Var.f12501e;
            while (i10 != Integer.MAX_VALUE) {
                int i11 = (int) ((jArr[i10] >> 31) & androidx.collection.g3.f12256c);
                function1.invoke(objArr[i10]);
                i10 = i11;
            }
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f39290a.v();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<Object> iterator() {
            return this.f39290a.U().iterator();
        }

        @NotNull
        public final androidx.collection.i2<Object> k() {
            return this.f39290a;
        }

        public int m() {
            return this.f39290a.t();
        }

        public final boolean n(@NotNull Function1<Object, Boolean> function1) {
            int iT = this.f39290a.t();
            androidx.collection.i2<Object> i2Var = this.f39290a;
            Object[] objArr = i2Var.f12498b;
            long[] jArr = i2Var.f12497a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                if (function1.invoke(objArr[i13]).booleanValue()) {
                                    i2Var.A0(i13);
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            return iT != this.f39290a.t();
        }

        public final boolean p(@NotNull Function1<Object, Boolean> function1) {
            androidx.collection.i2<Object> i2Var = this.f39290a;
            Object[] objArr = i2Var.f12498b;
            int iT = i2Var.t();
            long[] jArr = i2Var.f12497a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                int i13 = (i10 << 3) + i12;
                                if (!function1.invoke(objArr[i13]).booleanValue()) {
                                    i2Var.A0(i13);
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            return iT != i2Var.t();
        }

        @Override // java.util.Collection
        public final boolean remove(@Nullable Object obj) {
            return this.f39290a.t0(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NotNull Collection<?> collection) {
            return this.f39290a.t0(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NotNull Collection<?> collection) {
            return this.f39290a.G0(collection);
        }

        public final void s(int i10) {
            this.f39290a.J0(i10);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return m();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        public a(@NotNull androidx.collection.i2<Object> i2Var) {
            this.f39290a = i2Var;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.v.b(this, tArr);
        }

        public /* synthetic */ a(androidx.collection.i2 i2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? androidx.collection.x2.b() : i2Var);
        }
    }

    void a(@NotNull a aVar);

    boolean b(@Nullable Object obj, @Nullable Object obj2);
}
