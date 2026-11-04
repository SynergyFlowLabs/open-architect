package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.l3;
import androidx.navigation.d3;
import androidx.navigation.x3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
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
public final class MessagesDestinationKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nMessagesDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagesDestination.kt\nio/intercom/android/sdk/m5/navigation/MessagesDestinationKt$messagesDestination$7\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,150:1\n1282#2,6:151\n*S KotlinDebug\n*F\n+ 1 MessagesDestination.kt\nio/intercom/android/sdk/m5/navigation/MessagesDestinationKt$messagesDestination$7\n*L\n83#1:151,6\n*E\n"})
    static final class AnonymousClass7 implements pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ androidx.navigation.r2 $navController;
        final /* synthetic */ androidx.activity.l $rootActivity;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$5, reason: invalid class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$5", f = "MessagesDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;

            AnonymousClass5(kotlin.coroutines.d<? super AnonymousClass5> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass5(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Injector.get().getMetricTracker().viewedSpace("messages");
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass5) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        AnonymousClass7(androidx.activity.l lVar, androidx.navigation.r2 r2Var) {
            this.$rootActivity = lVar;
            this.$navController = r2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3(androidx.navigation.r2 navController, boolean z10) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Injector.get().getMetricTracker().viewedNewConversation("messages");
            IntercomRouterKt.openNewConversation$default(navController, z10, androidx.navigation.b3.a(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.r1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$3$lambda$2((androidx.navigation.a3) obj);
                }
            }), null, 4, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(androidx.navigation.a3 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.p("CONVERSATION", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$3$lambda$2$lambda$1((x3) obj);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(x3 popUpTo) {
            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
            popUpTo.c(true);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4(androidx.navigation.r2 navController) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            androidx.navigation.w0.y0(navController, "HELP_CENTER", null, null, 6, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5(androidx.navigation.r2 navController, androidx.activity.l rootActivity) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
            if (navController.Q() == null) {
                rootActivity.finish();
            } else {
                navController.z0();
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8(boolean z10, androidx.navigation.r2 navController, InboxUiEffects.NavigateToConversation it) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(it, "it");
            Injector.get().getMetricTracker().viewedConversation("messages", it.getConversation().getId());
            IntercomRouterKt.openConversation$default(navController, it.getConversation().getId(), null, z10, null, androidx.navigation.b3.a(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.w1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$8$lambda$7((androidx.navigation.a3) obj);
                }
            }), z10 ? new TransitionArgs(null, null, null, null, 15, null) : new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), 10, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(androidx.navigation.a3 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.p("CONVERSATION", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.q1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$8$lambda$7$lambda$6((x3) obj);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(x3 popUpTo) {
            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
            popUpTo.c(true);
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
            int i11;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(it, "it");
            InboxViewModel.Companion companion = InboxViewModel.Companion;
            androidx.lifecycle.m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0Var, androidx.lifecycle.viewmodel.compose.b.f52545c);
            if (m2VarC == null) {
                m2VarC = this.$rootActivity;
            }
            InboxViewModel inboxViewModelCreate = companion.create(m2VarC);
            Bundle bundleB = it.b();
            final boolean z10 = bundleB != null ? bundleB.getBoolean("isLaunchedProgrammatically") : false;
            c0Var.E(596908281);
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
            c0Var.A();
            final androidx.navigation.r2 r2Var2 = this.$navController;
            Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.s1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$3(r2Var2, z10);
                }
            };
            final androidx.navigation.r2 r2Var3 = this.$navController;
            Function0 function1 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.t1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$4(r2Var3);
                }
            };
            final androidx.navigation.r2 r2Var4 = this.$navController;
            final androidx.activity.l lVar = this.$rootActivity;
            Function0 function2 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.u1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$5(r2Var4, lVar);
                }
            };
            final androidx.navigation.r2 r2Var5 = this.$navController;
            InboxScreenKt.InboxScreen(inboxViewModelCreate, function0, function1, function2, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.v1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MessagesDestinationKt.AnonymousClass7.invoke$lambda$8(z10, r2Var5, (InboxUiEffects.NavigateToConversation) obj);
                }
            }, ((l3) objI0).m1(), c0Var, 8);
            androidx.compose.runtime.b2.i("", new AnonymousClass5(null), c0Var, 70);
        }
    }

    public static final void messagesDestination(@NotNull androidx.navigation.g2 g2Var, @NotNull androidx.navigation.r2 navController, @NotNull androidx.activity.l rootActivity) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        androidx.navigation.compose.t.f(g2Var, "MESSAGES?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new androidx.navigation.b0[]{androidx.navigation.c0.a("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessagesDestinationKt.messagesDestination$lambda$0((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessagesDestinationKt.messagesDestination$lambda$1((androidx.navigation.k0) obj);
            }
        })}), null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessagesDestinationKt.messagesDestination$lambda$2((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessagesDestinationKt.messagesDestination$lambda$3((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessagesDestinationKt.messagesDestination$lambda$4((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessagesDestinationKt.messagesDestination$lambda$5((androidx.compose.animation.i) obj);
            }
        }, null, androidx.compose.runtime.internal.w.c(559331213, true, new AnonymousClass7(rootActivity, navController)), 132, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit messagesDestination$lambda$0(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(TransitionStyleKt.getTransitionArgNavType());
        navArgument.f(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit messagesDestination$lambda$1(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.BoolType);
        navArgument.f(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 messagesDestination$lambda$2(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 messagesDestination$lambda$3(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 messagesDestination$lambda$4(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        boolean z10 = false & false;
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 messagesDestination$lambda$5(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }
}
