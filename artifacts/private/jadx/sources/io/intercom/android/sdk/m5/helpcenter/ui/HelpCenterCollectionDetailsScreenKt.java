package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionSummaryComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHelpCenterCollectionDetailsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterCollectionDetailsScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterCollectionDetailsScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1282#2,6:97\n1872#3,3:103\n*S KotlinDebug\n*F\n+ 1 HelpCenterCollectionDetailsScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterCollectionDetailsScreenKt\n*L\n42#1:97,6\n73#1:103,3\n*E\n"})
public final class HelpCenterCollectionDetailsScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2", f = "HelpCenterCollectionDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ String $collectionId;
        final /* synthetic */ HelpCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HelpCenterViewModel helpCenterViewModel, String str, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$viewModel = helpCenterViewModel;
            this.$collectionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$viewModel, this.$collectionId, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.$viewModel.fetchCollectionDetails(this.$collectionId);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterCollectionDetailsScreen(@NotNull final HelpCenterViewModel viewModel, @NotNull final String collectionId, @Nullable Function1<? super String, Unit> function1, @NotNull final Function1<? super String, Unit> onCollectionClicked, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(onCollectionClicked, "onCollectionClicked");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1331499807);
        final Function1<? super String, Unit> function2 = (i11 & 4) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$0((String) obj);
            }
        } : function1;
        b2.i("", new AnonymousClass2(viewModel, collectionId, null), c0VarR, 70);
        boolean z10 = true;
        final n7 n7VarB = w6.b(viewModel.getCollectionDetailsState(), null, c0VarR, 8, 1);
        androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
        androidx.compose.ui.a0 a0VarF = i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null);
        c0VarR.E(-1710791525);
        boolean zD = c0VarR.D(n7VarB) | ((((i10 & 896) ^ a5.S0) > 256 && c0VarR.D(function2)) || (i10 & a5.S0) == 256);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !c0VarR.D(onCollectionClicked)) && (i10 & 3072) != 2048) {
            z10 = false;
        }
        boolean z11 = zD | z10;
        Object objI0 = c0VarR.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$2$lambda$1(n7VarB, function2, onCollectionClicked, (w0) obj);
                }
            };
            c0VarR.Y(objI0);
        }
        c0VarR.A();
        androidx.compose.foundation.lazy.h.h(a0VarF, null, null, false, null, bVarM, null, false, null, (Function1) objI0, c0VarR, 196614, 478);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$3(viewModel, collectionId, function2, onCollectionClicked, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionDetailsScreen$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionDetailsScreen$lambda$2$lambda$1(n7 state, Function1 function1, Function1 onCollectionClicked, w0 LazyColumn) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onCollectionClicked, "$onCollectionClicked");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final CollectionDetailsUiState collectionDetailsUiState = (CollectionDetailsUiState) state.getValue();
        if (Intrinsics.areEqual(collectionDetailsUiState, CollectionDetailsUiState.Initial.INSTANCE) || Intrinsics.areEqual(collectionDetailsUiState, CollectionDetailsUiState.Loading.INSTANCE)) {
            w0.p(LazyColumn, null, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m328getLambda1$intercom_sdk_base_release(), 3, null);
        } else if (collectionDetailsUiState instanceof CollectionDetailsUiState.Error) {
            w0.p(LazyColumn, null, null, androidx.compose.runtime.internal.w.c(211733483, true, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$3$1$1
                @Override // pj.n
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                    invoke(iVar, c0Var, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i10) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i10 & 14) == 0) {
                        i10 |= c0Var.D(item) ? 4 : 2;
                    }
                    if ((i10 & 91) == 18 && c0Var.d()) {
                        c0Var.u();
                        return;
                    }
                    HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionDetailsUiState.Error) collectionDetailsUiState).getErrorState(), androidx.compose.foundation.lazy.i.c(item, androidx.compose.ui.a0.E, 0.0f, 1, null), c0Var, 0, 0);
                }
            }), 3, null);
        } else {
            if (!(collectionDetailsUiState instanceof CollectionDetailsUiState.Content)) {
                throw new k0();
            }
            CollectionDetailsUiState.Content content = (CollectionDetailsUiState.Content) collectionDetailsUiState;
            if (content.getCollectionDetailsRows().isEmpty()) {
                w0.p(LazyColumn, null, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m329getLambda2$intercom_sdk_base_release(), 3, null);
            } else {
                helpCenterSectionItems(LazyColumn, content, function1, onCollectionClicked);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionDetailsScreen$lambda$3(HelpCenterViewModel viewModel, String collectionId, Function1 function1, Function1 onCollectionClicked, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(collectionId, "$collectionId");
        Intrinsics.checkNotNullParameter(onCollectionClicked, "$onCollectionClicked");
        HelpCenterCollectionDetailsScreen(viewModel, collectionId, function1, onCollectionClicked, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final void helpCenterSectionItems(w0 w0Var, final CollectionDetailsUiState.Content content, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2) {
        w0.p(w0Var, null, null, androidx.compose.runtime.internal.w.c(1491252145, true, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt.helpCenterSectionItems.1
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                invoke(iVar, c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i10) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16 && c0Var.d()) {
                    c0Var.u();
                } else {
                    CollectionSummaryComponentKt.CollectionSummaryComponent(content, null, c0Var, 8, 2);
                }
            }
        }), 3, null);
        final List<CollectionDetailsRow> collectionDetailsRows = content.getCollectionDetailsRows();
        final int i10 = 0;
        for (Object obj : collectionDetailsRows) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final CollectionDetailsRow collectionDetailsRow = (CollectionDetailsRow) obj;
            if (collectionDetailsRow instanceof CollectionDetailsRow.ArticleRow) {
                w0.p(w0Var, null, null, androidx.compose.runtime.internal.w.c(-103698696, true, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                        invoke(iVar, c0Var, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i12) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i12 & 81) == 16 && c0Var.d()) {
                            c0Var.u();
                            return;
                        }
                        c0Var.E(153525508);
                        if (i10 == 0) {
                            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(16)), c0Var, 6);
                        }
                        c0Var.A();
                        ArticleRowComponentKt.ArticleRowComponent(null, (CollectionDetailsRow.ArticleRow) collectionDetailsRow, function1, c0Var, 0, 1);
                        if (i10 == collectionDetailsRows.size() - 1 || !(collectionDetailsRows.get(i10 + 1) instanceof CollectionDetailsRow.ArticleRow)) {
                            return;
                        }
                        float f10 = 16;
                        IntercomDividerKt.IntercomDivider(d5.v(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(f10), 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, 10, null), c0Var, 6, 0);
                    }
                }), 3, null);
            } else {
                if (Intrinsics.areEqual(collectionDetailsRow, CollectionDetailsRow.FullHelpCenterRow.INSTANCE)) {
                    w0.p(w0Var, null, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m330getLambda3$intercom_sdk_base_release(), 3, null);
                } else if (collectionDetailsRow instanceof CollectionDetailsRow.CollectionRow) {
                    w0.p(w0Var, null, null, androidx.compose.runtime.internal.w.c(1175818224, true, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$2
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                            invoke(iVar, c0Var, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i12) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i12 & 81) == 16 && c0Var.d()) {
                                c0Var.u();
                            } else {
                                CollectionRowComponentKt.CollectionRowComponent(((CollectionDetailsRow.CollectionRow) collectionDetailsRow).getRowData(), function2, null, c0Var, 0, 4);
                            }
                        }
                    }), 3, null);
                } else {
                    if (!(collectionDetailsRow instanceof CollectionDetailsRow.SendMessageRow)) {
                        throw new k0();
                    }
                    w0.p(w0Var, null, null, androidx.compose.runtime.internal.w.c(1352146481, true, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$3
                        @Override // pj.n
                        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                            invoke(iVar, c0Var, num.intValue());
                            return Unit.f312394a;
                        }

                        @androidx.compose.runtime.o
                        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i12) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i12 & 81) == 16 && c0Var.d()) {
                                c0Var.u();
                                return;
                            }
                            TeamPresenceComponentKt.TeamPresenceComponent(((CollectionDetailsRow.SendMessageRow) collectionDetailsRow).getTeamPresenceState(), false, null, c0Var, 48, 4);
                        }
                    }), 3, null);
                }
                i10 = i11;
            }
            i10 = i11;
        }
    }
}
