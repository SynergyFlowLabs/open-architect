package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qj.e;
import qj.f;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, e {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final ListBuilder Empty;

    @NotNull
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, e {

        @NotNull
        private E[] backing;
        private int length;
        private final int offset;

        @Nullable
        private final BuilderSubList<E> parent;

        @NotNull
        private final ListBuilder<E> root;

        @SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
        private static final class Itr<E> implements ListIterator<E>, f {
            private int expectedModCount;
            private int index;
            private int lastIndex;

            @NotNull
            private final BuilderSubList<E> list;

            public Itr(@NotNull BuilderSubList<E> list, int i10) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.list = list;
                this.index = i10;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            private final void checkForComodification() {
                if (((AbstractList) ((BuilderSubList) this.list).root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e10) {
                checkForComodification();
                BuilderSubList<E> builderSubList = this.list;
                int i10 = this.index;
                this.index = i10 + 1;
                builderSubList.add(i10, e10);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < ((BuilderSubList) this.list).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                checkForComodification();
                if (this.index >= ((BuilderSubList) this.list).length) {
                    throw new NoSuchElementException();
                }
                int i10 = this.index;
                this.index = i10 + 1;
                this.lastIndex = i10;
                return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public E previous() {
                checkForComodification();
                int i10 = this.index;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.index = i11;
                this.lastIndex = i11;
                return (E) ((BuilderSubList) this.list).backing[((BuilderSubList) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                checkForComodification();
                int i10 = this.lastIndex;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.remove(i10);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E e10) {
                checkForComodification();
                int i10 = this.lastIndex;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i10, e10);
            }
        }

        public BuilderSubList(@NotNull E[] backing, int i10, int i11, @Nullable BuilderSubList<E> builderSubList, @NotNull ListBuilder<E> root) {
            Intrinsics.checkNotNullParameter(backing, "backing");
            Intrinsics.checkNotNullParameter(root, "root");
            this.backing = backing;
            this.offset = i10;
            this.length = i11;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void addAllInternal(int i10, Collection<? extends E> collection, int i11) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAllInternal(i10, collection, i11);
            } else {
                this.root.addAllInternal(i10, collection, i11);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i11;
        }

        private final void addAtInternal(int i10, E e10) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.addAtInternal(i10, e10);
            } else {
                this.root.addAtInternal(i10, e10);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void checkIsMutable() {
            if (isReadOnly()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean contentEquals(List<?> list) {
            return ListBuilderKt.subarrayContentEquals(this.backing, this.offset, this.length, list);
        }

        private final boolean isReadOnly() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final void registerModification() {
            ((AbstractList) this).modCount++;
        }

        private final E removeAtInternal(int i10) {
            registerModification();
            BuilderSubList<E> builderSubList = this.parent;
            E eRemoveAtInternal = builderSubList != null ? builderSubList.removeAtInternal(i10) : (E) this.root.removeAtInternal(i10);
            this.length--;
            return eRemoveAtInternal;
        }

        private final void removeRangeInternal(int i10, int i11) {
            if (i11 > 0) {
                registerModification();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.removeRangeInternal(i10, i11);
            } else {
                this.root.removeRangeInternal(i10, i11);
            }
            this.length -= i11;
        }

        private final int retainOrRemoveAllInternal(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            BuilderSubList<E> builderSubList = this.parent;
            int iRetainOrRemoveAllInternal = builderSubList != null ? builderSubList.retainOrRemoveAllInternal(i10, i11, collection, z10) : this.root.retainOrRemoveAllInternal(i10, i11, collection, z10);
            if (iRetainOrRemoveAllInternal > 0) {
                registerModification();
            }
            this.length -= iRetainOrRemoveAllInternal;
            return iRetainOrRemoveAllInternal;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (isReadOnly()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e10) {
            checkIsMutable();
            checkForComodification();
            addAtInternal(this.offset + this.length, e10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            int size = elements.size();
            addAllInternal(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkIsMutable();
            checkForComodification();
            removeRangeInternal(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object obj) {
            checkForComodification();
            return obj == this || ((obj instanceof List) && contentEquals((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, this.length);
            return this.backing[this.offset + i10];
        }

        @Override // kotlin.collections.AbstractMutableList
        public int getSize() {
            checkForComodification();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            checkForComodification();
            return ListBuilderKt.subarrayContentHashCode(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            checkForComodification();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (Intrinsics.areEqual(this.backing[this.offset + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            checkForComodification();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            checkForComodification();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (Intrinsics.areEqual(this.backing[this.offset + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            checkIsMutable();
            checkForComodification();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
        }

        @Override // kotlin.collections.AbstractMutableList
        public E removeAt(int i10) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, this.length);
            return removeAtInternal(this.offset + i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public E set(int i10, E e10) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, this.length);
            E[] eArr = this.backing;
            int i11 = this.offset;
            E e11 = eArr[i11 + i10];
            eArr[i11 + i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int i10, int i11) {
            kotlin.collections.AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, this.length);
            return new BuilderSubList(this.backing, this.offset + i10, i11 - i10, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            checkForComodification();
            int length = array.length;
            int i10 = this.length;
            if (length >= i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                ArraysKt.copyInto(eArr, array, 0, i11, i10 + i11);
                return (T[]) CollectionsKt.terminateCollectionToArray(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i12 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i12, i10 + i12, array.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public String toString() {
            checkForComodification();
            return ListBuilderKt.subarrayContentToString(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int i10) {
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, this.length);
            return new Itr(this, i10);
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public void add(int i10, E e10) {
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, this.length);
            addAtInternal(this.offset + i10, e10);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            checkIsMutable();
            checkForComodification();
            kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, this.length);
            int size = elements.size();
            addAllInternal(this.offset + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            checkForComodification();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return ArraysKt.copyOfRange(eArr, i10, this.length + i10);
        }
    }

    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
    private static final class Itr<E> implements ListIterator<E>, f {
        private int expectedModCount;
        private int index;
        private int lastIndex;

        @NotNull
        private final ListBuilder<E> list;

        public Itr(@NotNull ListBuilder<E> list, int i10) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i10;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        private final void checkForComodification() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            checkForComodification();
            ListBuilder<E> listBuilder = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            listBuilder.add(i10, e10);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            checkForComodification();
            if (this.index >= ((ListBuilder) this.list).length) {
                throw new NoSuchElementException();
            }
            int i10 = this.index;
            this.index = i10 + 1;
            this.lastIndex = i10;
            return (E) ((ListBuilder) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            checkForComodification();
            int i10 = this.index;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.index = i11;
            this.lastIndex = i11;
            return (E) ((ListBuilder) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkForComodification();
            int i10 = this.lastIndex;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.remove(i10);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            checkForComodification();
            int i10 = this.lastIndex;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i10, e10);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        int i10 = (5 & 0) | 1;
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAllInternal(int i10, Collection<? extends E> collection, int i11) {
        registerModification();
        insertAtInternal(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.backing[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAtInternal(int i10, E e10) {
        registerModification();
        insertAtInternal(i10, 1);
        this.backing[i10] = e10;
    }

    private final void checkIsMutable() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        return ListBuilderKt.subarrayContentEquals(this.backing, 0, this.length, list);
    }

    private final void ensureCapacityInternal(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i10 > eArr.length) {
            this.backing = (E[]) ListBuilderKt.copyOfUninitializedElements(this.backing, kotlin.collections.AbstractList.Companion.newCapacity$kotlin_stdlib(eArr.length, i10));
        }
    }

    private final void ensureExtraCapacity(int i10) {
        ensureCapacityInternal(this.length + i10);
    }

    private final void insertAtInternal(int i10, int i11) {
        ensureExtraCapacity(i11);
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, i10 + i11, i10, this.length);
        this.length += i11;
    }

    private final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E removeAtInternal(int i10) {
        registerModification();
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        ArraysKt.copyInto(eArr, eArr, i10, i10 + 1, this.length);
        ListBuilderKt.resetAt(this.backing, this.length - 1);
        this.length--;
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRangeInternal(int i10, int i11) {
        if (i11 > 0) {
            registerModification();
        }
        E[] eArr = this.backing;
        ArraysKt.copyInto(eArr, eArr, i10, i10 + i11, this.length);
        E[] eArr2 = this.backing;
        int i12 = this.length;
        ListBuilderKt.resetRange(eArr2, i12 - i11, i12);
        this.length -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int retainOrRemoveAllInternal(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.backing[i14]) == z10) {
                E[] eArr = this.backing;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.backing;
        ArraysKt.copyInto(eArr2, eArr2, i10 + i13, i11 + i10, this.length);
        E[] eArr3 = this.backing;
        int i16 = this.length;
        ListBuilderKt.resetRange(eArr3, i16 - i15, i16);
        if (i15 > 0) {
            registerModification();
        }
        this.length -= i15;
        return i15;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        checkIsMutable();
        addAtInternal(this.length, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.length, elements, size);
        return size > 0;
    }

    @NotNull
    public final List<E> build() {
        checkIsMutable();
        this.isReadOnly = true;
        return this.length > 0 ? this : Empty;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj != this && (!(obj instanceof List) || !contentEquals((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, this.length);
        return this.backing[i10];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return ListBuilderKt.subarrayContentHashCode(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (Intrinsics.areEqual(this.backing[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int i10 = this.length;
        do {
            i10--;
            if (i10 < 0) {
                return -1;
            }
        } while (!Intrinsics.areEqual(this.backing[i10], obj));
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i10) {
        checkIsMutable();
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, this.length);
        return removeAtInternal(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(0, this.length, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        checkIsMutable();
        kotlin.collections.AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, this.length);
        E[] eArr = this.backing;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i10, int i11) {
        kotlin.collections.AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, this.length);
        return new BuilderSubList(this.backing, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.length;
        if (length >= i10) {
            ArraysKt.copyInto(this.backing, array, 0, 0, i10);
            return (T[]) CollectionsKt.terminateCollectionToArray(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i10, array.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return ListBuilderKt.subarrayContentToString(this.backing, 0, this.length, this);
    }

    public ListBuilder(int i10) {
        this.backing = (E[]) ListBuilderKt.arrayOfUninitializedElements(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, this.length);
        return new Itr(this, i10);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        checkIsMutable();
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, this.length);
        addAtInternal(i10, e10);
    }

    public /* synthetic */ ListBuilder(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        kotlin.collections.AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i10, this.length);
        int size = elements.size();
        addAllInternal(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return ArraysKt.copyOfRange(this.backing, 0, this.length);
    }
}
