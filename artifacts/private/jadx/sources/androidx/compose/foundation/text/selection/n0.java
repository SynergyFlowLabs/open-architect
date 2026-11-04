package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.a5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f21271a = a.f21272a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f21272a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final n0 f21273b = new n0() { // from class: androidx.compose.foundation.text.selection.i0
            @Override // androidx.compose.foundation.text.selection.n0
            public final h0 a(o1 o1Var) {
                return n0.a.h(o1Var);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final n0 f21274c = new n0() { // from class: androidx.compose.foundation.text.selection.j0
            @Override // androidx.compose.foundation.text.selection.n0
            public final h0 a(o1 o1Var) {
                return n0.a.f(o1Var);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final n0 f21275d = new n0() { // from class: androidx.compose.foundation.text.selection.k0
            @Override // androidx.compose.foundation.text.selection.n0
            public final h0 a(o1 o1Var) {
                return n0.a.j(o1Var);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private static final n0 f21276e = new n0() { // from class: androidx.compose.foundation.text.selection.l0
            @Override // androidx.compose.foundation.text.selection.n0
            public final h0 a(o1 o1Var) {
                return n0.a.i(o1Var);
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private static final n0 f21277f = new n0() { // from class: androidx.compose.foundation.text.selection.m0
            @Override // androidx.compose.foundation.text.selection.n0
            public final h0 a(o1 o1Var) {
                return n0.a.g(o1Var);
            }
        };

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.n0$a$a, reason: collision with other inner class name */
        static final class C0159a implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0159a f21278a = new C0159a();

            C0159a() {
            }

            @Override // androidx.compose.foundation.text.selection.k
            public final long a(f0 f0Var, int i10) {
                return a5.c(f0Var.c(), i10);
            }
        }

        static final class b implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f21279a = new b();

            b() {
            }

            @Override // androidx.compose.foundation.text.selection.k
            public final long a(f0 f0Var, int i10) {
                return f0Var.k().D(i10);
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 f(o1 o1Var) {
            return q0.h(f21273b.a(o1Var), o1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 g(o1 o1Var) {
            h0.a aVarF;
            h0.a aVarL;
            h0.a aVarH;
            h0.a aVarF2;
            h0 h0VarE = o1Var.e();
            if (h0VarE == null) {
                return f21275d.a(o1Var);
            }
            if (o1Var.a()) {
                aVarF = h0VarE.h();
                aVarL = q0.l(o1Var, o1Var.h(), aVarF);
                aVarF2 = h0VarE.f();
                aVarH = aVarL;
            } else {
                aVarF = h0VarE.f();
                aVarL = q0.l(o1Var, o1Var.g(), aVarF);
                aVarH = h0VarE.h();
                aVarF2 = aVarL;
            }
            if (Intrinsics.areEqual(aVarL, aVarF)) {
                return h0VarE;
            }
            return q0.h(new h0(aVarH, aVarF2, o1Var.d() == m.CROSSED || (o1Var.d() == m.COLLAPSED && aVarH.g() > aVarF2.g())), o1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 h(o1 o1Var) {
            return new h0(o1Var.h().a(o1Var.h().g()), o1Var.g().a(o1Var.g().e()), o1Var.d() == m.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 i(o1 o1Var) {
            return q0.e(o1Var, C0159a.f21278a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 j(o1 o1Var) {
            return q0.e(o1Var, b.f21279a);
        }

        @NotNull
        public final n0 k() {
            return f21274c;
        }

        @NotNull
        public final n0 l() {
            return f21277f;
        }

        @NotNull
        public final n0 m() {
            return f21273b;
        }

        @NotNull
        public final n0 n() {
            return f21276e;
        }

        @NotNull
        public final n0 o() {
            return f21275d;
        }
    }

    @NotNull
    h0 a(@NotNull o1 o1Var);
}
