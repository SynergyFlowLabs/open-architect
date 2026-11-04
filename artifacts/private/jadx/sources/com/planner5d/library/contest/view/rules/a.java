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
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f153754a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static Function2<c0, Integer, Unit> f153755b = w.c(-1314316072, false, C1527a.f153757a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static Function2<c0, Integer, Unit> f153756c = w.c(807391341, false, b.f153758a);

    /* JADX INFO: renamed from: com.planner5d.library.contest.view.rules.a$a, reason: collision with other inner class name */
    static final class C1527a implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1527a f153757a = new C1527a();

        C1527a() {
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-1314316072, i10, -1, "com.planner5d.library.contest.view.rules.ComposableSingletons$ContestRulesDialogKt.lambda-1.<anonymous> (ContestRulesDialog.kt:40)");
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

    static final class b implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f153758a = new b();

        b() {
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(807391341, i10, -1, "com.planner5d.library.contest.view.rules.ComposableSingletons$ContestRulesDialogKt.lambda-2.<anonymous> (ContestRulesDialog.kt:39)");
            }
            ab.d.b(a.f153754a.a(), c0Var, 6);
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
        return f153755b;
    }

    @NotNull
    public final Function2<c0, Integer, Unit> b() {
        return f153756c;
    }
}
