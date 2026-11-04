package io.codetail.animation;

import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<io.codetail.animation.a> f288268a;

    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    /* JADX INFO: renamed from: io.codetail.animation.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1949b implements a {
        @Override // io.codetail.animation.b.a
        public void a() {
        }

        @Override // io.codetail.animation.b.a
        public void b() {
        }

        @Override // io.codetail.animation.b.a
        public void c() {
        }

        @Override // io.codetail.animation.b.a
        public void d() {
        }
    }

    public b(io.codetail.animation.a aVar) {
        this.f288268a = new WeakReference<>(aVar);
    }

    public abstract void a(a aVar);

    public abstract void b();

    public void c() {
    }

    public abstract Object d();

    public abstract boolean e();

    public abstract boolean f();

    public b g() {
        io.codetail.animation.a aVar;
        if (f() || (aVar = this.f288268a.get()) == null) {
            return null;
        }
        return aVar.c();
    }

    public abstract void h(int i10);

    public abstract void i(Interpolator interpolator);

    public void j() {
    }

    public void k() {
    }

    public abstract void l();
}
