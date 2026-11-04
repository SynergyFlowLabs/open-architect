package io.sentry.util;

import io.sentry.c3;
import io.sentry.fa;
import io.sentry.g1;
import io.sentry.i1;
import io.sentry.m4;
import io.sentry.n8;
import io.sentry.oa;
import io.sentry.p1;
import io.sentry.p9;
import io.sentry.t4;
import io.sentry.v4;
import io.sentry.w8;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 {

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private m4 f306974a;

        private b() {
            this.f306974a = null;
        }
    }

    public static /* synthetic */ void d(g1 g1Var, n8 n8Var, m4 m4Var) {
        io.sentry.d dVarE = m4Var.e();
        if (dVarE.z()) {
            dVarE.R(g1Var, n8Var);
            dVarE.d();
        }
    }

    @lm.a.c
    @NotNull
    public static io.sentry.d g(@Nullable io.sentry.d dVar, @Nullable fa faVar) {
        return h(dVar, faVar == null ? null : faVar.e(), faVar == null ? null : faVar.d(), faVar != null ? faVar.c() : null);
    }

    @lm.a.c
    @NotNull
    public static io.sentry.d h(@Nullable io.sentry.d dVar, @Nullable Boolean bool, @Nullable Double d10, @Nullable Double d11) {
        if (dVar == null) {
            dVar = new io.sentry.d(c3.e());
        }
        if (dVar.q() == null) {
            Double dR = dVar.r();
            if (dR != null) {
                d10 = dR;
            }
            dVar.K(d0.b(d11, d10, bool));
        }
        if (dVar.z() && dVar.A()) {
            dVar.d();
        }
        return dVar;
    }

    @lm.a.c
    public static boolean i(@Nullable List<io.sentry.l0> list, @Nullable String str) {
        if (str == null) {
            return false;
        }
        if (list != null && !list.isEmpty()) {
            Iterator<io.sentry.l0> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator<io.sentry.l0> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (it2.next().b(str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    @NotNull
    public static m4 j(@NotNull final g1 g1Var, @NotNull final n8 n8Var) {
        return g1Var.g0(new t4.a() { // from class: io.sentry.util.l0
            @Override // io.sentry.t4.a
            public final void a(m4 m4Var) {
                o0.d(g1Var, n8Var, m4Var);
            }
        });
    }

    public static void k(@NotNull i1 i1Var, @NotNull final m4 m4Var) {
        i1Var.v0(new v4() { // from class: io.sentry.util.i0
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                g1Var.g0(new t4.a() { // from class: io.sentry.util.j0
                    @Override // io.sentry.t4.a
                    public final void a(m4 m4Var2) {
                        g1Var.T(m4Var);
                    }
                });
            }
        });
    }

    private static boolean l(@NotNull String str, @NotNull n8 n8Var) {
        return b0.a(n8Var.getTracePropagationTargets(), str);
    }

    public static void m(@NotNull i1 i1Var) {
        i1Var.v0(new v4() { // from class: io.sentry.util.n0
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                g1Var.g0(new t4.a() { // from class: io.sentry.util.k0
                    @Override // io.sentry.t4.a
                    public final void a(m4 m4Var) {
                        g1Var.T(new m4());
                    }
                });
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.sentry.util.o0$a] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Nullable
    public static c n(@NotNull i1 i1Var, @Nullable List<String> list, @Nullable p1 p1Var) {
        final n8 n8VarB = i1Var.b();
        oa oaVar = 0;
        oa oaVar2 = null;
        if (p1Var != null && !p1Var.n0()) {
            w8 w8VarD = p1Var.d();
            io.sentry.e eVarF = p1Var.F(list);
            if (n8VarB.isPropagateTraceparent()) {
                p9 p9VarM = p1Var.m();
                oaVar2 = new oa(p9VarM.p(), p9VarM.m(), w8VarD.e());
            }
            return new c(w8VarD, eVarF, oaVar2);
        }
        final b bVar = new b();
        i1Var.v0(new v4() { // from class: io.sentry.util.m0
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                bVar.f306974a = o0.j(g1Var, n8VarB);
            }
        });
        if (bVar.f306974a == null) {
            return null;
        }
        m4 m4Var = bVar.f306974a;
        return new c(new w8(m4Var.i(), m4Var.h(), m4Var.j()), io.sentry.e.a(m4Var.e(), list), n8VarB.isPropagateTraceparent() ? new oa(m4Var.i(), m4Var.h(), m4Var.j()) : 0);
    }

    @Nullable
    public static c o(@NotNull i1 i1Var, @NotNull String str, @Nullable List<String> list, @Nullable p1 p1Var) {
        n8 n8VarB = i1Var.b();
        if (n8VarB.isTraceSampling() && l(str, n8VarB)) {
            return n(i1Var, list, p1Var);
        }
        return null;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final w8 f306975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final io.sentry.e f306976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final oa f306977c;

        public c(@NotNull w8 w8Var, @Nullable io.sentry.e eVar) {
            this.f306975a = w8Var;
            this.f306976b = eVar;
            this.f306977c = null;
        }

        @Nullable
        public io.sentry.e a() {
            return this.f306976b;
        }

        @NotNull
        public w8 b() {
            return this.f306975a;
        }

        @Nullable
        public oa c() {
            return this.f306977c;
        }

        public c(@NotNull w8 w8Var, @Nullable io.sentry.e eVar, @Nullable oa oaVar) {
            this.f306975a = w8Var;
            this.f306976b = eVar;
            this.f306977c = oaVar;
        }
    }
}
