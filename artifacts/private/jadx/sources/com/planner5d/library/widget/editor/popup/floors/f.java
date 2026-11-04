package com.planner5d.library.widget.editor.popup.floors;

import android.util.Pair;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.dialog.titleedit.FloorEdit;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.statistics.events.o3;
import com.planner5d.library.services.l;
import com.planner5d.library.services.m0;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.editor.helper.g1;
import com.planner5d.library.widget.editor.helper.s2;
import com.planner5d.library.widget.t;

/* JADX INFO: loaded from: classes8.dex */
public class f extends com.planner5d.library.widget.popupview.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ij.a
    protected k f257215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f257216j;

    class a implements t.e {
        a() {
        }

        @Override // com.planner5d.library.widget.t.e
        public void a(int i10, int i11) {
            f.this.f257216j.j(i10, i11);
        }

        @Override // com.planner5d.library.widget.t.e
        public void b(Object obj, int i10, int i11) {
            f.this.f257216j.f(obj, i10, i11);
        }

        @Override // com.planner5d.library.widget.t.e
        public boolean c(Object obj) {
            return f.this.f257216j.c(obj);
        }
    }

    class b implements com.planner5d.library.widget.editor.popup.floors.view.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s2 f257218a;

        b(s2 s2Var) {
            this.f257218a = s2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(ItemFloor itemFloor, String str, s2 s2Var, Pair pair) {
            f.this.n(new l.d(itemFloor, (String) pair.second, l.d.a.Edit));
            Object obj = pair.second;
            if (obj == null || ((String) obj).equals(str)) {
                return;
            }
            s2Var.i(o3.e.rename);
        }

        @Override // com.planner5d.library.widget.editor.popup.floors.view.g.a
        public void a(ItemFloor itemFloor) {
            f.this.n(new l.d(itemFloor, null, l.d.a.Remove));
            this.f257218a.i(o3.e.remove);
        }

        @Override // com.planner5d.library.widget.editor.popup.floors.view.g.a
        public void b(ItemFloor itemFloor) {
            f.this.n(new l.d(itemFloor, null, l.d.a.Add));
            this.f257218a.i(o3.e.create);
        }

        @Override // com.planner5d.library.widget.editor.popup.floors.view.g.a
        public void c(final ItemFloor itemFloor) {
            final String str = itemFloor.title;
            k.a aVarK = f.this.f257215i.c(FloorEdit.class).k(itemFloor);
            final s2 s2Var = this.f257218a;
            aVarK.o(new u() { // from class: com.planner5d.library.widget.editor.popup.floors.g
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    this.f257220a.h(itemFloor, str, s2Var, (Pair) obj);
                }
            }).g();
        }

        @Override // com.planner5d.library.widget.editor.popup.floors.view.g.a
        public void d(ItemFloor itemFloor, int i10, int i11) {
            f.this.n(new l.d(itemFloor, null, l.d.a.PositionChange, Integer.valueOf(i10), Integer.valueOf(i11)));
            this.f257218a.i(o3.e.ordering);
        }

        @Override // com.planner5d.library.widget.editor.popup.floors.view.g.a
        public void e(ItemFloor itemFloor) {
            f.this.n(new l.d(itemFloor, null, l.d.a.Clone));
            this.f257218a.i(o3.e.duplicate);
        }

        @Override // com.planner5d.library.widget.editor.popup.floors.view.g.a
        public void f(ItemFloor itemFloor) {
            f.this.n(new l.d(itemFloor, null, l.d.a.SetActive));
            this.f257218a.i(o3.e.active);
        }
    }

    public f(s sVar, g1 g1Var, @NonNull ItemProject itemProject, boolean z10, s2 s2Var) {
        super(sVar);
        com.planner5d.library.application.b.r().k0(this);
        g(getResources().getString(com.planner5d.library.f.s.f169371qc), null);
        t tVar = new t(sVar);
        setContentView(tVar);
        tVar.setDivider(null);
        tVar.setBorderColor(androidx.core.content.d.g(getContext(), com.planner5d.library.f.C1549f.f166437ic));
        c cVar = new c(this.f257215i, z10);
        this.f257216j = cVar;
        tVar.setAdapter((ListAdapter) cVar);
        tVar.D(new a());
        cVar.i(itemProject, new b(s2Var));
        tVar.setStackFromBottom(true);
        v1.r(g1Var.Y, this, new d1() { // from class: com.planner5d.library.widget.editor.popup.floors.d
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f257213a.l((Boolean) obj);
            }
        });
        v1.r(m0.f224438k, this, new d1() { // from class: com.planner5d.library.widget.editor.popup.floors.e
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f257214a.m((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Integer num) {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(l.d dVar) {
        setVisibility(8);
        l.f224377c.o(dVar);
    }

    private void o() {
        setVisibility(0);
        this.f257216j.g();
    }
}
