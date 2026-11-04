package com.planner5d.library.activity.fragment.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.widget.EnhancedRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public class l extends com.planner5d.library.activity.fragment.s<com.planner5d.library.model.k, com.planner5d.library.model.x> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b4.c f133795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final y0 f133796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.h f133797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.planner5d.library.model.manager.q0.d f133798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f133799o;

    public interface a {
        @androidx.annotation.p0
        String getCategoryTitle();

        @androidx.annotation.p0
        String getSortOrderTitle();

        void onCategorySelectorClick();

        void onGalleryItemClick(@NonNull com.planner5d.library.model.h hVar, b4.c cVar);

        void onGalleryItemFavoriteClick(@NonNull com.planner5d.library.model.k kVar);

        void onSortOrderSelectorClick();
    }

    l(EnhancedRecyclerView enhancedRecyclerView, y0 y0Var, com.planner5d.library.services.bitmaploader.target.h hVar, @NonNull com.planner5d.library.model.manager.q0.d dVar, @NonNull a aVar, boolean z10, b4.c cVar) {
        super(enhancedRecyclerView.getLayoutManager());
        this.f133796l = y0Var;
        this.f133797m = hVar;
        this.f133798n = dVar;
        this.f133799o = aVar;
        this.f133795k = cVar;
        z(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(View view) {
        this.f133799o.onCategorySelectorClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(View view) {
        this.f133799o.onSortOrderSelectorClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(com.planner5d.library.widget.listitem.c cVar, View view) {
        Object tag = cVar.getTag();
        if (tag instanceof com.planner5d.library.model.k) {
            this.f133799o.onGalleryItemFavoriteClick((com.planner5d.library.model.k) tag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(com.planner5d.library.widget.listitem.c cVar, View view) {
        Object tag = cVar.getTag();
        if (tag instanceof com.planner5d.library.model.k) {
            this.f133799o.onGalleryItemClick(((com.planner5d.library.model.k) tag).b(), this.f133795k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.s
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m(View view, com.planner5d.library.model.x xVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.s
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void o(View view, com.planner5d.library.model.k kVar) {
        ((com.planner5d.library.widget.listitem.c) view).setModel(kVar);
        view.setTag(kVar);
    }

    com.planner5d.library.model.manager.q0.d K() {
        return this.f133798n;
    }

    void P(@NonNull com.planner5d.library.model.manager.q0.d dVar) {
        this.f133798n = dVar;
    }

    void Q(com.planner5d.library.model.k kVar) {
        String str;
        if (kVar == null) {
            return;
        }
        for (int i10 = 0; i10 < u().size(); i10++) {
            com.planner5d.library.model.k kVar2 = u().get(i10);
            if (kVar2 != null && (str = kVar2.b().f180740b) != null && str.equals(kVar.b().f180740b)) {
                x(i10, kVar);
                return;
            }
        }
    }

    @Override // com.planner5d.library.activity.fragment.s
    protected void n(View view) {
        ((com.planner5d.library.widget.listitem.a) view).a(this.f133799o.getCategoryTitle(), this.f133799o.getSortOrderTitle());
    }

    @Override // com.planner5d.library.activity.fragment.s
    protected View q(ViewGroup viewGroup) {
        com.planner5d.library.widget.listitem.a aVar = new com.planner5d.library.widget.listitem.a(viewGroup.getContext());
        aVar.setOnCategoryClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133768a.L(view);
            }
        });
        aVar.setOnSortingClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133774a.M(view);
            }
        });
        return aVar;
    }

    @Override // com.planner5d.library.activity.fragment.s
    protected View r(ViewGroup viewGroup) {
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.s
    protected View s(ViewGroup viewGroup) {
        final com.planner5d.library.widget.listitem.c cVar = new com.planner5d.library.widget.listitem.c(viewGroup.getContext(), this.f133797m, this.f133796l);
        cVar.setFavoriteOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133761a.N(cVar, view);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.gallery.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133765a.O(cVar, view);
            }
        };
        cVar.setOnClickListener(onClickListener);
        cVar.getImageWrapperView().setOnClickListener(onClickListener);
        return cVar;
    }
}
