package com.planner5d.library.widget.editor.editor3d;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.planner5d.library.activity.fragment.projects.Project3D;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.services.m0;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.editor.facade.e0;
import com.planner5d.library.widget.editor.helper.a2;
import com.planner5d.library.widget.editor.helper.g1;
import java.lang.ref.WeakReference;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes12.dex */
public class q implements g1.j, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f255805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g1 f255806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f255807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2 f255808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q0 f255809e = new com.planner5d.library.activity.helper.ui.c(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f255810f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<Project3D> f255811g = new WeakReference<>(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewGroup f255812h = null;

    public static class a extends Exception {
    }

    @ij.a
    public q(l lVar, g1 g1Var, a2 a2Var) {
        this.f255805a = lVar;
        this.f255806b = g1Var;
        this.f255807c = g1Var;
        this.f255808d = a2Var;
    }

    public static /* synthetic */ Void a(com.planner5d.library.widget.editor.a.b bVar) {
        return null;
    }

    private boolean e(Bundle bundle) {
        return new com.planner5d.library.services.utility.j(new com.planner5d.library.services.utility.j(bundle).h(com.planner5d.library.services.r.editor, null)).h(com.planner5d.library.services.r.editorState, null) != null;
    }

    private View h() {
        Project3D project3D = this.f255811g.get();
        if (project3D == null) {
            return null;
        }
        return project3D.getView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable j(com.planner5d.library.widget.editor.editor3d.scene3d.j jVar) {
        if (h() == null) {
            return Observable.error(new a());
        }
        if (this.f255810f) {
            this.f255810f = false;
            this.f255805a.x0(this.f255806b.E1());
        }
        return this.f255807c.m().last().map(new Func1() { // from class: com.planner5d.library.widget.editor.editor3d.o
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return q.a((com.planner5d.library.widget.editor.a.b) obj);
            }
        }).doOnCompleted(new Action0() { // from class: com.planner5d.library.widget.editor.editor3d.p
            @Override // rx.functions.Action0
            public final void call() {
                com.planner5d.library.services.l.f224379e.o(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Integer num) {
        this.f255805a.c0();
    }

    public com.planner5d.library.widget.menu.l f(Menu menu, MenuInflater menuInflater) {
        return this.f255806b.k1(menu, menuInflater);
    }

    vb.a g() {
        return this.f255805a.P0();
    }

    @Override // androidx.lifecycle.o0
    @NonNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.f255809e;
    }

    public boolean i() {
        return this.f255806b.S1();
    }

    public boolean l() {
        g1 g1Var = this.f255806b;
        return g1Var != null && g1Var.y2();
    }

    @Override // com.planner5d.library.widget.editor.helper.g1.j
    public Observable<Void> loadedProject(Project project, ItemProject itemProject, Bundle bundle) {
        return this.f255805a.B0().flatMap(new Func1() { // from class: com.planner5d.library.widget.editor.editor3d.m
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.f255616a.j((com.planner5d.library.widget.editor.editor3d.scene3d.j) obj);
            }
        });
    }

    public void m(@NonNull Configuration configuration) {
        this.f255806b.z2(configuration);
    }

    public void n() {
        this.f255809e.v(androidx.lifecycle.c0.b.STARTED);
        this.f255806b.H2();
    }

    public void o() {
        this.f255809e.v(androidx.lifecycle.c0.b.RESUMED);
        this.f255806b.O2();
    }

    public void p(Bundle bundle) {
        this.f255806b.D2(bundle);
    }

    public Observable<Void> q() {
        this.f255809e.v(androidx.lifecycle.c0.b.DESTROYED);
        ViewGroup viewGroup = this.f255812h;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return this.f255806b.j3();
    }

    public q r(Project3D project3D, Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) project3D.getView();
        if (viewGroup == null) {
            throw new RuntimeException("Fragment view not created");
        }
        if (this.f255805a.P0() != null) {
            throw new RuntimeException("Application already created");
        }
        viewGroup.removeAllViews();
        this.f255811g = new WeakReference<>(project3D);
        this.f255809e.v(androidx.lifecycle.c0.b.RESUMED);
        v1.r(m0.f224437j, this, new d1() { // from class: com.planner5d.library.widget.editor.editor3d.n
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f255804a.k((Integer) obj);
            }
        });
        if (bundle != null) {
            this.f255806b.C2(bundle);
            this.f255810f = !e(bundle);
        }
        vb.a aVarX = this.f255805a.X(project3D.getActivity());
        ((vb.d) aVarX.h()).K(this.f255806b);
        View viewInflate = LayoutInflater.from(project3D.getActivity()).inflate(com.planner5d.library.f.m.f168739k2, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(com.planner5d.library.f.j.f168063fb);
        this.f255812h = viewGroup2;
        viewGroup2.addView(aVarX.getView());
        viewGroup.addView(viewInflate);
        this.f255806b.b3(viewInflate, true);
        this.f255805a.setHelper(this.f255806b);
        l lVar = this.f255805a;
        com.planner5d.library.widget.editor.facade.g gVarP1 = this.f255806b.p1();
        g1 g1Var = this.f255806b;
        lVar.setListeners(new com.planner5d.library.widget.editor.facade.u(gVarP1, g1Var, null, g1Var, null));
        Bundle arguments = project3D.getArguments();
        this.f255806b.Q2(this.f255805a, arguments);
        if (e(arguments)) {
            this.f255810f = false;
        }
        viewInflate.setOnDragListener(this.f255808d.c(this.f255806b));
        this.f255805a.y0(this.f255806b.U2(project3D, bundle, arguments, this));
        return this;
    }
}
