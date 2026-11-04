package org.apache.commons.collections4.queue;

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

/* JADX INFO: loaded from: classes14.dex */
public class b<E> extends AbstractCollection<E> implements Queue<E>, org.apache.commons.collections4.f<E>, Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f336237f = -8423413834657610406L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient E[] f336238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f336239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f336240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient boolean f336241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f336242e;

    class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f336243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f336244b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f336245c;

        a() {
            this.f336243a = b.this.f336239b;
            this.f336245c = b.this.f336241d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f336245c || this.f336243a != b.this.f336240c;
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f336245c = false;
            int i10 = this.f336243a;
            this.f336244b = i10;
            this.f336243a = b.this.t(i10);
            return (E) b.this.f336238a[this.f336244b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f336244b;
            if (i10 == -1) {
                throw new IllegalStateException();
            }
            if (i10 == b.this.f336239b) {
                b.this.remove();
                this.f336244b = -1;
                return;
            }
            int iT = this.f336244b + 1;
            if (b.this.f336239b >= this.f336244b || iT >= b.this.f336240c) {
                while (iT != b.this.f336240c) {
                    if (iT >= b.this.f336242e) {
                        b.this.f336238a[iT - 1] = b.this.f336238a[0];
                        iT = 0;
                    } else {
                        b.this.f336238a[b.this.s(iT)] = b.this.f336238a[iT];
                        iT = b.this.t(iT);
                    }
                }
            } else {
                System.arraycopy(b.this.f336238a, iT, b.this.f336238a, this.f336244b, b.this.f336240c - iT);
            }
            this.f336244b = -1;
            b bVar = b.this;
            bVar.f336240c = bVar.s(bVar.f336240c);
            b.this.f336238a[b.this.f336240c] = null;
            b.this.f336241d = false;
            this.f336243a = b.this.s(this.f336243a);
        }
    }

    public b() {
        this(32);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f336238a = (E[]) new Object[this.f336242e];
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            ((E[]) this.f336238a)[i11] = objectInputStream.readObject();
        }
        this.f336239b = 0;
        boolean z10 = i10 == this.f336242e;
        this.f336241d = z10;
        if (z10) {
            this.f336240c = 0;
        } else {
            this.f336240c = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s(int i10) {
        int i11 = i10 - 1;
        return i11 < 0 ? this.f336242e - 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f336242e) {
            return 0;
        }
        return i11;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (u()) {
            remove();
        }
        E[] eArr = this.f336238a;
        int i10 = this.f336240c;
        int i11 = i10 + 1;
        this.f336240c = i11;
        eArr[i10] = e10;
        if (i11 >= this.f336242e) {
            this.f336240c = 0;
        }
        if (this.f336240c == this.f336239b) {
            this.f336241d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f336241d = false;
        this.f336239b = 0;
        this.f336240c = 0;
        Arrays.fill(this.f336238a, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    public E get(int i10) {
        int size = size();
        if (i10 < 0 || i10 >= size) {
            throw new NoSuchElementException(String.format("The specified index (%1$d) is outside the available range [0, %2$d)", Integer.valueOf(i10), Integer.valueOf(size)));
        }
        return this.f336238a[(this.f336239b + i10) % this.f336242e];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // org.apache.commons.collections4.f
    public boolean isFull() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // org.apache.commons.collections4.f
    public int o0() {
        return this.f336242e;
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        return add(e10);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f336238a[this.f336239b];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        E[] eArr = this.f336238a;
        int i10 = this.f336239b;
        E e10 = eArr[i10];
        if (e10 != null) {
            int i11 = i10 + 1;
            this.f336239b = i11;
            eArr[i10] = null;
            if (i11 >= this.f336242e) {
                this.f336239b = 0;
            }
            this.f336241d = false;
        }
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i10 = this.f336240c;
        int i11 = this.f336239b;
        if (i10 < i11) {
            return (this.f336242e - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.f336241d) {
            return this.f336242e;
        }
        return 0;
    }

    public boolean u() {
        return size() == this.f336242e;
    }

    public b(int i10) {
        this.f336239b = 0;
        this.f336240c = 0;
        this.f336241d = false;
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i10];
        this.f336238a = eArr;
        this.f336242e = eArr.length;
    }

    public b(Collection<? extends E> collection) {
        this(collection.size());
        addAll(collection);
    }
}
