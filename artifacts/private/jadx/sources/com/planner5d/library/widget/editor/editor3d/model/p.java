package com.planner5d.library.widget.editor.editor3d.model;

import androidx.annotation.m1;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class p {

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final AtomicInteger f255777h = new AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Item[] f255778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ve.b f255779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.planner5d.library.widget.editor.editor3d.scene3d.j f255780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f255781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f255782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f255783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f255784g;

        private a(Item[] itemArr, ve.b bVar, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, boolean z10, boolean z11, String str) {
            ArrayList arrayList = new ArrayList();
            for (Item item : itemArr) {
                if (!arrayList.contains(item)) {
                    arrayList.add(item);
                }
            }
            this.f255778a = (Item[]) arrayList.toArray(new Item[0]);
            this.f255779b = bVar;
            this.f255780c = jVar;
            this.f255781d = z10;
            this.f255782e = z11;
            if (str == null) {
                str = "auto_" + f255777h.getAndIncrement();
            }
            this.f255783f = str;
            this.f255784g = jVar.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Subscriber<? super n[]> f255785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f255786b;

        private boolean c() {
            if (this.f255785a.isUnsubscribed()) {
                return true;
            }
            if (!this.f255786b.f255780c.D()) {
                return false;
            }
            g();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @m1
        public void e() {
            ErrorMessageException errorMessageExceptionExtract;
            if (c()) {
                return;
            }
            com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255786b.f255780c;
            final List<com.planner5d.library.widget.editor.editor3d.model.builder.m> listF = p.f(this.f255786b.f255778a, jVar.r(), jVar.s());
            ve.b bVar = this.f255786b.f255779b;
            final com.planner5d.library.widget.editor.editor3d.model.builder.m mVarO = jVar.o();
            mVarO.b(bVar);
            for (com.planner5d.library.widget.editor.editor3d.model.builder.m mVar : listF) {
                if (c()) {
                    return;
                }
                mVar.b(bVar);
                if ((mVar.f() instanceof com.planner5d.library.widget.editor.editor3d.model.builder.n) && (errorMessageExceptionExtract = ErrorMessageException.extract(((com.planner5d.library.widget.editor.editor3d.model.builder.n) mVar.f()).c())) != null) {
                    bVar.C(errorMessageExceptionExtract);
                }
            }
            if (c() || jVar.O(2000L, new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.model.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f255787a.d(listF, mVarO);
                }
            })) {
                return;
            }
            g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(List<com.planner5d.library.widget.editor.editor3d.model.builder.m> list, com.planner5d.library.widget.editor.editor3d.model.builder.m mVar) {
            com.planner5d.library.widget.editor.editor3d.scene3d.j jVar = this.f255786b.f255780c;
            ve.b bVar = this.f255786b.f255779b;
            try {
                jVar.U(this.f255786b.f255778a, this.f255786b.f255784g);
                LinkedList linkedList = new LinkedList();
                mVar.a(jVar.n(), bVar, jVar.v());
                for (com.planner5d.library.widget.editor.editor3d.model.builder.m mVar2 : list) {
                    if (c()) {
                        return;
                    }
                    mVar2.a(jVar.n(), bVar, jVar.v());
                    n nVarE = mVar2.e(jVar.n(), mVar, bVar, jVar.v());
                    if (nVarE != null) {
                        linkedList.add(nVarE);
                    }
                }
                Item itemY = jVar.y();
                if (c()) {
                    return;
                }
                if (linkedList.isEmpty()) {
                    itemY = null;
                } else if (this.f255786b.f255781d) {
                    itemY = linkedList.get(0).f255766b;
                }
                jVar.i(linkedList, itemY, this.f255786b.f255784g);
                this.f255785a.onNext(linkedList.toArray(new n[0]));
                this.f255785a.onCompleted();
                h();
            } catch (Throwable unused) {
                g();
            }
        }

        private void g() {
            this.f255785a.onNext(new n[0]);
            this.f255785a.onCompleted();
            h();
        }

        private void h() {
            if (this.f255786b.f255782e) {
                this.f255786b.f255780c.Y();
            }
        }

        private b(Subscriber<? super n[]> subscriber, a aVar) {
            this.f255785a = subscriber;
            this.f255786b = aVar;
        }
    }

    private static void c(Item item, ItemProject itemProject, com.planner5d.library.widget.editor.editor3d.model.builder.f fVar, List<com.planner5d.library.widget.editor.editor3d.model.builder.m> list) {
        if (item == null) {
            return;
        }
        ItemFloor itemFloor = itemProject.getItemFloor(item);
        com.planner5d.library.widget.editor.editor3d.model.builder.m.c(list, item, fVar, itemFloor == itemProject.getActiveFloor(), g(itemFloor, itemProject));
        Item[] children = item.getChildren();
        if (children != null) {
            for (Item item2 : children) {
                c(item2, itemProject, fVar, list);
            }
        }
    }

    private static Observable<n[]> d(final a aVar) {
        return com.planner5d.library.services.rx.a.c("load_task_" + aVar.f255783f, Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.widget.editor.editor3d.model.o
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                new p.b((Subscriber) obj, aVar).e();
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224933c).observeOn(com.planner5d.library.services.rx.c.f224934d));
    }

    public static Observable<n[]> e(Item[] itemArr, ve.b bVar, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, boolean z10) {
        return d(new a(itemArr, bVar, jVar, z10, false, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<com.planner5d.library.widget.editor.editor3d.model.builder.m> f(Item[] itemArr, ItemProject itemProject, dc.d<cc.a> dVar) {
        ArrayList arrayList = new ArrayList();
        com.planner5d.library.widget.editor.editor3d.model.builder.f fVar = new com.planner5d.library.widget.editor.editor3d.model.builder.f(dVar);
        for (Item item : itemArr) {
            c(item, itemProject, fVar, arrayList);
        }
        return arrayList;
    }

    private static float g(ItemFloor itemFloor, ItemProject itemProject) {
        float height = 0.0f;
        if (itemFloor != null) {
            for (ItemFloor itemFloor2 : itemProject.getFloorArray()) {
                if (itemFloor2 != null) {
                    if (itemFloor2 == itemFloor) {
                        break;
                    }
                    height += itemFloor2.getHeight();
                }
            }
        }
        return height;
    }

    public static void h(Item item, com.planner5d.library.widget.editor.editaction.h hVar, String str) {
        int i10 = 7 | 1;
        d(new a(new Item[]{item}, hVar.f254766d, hVar.f254765c, true, true, str)).subscribe((Subscriber<? super n[]>) new com.planner5d.library.services.rx.e());
    }

    public static void i(Item[] itemArr, ve.b bVar, com.planner5d.library.widget.editor.editor3d.scene3d.j jVar, boolean z10, String str) {
        d(new a(itemArr, bVar, jVar, z10, false, str)).subscribe((Subscriber<? super n[]>) new com.planner5d.library.services.rx.e());
    }
}
