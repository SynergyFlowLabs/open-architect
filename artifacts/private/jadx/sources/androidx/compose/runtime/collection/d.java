package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.w0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.a0;
import kotlin.a1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1116:1\n289#1,4:1117\n289#1,4:1121\n289#1,4:1127\n289#1,4:1133\n289#1,4:1141\n289#1,4:1147\n44#1:1157\n472#1:1158\n48#1:1161\n472#1:1162\n44#1:1163\n472#1:1164\n516#1:1167\n332#1:1168\n472#1:1169\n516#1:1170\n472#1:1171\n516#1:1172\n44#1:1173\n472#1:1174\n516#1:1175\n44#1:1176\n472#1:1177\n472#1:1178\n472#1:1179\n44#1:1180\n472#1:1181\n44#1:1184\n44#1:1189\n44#1:1190\n472#1:1191\n27#2,2:1125\n27#2,2:1131\n27#2,2:1137\n27#2,2:1139\n27#2,2:1145\n27#2,2:1151\n27#2,2:1165\n27#2,2:1185\n27#2,2:1187\n1872#3,3:1153\n1863#3,2:1159\n1863#3,2:1182\n1#4:1156\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n55#1:1117,4\n66#1:1121,4\n87#1:1127,4\n111#1:1133,4\n156#1:1141,4\n169#1:1147,4\n234#1:1157\n235#1:1158\n265#1:1161\n266#1:1162\n279#1:1163\n280#1:1164\n309#1:1167\n310#1:1168\n312#1:1169\n340#1:1170\n340#1:1171\n526#1:1172\n529#1:1173\n529#1:1174\n563#1:1175\n563#1:1176\n563#1:1177\n588#1:1178\n598#1:1179\n680#1:1180\n681#1:1181\n702#1:1184\n727#1:1189\n761#1:1190\n762#1:1191\n69#1:1125,2\n90#1:1131,2\n114#1:1137,2\n121#1:1139,2\n157#1:1145,2\n172#1:1151,2\n300#1:1165,2\n703#1:1185,2\n719#1:1187,2\n179#1:1153,3\n256#1:1159,2\n694#1:1182,2\n*E\n"})
public final class d<T> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35551d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public T[] f35552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<T> f35553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35554c;

    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1116:1\n472#2:1117\n516#2:1118\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n852#1:1117\n857#1:1118\n*E\n"})
    private static final class a<T> implements List<T>, qj.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final d<T> f35555a;

        public a(@NotNull d<T> dVar) {
            this.f35555a = dVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.f35555a.d(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends T> collection) {
            return this.f35555a.j(i10, collection);
        }

        public int c() {
            return this.f35555a.R();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f35555a.r();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f35555a.s(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<?> collection) {
            return this.f35555a.u(collection);
        }

        public T d(int i10) {
            e.d(this, i10);
            return this.f35555a.r0(i10);
        }

        @Override // java.util.List
        public T get(int i10) {
            e.d(this, i10);
            return this.f35555a.f35552a[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f35555a.S(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f35555a.R() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f35555a.a0(obj);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<?> collection) {
            return this.f35555a.p0(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<?> collection) {
            return this.f35555a.v0(collection);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            e.d(this, i10);
            return this.f35555a.x0(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i10, int i11) {
            e.e(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f35555a.c(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> collection) {
            return this.f35555a.m(collection);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f35555a.n0(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) v.b(this, tArr);
        }
    }

    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1116:1\n1863#2,2:1117\n1863#2,2:1119\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n924#1:1117,2\n1008#1:1119,2\n*E\n"})
    private static final class b<T> implements List<T>, qj.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<T> f35556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f35557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35558c;

        public b(@NotNull List<T> list, int i10, int i11) {
            this.f35556a = list;
            this.f35557b = i10;
            this.f35558c = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            List<T> list = this.f35556a;
            int i10 = this.f35558c;
            this.f35558c = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends T> collection) {
            this.f35556a.addAll(i10 + this.f35557b, collection);
            int size = collection.size();
            this.f35558c += size;
            return size > 0;
        }

        public int c() {
            return this.f35558c - this.f35557b;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f35558c - 1;
            int i11 = this.f35557b;
            if (i11 <= i10) {
                while (true) {
                    this.f35556a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f35558c = this.f35557b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f35558c;
            for (int i11 = this.f35557b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f35556a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public T d(int i10) {
            e.d(this, i10);
            T tRemove = this.f35556a.remove(i10 + this.f35557b);
            this.f35558c--;
            return tRemove;
        }

        @Override // java.util.List
        public T get(int i10) {
            e.d(this, i10);
            return this.f35556a.get(i10 + this.f35557b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f35558c;
            for (int i11 = this.f35557b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f35556a.get(i11), obj)) {
                    return i11 - this.f35557b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f35558c == this.f35557b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f35558c - 1;
            int i11 = this.f35557b;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.f35556a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f35557b;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<?> collection) {
            int i10 = this.f35558c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f35558c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<?> collection) {
            int i10 = this.f35558c;
            int i11 = i10 - 1;
            int i12 = this.f35557b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f35556a.get(i11))) {
                        this.f35556a.remove(i11);
                        this.f35558c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f35558c;
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            e.d(this, i10);
            return this.f35556a.set(i10 + this.f35557b, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i10, int i11) {
            e.e(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f35556a.add(i10 + this.f35557b, t10);
            this.f35558c++;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f35558c;
            for (int i11 = this.f35557b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f35556a.get(i11), obj)) {
                    this.f35556a.remove(i11);
                    this.f35558c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) v.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> collection) {
            this.f35556a.addAll(this.f35558c, collection);
            int size = collection.size();
            this.f35558c += size;
            return size > 0;
        }
    }

    private static final class c<T> implements ListIterator<T>, qj.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<T> f35559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35560b;

        public c(@NotNull List<T> list, int i10) {
            this.f35559a = list;
            this.f35560b = i10;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.f35559a.add(this.f35560b, t10);
            this.f35560b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f35560b < this.f35559a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f35560b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f35559a;
            int i10 = this.f35560b;
            this.f35560b = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f35560b;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f35560b - 1;
            this.f35560b = i10;
            return this.f35559a.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f35560b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f35560b - 1;
            this.f35560b = i10;
            this.f35559a.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f35559a.set(this.f35560b, t10);
        }
    }

    @a1
    public d(@NotNull T[] tArr, int i10) {
        this.f35552a = tArr;
        this.f35554c = i10;
    }

    @a1
    public static /* synthetic */ void O() {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T A(@NotNull Function1<? super T, Boolean> function1) {
        T[] tArr = this.f35552a;
        int iR = R();
        for (int i10 = 0; i10 < iR; i10++) {
            ?? r10 = (Object) tArr[i10];
            if (function1.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        D0("MutableVector contains no element matching the predicate.");
        throw new a0();
    }

    public final void A0(@NotNull Comparator<T> comparator) {
        ArraysKt.sortWith(this.f35552a, comparator, 0, this.f35554c);
    }

    @Nullable
    public final T B() {
        if (R() == 0) {
            return null;
        }
        return this.f35552a[0];
    }

    public final int B0(@NotNull Function1<? super T, Integer> function1) {
        T[] tArr = this.f35552a;
        int iIntValue = 0;
        for (int i10 = 0; i10 < R(); i10++) {
            iIntValue += function1.invoke(tArr[i10]).intValue();
        }
        return iIntValue;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Nullable
    public final T C(@NotNull Function1<? super T, Boolean> function1) {
        T[] tArr = this.f35552a;
        int iR = R();
        for (int i10 = 0; i10 < iR; i10++) {
            ?? r10 = (Object) tArr[i10];
            if (function1.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        return null;
    }

    @a1
    @NotNull
    public final Void C0() {
        D0("MutableVector is empty.");
        throw new a0();
    }

    public final <R> R D(R r10, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        T[] tArr = this.f35552a;
        int iR = R();
        for (int i10 = 0; i10 < iR; i10++) {
            r10 = function2.invoke(r10, tArr[i10]);
        }
        return r10;
    }

    @a1
    @NotNull
    public final Void D0(@NotNull String str) {
        throw new NoSuchElementException(str);
    }

    public final <R> R F(R r10, @NotNull n<? super Integer, ? super R, ? super T, ? extends R> nVar) {
        T[] tArr = this.f35552a;
        int iR = R();
        for (int i10 = 0; i10 < iR; i10++) {
            r10 = nVar.invoke(Integer.valueOf(i10), r10, tArr[i10]);
        }
        return r10;
    }

    public final <R> R G(R r10, @NotNull Function2<? super T, ? super R, ? extends R> function2) {
        int iR = R() - 1;
        T[] tArr = this.f35552a;
        if (iR >= tArr.length) {
            return r10;
        }
        while (iR >= 0) {
            r10 = function2.invoke(tArr[iR], r10);
            iR--;
        }
        return r10;
    }

    public final <R> R H(R r10, @NotNull n<? super Integer, ? super T, ? super R, ? extends R> nVar) {
        int iR = R() - 1;
        T[] tArr = this.f35552a;
        if (iR >= tArr.length) {
            return r10;
        }
        while (iR >= 0) {
            r10 = nVar.invoke(Integer.valueOf(iR), tArr[iR], r10);
            iR--;
        }
        return r10;
    }

    public final void I(@NotNull Function1<? super T, Unit> function1) {
        T[] tArr = this.f35552a;
        int iR = R();
        for (int i10 = 0; i10 < iR; i10++) {
            function1.invoke(tArr[i10]);
        }
    }

    public final void J(@NotNull Function2<? super Integer, ? super T, Unit> function2) {
        T[] tArr = this.f35552a;
        int iR = R();
        for (int i10 = 0; i10 < iR; i10++) {
            function2.invoke(Integer.valueOf(i10), tArr[i10]);
        }
    }

    public final void K(@NotNull Function1<? super T, Unit> function1) {
        int iR = R() - 1;
        T[] tArr = this.f35552a;
        if (iR >= tArr.length) {
            return;
        }
        while (iR >= 0) {
            function1.invoke(tArr[iR]);
            iR--;
        }
    }

    public final void L(@NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int iR = R() - 1;
        T[] tArr = this.f35552a;
        if (iR >= tArr.length) {
            return;
        }
        while (iR >= 0) {
            function2.invoke(Integer.valueOf(iR), tArr[iR]);
            iR--;
        }
    }

    public final T M(int i10) {
        return this.f35552a[i10];
    }

    @a1
    @NotNull
    public final T[] N() {
        return this.f35552a;
    }

    @NotNull
    public final IntRange P() {
        return r.W1(0, R());
    }

    public final int Q() {
        return R() - 1;
    }

    public final int R() {
        return this.f35554c;
    }

    public final int S(T t10) {
        T[] tArr = this.f35552a;
        int i10 = this.f35554c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (Intrinsics.areEqual(t10, tArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final int T(@NotNull Function1<? super T, Boolean> function1) {
        T[] tArr = this.f35552a;
        int iR = R();
        for (int i10 = 0; i10 < iR; i10++) {
            if (function1.invoke(tArr[i10]).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public final int U(@NotNull Function1<? super T, Boolean> function1) {
        int iR = R() - 1;
        T[] tArr = this.f35552a;
        if (iR < tArr.length) {
            while (iR >= 0) {
                if (function1.invoke(tArr[iR]).booleanValue()) {
                    return iR;
                }
                iR--;
            }
        }
        return -1;
    }

    public final boolean V() {
        return R() == 0;
    }

    public final boolean W() {
        return R() != 0;
    }

    public final T Y() {
        if (R() != 0) {
            return this.f35552a[R() - 1];
        }
        D0("MutableVector is empty.");
        throw new a0();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T Z(@NotNull Function1<? super T, Boolean> function1) {
        T[] tArr = this.f35552a;
        for (int iR = R() - 1; iR >= 0; iR--) {
            ?? r10 = (Object) tArr[iR];
            if (function1.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        D0("MutableVector contains no element matching the predicate.");
        throw new a0();
    }

    public final int a0(T t10) {
        T[] tArr = this.f35552a;
        for (int i10 = this.f35554c - 1; i10 >= 0; i10--) {
            if (Intrinsics.areEqual(t10, tArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Nullable
    public final T b0() {
        if (R() == 0) {
            return null;
        }
        return this.f35552a[R() - 1];
    }

    public final void c(int i10, T t10) {
        int i11 = this.f35554c + 1;
        if (this.f35552a.length < i11) {
            u0(i11);
        }
        T[] tArr = this.f35552a;
        int i12 = this.f35554c;
        if (i10 != i12) {
            System.arraycopy(tArr, i10, tArr, i10 + 1, i12 - i10);
        }
        tArr[i10] = t10;
        this.f35554c++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    @Nullable
    public final T c0(@NotNull Function1<? super T, Boolean> function1) {
        T[] tArr = this.f35552a;
        for (int iR = R() - 1; iR >= 0; iR--) {
            ?? r10 = (Object) tArr[iR];
            if (function1.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        return null;
    }

    public final boolean d(T t10) {
        int i10 = this.f35554c + 1;
        if (this.f35552a.length < i10) {
            u0(i10);
        }
        T[] tArr = this.f35552a;
        int i11 = this.f35554c;
        tArr[i11] = t10;
        this.f35554c = i11 + 1;
        return true;
    }

    public final /* synthetic */ <R> R[] e0(Function1<? super T, ? extends R> function1) {
        int iR = R();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[iR];
        for (int i10 = 0; i10 < iR; i10++) {
            rArr[i10] = function1.invoke(this.f35552a[i10]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] f0(Function2<? super Integer, ? super T, ? extends R> function2) {
        int iR = R();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[iR];
        for (int i10 = 0; i10 < iR; i10++) {
            rArr[i10] = function2.invoke(Integer.valueOf(i10), this.f35552a[i10]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> d<R> h0(Function2<? super Integer, ? super T, ? extends R> function2) {
        int iR = R();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[iR];
        T[] tArr = this.f35552a;
        int i10 = 0;
        for (int i11 = 0; i11 < iR; i11++) {
            R rInvoke = function2.invoke(Integer.valueOf(i11), tArr[i11]);
            if (rInvoke != null) {
                objArr[i10] = rInvoke;
                i10++;
            }
        }
        return new d<>(objArr, i10);
    }

    public final boolean i(int i10, @NotNull d<T> dVar) {
        int i11 = dVar.f35554c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f35554c + i11;
        if (this.f35552a.length < i12) {
            u0(i12);
        }
        T[] tArr = this.f35552a;
        int i13 = this.f35554c;
        if (i10 != i13) {
            System.arraycopy(tArr, i10, tArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(dVar.f35552a, 0, tArr, i10, i11);
        this.f35554c += i11;
        return true;
    }

    public final /* synthetic */ <R> d<R> i0(Function1<? super T, ? extends R> function1) {
        int iR = R();
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[iR];
        T[] tArr = this.f35552a;
        int i10 = 0;
        for (int i11 = 0; i11 < iR; i11++) {
            R rInvoke = function1.invoke(tArr[i11]);
            if (rInvoke != null) {
                objArr[i10] = rInvoke;
                i10++;
            }
        }
        return new d<>(objArr, i10);
    }

    public final boolean j(int i10, @NotNull Collection<? extends T> collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f35554c + size;
        if (this.f35552a.length < i12) {
            u0(i12);
        }
        T[] tArr = this.f35552a;
        int i13 = this.f35554c;
        if (i10 != i13) {
            System.arraycopy(tArr, i10, tArr, i10 + size, i13 - i10);
        }
        for (T t10 : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            tArr[i11 + i10] = t10;
            i11 = i14;
        }
        this.f35554c += size;
        return true;
    }

    public final boolean k(int i10, @NotNull List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i11 = this.f35554c + size;
        if (this.f35552a.length < i11) {
            u0(i11);
        }
        T[] tArr = this.f35552a;
        int i12 = this.f35554c;
        if (i10 != i12) {
            System.arraycopy(tArr, i10, tArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            tArr[i10 + i13] = list.get(i13);
        }
        this.f35554c += size;
        return true;
    }

    public final boolean l(@NotNull d<T> dVar) {
        return i(R(), dVar);
    }

    public final void l0(T t10) {
        n0(t10);
    }

    public final boolean m(@NotNull Collection<? extends T> collection) {
        return j(this.f35554c, collection);
    }

    public final void m0(T t10) {
        d(t10);
    }

    public final boolean n(@NotNull List<? extends T> list) {
        return k(R(), list);
    }

    public final boolean n0(T t10) {
        int iS = S(t10);
        if (iS < 0) {
            return false;
        }
        r0(iS);
        return true;
    }

    public final boolean o(@NotNull T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return false;
        }
        int i10 = this.f35554c + length;
        if (this.f35552a.length < i10) {
            u0(i10);
        }
        System.arraycopy(tArr, 0, this.f35552a, this.f35554c, length);
        this.f35554c += length;
        return true;
    }

    public final boolean o0(@NotNull d<T> dVar) {
        int i10 = this.f35554c;
        int iR = dVar.R() - 1;
        if (iR >= 0) {
            int i11 = 0;
            while (true) {
                n0(dVar.f35552a[i11]);
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return i10 != this.f35554c;
    }

    public final boolean p(@NotNull Function1<? super T, Boolean> function1) {
        T[] tArr = this.f35552a;
        int iR = R();
        for (int i10 = 0; i10 < iR; i10++) {
            if (function1.invoke(tArr[i10]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean p0(@NotNull Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f35554c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            n0(it.next());
        }
        return i10 != this.f35554c;
    }

    @NotNull
    public final List<T> q() {
        List<T> list = this.f35553b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f35553b = aVar;
        return aVar;
    }

    public final boolean q0(@NotNull List<? extends T> list) {
        int i10 = this.f35554c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            n0(list.get(i11));
        }
        return i10 != this.f35554c;
    }

    public final void r() {
        T[] tArr = this.f35552a;
        int i10 = this.f35554c;
        for (int i11 = 0; i11 < i10; i11++) {
            tArr[i11] = null;
        }
        this.f35554c = 0;
    }

    public final T r0(int i10) {
        T[] tArr = this.f35552a;
        T t10 = tArr[i10];
        if (i10 != R() - 1) {
            int i11 = i10 + 1;
            System.arraycopy(tArr, i11, tArr, i10, this.f35554c - i11);
        }
        int i12 = this.f35554c - 1;
        this.f35554c = i12;
        tArr[i12] = null;
        return t10;
    }

    public final boolean s(T t10) {
        int iR = R() - 1;
        if (iR >= 0) {
            for (int i10 = 0; !Intrinsics.areEqual(this.f35552a[i10], t10); i10++) {
                if (i10 != iR) {
                }
            }
            return true;
        }
        return false;
    }

    public final void s0(@NotNull Function1<? super T, Boolean> function1) {
        int iR = R();
        int i10 = 0;
        for (int i11 = 0; i11 < iR; i11++) {
            if (function1.invoke(this.f35552a[i11]).booleanValue()) {
                i10++;
            } else if (i10 > 0) {
                T[] tArr = this.f35552a;
                tArr[i11 - i10] = tArr[i11];
            }
        }
        int i12 = iR - i10;
        ArraysKt.fill(this.f35552a, (Object) null, i12, iR);
        z0(i12);
    }

    public final boolean t(@NotNull d<T> dVar) {
        IntRange intRangeW1 = r.W1(0, dVar.R());
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL > iM) {
            return true;
        }
        while (s(dVar.f35552a[iL])) {
            if (iL == iM) {
                return true;
            }
            iL++;
        }
        return false;
    }

    public final void t0(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f35554c;
            if (i11 < i12) {
                T[] tArr = this.f35552a;
                System.arraycopy(tArr, i11, tArr, i10, i12 - i11);
            }
            int i13 = this.f35554c - (i11 - i10);
            int iR = R() - 1;
            if (i13 <= iR) {
                int i14 = i13;
                while (true) {
                    this.f35552a[i14] = null;
                    if (i14 == iR) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f35554c = i13;
        }
    }

    public final boolean u(@NotNull Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!s(it.next())) {
                int i10 = 6 << 0;
                return false;
            }
        }
        return true;
    }

    @a1
    public final void u0(int i10) {
        T[] tArr = this.f35552a;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i10, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.f35552a = tArr2;
    }

    public final boolean v(@NotNull List<? extends T> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!s(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean v0(@NotNull Collection<? extends T> collection) {
        int i10 = this.f35554c;
        for (int iR = R() - 1; -1 < iR; iR--) {
            if (!collection.contains(this.f35552a[iR])) {
                r0(iR);
            }
        }
        return i10 != this.f35554c;
    }

    public final boolean w(@NotNull d<T> dVar) {
        if (dVar.f35554c != this.f35554c) {
            return false;
        }
        int iR = R() - 1;
        if (iR >= 0) {
            for (int i10 = 0; Intrinsics.areEqual(dVar.f35552a[i10], this.f35552a[i10]); i10++) {
                if (i10 != iR) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean w0(@NotNull Function1<? super T, Boolean> function1) {
        T[] tArr = this.f35552a;
        for (int iR = R() - 1; iR >= 0; iR--) {
            if (function1.invoke(tArr[iR]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void x(int i10) {
        if (this.f35552a.length < i10) {
            u0(i10);
        }
    }

    public final T x0(int i10, T t10) {
        T[] tArr = this.f35552a;
        T t11 = tArr[i10];
        tArr[i10] = t10;
        return t11;
    }

    public final T z() {
        if (R() != 0) {
            return this.f35552a[0];
        }
        D0("MutableVector is empty.");
        throw new a0();
    }

    @a1
    public final void z0(int i10) {
        this.f35554c = i10;
    }
}
