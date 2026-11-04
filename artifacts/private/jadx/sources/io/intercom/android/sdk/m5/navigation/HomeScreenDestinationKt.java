package io.intercom.android.sdk.m5.navigation;

import androidx.navigation.x3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class HomeScreenDestinationKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nHomeScreenDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeScreenDestination.kt\nio/intercom/android/sdk/m5/navigation/HomeScreenDestinationKt$homeScreen$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,165:1\n75#2:166\n*S KotlinDebug\n*F\n+ 1 HomeScreenDestination.kt\nio/intercom/android/sdk/m5/navigation/HomeScreenDestinationKt$homeScreen$1\n*L\n31#1:166\n*E\n"})
    static final class AnonymousClass1 implements pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ androidx.navigation.r2 $navController;
        final /* synthetic */ androidx.activity.l $rootActivity;
        final /* synthetic */ kotlinx.coroutines.s0 $scope;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$12, reason: invalid class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$12", f = "HomeScreenDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass12 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;

            AnonymousClass12(kotlin.coroutines.d<? super AnonymousClass12> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass12(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Injector.get().getMetricTracker().viewedSpace("home");
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass12) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        AnonymousClass1(androidx.activity.l lVar, androidx.navigation.r2 r2Var, kotlinx.coroutines.s0 s0Var) {
            this.$rootActivity = lVar;
            this.$navController = r2Var;
            this.$scope = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$0(androidx.navigation.r2 navController) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Injector.get().getMetricTracker().clickedSpace("messages");
            IntercomRouterKt.openMessages$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1(androidx.navigation.r2 navController) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Injector.get().getMetricTracker().clickedSpace("help");
            IntercomRouterKt.openHelpCenter$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null), false, 2, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12(androidx.navigation.r2 navController, String conversationId) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            invoke$openConversation(navController, conversationId, androidx.navigation.b3.a(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$12$lambda$11((androidx.navigation.a3) obj);
                }
            }), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(androidx.navigation.a3 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.p("HOME", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$12$lambda$11$lambda$10((x3) obj);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11$lambda$10(x3 popUpTo) {
            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
            popUpTo.c(false);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13(androidx.navigation.r2 navController) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Injector.get().getMetricTracker().viewedNewConversation("home");
            IntercomRouterKt.openNewConversation$default(navController, false, null, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null), 3, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14(androidx.navigation.r2 navController, Conversation it) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(it, "it");
            invoke$openConversation$default(navController, it.getId(), null, null, 12, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15(kotlinx.coroutines.s0 scope, androidx.activity.l rootActivity) {
            Intrinsics.checkNotNullParameter(scope, "$scope");
            Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
            kotlinx.coroutines.k.f(scope, null, null, new HomeScreenDestinationKt$homeScreen$1$10$1(rootActivity, null), 3, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$16(androidx.navigation.r2 navController, TicketType it) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(it, "it");
            IntercomRouterKt.openCreateTicketsScreen(navController, it, null, MetricTracker.Context.HOME_SCREEN);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2(androidx.navigation.r2 navController) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            IntercomRouterKt.openTicketList$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3(androidx.navigation.r2 navController, String ticketId) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            IntercomRouterKt.openTicketDetailScreen$default(navController, ticketId, "home", new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), false, 8, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6(androidx.navigation.r2 navController) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            navController.w0("MESSAGES", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$6$lambda$5((androidx.navigation.a3) obj);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(androidx.navigation.a3 navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
            navigate.p("HOME", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4((x3) obj);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(x3 popUpTo) {
            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
            popUpTo.c(true);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9(androidx.navigation.r2 navController) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            IntercomRouterKt.openNewConversation(navController, false, androidx.navigation.b3.a(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$9$lambda$8((androidx.navigation.a3) obj);
                }
            }), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(androidx.navigation.a3 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.p("HOME", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.u0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$9$lambda$8$lambda$7((x3) obj);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8$lambda$7(x3 popUpTo) {
            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
            popUpTo.c(false);
            return Unit.f312394a;
        }

        private static final void invoke$openConversation(androidx.navigation.r2 r2Var, String str, androidx.navigation.w2 w2Var, TransitionArgs transitionArgs) {
            Injector.get().getMetricTracker().viewedConversation("home", str);
            IntercomRouterKt.openConversation$default(r2Var, str, null, false, null, w2Var, transitionArgs, 14, null);
        }

        static /* synthetic */ void invoke$openConversation$default(androidx.navigation.r2 r2Var, String str, androidx.navigation.w2 w2Var, TransitionArgs transitionArgs, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                w2Var = null;
            }
            if ((i10 & 8) != 0) {
                transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
            }
            invoke$openConversation(r2Var, str, w2Var, transitionArgs);
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(gVar, n0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.animation.g composable, androidx.navigation.n0 it, androidx.compose.runtime.c0 c0Var, int i10) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(it, "it");
            androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) c0Var.W(androidx.lifecycle.compose.d0.c());
            androidx.lifecycle.m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0Var, androidx.lifecycle.viewmodel.compose.b.f52545c);
            if (m2VarC == null) {
                m2VarC = this.$rootActivity;
            }
            HomeViewModel homeViewModelCreate = HomeViewModel.Companion.create(m2VarC, o0Var.getLifecycle());
            final androidx.navigation.r2 r2Var = this.$navController;
            Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$0(r2Var);
                }
            };
            final androidx.navigation.r2 r2Var2 = this.$navController;
            Function0 function1 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$1(r2Var2);
                }
            };
            final androidx.navigation.r2 r2Var3 = this.$navController;
            Function0 function2 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.c1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$2(r2Var3);
                }
            };
            final androidx.navigation.r2 r2Var4 = this.$navController;
            Function1 function3 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$3(r2Var4, (String) obj);
                }
            };
            final androidx.navigation.r2 r2Var5 = this.$navController;
            Function0 function4 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.o0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$6(r2Var5);
                }
            };
            final androidx.navigation.r2 r2Var6 = this.$navController;
            Function0 function5 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$9(r2Var6);
                }
            };
            final androidx.navigation.r2 r2Var7 = this.$navController;
            Function1 function6 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$12(r2Var7, (String) obj);
                }
            };
            final androidx.navigation.r2 r2Var8 = this.$navController;
            Function0 function7 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$13(r2Var8);
                }
            };
            final androidx.navigation.r2 r2Var9 = this.$navController;
            Function1 function8 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$14(r2Var9, (Conversation) obj);
                }
            };
            final kotlinx.coroutines.s0 s0Var = this.$scope;
            final androidx.activity.l lVar = this.$rootActivity;
            Function0 function9 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.t0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$15(s0Var, lVar);
                }
            };
            final androidx.navigation.r2 r2Var10 = this.$navController;
            HomeScreenKt.HomeScreen(homeViewModelCreate, function0, function1, function2, function3, function4, function5, function6, function7, function8, function9, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.a1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$16(r2Var10, (TicketType) obj);
                }
            }, c0Var, 8, 0);
            androidx.compose.runtime.b2.i("", new AnonymousClass12(null), c0Var, 70);
        }
    }

    public static final void homeScreen(@NotNull androidx.navigation.g2 g2Var, @NotNull androidx.navigation.r2 navController, @NotNull androidx.activity.l rootActivity, @NotNull kotlinx.coroutines.s0 scope) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        Intrinsics.checkNotNullParameter(scope, "scope");
        androidx.navigation.compose.t.f(g2Var, "HOME", null, null, null, null, null, null, null, androidx.compose.runtime.internal.w.c(1180315695, true, new AnonymousClass1(rootActivity, navController, scope)), com.planner5d.library.engine.input.f.b.X1, null);
    }
}
