package com.planner5d.library.model.manager.synchronization;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.m0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes9.dex */
@ij.f
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f222199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fg.e<t> f222200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f222201c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c1<Boolean> f222202d = new c1<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<b> f222203e = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Semaphore f222204f = new Semaphore(1);

    private static class a extends b {
        private a(Subscriber<? super Void> subscriber, SynchronizedModel synchronizedModel, id.a aVar, boolean z10) {
            super(subscriber, synchronizedModel, aVar, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Subscriber<? super Void> f222205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SynchronizedModel f222206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final id.a f222207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f222208d;

        private b(Subscriber<? super Void> subscriber, SynchronizedModel synchronizedModel, id.a aVar, boolean z10) {
            this.f222205a = subscriber;
            this.f222206b = synchronizedModel;
            this.f222207c = aVar;
            this.f222208d = z10;
        }
    }

    @ij.a
    public i(fg.e<t> eVar, d dVar) {
        this.f222200b = eVar;
        this.f222199a = dVar;
    }

    private void d(List<b> list, id.a aVar) {
        synchronized (this.f222203e) {
            try {
                Iterator<b> it = this.f222203e.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next.f222207c == null || next.f222207c != aVar) {
                        it.remove();
                        list.add(next);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void e(List<b> list) {
        synchronized (this.f222203e) {
            try {
                Iterator<b> it = this.f222203e.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next.f222206b == null) {
                        it.remove();
                        list.add(next);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void h(b bVar, Throwable th2) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(bVar);
        synchronized (this.f222203e) {
            try {
                d(linkedList, this.f222200b.get().a());
                if (bVar.f222206b == null) {
                    e(linkedList);
                }
                q();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (b bVar2 : linkedList) {
            if (th2 == null) {
                int i10 = 1 << 0;
                bVar2.f222205a.onNext(null);
                bVar2.f222205a.onCompleted();
            } else {
                bVar2.f222205a.onError(th2);
            }
        }
        m0.f224429b.t();
        m0.f224430c.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(b bVar) {
        try {
            id.a aVarA = this.f222200b.get().a();
            if (aVarA != null && aVarA == bVar.f222207c) {
                if (bVar instanceof a) {
                    this.f222199a.k(null, aVarA, bVar.f222208d, true);
                } else {
                    this.f222199a.k(bVar.f222206b, aVarA, bVar.f222208d, false);
                }
            }
            h(bVar, null);
        } catch (Throwable th2) {
            h(bVar, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(SynchronizedModel synchronizedModel, boolean z10, Subscriber subscriber) {
        o(new b(subscriber, synchronizedModel, this.f222200b.get().a(), z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(Subscriber subscriber) {
        o(new a(subscriber, null, this.f222200b.get().a(), false));
    }

    private void o(b bVar) {
        synchronized (this.f222203e) {
            try {
                if (this.f222201c.get()) {
                    this.f222203e.add(bVar);
                } else {
                    try {
                        this.f222204f.acquire();
                    } catch (InterruptedException unused) {
                    }
                    p(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p(final b bVar) {
        this.f222201c.set(true);
        c1<Boolean> c1Var = this.f222202d;
        Boolean bool = Boolean.TRUE;
        c1Var.o(bool);
        m0.f224439l.o(bool);
        com.planner5d.library.services.rx.i.i(new Runnable() { // from class: com.planner5d.library.model.manager.synchronization.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f222197a.l(bVar);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    private void q() {
        synchronized (this.f222203e) {
            try {
                if (this.f222203e.isEmpty()) {
                    this.f222201c.set(false);
                    c1<Boolean> c1Var = this.f222202d;
                    Boolean bool = Boolean.FALSE;
                    c1Var.o(bool);
                    m0.f224439l.o(bool);
                    this.f222204f.release();
                } else {
                    for (b bVar : this.f222203e) {
                        if (bVar.f222206b != null) {
                            this.f222203e.remove(bVar);
                            p(bVar);
                            return;
                        }
                    }
                    p(this.f222203e.remove(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    public void f(kb.b<?> bVar) {
        this.f222199a.j(bVar);
    }

    public <T> T g(@NonNull Callable<T> callable) throws Exception {
        try {
            this.f222204f.acquire();
        } catch (InterruptedException unused) {
        }
        try {
            T tCall = callable.call();
            this.f222204f.release();
            return tCall;
        } catch (Throwable th2) {
            this.f222204f.release();
            throw th2;
        }
    }

    @NonNull
    @m1
    public m i(@p0 kb.b<?> bVar) {
        if (this.f222201c.get()) {
            return m.SYNCHRONIZING;
        }
        return this.f222199a.q(bVar) ? m.NEEDS_SYNCHRONIZATION : m.ACTUAL;
    }

    public w0<Boolean> j() {
        return this.f222202d;
    }

    public boolean k() {
        return this.f222201c.get();
    }

    public Observable<Void> r(SynchronizedModel synchronizedModel) {
        return s(synchronizedModel, false);
    }

    public Observable<Void> s(SynchronizedModel synchronizedModel, boolean z10) {
        return t(synchronizedModel, z10, true);
    }

    public Observable<Void> t(final SynchronizedModel synchronizedModel, final boolean z10, boolean z11) {
        return com.planner5d.library.services.rx.i.e(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.synchronization.f
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f222193a.m(synchronizedModel, z10, (Subscriber) obj);
            }
        }, z11);
    }

    public void u() {
        r(null).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
    }

    @m1
    public void v() throws Throwable {
        t(null, false, false).toBlocking().firstOrDefault(null);
    }

    @m1
    public void w() {
        t(null, true, false).toBlocking().firstOrDefault(null);
    }

    public Observable<Void> x() {
        return com.planner5d.library.services.rx.i.e(new Observable.OnSubscribe() { // from class: com.planner5d.library.model.manager.synchronization.g
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f222196a.n((Subscriber) obj);
            }
        }, true);
    }
}
