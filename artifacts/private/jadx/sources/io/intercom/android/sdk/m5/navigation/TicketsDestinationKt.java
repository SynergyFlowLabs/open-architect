package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.l3;
import androidx.navigation.d3;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenEffects;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel;
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
public final class TicketsDestinationKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nTicketsDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketsDestination.kt\nio/intercom/android/sdk/m5/navigation/TicketsDestinationKt$ticketsDestination$7\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,156:1\n75#2:157\n1282#3,6:158\n66#4,5:164\n*S KotlinDebug\n*F\n+ 1 TicketsDestination.kt\nio/intercom/android/sdk/m5/navigation/TicketsDestinationKt$ticketsDestination$7\n*L\n92#1:157\n108#1:158,6\n103#1:164,5\n*E\n"})
    static final class AnonymousClass7 implements pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ androidx.navigation.r2 $navController;
        final /* synthetic */ androidx.activity.l $rootActivity;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$1, reason: invalid class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$1", f = "TicketsDestination.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ androidx.paging.compose.b<TicketRowData> $lazyPagingItems;
            final /* synthetic */ TicketsScreenViewModel $viewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TicketsScreenViewModel ticketsScreenViewModel, androidx.paging.compose.b<TicketRowData> bVar, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$viewModel = ticketsScreenViewModel;
                this.$lazyPagingItems = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.$viewModel, this.$lazyPagingItems, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.o0<TicketsScreenEffects> effect = this.$viewModel.getEffect();
                    final androidx.paging.compose.b<TicketRowData> bVar = this.$lazyPagingItems;
                    kotlinx.coroutines.flow.j<? super TicketsScreenEffects> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt.ticketsDestination.7.1.1
                        @Override // kotlinx.coroutines.flow.j
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                            return emit((TicketsScreenEffects) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                        }

                        public final Object emit(TicketsScreenEffects ticketsScreenEffects, kotlin.coroutines.d<? super Unit> dVar) {
                            if (!Intrinsics.areEqual(ticketsScreenEffects, TicketsScreenEffects.RefreshTickets.INSTANCE)) {
                                throw new kotlin.k0();
                            }
                            bVar.k();
                            return Unit.f312394a;
                        }
                    };
                    this.label = 1;
                    if (effect.collect(jVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                throw new kotlin.a0();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$5, reason: invalid class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$5", f = "TicketsDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
                Injector.get().getMetricTracker().viewedSpace("tickets");
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
        public static final androidx.compose.runtime.u1 invoke$lambda$2(final androidx.lifecycle.o0 lifecycleOwner, final androidx.paging.compose.b lazyPagingItems, androidx.compose.runtime.v1 DisposableEffect) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
            Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0() { // from class: io.intercom.android.sdk.m5.navigation.y2
                @Override // androidx.lifecycle.j0
                public final void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
                    TicketsDestinationKt.AnonymousClass7.invoke$lambda$2$lambda$0(lazyPagingItems, o0Var, aVar);
                }
            };
            lifecycleOwner.getLifecycle().c(j0Var);
            return new androidx.compose.runtime.u1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$invoke$lambda$2$$inlined$onDispose$1
                @Override // androidx.compose.runtime.u1
                public void dispose() {
                    lifecycleOwner.getLifecycle().g(j0Var);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2$lambda$0(androidx.paging.compose.b lazyPagingItems, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a event) {
            Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
            Intrinsics.checkNotNullParameter(o0Var, "<unused var>");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == androidx.lifecycle.c0.a.ON_RESUME && (lazyPagingItems.i().e() instanceof androidx.paging.x0.c)) {
                lazyPagingItems.k();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4(androidx.navigation.r2 navController, androidx.activity.l rootActivity) {
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
        public static final Unit invoke$lambda$5(boolean z10, androidx.navigation.r2 navController, String ticketId) {
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            IntercomRouterKt.openTicketDetailScreen$default(navController, ticketId, MetricTracker.Context.FROM_TICKETS_SPACE, z10 ? new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_DOWN, EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT) : new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), false, 8, null);
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
            TicketsScreenViewModel.Companion companion = TicketsScreenViewModel.Companion;
            androidx.lifecycle.m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0Var, androidx.lifecycle.viewmodel.compose.b.f52545c);
            if (m2VarC == null) {
                m2VarC = this.$rootActivity;
            }
            TicketsScreenViewModel ticketsScreenViewModelCreate = companion.create(m2VarC);
            Bundle bundleB = it.b();
            final boolean z10 = bundleB != null ? bundleB.getBoolean("isLaunchedProgrammatically") : false;
            final androidx.paging.compose.b bVarB = androidx.paging.compose.c.b(ticketsScreenViewModelCreate.getPagerFlow(), null, c0Var, 8, 1);
            TicketsScreenUiState ticketsScreenUiStateReduceToTicketsScreenUiState = TicketsListReducerKt.reduceToTicketsScreenUiState(bVarB, null, c0Var, androidx.paging.compose.b.f71648f, 1);
            androidx.compose.runtime.b2.i(null, new AnonymousClass1(ticketsScreenViewModelCreate, bVarB, null), c0Var, 70);
            final androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) c0Var.W(androidx.lifecycle.compose.d0.c());
            androidx.compose.runtime.b2.d(o0Var, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.z2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TicketsDestinationKt.AnonymousClass7.invoke$lambda$2(o0Var, bVarB, (androidx.compose.runtime.v1) obj);
                }
            }, c0Var, 8);
            c0Var.E(834702382);
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
            final androidx.activity.l lVar = this.$rootActivity;
            Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.a3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TicketsDestinationKt.AnonymousClass7.invoke$lambda$4(r2Var2, lVar);
                }
            };
            final androidx.navigation.r2 r2Var3 = this.$navController;
            TicketsScreenKt.TicketsScreen(ticketsScreenUiStateReduceToTicketsScreenUiState, function0, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.b3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TicketsDestinationKt.AnonymousClass7.invoke$lambda$5(z10, r2Var3, (String) obj);
                }
            }, ((l3) objI0).m1(), c0Var, 0, 0);
            androidx.compose.runtime.b2.i("", new AnonymousClass5(null), c0Var, 70);
        }
    }

    public static final void ticketsDestination(@NotNull androidx.navigation.g2 g2Var, @NotNull androidx.navigation.r2 navController, @NotNull androidx.activity.l rootActivity) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        androidx.navigation.compose.t.f(g2Var, "TICKETS?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new androidx.navigation.b0[]{androidx.navigation.c0.a("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.s2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketsDestinationKt.ticketsDestination$lambda$0((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.t2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketsDestinationKt.ticketsDestination$lambda$1((androidx.navigation.k0) obj);
            }
        })}), null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.u2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketsDestinationKt.ticketsDestination$lambda$2((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.v2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketsDestinationKt.ticketsDestination$lambda$3((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.w2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketsDestinationKt.ticketsDestination$lambda$4((androidx.compose.animation.i) obj);
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.x2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketsDestinationKt.ticketsDestination$lambda$5((androidx.compose.animation.i) obj);
            }
        }, null, androidx.compose.runtime.internal.w.c(655582181, true, new AnonymousClass7(rootActivity, navController)), 132, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketsDestination$lambda$0(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(TransitionStyleKt.getTransitionArgNavType());
        navArgument.f(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketsDestination$lambda$1(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(d3.BoolType);
        navArgument.f(Boolean.FALSE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 ticketsDestination$lambda$2(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 ticketsDestination$lambda$3(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.d0 ticketsDestination$lambda$4(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.j(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.f0 ticketsDestination$lambda$5(androidx.compose.animation.i composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((androidx.navigation.n0) composable.l(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }
}
