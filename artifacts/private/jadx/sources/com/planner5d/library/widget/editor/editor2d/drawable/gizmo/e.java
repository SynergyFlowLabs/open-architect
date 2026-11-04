package com.planner5d.library.widget.editor.editor2d.drawable.gizmo;

import android.graphics.Path;
import android.graphics.RectF;
import com.planner5d.library.math.k;

/* JADX INFO: loaded from: classes12.dex */
abstract class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f254920f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f254921g = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.planner5d.library.widget.editor.editor2d.painter.d.c f254924c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Path f254922a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final RectF f254923b = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f254925d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f254926e = -1;

    e(com.planner5d.library.widget.editor.editor2d.painter.d.c cVar) {
        this.f254924c = cVar;
    }

    protected abstract void a(com.planner5d.library.widget.editor.editor2d.drawable.d dVar, boolean z10);

    boolean b() {
        return this.f254925d;
    }

    void c(boolean z10) {
        this.f254925d = z10;
    }

    e d(h hVar, k kVar) {
        if (this.f254926e != hVar.b()) {
            this.f254926e = hVar.b();
            e(hVar, kVar);
        }
        return this;
    }

    protected abstract void e(h hVar, k kVar);
}
