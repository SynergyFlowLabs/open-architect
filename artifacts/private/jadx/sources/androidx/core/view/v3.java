package androidx.core.view;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class v3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f48999b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f49000c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f49001d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f49002e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f49003a;

    @androidx.annotation.w0(20)
    private static class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        protected final Window f49004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final i1 f49005c;

        a(@NonNull Window window, @NonNull i1 i1Var) {
            this.f49004b = window;
            this.f49005c = i1Var;
        }

        private void l(int i10) {
            if (i10 == 1) {
                m(4);
            } else if (i10 == 2) {
                m(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f49005c.a();
            }
        }

        private void o(int i10) {
            if (i10 == 1) {
                p(4);
                q(1024);
            } else if (i10 == 2) {
                p(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f49005c.b();
            }
        }

        @Override // androidx.core.view.v3.g
        void a(h hVar) {
        }

        @Override // androidx.core.view.v3.g
        void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, z2 z2Var) {
        }

        @Override // androidx.core.view.v3.g
        int c() {
            Object tag = this.f49004b.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.v3.g
        void d(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    l(i11);
                }
            }
        }

        @Override // androidx.core.view.v3.g
        void g(@NonNull h hVar) {
        }

        @Override // androidx.core.view.v3.g
        void j(int i10) {
            this.f49004b.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                p(6144);
                return;
            }
            if (i10 == 1) {
                p(4096);
                m(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                p(2048);
                m(4096);
            }
        }

        @Override // androidx.core.view.v3.g
        void k(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    o(i11);
                }
            }
        }

        protected void m(int i10) {
            View decorView = this.f49004b.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void n(int i10) {
            this.f49004b.addFlags(i10);
        }

        protected void p(int i10) {
            View decorView = this.f49004b.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void q(int i10) {
            this.f49004b.clearFlags(i10);
        }
    }

    @androidx.annotation.w0(23)
    private static class b extends a {
        b(@NonNull Window window, @NonNull i1 i1Var) {
            super(window, i1Var);
        }

        @Override // androidx.core.view.v3.g
        public boolean f() {
            return (this.f49004b.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.v3.g
        public void i(boolean z10) {
            if (!z10) {
                p(8192);
                return;
            }
            q(67108864);
            n(Integer.MIN_VALUE);
            m(8192);
        }
    }

    @androidx.annotation.w0(26)
    private static class c extends b {
        c(@NonNull Window window, @NonNull i1 i1Var) {
            super(window, i1Var);
        }

        @Override // androidx.core.view.v3.g
        public boolean e() {
            return (this.f49004b.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.v3.g
        public void h(boolean z10) {
            if (!z10) {
                p(16);
                return;
            }
            q(androidx.media3.common.j.W0);
            n(Integer.MIN_VALUE);
            m(16);
        }
    }

    @androidx.annotation.w0(31)
    private static class e extends d {
        e(@NonNull Window window, @NonNull v3 v3Var, @NonNull i1 i1Var) {
            super(window, v3Var, i1Var);
        }

        @Override // androidx.core.view.v3.d, androidx.core.view.v3.g
        @e.a({"WrongConstant"})
        int c() {
            return this.f49007c.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.v3.d, androidx.core.view.v3.g
        void j(int i10) {
            this.f49007c.setSystemBarsBehavior(i10);
        }

        e(@NonNull WindowInsetsController windowInsetsController, @NonNull v3 v3Var, @NonNull i1 i1Var) {
            super(windowInsetsController, v3Var, i1Var);
        }
    }

    @androidx.annotation.w0(35)
    private static class f extends e {
        f(@NonNull Window window, @NonNull v3 v3Var, @NonNull i1 i1Var) {
            super(window, v3Var, i1Var);
        }

        @Override // androidx.core.view.v3.d, androidx.core.view.v3.g
        public boolean e() {
            return (this.f49007c.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.v3.d, androidx.core.view.v3.g
        public boolean f() {
            return (this.f49007c.getSystemBarsAppearance() & 8) != 0;
        }

        f(@NonNull WindowInsetsController windowInsetsController, @NonNull v3 v3Var, @NonNull i1 i1Var) {
            super(windowInsetsController, v3Var, i1Var);
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f49014a = 356039078;

        g() {
        }

        void a(h hVar) {
        }

        void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, z2 z2Var) {
        }

        int c() {
            return 1;
        }

        void d(int i10) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        void g(@NonNull h hVar) {
        }

        public void h(boolean z10) {
        }

        public void i(boolean z10) {
        }

        void j(int i10) {
        }

        void k(int i10) {
        }
    }

    public interface h {
        void a(@NonNull v3 v3Var, int i10);
    }

    @androidx.annotation.w0(30)
    @Deprecated
    private v3(@NonNull WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f49003a = new f(windowInsetsController, this, new i1(windowInsetsController));
        } else {
            this.f49003a = new d(windowInsetsController, this, new i1(windowInsetsController));
        }
    }

    @NonNull
    @androidx.annotation.w0(30)
    @Deprecated
    public static v3 l(@NonNull WindowInsetsController windowInsetsController) {
        return new v3(windowInsetsController);
    }

    public void a(@NonNull h hVar) {
        this.f49003a.a(hVar);
    }

    public void b(int i10, long j10, @androidx.annotation.p0 Interpolator interpolator, @androidx.annotation.p0 CancellationSignal cancellationSignal, @NonNull z2 z2Var) {
        this.f49003a.b(i10, j10, interpolator, cancellationSignal, z2Var);
    }

    @e.a({"WrongConstant"})
    public int c() {
        return this.f49003a.c();
    }

    public void d(int i10) {
        this.f49003a.d(i10);
    }

    public boolean e() {
        return this.f49003a.e();
    }

    public boolean f() {
        return this.f49003a.f();
    }

    public void g(@NonNull h hVar) {
        this.f49003a.g(hVar);
    }

    public void h(boolean z10) {
        this.f49003a.h(z10);
    }

    public void i(boolean z10) {
        this.f49003a.i(z10);
    }

    public void j(int i10) {
        this.f49003a.j(i10);
    }

    public void k(int i10) {
        this.f49003a.k(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(30)
    static class d extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final v3 f49006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsetsController f49007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final i1 f49008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.collection.h3<h, WindowInsetsController.OnControllableInsetsChangedListener> f49009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected Window f49010f;

        class a implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private f3 f49011a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z2 f49012b;

            a(z2 z2Var) {
                this.f49012b = z2Var;
            }

            public void onCancelled(@androidx.annotation.p0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f49012b.a(windowInsetsAnimationController == null ? null : this.f49011a);
            }

            public void onFinished(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f49012b.c(this.f49011a);
            }

            public void onReady(@NonNull WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
                f3 f3Var = new f3(windowInsetsAnimationController);
                this.f49011a = f3Var;
                this.f49012b.b(f3Var, i10);
            }
        }

        d(@NonNull Window window, @NonNull v3 v3Var, @NonNull i1 i1Var) {
            this(window.getInsetsController(), v3Var, i1Var);
            this.f49010f = window;
        }

        public static /* synthetic */ void l(d dVar, h hVar, WindowInsetsController windowInsetsController, int i10) {
            if (dVar.f49007c == windowInsetsController) {
                hVar.a(dVar.f49006b, i10);
            }
        }

        @Override // androidx.core.view.v3.g
        void a(@NonNull final h hVar) {
            if (this.f49009e.containsKey(hVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.c4
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
                    v3.d.l(this.f48635a, hVar, windowInsetsController, i10);
                }
            };
            this.f49009e.put(hVar, onControllableInsetsChangedListener);
            this.f49007c.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.v3.g
        void b(int i10, long j10, @androidx.annotation.p0 Interpolator interpolator, @androidx.annotation.p0 CancellationSignal cancellationSignal, @NonNull z2 z2Var) {
            this.f49007c.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new a(z2Var));
        }

        @Override // androidx.core.view.v3.g
        @e.a({"WrongConstant"})
        int c() {
            Window window = this.f49010f;
            if (window == null) {
                return this.f49007c.getSystemBarsBehavior();
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.v3.g
        void d(int i10) {
            if ((i10 & 8) != 0) {
                this.f49008d.a();
            }
            this.f49007c.hide(i10 & (-9));
        }

        @Override // androidx.core.view.v3.g
        public boolean e() {
            this.f49007c.setSystemBarsAppearance(0, 0);
            return (this.f49007c.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.v3.g
        public boolean f() {
            this.f49007c.setSystemBarsAppearance(0, 0);
            return (this.f49007c.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.v3.g
        void g(@NonNull h hVar) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerA = a4.a(this.f49009e.remove(hVar));
            if (onControllableInsetsChangedListenerA != null) {
                this.f49007c.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerA);
            }
        }

        @Override // androidx.core.view.v3.g
        public void h(boolean z10) {
            if (z10) {
                if (this.f49010f != null) {
                    m(16);
                }
                this.f49007c.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f49010f != null) {
                    n(16);
                }
                this.f49007c.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.v3.g
        public void i(boolean z10) {
            if (z10) {
                if (this.f49010f != null) {
                    m(8192);
                }
                this.f49007c.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f49010f != null) {
                    n(8192);
                }
                this.f49007c.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.v3.g
        void j(int i10) {
            Window window = this.f49010f;
            if (window == null) {
                this.f49007c.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                n(6144);
                return;
            }
            if (i10 == 1) {
                n(4096);
                m(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                n(2048);
                m(4096);
            }
        }

        @Override // androidx.core.view.v3.g
        void k(int i10) {
            if ((i10 & 8) != 0) {
                this.f49008d.b();
            }
            this.f49007c.show(i10 & (-9));
        }

        protected void m(int i10) {
            View decorView = this.f49010f.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void n(int i10) {
            View decorView = this.f49010f.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(@NonNull WindowInsetsController windowInsetsController, @NonNull v3 v3Var, @NonNull i1 i1Var) {
            this.f49009e = new androidx.collection.h3<>();
            this.f49007c = windowInsetsController;
            this.f49006b = v3Var;
            this.f49008d = i1Var;
        }
    }

    public v3(@NonNull Window window, @NonNull View view) {
        i1 i1Var = new i1(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f49003a = new f(window, this, i1Var);
        } else if (i10 >= 30) {
            this.f49003a = new d(window, this, i1Var);
        } else {
            this.f49003a = new c(window, i1Var);
        }
    }
}
