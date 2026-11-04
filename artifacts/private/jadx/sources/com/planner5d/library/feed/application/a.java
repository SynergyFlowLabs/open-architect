package com.planner5d.library.feed.application;

import androidx.lifecycle.f2;
import dagger.internal.p;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.e
public final class a {

    /* JADX INFO: renamed from: com.planner5d.library.feed.application.a$a, reason: collision with other inner class name */
    private static final class C1550a implements c.b {
        @Override // com.planner5d.library.feed.application.c.b
        public c a(d dVar) {
            p.b(dVar);
            return new b();
        }

        private C1550a() {
        }
    }

    private static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f170893d;

        @Override // com.planner5d.library.view.b
        public Map<Class<? extends f2>, ij.c<f2>> d() {
            return Collections.singletonMap(f.a.class, g.a());
        }

        private b() {
            this.f170893d = this;
        }
    }

    private a() {
    }

    public static c.b a() {
        return new C1550a();
    }
}
