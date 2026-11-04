package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f48747a;

    @androidx.annotation.w0(30)
    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f48748a;

        a(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f48748a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.f3.b
        void a(boolean z10) {
            this.f48748a.finish(z10);
        }

        @Override // androidx.core.view.f3.b
        public float b() {
            return this.f48748a.getCurrentAlpha();
        }

        @Override // androidx.core.view.f3.b
        public float c() {
            return this.f48748a.getCurrentFraction();
        }

        @Override // androidx.core.view.f3.b
        @NonNull
        public androidx.core.graphics.j d() {
            return androidx.core.graphics.j.g(this.f48748a.getCurrentInsets());
        }

        @Override // androidx.core.view.f3.b
        @NonNull
        public androidx.core.graphics.j e() {
            return androidx.core.graphics.j.g(this.f48748a.getHiddenStateInsets());
        }

        @Override // androidx.core.view.f3.b
        @NonNull
        public androidx.core.graphics.j f() {
            return androidx.core.graphics.j.g(this.f48748a.getShownStateInsets());
        }

        @Override // androidx.core.view.f3.b
        @e.a({"WrongConstant"})
        public int g() {
            return this.f48748a.getTypes();
        }

        @Override // androidx.core.view.f3.b
        boolean h() {
            return this.f48748a.isCancelled();
        }

        @Override // androidx.core.view.f3.b
        boolean i() {
            return this.f48748a.isFinished();
        }

        @Override // androidx.core.view.f3.b
        public void j(@androidx.annotation.p0 androidx.core.graphics.j jVar, float f10, float f11) {
            this.f48748a.setInsetsAndAlpha(jVar == null ? null : jVar.h(), f10, f11);
        }
    }

    private static class b {
        b() {
        }

        void a(boolean z10) {
        }

        public float b() {
            return 0.0f;
        }

        @androidx.annotation.x(from = 0.0d, to = 1.0d)
        public float c() {
            return 0.0f;
        }

        @NonNull
        public androidx.core.graphics.j d() {
            return androidx.core.graphics.j.f47822e;
        }

        @NonNull
        public androidx.core.graphics.j e() {
            return androidx.core.graphics.j.f47822e;
        }

        @NonNull
        public androidx.core.graphics.j f() {
            return androidx.core.graphics.j.f47822e;
        }

        public int g() {
            return 0;
        }

        boolean h() {
            return true;
        }

        boolean i() {
            return false;
        }

        public void j(@androidx.annotation.p0 androidx.core.graphics.j jVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11) {
        }
    }

    @androidx.annotation.w0(30)
    f3(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f48747a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z10) {
        this.f48747a.a(z10);
    }

    public float b() {
        return this.f48747a.b();
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f48747a.c();
    }

    @NonNull
    public androidx.core.graphics.j d() {
        return this.f48747a.d();
    }

    @NonNull
    public androidx.core.graphics.j e() {
        return this.f48747a.e();
    }

    @NonNull
    public androidx.core.graphics.j f() {
        return this.f48747a.f();
    }

    public int g() {
        return this.f48747a.g();
    }

    public boolean h() {
        return this.f48747a.h();
    }

    public boolean i() {
        return this.f48747a.i();
    }

    public boolean j() {
        return (i() || h()) ? false : true;
    }

    public void k(@androidx.annotation.p0 androidx.core.graphics.j jVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11) {
        this.f48747a.j(jVar, f10, f11);
    }
}
