package com.planner5d.library.widget.editor.editor3dcardboard;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.vr.sdk.base.GvrView;
import com.planner5d.library.activity.MainCardboard;
import com.planner5d.library.model.manager.statistics.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class p extends com.planner5d.library.widget.editor.editor3d.compatibility.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected b0 f256026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MainCardboard f256027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f256028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<GvrView> f256029f = new ArrayList();

    public p(MainCardboard mainCardboard, ViewGroup viewGroup) {
        com.planner5d.library.application.b.r().D1(this);
        this.f256026c.a(MainCardboard.class);
        this.f256027d = mainCardboard;
        this.f256028e = viewGroup;
    }

    public static /* synthetic */ void l(com.planner5d.library.engine.a aVar) {
        com.planner5d.library.engine.b bVarC = aVar.c();
        if (bVarC instanceof l) {
            ((l) bVarC).Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(GvrView gvrView) {
        if (this.f256029f.contains(gvrView)) {
            this.f256029f.remove(gvrView);
            gvrView.l();
        }
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    protected vb.a c() {
        p();
        GvrView gvrView = new GvrView(this.f256027d);
        this.f256029f.add(gvrView);
        return new l(this.f256027d, this.f256028e, gvrView).P0();
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    protected void e(vb.a aVar) {
        final GvrView gvrView = (GvrView) aVar.getView();
        gvrView.setOnGenericMotionListener(null);
        gvrView.setOnKeyListener(null);
        gvrView.setOnTouchListener(null);
        gvrView.post(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f256023a.n(gvrView);
            }
        });
    }

    @Override // com.planner5d.library.widget.editor.editor3d.compatibility.b
    protected Activity f() {
        return this.f256027d;
    }

    public void o() {
        final com.planner5d.library.engine.a aVarG = g();
        com.planner5d.library.engine.d.b(aVarG, new Runnable() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.o
            @Override // java.lang.Runnable
            public final void run() {
                p.l(aVarG);
            }
        });
    }

    public void p() {
        Iterator<GvrView> it = this.f256029f.iterator();
        while (it.hasNext()) {
            it.next().l();
            it.remove();
        }
    }
}
