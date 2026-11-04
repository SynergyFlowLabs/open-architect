package com.planner5d.library.widget.event.directional;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.f0;

/* JADX INFO: loaded from: classes8.dex */
class b extends a {
    b(i iVar) {
        super(iVar);
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean a(int i10, int i11, int i12, int i13, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean b(int i10, KeyEvent keyEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean c(MotionEvent motionEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        if (!d(motionEvent, f0.f48707j)) {
            return false;
        }
        kVar.U(motionEvent.getAxisValue(15), motionEvent.getAxisValue(16));
        return true;
    }
}
