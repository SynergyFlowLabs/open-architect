package com.badlogic.gdx.backends.android;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f89763a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89764b = 0;

    private void b(com.planner5d.library.engine.input.b bVar, int i10, int i11, int i12, int i13, long j10) {
        com.planner5d.library.engine.input.b.e eVarE = bVar.f160573b.e();
        eVarE.f160630a = j10;
        eVarE.f160632c = i11;
        eVarE.f160633d = i12;
        eVarE.f160631b = i10;
        eVarE.f160634e = i13;
        bVar.f160576e.add(eVarE);
    }

    public boolean a(MotionEvent motionEvent, com.planner5d.library.engine.input.b bVar) throws Throwable {
        com.planner5d.library.engine.input.b bVar2;
        if ((motionEvent.getSource() & 2) == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        long jNanoTime = System.nanoTime();
        synchronized (bVar) {
            try {
                if (action == 7) {
                    bVar2 = bVar;
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (x10 != this.f89763a || y10 != this.f89764b) {
                        b(bVar2, 4, x10, y10, 0, jNanoTime);
                        this.f89763a = x10;
                        this.f89764b = y10;
                    }
                } else if (action != 8) {
                    bVar2 = bVar;
                } else {
                    try {
                        bVar2 = bVar;
                        b(bVar2, 3, 0, 0, (int) (-Math.signum(motionEvent.getAxisValue(9))), jNanoTime);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                bVar2.Z.m().a();
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        throw th;
    }
}
