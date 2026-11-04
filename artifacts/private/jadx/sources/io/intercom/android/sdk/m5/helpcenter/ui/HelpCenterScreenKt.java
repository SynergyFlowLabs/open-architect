package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.t7;
import androidx.compose.foundation.layout.v6;
import androidx.compose.material3.pt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.compose.e1;
import androidx.navigation.d3;
import androidx.navigation.g2;
import androidx.navigation.k0;
import androidx.navigation.q3;
import androidx.navigation.r2;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHelpCenterScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,181:1\n75#2:182\n75#2:183\n*S KotlinDebug\n*F\n+ 1 HelpCenterScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterScreenKt\n*L\n41#1:182\n101#1:183\n*E\n"})
public final class HelpCenterScreenKt {

    @NotNull
    private static final String START_DESTINATION = "startDestination";

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterNavGraph(@NotNull final HelpCenterViewModel viewModel, @NotNull final r2 navController, @NotNull final String startDestination, @NotNull final List<String> collectionIds, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(686627856);
        androidx.compose.ui.a0 a0Var2 = (i11 & 16) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        e1.J(navController, startDestination, a0Var3, null, null, null, null, null, null, null, new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt.HelpCenterNavGraph$lambda$3(viewModel, collectionIds, navController, context, (g2) obj);
            }
        }, c0VarR, ((i10 >> 3) & com.planner5d.library.engine.input.f.b.B) | 8 | ((i10 >> 6) & 896), 0, 1016);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterScreenKt.HelpCenterNavGraph$lambda$4(viewModel, navController, startDestination, collectionIds, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterNavGraph$lambda$3(HelpCenterViewModel viewModel, List collectionIds, r2 navController, Context context, g2 NavHost) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "$collectionIds");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        androidx.navigation.compose.t.f(NavHost, "COLLECTIONS", null, null, null, null, null, null, null, androidx.compose.runtime.internal.w.c(-1869047411, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$1(viewModel, collectionIds, navController)), com.planner5d.library.engine.input.f.b.X1, null);
        androidx.navigation.compose.t.f(NavHost, "COLLECTION_DETAILS/{id}?startDestination={startDestination}", CollectionsKt.listOf((Object[]) new androidx.navigation.b0[]{androidx.navigation.c0.a("id", new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt.HelpCenterNavGraph$lambda$3$lambda$1((k0) obj);
            }
        }), androidx.navigation.c0.a(START_DESTINATION, new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterScreenKt.HelpCenterNavGraph$lambda$3$lambda$2((k0) obj);
            }
        })}), null, null, null, null, null, null, androidx.compose.runtime.internal.w.c(2018839094, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$4(viewModel, context, navController)), com.planner5d.library.engine.input.f.b.V1, null);
        androidx.navigation.compose.t.f(NavHost, "COLLECTION_DETAILS", null, null, null, null, null, null, null, androidx.compose.runtime.internal.w.c(-157077227, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$5(viewModel, collectionIds, context, navController)), com.planner5d.library.engine.input.f.b.X1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterNavGraph$lambda$3$lambda$1(k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.StringType);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterNavGraph$lambda$3$lambda$2(k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.BoolType);
        navArgument.f(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterNavGraph$lambda$4(HelpCenterViewModel viewModel, r2 navController, String startDestination, List collectionIds, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(startDestination, "$startDestination");
        Intrinsics.checkNotNullParameter(collectionIds, "$collectionIds");
        HelpCenterNavGraph(viewModel, navController, startDestination, collectionIds, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterScreen(@NotNull final HelpCenterViewModel viewModel, @NotNull final List<String> collectionIds, @NotNull final Function0<Unit> onCloseClick, @androidx.annotation.v final int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1421214035);
        a1.e(AndroidCompositionLocals_androidKt.g().f(viewModel.localizedContext((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()))), androidx.compose.runtime.internal.w.e(-267860845, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt.HelpCenterScreen.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1, reason: invalid class name and collision with other inner class name */
            static final class C20231 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ r2 $navController;
                final /* synthetic */ int $navIcon;
                final /* synthetic */ Function0<Unit> $onCloseClick;
                final /* synthetic */ HelpCenterViewModel $viewModel;

                C20231(r2 r2Var, int i10, HelpCenterViewModel helpCenterViewModel, Function0<Unit> function0, Context context) {
                    this.$navController = r2Var;
                    this.$navIcon = i10;
                    this.$viewModel = helpCenterViewModel;
                    this.$onCloseClick = function0;
                    this.$context = context;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$0(r2 navController, Function0 onCloseClick) {
                    Intrinsics.checkNotNullParameter(navController, "$navController");
                    Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
                    if (navController.Q() == null) {
                        onCloseClick.invoke();
                    } else {
                        navController.z0();
                    }
                    return Unit.f312394a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1(Context context) {
                    Intrinsics.checkNotNullParameter(context, "$context");
                    context.startActivity(IntercomArticleSearchActivity.Companion.buildIntent(context, false));
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                    invoke(c0Var, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
                    if ((i10 & 11) == 2 && c0Var.d()) {
                        c0Var.u();
                        return;
                    }
                    final r2 r2Var = this.$navController;
                    final Function0<Unit> function0 = this.$onCloseClick;
                    Function0 function1 = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.c0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HelpCenterScreenKt.AnonymousClass1.C20231.invoke$lambda$0(r2Var, function0);
                        }
                    };
                    final Context context = this.$context;
                    HelpCenterTopBarKt.HelpCenterTopBar(function1, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.d0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HelpCenterScreenKt.AnonymousClass1.C20231.invoke$lambda$1(context);
                        }
                    }, this.$navController.Q() == null ? this.$navIcon : R.drawable.intercom_ic_back, this.$viewModel.getScreenTitle(), c0Var, StringProvider.$stable << 9, 0);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var2, int i12) {
                if ((i12 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                final r2 r2VarB = androidx.navigation.compose.u.b(new q3[0], c0Var2, 8);
                Context context = (Context) c0Var2.W(AndroidCompositionLocals_androidKt.g());
                androidx.compose.ui.a0 a0VarH = t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0Var2, 8));
                androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(1261102927, true, new C20231(r2VarB, i10, viewModel, onCloseClick, context), c0Var2, 54);
                final List<String> list = collectionIds;
                final HelpCenterViewModel helpCenterViewModel = viewModel;
                pt.f(a0VarH, cVarE, null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(900356900, true, new pj.n<g5, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt.HelpCenterScreen.1.2
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(g5Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(g5 paddingValues, androidx.compose.runtime.c0 c0Var3, int i13) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i13 & 14) == 0) {
                            i13 |= c0Var3.D(paddingValues) ? 4 : 2;
                        }
                        if ((i13 & 91) == 18 && c0Var3.d()) {
                            c0Var3.u();
                        } else {
                            HelpCenterScreenKt.HelpCenterNavGraph(helpCenterViewModel, r2VarB, list.size() == 1 ? "COLLECTION_DETAILS" : "COLLECTIONS", list, d5.p(androidx.compose.ui.a0.E, paddingValues), c0Var3, 4168, 0);
                        }
                    }
                }, c0Var2, 54), c0Var2, 805306416, androidx.constraintlayout.core.motion.utils.v.g.f44096p);
            }
        }, c0VarR, 54), c0VarR, n4.f36267i | 48);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterScreenKt.HelpCenterScreen$lambda$0(viewModel, collectionIds, onCloseClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterScreen$lambda$0(HelpCenterViewModel viewModel, List collectionIds, Function0 onCloseClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "$collectionIds");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        HelpCenterScreen(viewModel, collectionIds, onCloseClick, i10, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }
}
