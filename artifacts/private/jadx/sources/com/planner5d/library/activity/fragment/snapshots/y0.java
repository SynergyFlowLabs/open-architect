package com.planner5d.library.activity.fragment.snapshots;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.widget.m1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class y0 extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b4 f136104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.h f136105b = new com.planner5d.library.services.bitmaploader.target.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<gd.b> f136106c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f136107d = false;

    private static class a extends Pair<gd.b, Integer> {
        private a(gd.b bVar, Integer num) {
            super(bVar, num);
        }
    }

    @ij.a
    public y0(b4 b4Var) {
        this.f136104a = b4Var;
    }

    private List<m1> c(ViewGroup viewGroup) {
        LinkedList linkedList = new LinkedList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getTag() != null && (childAt.getTag() instanceof a)) {
                linkedList.add((m1) childAt);
            }
        }
        return linkedList;
    }

    private void f(m1 m1Var, gd.b bVar) {
        if (this.f136107d) {
            return;
        }
        m1Var.i(bVar, this.f136104a, this.f136105b);
    }

    private void g(ViewGroup viewGroup) {
        for (m1 m1Var : c(viewGroup)) {
            gd.b bVar = (gd.b) ((Pair) ((a) m1Var.getTag())).first;
            for (gd.b bVar2 : this.f136106c) {
                if (bVar2 != null && bVar2.getId().equals(bVar.getId())) {
                    f(m1Var, bVar);
                    break;
                }
            }
        }
    }

    public void a() {
        this.f136105b.a();
        int i10 = 4 >> 1;
        this.f136107d = true;
    }

    gd.b b(int i10) {
        if (i10 < this.f136106c.size()) {
            return this.f136106c.get(i10);
        }
        return null;
    }

    public void d(gd.b bVar) {
        this.f136106c.remove(bVar);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i10, @NonNull Object obj) {
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getTag() == obj) {
                if ((childAt instanceof com.planner5d.library.widget.d1) && !this.f136107d) {
                    ((com.planner5d.library.widget.d1) childAt).a();
                }
                viewGroup.removeView(childAt);
            }
        }
    }

    void e(List<? extends gd.b> list, ViewGroup viewGroup) {
        this.f136106c.clear();
        this.f136106c.addAll(list);
        g(viewGroup);
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f136106c.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(Object obj) {
        a aVar = (a) obj;
        if (!this.f136106c.contains(((Pair) aVar).first) || this.f136106c.size() <= ((Integer) ((Pair) aVar).second).intValue() || this.f136106c.get(((Integer) ((Pair) aVar).second).intValue()) != ((Pair) aVar).first) {
            return -2;
        }
        int i10 = 0 & (-1);
        return -1;
    }

    @Override // androidx.viewpager.widget.a
    @NotNull
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        m1 m1Var = new m1(viewGroup.getContext());
        viewGroup.addView(m1Var);
        a aVar = new a(this.f136106c.get(i10), Integer.valueOf(i10));
        f(m1Var, (gd.b) ((Pair) aVar).first);
        m1Var.setTag(aVar);
        return aVar;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, @NonNull Object obj) {
        return view.getTag() == obj;
    }
}
