package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@SourceDebugExtension({"SMAP\nHelpCenterCollectionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelpCenterCollectionsScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterCollectionsScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,131:1\n1282#2,6:132\n204#3,13:138\n*S KotlinDebug\n*F\n+ 1 HelpCenterCollectionsScreen.kt\nio/intercom/android/sdk/m5/helpcenter/ui/HelpCenterCollectionsScreenKt\n*L\n58#1:132,6\n114#1:138,13\n*E\n"})
public final class HelpCenterCollectionsScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1", f = "HelpCenterCollectionsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ List<String> $collectionIds;
        final /* synthetic */ HelpCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HelpCenterViewModel helpCenterViewModel, List<String> list, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$viewModel = helpCenterViewModel;
            this.$collectionIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$viewModel, this.$collectionIds, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.$viewModel.fetchCollections(CollectionsKt.toSet(this.$collectionIds));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2", f = "HelpCenterCollectionsScreen.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $onAutoNavigateToCollection;
        final /* synthetic */ HelpCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(HelpCenterViewModel helpCenterViewModel, Function1<? super String, Unit> function1, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$viewModel = helpCenterViewModel;
            this.$onAutoNavigateToCollection = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$viewModel, this.$onAutoNavigateToCollection, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                o0<CollectionsUiEffects> effect = this.$viewModel.getEffect();
                final Function1<String, Unit> function1 = this.$onAutoNavigateToCollection;
                kotlinx.coroutines.flow.j<? super CollectionsUiEffects> jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen.2.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((CollectionsUiEffects) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(CollectionsUiEffects collectionsUiEffects, kotlin.coroutines.d<? super Unit> dVar) {
                        if (!(collectionsUiEffects instanceof CollectionsUiEffects.NavigateToCollectionContent)) {
                            throw new k0();
                        }
                        function1.invoke(((CollectionsUiEffects.NavigateToCollectionContent) collectionsUiEffects).getCollectionId());
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HelpCenterCollectionsScreen(@NotNull final HelpCenterViewModel viewModel, @NotNull final List<String> collectionIds, @NotNull final Function1<? super String, Unit> onCollectionClick, @NotNull final Function1<? super String, Unit> onAutoNavigateToCollection, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(onCollectionClick, "onCollectionClick");
        Intrinsics.checkNotNullParameter(onAutoNavigateToCollection, "onAutoNavigateToCollection");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1836627764);
        b2.i("", new AnonymousClass1(viewModel, collectionIds, null), c0VarR, 70);
        b2.i("", new AnonymousClass2(viewModel, onAutoNavigateToCollection, null), c0VarR, 70);
        boolean z10 = true;
        final n7 n7VarB = w6.b(viewModel.getCollectionsState(), null, c0VarR, 8, 1);
        androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
        androidx.compose.ui.a0 a0VarF = i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null);
        c0VarR.E(2138903112);
        boolean zD = c0VarR.D(n7VarB);
        if ((((i10 & 896) ^ a5.S0) <= 256 || !c0VarR.D(onCollectionClick)) && (i10 & a5.S0) != 256) {
            z10 = false;
        }
        boolean z11 = zD | z10;
        Object objI0 = c0VarR.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen$lambda$1$lambda$0(n7VarB, onCollectionClick, (w0) obj);
                }
            };
            c0VarR.Y(objI0);
        }
        c0VarR.A();
        androidx.compose.foundation.lazy.h.h(a0VarF, null, null, false, null, bVarM, null, false, null, (Function1) objI0, c0VarR, 196614, 478);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen$lambda$2(viewModel, collectionIds, onCollectionClick, onAutoNavigateToCollection, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionsScreen$lambda$1$lambda$0(n7 state, Function1 onCollectionClick, w0 LazyColumn) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onCollectionClick, "$onCollectionClick");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final CollectionsUiState collectionsUiState = (CollectionsUiState) state.getValue();
        if (Intrinsics.areEqual(collectionsUiState, CollectionsUiState.Initial.INSTANCE) || Intrinsics.areEqual(collectionsUiState, CollectionsUiState.Loading.INSTANCE)) {
            w0.p(LazyColumn, null, null, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m331getLambda1$intercom_sdk_base_release(), 3, null);
        } else if (collectionsUiState instanceof CollectionsUiState.Error) {
            w0.p(LazyColumn, null, null, androidx.compose.runtime.internal.w.c(-2086280874, true, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$3$1$1
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
                    } else {
                        HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionsUiState.Error) collectionsUiState).getErrorState(), androidx.compose.foundation.lazy.i.c(item, androidx.compose.ui.a0.E, 0.0f, 1, null), c0Var, 0, 0);
                    }
                }
            }), 3, null);
        } else {
            if (!(collectionsUiState instanceof CollectionsUiState.Content)) {
                throw new k0();
            }
            CollectionsUiState.Content content = (CollectionsUiState.Content) collectionsUiState;
            if (content.getCollections().isEmpty()) {
                w0.p(LazyColumn, null, null, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m332getLambda2$intercom_sdk_base_release(), 3, null);
            } else {
                helpCenterCollectionItems(LazyColumn, content, onCollectionClick);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionsScreen$lambda$2(HelpCenterViewModel viewModel, List collectionIds, Function1 onCollectionClick, Function1 onAutoNavigateToCollection, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "$collectionIds");
        Intrinsics.checkNotNullParameter(onCollectionClick, "$onCollectionClick");
        Intrinsics.checkNotNullParameter(onAutoNavigateToCollection, "$onAutoNavigateToCollection");
        HelpCenterCollectionsScreen(viewModel, collectionIds, onCollectionClick, onAutoNavigateToCollection, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final void helpCenterCollectionItems(w0 w0Var, final CollectionsUiState.Content content, final Function1<? super String, Unit> function1) {
        w0.p(w0Var, null, null, androidx.compose.runtime.internal.w.c(-464708772, true, new pj.n<androidx.compose.foundation.lazy.i, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt.helpCenterCollectionItems.1
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, androidx.compose.runtime.c0 c0Var, Integer num) {
                invoke(iVar, c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.foundation.lazy.i item, androidx.compose.runtime.c0 c0Var, int i10) {
                String string;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                List<CollectionsRow> collections = content.getCollections();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collections) {
                    if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                if (size == 1) {
                    c0Var.E(765329843);
                    string = u0.i.d(R.string.intercom_single_collection, c0Var, 0);
                    c0Var.A();
                } else {
                    c0Var.E(765428144);
                    string = Phrase.from((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_multiple_collections).put("total_collection", size).format().toString();
                    c0Var.A();
                }
                q50.t(string, d5.r(i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), androidx.compose.ui.unit.h.r(16)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var, IntercomTheme.$stable).getType04SemiBold(), c0Var, 48, 0, 131068);
                IntercomDividerKt.IntercomDivider(null, c0Var, 0, 1);
            }
        }), 3, null);
        final List<CollectionsRow> collections = content.getCollections();
        w0Var.A(collections.size(), null, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                collections.get(i10);
                return null;
            }
        }, androidx.compose.runtime.internal.w.c(2039820996, true, new pj.o<androidx.compose.foundation.lazy.i, Integer, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$3
            @Override // pj.o
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.lazy.i iVar, Integer num, androidx.compose.runtime.c0 c0Var, Integer num2) {
                invoke(iVar, num.intValue(), c0Var, num2.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            public final void invoke(androidx.compose.foundation.lazy.i iVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (c0Var.D(iVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= c0Var.K(i10) ? 32 : 16;
                }
                if (!c0Var.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(2039820996, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                CollectionsRow collectionsRow = (CollectionsRow) collections.get(i10);
                c0Var.E(766027716);
                if (Intrinsics.areEqual(collectionsRow, CollectionsRow.FullHelpCenterRow.INSTANCE)) {
                    c0Var.E(766073285);
                    BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(d5.v(androidx.compose.ui.a0.E, 0.0f, androidx.compose.ui.unit.h.r(24), 0.0f, 0.0f, 13, null), c0Var, 6, 0);
                    c0Var.A();
                } else if (collectionsRow instanceof CollectionsRow.SendMessageRow) {
                    c0Var.E(766223604);
                    TeamPresenceComponentKt.TeamPresenceComponent(((CollectionsRow.SendMessageRow) collectionsRow).getTeamPresenceState(), false, null, c0Var, 48, 4);
                    c0Var.A();
                } else if (collectionsRow instanceof CollectionsRow.CollectionRow) {
                    c0Var.E(766388896);
                    CollectionRowComponentKt.CollectionRowComponent(((CollectionsRow.CollectionRow) collectionsRow).getRowData(), function1, null, c0Var, 0, 4);
                    c0Var.A();
                } else {
                    if (!Intrinsics.areEqual(collectionsRow, CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE)) {
                        c0Var.E(-390931425);
                        c0Var.A();
                        throw new k0();
                    }
                    c0Var.E(766553072);
                    BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem(null, c0Var, 0, 1);
                    c0Var.A();
                }
                c0Var.A();
                if (m0.l0()) {
                    m0.z0();
                }
            }
        }));
    }
}
