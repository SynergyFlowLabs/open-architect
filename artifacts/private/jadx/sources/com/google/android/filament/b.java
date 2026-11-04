package com.google.android.filament;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
final class b extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f104719b = "Filament";

    static {
        EGL14.eglGetDisplay(0);
    }

    b() {
    }

    @Override // com.google.android.filament.n
    long b(Object obj) {
        return a.a(obj);
    }

    @Override // com.google.android.filament.n
    void g(String str) {
    }

    @Override // com.google.android.filament.n
    boolean h(Object obj) {
        return obj instanceof EGLContext;
    }

    @Override // com.google.android.filament.n
    boolean i(Object obj) {
        return obj instanceof SurfaceTexture;
    }

    @Override // com.google.android.filament.n
    boolean j(Object obj) {
        return obj instanceof Surface;
    }

    @Override // com.google.android.filament.n
    void k(String str) {
    }
}
