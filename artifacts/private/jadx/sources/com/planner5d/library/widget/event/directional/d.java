package com.planner5d.library.widget.event.directional;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes8.dex */
class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f258160d;

    d(i iVar) {
        super(iVar);
        this.f258160d = new l(this);
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean a(int i10, int i11, int i12, int i13, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        kVar.U(1.0f, 0.0f).M().N(i10).R(i11 / 100.0f).S(1.0f, -1.0f);
        kVar2.U(1.0f, 0.0f).M().N(i12).R(i13 / 100.0f).S(1.0f, -1.0f);
        return true;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean b(int i10, KeyEvent keyEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean c(MotionEvent motionEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }

    l g() {
        return this.f258160d;
    }
}
