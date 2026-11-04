package com.planner5d.library.activity.fragment.gallery;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.planner5d.library.model.manager.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class j0 extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f133769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.h f133770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.planner5d.library.model.h> f133771c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImageView.ScaleType f133772d = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f133773e;

    j0(y0 y0Var, com.planner5d.library.services.bitmaploader.target.h hVar, boolean z10) {
        this.f133769a = y0Var;
        this.f133770b = hVar;
        this.f133773e = z10;
    }

    private com.planner5d.library.widget.z d(ViewGroup viewGroup, Object obj) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof com.planner5d.library.widget.z) && isViewFromObject(childAt, obj)) {
                return (com.planner5d.library.widget.z) childAt;
            }
        }
        return null;
    }

    public void a(com.planner5d.library.model.h[] hVarArr) {
        Collections.addAll(this.f133771c, hVarArr);
        notifyDataSetChanged();
    }

    public com.planner5d.library.model.h b(int i10) {
        if (i10 < this.f133771c.size()) {
            return this.f133771c.get(i10);
        }
        return null;
    }

    public com.planner5d.library.model.h c(com.planner5d.library.model.h hVar) {
        com.planner5d.library.model.h next;
        String str;
        Iterator<com.planner5d.library.model.h> it = this.f133771c.iterator();
        com.planner5d.library.model.h hVar2 = null;
        while (it.hasNext() && ((str = (next = it.next()).f180740b) == null || !str.equals(hVar.f180740b))) {
            hVar2 = next;
        }
        return hVar2;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        com.planner5d.library.widget.z zVarD = d(viewGroup, obj);
        if (zVarD != null) {
            zVarD.a();
            viewGroup.removeView(zVarD);
        }
    }

    public void e(ViewGroup viewGroup, int i10) {
        com.planner5d.library.model.h hVarB = b(i10);
        com.planner5d.library.widget.z zVarD = d(viewGroup, hVarB);
        if (zVarD != null) {
            zVarD.setModel(hVarB);
            zVarD.setScaleType(this.f133772d);
        }
    }

    public void f(com.planner5d.library.model.h hVar) {
        String str;
        for (int i10 = 0; i10 < this.f133771c.size(); i10++) {
            com.planner5d.library.model.h hVar2 = this.f133771c.get(i10);
            if (hVar2 != null && (str = hVar2.f180740b) != null && str.equals(hVar.f180740b)) {
                this.f133771c.set(i10, hVar);
                notifyDataSetChanged();
                return;
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f133771c.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        com.planner5d.library.widget.z zVar = new com.planner5d.library.widget.z(viewGroup.getContext(), this.f133770b, this.f133769a, this.f133773e);
        viewGroup.addView(zVar);
        com.planner5d.library.model.h hVarB = b(i10);
        zVar.setModel(hVarB);
        zVar.setTag(hVarB);
        zVar.setScaleType(this.f133772d);
        return hVarB;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag() == obj;
    }
}
