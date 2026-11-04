package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
class aa<E> implements Collection<E>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f303907c = 2412805092710877986L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection<E> f303908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.sentry.util.a f303909b;

    aa(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f303908a = collection;
        this.f303909b = new io.sentry.util.a();
    }

    public static <T> aa<T> d(Collection<T> collection) {
        return new aa<>(collection);
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zAdd = c().add(e10);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zAdd;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zAddAll = c().addAll(collection);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zAddAll;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    protected Collection<E> c() {
        return this.f303908a;
    }

    @Override // java.util.Collection
    public void clear() {
        m1 m1VarA = this.f303909b.a();
        try {
            c().clear();
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zContains = c().contains(obj);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zContains;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zContainsAll = c().containsAll(collection);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zContainsAll;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        m1 m1VarA = this.f303909b.a();
        boolean z10 = true;
        if (obj == this) {
            if (m1VarA != null) {
                m1VarA.close();
            }
            return true;
        }
        if (obj != this) {
            try {
                if (!c().equals(obj)) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        if (m1VarA != null) {
            m1VarA.close();
        }
        return z10;
    }

    @Override // java.util.Collection
    public int hashCode() {
        m1 m1VarA = this.f303909b.a();
        try {
            int iHashCode = c().hashCode();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return iHashCode;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zIsEmpty = c().isEmpty();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zIsEmpty;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return c().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zRemove = c().remove(obj);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zRemove;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zRemoveAll = c().removeAll(collection);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zRemoveAll;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zRetainAll = c().retainAll(collection);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zRetainAll;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public int size() {
        m1 m1VarA = this.f303909b.a();
        try {
            int size = c().size();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return size;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        m1 m1VarA = this.f303909b.a();
        try {
            Object[] array = c().toArray();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return array;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String toString() {
        m1 m1VarA = this.f303909b.a();
        try {
            String string = c().toString();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return string;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    aa(Collection<E> collection, io.sentry.util.a aVar) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        if (aVar == null) {
            throw new NullPointerException("Lock must not be null.");
        }
        this.f303908a = collection;
        this.f303909b = aVar;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        m1 m1VarA = this.f303909b.a();
        try {
            T[] tArr2 = (T[]) c().toArray(tArr);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return tArr2;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
