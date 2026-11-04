package com.planner5d.library.view.application;

import android.content.Context;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.y1;
import dagger.internal.p;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.e
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.view.application.a$a, reason: collision with other inner class name */
    private static final class C1717a implements c.b {
        @Override // com.planner5d.library.view.application.c.b
        public c a(d dVar) {
            p.b(dVar);
            return new b(dVar);
        }

        private C1717a() {
        }
    }

    private static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f244828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f244829e;

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return Collections.singletonMap(n.a.class, o.a());
        }

        @Override // com.planner5d.library.view.application.c
        public int f() {
            return this.f244828d.a();
        }

        @Override // com.planner5d.library.view.application.c
        public Context g() {
            return f.c(this.f244828d);
        }

        @Override // com.planner5d.library.view.application.c
        public Class<? extends FragmentController> h() {
            return h.c(this.f244828d);
        }

        @Override // com.planner5d.library.view.application.c
        public com.planner5d.library.activity.fragment.dialog.k i() {
            return g.c(this.f244828d);
        }

        @Override // com.planner5d.library.view.application.c
        public x j() {
            return i.c(this.f244828d);
        }

        @Override // com.planner5d.library.view.application.c
        public u1 l() {
            return j.c(this.f244828d);
        }

        @Override // com.planner5d.library.view.application.c
        public y1 m() {
            return k.c(this.f244828d);
        }

        private b(d dVar) {
            this.f244829e = this;
            this.f244828d = dVar;
        }
    }

    private a() {
    }

    public static c.b a() {
        return new C1717a();
    }
}
