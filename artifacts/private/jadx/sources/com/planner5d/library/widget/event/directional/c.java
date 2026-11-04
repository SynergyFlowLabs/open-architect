package com.planner5d.library.widget.event.directional;

import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.f0;

/* JADX INFO: loaded from: classes8.dex */
class c extends a {
    c(i iVar) {
        super(iVar);
    }

    private static float g(MotionEvent motionEvent, InputDevice inputDevice, int i10) {
        InputDevice.MotionRange motionRange;
        if (inputDevice == null || motionEvent == null || (motionRange = inputDevice.getMotionRange(i10, motionEvent.getSource())) == null) {
            return 0.0f;
        }
        float axisValue = motionEvent.getAxisValue(i10);
        if (Math.abs(axisValue) > motionRange.getFlat()) {
            return axisValue;
        }
        return 0.0f;
    }

    private void h(MotionEvent motionEvent, InputDevice inputDevice, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        float fG = g(motionEvent, inputDevice, 0);
        kVar.f180480a = fG;
        if (fG == 0.0f) {
            kVar.f180480a = g(motionEvent, inputDevice, 15);
        }
        kVar2.f180480a = g(motionEvent, inputDevice, 11);
        float fG2 = g(motionEvent, inputDevice, 1);
        kVar.f180481b = fG2;
        if (fG2 == 0.0f) {
            kVar.f180481b = g(motionEvent, inputDevice, 16);
        }
        kVar2.f180481b = g(motionEvent, inputDevice, 14);
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
        if (!d(motionEvent, f0.f48716s) || motionEvent.getAction() != 2) {
            return false;
        }
        h(motionEvent, motionEvent.getDevice(), kVar, kVar2);
        return true;
    }
}
