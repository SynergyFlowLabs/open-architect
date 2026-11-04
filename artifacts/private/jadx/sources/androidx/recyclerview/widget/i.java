package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class i implements x.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f74263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f74264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<WeakReference<RecyclerView>> f74265c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IdentityHashMap<RecyclerView.g0, x> f74266d = new IdentityHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<x> f74267e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f74268f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final h.a.b f74269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0 f74270h;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        x f74271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f74273c;

        a() {
        }
    }

    i(h hVar, h.a aVar) {
        this.f74263a = hVar;
        if (aVar.f74248a) {
            this.f74264b = new m0.a();
        } else {
            this.f74264b = new m0.b();
        }
        h.a.b bVar = aVar.f74249b;
        this.f74269g = bVar;
        if (bVar == h.a.b.NO_STABLE_IDS) {
            this.f74270h = new h0.b();
        } else if (bVar == h.a.b.ISOLATED_STABLE_IDS) {
            this.f74270h = new h0.a();
        } else {
            if (bVar != h.a.b.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f74270h = new h0.c();
        }
    }

    private void I(a aVar) {
        aVar.f74273c = false;
        aVar.f74271a = null;
        aVar.f74272b = -1;
        this.f74268f = aVar;
    }

    private void j() {
        RecyclerView.h.a aVarL = l();
        if (aVarL != this.f74263a.getStateRestorationPolicy()) {
            this.f74263a.l(aVarL);
        }
    }

    private RecyclerView.h.a l() {
        for (x xVar : this.f74267e) {
            RecyclerView.h.a stateRestorationPolicy = xVar.f74600c.getStateRestorationPolicy();
            RecyclerView.h.a aVar = RecyclerView.h.a.PREVENT;
            if (stateRestorationPolicy == aVar || (stateRestorationPolicy == RecyclerView.h.a.PREVENT_WHEN_EMPTY && xVar.b() == 0)) {
                return aVar;
            }
        }
        return RecyclerView.h.a.ALLOW;
    }

    private int m(x xVar) {
        x next;
        Iterator<x> it = this.f74267e.iterator();
        int iB = 0;
        while (it.hasNext() && (next = it.next()) != xVar) {
            iB += next.b();
        }
        return iB;
    }

    @NonNull
    private a n(int i10) {
        a aVar = this.f74268f;
        if (aVar.f74273c) {
            aVar = new a();
        } else {
            aVar.f74273c = true;
        }
        int iB = i10;
        for (x xVar : this.f74267e) {
            if (xVar.b() > iB) {
                aVar.f74271a = xVar;
                aVar.f74272b = iB;
                break;
            }
            iB -= xVar.b();
        }
        if (aVar.f74271a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i10);
    }

    @p0
    private x o(RecyclerView.h<RecyclerView.g0> hVar) {
        int iY = y(hVar);
        if (iY == -1) {
            return null;
        }
        return this.f74267e.get(iY);
    }

    @NonNull
    private x w(RecyclerView.g0 g0Var) {
        x xVar = this.f74266d.get(g0Var);
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g0Var + ", seems like it is not bound by this adapter: " + this);
    }

    private int y(RecyclerView.h<RecyclerView.g0> hVar) {
        int size = this.f74267e.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f74267e.get(i10).f74600c == hVar) {
                return i10;
            }
        }
        return -1;
    }

    private boolean z(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.f74265c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void A(RecyclerView recyclerView) {
        if (!z(recyclerView)) {
            this.f74265c.add(new WeakReference<>(recyclerView));
            Iterator<x> it = this.f74267e.iterator();
            while (it.hasNext()) {
                it.next().f74600c.onAttachedToRecyclerView(recyclerView);
            }
        }
    }

    public void B(RecyclerView.g0 g0Var, int i10) {
        a aVarN = n(i10);
        this.f74266d.put(g0Var, aVarN.f74271a);
        aVarN.f74271a.e(g0Var, aVarN.f74272b);
        I(aVarN);
    }

    public RecyclerView.g0 C(ViewGroup viewGroup, int i10) {
        return this.f74264b.a(i10).f(viewGroup, i10);
    }

    public void D(RecyclerView recyclerView) {
        for (int size = this.f74265c.size() - 1; size >= 0; size--) {
            WeakReference<RecyclerView> weakReference = this.f74265c.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    this.f74265c.remove(size);
                    break;
                }
            } else {
                this.f74265c.remove(size);
            }
        }
        Iterator<x> it = this.f74267e.iterator();
        while (it.hasNext()) {
            it.next().f74600c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean E(RecyclerView.g0 g0Var) {
        x xVar = this.f74266d.get(g0Var);
        if (xVar != null) {
            boolean zOnFailedToRecycleView = xVar.f74600c.onFailedToRecycleView(g0Var);
            this.f74266d.remove(g0Var);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public void F(RecyclerView.g0 g0Var) {
        w(g0Var).f74600c.onViewAttachedToWindow(g0Var);
    }

    public void G(RecyclerView.g0 g0Var) {
        w(g0Var).f74600c.onViewDetachedFromWindow(g0Var);
    }

    public void H(RecyclerView.g0 g0Var) {
        x xVar = this.f74266d.get(g0Var);
        if (xVar != null) {
            xVar.f74600c.onViewRecycled(g0Var);
            this.f74266d.remove(g0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g0Var + ", seems like it is not bound by this adapter: " + this);
    }

    boolean J(RecyclerView.h<RecyclerView.g0> hVar) {
        int iY = y(hVar);
        if (iY == -1) {
            boolean z10 = true & false;
            return false;
        }
        x xVar = this.f74267e.get(iY);
        int iM = m(xVar);
        this.f74267e.remove(iY);
        this.f74263a.notifyItemRangeRemoved(iM, xVar.b());
        Iterator<WeakReference<RecyclerView>> it = this.f74265c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                hVar.onDetachedFromRecyclerView(recyclerView);
            }
        }
        xVar.a();
        j();
        return true;
    }

    @Override // androidx.recyclerview.widget.x.b
    public void a(@NonNull x xVar, int i10, int i11, @p0 Object obj) {
        this.f74263a.notifyItemRangeChanged(i10 + m(xVar), i11, obj);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void b(@NonNull x xVar, int i10, int i11) {
        int iM = m(xVar);
        this.f74263a.notifyItemMoved(i10 + iM, i11 + iM);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void c(x xVar) {
        j();
    }

    @Override // androidx.recyclerview.widget.x.b
    public void d(@NonNull x xVar, int i10, int i11) {
        this.f74263a.notifyItemRangeChanged(i10 + m(xVar), i11);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void e(@NonNull x xVar, int i10, int i11) {
        this.f74263a.notifyItemRangeRemoved(i10 + m(xVar), i11);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void f(@NonNull x xVar, int i10, int i11) {
        this.f74263a.notifyItemRangeInserted(i10 + m(xVar), i11);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void g(@NonNull x xVar) {
        this.f74263a.notifyDataSetChanged();
        j();
    }

    boolean h(int i10, RecyclerView.h<RecyclerView.g0> hVar) {
        if (i10 < 0 || i10 > this.f74267e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f74267e.size() + ". Given:" + i10);
        }
        if (x()) {
            androidx.core.util.t.b(hVar.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            hVar.hasStableIds();
        }
        if (o(hVar) != null) {
            return false;
        }
        x xVar = new x(hVar, this, this.f74264b, this.f74270h.a());
        this.f74267e.add(i10, xVar);
        Iterator<WeakReference<RecyclerView>> it = this.f74265c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                hVar.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (xVar.b() > 0) {
            this.f74263a.notifyItemRangeInserted(m(xVar), xVar.b());
        }
        j();
        return true;
    }

    boolean i(RecyclerView.h<RecyclerView.g0> hVar) {
        return h(this.f74267e.size(), hVar);
    }

    public boolean k() {
        Iterator<x> it = this.f74267e.iterator();
        while (it.hasNext()) {
            if (!it.next().f74600c.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    @p0
    public RecyclerView.h<? extends RecyclerView.g0> p(RecyclerView.g0 g0Var) {
        x xVar = this.f74266d.get(g0Var);
        if (xVar == null) {
            return null;
        }
        return xVar.f74600c;
    }

    public List<RecyclerView.h<? extends RecyclerView.g0>> q() {
        if (this.f74267e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.f74267e.size());
        Iterator<x> it = this.f74267e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f74600c);
        }
        return arrayList;
    }

    public long r(int i10) {
        a aVarN = n(i10);
        long jC = aVarN.f74271a.c(aVarN.f74272b);
        I(aVarN);
        return jC;
    }

    public int s(int i10) {
        a aVarN = n(i10);
        int iD = aVarN.f74271a.d(aVarN.f74272b);
        I(aVarN);
        return iD;
    }

    public int t(RecyclerView.h<? extends RecyclerView.g0> hVar, RecyclerView.g0 g0Var, int i10) {
        x xVar = this.f74266d.get(g0Var);
        if (xVar == null) {
            return -1;
        }
        int iM = i10 - m(xVar);
        int itemCount = xVar.f74600c.getItemCount();
        if (iM >= 0 && iM < itemCount) {
            return xVar.f74600c.findRelativeAdapterPositionIn(hVar, g0Var, iM);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iM + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + g0Var + "adapter:" + hVar);
    }

    public int u() {
        Iterator<x> it = this.f74267e.iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += it.next().b();
        }
        return iB;
    }

    public Pair<RecyclerView.h<? extends RecyclerView.g0>, Integer> v(int i10) {
        a aVarN = n(i10);
        Pair<RecyclerView.h<? extends RecyclerView.g0>, Integer> pair = new Pair<>(aVarN.f74271a.f74600c, Integer.valueOf(aVarN.f74272b));
        I(aVarN);
        return pair;
    }

    public boolean x() {
        return this.f74269g != h.a.b.NO_STABLE_IDS;
    }
}
