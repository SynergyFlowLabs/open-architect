package com.planner5d.library.widget.editor.helper;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.fragment.dialog.AddLightingDialog;
import com.planner5d.library.activity.fragment.dialog.snapshots.SnapshotSetupDialog;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.widget.editor.PovPromptView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.annotation.l0
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperEditorSnapshotController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperEditorSnapshotController.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorSnapshotController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,307:1\n1#2:308\n808#3,11:309\n171#4,8:320\n257#5,2:328\n*S KotlinDebug\n*F\n+ 1 HelperEditorSnapshotController.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorSnapshotController\n*L\n98#1:309,11\n111#1:320,8\n267#1:328,2\n*E\n"})
public final class n2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f256579r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.w f256580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.h f256581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.facade.e f256582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h2 f256583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.b2 f256584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final cf.a f256585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final le.k f256586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f256587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f256588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f256589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f256590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.facade.d f256591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private WeakReference<TextView> f256592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f256593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private gd.a f256594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private PovPromptView f256595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.u<gd.a> f256596q;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f256597g = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.model.manager.b2 f256598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final cf.a f256599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final le.k f256600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.activity.fragment.dialog.k f256601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.activity.fragment.x f256602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.utility.t f256603f;

        @ij.a
        public a(@NotNull com.planner5d.library.model.manager.b2 messageManager, @NotNull cf.a prepareSnapshotPreliminaryData, @NotNull le.k requestRender, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers) {
            Intrinsics.checkNotNullParameter(messageManager, "messageManager");
            Intrinsics.checkNotNullParameter(prepareSnapshotPreliminaryData, "prepareSnapshotPreliminaryData");
            Intrinsics.checkNotNullParameter(requestRender, "requestRender");
            Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            this.f256598a = messageManager;
            this.f256599b = prepareSnapshotPreliminaryData;
            this.f256600c = requestRender;
            this.f256601d = dialogLauncher;
            this.f256602e = navigator;
            this.f256603f = coroutineDispatchers;
        }

        @NotNull
        public final n2 a(@NotNull com.planner5d.library.widget.editor.facade.w editorSupportingViewsController, @NotNull com.planner5d.library.widget.editor.facade.h editorFacade, @NotNull com.planner5d.library.widget.editor.facade.e contextProvider, @NotNull h2 helperEditorPreloader, @NotNull kotlinx.coroutines.s0 coroutineScope) {
            Intrinsics.checkNotNullParameter(editorSupportingViewsController, "editorSupportingViewsController");
            Intrinsics.checkNotNullParameter(editorFacade, "editorFacade");
            Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
            Intrinsics.checkNotNullParameter(helperEditorPreloader, "helperEditorPreloader");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new n2(editorSupportingViewsController, editorFacade, contextProvider, helperEditorPreloader, this.f256598a, this.f256599b, this.f256600c, this.f256601d, this.f256602e, coroutineScope, this.f256603f);
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function0<Unit> {
        b(Object obj) {
            super(0, obj, n2.class, "showAddLightingDialog", "showAddLightingDialog()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((n2) this.receiver).Q();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorSnapshotController$initiateSnapshotSetup$1", f = "HelperEditorSnapshotController.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256604a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ gd.a f256606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(gd.a aVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f256606c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n2.this.new c(this.f256606c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256604a;
            if (i10 == 0) {
                ResultKt.m(obj);
                cf.a aVar = n2.this.f256585f;
                com.planner5d.library.widget.editor.facade.h hVar = n2.this.f256581b;
                com.planner5d.library.widget.editor.facade.e eVar = n2.this.f256582c;
                this.f256604a = 1;
                objA = aVar.a(hVar, eVar, this);
                if (objA == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                objA = ((Result) obj).j();
            }
            n2 n2Var = n2.this;
            Throwable thD = Result.d(objA);
            if (thD != null) {
                n2Var.f256584e.c(thD);
                n2Var.B();
                return Unit.f312394a;
            }
            com.planner5d.library.widget.editor.interactor.a.C1733a c1733a = (com.planner5d.library.widget.editor.interactor.a.C1733a) objA;
            if (n2.this.f256581b.i()) {
                n2.this.B();
                return Unit.f312394a;
            }
            n2.this.f256587h.c(SnapshotSetupDialog.class).i(n2.this.u(c1733a, this.f256606c)).m(n2.this.f256596q).g();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorSnapshotController$requestSnapshot$1", f = "HelperEditorSnapshotController.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256607a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n2.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f256607a;
            if (i10 == 0) {
                ResultKt.m(obj);
                le.k kVar = n2.this.f256586g;
                Project model = n2.this.f256581b.getModel();
                Long id2 = model != null ? model.getId() : null;
                Intrinsics.checkNotNull(id2);
                long jLongValue = id2.longValue();
                com.planner5d.library.widget.editor.a aVarB = n2.this.f256581b.b();
                Intrinsics.checkNotNull(aVarB);
                gd.a aVar = n2.this.f256594o;
                Intrinsics.checkNotNull(aVar);
                this.f256607a = 1;
                dVar = this;
                obj = kVar.a(jLongValue, aVarB, aVar, dVar);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                dVar = this;
            }
            com.planner5d.library.services.utility.s2 s2Var = (com.planner5d.library.services.utility.s2) obj;
            if (n2.this.f256581b.i()) {
                return Unit.f312394a;
            }
            if (s2Var instanceof com.planner5d.library.services.utility.s2.c) {
                n2.this.F((gd.b) ((com.planner5d.library.services.utility.s2.c) s2Var).e());
            } else {
                if (!(s2Var instanceof com.planner5d.library.services.utility.s2.b)) {
                    throw new kotlin.k0();
                }
                n2.this.f256584e.n((ErrorMessageException) ((com.planner5d.library.services.utility.s2.b) s2Var).e());
            }
            n2.this.B();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.helper.HelperEditorSnapshotController$setup$$inlined$executeOnMainThread$1", f = "HelperEditorSnapshotController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$executeOnMainThread$1\n+ 2 HelperEditorSnapshotController.kt\ncom/planner5d/library/widget/editor/helper/HelperEditorSnapshotController\n*L\n1#1,176:1\n112#2,10:177\n*E\n"})
    public static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n2 f256610b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.coroutines.d dVar, n2 n2Var) {
            super(2, dVar);
            this.f256610b = n2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(dVar, this.f256610b);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f256609a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f256610b.t();
            this.f256610b.S();
            SnapshotSetupDialog snapshotSetupDialogZ = this.f256610b.z();
            if (snapshotSetupDialogZ != null) {
                int i10 = 4 | 0;
                snapshotSetupDialogZ.setup(null, this.f256610b.f256596q, null);
                snapshotSetupDialogZ.showInternalDialog();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class f implements AddLightingDialog.a {
        f() {
        }

        @Override // com.planner5d.library.activity.fragment.dialog.AddLightingDialog.a
        public void a() {
            n2.this.J();
        }

        @Override // com.planner5d.library.activity.fragment.dialog.AddLightingDialog.a
        public void b() {
            n2.this.N(null);
            n2.this.G();
        }
    }

    public n2(@NotNull com.planner5d.library.widget.editor.facade.w editorSupportingViewsController, @NotNull com.planner5d.library.widget.editor.facade.h editorFacade, @NotNull com.planner5d.library.widget.editor.facade.e contextProvider, @NotNull h2 helperEditorPreloader, @NotNull com.planner5d.library.model.manager.b2 messageManager, @NotNull cf.a prepareSnapshotPreliminaryData, @NotNull le.k requestRender, @NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull com.planner5d.library.services.utility.t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(editorSupportingViewsController, "editorSupportingViewsController");
        Intrinsics.checkNotNullParameter(editorFacade, "editorFacade");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(helperEditorPreloader, "helperEditorPreloader");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(prepareSnapshotPreliminaryData, "prepareSnapshotPreliminaryData");
        Intrinsics.checkNotNullParameter(requestRender, "requestRender");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f256580a = editorSupportingViewsController;
        this.f256581b = editorFacade;
        this.f256582c = contextProvider;
        this.f256583d = helperEditorPreloader;
        this.f256584e = messageManager;
        this.f256585f = prepareSnapshotPreliminaryData;
        this.f256586g = requestRender;
        this.f256587h = dialogLauncher;
        this.f256588i = navigator;
        this.f256589j = coroutineScope;
        this.f256590k = coroutineDispatchers;
        this.f256596q = new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.widget.editor.helper.m2
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                n2.H(this.f256570a, (gd.a) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        this.f256583d.i(false);
    }

    private final void C() {
        View view;
        ViewStub viewStub;
        if (!E() || this.f256595p != null || (view = this.f256582c.getView()) == null || (viewStub = (ViewStub) view.findViewById(com.planner5d.library.f.j.f168049el)) == null) {
            return;
        }
        View viewInflate = viewStub.inflate();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.planner5d.library.widget.editor.PovPromptView");
        PovPromptView povPromptView = (PovPromptView) viewInflate;
        povPromptView.setOnRenderClickAction(new b(this));
        this.f256595p = povPromptView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(gd.b bVar) {
        com.planner5d.library.activity.fragment.x.g(this.f256588i, new ProjectsPagesFragment.a().a(bVar), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        this.f256593n = true;
        com.planner5d.library.widget.editor.facade.d dVar = this.f256591l;
        if (dVar != null) {
            dVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(n2 n2Var, gd.a aVar) {
        n2Var.B();
        if (aVar == null) {
            return;
        }
        n2Var.I(aVar);
    }

    private final void I(gd.a aVar) {
        if (this.f256581b.G().H1()) {
            this.f256580a.J(aVar);
        } else {
            N(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        R();
        kotlinx.coroutines.k.f(this.f256589j, this.f256590k.a(), null, new d(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(gd.a aVar) {
        this.f256594o = aVar;
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        Fragment fragmentI = this.f256582c.i();
        if (fragmentI == null) {
            return;
        }
        AddLightingDialog addLightingDialog = new AddLightingDialog();
        addLightingDialog.setCallback(new f());
        addLightingDialog.show(fragmentI.getChildFragmentManager(), "add_lighting_dialog");
    }

    private final void R() {
        this.f256583d.l(Integer.valueOf(com.planner5d.library.f.s.xu));
        this.f256583d.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        com.planner5d.library.widget.editor.facade.h hVar = this.f256581b;
        hVar.m(E());
        hVar.F().n();
        U();
        com.planner5d.library.widget.editor.facade.w wVar = this.f256580a;
        wVar.g();
        wVar.C();
        T();
    }

    private final void T() {
        C();
        PovPromptView povPromptView = this.f256595p;
        if (povPromptView != null) {
            povPromptView.setVisibility(E() ? 0 : 8);
        }
    }

    private final void U() {
        TextView textView;
        WeakReference<TextView> weakReference = this.f256592m;
        if (weakReference != null && (textView = weakReference.get()) != null) {
            com.planner5d.library.services.utility.k3 k3VarY = y();
            if (k3VarY != null) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setText(k3VarY.i(context));
                textView.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        Bundle bundleH;
        Bundle bundleD = this.f256581b.d();
        if (bundleD != null && (bundleH = new com.planner5d.library.services.utility.j(bundleD).h(com.planner5d.library.services.r.editor, null)) != null) {
            com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundleH);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.renderData;
            Bundle bundleH2 = jVar.h(rVar, null);
            if (bundleH2 == null) {
                return;
            }
            bundleH.remove(rVar.f224891a);
            this.f256594o = new gd.a(bundleH2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    public final com.planner5d.library.services.utility.i u(com.planner5d.library.widget.editor.interactor.a.C1733a c1733a, gd.a aVar) {
        Long id2;
        Long l10;
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        Project model = this.f256581b.getModel();
        if (model != null && (l10 = model.projectId) != null) {
            iVar.g(com.planner5d.library.services.r.projectId, l10.longValue());
        }
        if (model == null || (id2 = model.getId()) == null) {
            iVar.n(com.planner5d.library.services.r.projectData, c1733a.b());
        } else if (iVar.g(com.planner5d.library.services.r.project, id2.longValue()) == null) {
            iVar.n(com.planner5d.library.services.r.projectData, c1733a.b());
        }
        if (aVar != null) {
            iVar.h(com.planner5d.library.services.r.renderData, aVar.a());
        }
        iVar.h(com.planner5d.library.services.r.cameraFrom, c1733a.c().c());
        iVar.j(com.planner5d.library.services.r.screenshot, c1733a.a());
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SnapshotSetupDialog z() {
        FragmentManager parentFragmentManager;
        List<Fragment> listN0;
        try {
            Fragment fragmentI = this.f256582c.i();
            if (fragmentI != null && (parentFragmentManager = fragmentI.getParentFragmentManager()) != null && (listN0 = parentFragmentManager.N0()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listN0) {
                    if (obj instanceof SnapshotSetupDialog) {
                        arrayList.add(obj);
                    }
                }
                return (SnapshotSetupDialog) CollectionsKt.firstOrNull((List) arrayList);
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    @Nullable
    public final WeakReference<TextView> A() {
        return this.f256592m;
    }

    public final void D() {
        gd.a aVar = this.f256594o;
        N(null);
        R();
        kotlinx.coroutines.k.f(this.f256589j, this.f256590k.a(), null, new c(aVar, null), 2, null);
    }

    public final boolean E() {
        return this.f256594o != null;
    }

    public final void K(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.renderData;
        Bundle bundleH = jVar.h(rVar, null);
        this.f256594o = bundleH != null ? new gd.a(bundleH) : null;
        this.f256593n = jVar.f(rVar, false);
    }

    public final void L(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str = com.planner5d.library.services.r.renderData.f224891a;
        gd.a aVar = this.f256594o;
        bundle.putBundle(str, aVar != null ? aVar.a() : null);
        bundle.putBoolean(com.planner5d.library.services.r.openLighting.f224891a, this.f256593n);
    }

    public final void M(@Nullable com.planner5d.library.widget.editor.facade.d dVar) {
        this.f256591l = dVar;
    }

    public final void O(@Nullable WeakReference<TextView> weakReference) {
        this.f256592m = weakReference;
    }

    @androidx.annotation.d
    public final void P() {
        com.planner5d.library.services.utility.c0 c0Var = com.planner5d.library.services.utility.c0.f225068a;
        if (!com.planner5d.library.services.utility.o3.b()) {
            int i10 = (6 ^ 0) | 0;
            kotlinx.coroutines.k.f(kotlinx.coroutines.f2.f314023a, com.planner5d.library.services.utility.s.f229729a.a(), null, new e(null, this), 2, null);
            return;
        }
        t();
        S();
        SnapshotSetupDialog snapshotSetupDialogZ = z();
        if (snapshotSetupDialogZ != null) {
            snapshotSetupDialogZ.setup(null, this.f256596q, null);
            snapshotSetupDialogZ.showInternalDialog();
        }
    }

    public final void V() {
        PovPromptView povPromptView = this.f256595p;
        if (povPromptView != null) {
            povPromptView.E();
        }
    }

    public final void v() {
        SnapshotSetupDialog snapshotSetupDialogZ = z();
        if (snapshotSetupDialogZ == null || !snapshotSetupDialogZ.isAdded()) {
            return;
        }
        snapshotSetupDialogZ.dismiss();
    }

    @Nullable
    public final com.planner5d.library.widget.editor.facade.d w() {
        return this.f256591l;
    }

    public final boolean x() {
        return this.f256593n;
    }

    @Nullable
    public final com.planner5d.library.services.utility.k3 y() {
        gd.a aVar = this.f256594o;
        if (aVar == null) {
            return null;
        }
        int i10 = com.planner5d.library.f.s.Cz;
        Integer numP = aVar.f275442a.p();
        Intrinsics.checkNotNullExpressionValue(numP, "getTitle(...)");
        return new com.planner5d.library.services.utility.k3(i10, new com.planner5d.library.services.utility.k3(numP.intValue(), new Object[0]));
    }
}
