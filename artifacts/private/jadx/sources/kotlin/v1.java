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
@SourceDebugExtension({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1734#2,3:88\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n63#1:88,3\n*E\n"})
public final class v1 implements Collection<u1>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f313453a;

    private static final class a implements Iterator<u1>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final int[] f313454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f313455b;

        public a(@NotNull int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f313454a = array;
        }

        public int b() {
            int i10 = this.f313455b;
            int[] iArr = this.f313454a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f313455b));
            }
            this.f313455b = i10 + 1;
            return u1.n(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f313455b < this.f313454a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ u1 next() {
            return u1.c(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    private /* synthetic */ v1(int[] iArr) {
        this.f313453a = iArr;
    }

    public static int A(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean B(int[] iArr) {
        return iArr.length == 0;
    }

    @NotNull
    public static Iterator<u1> C(int[] iArr) {
        return new a(iArr);
    }

    public static final void D(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String F(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ v1 d(int[] iArr) {
        return new v1(iArr);
    }

    @NotNull
    public static int[] i(int i10) {
        return k(new int[i10]);
    }

    @a1
    @NotNull
    public static int[] k(@NotNull int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean m(int[] iArr, int i10) {
        return ArraysKt.contains(iArr, i10);
    }

    public static boolean n(int[] iArr, @NotNull Collection<u1> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<u1> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof u1) || !ArraysKt.contains(iArr, ((u1) obj).z0())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(int[] iArr, Object obj) {
        return (obj instanceof v1) && Intrinsics.areEqual(iArr, ((v1) obj).G());
    }

    public static final boolean s(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    public static final int t(int[] iArr, int i10) {
        return u1.n(iArr[i10]);
    }

    public static int v(int[] iArr) {
        return iArr.length;
    }

    @a1
    public static /* synthetic */ void w() {
    }

    public final /* synthetic */ int[] G() {
        return this.f313453a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(u1 u1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends u1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof u1) {
            return l(((u1) obj).z0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return n(this.f313453a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f313453a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return A(this.f313453a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return B(this.f313453a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<u1> iterator() {
        return C(this.f313453a);
    }

    public boolean l(int i10) {
        return m(this.f313453a, i10);
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
        return F(this.f313453a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int size() {
        return v(this.f313453a);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
