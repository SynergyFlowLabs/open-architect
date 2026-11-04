package com.planner5d.library.widget.editor.editor3d.model;

import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemGrid;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWindow;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.widget.editor.editor3d.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.planner5d.library.widget.editor.editor3d.model.builder.m> f255725a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor3d.model.builder.f f255729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor3d.model.builder.m f255730f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ve.b f255734j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w f255739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.editor3d.scene3d.j f255740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b2 f255741q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f255726b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f255727c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f255728d = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<com.planner5d.library.widget.editor.editor3d.model.builder.m> f255731g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f255732h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f255733i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f255735k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f255736l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f255737m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f255738n = null;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f255731g != null) {
                try {
                    for (com.planner5d.library.widget.editor.editor3d.model.builder.m mVar : e.this.f255731g) {
                        if (!e.this.f255734j.m(e.this.f255738n)) {
                            mVar.a(e.this.f255740p.n(), e.this.f255734j, e.this.f255740p.v());
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (e.this.f255732h) {
                        e.this.f255727c = th2;
                        e.this.f255726b = true;
                        return;
                    }
                }
            }
            synchronized (e.this.f255732h) {
                e.this.f255726b = true;
            }
        }
    }

    public static class b extends com.planner5d.library.widget.editor.a.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n[] f255743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f255744d;

        private b(Integer num, n[] nVarArr, boolean z10) {
            super(num.intValue());
            this.f255743c = nVarArr;
            this.f255744d = z10;
        }
    }

    public e(ItemProject itemProject, ve.b bVar, dc.d<cc.a> dVar, b2 b2Var, w wVar, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, boolean z10) {
        this.f255734j = bVar;
        this.f255741q = b2Var;
        this.f255739o = wVar;
        this.f255740p = jVar;
        this.f255730f = jVar.o();
        this.f255729e = new com.planner5d.library.widget.editor.editor3d.model.builder.f(dVar);
        this.f255725a = p(itemProject, z10);
    }

    private void l(Item item, List<com.planner5d.library.widget.editor.editor3d.model.builder.m> list, boolean z10, float f10) {
        com.planner5d.library.widget.editor.editor3d.model.builder.m.c(list, item, this.f255729e, z10, f10);
        Item[] children = item.getChildren();
        if (children != null) {
            for (Item item2 : children) {
                l(item2, list, z10, f10);
            }
        }
    }

    private void m(List<com.planner5d.library.widget.editor.editor3d.model.builder.m> list, com.planner5d.library.widget.editor.editor3d.model.builder.m mVar) {
        if (mVar == null || mVar.g() || mVar.i() != null) {
            return;
        }
        list.add(mVar);
    }

    private void n(ExecutorService executorService, List<com.planner5d.library.widget.editor.editor3d.model.builder.m> list, com.planner5d.library.widget.editor.editor3d.model.builder.m mVar, Subscriber<? super b> subscriber, int i10) {
        m(list, mVar);
        if (list.size() >= i10) {
            w(executorService, list, subscriber);
        }
    }

    private float o(ItemFloor itemFloor, List<com.planner5d.library.widget.editor.editor3d.model.builder.m> list, boolean z10, float f10) {
        Item[] children = itemFloor.getChildren();
        for (Item item : children) {
            if (item instanceof ItemNs) {
                l(item, list, z10, f10);
            }
        }
        for (Item item2 : children) {
            if (!(item2 instanceof ItemNs)) {
                l(item2, list, z10, f10);
            }
        }
        return f10 + itemFloor.getHeight();
    }

    private List<com.planner5d.library.widget.editor.editor3d.model.builder.m> p(ItemProject itemProject, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ItemFloor activeFloor = itemProject.getActiveFloor();
        if (activeFloor != null) {
            float fO = 0.0f;
            l(itemProject.getEarth(), arrayList, false, 0.0f);
            if (z10) {
                l(new ItemGrid(itemProject.getEarth()), arrayList, false, 0.0f);
            }
            for (int i10 = 0; i10 < itemProject.getFloorNumber(activeFloor).intValue(); i10++) {
                fO = o(itemProject.getFloor(i10), arrayList, false, fO);
            }
            o(activeFloor, arrayList, true, fO);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.planner5d.library.widget.editor.editor3d.model.e] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.planner5d.library.widget.editor.editor3d.model.e] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.planner5d.library.widget.editor.editor3d.model.e] */
    public /* synthetic */ void q(Subscriber subscriber) {
        ?? r10;
        Subscriber subscriber2;
        Throwable th2;
        ?? r11;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        boolean z10 = false;
        try {
            this.f255735k = false;
            this.f255738n = this.f255734j.D();
            y(subscriber);
            ArrayList arrayList = new ArrayList();
            m(arrayList, this.f255730f);
            w(executorServiceNewSingleThreadExecutor, arrayList, subscriber);
            Iterator<com.planner5d.library.widget.editor.editor3d.model.builder.m> it = this.f255725a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r10 = this;
                    subscriber2 = subscriber;
                    break;
                }
                com.planner5d.library.widget.editor.editor3d.model.builder.m next = it.next();
                if (next.h() instanceof ItemEarth) {
                    r10 = this;
                    subscriber2 = subscriber;
                    try {
                        r10.n(executorServiceNewSingleThreadExecutor, arrayList, next, subscriber2, 1);
                        r10 = r10;
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        r11 = r10;
                        try {
                            subscriber2.onError(th2);
                            executorServiceNewSingleThreadExecutor.shutdown();
                            r11.f255734j.f(r11.f255738n);
                            if (!z10) {
                                subscriber2.onCompleted();
                            }
                        } catch (Throwable th4) {
                            executorServiceNewSingleThreadExecutor.shutdown();
                            r11.f255734j.f(r11.f255738n);
                            if (z10) {
                                throw th4;
                            }
                            subscriber2.onCompleted();
                            throw th4;
                        }
                    }
                }
            }
            r10.w(executorServiceNewSingleThreadExecutor, arrayList, subscriber2);
            for (com.planner5d.library.widget.editor.editor3d.model.builder.m mVar : r10.f255725a) {
                if ((mVar.h() instanceof ItemRoom) || (mVar.h() instanceof ItemWall)) {
                    r10.n(executorServiceNewSingleThreadExecutor, arrayList, mVar, subscriber2, 5);
                }
            }
            r10.f255735k = true;
            r10.w(executorServiceNewSingleThreadExecutor, arrayList, subscriber2);
            for (com.planner5d.library.widget.editor.editor3d.model.builder.m mVar2 : r10.f255725a) {
                if (mVar2.h() instanceof ItemWindow) {
                    r10.n(executorServiceNewSingleThreadExecutor, arrayList, mVar2, subscriber2, 10);
                }
            }
            r10.w(executorServiceNewSingleThreadExecutor, arrayList, subscriber2);
            for (com.planner5d.library.widget.editor.editor3d.model.builder.m mVar3 : r10.f255725a) {
                if (!(mVar3.h() instanceof ItemNs)) {
                    r10.n(executorServiceNewSingleThreadExecutor, arrayList, mVar3, subscriber2, 20);
                }
            }
            r10.w(executorServiceNewSingleThreadExecutor, arrayList, subscriber2);
            Iterator<com.planner5d.library.widget.editor.editor3d.model.builder.m> it2 = r10.f255725a.iterator();
            while (it2.hasNext()) {
                r10.n(executorServiceNewSingleThreadExecutor, arrayList, it2.next(), subscriber2, 10);
            }
            r10.w(executorServiceNewSingleThreadExecutor, arrayList, subscriber2);
            r10.x(subscriber2);
            try {
                subscriber2.onCompleted();
                executorServiceNewSingleThreadExecutor.shutdown();
                r10.f255734j.f(r10.f255738n);
            } catch (Throwable th5) {
                z10 = true;
                th2 = th5;
                r11 = r10;
                subscriber2.onError(th2);
                executorServiceNewSingleThreadExecutor.shutdown();
                r11.f255734j.f(r11.f255738n);
                if (!z10) {
                    subscriber2.onCompleted();
                }
            }
        } catch (Throwable th6) {
            th = th6;
            r10 = this;
            subscriber2 = subscriber;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(com.planner5d.library.widget.editor.editor3d.model.builder.m mVar) {
        try {
            mVar.b(this.f255734j);
        } finally {
            this.f255733i.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        if (!this.f255738n.a()) {
            try {
                this.f255734j.A();
            } catch (Throwable th2) {
                this.f255727c = th2;
            }
        }
        this.f255726b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        while (!this.f255738n.b()) {
            this.f255740p.n().f();
        }
    }

    private void v(Subscriber<? super b> subscriber) {
        if (this.f255738n.a() || this.f255727c != null) {
            this.f255734j.f(this.f255738n);
            Throwable th2 = this.f255727c;
            if (th2 != null) {
                subscriber.onError(th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:74:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0093 A[SYNTHETIC] */
    private void w(ExecutorService executorService, List<com.planner5d.library.widget.editor.editor3d.model.builder.m> list, Subscriber<? super b> subscriber) {
        if (list.isEmpty()) {
            return;
        }
        for (final com.planner5d.library.widget.editor.editor3d.model.builder.m mVar : list) {
            this.f255733i.set(false);
            executorService.execute(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.model.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f255722a.r(mVar);
                }
            });
            while (!this.f255733i.get()) {
                if (this.f255738n.a()) {
                    return;
                } else {
                    Thread.yield();
                }
            }
            z(mVar);
        }
        if (this.f255738n.a()) {
            return;
        }
        synchronized (this.f255732h) {
            this.f255731g = list;
            this.f255726b = false;
        }
        if (!this.f255740p.M(this.f255728d)) {
            synchronized (this.f255732h) {
                try {
                    this.f255726b = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        while (true) {
            synchronized (this.f255732h) {
                if (this.f255726b || this.f255738n.a()) {
                    break;
                    break;
                }
            }
            x(subscriber);
            for (com.planner5d.library.widget.editor.editor3d.model.builder.m mVar2 : list) {
                if (!this.f255738n.a()) {
                    z(mVar2);
                }
            }
            list.clear();
            Thread.yield();
        }
        v(subscriber);
        x(subscriber);
        while (r6.hasNext()) {
            if (!this.f255738n.a()) {
                z(mVar2);
            }
        }
        list.clear();
    }

    private void x(Subscriber<? super b> subscriber) {
        if (this.f255738n.a()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (com.planner5d.library.widget.editor.editor3d.model.builder.m mVar : this.f255725a) {
            if (mVar == null) {
                i10++;
            } else {
                if (mVar.g()) {
                    i10++;
                }
                n nVarE = mVar.e(this.f255740p.n(), this.f255730f, this.f255734j, this.f255740p.v());
                if (nVarE != null) {
                    arrayList.add(nVarE);
                }
            }
        }
        if (this.f255738n.a()) {
            return;
        }
        subscriber.onNext(new b(Integer.valueOf(Math.round((i10 / this.f255725a.size()) * 100.0f)), (n[]) arrayList.toArray(new n[0]), this.f255735k));
    }

    private void y(Subscriber<? super b> subscriber) {
        subscriber.onNext(new b(0, new n[0], this.f255735k));
        if (this.f255738n.a()) {
            return;
        }
        this.f255734j.B();
        synchronized (this.f255732h) {
            try {
                this.f255726b = false;
                if (!this.f255740p.M(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.model.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f255617a.s();
                    }
                })) {
                    this.f255726b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        while (true) {
            synchronized (this.f255732h) {
                if (this.f255726b || this.f255738n.a()) {
                    break;
                    break;
                }
            }
            Thread.yield();
        }
        v(subscriber);
    }

    private void z(com.planner5d.library.widget.editor.editor3d.model.builder.m mVar) {
        ErrorMessageException errorMessageExceptionExtract;
        if (mVar.f() instanceof com.planner5d.library.widget.editor.editor3d.model.builder.n) {
            if ((!this.f255736l || !this.f255737m) && (errorMessageExceptionExtract = ErrorMessageException.extract(((com.planner5d.library.widget.editor.editor3d.model.builder.n) mVar.f()).c())) != null) {
                if (ErrorMessageException.isWithCode(errorMessageExceptionExtract, com.planner5d.library.f.s.I9)) {
                    if (this.f255736l) {
                        return;
                    } else {
                        this.f255736l = true;
                    }
                } else if (this.f255737m) {
                    return;
                } else {
                    this.f255737m = true;
                }
                this.f255741q.r(errorMessageExceptionExtract);
            }
        }
    }

    public void A() {
        this.f255738n.d();
        this.f255740p.m(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.model.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f255618a.t();
            }
        });
        this.f255738n.c();
    }

    public Observable<b> u() {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor3d.model.d
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f255724a.q((Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).onBackpressureDrop().observeOn(com.planner5d.library.services.rx.c.f224934d);
    }
}
