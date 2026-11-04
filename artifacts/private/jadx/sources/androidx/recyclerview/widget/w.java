package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
class w<T> implements i0<T> {

    class a implements i0.b<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f74566f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f74567g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f74568h = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f74569a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f74570b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f74571c = new RunnableC0733a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i0.b f74572d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.w$a$a, reason: collision with other inner class name */
        class RunnableC0733a implements Runnable {
            RunnableC0733a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVarA = a.this.f74569a.a();
                while (dVarA != null) {
                    int i10 = dVarA.f74591b;
                    if (i10 == 1) {
                        a.this.f74572d.a(dVarA.f74592c, dVarA.f74593d);
                    } else if (i10 == 2) {
                        a.this.f74572d.c(dVarA.f74592c, (j0.a) dVarA.f74597h);
                    } else if (i10 == 3) {
                        a.this.f74572d.b(dVarA.f74592c, dVarA.f74593d);
                    }
                    dVarA = a.this.f74569a.a();
                }
            }
        }

        a(i0.b bVar) {
            this.f74572d = bVar;
        }

        private void d(d dVar) {
            this.f74569a.c(dVar);
            this.f74570b.post(this.f74571c);
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void a(int i10, int i11) {
            d(d.a(1, i10, i11));
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void b(int i10, int i11) {
            d(d.a(3, i10, i11));
        }

        @Override // androidx.recyclerview.widget.i0.b
        public void c(int i10, j0.a<T> aVar) {
            d(d.c(2, i10, aVar));
        }
    }

    class b implements i0.a<T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f74575g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final int f74576h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f74577i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f74578j = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f74579a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f74580b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AtomicBoolean f74581c = new AtomicBoolean(false);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Runnable f74582d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i0.a f74583e;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d dVarA = b.this.f74579a.a();
                    if (dVarA == null) {
                        b.this.f74581c.set(false);
                        return;
                    }
                    int i10 = dVarA.f74591b;
                    if (i10 == 1) {
                        b.this.f74579a.b(1);
                        b.this.f74583e.c(dVarA.f74592c);
                    } else if (i10 == 2) {
                        b.this.f74579a.b(2);
                        b.this.f74579a.b(3);
                        b.this.f74583e.a(dVarA.f74592c, dVarA.f74593d, dVarA.f74594e, dVarA.f74595f, dVarA.f74596g);
                    } else if (i10 == 3) {
                        b.this.f74583e.b(dVarA.f74592c, dVarA.f74593d);
                    } else if (i10 == 4) {
                        b.this.f74583e.d((j0.a) dVarA.f74597h);
                    }
                }
            }
        }

        b(i0.a aVar) {
            this.f74583e = aVar;
        }

        private void e() {
            if (this.f74581c.compareAndSet(false, true)) {
                this.f74580b.execute(this.f74582d);
            }
        }

        private void f(d dVar) {
            this.f74579a.c(dVar);
            e();
        }

        private void g(d dVar) {
            this.f74579a.d(dVar);
            e();
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void a(int i10, int i11, int i12, int i13, int i14) {
            g(d.b(2, i10, i11, i12, i13, i14, null));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void b(int i10, int i11) {
            f(d.a(3, i10, i11));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void c(int i10) {
            g(d.c(1, i10, null));
        }

        @Override // androidx.recyclerview.widget.i0.a
        public void d(j0.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f74586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f74587b = new Object();

        c() {
        }

        d a() {
            synchronized (this.f74587b) {
                try {
                    d dVar = this.f74586a;
                    if (dVar == null) {
                        return null;
                    }
                    this.f74586a = dVar.f74590a;
                    return dVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(int i10) {
            d dVar;
            synchronized (this.f74587b) {
                while (true) {
                    try {
                        dVar = this.f74586a;
                        if (dVar == null || dVar.f74591b != i10) {
                            break;
                        }
                        this.f74586a = dVar.f74590a;
                        dVar.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (dVar != null) {
                    d dVar2 = dVar.f74590a;
                    while (dVar2 != null) {
                        d dVar3 = dVar2.f74590a;
                        if (dVar2.f74591b == i10) {
                            dVar.f74590a = dVar3;
                            dVar2.d();
                        } else {
                            dVar = dVar2;
                        }
                        dVar2 = dVar3;
                    }
                }
            }
        }

        void c(d dVar) {
            synchronized (this.f74587b) {
                try {
                    d dVar2 = this.f74586a;
                    if (dVar2 == null) {
                        this.f74586a = dVar;
                        return;
                    }
                    while (true) {
                        d dVar3 = dVar2.f74590a;
                        if (dVar3 == null) {
                            dVar2.f74590a = dVar;
                            return;
                        }
                        dVar2 = dVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void d(d dVar) {
            synchronized (this.f74587b) {
                try {
                    dVar.f74590a = this.f74586a;
                    this.f74586a = dVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static d f74588i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Object f74589j = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d f74590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f74594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f74595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f74596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f74597h;

        d() {
        }

        static d a(int i10, int i11, int i12) {
            return b(i10, i11, i12, 0, 0, 0, null);
        }

        static d b(int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            d dVar;
            synchronized (f74589j) {
                try {
                    dVar = f74588i;
                    if (dVar == null) {
                        dVar = new d();
                    } else {
                        f74588i = dVar.f74590a;
                        dVar.f74590a = null;
                    }
                    dVar.f74591b = i10;
                    dVar.f74592c = i11;
                    dVar.f74593d = i12;
                    dVar.f74594e = i13;
                    dVar.f74595f = i14;
                    dVar.f74596g = i15;
                    dVar.f74597h = obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return dVar;
        }

        static d c(int i10, int i11, Object obj) {
            return b(i10, i11, 0, 0, 0, 0, obj);
        }

        void d() {
            this.f74590a = null;
            this.f74596g = 0;
            this.f74595f = 0;
            this.f74594e = 0;
            this.f74593d = 0;
            this.f74592c = 0;
            this.f74591b = 0;
            this.f74597h = null;
            synchronized (f74589j) {
                try {
                    d dVar = f74588i;
                    if (dVar != null) {
                        this.f74590a = dVar;
                    }
                    f74588i = this;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    w() {
    }

    @Override // androidx.recyclerview.widget.i0
    public i0.b<T> a(i0.b<T> bVar) {
        return new a(bVar);
    }

    @Override // androidx.recyclerview.widget.i0
    public i0.a<T> b(i0.a<T> aVar) {
        return new b(aVar);
    }
}
