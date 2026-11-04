package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.pager.i1;
import androidx.compose.foundation.pager.m1;
import androidx.compose.foundation.pager.v0;
import androidx.compose.material3.pt;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPreviewRootScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewRootScreen.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewRootScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,160:1\n68#2:161\n57#2,10:162\n75#3:172\n607#4:173\n604#4,6:174\n1282#5,3:180\n1285#5,3:184\n605#6:183\n*S KotlinDebug\n*F\n+ 1 PreviewRootScreen.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewRootScreenKt\n*L\n40#1:161\n40#1:162,10\n48#1:172\n51#1:173\n51#1:174,6\n51#1:180,3\n51#1:184,3\n51#1:183\n*E\n"})
public final class PreviewRootScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$1", f = "PreviewRootScreen.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ i1 $pagerState;
        final /* synthetic */ PreviewViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(i1 i1Var, PreviewViewModel previewViewModel, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$pagerState = i1Var;
            this.$viewModel = previewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$pagerState, this.$viewModel, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final i1 i1Var = this.$pagerState;
                kotlinx.coroutines.flow.i iVarY = w6.y(new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(i1Var.E());
                    }
                });
                final PreviewViewModel previewViewModel = this.$viewModel;
                kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt.PreviewRootScreen.1.2
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit(((Number) obj2).intValue(), (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(int i11, kotlin.coroutines.d<? super Unit> dVar) {
                        previewViewModel.onPageNavigated$intercom_sdk_ui_release(i11);
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVarY.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nPreviewRootScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewRootScreen.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewRootScreenKt$PreviewRootScreen$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n75#2:161\n75#2:162\n87#3:163\n84#3,9:164\n94#3:203\n80#4,6:173\n87#4,3:188\n90#4,2:197\n94#4:202\n391#5,9:179\n400#5,3:199\n4360#6,6:191\n1557#7:204\n1628#7,3:205\n1557#7:208\n1628#7,3:209\n*S KotlinDebug\n*F\n+ 1 PreviewRootScreen.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewRootScreenKt$PreviewRootScreen$2\n*L\n91#1:161\n92#1:162\n88#1:163\n88#1:164,9\n88#1:203\n88#1:173,6\n88#1:188,3\n88#1:197,2\n88#1:202\n88#1:179,9\n88#1:199,3\n88#1:191,6\n105#1:204\n105#1:205,3\n135#1:208\n135#1:209,3\n*E\n"})
    static final class AnonymousClass2 implements pj.n<g5, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function0<Unit> $onBackCLick;
        final /* synthetic */ Function1<IntercomPreviewFile, Unit> $onDeleteClick;
        final /* synthetic */ Function1<List<? extends Uri>, Unit> $onSendClick;
        final /* synthetic */ i1 $pagerState;
        final /* synthetic */ androidx.activity.compose.k<String, Boolean> $permissionLauncher;
        final /* synthetic */ s0 $scope;
        final /* synthetic */ PreviewUiState $state;
        final /* synthetic */ PreviewViewModel $viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(PreviewUiState previewUiState, Function0<Unit> function0, i1 i1Var, Function1<? super IntercomPreviewFile, Unit> function1, Function1<? super List<? extends Uri>, Unit> function2, Context context, androidx.activity.compose.k<String, Boolean> kVar, PreviewViewModel previewViewModel, s0 s0Var) {
            this.$state = previewUiState;
            this.$onBackCLick = function0;
            this.$pagerState = i1Var;
            this.$onDeleteClick = function1;
            this.$onSendClick = function2;
            this.$context = context;
            this.$permissionLauncher = kVar;
            this.$viewModel = previewViewModel;
            this.$scope = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$0(Function1 onDeleteClick, PreviewUiState state) {
            Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
            Intrinsics.checkNotNullParameter(state, "$state");
            onDeleteClick.invoke(state.getFiles().get(state.getCurrentPage()));
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$2(Function1 onSendClick, PreviewUiState state) {
            Intrinsics.checkNotNullParameter(onSendClick, "$onSendClick");
            Intrinsics.checkNotNullParameter(state, "$state");
            List<IntercomPreviewFile> files = state.getFiles();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
            Iterator<T> it = files.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntercomPreviewFile) it.next()).getUri());
            }
            onSendClick.invoke(arrayList);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$3(Context context, androidx.activity.compose.k permissionLauncher, PreviewViewModel previewViewModel, PreviewUiState state) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(permissionLauncher, "$permissionLauncher");
            Intrinsics.checkNotNullParameter(state, "$state");
            PreviewRootScreenKt.PreviewRootScreen$saveFile(previewViewModel, state, context);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$4(s0 scope, i1 pagerState, int i10) {
            Intrinsics.checkNotNullParameter(scope, "$scope");
            Intrinsics.checkNotNullParameter(pagerState, "$pagerState");
            kotlinx.coroutines.k.f(scope, null, null, new PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(pagerState, i10, null), 3, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(Function1 onSendClick, PreviewUiState state) {
            Intrinsics.checkNotNullParameter(onSendClick, "$onSendClick");
            Intrinsics.checkNotNullParameter(state, "$state");
            List<IntercomPreviewFile> files = state.getFiles();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
            Iterator<T> it = files.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntercomPreviewFile) it.next()).getUri());
            }
            onSendClick.invoke(arrayList);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(g5 g5Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(g5Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(g5 it, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            String confirmationText;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i10 & 14) == 0) {
                i11 = i10 | (c0Var.D(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && c0Var.d()) {
                c0Var.u();
                return;
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarF = i6.f(d5.u(aVar, d5.o(it, (androidx.compose.ui.unit.w) c0Var.W(q1.u())), it.d(), d5.n(it, (androidx.compose.ui.unit.w) c0Var.W(q1.u())), it.a()), 0.0f, 1, null);
            final PreviewUiState previewUiState = this.$state;
            Function0<Unit> function0 = this.$onBackCLick;
            final i1 i1Var = this.$pagerState;
            final Function1<IntercomPreviewFile, Unit> function1 = this.$onDeleteClick;
            final Function1<List<? extends Uri>, Unit> function2 = this.$onSendClick;
            final Context context = this.$context;
            final androidx.activity.compose.k<String, Boolean> kVar = this.$permissionLauncher;
            final PreviewViewModel previewViewModel = this.$viewModel;
            final s0 s0Var = this.$scope;
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarB, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            n0 n0Var = n0.f16227a;
            PreviewTopBarKt.PreviewTopBar(null, previewUiState.getShowDeleteAction(), previewUiState.getShowSendAction(), previewUiState.getShowDownloadAction(), function0, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$0(function1, previewUiState);
                }
            }, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$2(function2, previewUiState);
                }
            }, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$3(context, kVar, previewViewModel, previewUiState);
                }
            }, c0Var, 0, 1);
            androidx.compose.foundation.pager.g0.j(i1Var, m0.o(n0Var, aVar, 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, androidx.compose.runtime.internal.w.e(-816981083, true, new pj.o<v0, Integer, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$1$4
                @Override // pj.o
                public /* bridge */ /* synthetic */ Unit invoke(v0 v0Var, Integer num, androidx.compose.runtime.c0 c0Var2, Integer num2) {
                    invoke(v0Var, num.intValue(), c0Var2, num2.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(v0 HorizontalPager, int i12, androidx.compose.runtime.c0 c0Var2, int i13) {
                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                    PreviewUriKt.PreviewUri(androidx.compose.ui.a0.E, previewUiState.getFiles().get(i12), c0Var2, 70, 0);
                }
            }, c0Var, 54), c0Var, 0, 24576, 16380);
            c0Var.E(1884493226);
            if (previewUiState.getFiles().size() > 1 || ((confirmationText = previewUiState.getConfirmationText()) != null && !StringsKt.w3(confirmationText))) {
                PreviewBottomBarKt.PreviewBottomBar(aVar, previewUiState, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$4(s0Var, i1Var, ((Integer) obj).intValue());
                    }
                }, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$6(function2, previewUiState);
                    }
                }, c0Var, 70, 0);
            }
            c0Var.A();
            c0Var.o();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewRootScreen(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final IntercomPreviewArgs previewArgs, @Nullable PreviewViewModel previewViewModel, @NotNull final Function0<Unit> onBackCLick, @NotNull final Function1<? super IntercomPreviewFile, Unit> onDeleteClick, @NotNull final Function1<? super List<? extends Uri>, Unit> onSendClick, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final PreviewViewModel previewViewModel2;
        int i12;
        Intrinsics.checkNotNullParameter(previewArgs, "previewArgs");
        Intrinsics.checkNotNullParameter(onBackCLick, "onBackCLick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1944224733);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        if ((i11 & 4) != 0) {
            String string = UUID.randomUUID().toString();
            j2.c cVarFactory$intercom_sdk_ui_release = PreviewViewModel.Companion.factory$intercom_sdk_ui_release(previewArgs);
            m2 m2VarC = androidx.lifecycle.viewmodel.compose.b.f52543a.c(c0VarR, 6);
            if (m2VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            f2 f2VarH = androidx.lifecycle.viewmodel.compose.l.h(j1.d(PreviewViewModel.class), m2VarC, string, cVarFactory$intercom_sdk_ui_release, m2VarC instanceof androidx.lifecycle.z ? ((androidx.lifecycle.z) m2VarC).getDefaultViewModelCreationExtras() : v2.a.b.f381327c, c0VarR, 4096, 0);
            c0VarR = c0VarR;
            previewViewModel2 = (PreviewViewModel) f2VarH;
            i12 = i10 & (-897);
        } else {
            previewViewModel2 = previewViewModel;
            i12 = i10;
        }
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        final PreviewUiState previewUiState = (PreviewUiState) w6.b(previewViewModel2.getState$intercom_sdk_ui_release(), null, c0VarR, 8, 1).getValue();
        Object objI0 = c0VarR.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
            c0VarR.Y(objI0);
        }
        int i13 = i12;
        i1 i1VarQ = m1.q(previewUiState.getCurrentPage(), 0.0f, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PreviewRootScreenKt.PreviewRootScreen$lambda$0(previewUiState));
            }
        }, c0VarR, 48, 0);
        androidx.compose.runtime.c0 c0Var2 = c0VarR;
        androidx.activity.compose.k kVarA = androidx.activity.compose.d.a(new g.b.l(), new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewRootScreenKt.PreviewRootScreen$lambda$1(context, previewArgs, previewViewModel2, previewUiState, ((Boolean) obj).booleanValue());
            }
        }, c0Var2, 8);
        b2.i("Page Navigation", new AnonymousClass1(i1VarQ, previewViewModel2, null), c0Var2, 70);
        q0.a aVar = q0.f38131b;
        final PreviewViewModel previewViewModel3 = previewViewModel2;
        pt.f(a0Var2, null, null, null, null, 0, aVar.a(), aVar.w(), null, androidx.compose.runtime.internal.w.e(-1427415762, true, new AnonymousClass2(previewUiState, onBackCLick, i1VarQ, onDeleteClick, onSendClick, context, kVarA, previewViewModel3, (s0) objI0), c0Var2, 54), c0Var2, (i13 & 14) | 819462144, androidx.constraintlayout.core.motion.utils.v.a.f43976s);
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewRootScreenKt.PreviewRootScreen$lambda$2(a0Var2, previewArgs, previewViewModel3, onBackCLick, onDeleteClick, onSendClick, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PreviewRootScreen$lambda$0(PreviewUiState state) {
        Intrinsics.checkNotNullParameter(state, "$state");
        return state.getFiles().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreen$lambda$1(Context context, IntercomPreviewArgs previewArgs, PreviewViewModel previewViewModel, PreviewUiState state, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(previewArgs, "$previewArgs");
        Intrinsics.checkNotNullParameter(state, "$state");
        if (z10) {
            PreviewRootScreen$saveFile(previewViewModel, state, context);
        } else {
            Toast.makeText(context, previewArgs.getDownloadState().getPermissionDeniedText(), 1).show();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreen$lambda$2(androidx.compose.ui.a0 a0Var, IntercomPreviewArgs previewArgs, PreviewViewModel previewViewModel, Function0 onBackCLick, Function1 onDeleteClick, Function1 onSendClick, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(previewArgs, "$previewArgs");
        Intrinsics.checkNotNullParameter(onBackCLick, "$onBackCLick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        Intrinsics.checkNotNullParameter(onSendClick, "$onSendClick");
        PreviewRootScreen(a0Var, previewArgs, previewViewModel, onBackCLick, onDeleteClick, onSendClick, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewRootScreen$saveFile(PreviewViewModel previewViewModel, PreviewUiState previewUiState, Context context) {
        previewViewModel.saveFile$intercom_sdk_ui_release(previewUiState.getFiles().get(previewUiState.getCurrentPage()), context);
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PreviewRootScreenPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2020659128);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            PreviewRootScreen(null, new IntercomPreviewArgs(CollectionsKt.emptyList(), null, null, false, null, 30, null), new PreviewViewModel(new IntercomPreviewArgs(CollectionsKt.emptyList(), null, null, false, null, 30, null)), new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.f312394a;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PreviewRootScreenKt.PreviewRootScreenPreview$lambda$4((IntercomPreviewFile) obj);
                }
            }, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PreviewRootScreenKt.PreviewRootScreenPreview$lambda$5((List) obj);
                }
            }, c0VarR, 224832, 1);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewRootScreenKt.PreviewRootScreenPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreenPreview$lambda$4(IntercomPreviewFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreenPreview$lambda$5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreenPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewRootScreenPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
