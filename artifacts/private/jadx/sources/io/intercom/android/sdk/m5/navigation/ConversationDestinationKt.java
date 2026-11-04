package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.i6;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.d3;
import androidx.navigation.x3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationDestination.kt\nio/intercom/android/sdk/m5/navigation/ConversationDestinationKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,281:1\n75#2:282\n75#2:283\n66#3,5:284\n*S KotlinDebug\n*F\n+ 1 ConversationDestination.kt\nio/intercom/android/sdk/m5/navigation/ConversationDestinationKt\n*L\n253#1:282\n254#1:283\n275#1:284,5\n*E\n"})
public final class ConversationDestinationKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.c0.a.values().length];
            try {
                iArr[androidx.lifecycle.c0.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.c0.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11, reason: invalid class name */
    static final class AnonymousClass11 implements pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ androidx.navigation.r2 $navController;
        final /* synthetic */ androidx.activity.l $rootActivity;

        AnonymousClass11(androidx.activity.l lVar, androidx.navigation.r2 r2Var) {
            this.$rootActivity = lVar;
            this.$navController = r2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1(androidx.navigation.r2 navController, androidx.activity.l rootActivity) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
            if (navController.Q() == null) {
                rootActivity.getOnBackPressedDispatcher().p();
            } else {
                navController.z0();
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2(androidx.navigation.r2 navController) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Injector.get().getMetricTracker().viewedNewConversation(MetricTracker.Context.FROM_CONVERSATION);
            IntercomRouterKt.openNewConversation$default(navController, false, null, null, 7, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3(androidx.navigation.r2 navController, kotlin.jvm.internal.i1.a isLaunchedProgrammatically) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
            IntercomRouterKt.openTicketDetailScreen$default(navController, false, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), isLaunchedProgrammatically.f312744a, 1, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4(androidx.navigation.r2 navController, kotlin.jvm.internal.i1.a isLaunchedProgrammatically, String ticketId) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            IntercomRouterKt.openTicketDetailScreen(navController, ticketId, MetricTracker.Context.HOME_SCREEN, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), isLaunchedProgrammatically.f312744a);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5(androidx.navigation.r2 navController, ConversationViewModel conversationViewModel, TicketType ticketType) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
            Intrinsics.checkNotNullParameter(ticketType, "ticketType");
            IntercomRouterKt.openCreateTicketsScreen(navController, ticketType, conversationViewModel.getConversationId(), MetricTracker.Context.FROM_CONVERSATION);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6(androidx.navigation.r2 navController, kotlin.jvm.internal.i1.a isLaunchedProgrammatically, HeaderMenuItem headerMenuItem) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
            Intrinsics.checkNotNullParameter(headerMenuItem, "headerMenuItem");
            if (headerMenuItem instanceof HeaderMenuItem.Messages) {
                int i10 = 7 >> 0;
                IntercomRouterKt.openMessages(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), isLaunchedProgrammatically.f312744a);
            } else if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
                IntercomRouterKt.openNewConversation$default(navController, isLaunchedProgrammatically.f312744a, null, null, 6, null);
            } else if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
                IntercomRouterKt.openTicketList(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_OUT_LEFT, EnterTransitionStyle.SLIDE_IN_RIGHT, ExitTransitionStyle.SLIDE_DOWN), true);
            } else {
                if (!(headerMenuItem instanceof HeaderMenuItem.Help)) {
                    throw new kotlin.k0();
                }
                int i11 = 6 | 0;
                IntercomRouterKt.openHelpCenter(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), true);
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9(androidx.navigation.r2 navController, kotlin.jvm.internal.i1.a isLaunchedProgrammatically, String it) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z10 = isLaunchedProgrammatically.f312744a;
            IntercomRouterKt.openConversation$default(navController, it, null, z10, null, z10 ? androidx.navigation.b3.a(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$9$lambda$8((androidx.navigation.a3) obj);
                }
            }) : null, null, 42, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(androidx.navigation.a3 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.p("CONVERSATION", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$9$lambda$8$lambda$7((x3) obj);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8$lambda$7(x3 popUpTo) {
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
        public final void invoke(androidx.compose.animation.g composable, androidx.navigation.n0 backStackEntry, androidx.compose.runtime.c0 c0Var, int i10) {
            String articleId;
            String articleTitle;
            String str;
            String encodedInitialMessage;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            final kotlin.jvm.internal.i1.a aVar = new kotlin.jvm.internal.i1.a();
            Intent intent = this.$rootActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
            IntercomRootActivityArgs.ConversationScreenArgs conversationScreenArgs = argsForIntent instanceof IntercomRootActivityArgs.ConversationScreenArgs ? (IntercomRootActivityArgs.ConversationScreenArgs) argsForIntent : null;
            Bundle bundleB = backStackEntry.b();
            if (bundleB != null && bundleB.containsKey("conversationId")) {
                Bundle bundleB2 = backStackEntry.b();
                String string = bundleB2 != null ? bundleB2.getString("conversationId") : null;
                Bundle bundleB3 = backStackEntry.b();
                encodedInitialMessage = bundleB3 != null ? bundleB3.getString("initialMessage") : null;
                Bundle bundleB4 = backStackEntry.b();
                articleId = bundleB4 != null ? bundleB4.getString("articleId") : null;
                Bundle bundleB5 = backStackEntry.b();
                articleTitle = bundleB5 != null ? bundleB5.getString("articleTitle") : null;
                Bundle bundleB6 = backStackEntry.b();
                aVar.f312744a = bundleB6 != null ? bundleB6.getBoolean("isLaunchedProgrammatically") : false;
                str = string;
            } else if (conversationScreenArgs != null) {
                String conversationId = conversationScreenArgs.getConversationId();
                encodedInitialMessage = conversationScreenArgs.getEncodedInitialMessage();
                aVar.f312744a = conversationScreenArgs.isLaunchedProgrammatically();
                articleId = conversationScreenArgs.getArticleId();
                articleTitle = conversationScreenArgs.getArticleTitle();
                str = conversationId;
            } else {
                articleId = null;
                articleTitle = null;
                str = null;
                encodedInitialMessage = "";
            }
            androidx.lifecycle.m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0Var, androidx.lifecycle.viewmodel.compose.b.f52545c);
            if (m2VarC == null) {
                m2VarC = this.$rootActivity;
            }
            final ConversationViewModel conversationViewModel = ConversationDestinationKt.getConversationViewModel(m2VarC, str, encodedInitialMessage == null ? "" : encodedInitialMessage, aVar.f312744a, articleId != null ? new ArticleMetadata(articleId, articleTitle) : null, c0Var, 8, 0);
            androidx.compose.ui.a0 a0VarF = i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null);
            final androidx.navigation.r2 r2Var = this.$navController;
            final androidx.activity.l lVar = this.$rootActivity;
            Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$1(r2Var, lVar);
                }
            };
            final androidx.navigation.r2 r2Var2 = this.$navController;
            Function0 function1 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$2(r2Var2);
                }
            };
            final androidx.navigation.r2 r2Var3 = this.$navController;
            Function0 function2 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$3(r2Var3, aVar);
                }
            };
            final androidx.navigation.r2 r2Var4 = this.$navController;
            Function1 function3 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$4(r2Var4, aVar, (String) obj);
                }
            };
            final androidx.navigation.r2 r2Var5 = this.$navController;
            Function1 function4 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$5(r2Var5, conversationViewModel, (TicketType) obj);
                }
            };
            final androidx.navigation.r2 r2Var6 = this.$navController;
            Function1 function5 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$6(r2Var6, aVar, (HeaderMenuItem) obj);
                }
            };
            final androidx.navigation.r2 r2Var7 = this.$navController;
            ConversationScreenKt.ConversationScreen(conversationViewModel, a0VarF, function0, function1, function2, function3, function4, function5, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$9(r2Var7, aVar, (String) obj);
                }
            }, c0Var, 56, 0);
        }
    }

    public static final void conversationDestination(@NotNull androidx.navigation.g2 g2Var, @NotNull androidx.navigation.r2 navController, @NotNull androidx.activity.l rootActivity) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        androidx.navigation.compose.t.f(g2Var, "CONVERSATION?conversationId={conversationId}&initialMessage={initialMessage}&articleId={articleId}&articleTitle={articleTitle}&isLaunchedProgrammatically={isLaunchedProgrammatically}&transitionArgs={transitionArgs}", CollectionsKt.listOf((Object[]) new androidx.navigation.b0[]{androidx.navigation.c0.a("conversationId", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$0((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("initialMessage", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$1((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("articleId", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$2((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("articleTitle", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$3((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$4((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$5((androidx.navigation.k0) obj);
            }
        })}), null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$6((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$7((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$8((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.conversationDestination$lambda$9((androidx.compose.animation.i) obj);
            }
        }, null, androidx.compose.runtime.internal.w.c(-1198092933, true, new AnonymousClass11(rootActivity, navController)), 132, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$0(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.StringType);
        navArgument.g(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$1(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.StringType);
        navArgument.g(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$2(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.StringType);
        navArgument.g(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$3(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.StringType);
        navArgument.g(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$4(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.BoolType);
        navArgument.g(false);
        navArgument.f(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$5(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(TransitionStyleKt.getTransitionArgNavType());
        navArgument.g(false);
        int i10 = 2 | 0;
        navArgument.f(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 conversationDestination$lambda$6(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 conversationDestination$lambda$7(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 conversationDestination$lambda$8(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 conversationDestination$lambda$9(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final ConversationViewModel getConversationViewModel(androidx.lifecycle.m2 m2Var, String str, String str2, boolean z10, ArticleMetadata articleMetadata, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        c0Var.E(-1203114984);
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i11 & 16) != 0) {
            articleMetadata = null;
        }
        ArticleMetadata articleMetadata2 = articleMetadata;
        final androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) c0Var.W(androidx.lifecycle.compose.d0.c());
        final Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        final ConversationViewModel conversationViewModelCreate = ConversationViewModel.Companion.create(m2Var, str, str3, articleMetadata2, z10 ? LaunchMode.PROGRAMMATIC : LaunchMode.CLASSIC);
        androidx.compose.runtime.b2.d(o0Var, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationDestinationKt.getConversationViewModel$lambda$12(o0Var, conversationViewModelCreate, context, (androidx.compose.runtime.v1) obj);
            }
        }, c0Var, 8);
        c0Var.A();
        return conversationViewModelCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 getConversationViewModel$lambda$12(final androidx.lifecycle.o0 lifecycleOwner, final ConversationViewModel viewModel, final Context context, androidx.compose.runtime.v1 DisposableEffect) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0() { // from class: io.intercom.android.sdk.m5.navigation.d
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
                ConversationDestinationKt.getConversationViewModel$lambda$12$lambda$10(viewModel, context, o0Var, aVar);
            }
        };
        lifecycleOwner.getLifecycle().c(j0Var);
        return new androidx.compose.runtime.u1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$getConversationViewModel$lambda$12$$inlined$onDispose$1
            @Override // androidx.compose.runtime.u1
            public void dispose() {
                lifecycleOwner.getLifecycle().g(j0Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getConversationViewModel$lambda$12$lambda$10(ConversationViewModel viewModel, Context context, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(o0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            viewModel.onResume(context);
        } else {
            if (i10 != 2) {
                return;
            }
            viewModel.onPause(context);
        }
    }
}
