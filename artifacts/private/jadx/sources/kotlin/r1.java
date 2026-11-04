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
@SourceDebugExtension({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1734#2,3:88\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n63#1:88,3\n*E\n"})
public final class r1 implements Collection<q1>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f312884a;

    private static final class a implements Iterator<q1>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final byte[] f312885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f312886b;

        public a(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f312885a = array;
        }

        public byte b() {
            int i10 = this.f312886b;
            byte[] bArr = this.f312885a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f312886b));
            }
            this.f312886b = i10 + 1;
            return q1.n(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f312886b < this.f312885a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ q1 next() {
            return q1.c(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    private /* synthetic */ r1(byte[] bArr) {
        this.f312884a = bArr;
    }

    public static int A(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean B(byte[] bArr) {
        return bArr.length == 0;
    }

    @NotNull
    public static Iterator<q1> C(byte[] bArr) {
        return new a(bArr);
    }

    public static final void D(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String F(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ r1 d(byte[] bArr) {
        return new r1(bArr);
    }

    @NotNull
    public static byte[] i(int i10) {
        return k(new byte[i10]);
    }

    @a1
    @NotNull
    public static byte[] k(@NotNull byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean m(byte[] bArr, byte b10) {
        return ArraysKt.contains(bArr, b10);
    }

    public static boolean n(byte[] bArr, @NotNull Collection<q1> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<q1> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof q1) || !ArraysKt.contains(bArr, ((q1) obj).x0())) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(byte[] bArr, Object obj) {
        return (obj instanceof r1) && Intrinsics.areEqual(bArr, ((r1) obj).G());
    }

    public static final boolean s(byte[] bArr, byte[] bArr2) {
        return Intrinsics.areEqual(bArr, bArr2);
    }

    public static final byte t(byte[] bArr, int i10) {
        return q1.n(bArr[i10]);
    }

    public static int v(byte[] bArr) {
        return bArr.length;
    }

    @a1
    public static /* synthetic */ void w() {
    }

    public final /* synthetic */ byte[] G() {
        return this.f312884a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(q1 q1Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends q1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(byte b10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof q1) {
            return l(((q1) obj).x0());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return n(this.f312884a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return p(this.f312884a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return A(this.f312884a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return B(this.f312884a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<q1> iterator() {
        return C(this.f312884a);
    }

    public boolean l(byte b10) {
        return m(this.f312884a, b10);
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
        return F(this.f312884a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int size() {
        return v(this.f312884a);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.v.b(this, array);
    }
}
