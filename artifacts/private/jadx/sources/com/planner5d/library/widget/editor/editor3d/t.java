package com.planner5d.library.widget.editor.editor3d;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.planner5d.library.activity.fragment.projects.Project3D;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class t extends com.planner5d.library.widget.editor.editor3d.compatibility.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected ij.c<q> f255891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f255892d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bundle f255893e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Project3D f255894f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f255895g = false;

    @ij.a
    public t() {
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    protected vb.a c() {
        q qVarR = this.f255891c.get().r(this.f255894f, this.f255893e);
        this.f255892d = qVarR;
        return qVarR.g();
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    protected void e(vb.a aVar) {
        final q qVar = this.f255892d;
        this.f255892d = null;
        if (qVar != null) {
            com.planner5d.library.services.rx.i.h(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3d.s
                @Override // java.lang.Runnable
                public final void run() {
                    qVar.q().subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
                }
            }).subscribeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
        }
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    protected Activity f() {
        Project3D project3D = this.f255894f;
        if (project3D == null) {
            return null;
        }
        return project3D.getActivity();
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    public void h(Configuration configuration) {
        super.h(configuration);
        q qVar = this.f255892d;
        if (qVar != null) {
            qVar.m(configuration);
        }
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    public void i() {
        super.i();
        q qVar = this.f255892d;
        if (qVar != null) {
            qVar.n();
        }
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    public void j() {
        if (this.f255895g) {
            return;
        }
        super.j();
        q qVar = this.f255892d;
        if (qVar != null) {
            qVar.o();
        }
    }

    public com.planner5d.library.widget.menu.l m(Menu menu, MenuInflater menuInflater) {
        q qVar = this.f255892d;
        if (qVar == null) {
            return null;
        }
        return qVar.f(menu, menuInflater);
    }

    public boolean n() {
        q qVar = this.f255892d;
        return qVar == null || qVar.i();
    }

    public boolean o() {
        q qVar = this.f255892d;
        return qVar != null && qVar.l();
    }

    public void p(Bundle bundle) {
        q qVar = this.f255892d;
        if (qVar != null) {
            qVar.p(bundle);
        }
    }

    public Observable<Void> q() {
        this.f255895g = true;
        q qVar = this.f255892d;
        return qVar == null ? Observable.just(null) : qVar.q();
    }

    public void r(Project3D project3D, Bundle bundle) {
        this.f255894f = project3D;
        s(bundle);
    }

    public void s(Bundle bundle) {
        this.f255893e = bundle;
    }
}
