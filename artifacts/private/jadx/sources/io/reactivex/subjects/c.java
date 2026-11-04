package io.reactivex.subjects;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends io.reactivex.c implements io.reactivex.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a[] f303762d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a[] f303763e = new a[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Throwable f303766c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicBoolean f303765b = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference<a[]> f303764a = new AtomicReference<>(f303762d);

    static final class a extends AtomicReference<c> implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f303767b = -7650903191002190468L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f303768a;

        a(io.reactivex.f fVar, c cVar) {
            this.f303768a = fVar;
            lazySet(cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            c andSet = getAndSet(null);
            if (andSet != null) {
                andSet.p1(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == null;
        }
    }

    c() {
    }

    @cj.f
    @cj.d
    public static c j1() {
        return new c();
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar, this);
        fVar.d(aVar);
        if (i1(aVar)) {
            if (aVar.k()) {
                p1(aVar);
            }
            return;
        }
        Throwable th2 = this.f303766c;
        if (th2 != null) {
            fVar.onError(th2);
        } else {
            fVar.onComplete();
        }
    }

    @Override // io.reactivex.f
    public void d(io.reactivex.disposables.c cVar) {
        if (this.f303764a.get() == f303763e) {
            cVar.dispose();
        }
    }

    boolean i1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303764a.get();
            if (aVarArr == f303763e) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!z1.a(this.f303764a, aVarArr, aVarArr2));
        return true;
    }

    @cj.g
    public Throwable k1() {
        if (this.f303764a.get() == f303763e) {
            return this.f303766c;
        }
        return null;
    }

    public boolean l1() {
        return this.f303764a.get() == f303763e && this.f303766c == null;
    }

    public boolean m1() {
        return this.f303764a.get().length != 0;
    }

    public boolean n1() {
        return this.f303764a.get() == f303763e && this.f303766c != null;
    }

    int o1() {
        return this.f303764a.get().length;
    }

    @Override // io.reactivex.f
    public void onComplete() {
        if (this.f303765b.compareAndSet(false, true)) {
            for (a aVar : this.f303764a.getAndSet(f303763e)) {
                aVar.f303768a.onComplete();
            }
        }
    }

    @Override // io.reactivex.f
    public void onError(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f303765b.compareAndSet(false, true)) {
            io.reactivex.plugins.a.Y(th2);
            return;
        }
        this.f303766c = th2;
        for (a aVar : this.f303764a.getAndSet(f303763e)) {
            aVar.f303768a.onError(th2);
        }
    }

    void p1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.f303764a.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (aVarArr[i10] == aVar) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f303762d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!z1.a(this.f303764a, aVarArr, aVarArr2));
    }
}
