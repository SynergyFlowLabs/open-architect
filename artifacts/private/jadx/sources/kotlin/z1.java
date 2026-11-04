package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@oj.g
@e1(version = "1.3")
@u
@SourceDebugExtension({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1734#2,3:88\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n63#1:88,3\n*E\n"})
public final class z1 implements Collection<y1>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final long[] f313463a;

    private static final class a implements Iterator<y1>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final long[] f313464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313465b;

        public a(@NotNull long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f313464a = array;
        }

        public long b() {
            int i10 = this.f313465b;
            long[] jArr = this.f313464a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f313465b));
            }
            this.f313465b = i10 + 1;
            return y1.n(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f313465b < this.f313464a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ y1 next() {
            return y1.c(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    private /* synthetic */ z1(long[] jArr) {
        this.f313463a = jArr;
    }

    public static int A(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean B(long[] jArr) {
        return jArr.length == 0;
    }

    @NotNull
    public static Iterator<y1> C(long[] jArr) {
        return new a(jArr);
    }

    public static final void D(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String F(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ z1 d(long[] jArr) {
        return new z1(jArr);
    }

    @NotNull
    public static long[] i(int i10) {
        return k(new long[i10]);
    }

    @a1
    @NotNull
    public static long[] k(@NotNull long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean m(long[] jArr, long j10) {
        return ArraysKt.contains(jArr, j10);
    }

    public static boolean n(long[] jArr, @NotNull Collection<y1> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<y1> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof y1) || !ArraysKt.contains(jArr, ((y1) obj).z0())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr, Object obj) {
        return (obj instanceof z1) && Intrinsics.areEqual(jArr, ((z1) obj).G());
    }

    public static final boolean s(long[] jArr, long[] jArr2) {
        return Intrinsics.areEqual(jArr, jArr2);
    }

    public static final long t(long[] jArr, int i10) {
        return y1.n(jArr[i10]);
    }

    public static int v(long[] jArr) {
        return jArr.length;
    }

    @a1
    public static /* synthetic */ void w() {
    }

    public final /* synthetic */ long[] G() {
        return this.f313463a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(y1 y1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends y1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(long j10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y1) {
            return l(((y1) obj).z0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return n(this.f313463a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f313463a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return A(this.f313463a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return B(this.f313463a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<y1> iterator() {
        return C(this.f313463a);
    }

    public boolean l(long j10) {
        return m(this.f313463a, j10);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public String toString() {
        return F(this.f313463a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int size() {
        return v(this.f313463a);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
