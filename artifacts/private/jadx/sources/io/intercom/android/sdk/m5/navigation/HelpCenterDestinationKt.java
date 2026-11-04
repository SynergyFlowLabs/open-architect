package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.l3;
import androidx.navigation.d3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class HelpCenterDestinationKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nHelpCenterDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterDestination.kt\nio/intercom/android/sdk/m5/navigation/HelpCenterDestinationKt$helpCenterDestination$7\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,110:1\n1282#2,6:111\n*S KotlinDebug\n*F\n+ 1 HelpCenterDestination.kt\nio/intercom/android/sdk/m5/navigation/HelpCenterDestinationKt$helpCenterDestination$7\n*L\n78#1:111,6\n*E\n"})
    static final class AnonymousClass7 implements pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
        final /* synthetic */ androidx.navigation.r2 $navController;
        final /* synthetic */ androidx.activity.l $rootActivity;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$2, reason: invalid class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$2", f = "HelpCenterDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;

            AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass2(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Injector.get().getMetricTracker().viewedSpace("help");
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        AnonymousClass7(androidx.activity.l lVar, IntercomRootActivityArgs intercomRootActivityArgs, androidx.navigation.r2 r2Var) {
            this.$rootActivity = lVar;
            this.$intercomRootActivityArgs = intercomRootActivityArgs;
            this.$navController = r2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1(androidx.navigation.r2 navController, androidx.activity.l rootActivity) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
            if (navController.Q() == null) {
                rootActivity.finish();
            } else {
                navController.z0();
            }
            return Unit.f312394a;
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(gVar, n0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.animation.g composable, androidx.navigation.n0 it, androidx.compose.runtime.c0 c0Var, int i10) {
            List<String> listListOf;
            int i11;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(it, "it");
            Bundle bundleB = it.b();
            boolean z10 = bundleB != null ? bundleB.getBoolean("isLaunchedProgrammatically") : false;
            HelpCenterViewModel.Companion companion = HelpCenterViewModel.Companion;
            androidx.activity.l lVar = this.$rootActivity;
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            Intrinsics.checkNotNullExpressionValue(helpCenterApi, "getHelpCenterApi(...)");
            HelpCenterViewModel helpCenterViewModelCreate = companion.create(lVar, helpCenterApi, MetricTracker.Place.COLLECTION_LIST);
            c0Var.E(-102150257);
            androidx.navigation.r2 r2Var = this.$navController;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                if (r2Var.Q() == null) {
                    i11 = R.drawable.intercom_ic_close;
                } else {
                    i11 = z10 ? R.drawable.intercom_ic_chevron_down : R.drawable.intercom_ic_back;
                }
                objI0 = e6.b(i11);
                c0Var.Y(objI0);
            }
            l3 l3Var = (l3) objI0;
            c0Var.A();
            IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
            if (intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionsArgs) {
                listListOf = ((IntercomRootActivityArgs.HelpCenterCollectionsArgs) intercomRootActivityArgs).getCollectionIds();
            } else {
                listListOf = intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionArgs ? CollectionsKt.listOf(((IntercomRootActivityArgs.HelpCenterCollectionArgs) intercomRootActivityArgs).getCollectionId()) : CollectionsKt.emptyList();
            }
            List<String> list = listListOf;
            final androidx.navigation.r2 r2Var2 = this.$navController;
            final androidx.activity.l lVar2 = this.$rootActivity;
            HelpCenterScreenKt.HelpCenterScreen(helpCenterViewModelCreate, list, new Function0() { // from class: io.intercom.android.sdk.m5.navigation.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HelpCenterDestinationKt.AnonymousClass7.invoke$lambda$1(r2Var2, lVar2);
                }
            }, l3Var.m1(), c0Var, 72);
            androidx.compose.runtime.b2.i("", new AnonymousClass2(null), c0Var, 70);
        }
    }

    public static final void helpCenterDestination(@NotNull androidx.navigation.g2 g2Var, @NotNull androidx.activity.l rootActivity, @NotNull androidx.navigation.r2 navController, @NotNull IntercomRootActivityArgs intercomRootActivityArgs) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(intercomRootActivityArgs, "intercomRootActivityArgs");
        androidx.navigation.compose.t.f(g2Var, "HELP_CENTER?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new androidx.navigation.b0[]{androidx.navigation.c0.a("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterDestinationKt.helpCenterDestination$lambda$0((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterDestinationKt.helpCenterDestination$lambda$1((androidx.navigation.k0) obj);
            }
        })}), null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterDestinationKt.helpCenterDestination$lambda$2((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterDestinationKt.helpCenterDestination$lambda$3((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterDestinationKt.helpCenterDestination$lambda$4((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterDestinationKt.helpCenterDestination$lambda$5((androidx.compose.animation.i) obj);
            }
        }, null, androidx.compose.runtime.internal.w.c(-2139595832, true, new AnonymousClass7(rootActivity, intercomRootActivityArgs, navController)), 132, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit helpCenterDestination$lambda$0(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(TransitionStyleKt.getTransitionArgNavType());
        navArgument.f(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit helpCenterDestination$lambda$1(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.BoolType);
        navArgument.g(false);
        navArgument.f(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 helpCenterDestination$lambda$2(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 helpCenterDestination$lambda$3(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        int i10 = 4 & 0;
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 helpCenterDestination$lambda$4(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 helpCenterDestination$lambda$5(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }
}
