package com.planner5d.library.contest.view.rules;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.k4;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.widget.preloader.h0;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestRulesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestRulesDialog.kt\ncom/planner5d/library/contest/view/rules/ContestRulesDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n16#2:66\n1#3:67\n*S KotlinDebug\n*F\n+ 1 ContestRulesDialog.kt\ncom/planner5d/library/contest/view/rules/ContestRulesDialog\n*L\n19#1:66\n*E\n"})
public final class ContestRulesDialog extends ContentDialog<Void> implements n0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final f0 f153740o3 = new i2(j1.d(m.class), new c(), new d(com.planner5d.library.contest.application.a.f148393b.a()), null, 8, null);

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private db.k f153741p3;

    static final class a implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: com.planner5d.library.contest.view.rules.ContestRulesDialog$a$a, reason: collision with other inner class name */
        static final class C1525a implements Function2<c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ContestRulesDialog f153743a;

            C1525a(ContestRulesDialog contestRulesDialog) {
                this.f153743a = contestRulesDialog;
            }

            @o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void c(c0 c0Var, int i10) {
                if ((i10 & 3) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(-1583409457, i10, -1, "com.planner5d.library.contest.view.rules.ContestRulesDialog.createContentView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContestRulesDialog.kt:48)");
                }
                m.a aVar = (m.a) androidx.compose.runtime.livedata.c.c(this.f153743a.W().W(), c0Var, 0).getValue();
                if (aVar != null && !aVar.a()) {
                    f.h(aVar.b(), c0Var, 0);
                }
                if (m0.l0()) {
                    m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                c(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        a() {
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1562916132, i10, -1, "com.planner5d.library.contest.view.rules.ContestRulesDialog.createContentView.<anonymous>.<anonymous>.<anonymous> (ContestRulesDialog.kt:47)");
            }
            ab.d.b(w.e(-1583409457, true, new C1525a(ContestRulesDialog.this), c0Var, 54), c0Var, 6);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153744a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153744a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153744a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153744a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestRulesDialog.kt\ncom/planner5d/library/contest/view/rules/ContestRulesDialog\n*L\n1#1,16:1\n19#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestRulesDialog.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153746a;

        public d(com.planner5d.library.view.b bVar) {
            this.f153746a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153746a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(ContestRulesDialog contestRulesDialog, m.a aVar) {
        h0 h0VarA = contestRulesDialog.H().a();
        if (aVar.a()) {
            h0VarA.m();
        } else {
            h0VarA.b();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(ContestRulesDialog contestRulesDialog, View view) {
        contestRulesDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m W() {
        return (m) this.f153740o3.getValue();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        db.k kVarD = db.k.d(LayoutInflater.from(getContext()), root, false);
        this.f153741p3 = kVarD;
        db.k kVar = null;
        if (kVarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            kVarD = null;
        }
        CoordinatorLayout root2 = kVarD.getRoot();
        com.planner5d.library.widget.preloader.t tVarH = H();
        db.k kVar2 = this.f153741p3;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            kVar2 = null;
        }
        tVarH.b(kVar2.f269831c);
        W().W().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.contest.view.rules.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestRulesDialog.U(this.f153774a, (m.a) obj);
            }
        }));
        db.k kVar3 = this.f153741p3;
        if (kVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            kVar3 = null;
        }
        kVar3.f269833e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.rules.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestRulesDialog.V(this.f153775a, view);
            }
        });
        db.k kVar4 = this.f153741p3;
        if (kVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            kVar4 = null;
        }
        ComposeView composeView = kVar4.f269835g;
        k4.b bVar = k4.b.f40602b;
        composeView.setViewCompositionStrategy(bVar);
        composeView.setContent(com.planner5d.library.contest.view.rules.a.f153754a.b());
        db.k kVar5 = this.f153741p3;
        if (kVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            kVar = kVar5;
        }
        ComposeView composeView2 = kVar.f269834f;
        composeView2.setViewCompositionStrategy(bVar);
        composeView2.setContent(w.c(1562916132, true, new a()));
        Intrinsics.checkNotNullExpressionValue(root2, "apply(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.contest.e.l.f151249g0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog
    protected void onActivityCreatedWithSetup(@Nullable Bundle bundle) {
        super.onActivityCreatedWithSetup(bundle);
        com.planner5d.library.activity.fragment.dialog.i.b bVar = com.planner5d.library.activity.fragment.dialog.i.f132070d;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        O(bVar.a(contextRequireContext));
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.contest.e.s.P5);
    }
}
