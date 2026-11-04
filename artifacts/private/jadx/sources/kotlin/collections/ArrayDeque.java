package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.4")
@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,660:1\n476#1,53:663\n476#1,53:716\n37#2,2:661\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n471#1:663,53\n473#1:716,53\n46#1:661,2\n*E\n"})
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;

    @NotNull
    private Object[] elementData;
    private int head;
    private int size;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Object[] emptyElementData = new Object[0];

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ArrayDeque(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = emptyElementData;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.elementData = objArr;
    }

    private final void copyCollectionElements(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.elementData.length;
        while (i10 < length && it.hasNext()) {
            this.elementData[i10] = it.next();
            i10++;
        }
        int i11 = this.head;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.elementData[i12] = it.next();
        }
        this.size = size() + collection.size();
    }

    private final void copyElements(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.elementData;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i11 = this.head;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, length - i11, 0, i11);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int i10) {
        return i10 == 0 ? ArraysKt___ArraysKt.getLastIndex(this.elementData) : i10 - 1;
    }

    private final void ensureCapacity(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[r.u(i10, 10)];
        } else {
            copyElements(AbstractList.Companion.newCapacity$kotlin_stdlib(objArr.length, i10));
        }
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> function1) {
        int iPositiveMod;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i10 = this.head;
            if (i10 < iPositiveMod2) {
                iPositiveMod = i10;
                while (i10 < iPositiveMod2) {
                    Object obj = this.elementData[i10];
                    if (function1.invoke(obj).booleanValue()) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (function1.invoke(obj2).booleanValue()) {
                        this.elementData[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iPositiveMod = positiveMod(i11);
                for (int i12 = 0; i12 < iPositiveMod2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (function1.invoke(obj3).booleanValue()) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z10;
    }

    private final int incremented(int i10) {
        if (i10 == ArraysKt___ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i10 + 1;
    }

    @f
    private final E internalGet(int i10) {
        return (E) this.elementData[i10];
    }

    @f
    private final int internalIndex(int i10) {
        return positiveMod(this.head + i10);
    }

    private final int negativeMod(int i10) {
        if (i10 < 0) {
            i10 += this.elementData.length;
        }
        return i10;
    }

    private final void nullifyNonEmpty(int i10, int i11) {
        if (i10 < i11) {
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, i10, i11);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i10, objArr.length);
        ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, 0, i11);
    }

    private final int positiveMod(int i10) {
        Object[] objArr = this.elementData;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void registerModification() {
        ((java.util.AbstractList) this).modCount++;
    }

    private final void removeRangeShiftPreceding(int i10, int i11) {
        int iPositiveMod = positiveMod(this.head + (i10 - 1));
        int iPositiveMod2 = positiveMod(this.head + (i11 - 1));
        while (i10 > 0) {
            int i12 = iPositiveMod + 1;
            int iMin = Math.min(i10, Math.min(i12, iPositiveMod2 + 1));
            Object[] objArr = this.elementData;
            int i13 = iPositiveMod2 - iMin;
            int i14 = iPositiveMod - iMin;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i13 + 1, i14 + 1, i12);
            iPositiveMod = negativeMod(i14);
            iPositiveMod2 = negativeMod(i13);
            i10 -= iMin;
        }
    }

    private final void removeRangeShiftSucceeding(int i10, int i11) {
        int iPositiveMod = positiveMod(this.head + i11);
        int iPositiveMod2 = positiveMod(this.head + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            i11 = Math.min(size, Math.min(objArr.length - iPositiveMod, objArr.length - iPositiveMod2));
            Object[] objArr2 = this.elementData;
            int i12 = iPositiveMod + i11;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, iPositiveMod2, iPositiveMod, i12);
            iPositiveMod = positiveMod(i12);
            iPositiveMod2 = positiveMod(iPositiveMod2 + i11);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E e10) {
        registerModification();
        ensureCapacity(size() + 1);
        int iDecremented = decremented(this.head);
        this.head = iDecremented;
        this.elementData[iDecremented] = e10;
        this.size = size() + 1;
    }

    public final void addLast(E e10) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = e10;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            nullifyNonEmpty(this.head, positiveMod(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        return (E) this.elementData[positiveMod(this.head + i10)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iPositiveMod = positiveMod(this.head + size());
        int length = this.head;
        if (length < iPositiveMod) {
            while (length < iPositiveMod) {
                if (Intrinsics.areEqual(obj, this.elementData[length])) {
                    i10 = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iPositiveMod) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (length < length2) {
            if (Intrinsics.areEqual(obj, this.elementData[length])) {
                i10 = this.head;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iPositiveMod; i11++) {
            if (Intrinsics.areEqual(obj, this.elementData[i11])) {
                length = i11 + this.elementData.length;
                i10 = this.head;
            }
        }
        return -1;
        return length - i10;
    }

    public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> structure) {
        int i10;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i10 = this.head) < positiveMod(this.head + size())) ? this.head : i10 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int i10;
        int iPositiveMod = positiveMod(this.head + size());
        int i11 = this.head;
        if (i11 < iPositiveMod) {
            lastIndex = iPositiveMod - 1;
            if (i11 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i11) {
                        lastIndex--;
                    }
                }
                i10 = this.head;
                return lastIndex - i10;
            }
            return -1;
        }
        if (i11 > iPositiveMod) {
            for (int i12 = iPositiveMod - 1; -1 < i12; i12--) {
                if (Intrinsics.areEqual(obj, this.elementData[i12])) {
                    lastIndex = i12 + this.elementData.length;
                    i10 = this.head;
                    return lastIndex - i10;
                }
            }
            lastIndex = ArraysKt___ArraysKt.getLastIndex(this.elementData);
            int i13 = this.head;
            if (i13 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i13) {
                        lastIndex--;
                    }
                }
                i10 = this.head;
                return lastIndex - i10;
            }
        }
        return -1;
    }

    @Nullable
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i10 = this.head;
            if (i10 < iPositiveMod2) {
                iPositiveMod = i10;
                while (i10 < iPositiveMod2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.elementData[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iPositiveMod = positiveMod(i11);
                for (int i12 = 0; i12 < iPositiveMod2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        if (i10 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + i10);
        E e10 = (E) this.elementData[iPositiveMod];
        if (i10 < (size() >> 1)) {
            int i11 = this.head;
            if (iPositiveMod >= i11) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i11 + 1, i11, iPositiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, 1, 0, iPositiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.head;
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i13 = this.head;
            objArr4[i13] = null;
            this.head = incremented(i13);
        } else {
            int iPositiveMod2 = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
            if (iPositiveMod <= iPositiveMod2) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, iPositiveMod, iPositiveMod + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, 1, iPositiveMod2 + 1);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size = size() - 1;
        return e10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        Object[] objArr = this.elementData;
        int i10 = this.head;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.head = incremented(i10);
        this.size = size() - 1;
        return e10;
    }

    @Nullable
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = null;
        this.size = size() - 1;
        return e10;
    }

    @Nullable
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        registerModification();
        if (i10 < size() - i11) {
            removeRangeShiftPreceding(i10, i11);
            int iPositiveMod = positiveMod(this.head + i12);
            nullifyNonEmpty(this.head, iPositiveMod);
            this.head = iPositiveMod;
        } else {
            removeRangeShiftSucceeding(i10, i11);
            int iPositiveMod2 = positiveMod(this.head + size());
            nullifyNonEmpty(negativeMod(iPositiveMod2 - i12), iPositiveMod2);
        }
        this.size = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        int iPositiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iPositiveMod2 = positiveMod(this.head + size());
            int i10 = this.head;
            if (i10 < iPositiveMod2) {
                iPositiveMod = i10;
                while (i10 < iPositiveMod2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        this.elementData[iPositiveMod] = obj;
                        iPositiveMod++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, iPositiveMod, iPositiveMod2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iPositiveMod = positiveMod(i11);
                for (int i12 = 0; i12 < iPositiveMod2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iPositiveMod] = obj3;
                        iPositiveMod = incremented(iPositiveMod);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                registerModification();
                this.size = negativeMod(iPositiveMod - this.head);
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        int iPositiveMod = positiveMod(this.head + i10);
        Object[] objArr = this.elementData;
        E e11 = (E) objArr[iPositiveMod];
        objArr[iPositiveMod] = e10;
        return e11;
    }

    public final void testRemoveRange$kotlin_stdlib(int i10, int i11) {
        removeRange(i10, i11);
    }

    @NotNull
    public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(array, size());
        }
        T[] tArr = array;
        int iPositiveMod = positiveMod(this.head + size());
        int i10 = this.head;
        if (i10 < iPositiveMod) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.elementData, tArr, 0, i10, iPositiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, tArr, objArr2.length - this.head, 0, iPositiveMod);
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size(), tArr);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, size());
        if (i10 == size()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        registerModification();
        ensureCapacity(size() + 1);
        int iPositiveMod = positiveMod(this.head + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iDecremented = decremented(iPositiveMod);
            int iDecremented2 = decremented(this.head);
            int i11 = this.head;
            if (iDecremented >= i11) {
                Object[] objArr = this.elementData;
                objArr[iDecremented2] = objArr[i11];
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i11, i11 + 1, iDecremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, 1, iDecremented + 1);
            }
            this.elementData[iDecremented] = e10;
            this.head = iDecremented2;
        } else {
            int iPositiveMod2 = positiveMod(this.head + size());
            if (iPositiveMod < iPositiveMod2) {
                Object[] objArr4 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, iPositiveMod + 1, iPositiveMod, iPositiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, 1, 0, iPositiveMod2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, iPositiveMod + 1, iPositiveMod, objArr6.length - 1);
            }
            this.elementData[iPositiveMod] = e10;
        }
        this.size = size() + 1;
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        int iPositiveMod = positiveMod(this.head + size());
        int iPositiveMod2 = positiveMod(this.head + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.head;
            int length = i11 - size;
            if (iPositiveMod2 < i11) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, length, i11, objArr.length);
                if (size >= iPositiveMod2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, iPositiveMod2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, 0, size, iPositiveMod2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, length, i11, iPositiveMod2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i12 = iPositiveMod2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, length, i11, iPositiveMod2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, this.head + length2, iPositiveMod2);
                }
            }
            this.head = length;
            copyCollectionElements(negativeMod(iPositiveMod2 - size), elements);
        } else {
            int i13 = iPositiveMod2 + size;
            if (iPositiveMod2 < iPositiveMod) {
                int i14 = size + iPositiveMod;
                Object[] objArr8 = this.elementData;
                if (i14 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i13, iPositiveMod2, iPositiveMod);
                } else if (i13 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i13 - objArr8.length, iPositiveMod2, iPositiveMod);
                } else {
                    int length3 = iPositiveMod - (i14 - objArr8.length);
                    ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, 0, length3, iPositiveMod);
                    Object[] objArr9 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr9, objArr9, i13, iPositiveMod2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, size, 0, iPositiveMod);
                Object[] objArr11 = this.elementData;
                if (i13 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, i13 - objArr11.length, iPositiveMod2, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr12, objArr12, i13, iPositiveMod2, objArr12.length - size);
                }
            }
            copyCollectionElements(iPositiveMod2, elements);
        }
        return true;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
