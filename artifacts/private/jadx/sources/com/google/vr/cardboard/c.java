package com.google.vr.cardboard;

import android.content.Context;
import android.opengl.GLSurfaceView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class c extends com.google.vr.ndk.base.z {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final String f126814r3 = "c";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private final a f126815m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private boolean f126816n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private boolean f126817o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private ArrayList<Runnable> f126818p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final h f126819q3;

    public interface a {
        void b();
    }

    public c(Context context, a aVar) {
        super(context);
        this.f126815m3 = aVar;
        h hVar = new h();
        this.f126819q3 = hVar;
        setEGLContextFactory(hVar);
        setEGLWindowSurfaceFactory(hVar);
    }

    @Override // com.google.vr.ndk.base.z
    public void m() {
        if (this.f126816n3) {
            super.m();
        }
    }

    @Override // com.google.vr.ndk.base.z
    public void o() {
        if (this.f126816n3) {
            super.o();
        }
    }

    @Override // com.google.vr.ndk.base.z, android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        this.f126817o3 = false;
        ArrayList<Runnable> arrayList = this.f126818p3;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Runnable runnable = arrayList.get(i10);
                i10++;
                super.q(runnable);
            }
            this.f126818p3.clear();
        }
    }

    @Override // com.google.vr.ndk.base.z, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        a aVar;
        if (this.f126816n3 && (aVar = this.f126815m3) != null) {
            aVar.b();
        }
        super.onDetachedFromWindow();
        this.f126817o3 = true;
    }

    @Override // com.google.vr.ndk.base.z
    public void q(Runnable runnable) {
        if (!this.f126816n3) {
            runnable.run();
        } else {
            if (!this.f126817o3) {
                super.q(runnable);
                return;
            }
            if (this.f126818p3 == null) {
                this.f126818p3 = new ArrayList<>();
            }
            this.f126818p3.add(runnable);
        }
    }

    @Override // com.google.vr.ndk.base.z
    public void setEGLContextClientVersion(int i10) {
        super.setEGLContextClientVersion(i10);
        this.f126819q3.a(i10);
    }

    @Override // com.google.vr.ndk.base.z
    public void setRenderer(GLSurfaceView.Renderer renderer) {
        super.setRenderer(renderer);
        this.f126816n3 = true;
    }
}
