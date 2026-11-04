package com.planner5d.library.engine.input;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.view.s0;

/* JADX INFO: loaded from: classes5.dex */
public class c implements d {
    private void c(b bVar, int i10, int i11, int i12, int i13, int i14, long j10) {
        b.e eVarE = bVar.f160573b.e();
        eVarE.f160630a = j10;
        eVarE.f160636g = i13;
        eVarE.f160632c = i11;
        eVarE.f160633d = i12;
        eVarE.f160631b = i10;
        eVarE.f160635f = i14;
        bVar.f160576e.add(eVarE);
    }

    private int d(int i10) {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        return i10 == 16 ? 4 : -1;
    }

    @Override // com.planner5d.library.engine.input.d
    public boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.planner5d.library.engine.input.d
    public void b(MotionEvent motionEvent, b bVar) throws Throwable {
        int i10;
        int i11;
        b bVar2 = bVar;
        int action = motionEvent.getAction() & 255;
        int action2 = (motionEvent.getAction() & s0.f48920f) >> 8;
        int pointerId = motionEvent.getPointerId(action2);
        long jNanoTime = System.nanoTime();
        synchronized (bVar) {
            try {
                switch (action) {
                    case 0:
                    case 5:
                        int iC = bVar2.c();
                        if (iC < 20) {
                            bVar2.f160588l[iC] = pointerId;
                            int x10 = (int) motionEvent.getX(action2);
                            int y10 = (int) motionEvent.getY(action2);
                            int iD = d(motionEvent.getButtonState());
                            if (iD != -1) {
                                i10 = x10;
                                c(bVar2, 0, i10, y10, iC, iD, jNanoTime);
                            } else {
                                i10 = x10;
                            }
                            bVar2.f160577f[iC] = i10;
                            bVar2.f160578g[iC] = y10;
                            bVar2.f160580h[iC] = 0;
                            bVar2.f160582i[iC] = 0;
                            bVar2.f160584j[iC] = iD != -1;
                            bVar2.f160586k[iC] = iD;
                        }
                        bVar2.Z.m().a();
                        return;
                    case 1:
                    case 3:
                    case 4:
                    case 6:
                        int iE = bVar2.e(pointerId);
                        if (iE != -1 && iE < 20) {
                            bVar2.f160588l[iE] = -1;
                            int x11 = (int) motionEvent.getX(action2);
                            int y11 = (int) motionEvent.getY(action2);
                            int i12 = bVar2.f160586k[iE];
                            if (i12 != -1) {
                                i11 = x11;
                                c(bVar2, 1, i11, y11, iE, i12, jNanoTime);
                            } else {
                                i11 = x11;
                            }
                            bVar2.f160577f[iE] = i11;
                            bVar2.f160578g[iE] = y11;
                            bVar2.f160580h[iE] = 0;
                            bVar2.f160582i[iE] = 0;
                            bVar2.f160584j[iE] = false;
                            bVar2.f160586k[iE] = 0;
                        }
                        bVar2.Z.m().a();
                        return;
                    case 2:
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i13 = 0; i13 < pointerCount; i13++) {
                            int pointerId2 = motionEvent.getPointerId(i13);
                            int x12 = (int) motionEvent.getX(i13);
                            int y12 = (int) motionEvent.getY(i13);
                            int iE2 = bVar2.e(pointerId2);
                            if (iE2 != -1) {
                                if (iE2 >= 20) {
                                    bVar2.Z.m().a();
                                    return;
                                }
                                int i14 = bVar2.f160586k[iE2];
                                if (i14 != -1) {
                                    long j10 = jNanoTime;
                                    try {
                                        c(bVar2, 2, x12, y12, iE2, i14, j10);
                                        jNanoTime = j10;
                                        bVar2 = bVar;
                                        int[] iArr = bVar2.f160580h;
                                        int[] iArr2 = bVar2.f160577f;
                                        iArr[iE2] = x12 - iArr2[iE2];
                                        int[] iArr3 = bVar2.f160582i;
                                        int[] iArr4 = bVar2.f160578g;
                                        iArr3[iE2] = y12 - iArr4[iE2];
                                        iArr2[iE2] = x12;
                                        iArr4[iE2] = y12;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } else {
                                    long j11 = jNanoTime;
                                    try {
                                        c(bVar, 4, x12, y12, iE2, 0, j11);
                                        bVar2 = bVar;
                                        jNanoTime = j11;
                                        int[] iArr5 = bVar2.f160580h;
                                        int[] iArr6 = bVar2.f160577f;
                                        iArr5[iE2] = x12 - iArr6[iE2];
                                        int[] iArr7 = bVar2.f160582i;
                                        int[] iArr8 = bVar2.f160578g;
                                        iArr7[iE2] = y12 - iArr8[iE2];
                                        iArr6[iE2] = x12;
                                        iArr8[iE2] = y12;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                break;
                            }
                        }
                        bVar2.Z.m().a();
                        return;
                    default:
                        bVar2.Z.m().a();
                        return;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw th;
        }
    }
}
