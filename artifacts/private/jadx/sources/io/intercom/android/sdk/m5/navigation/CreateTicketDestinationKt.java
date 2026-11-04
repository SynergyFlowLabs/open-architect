package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.compose.material3.cl;
import androidx.compose.material3.tx;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.compose.ui.graphics.d3;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketLaunchedFrom;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
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
public final class CreateTicketDestinationKt {

    @NotNull
    public static final String CONVERSATION_ID = "conversation_id";

    @NotNull
    public static final String TICKET_TYPE_ID = "ticket_type_id";

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nCreateTicketDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketDestination.kt\nio/intercom/android/sdk/m5/navigation/CreateTicketDestinationKt$createTicketDestination$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,174:1\n1282#2,6:175\n1282#2,3:188\n1285#2,3:192\n607#3:181\n604#3,6:182\n605#4:191\n85#5:195\n*S KotlinDebug\n*F\n+ 1 CreateTicketDestination.kt\nio/intercom/android/sdk/m5/navigation/CreateTicketDestinationKt$createTicketDestination$4\n*L\n79#1:175,6\n84#1:188,3\n84#1:192,3\n84#1:181\n84#1:182,6\n84#1:191\n159#1:195\n*E\n"})
    static final class AnonymousClass4 implements pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ androidx.navigation.r2 $navController;
        final /* synthetic */ androidx.activity.l $rootActivity;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1, reason: invalid class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1", f = "CreateTicketDestination.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ n3<AnswerClickData> $answerClickedData;
            final /* synthetic */ androidx.navigation.r2 $navController;
            final /* synthetic */ kotlinx.coroutines.s0 $scope;
            final /* synthetic */ CreateTicketViewModel $viewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreateTicketViewModel createTicketViewModel, androidx.navigation.r2 r2Var, kotlinx.coroutines.s0 s0Var, n3<AnswerClickData> n3Var, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$viewModel = createTicketViewModel;
                this.$navController = r2Var;
                this.$scope = s0Var;
                this.$answerClickedData = n3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass1(this.$viewModel, this.$navController, this.$scope, this.$answerClickedData, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.o0<CreateTicketViewModel.TicketSideEffect> effect = this.$viewModel.getEffect();
                    final androidx.navigation.r2 r2Var = this.$navController;
                    final kotlinx.coroutines.s0 s0Var = this.$scope;
                    final n3<AnswerClickData> n3Var = this.$answerClickedData;
                    kotlinx.coroutines.flow.j<? super CreateTicketViewModel.TicketSideEffect> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt.createTicketDestination.4.1.1
                        @Override // kotlinx.coroutines.flow.j
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                            return emit((CreateTicketViewModel.TicketSideEffect) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                        }

                        public final Object emit(CreateTicketViewModel.TicketSideEffect ticketSideEffect, kotlin.coroutines.d<? super Unit> dVar) {
                            if (Intrinsics.areEqual(ticketSideEffect, CreateTicketViewModel.TicketSideEffect.Finish.INSTANCE)) {
                                r2Var.z0();
                                IntercomRouterKt.openTicketDetailScreen$default(r2Var, true, null, false, 6, null);
                            } else {
                                if (!(ticketSideEffect instanceof CreateTicketViewModel.TicketSideEffect.AnswerClicked)) {
                                    throw new kotlin.k0();
                                }
                                AnonymousClass4.invoke$showSheet(s0Var, n3Var, ((CreateTicketViewModel.TicketSideEffect.AnswerClicked) ticketSideEffect).getAnswerClickData());
                            }
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

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$3, reason: invalid class name */
        /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.g0 implements Function0<Unit> {
            final /* synthetic */ androidx.navigation.r2 $navController;
            final /* synthetic */ androidx.activity.l $rootActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(androidx.navigation.r2 r2Var, androidx.activity.l lVar) {
                super(0, Intrinsics.a.class, "navigateUp", "createTicketDestination$navigateUp(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                this.$navController = r2Var;
                this.$rootActivity = lVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CreateTicketDestinationKt.createTicketDestination$navigateUp(this.$navController, this.$rootActivity);
            }
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$5, reason: invalid class name */
        /* synthetic */ class AnonymousClass5 extends kotlin.jvm.internal.g0 implements Function0<Unit> {
            final /* synthetic */ androidx.navigation.r2 $navController;
            final /* synthetic */ androidx.activity.l $rootActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(androidx.navigation.r2 r2Var, androidx.activity.l lVar) {
                super(0, Intrinsics.a.class, "navigateUp", "createTicketDestination$navigateUp(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                this.$navController = r2Var;
                this.$rootActivity = lVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CreateTicketDestinationKt.createTicketDestination$navigateUp(this.$navController, this.$rootActivity);
            }
        }

        AnonymousClass4(androidx.activity.l lVar, androidx.navigation.r2 r2Var) {
            this.$rootActivity = lVar;
            this.$navController = r2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$dismissSheet(kotlinx.coroutines.s0 s0Var, n3<AnswerClickData> n3Var) {
            kotlinx.coroutines.k.f(s0Var, null, null, new CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1(n3Var, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(kotlinx.coroutines.s0 scope, n3 answerClickedData) {
            Intrinsics.checkNotNullParameter(scope, "$scope");
            Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
            invoke$dismissSheet(scope, answerClickedData);
            return Unit.f312394a;
        }

        private static final CreateTicketViewModel.CreateTicketFormUiState invoke$lambda$3(n7<? extends CreateTicketViewModel.CreateTicketFormUiState> n7Var) {
            return n7Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4(CreateTicketViewModel viewModel, kotlinx.coroutines.s0 scope) {
            Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
            Intrinsics.checkNotNullParameter(scope, "$scope");
            viewModel.createTicket(scope);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5(CreateTicketViewModel viewModel, String it) {
            Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
            Intrinsics.checkNotNullParameter(it, "it");
            viewModel.onAnswerUpdated(it);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6(CreateTicketViewModel viewModel, AnswerClickData it) {
            Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
            Intrinsics.checkNotNullParameter(it, "it");
            viewModel.onAnswerClicked(it);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$showSheet(kotlinx.coroutines.s0 s0Var, n3<AnswerClickData> n3Var, AnswerClickData answerClickData) {
            kotlinx.coroutines.k.f(s0Var, null, null, new CreateTicketDestinationKt$createTicketDestination$4$showSheet$1(n3Var, answerClickData, null), 3, null);
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(gVar, n0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(androidx.compose.animation.g composable, androidx.navigation.n0 navBackStackEntry, androidx.compose.runtime.c0 c0Var, int i10) {
            String string;
            kotlinx.coroutines.s0 s0Var;
            CreateTicketViewModel createTicketViewModel;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
            Bundle bundleB = navBackStackEntry.b();
            Integer numValueOf = bundleB != null ? Integer.valueOf(bundleB.getInt(CreateTicketDestinationKt.TICKET_TYPE_ID)) : null;
            Bundle bundleB2 = navBackStackEntry.b();
            String string2 = bundleB2 != null ? bundleB2.getString(CreateTicketDestinationKt.CONVERSATION_ID) : null;
            Bundle bundleB3 = navBackStackEntry.b();
            if (bundleB3 == null || (string = bundleB3.getString("from")) == null) {
                string = "conversation";
            }
            if (numValueOf == null) {
                return;
            }
            CreateTicketViewModel.Companion companion = CreateTicketViewModel.Companion;
            androidx.lifecycle.m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0Var, androidx.lifecycle.viewmodel.compose.b.f52545c);
            if (m2VarC == null) {
                m2VarC = this.$rootActivity;
            }
            CreateTicketViewModel createTicketViewModelCreate = companion.create(m2VarC, numValueOf.intValue(), string2, Intrinsics.areEqual(string, "conversation") ? CreateTicketLaunchedFrom.Conversation : CreateTicketLaunchedFrom.Home);
            c0Var.E(-693655600);
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(null, null, 2, null);
                c0Var.Y(objI0);
            }
            final n3 n3Var = (n3) objI0;
            c0Var.A();
            tx txVarW = cl.W(true, null, c0Var, 6, 2);
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI1);
            }
            final kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) objI1;
            androidx.compose.runtime.b2.i("", new AnonymousClass1(createTicketViewModelCreate, this.$navController, s0Var2, n3Var, null), c0Var, 70);
            AnswerClickData answerClickData = (AnswerClickData) n3Var.getValue();
            c0Var.E(-693618191);
            if (answerClickData == null) {
                createTicketViewModel = createTicketViewModelCreate;
                s0Var = s0Var2;
            } else {
                c0Var.E(-693614197);
                long jA = answerClickData.getClickedItem().getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success ? androidx.compose.ui.graphics.q0.f38131b.a() : IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m690getBackground0d7_KjU();
                c0Var.A();
                s0Var = s0Var2;
                createTicketViewModel = createTicketViewModelCreate;
                cl.t(new Function0() { // from class: io.intercom.android.sdk.m5.navigation.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$2$lambda$1(s0Var2, n3Var);
                    }
                }, null, txVarW, 0.0f, false, d3.a(), jA, 0L, 0.0f, 0L, null, null, null, androidx.compose.runtime.internal.w.e(-693932488, true, new CreateTicketDestinationKt$createTicketDestination$4$2$2(answerClickData, createTicketViewModelCreate, s0Var2, n3Var), c0Var, 54), c0Var, androidx.profileinstaller.n.c.f73814m, 3078, 7066);
                Unit unit = Unit.f312394a;
            }
            c0Var.A();
            final CreateTicketViewModel createTicketViewModel2 = createTicketViewModel;
            final kotlinx.coroutines.s0 s0Var3 = s0Var;
            CreateTicketContentScreenKt.CreateTicketScreen(invoke$lambda$3(w6.a(createTicketViewModel.getUiState(), CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE, null, c0Var, 56, 2)), new AnonymousClass3(this.$navController, this.$rootActivity), new Function0() { // from class: io.intercom.android.sdk.m5.navigation.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$4(createTicketViewModel2, s0Var3);
                }
            }, new AnonymousClass5(this.$navController, this.$rootActivity), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$5(createTicketViewModel2, (String) obj);
                }
            }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$6(createTicketViewModel2, (AnswerClickData) obj);
                }
            }, c0Var, 0);
        }
    }

    public static final void createTicketDestination(@NotNull androidx.navigation.g2 g2Var, @NotNull androidx.navigation.r2 navController, @NotNull androidx.activity.l rootActivity) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        androidx.navigation.compose.t.f(g2Var, "CREATE_TICKET/{ticket_type_id}?conversation_id={conversation_id}?from={from}", CollectionsKt.listOf((Object[]) new androidx.navigation.b0[]{androidx.navigation.c0.a(TICKET_TYPE_ID, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketDestinationKt.createTicketDestination$lambda$0((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a(CONVERSATION_ID, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketDestinationKt.createTicketDestination$lambda$1((androidx.navigation.k0) obj);
            }
        }), androidx.navigation.c0.a("from", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketDestinationKt.createTicketDestination$lambda$2((androidx.navigation.k0) obj);
            }
        })}), null, IntercomTransitionsKt.getSlideUpEnterTransition(), IntercomTransitionsKt.getSlideDownExitTransition(), null, null, null, androidx.compose.runtime.internal.w.c(-521503931, true, new AnonymousClass4(rootActivity, navController)), 228, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTicketDestination$lambda$0(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(androidx.navigation.d3.IntType);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTicketDestination$lambda$1(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(androidx.navigation.d3.StringType);
        navArgument.g(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTicketDestination$lambda$2(androidx.navigation.k0 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.h(androidx.navigation.d3.StringType);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTicketDestination$navigateUp(androidx.navigation.r2 r2Var, androidx.activity.l lVar) {
        if (r2Var.z0()) {
            return;
        }
        lVar.finish();
    }
}
