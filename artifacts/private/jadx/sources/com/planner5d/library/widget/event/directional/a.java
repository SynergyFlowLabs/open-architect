package com.planner5d.library.widget.event.directional;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
abstract class a implements View.OnGenericMotionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.math.k f258157a = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.math.k f258158b = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f258159c;

    a(i iVar) {
        this.f258159c = iVar;
    }

    private boolean e() {
        i iVar = this.f258159c;
        if (iVar != null) {
            iVar.q(this.f258157a, this.f258158b);
        }
        return true;
    }

    protected abstract boolean a(int i10, int i11, int i12, int i13, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2);

    protected abstract boolean b(int i10, KeyEvent keyEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2);

    protected abstract boolean c(MotionEvent motionEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2);

    boolean d(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    public boolean f(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, i13, this.f258157a.a0(), this.f258158b.a0()) && e();
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        return c(motionEvent, this.f258157a.a0(), this.f258158b.a0()) && e();
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return b(i10, keyEvent, this.f258157a.a0(), this.f258158b.a0()) && e();
    }
}
