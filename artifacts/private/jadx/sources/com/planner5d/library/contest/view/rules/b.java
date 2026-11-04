package com.planner5d.library.contest.view.rules;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f153759a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static Function2<c0, Integer, Unit> f153760b = w.c(1642217634, false, a.f153762a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static Function2<c0, Integer, Unit> f153761c = w.c(-805171017, false, C1528b.f153763a);

    static final class a implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f153762a = new a();

        a() {
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1642217634, i10, -1, "com.planner5d.library.contest.view.rules.ComposableSingletons$ContestRulesFragmentKt.lambda-1.<anonymous> (ContestRulesFragment.kt:38)");
            }
            l.e(c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.contest.view.rules.b$b, reason: collision with other inner class name */
    static final class C1528b implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1528b f153763a = new C1528b();

        C1528b() {
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-805171017, i10, -1, "com.planner5d.library.contest.view.rules.ComposableSingletons$ContestRulesFragmentKt.lambda-2.<anonymous> (ContestRulesFragment.kt:37)");
            }
            ab.d.b(b.f153759a.a(), c0Var, 6);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final Function2<c0, Integer, Unit> a() {
        return f153760b;
    }

    @NotNull
    public final Function2<c0, Integer, Unit> b() {
        return f153761c;
    }
}
