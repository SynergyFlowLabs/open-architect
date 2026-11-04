package com.planner5d.library.widget.editor.popup;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.fragment.app.s;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.s2;
import com.planner5d.library.widget.m;
import ef.g;

/* JADX INFO: loaded from: classes8.dex */
@ij.f
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f257201a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f257202b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f257203c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        View factory();
    }

    @ij.a
    public e() {
    }

    public static /* synthetic */ View b() {
        return null;
    }

    private void e(final Activity activity, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        this.f257201a = i(viewGroup, new m.a() { // from class: com.planner5d.library.widget.editor.popup.b
            @Override // com.planner5d.library.widget.m.a
            public final void a() {
                activity.invalidateOptionsMenu();
            }
        });
    }

    private boolean g(View view, m mVar) {
        if (view != null && mVar != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                return true;
            }
            try {
                viewGroup.removeView(view);
                mVar.c(false);
                this.f257201a = null;
                this.f257202b = null;
            } catch (IndexOutOfBoundsException | NullPointerException unused) {
                return true;
            }
        }
        return false;
    }

    private m i(ViewGroup viewGroup, m.a aVar) {
        View viewFindViewById = viewGroup.findViewById(com.planner5d.library.f.j.Lg);
        int i10 = 0;
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            if (viewGroup.getChildAt(i11) == viewFindViewById) {
                i10 = i11;
                break;
            }
        }
        return new m(viewGroup, i10, aVar).c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(s sVar, View view) {
        h();
        sVar.invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Activity activity, View view) {
        h();
        activity.invalidateOptionsMenu();
    }

    private int l(final Activity activity, int i10, Integer num, boolean z10, a aVar) {
        int i11 = -1;
        if (!g(this.f257202b, this.f257201a) && activity != null) {
            ViewGroup viewGroup = (ConstraintLayout) activity.findViewById(com.planner5d.library.f.j.Ig);
            if (viewGroup != null) {
                View viewFactory = aVar.factory();
                this.f257202b = viewFactory;
                if (viewFactory != null) {
                    ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
                    u1.j2(viewFactory, new g());
                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i10;
                    if (z10) {
                        bVar.f45687h = 0;
                    } else {
                        bVar.f45681e = 0;
                    }
                    bVar.f45689i = 0;
                    if (num != null) {
                        ((ViewGroup.MarginLayoutParams) bVar).topMargin = num.intValue();
                    }
                    e(activity, viewGroup);
                    View viewFindViewById = viewGroup.findViewById(com.planner5d.library.f.j.Lg);
                    if (viewFindViewById != null) {
                        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                            if (viewFindViewById == viewGroup.getChildAt(i12)) {
                                i11 = i12;
                                break;
                            }
                        }
                    }
                    viewGroup.addView(viewFactory, i11, bVar);
                    if (viewFactory instanceof com.planner5d.library.widget.popupview.b) {
                        ((com.planner5d.library.widget.popupview.b) viewFactory).setOnCloseClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f257196a.k(activity, view);
                            }
                        });
                    }
                    int i13 = this.f257203c;
                    this.f257203c = i13 + 1;
                    return i13;
                }
            }
            return -1;
        }
        return -1;
    }

    public void f(final s sVar, g1 g1Var, View view, ItemProject itemProject, boolean z10, s2 s2Var) {
        if (g(this.f257202b, this.f257201a)) {
            return;
        }
        e(sVar, (ViewGroup) sVar.findViewById(com.planner5d.library.f.j.J7));
        com.planner5d.library.widget.editor.popup.floors.f fVar = new com.planner5d.library.widget.editor.popup.floors.f(sVar, g1Var, itemProject, z10, s2Var);
        fVar.setOnCloseClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f257199a.j(sVar, view2);
            }
        });
        ((ViewGroup) view).addView(fVar);
        this.f257202b = fVar;
    }

    public void h() {
        l(null, 0, null, true, new a() { // from class: com.planner5d.library.widget.editor.popup.d
            @Override // com.planner5d.library.widget.editor.popup.e.a
            public final View factory() {
                return e.b();
            }
        });
    }
}
