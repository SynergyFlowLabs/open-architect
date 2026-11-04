package androidx.media2.session;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class e0 implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f58836d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f58837e = "SequencedFutureManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private int f58839b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f58838a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("mLock")
    private androidx.collection.a<Integer, a<?>> f58840c = new androidx.collection.a<>();

    static final class a<T> extends androidx.concurrent.futures.a<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f58841i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final T f58842j;

        private a(int i10, @NonNull T t10) {
            this.f58841i = i10;
            this.f58842j = t10;
        }

        static <T> a<T> N(int i10, @NonNull T t10) {
            return new a<>(i10, t10);
        }

        @Override // androidx.concurrent.futures.a
        public boolean E(@p0 T t10) {
            return super.E(t10);
        }

        @NonNull
        public T O() {
            return this.f58842j;
        }

        public int R() {
            return this.f58841i;
        }

        void S() {
            E(this.f58842j);
        }
    }

    e0() {
    }

    public <T> a<T> a(T t10) {
        a<T> aVarN;
        synchronized (this.f58838a) {
            try {
                int iB = b();
                aVarN = a.N(iB, t10);
                this.f58840c.put(Integer.valueOf(iB), aVarN);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarN;
    }

    public int b() {
        int i10;
        synchronized (this.f58838a) {
            try {
                i10 = this.f58839b;
                this.f58839b = i10 + 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public <T> void c(int i10, T t10) {
        synchronized (this.f58838a) {
            try {
                a<?> aVarRemove = this.f58840c.remove(Integer.valueOf(i10));
                if (aVarRemove != null) {
                    if (t10 == null || aVarRemove.O().getClass() == t10.getClass()) {
                        aVarRemove.E(t10);
                    } else {
                        aVarRemove.O().getClass().toString();
                        t10.getClass().toString();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ArrayList arrayList;
        synchronized (this.f58838a) {
            arrayList = new ArrayList(this.f58840c.values());
            this.f58840c.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).S();
        }
    }
}
