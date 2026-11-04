package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@w0(21)
public class m extends SharedElementCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private static WeakReference<View> f114700f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Rect f114704d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f114701a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f114702b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f114703c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private d f114705e = new e();

    class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f114706a;

        a(Window window) {
            this.f114706a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            m.j(this.f114706a);
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.i(this.f114706a);
        }
    }

    class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f114708a;

        b(Activity activity) {
            this.f114708a = activity;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (m.f114700f != null && (view = (View) m.f114700f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = m.f114700f = null;
            }
            this.f114708a.finish();
            this.f114708a.overridePendingTransition(0, 0);
        }
    }

    class c extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f114710a;

        c(Window window) {
            this.f114710a = window;
        }

        @Override // com.google.android.material.transition.platform.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            m.i(this.f114710a);
        }
    }

    public interface d {
        @p0
        com.google.android.material.shape.p a(@NonNull View view);
    }

    public static class e implements d {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.m.d
        @p0
        public com.google.android.material.shape.p a(@NonNull View view) {
            if (view instanceof com.google.android.material.shape.t) {
                return ((com.google.android.material.shape.t) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @p0
    private static Drawable f(Window window) {
        return window.getDecorView().getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Window window) {
        Drawable drawableF = f(window);
        if (drawableF == null) {
            return;
        }
        drawableF.mutate().setColorFilter(androidx.core.graphics.c.a(0, androidx.core.graphics.d.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(Window window) {
        Drawable drawableF = f(window);
        if (drawableF == null) {
            return;
        }
        drawableF.mutate().clearColorFilter();
    }

    private void n(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            l lVar = (l) sharedElementEnterTransition;
            if (!this.f114703c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f114702b) {
                p(window, lVar);
                lVar.addListener(new a(window));
            }
        }
    }

    private void o(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            l lVar = (l) sharedElementReturnTransition;
            lVar.Y(true);
            lVar.addListener(new b(activity));
            if (this.f114702b) {
                p(window, lVar);
                lVar.addListener(new c(window));
            }
        }
    }

    private static void p(Window window, l lVar) {
        if (lVar.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(lVar.getDuration());
        }
    }

    @p0
    public d e() {
        return this.f114705e;
    }

    public boolean g() {
        return this.f114703c;
    }

    public boolean h() {
        return this.f114702b;
    }

    public void k(@p0 d dVar) {
        this.f114705e = dVar;
    }

    public void l(boolean z10) {
        this.f114703c = z10;
    }

    public void m(boolean z10) {
        this.f114702b = z10;
    }

    @Override // android.app.SharedElementCallback
    @p0
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        f114700f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @p0
    public View onCreateSnapshotView(@NonNull Context context, @p0 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        com.google.android.material.shape.p pVarA;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f114700f) != null && this.f114705e != null && (view = weakReference.get()) != null && (pVarA = this.f114705e.a(view)) != null) {
            viewOnCreateSnapshotView.setTag(r6.a.h.f360763s3, pVarA);
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        Activity activityA;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activityA = com.google.android.material.internal.c.a(view.getContext())) == null) {
            return;
        }
        Window window = activityA.getWindow();
        if (this.f114701a) {
            n(window);
        } else {
            o(activityA, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(r6.a.h.f360763s3) instanceof View)) {
            list2.get(0).setTag(r6.a.h.f360763s3, null);
        }
        if (!this.f114701a && !list2.isEmpty()) {
            this.f114704d = w.j(list2.get(0));
        }
        this.f114701a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(r6.a.h.f360763s3, list3.get(0));
        }
        if (this.f114701a || list2.isEmpty() || this.f114704d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f114704d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f114704d.height(), 1073741824));
        Rect rect = this.f114704d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
