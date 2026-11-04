package com.planner5d.library.engine.libgdx.compatibility;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes5.dex */
public class e implements GLSurfaceView.EGLConfigChooser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GLSurfaceView.EGLConfigChooser f160785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vb.b f160786b;

    public e(GLSurfaceView.EGLConfigChooser eGLConfigChooser, vb.b bVar) {
        this.f160785a = eGLConfigChooser;
        this.f160786b = bVar;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig eGLConfigChooseConfig;
        GLSurfaceView.EGLConfigChooser eGLConfigChooser = this.f160785a;
        if (eGLConfigChooser != null && (eGLConfigChooseConfig = eGLConfigChooser.chooseConfig(egl10, eGLDisplay)) != null) {
            return eGLConfigChooseConfig;
        }
        vb.b bVar = this.f160786b;
        EGLConfig eGLConfigChooseConfig2 = new com.badlogic.gdx.backends.android.surfaceview.d(bVar.f385710a, bVar.f385711b, bVar.f385712c, bVar.f385713d, 16, bVar.f385715f, bVar.f385716g).chooseConfig(egl10, eGLDisplay);
        if (eGLConfigChooseConfig2 != null) {
            return eGLConfigChooseConfig2;
        }
        vb.b bVar2 = this.f160786b;
        return new com.badlogic.gdx.backends.android.surfaceview.d(bVar2.f385710a, bVar2.f385711b, bVar2.f385712c, bVar2.f385713d, 8, bVar2.f385715f, bVar2.f385716g).chooseConfig(egl10, eGLDisplay);
    }
}
