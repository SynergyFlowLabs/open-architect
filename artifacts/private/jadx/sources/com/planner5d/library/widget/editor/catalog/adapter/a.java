package com.planner5d.library.widget.editor.catalog.adapter;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.catalog.CatalogItemMetadata;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.utility.r2;
import com.planner5d.library.widget.editor.helper.a2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class a extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f254359q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f254360r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f254361s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f254362t = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1723a[] f254363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f254364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.h f254365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2<Integer, com.planner5d.library.services.bitmaploader.target.a, Unit> f254366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2<CatalogItem, com.planner5d.library.services.bitmaploader.target.a, Unit> f254367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Long> f254368f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f254369g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Point f254370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f254371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<String> f254372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a2 f254373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f254374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f254375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f254376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Drawable f254377o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Drawable f254378p;

    public interface b {
        void a(C1723a c1723a, y3.c cVar, boolean z10);
    }

    public a(Context context, wc.a aVar, boolean z10, com.planner5d.library.services.bitmaploader.target.h hVar, a2 a2Var, b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f254372j = arrayList;
        this.f254376n = new Object();
        Drawable drawableA = com.planner5d.library.widget.drawable.c.f254258a.a(context, com.planner5d.library.f.h.f167761r9, null);
        this.f254377o = drawableA;
        this.f254378p = drawableA;
        this.f254363a = aVar.d();
        this.f254364b = bVar;
        this.f254366d = aVar.a();
        this.f254367e = aVar.c();
        this.f254365c = hVar;
        this.f254373k = a2Var;
        Collections.addAll(arrayList, aVar.f());
        this.f254374l = aVar.b();
        this.f254375m = z10;
        this.f254371i = aVar.e();
        this.f254370h = h(context);
        j();
    }

    private Point h(Context context) {
        CatalogItemMetadata catalogItemMetadata;
        String str;
        boolean z10 = false;
        for (C1723a c1723a : this.f254363a) {
            CatalogItem catalogItem = c1723a.f254380b;
            if (catalogItem != null && (catalogItemMetadata = catalogItem.metadata) != null && (str = catalogItemMetadata.title) != null && !str.isEmpty()) {
                z10 = true;
            }
        }
        r2 r2Var = r2.f229727a;
        return new Point((int) r2Var.a(context, 100.0f), (int) r2Var.a(context, z10 ? 176.0f : 100.0f));
    }

    private void j() {
        for (C1723a c1723a : this.f254363a) {
            if (c1723a.f254380b != null) {
                for (C1723a c1723a2 : this.f254363a) {
                    CatalogCategory catalogCategory = c1723a2.f254379a;
                    if (catalogCategory != null) {
                        this.f254368f.add(Long.valueOf(catalogCategory.getId()));
                    }
                }
                return;
            }
        }
        for (C1723a c1723a3 : this.f254363a) {
            CatalogCategory catalogCategory2 = c1723a3.f254379a;
            if (catalogCategory2 != null) {
                for (C1723a c1723a4 : this.f254363a) {
                    CatalogCategory catalogCategory3 = c1723a4.f254379a;
                    if (catalogCategory3 != null && catalogCategory3 != catalogCategory2 && catalogCategory3.getId() == catalogCategory2.getParentId()) {
                        this.f254368f.add(Long.valueOf(catalogCategory3.getId()));
                        break;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f254363a.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        C1723a c1723a = this.f254363a[i10];
        if (c1723a.f()) {
            return 2;
        }
        if (c1723a.f254382d) {
            return 3;
        }
        return c1723a.f254379a == null ? 0 : 1;
    }

    public int i(int i10) {
        if (getItemViewType(i10) != 0 && getItemViewType(i10) != 3) {
            return 3;
        }
        return 1;
    }

    void k(C1723a c1723a, Drawable drawable, boolean z10) {
        y3.c cVar;
        b bVar = this.f254364b;
        if (bVar != null && c1723a != null) {
            if (drawable == this.f254377o) {
                cVar = y3.c.locked_item;
            } else {
                cVar = drawable == this.f254378p ? y3.c.locked_item_gift : null;
            }
            bVar.a(c1723a, cVar, z10);
        }
    }

    @e.a({"NotifyDataSetChanged"})
    public void l(@NonNull String[] strArr, boolean z10) {
        synchronized (this.f254376n) {
            this.f254372j.clear();
            this.f254372j.addAll(Arrays.asList(strArr));
            this.f254371i = z10;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        C1723a c1723a = this.f254363a[i10];
        int i11 = 7 ^ 1;
        if (g0Var instanceof f) {
            ((f) g0Var).h(this.f254365c, this.f254366d, c1723a, this.f254374l || !this.f254368f.contains(Long.valueOf(c1723a.f254379a.getId())), this.f254374l);
            return;
        }
        if (!(g0Var instanceof i)) {
            if (g0Var instanceof j) {
                ((j) g0Var).g();
            }
        } else {
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                i12 += getItemViewType(i13) == 0 ? 1 : 0;
            }
            ((i) g0Var).q(this.f254365c, this.f254367e, c1723a, (i12 % 2 != 1 || i12 > 5) ? this.f254377o : this.f254378p);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 2) {
            return new k(viewGroup);
        }
        if (i10 == 1) {
            return new f(viewGroup, this);
        }
        if (this.f254369g == null) {
            this.f254369g = com.planner5d.library.widget.drawable.h.a(viewGroup.getContext(), com.planner5d.library.widget.drawable.h.b.Shimmer);
        }
        return i10 == 3 ? new j(viewGroup, this.f254370h) : new i(viewGroup, this, this.f254373k, this.f254369g, this.f254370h, this.f254371i, this.f254372j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@NonNull RecyclerView.g0 g0Var) {
        if (g0Var instanceof j) {
            ((j) g0Var).a();
        }
        super.onViewRecycled(g0Var);
    }

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.catalog.adapter.a$a, reason: collision with other inner class name */
    public static class C1723a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CatalogCategory f254379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CatalogItem f254380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f254381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f254382d;

        private C1723a(CatalogCategory catalogCategory) {
            this.f254379a = catalogCategory;
            this.f254380b = null;
            this.f254381c = e();
            this.f254382d = false;
        }

        public static C1723a c(Object obj) {
            if (obj instanceof CatalogCategory) {
                return new C1723a((CatalogCategory) obj);
            }
            return obj instanceof CatalogItem ? new C1723a((CatalogItem) obj) : new C1723a();
        }

        public static C1723a d() {
            return new C1723a(true);
        }

        private String e() {
            StringBuilder sb2 = new StringBuilder();
            CatalogCategory catalogCategory = this.f254379a;
            sb2.append(catalogCategory == null ? "" : catalogCategory.getPath());
            sb2.append(":");
            CatalogItem catalogItem = this.f254380b;
            sb2.append(catalogItem != null ? catalogItem.f180761id : "");
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f() {
            return this.f254380b == null && this.f254379a == null && !this.f254382d;
        }

        public boolean equals(@p0 Object obj) {
            return (obj instanceof C1723a) && this.f254381c.equals(((C1723a) obj).f254381c);
        }

        private C1723a(CatalogItem catalogItem) {
            this.f254380b = catalogItem;
            this.f254379a = null;
            this.f254381c = e();
            this.f254382d = false;
        }

        private C1723a(boolean z10) {
            this.f254379a = null;
            this.f254380b = null;
            this.f254381c = e();
            this.f254382d = z10;
        }

        private C1723a() {
            this((CatalogItem) null);
        }
    }
}
