package io.sentry;

import java.util.Queue;

/* JADX INFO: loaded from: classes11.dex */
final class ba<E> extends aa<E> implements Queue<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f305141d = 1;

    private ba(Queue<E> queue) {
        super(queue);
    }

    static <E> ba<E> k(Queue<E> queue) {
        return new ba<>(queue);
    }

    @Override // java.util.Queue
    public E element() {
        m1 m1VarA = this.f303909b.a();
        try {
            E eElement = c().element();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return eElement;
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

    @Override // io.sentry.aa, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zEquals = c().equals(obj);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zEquals;
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

    @Override // io.sentry.aa, java.util.Collection
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.aa
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Queue<E> c() {
        return (Queue) super.c();
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        m1 m1VarA = this.f303909b.a();
        try {
            boolean zOffer = c().offer(e10);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return zOffer;
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

    @Override // java.util.Queue
    public E peek() {
        m1 m1VarA = this.f303909b.a();
        try {
            E ePeek = c().peek();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return ePeek;
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

    @Override // java.util.Queue
    public E poll() {
        m1 m1VarA = this.f303909b.a();
        try {
            E ePoll = c().poll();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return ePoll;
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

    @Override // java.util.Queue
    public E remove() {
        m1 m1VarA = this.f303909b.a();
        try {
            E eRemove = c().remove();
            if (m1VarA != null) {
                m1VarA.close();
            }
            return eRemove;
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

    @Override // io.sentry.aa, java.util.Collection
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

    protected ba(Queue<E> queue, io.sentry.util.a aVar) {
        super(queue, aVar);
    }

    @Override // io.sentry.aa, java.util.Collection
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
