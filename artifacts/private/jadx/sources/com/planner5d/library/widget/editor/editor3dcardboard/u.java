package com.planner5d.library.widget.editor.editor3dcardboard;

import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes12.dex */
public class u implements vb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<GvrView> f256061a = new WeakReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.application.d f256062b;

    class a implements GvrView.StereoRenderer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GL10 f256063a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<vb.c> f256064b = new WeakReference<>(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vb.a f256065c;

        a(vb.a aVar) {
            this.f256065c = aVar;
        }

        public static /* synthetic */ void d(vb.a aVar, HeadTransform headTransform) {
            com.planner5d.library.engine.b bVarC = aVar.c();
            if (bVarC instanceof com.planner5d.library.widget.editor.editor3dcardboard.a) {
                ((com.planner5d.library.widget.editor.editor3dcardboard.a) bVarC).onNewFrame(headTransform);
            }
        }

        public static /* synthetic */ void e(vb.a aVar, Eye eye) {
            com.planner5d.library.engine.b bVarC = aVar.c();
            if (bVarC instanceof com.planner5d.library.widget.editor.editor3dcardboard.a) {
                ((com.planner5d.library.widget.editor.editor3dcardboard.a) bVarC).onDrawEye(eye);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public GvrView.StereoRenderer g(vb.c cVar) {
            this.f256064b = new WeakReference<>(cVar);
            return this;
        }

        @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
        public void a() {
            vb.c cVar = this.f256064b.get();
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
        public void b(EGLConfig eGLConfig) {
            vb.c cVar = this.f256064b.get();
            if (cVar != null) {
                cVar.onSurfaceCreated(this.f256063a, eGLConfig);
            }
        }

        @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
        public void c(int i10, int i11) {
            vb.c cVar = this.f256064b.get();
            if (cVar != null) {
                cVar.onSurfaceChanged(this.f256063a, i10, i11);
            }
        }

        @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
        public void onDrawEye(final Eye eye) {
            final vb.a aVar = this.f256065c;
            com.planner5d.library.engine.d.b(aVar, new Runnable() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.s
                @Override // java.lang.Runnable
                public final void run() {
                    u.a.e(aVar, eye);
                }
            });
        }

        @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
        public void onFinishFrame(Viewport viewport) {
            vb.c cVar = this.f256064b.get();
            if (cVar != null) {
                cVar.onDrawFrame(null);
            }
        }

        @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
        public void onNewFrame(final HeadTransform headTransform) {
            final vb.a aVar = this.f256065c;
            com.planner5d.library.engine.d.b(aVar, new Runnable() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.a.d(aVar, headTransform);
                }
            });
        }
    }

    @ij.a
    public u(com.planner5d.library.application.d dVar) {
        this.f256062b = dVar;
    }

    private void d(vb.a aVar, GvrView gvrView, vb.c cVar) {
        gvrView.setRenderer(new a(aVar).g(cVar));
    }

    @Override // vb.g
    @e.a({"DiscouragedApi"})
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GvrView a(vb.a aVar, vb.b bVar, GLSurfaceView.EGLConfigChooser eGLConfigChooser, GLSurfaceView.EGLContextFactory eGLContextFactory, vb.c cVar) {
        GvrView gvrView = this.f256061a.get();
        gvrView.setTransitionViewEnabled(false);
        gvrView.a();
        gvrView.j(true);
        d(aVar, gvrView, cVar);
        try {
            View childAt = ((ViewGroup) gvrView.getChildAt(0)).getChildAt(0);
            View viewFindViewById = childAt.findViewById(childAt.getResources().getIdentifier("ui_settings_button", "id", "com.google.vr.vrcore"));
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        } catch (Throwable unused) {
        }
        return gvrView;
    }

    public u c(GvrView gvrView) {
        this.f256061a = new WeakReference<>(gvrView);
        return this;
    }
}
