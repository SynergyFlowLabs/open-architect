package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f48804a;

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(20)
    static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private final View f48805a;

        a(@androidx.annotation.p0 View view) {
            this.f48805a = view;
        }

        @Override // androidx.core.view.i1.c
        void a() {
            View view = this.f48805a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f48805a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.i1.c
        void b() {
            final View viewFindViewById = this.f48805a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f48805a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.h1
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    private static class c {
        c() {
        }

        void a() {
        }

        void b() {
        }
    }

    public i1(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f48804a = new b(view);
        } else {
            this.f48804a = new a(view);
        }
    }

    public void a() {
        this.f48804a.a();
    }

    public void b() {
        this.f48804a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(30)
    static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private View f48806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private WindowInsetsController f48807c;

        b(@NonNull View view) {
            super(view);
            this.f48806b = view;
        }

        @Override // androidx.core.view.i1.a, androidx.core.view.i1.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f48807c;
            if (windowInsetsController == null) {
                View view2 = this.f48806b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.o1
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f48806b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f48806b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.i1.a, androidx.core.view.i1.c
        void b() {
            View view = this.f48806b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f48807c;
            if (windowInsetsController == null) {
                View view2 = this.f48806b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        b(@androidx.annotation.p0 WindowInsetsController windowInsetsController) {
            super(null);
            this.f48807c = windowInsetsController;
        }
    }

    @androidx.annotation.w0(30)
    @Deprecated
    i1(@NonNull WindowInsetsController windowInsetsController) {
        this.f48804a = new b(windowInsetsController);
    }
}
