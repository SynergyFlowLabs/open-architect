package com.planner5d.library.legal.application;

import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.h2;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.modules.user.user.r0;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.c2;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.e
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.legal.application.a$a, reason: collision with other inner class name */
    private static final class C1565a implements e.b {
        @Override // com.planner5d.library.legal.application.e.b
        public e a(f fVar) {
            dagger.internal.p.b(fVar);
            return new b(fVar);
        }

        private C1565a() {
        }
    }

    private static final class b extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f f180309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f180310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.p> f180311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<r0> f180312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<w> f180313h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<c2> f180314i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<u1> f180315j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<com.planner5d.library.legal.model.manager.a> f180316k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<com.planner5d.library.legal.view.dialog.agreements.c> f180317l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<com.planner5d.library.legal.view.dialog.authentication.e> f180318m;

        private void l(f fVar) {
            this.f180311f = l.a(fVar);
            this.f180312g = p.a(fVar);
            this.f180313h = o.a(fVar);
            this.f180314i = k.a(fVar);
            i iVarA = i.a(fVar);
            this.f180315j = iVarA;
            ij.c<com.planner5d.library.legal.model.manager.a> cVarB = dagger.internal.g.b(com.planner5d.library.legal.model.manager.b.a(this.f180311f, this.f180312g, this.f180313h, this.f180314i, iVarA));
            this.f180316k = cVarB;
            this.f180317l = com.planner5d.library.legal.view.dialog.agreements.d.a(cVarB);
            this.f180318m = com.planner5d.library.legal.view.dialog.authentication.f.a(this.f180312g);
        }

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return dagger.internal.l.b(3).c(r.a.class, s.a()).c(com.planner5d.library.legal.view.dialog.agreements.c.class, this.f180317l).c(com.planner5d.library.legal.view.dialog.authentication.e.class, this.f180318m).a();
        }

        @Override // com.planner5d.library.legal.application.e
        public com.planner5d.library.model.manager.h f() {
            return g.c(this.f180309d);
        }

        @Override // com.planner5d.library.legal.application.e
        public h2 h() {
            return j.c(this.f180309d);
        }

        @Override // com.planner5d.library.legal.application.e
        public com.planner5d.library.legal.model.manager.a i() {
            return this.f180316k.get();
        }

        @Override // com.planner5d.library.legal.application.e
        public p5 j() {
            return n.c(this.f180309d);
        }

        private b(f fVar) {
            this.f180310e = this;
            this.f180309d = fVar;
            l(fVar);
        }
    }

    private a() {
    }

    public static e.b a() {
        return new C1565a();
    }
}
