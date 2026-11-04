package com.rabbitmq.client.impl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes13.dex */
public class l2<E> extends AbstractQueue<E> implements BlockingQueue<E>, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f265524i = -6903933977591709194L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f265525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f265526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient b<E> f265527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient b<E> f265528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReentrantLock f265529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Condition f265530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ReentrantLock f265531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Condition f265532h;

    private class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b<E> f265533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b<E> f265534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private E f265535c;

        a() {
            ReentrantLock reentrantLock = l2.this.f265531g;
            ReentrantLock reentrantLock2 = l2.this.f265529e;
            reentrantLock.lock();
            reentrantLock2.lock();
            try {
                b<E> bVar = l2.this.f265527c.f265538b;
                this.f265533a = bVar;
                if (bVar != null) {
                    this.f265535c = bVar.f265537a;
                }
            } finally {
                reentrantLock2.unlock();
                reentrantLock.unlock();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f265533a != null;
        }

        @Override // java.util.Iterator
        public E next() {
            ReentrantLock reentrantLock = l2.this.f265531g;
            ReentrantLock reentrantLock2 = l2.this.f265529e;
            reentrantLock.lock();
            reentrantLock2.lock();
            try {
                b<E> bVar = this.f265533a;
                if (bVar == null) {
                    throw new NoSuchElementException();
                }
                E e10 = this.f265535c;
                this.f265534b = bVar;
                b<E> bVar2 = bVar.f265538b;
                this.f265533a = bVar2;
                if (bVar2 != null) {
                    this.f265535c = bVar2.f265537a;
                }
                reentrantLock2.unlock();
                reentrantLock.unlock();
                return e10;
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                reentrantLock.unlock();
                throw th2;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            b<E> bVar;
            if (this.f265534b == null) {
                throw new IllegalStateException();
            }
            ReentrantLock reentrantLock = l2.this.f265531g;
            ReentrantLock reentrantLock2 = l2.this.f265529e;
            reentrantLock.lock();
            reentrantLock2.lock();
            try {
                b<E> bVar2 = this.f265534b;
                this.f265534b = null;
                b<E> bVar3 = l2.this.f265527c;
                b<E> bVar4 = l2.this.f265527c.f265538b;
                while (true) {
                    b<E> bVar5 = bVar4;
                    bVar = bVar3;
                    bVar3 = bVar5;
                    if (bVar3 == null || bVar3 == bVar2) {
                        break;
                    } else {
                        bVar4 = bVar3.f265538b;
                    }
                }
                if (bVar3 == bVar2) {
                    bVar3.f265537a = null;
                    bVar.f265538b = bVar3.f265538b;
                    if (l2.this.f265526b.getAndDecrement() >= l2.this.f265525a) {
                        l2.this.f265532h.signalAll();
                    }
                }
                reentrantLock2.unlock();
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    static class b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile E f265537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b<E> f265538b;

        b(E e10) {
            this.f265537a = e10;
        }
    }

    public l2() {
        this(Integer.MAX_VALUE);
    }

    private E n() {
        b<E> bVar = this.f265527c.f265538b;
        this.f265527c = bVar;
        E e10 = bVar.f265537a;
        bVar.f265537a = null;
        return e10;
    }

    private void p() {
        this.f265531g.lock();
        this.f265529e.lock();
    }

    private void r() {
        this.f265529e.unlock();
        this.f265531g.unlock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f265526b.set(0);
        b<E> bVar = new b<>(null);
        this.f265527c = bVar;
        this.f265528d = bVar;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                add(object);
            }
        }
    }

    private void s(E e10) {
        b<E> bVar = this.f265528d;
        b<E> bVar2 = new b<>(e10);
        bVar.f265538b = bVar2;
        this.f265528d = bVar2;
    }

    private void u() {
        ReentrantLock reentrantLock = this.f265529e;
        reentrantLock.lock();
        try {
            this.f265530f.signal();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private void v() {
        ReentrantLock reentrantLock = this.f265531g;
        reentrantLock.lock();
        try {
            this.f265532h.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        p();
        try {
            objectOutputStream.defaultWriteObject();
            b<E> bVar = this.f265527c;
            while (true) {
                bVar = bVar.f265538b;
                if (bVar == null) {
                    objectOutputStream.writeObject(null);
                    return;
                }
                objectOutputStream.writeObject(bVar.f265537a);
            }
        } finally {
            r();
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        p();
        try {
            this.f265527c.f265538b = null;
            if (this.f265526b.getAndSet(0) >= this.f265525a) {
                this.f265532h.signalAll();
            }
            r();
        } catch (Throwable th2) {
            r();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        collection.getClass();
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        p();
        try {
            b<E> bVar = this.f265527c;
            bVar.f265538b = null;
            int i10 = 0;
            if (this.f265526b.getAndSet(0) >= this.f265525a) {
                this.f265532h.signalAll();
            }
            r();
            for (b<E> bVar2 = bVar.f265538b; bVar2 != null; bVar2 = bVar2.f265538b) {
                collection.add(bVar2.f265537a);
                bVar2.f265537a = null;
                i10++;
            }
            return i10;
        } catch (Throwable th2) {
            r();
            throw th2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        e10.getClass();
        long nanos = timeUnit.toNanos(j10);
        ReentrantLock reentrantLock = this.f265531g;
        AtomicInteger atomicInteger = this.f265526b;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() >= this.f265525a) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                try {
                    nanos = this.f265532h.awaitNanos(nanos);
                } catch (InterruptedException e11) {
                    this.f265532h.signal();
                    throw e11;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        s(e10);
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f265525a) {
            this.f265532h.signal();
        }
        reentrantLock.unlock();
        if (andIncrement != 0) {
            return true;
        }
        u();
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        if (this.f265526b.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f265529e;
        reentrantLock.lock();
        try {
            b<E> bVar = this.f265527c.f265538b;
            if (bVar == null) {
                reentrantLock.unlock();
                return null;
            }
            E e10 = bVar.f265537a;
            reentrantLock.unlock();
            return e10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j10);
        AtomicInteger atomicInteger = this.f265526b;
        ReentrantLock reentrantLock = this.f265529e;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() <= 0) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return null;
                }
                try {
                    nanos = this.f265530f.awaitNanos(nanos);
                } catch (InterruptedException e10) {
                    this.f265530f.signal();
                    throw e10;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        E eN = n();
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f265530f.signal();
        }
        reentrantLock.unlock();
        if (andDecrement >= this.f265525a) {
            v();
        }
        return eN;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        e10.getClass();
        ReentrantLock reentrantLock = this.f265531g;
        AtomicInteger atomicInteger = this.f265526b;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() >= this.f265525a) {
            try {
                try {
                    this.f265532h.await();
                } catch (InterruptedException e11) {
                    this.f265532h.signal();
                    throw e11;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        s(e10);
        int andIncrement = atomicInteger.getAndIncrement();
        if (andIncrement + 1 < this.f265525a) {
            this.f265532h.signal();
        }
        reentrantLock.unlock();
        if (andIncrement == 0) {
            u();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return this.f265525a - this.f265526b.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        b<E> bVar;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        p();
        try {
            b<E> bVar2 = this.f265527c;
            b<E> bVar3 = bVar2.f265538b;
            while (true) {
                b<E> bVar4 = bVar3;
                bVar = bVar2;
                bVar2 = bVar4;
                if (bVar2 == null) {
                    break;
                }
                if (obj.equals(bVar2.f265537a)) {
                    z10 = true;
                    break;
                }
                bVar3 = bVar2.f265538b;
            }
            if (z10) {
                bVar2.f265537a = null;
                bVar.f265538b = bVar2.f265538b;
                if (this.f265526b.getAndDecrement() >= this.f265525a) {
                    this.f265532h.signalAll();
                }
            }
            return z10;
        } finally {
            r();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f265526b.get();
    }

    public void t(int i10) {
        int i11 = this.f265525a;
        this.f265525a = i10;
        int i12 = this.f265526b.get();
        if (i10 <= i12 || i12 < i11) {
            return;
        }
        v();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        AtomicInteger atomicInteger = this.f265526b;
        ReentrantLock reentrantLock = this.f265529e;
        reentrantLock.lockInterruptibly();
        while (atomicInteger.get() == 0) {
            try {
                try {
                    this.f265530f.await();
                } catch (InterruptedException e10) {
                    this.f265530f.signal();
                    throw e10;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        E eN = n();
        int andDecrement = atomicInteger.getAndDecrement();
        if (andDecrement > 1) {
            this.f265530f.signal();
        }
        reentrantLock.unlock();
        if (andDecrement >= this.f265525a) {
            v();
        }
        return eN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        p();
        try {
            Object[] objArr = new Object[this.f265526b.get()];
            b<E> bVar = this.f265527c.f265538b;
            int i10 = 0;
            while (bVar != null) {
                int i11 = i10 + 1;
                objArr[i10] = bVar.f265537a;
                bVar = bVar.f265538b;
                i10 = i11;
            }
            r();
            return objArr;
        } catch (Throwable th2) {
            r();
            throw th2;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        p();
        try {
            String string = super.toString();
            r();
            return string;
        } catch (Throwable th2) {
            r();
            throw th2;
        }
    }

    public l2(int i10) {
        this.f265526b = new AtomicInteger(0);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f265529e = reentrantLock;
        this.f265530f = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f265531g = reentrantLock2;
        this.f265532h = reentrantLock2.newCondition();
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f265525a = i10;
        b<E> bVar = new b<>(null);
        this.f265527c = bVar;
        this.f265528d = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        p();
        try {
            int i10 = this.f265526b.get();
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            b<E> bVar = this.f265527c.f265538b;
            int i11 = 0;
            while (bVar != null) {
                int i12 = i11 + 1;
                tArr[i11] = bVar.f265537a;
                bVar = bVar.f265538b;
                i11 = i12;
            }
            r();
            return tArr;
        } catch (Throwable th2) {
            r();
            throw th2;
        }
    }

    public l2(Collection<? extends E> collection) {
        this(Integer.MAX_VALUE);
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        collection.getClass();
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        int i11 = 0;
        if (i10 <= 0) {
            return 0;
        }
        p();
        try {
            b<E> bVar = this.f265527c.f265538b;
            while (bVar != null && i11 < i10) {
                collection.add(bVar.f265537a);
                bVar.f265537a = null;
                bVar = bVar.f265538b;
                i11++;
            }
            if (i11 != 0) {
                this.f265527c.f265538b = bVar;
                if (this.f265526b.getAndAdd(-i11) >= this.f265525a) {
                    this.f265532h.signalAll();
                }
            }
            return i11;
        } finally {
            r();
        }
    }

    @Override // java.util.Queue
    public E poll() {
        int andDecrement;
        AtomicInteger atomicInteger = this.f265526b;
        E eN = null;
        if (atomicInteger.get() == 0) {
            return null;
        }
        ReentrantLock reentrantLock = this.f265529e;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() > 0) {
                eN = n();
                andDecrement = atomicInteger.getAndDecrement();
                if (andDecrement > 1) {
                    this.f265530f.signal();
                }
            } else {
                andDecrement = -1;
            }
            reentrantLock.unlock();
            if (andDecrement >= this.f265525a) {
                v();
            }
            return eN;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e10) {
        int andIncrement;
        e10.getClass();
        AtomicInteger atomicInteger = this.f265526b;
        if (atomicInteger.get() >= this.f265525a) {
            return false;
        }
        ReentrantLock reentrantLock = this.f265531g;
        reentrantLock.lock();
        try {
            if (atomicInteger.get() < this.f265525a) {
                s(e10);
                andIncrement = atomicInteger.getAndIncrement();
                if (andIncrement + 1 < this.f265525a) {
                    this.f265532h.signal();
                }
            } else {
                andIncrement = -1;
            }
            reentrantLock.unlock();
            if (andIncrement == 0) {
                u();
            }
            return andIncrement >= 0;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
