package com.planner5d.library.application;

import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.e
public final class o3 {

    private static final class a implements f6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w5 f142879a;

        @Override // com.planner5d.library.application.f6.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(w5 w5Var) {
            this.f142879a = (w5) dagger.internal.p.b(w5Var);
            return this;
        }

        @Override // com.planner5d.library.application.f6.a
        public f6 build() {
            if (this.f142879a == null) {
                this.f142879a = new w5();
            }
            return new b(this.f142879a);
        }

        private a() {
        }
    }

    private static final class b implements f6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w5 f142880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f142881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ij.c<Application> f142882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.p> f142883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.z0> f142884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.tutorial.p> f142885f;

        private void d(w5 w5Var) {
            this.f142882c = y5.a(w5Var);
            this.f142883d = b6.a(w5Var);
            a6 a6VarA = a6.a(w5Var);
            this.f142884e = a6VarA;
            this.f142885f = dagger.internal.g.b(com.planner5d.library.activity.tutorial.q.a(this.f142882c, this.f142883d, a6VarA));
        }

        @Override // com.planner5d.library.application.f6
        public com.planner5d.library.widget.drawable.d a() {
            return z5.c(this.f142880a);
        }

        @Override // com.planner5d.library.application.f6
        public com.planner5d.library.activity.tutorial.p b() {
            return this.f142885f.get();
        }

        @Override // com.planner5d.library.application.f6
        public s5 c() {
            return c6.c(this.f142880a);
        }

        private b(w5 w5Var) {
            this.f142881b = this;
            this.f142880a = w5Var;
            d(w5Var);
        }
    }

    private o3() {
    }

    public static f6.a a() {
        return new a();
    }

    public static f6 b() {
        return new a().build();
    }
}
