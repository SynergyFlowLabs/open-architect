package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class j<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f305638f = -8423413834657610406L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private transient E[] f305639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f305640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f305641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient boolean f305642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f305643e;

    class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f305644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f305645b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f305646c;

        a() {
            this.f305644a = j.this.f305640b;
            this.f305646c = j.this.f305642d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f305646c || this.f305644a != j.this.f305641c;
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f305646c = false;
            int i10 = this.f305644a;
            this.f305645b = i10;
            this.f305644a = j.this.t(i10);
            return (E) j.this.f305639a[this.f305645b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f305645b;
            if (i10 == -1) {
                throw new IllegalStateException();
            }
            if (i10 == j.this.f305640b) {
                j.this.remove();
                this.f305645b = -1;
                return;
            }
            int iT = this.f305645b + 1;
            if (j.this.f305640b >= this.f305645b || iT >= j.this.f305641c) {
                while (iT != j.this.f305641c) {
                    if (iT >= j.this.f305643e) {
                        j.this.f305639a[iT - 1] = j.this.f305639a[0];
                        iT = 0;
                    } else {
                        j.this.f305639a[j.this.s(iT)] = j.this.f305639a[iT];
                        iT = j.this.t(iT);
                    }
                }
            } else {
                System.arraycopy(j.this.f305639a, iT, j.this.f305639a, this.f305645b, j.this.f305641c - iT);
            }
            this.f305645b = -1;
            j jVar = j.this;
            jVar.f305641c = jVar.s(jVar.f305641c);
            j.this.f305639a[j.this.f305641c] = null;
            j.this.f305642d = false;
            this.f305644a = j.this.s(this.f305644a);
        }
    }

    public j() {
        this(32);
    }

    private void readObject(@NotNull ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f305639a = (E[]) new Object[this.f305643e];
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            ((E[]) this.f305639a)[i11] = objectInputStream.readObject();
        }
        this.f305640b = 0;
        boolean z10 = i10 == this.f305643e;
        this.f305642d = z10;
        if (z10) {
            this.f305641c = 0;
        } else {
            this.f305641c = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s(int i10) {
        int i11 = i10 - 1;
        return i11 < 0 ? this.f305643e - 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f305643e) {
            return 0;
        }
        return i11;
    }

    private void writeObject(@NotNull ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(@NotNull E e10) {
        if (e10 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (u()) {
            remove();
        }
        E[] eArr = this.f305639a;
        int i10 = this.f305641c;
        int i11 = i10 + 1;
        this.f305641c = i11;
        eArr[i10] = e10;
        if (i11 >= this.f305643e) {
            this.f305641c = 0;
        }
        if (this.f305641c == this.f305640b) {
            this.f305642d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f305642d = false;
        this.f305640b = 0;
        this.f305641c = 0;
        Arrays.fill(this.f305639a, (Object) null);
    }

    @Override // java.util.Queue
    @Nullable
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @NotNull
    public E get(int i10) {
        int size = size();
        if (i10 < 0 || i10 >= size) {
            throw new NoSuchElementException(String.format("The specified index (%1$d) is outside the available range [0, %2$d)", Integer.valueOf(i10), Integer.valueOf(size)));
        }
        return this.f305639a[(this.f305640b + i10) % this.f305643e];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new a();
    }

    public int o0() {
        return this.f305643e;
    }

    @Override // java.util.Queue
    public boolean offer(@NotNull E e10) {
        return add(e10);
    }

    @Override // java.util.Queue
    @Nullable
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f305639a[this.f305640b];
    }

    @Override // java.util.Queue
    @Nullable
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    @NotNull
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f305639a;
        int i10 = this.f305640b;
        E e10 = eArr[i10];
        if (e10 != null) {
            int i11 = i10 + 1;
            this.f305640b = i11;
            eArr[i10] = null;
            if (i11 >= this.f305643e) {
                this.f305640b = 0;
            }
            this.f305642d = false;
        }
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i10 = this.f305641c;
        int i11 = this.f305640b;
        if (i10 < i11) {
            return (this.f305643e - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.f305642d) {
            return this.f305643e;
        }
        return 0;
    }

    public boolean u() {
        return size() == this.f305643e;
    }

    j(int i10) {
        this.f305640b = 0;
        this.f305641c = 0;
        this.f305642d = false;
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i10];
        this.f305639a = eArr;
        this.f305643e = eArr.length;
    }

    public j(@NotNull Collection<? extends E> collection) {
        this(collection.size());
        addAll(collection);
    }
}
