package com.planner5d.library.activity.fragment.spaces.dashboard;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import com.planner5d.library.spaces.view.dashboard.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f136125a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static Function2<c0, Integer, Unit> f136126b = w.c(-1381804950, false, a.f136128a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static Function2<c0, Integer, Unit> f136127c = w.c(137454079, false, C1498b.f136129a);

    @SourceDebugExtension({"SMAP\nSpacesDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesDashboardFragment.kt\ncom/planner5d/library/activity/fragment/spaces/dashboard/ComposableSingletons$SpacesDashboardFragmentKt$lambda-1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,128:1\n1282#2,6:129\n*S KotlinDebug\n*F\n+ 1 SpacesDashboardFragment.kt\ncom/planner5d/library/activity/fragment/spaces/dashboard/ComposableSingletons$SpacesDashboardFragmentKt$lambda-1$1\n*L\n78#1:129,6\n*E\n"})
    static final class a implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f136128a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f() {
            return Unit.f312394a;
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void d(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-1381804950, i10, -1, "com.planner5d.library.activity.fragment.spaces.dashboard.ComposableSingletons$SpacesDashboardFragmentKt.lambda-1.<anonymous> (SpacesDashboardFragment.kt:77)");
            }
            c0Var.E(663459514);
            Object objI0 = c0Var.i0();
            if (objI0 == c0.f35327a.a()) {
                objI0 = new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.dashboard.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.a.f();
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            h0.e(null, (Function0) objI0, null, c0Var, 48, 5);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.spaces.dashboard.b$b, reason: collision with other inner class name */
    static final class C1498b implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1498b f136129a = new C1498b();

        C1498b() {
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(137454079, i10, -1, "com.planner5d.library.activity.fragment.spaces.dashboard.ComposableSingletons$SpacesDashboardFragmentKt.lambda-2.<anonymous> (SpacesDashboardFragment.kt:76)");
            }
            ab.d.b(b.f136125a.a(), c0Var, 6);
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
        return f136126b;
    }

    @NotNull
    public final Function2<c0, Integer, Unit> b() {
        return f136127c;
    }
}
