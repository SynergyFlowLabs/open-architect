package com.planner5d.library.spaces.view.dashboard;

import androidx.compose.runtime.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f230265a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static Function2<androidx.compose.runtime.c0, Integer, Unit> f230266b = androidx.compose.runtime.internal.w.c(-135165607, false, a.f230267a);

    @SourceDebugExtension({"SMAP\nSpacesInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesInfo.kt\ncom/planner5d/library/spaces/view/dashboard/ComposableSingletons$SpacesInfoKt$lambda-1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,67:1\n1282#2,6:68\n*S KotlinDebug\n*F\n+ 1 SpacesInfo.kt\ncom/planner5d/library/spaces/view/dashboard/ComposableSingletons$SpacesInfoKt$lambda-1$1\n*L\n64#1:68,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f230267a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f() {
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-135165607, i10, -1, "com.planner5d.library.spaces.view.dashboard.ComposableSingletons$SpacesInfoKt.lambda-1.<anonymous> (SpacesInfo.kt:63)");
            }
            c0Var.E(-1230417866);
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: com.planner5d.library.spaces.view.dashboard.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.f();
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
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> a() {
        return f230266b;
    }
}
