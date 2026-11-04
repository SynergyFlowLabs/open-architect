package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    @NotNull
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(@NotNull Object[] buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (i10 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.capacity = buffer.length;
            this.size = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    private final int forward(int i10, int i11) {
        return (i10 + i11) % this.capacity;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T t10) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(this.startIndex + size()) % this.capacity] = t10;
        this.size = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final RingBuffer<T> expanded(int i10) {
        Object[] array;
        int i11 = this.capacity;
        int iB = r.B(i11 + (i11 >> 1) + 1, i10);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, iB);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iB]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i10) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i10, size());
        return (T) this.buffer[(this.startIndex + i10) % this.capacity];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer.iterator.1
            private int count;
            private int index;
            final /* synthetic */ RingBuffer<T> this$0;

            {
                this.this$0 = this;
                this.count = this.size();
                this.index = ((RingBuffer) this).startIndex;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            protected void computeNext() {
                if (this.count == 0) {
                    done();
                    return;
                }
                setNext(((RingBuffer) this.this$0).buffer[this.index]);
                this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                this.count--;
            }
        };
    }

    public final void removeFirst(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (i10 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.startIndex;
            int i12 = (i11 + i10) % this.capacity;
            if (i11 > i12) {
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i11, this.capacity);
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, 0, i12);
            } else {
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i11, i12);
            }
            this.startIndex = i12;
            this.size = size() - i10;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.startIndex; i11 < size && i12 < this.capacity; i12++) {
            objArr[i11] = this.buffer[i12];
            i11++;
        }
        while (i11 < size) {
            objArr[i11] = this.buffer[i10];
            i11++;
            i10++;
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(size, objArr);
    }

    public RingBuffer(int i10) {
        this(new Object[i10], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
