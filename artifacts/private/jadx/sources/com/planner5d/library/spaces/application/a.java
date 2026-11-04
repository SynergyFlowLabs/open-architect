package com.planner5d.library.spaces.application;

import android.app.Application;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.spaces.view.loading.a0;
import com.planner5d.library.spaces.view.loading.z;
import com.planner5d.library.spaces.view.search.y;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.e
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.spaces.application.a$a, reason: collision with other inner class name */
    private static final class C1694a implements e.b {
        @Override // com.planner5d.library.spaces.application.e.b
        public e a(f module) {
            dagger.internal.p.b(module);
            return new b(module);
        }

        private C1694a() {
        }
    }

    private static final class b extends e {
        private ij.c<z> A;
        private ij.c<com.planner5d.library.services.q> B;
        private ij.c<com.planner5d.library.spaces.view.info.g> C;
        private ij.c<com.planner5d.library.spaces.view.survey.style.l> D;
        private ij.c<com.planner5d.library.spaces.view.survey.usage.g> E;
        private ij.c<com.planner5d.library.spaces.view.survey.personality.i> F;
        private ij.c<com.planner5d.library.spaces.view.survey.goals.i> G;
        private ij.c<com.planner5d.library.spaces.view.survey.spacetype.g> H;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f229957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.c> f229958f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.k> f229959g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ij.c<com.planner5d.library.rabbitmq.h> f229960h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ij.c<com.planner5d.library.spaces.interactor.a> f229961i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ij.c<fe.a> f229962j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ij.c<com.planner5d.library.spaces.interactor.c> f229963k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<fe.b> f229964l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<f1> f229965m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.p> f229966n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<com.planner5d.library.spaces.data.e> f229967o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<w> f229968p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<com.planner5d.library.spaces.data.a> f229969q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.w> f229970r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<c4> f229971s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<com.planner5d.library.spaces.view.start.f> f229972t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<Application> f229973u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.c> f229974v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<com.planner5d.library.util.location.b> f229975w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<y> f229976x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<com.planner5d.library.spaces.view.loading.q> f229977y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<com.planner5d.library.spaces.view.loading.g> f229978z;

        private void f(final f spacesModuleParam) {
            this.f229958f = s.a(spacesModuleParam);
            this.f229959g = h.a(spacesModuleParam);
            o oVarA = o.a(spacesModuleParam);
            this.f229960h = oVarA;
            com.planner5d.library.spaces.interactor.b bVarA = com.planner5d.library.spaces.interactor.b.a(oVarA);
            this.f229961i = bVarA;
            this.f229962j = j.a(spacesModuleParam, bVarA);
            com.planner5d.library.spaces.interactor.d dVarA = com.planner5d.library.spaces.interactor.d.a(this.f229960h);
            this.f229963k = dVarA;
            this.f229964l = k.a(spacesModuleParam, dVarA);
            this.f229965m = l.a(spacesModuleParam);
            this.f229966n = p.a(spacesModuleParam);
            this.f229967o = q.a(spacesModuleParam);
            t tVarA = t.a(spacesModuleParam);
            this.f229968p = tVarA;
            this.f229969q = dagger.internal.g.b(com.planner5d.library.spaces.data.d.a(this.f229958f, this.f229959g, this.f229962j, this.f229964l, this.f229965m, this.f229966n, this.f229967o, tVarA));
            this.f229970r = i.a(spacesModuleParam);
            r rVarA = r.a(spacesModuleParam);
            this.f229971s = rVarA;
            this.f229972t = com.planner5d.library.spaces.view.start.g.a(this.f229969q, this.f229970r, this.f229966n, rVarA, this.f229967o);
            g gVarA = g.a(spacesModuleParam);
            this.f229973u = gVarA;
            this.f229974v = com.planner5d.library.services.utility.d.a(gVarA);
            com.planner5d.library.util.location.c cVarA = com.planner5d.library.util.location.c.a(this.f229973u);
            this.f229975w = cVarA;
            this.f229976x = com.planner5d.library.spaces.view.search.z.a(this.f229973u, this.f229974v, this.f229969q, this.f229971s, this.f229970r, cVarA);
            this.f229977y = com.planner5d.library.spaces.view.loading.t.a(this.f229969q, this.f229962j, this.f229971s);
            this.f229978z = com.planner5d.library.spaces.view.loading.h.a(this.f229969q, this.f229971s);
            this.A = a0.a(this.f229971s);
            m mVarA = m.a(spacesModuleParam);
            this.B = mVarA;
            this.C = com.planner5d.library.spaces.view.info.h.a(mVarA, this.f229966n, this.f229967o, this.f229971s);
            this.D = com.planner5d.library.spaces.view.survey.style.m.a(this.f229969q);
            this.E = com.planner5d.library.spaces.view.survey.usage.h.a(this.f229971s);
            this.F = com.planner5d.library.spaces.view.survey.personality.j.a(this.f229971s);
            this.G = com.planner5d.library.spaces.view.survey.goals.j.a(this.f229971s);
            this.H = com.planner5d.library.spaces.view.survey.spacetype.h.a(this.f229971s);
        }

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return dagger.internal.l.b(11).c(com.planner5d.library.spaces.view.start.f.class, this.f229972t).c(y.class, this.f229976x).c(com.planner5d.library.spaces.view.loading.q.class, this.f229977y).c(com.planner5d.library.spaces.view.loading.g.class, this.f229978z).c(z.class, this.A).c(com.planner5d.library.spaces.view.info.g.class, this.C).c(com.planner5d.library.spaces.view.survey.style.l.class, this.D).c(com.planner5d.library.spaces.view.survey.usage.g.class, this.E).c(com.planner5d.library.spaces.view.survey.personality.i.class, this.F).c(com.planner5d.library.spaces.view.survey.goals.i.class, this.G).c(com.planner5d.library.spaces.view.survey.spacetype.g.class, this.H).a();
        }

        private b(f spacesModuleParam) {
            this.f229957e = this;
            f(spacesModuleParam);
        }
    }

    private a() {
    }

    public static e.b a() {
        return new C1694a();
    }
}
