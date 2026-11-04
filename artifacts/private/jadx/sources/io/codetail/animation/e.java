package io.codetail.animation;

import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class e {

    static class a implements com.nineoldandroids.animation.a.InterfaceC1443a {
        a() {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void a(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void b(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void d(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC1443a
        public void e(com.nineoldandroids.animation.a aVar) {
        }
    }

    public static b a(View view, int i10, int i11, float f10, float f11) {
        if (!(view.getParent() instanceof io.codetail.animation.a)) {
            throw new IllegalArgumentException("View must be inside RevealFrameLayout or RevealLinearLayout.");
        }
        io.codetail.animation.a aVar = (io.codetail.animation.a) view.getParent();
        aVar.d(new io.codetail.animation.a.C1948a(i10, i11, f10, f11, new WeakReference(view)));
        return new c(ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f11), aVar);
    }

    @Deprecated
    public static void b(View view, float f10, float f11, int i10, int i11) {
        com.nineoldandroids.view.a.s(view, f10);
        com.nineoldandroids.view.a.z(view, f11);
        com.nineoldandroids.view.b.c(view).r(new AccelerateDecelerateInterpolator()).q(i10).t(i11).i(0.0f).x(0.0f).u();
    }

    @Deprecated
    public static void c(View view, float f10, int i10) {
        com.nineoldandroids.view.a.s(view, f10);
        com.nineoldandroids.view.a.z(view, view.getHeight() / 3);
        com.nineoldandroids.view.b.c(view).r(new AccelerateDecelerateInterpolator()).q(i10).i(0.0f).x(0.0f).u();
    }

    @Deprecated
    public static void d(View view, float f10, int i10, int i11) {
        com.nineoldandroids.view.a.s(view, f10);
        com.nineoldandroids.view.a.z(view, view.getHeight() / 3);
        com.nineoldandroids.view.b.c(view).r(new AccelerateDecelerateInterpolator()).q(i10).t(i11).i(0.0f).x(0.0f).u();
    }
}
