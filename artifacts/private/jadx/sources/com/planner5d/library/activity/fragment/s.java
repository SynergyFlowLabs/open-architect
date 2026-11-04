package com.planner5d.library.activity.fragment;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.Folder;
import com.planner5d.library.widget.d1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s<Item, Folder> extends RecyclerView.h<RecyclerView.g0> implements RecyclerView.y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f135175f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final int f135176g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f135177h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f135178i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f135179j = 11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f135180a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Item> f135181b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Folder> f135182c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f135183d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f135184e = false;

    class a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f135185e;

        a(GridLayoutManager gridLayoutManager) {
            this.f135185e = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            if (s.this.getItemViewType(i10) == 0) {
                return this.f135185e.H3() - (i10 % this.f135185e.H3());
            }
            if (s.this.f135184e && i10 == 0) {
                return this.f135185e.H3();
            }
            return 1;
        }
    }

    class b extends RecyclerView.g0 {
        b(View view) {
            super(view);
        }
    }

    private static class c<Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f135188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Model f135189b;

        private c(Model model, int i10) {
            this.f135188a = i10;
            this.f135189b = model;
        }
    }

    public s(RecyclerView.p pVar) {
        if (pVar instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) pVar;
            gridLayoutManager.R3(new a(gridLayoutManager));
        }
    }

    public static /* synthetic */ boolean i(com.planner5d.library.model.h hVar, Object obj) {
        com.planner5d.library.model.h hVarB;
        if (obj instanceof com.planner5d.library.model.h) {
            hVarB = (com.planner5d.library.model.h) obj;
        } else {
            hVarB = obj instanceof com.planner5d.library.model.k ? ((com.planner5d.library.model.k) obj).b() : null;
        }
        if (hVarB == null || !hVarB.f180740b.equals(hVar.f180740b)) {
            return false;
        }
        int i10 = 4 << 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Object obj) {
        final com.planner5d.library.model.h hVarB;
        if (obj instanceof com.planner5d.library.model.h) {
            hVarB = (com.planner5d.library.model.h) obj;
        } else {
            hVarB = obj instanceof com.planner5d.library.model.k ? ((com.planner5d.library.model.k) obj).b() : null;
        }
        if (hVarB == null || !this.f135181b.stream().anyMatch(new Predicate() { // from class: com.planner5d.library.activity.fragment.r
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return s.i(hVarB, obj2);
            }
        })) {
            this.f135181b.add(obj);
        }
    }

    @e.a({"NotifyDataSetChanged"})
    private void y() {
        this.f135180a.clear();
        t tVar = null;
        if (this.f135184e) {
            this.f135180a.add(new c(tVar, 3));
        }
        Iterator<Folder> it = this.f135182c.iterator();
        while (it.hasNext()) {
            this.f135180a.add(new c(it.next(), 11));
        }
        if (!this.f135182c.isEmpty()) {
            this.f135180a.add(new c(tVar, 0));
        }
        if (this.f135183d) {
            this.f135180a.add(new c(tVar, 2));
        }
        Iterator<Item> it2 = this.f135181b.iterator();
        while (it2.hasNext()) {
            this.f135180a.add(new c(it2.next(), 10));
        }
        notifyDataSetChanged();
    }

    protected void A(boolean z10) {
        this.f135183d = z10;
        y();
    }

    public void B(List<Folder> list) {
        this.f135182c.clear();
        this.f135182c.addAll(list);
        y();
    }

    public void C(List<Item> list) {
        this.f135181b.clear();
        k(list);
    }

    public void D(Item[] itemArr) {
        this.f135181b.clear();
        l(itemArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f135180a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f135180a.get(i10).f135188a;
    }

    public void k(List<Item> list) {
        list.forEach(new Consumer() { // from class: com.planner5d.library.activity.fragment.q
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f135173a.w(obj);
            }
        });
        y();
    }

    public void l(Item[] itemArr) {
        k(Arrays.asList(itemArr));
    }

    protected abstract void m(View view, Folder folder);

    protected abstract void n(View view);

    protected abstract void o(View view, Item item);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        c cVar = this.f135180a.get(i10);
        if (cVar.f135188a == g0Var.getItemViewType()) {
            int i11 = cVar.f135188a;
            if (i11 == 3) {
                n(g0Var.itemView);
            } else if (i11 == 10) {
                o(g0Var.itemView, cVar.f135189b);
            } else {
                if (i11 != 11) {
                    return;
                }
                m(g0Var.itemView, cVar.f135189b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewS;
        if (i10 == 3) {
            viewS = q(viewGroup);
        } else if (i10 == 11) {
            viewS = r(viewGroup);
        } else {
            viewS = i10 == 10 ? s(viewGroup) : t(viewGroup, i10);
        }
        if (viewS == null) {
            return null;
        }
        return new b(viewS);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.g0 g0Var) {
        super.onViewRecycled(g0Var);
        KeyEvent.Callback callback = g0Var.itemView;
        if (callback instanceof d1) {
            ((d1) callback).a();
        }
    }

    protected boolean p() {
        for (Folder folder : v()) {
            if ((folder instanceof Folder) && !Folder.y(((Folder) folder).type)) {
                return true;
            }
        }
        return false;
    }

    protected abstract View q(ViewGroup viewGroup);

    protected abstract View r(ViewGroup viewGroup);

    protected abstract View s(ViewGroup viewGroup);

    protected View t(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new View(viewGroup.getContext());
        }
        return null;
    }

    public List<Item> u() {
        return this.f135181b;
    }

    protected List<Folder> v() {
        return this.f135182c;
    }

    public void x(int i10, Item item) {
        if (i10 >= 0 && i10 < this.f135181b.size()) {
            this.f135181b.set(i10, item);
            y();
        }
    }

    protected void z(boolean z10) {
        this.f135184e = z10;
        y();
    }
}
