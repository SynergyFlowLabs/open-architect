package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.b1;
import androidx.core.view.f2;
import androidx.core.view.g2;
import androidx.core.view.h2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f10568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g2 f10569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10570e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10567b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h2 f10571f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<f2> f10566a = new ArrayList<>();

    class a extends h2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10572a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10573b = 0;

        a() {
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void b(View view) {
            int i10 = this.f10573b + 1;
            this.f10573b = i10;
            if (i10 == h.this.f10566a.size()) {
                g2 g2Var = h.this.f10569d;
                if (g2Var != null) {
                    g2Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void c(View view) {
            if (this.f10572a) {
                return;
            }
            this.f10572a = true;
            g2 g2Var = h.this.f10569d;
            if (g2Var != null) {
                g2Var.c(null);
            }
        }

        void d() {
            this.f10573b = 0;
            this.f10572a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f10570e) {
            Iterator<f2> it = this.f10566a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f10570e = false;
        }
    }

    void b() {
        this.f10570e = false;
    }

    public h c(f2 f2Var) {
        if (!this.f10570e) {
            this.f10566a.add(f2Var);
        }
        return this;
    }

    public h d(f2 f2Var, f2 f2Var2) {
        this.f10566a.add(f2Var);
        f2Var2.v(f2Var.e());
        this.f10566a.add(f2Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f10570e) {
            this.f10567b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f10570e) {
            this.f10568c = interpolator;
        }
        return this;
    }

    public h g(g2 g2Var) {
        if (!this.f10570e) {
            this.f10569d = g2Var;
        }
        return this;
    }

    public void h() {
        if (this.f10570e) {
            return;
        }
        for (f2 f2Var : this.f10566a) {
            long j10 = this.f10567b;
            if (j10 >= 0) {
                f2Var.r(j10);
            }
            Interpolator interpolator = this.f10568c;
            if (interpolator != null) {
                f2Var.s(interpolator);
            }
            if (this.f10569d != null) {
                f2Var.t(this.f10571f);
            }
            f2Var.x();
        }
        this.f10570e = true;
    }
}
