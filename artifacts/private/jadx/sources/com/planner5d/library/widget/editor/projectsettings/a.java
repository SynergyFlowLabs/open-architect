package com.planner5d.library.widget.editor.projectsettings;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.utility.r2;
import com.planner5d.library.widget.EnhancedRecyclerView;
import rx.Observable;

/* JADX INFO: loaded from: classes8.dex */
public class a extends RecyclerView {
    private final GridLayoutManager Y4;
    private d Z4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    private final int f258094a5;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    private final int f258095b5;

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.projectsettings.a$a, reason: collision with other inner class name */
    class C1744a extends RecyclerView.o {
        C1744a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            rect.bottom = a.this.f258094a5;
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public Observable<ItemMaterial> e2() {
        d dVar = this.Z4;
        return dVar == null ? Observable.empty() : dVar.j();
    }

    public Observable<Void> f2() {
        d dVar = this.Z4;
        return dVar == null ? Observable.empty() : dVar.k();
    }

    public a g2(h hVar) {
        d dVar = new d(hVar);
        this.Z4 = dVar;
        setAdapter(dVar);
        return this;
    }

    public ItemMaterial getSelected() {
        return this.Z4.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iG2 = EnhancedRecyclerView.g2(this.f258095b5, this.f258094a5, View.MeasureSpec.getSize(i10));
        if (iG2 != this.Y4.H3()) {
            this.Y4.Q3(iG2);
            requestLayout();
        }
    }

    public void setSelected(ItemMaterial itemMaterial) {
        this.Z4.p(itemMaterial);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Z4 = null;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 1);
        this.Y4 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        this.f258094a5 = context.getResources().getDimensionPixelSize(com.planner5d.library.f.g.Th);
        this.f258095b5 = (int) r2.f229727a.a(context, 54.0f);
        n(new C1744a());
    }
}
