package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.layout.b8;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.t7;
import androidx.compose.foundation.layout.v6;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.material3.a4;
import androidx.compose.material3.os;
import androidx.compose.material3.pt;
import androidx.compose.material3.q50;
import androidx.compose.material3.xg;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.paging.x0;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInboxScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboxScreen.kt\nio/intercom/android/sdk/m5/inbox/ui/InboxScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,210:1\n75#2:211\n113#3:212\n113#3:253\n70#4:213\n68#4,8:214\n77#4:252\n70#4:254\n68#4,8:255\n77#4:335\n80#5,6:222\n87#5,3:237\n90#5,2:246\n94#5:251\n80#5,6:263\n87#5,3:278\n90#5,2:287\n80#5,6:301\n87#5,3:316\n90#5,2:325\n94#5:330\n94#5:334\n391#6,9:228\n400#6,3:248\n391#6,9:269\n400#6:289\n391#6,9:307\n400#6,3:327\n401#6,2:332\n4360#7,6:240\n4360#7,6:281\n4360#7,6:319\n87#8:290\n83#8,10:291\n94#8:331\n66#9,5:336\n*S KotlinDebug\n*F\n+ 1 InboxScreen.kt\nio/intercom/android/sdk/m5/inbox/ui/InboxScreenKt\n*L\n60#1:211\n177#1:212\n191#1:253\n175#1:213\n175#1:214,8\n175#1:252\n189#1:254\n189#1:255,8\n189#1:335\n175#1:222,6\n175#1:237,3\n175#1:246,2\n175#1:251\n189#1:263,6\n189#1:278,3\n189#1:287,2\n195#1:301,6\n195#1:316,3\n195#1:325,2\n195#1:330\n189#1:334\n175#1:228,9\n175#1:248,3\n189#1:269,9\n189#1:289\n195#1:307,9\n195#1:327,3\n189#1:332,2\n175#1:240,6\n189#1:281,6\n195#1:319,6\n195#1:290\n195#1:291,10\n195#1:331\n71#1:336,5\n*E\n"})
public final class InboxScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$2", f = "InboxScreen.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ androidx.paging.compose.b<Conversation> $lazyPagingItems;
        final /* synthetic */ Function1<InboxUiEffects.NavigateToConversation, Unit> $onConversationClicked;
        final /* synthetic */ InboxViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(InboxViewModel inboxViewModel, Function1<? super InboxUiEffects.NavigateToConversation, Unit> function1, androidx.paging.compose.b<Conversation> bVar, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$viewModel = inboxViewModel;
            this.$onConversationClicked = function1;
            this.$lazyPagingItems = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$viewModel, this.$onConversationClicked, this.$lazyPagingItems, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            int i11 = 6 | 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0<InboxUiEffects> effect = this.$viewModel.getEffect();
                final Function1<InboxUiEffects.NavigateToConversation, Unit> function1 = this.$onConversationClicked;
                final androidx.paging.compose.b<Conversation> bVar = this.$lazyPagingItems;
                kotlinx.coroutines.flow.j<? super InboxUiEffects> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxScreen.2.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((InboxUiEffects) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(InboxUiEffects inboxUiEffects, kotlin.coroutines.d<? super Unit> dVar) {
                        if (inboxUiEffects instanceof InboxUiEffects.NavigateToConversation) {
                            function1.invoke(inboxUiEffects);
                        } else {
                            if (!(inboxUiEffects instanceof InboxUiEffects.RefreshInbox)) {
                                throw new k0();
                            }
                            bVar.k();
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
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5, reason: invalid class name */
    static final class AnonymousClass5 implements pj.n<g5, c0, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onBrowseHelpCenterButtonClick;
        final /* synthetic */ Function0<Unit> $onSendMessageButtonClick;
        final /* synthetic */ InboxUiState $uiState;
        final /* synthetic */ InboxViewModel $viewModel;

        AnonymousClass5(InboxUiState inboxUiState, InboxViewModel inboxViewModel, Function0<Unit> function0, Function0<Unit> function1) {
            this.$uiState = inboxUiState;
            this.$viewModel = inboxViewModel;
            this.$onSendMessageButtonClick = function0;
            this.$onBrowseHelpCenterButtonClick = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2(final InboxUiState uiState, final InboxViewModel viewModel, final Function0 onSendMessageButtonClick, final Function0 onBrowseHelpCenterButtonClick, w0 LazyColumn) {
            Intrinsics.checkNotNullParameter(uiState, "$uiState");
            Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
            Intrinsics.checkNotNullParameter(onSendMessageButtonClick, "$onSendMessageButtonClick");
            Intrinsics.checkNotNullParameter(onBrowseHelpCenterButtonClick, "$onBrowseHelpCenterButtonClick");
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            if (uiState instanceof InboxUiState.Content) {
                InboxUiState.Content content = (InboxUiState.Content) uiState;
                InboxContentScreenItemsKt.inboxContentScreenItems(LazyColumn, content.getInboxConversations(), new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InboxScreenKt.AnonymousClass5.invoke$lambda$2$lambda$0(viewModel, (Conversation) obj);
                    }
                });
                final ErrorState errorState = content.getErrorState();
                if (errorState != null) {
                    int i10 = 3 ^ 0;
                    w0.p(LazyColumn, null, null, androidx.compose.runtime.internal.w.c(-61243482, true, new pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$2$1
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, c0 c0Var, Integer num) {
                            invoke(iVar, c0Var, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.foundation.lazy.i item, c0 c0Var, int i11) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i11 & 81) == 16 && c0Var.d()) {
                                c0Var.u();
                            } else {
                                InboxScreenKt.InboxErrorRow(errorState, c0Var, 0);
                            }
                        }
                    }), 3, null);
                }
                if (content.isLoadingMore()) {
                    w0.p(LazyColumn, null, null, ComposableSingletons$InboxScreenKt.INSTANCE.m401getLambda2$intercom_sdk_base_release(), 3, null);
                }
            } else if (uiState instanceof InboxUiState.Empty) {
                w0.p(LazyColumn, null, null, androidx.compose.runtime.internal.w.c(-2100853483, true, new pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$3

                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[ActionType.values().length];
                            try {
                                iArr[ActionType.MESSAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[ActionType.HELP.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, c0 c0Var, Integer num) {
                        invoke(iVar, c0Var, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.lazy.i item, c0 c0Var, int i11) {
                        Function0<Unit> function0;
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i11 & 14) == 0) {
                            i11 |= c0Var.D(item) ? 4 : 2;
                        }
                        if ((i11 & 91) == 18 && c0Var.d()) {
                            c0Var.u();
                            return;
                        }
                        EmptyState emptyState = ((InboxUiState.Empty) uiState).getEmptyState();
                        boolean showActionButton = ((InboxUiState.Empty) uiState).getShowActionButton();
                        int i12 = WhenMappings.$EnumSwitchMapping$0[((InboxUiState.Empty) uiState).getEmptyState().getAction().getType().ordinal()];
                        if (i12 == 1) {
                            function0 = onSendMessageButtonClick;
                        } else {
                            if (i12 != 2) {
                                throw new k0();
                            }
                            function0 = onBrowseHelpCenterButtonClick;
                        }
                        InboxEmptyScreenKt.InboxEmptyScreen(emptyState, showActionButton, function0, androidx.compose.foundation.lazy.i.c(item, androidx.compose.ui.a0.E, 0.0f, 1, null), c0Var, 0, 0);
                    }
                }), 3, null);
            } else if (uiState instanceof InboxUiState.Error) {
                w0.p(LazyColumn, null, null, androidx.compose.runtime.internal.w.c(1129146582, true, new pj.n<androidx.compose.foundation.lazy.i, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$4
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, c0 c0Var, Integer num) {
                        invoke(iVar, c0Var, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.lazy.i item, c0 c0Var, int i11) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i11 & 14) == 0) {
                            i11 |= c0Var.D(item) ? 4 : 2;
                        }
                        if ((i11 & 91) == 18 && c0Var.d()) {
                            c0Var.u();
                        } else {
                            InboxErrorScreenKt.InboxErrorScreen(((InboxUiState.Error) uiState).getErrorState(), androidx.compose.foundation.lazy.i.c(item, androidx.compose.ui.a0.E, 0.0f, 1, null), c0Var, 0, 0);
                        }
                    }
                }), 3, null);
            } else if ((uiState instanceof InboxUiState.Initial) || (uiState instanceof InboxUiState.Loading)) {
                int i11 = 3 ^ 0;
                w0.p(LazyColumn, null, null, ComposableSingletons$InboxScreenKt.INSTANCE.m402getLambda3$intercom_sdk_base_release(), 3, null);
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$0(InboxViewModel viewModel, Conversation conversation) {
            Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            viewModel.onConversationClick(conversation);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, c0 c0Var, Integer num) {
            invoke(g5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(g5 paddingValues, c0 c0Var, int i10) {
            int i11;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i10 & 14) == 0) {
                i11 = i10 | (c0Var.D(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0 a0VarC = t7.c(i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null), paddingValues);
            androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
            final InboxUiState inboxUiState = this.$uiState;
            final InboxViewModel inboxViewModel = this.$viewModel;
            final Function0<Unit> function0 = this.$onSendMessageButtonClick;
            final Function0<Unit> function1 = this.$onBrowseHelpCenterButtonClick;
            androidx.compose.foundation.lazy.h.h(a0VarC, null, paddingValues, false, null, bVarM, null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InboxScreenKt.AnonymousClass5.invoke$lambda$2(inboxUiState, inboxViewModel, function0, function1, (w0) obj);
                }
            }, c0Var, ((i11 << 6) & 896) | androidx.profileinstaller.n.c.f73814m, 474);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InboxErrorRow(final ErrorState errorState, c0 c0Var, final int i10) {
        int i11;
        c0 c0VarR = c0Var.R(-126725909);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(errorState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarH = i6.h(d5.t(aVar, 0.0f, androidx.compose.ui.unit.h.r(16), 1, null), 0.0f, 1, null);
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.i(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK, aVar3.e());
            y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar3.f());
            d0 d0Var = d0.f15956a;
            a1 a1VarB = j0.b(androidx.compose.foundation.layout.q.f16330a.y(), aVar2.m(), c0VarR, 48);
            int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0 c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarB, aVar3.e());
            y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN2, aVar3.f());
            n0 n0Var = n0.f16227a;
            q50.t(u0.i.d(errorState.getMessageResId(), c0VarR, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0VarR, 0, 0, 262142);
            c0VarR = c0VarR;
            c0VarR.E(-868881931);
            if (errorState instanceof ErrorState.WithCTA) {
                a4.p(((ErrorState.WithCTA) errorState).getOnCtaClick(), null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.w.e(-282010049, true, new pj.n<x5, c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxErrorRow$1$1$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(x5 x5Var, c0 c0Var2, Integer num) {
                        invoke(x5Var, c0Var2, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(x5 TextButton, c0 c0Var2, int i12) {
                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                        if ((i12 & 81) == 16 && c0Var2.d()) {
                            c0Var2.u();
                        } else {
                            q50.t(u0.i.d(((ErrorState.WithCTA) errorState).getCtaResId(), c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                        }
                    }
                }, c0VarR, 54), c0VarR, 805306368, androidx.constraintlayout.core.motion.utils.v.g.f44098r);
            }
            c0VarR.A();
            c0VarR.o();
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxScreenKt.InboxErrorRow$lambda$8(errorState, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxErrorRow$lambda$8(ErrorState errorState, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(errorState, "$errorState");
        InboxErrorRow(errorState, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InboxLoadingRow(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1843849504);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0VarH = i6.h(d5.t(androidx.compose.ui.a0.E, 0.0f, androidx.compose.ui.unit.h.r(16), 1, null), 0.0f, 1, null);
            a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            d0 d0Var = d0.f15956a;
            os.F(null, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m685getActionContrastWhite0d7_KjU(), 0.0f, 0L, 0, 0.0f, c0VarR, 0, 61);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxScreenKt.InboxLoadingRow$lambda$5(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxLoadingRow$lambda$5(int i10, c0 c0Var, int i11) {
        InboxLoadingRow(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InboxScreen(@NotNull final InboxViewModel viewModel, @NotNull final Function0<Unit> onSendMessageButtonClick, @NotNull final Function0<Unit> onBrowseHelpCenterButtonClick, @NotNull final Function0<Unit> onBackButtonClick, @NotNull final Function1<? super InboxUiEffects.NavigateToConversation, Unit> onConversationClicked, @androidx.annotation.v final int i10, @Nullable c0 c0Var, final int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onSendMessageButtonClick, "onSendMessageButtonClick");
        Intrinsics.checkNotNullParameter(onBrowseHelpCenterButtonClick, "onBrowseHelpCenterButtonClick");
        Intrinsics.checkNotNullParameter(onBackButtonClick, "onBackButtonClick");
        Intrinsics.checkNotNullParameter(onConversationClicked, "onConversationClicked");
        c0 c0VarR = c0Var.R(988563388);
        final androidx.paging.compose.b bVarB = androidx.paging.compose.c.b(viewModel.getInboxPagingData(), null, c0VarR, 8, 1);
        final InboxUiState inboxUiStateReduceToInboxUiState = InboxPagingItemsReducerKt.reduceToInboxUiState(bVarB, viewModel.getEmptyState(), null, i10, c0VarR, androidx.paging.compose.b.f71648f | ((i11 >> 6) & 7168), 2);
        final androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) c0VarR.W(androidx.lifecycle.compose.d0.c());
        b2.d(o0Var, new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InboxScreenKt.InboxScreen$lambda$2(o0Var, bVarB, (v1) obj);
            }
        }, c0VarR, 8);
        b2.i(null, new AnonymousClass2(viewModel, onConversationClicked, bVarB, null), c0VarR, 70);
        pt.f(t7.h(androidx.compose.foundation.v.d(androidx.compose.ui.a0.E, IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m690getBackground0d7_KjU(), null, 2, null), b8.o(v6.f16495a, c0VarR, 8)), androidx.compose.runtime.internal.w.e(-682199168, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxScreen.3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var2, int i12) {
                if ((i12 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                String title = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().getTitle();
                if (title == null) {
                    title = "";
                }
                Function0<Unit> function0 = onBackButtonClick;
                Integer navIcon = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().getNavIcon();
                q0 q0VarM569getBackgroundColorQN2ZGVo = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().m569getBackgroundColorQN2ZGVo();
                c0Var2.E(1816943163);
                long jM704getHeader0d7_KjU = q0VarM569getBackgroundColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m704getHeader0d7_KjU() : q0VarM569getBackgroundColorQN2ZGVo.M();
                c0Var2.A();
                q0 q0VarM570getContentColorQN2ZGVo = inboxUiStateReduceToInboxUiState.getIntercomTopBarState().m570getContentColorQN2ZGVo();
                c0Var2.E(1816946586);
                long jM711getOnHeader0d7_KjU = q0VarM570getContentColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c0Var2, IntercomTheme.$stable).m711getOnHeader0d7_KjU() : q0VarM570getContentColorQN2ZGVo.M();
                c0Var2.A();
                TopActionBarKt.m172TopActionBarNpQZenA(null, title, null, null, null, function0, navIcon, false, jM704getHeader0d7_KjU, jM711getOnHeader0d7_KjU, 0L, null, null, c0Var2, 0, 0, 7325);
            }
        }, c0VarR, 54), null, null, androidx.compose.runtime.internal.w.e(958560707, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt.InboxScreen.4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var2, int i12) {
                if ((i12 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                InboxUiState inboxUiState = inboxUiStateReduceToInboxUiState;
                if ((inboxUiState instanceof InboxUiState.Content) && ((InboxUiState.Content) inboxUiState).getShowSendMessageFab()) {
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i13 = IntercomTheme.$stable;
                    xg.o(onSendMessageButtonClick, d5.v(androidx.compose.ui.a0.E, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(16), 7, null), androidx.compose.foundation.shape.o.k(), intercomTheme.getColors(c0Var2, i13).m684getAction0d7_KjU(), intercomTheme.getColors(c0Var2, i13).m708getOnAction0d7_KjU(), null, null, ComposableSingletons$InboxScreenKt.INSTANCE.m400getLambda1$intercom_sdk_base_release(), c0Var2, 12582960, 96);
                }
            }
        }, c0VarR, 54), 0, 0L, 0L, null, androidx.compose.runtime.internal.w.e(-1682074485, true, new AnonymousClass5(inboxUiStateReduceToInboxUiState, viewModel, onSendMessageButtonClick, onBrowseHelpCenterButtonClick), c0VarR, 54), c0VarR, 805330992, 492);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InboxScreenKt.InboxScreen$lambda$3(viewModel, onSendMessageButtonClick, onBrowseHelpCenterButtonClick, onBackButtonClick, onConversationClicked, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 InboxScreen$lambda$2(final androidx.lifecycle.o0 lifecycleOwner, final androidx.paging.compose.b lazyPagingItems, v1 DisposableEffect) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0() { // from class: io.intercom.android.sdk.m5.inbox.ui.u
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
                InboxScreenKt.InboxScreen$lambda$2$lambda$0(lazyPagingItems, o0Var, aVar);
            }
        };
        lifecycleOwner.getLifecycle().c(j0Var);
        return new u1() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.u1
            public void dispose() {
                lifecycleOwner.getLifecycle().g(j0Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InboxScreen$lambda$2$lambda$0(androidx.paging.compose.b lazyPagingItems, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        Intrinsics.checkNotNullParameter(o0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.c0.a.ON_RESUME && (lazyPagingItems.i().e() instanceof x0.c)) {
            lazyPagingItems.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxScreen$lambda$3(InboxViewModel viewModel, Function0 onSendMessageButtonClick, Function0 onBrowseHelpCenterButtonClick, Function0 onBackButtonClick, Function1 onConversationClicked, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(onSendMessageButtonClick, "$onSendMessageButtonClick");
        Intrinsics.checkNotNullParameter(onBrowseHelpCenterButtonClick, "$onBrowseHelpCenterButtonClick");
        Intrinsics.checkNotNullParameter(onBackButtonClick, "$onBackButtonClick");
        Intrinsics.checkNotNullParameter(onConversationClicked, "$onConversationClicked");
        InboxScreen(viewModel, onSendMessageButtonClick, onBrowseHelpCenterButtonClick, onBackButtonClick, onConversationClicked, i10, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }
}
