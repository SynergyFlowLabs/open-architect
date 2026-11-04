package org.apache.commons.collections4.collection;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class e<E> implements Collection<E>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f335611c = 2412805092710877986L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection<E> f335612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f335613b;

    protected e(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f335612a = collection;
        this.f335613b = this;
    }

    public static <T> e<T> d(Collection<T> collection) {
        return new e<>(collection);
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        boolean zAdd;
        synchronized (this.f335613b) {
            try {
                zAdd = c().add(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean zAddAll;
        synchronized (this.f335613b) {
            zAddAll = c().addAll(collection);
        }
        return zAddAll;
    }

    protected Collection<E> c() {
        return this.f335612a;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f335613b) {
            try {
                c().clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f335613b) {
            zContains = c().contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean zContainsAll;
        synchronized (this.f335613b) {
            try {
                zContainsAll = c().containsAll(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        synchronized (this.f335613b) {
            boolean z10 = true;
            try {
                if (obj == this) {
                    return true;
                }
                if (obj != this && !c().equals(obj)) {
                    z10 = false;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f335613b) {
            try {
                iHashCode = c().hashCode();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iHashCode;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f335613b) {
            zIsEmpty = c().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return c().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f335613b) {
            try {
                zRemove = c().remove(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll;
        synchronized (this.f335613b) {
            try {
                zRemoveAll = c().removeAll(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll;
        synchronized (this.f335613b) {
            try {
                zRetainAll = c().retainAll(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f335613b) {
            try {
                size = c().size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f335613b) {
            try {
                array = c().toArray();
            } finally {
            }
        }
        return array;
    }

    public String toString() {
        String string;
        synchronized (this.f335613b) {
            string = c().toString();
        }
        return string;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f335613b) {
            try {
                tArr2 = (T[]) c().toArray(tArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tArr2;
    }

    protected e(Collection<E> collection, Object obj) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        if (obj == null) {
            throw new NullPointerException("Lock must not be null.");
        }
        this.f335612a = collection;
        this.f335613b = obj;
    }
}
