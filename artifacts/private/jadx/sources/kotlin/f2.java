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
@SourceDebugExtension({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1734#2,3:88\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n63#1:88,3\n*E\n"})
public final class f2 implements Collection<e2>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final short[] f312500a;

    private static final class a implements Iterator<e2>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final short[] f312501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f312502b;

        public a(@NotNull short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f312501a = array;
        }

        public short b() {
            int i10 = this.f312502b;
            short[] sArr = this.f312501a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f312502b));
            }
            this.f312502b = i10 + 1;
            return e2.n(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f312502b < this.f312501a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ e2 next() {
            return e2.c(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    private /* synthetic */ f2(short[] sArr) {
        this.f312500a = sArr;
    }

    public static int A(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean B(short[] sArr) {
        return sArr.length == 0;
    }

    @NotNull
    public static Iterator<e2> C(short[] sArr) {
        return new a(sArr);
    }

    public static final void D(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String F(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ f2 d(short[] sArr) {
        return new f2(sArr);
    }

    @NotNull
    public static short[] i(int i10) {
        return k(new short[i10]);
    }

    @a1
    @NotNull
    public static short[] k(@NotNull short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean m(short[] sArr, short s10) {
        return ArraysKt.contains(sArr, s10);
    }

    public static boolean n(short[] sArr, @NotNull Collection<e2> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<e2> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof e2) || !ArraysKt.contains(sArr, ((e2) obj).x0())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(short[] sArr, Object obj) {
        return (obj instanceof f2) && Intrinsics.areEqual(sArr, ((f2) obj).G());
    }

    public static final boolean s(short[] sArr, short[] sArr2) {
        return Intrinsics.areEqual(sArr, sArr2);
    }

    public static final short t(short[] sArr, int i10) {
        return e2.n(sArr[i10]);
    }

    public static int v(short[] sArr) {
        return sArr.length;
    }

    @a1
    public static /* synthetic */ void w() {
    }

    public final /* synthetic */ short[] G() {
        return this.f312500a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(e2 e2Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends e2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(short s10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e2) {
            return l(((e2) obj).x0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return n(this.f312500a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f312500a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return A(this.f312500a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return B(this.f312500a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<e2> iterator() {
        return C(this.f312500a);
    }

    public boolean l(short s10) {
        return m(this.f312500a, s10);
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
        return F(this.f312500a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int size() {
        return v(this.f312500a);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
