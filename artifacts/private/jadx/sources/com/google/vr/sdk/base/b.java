package com.google.vr.sdk.base;

import android.view.MotionEvent;
import android.view.View;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.z;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    GvrApi A1();

    void B1(boolean z10);

    void C1(boolean z10);

    void D1(GvrView.StereoRenderer stereoRenderer);

    void E1(float f10);

    float F1();

    boolean G1();

    void N(boolean z10);

    boolean a(MotionEvent motionEvent);

    void d();

    void d1(boolean z10);

    void e1();

    float f1();

    z g1();

    View getRootView();

    void h1(float f10);

    m i1();

    g j1();

    void k1(int i10);

    void l();

    void l1(Runnable runnable);

    boolean m1();

    void n1(Runnable runnable);

    void o1(Runnable runnable);

    void onBackPressed();

    boolean p1(boolean z10);

    void q1(Runnable runnable);

    void r1();

    h s1();

    void shutdown();

    void t1(m mVar);

    void u1(GvrView.Renderer renderer);

    boolean v1();

    void w1();

    void x1(int i10);

    void y1(HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5);

    void z1(g gVar);
}
