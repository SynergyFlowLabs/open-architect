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
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.k4;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.preloader.t;
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
@SourceDebugExtension({"SMAP\nContestRulesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestRulesFragment.kt\ncom/planner5d/library/contest/view/rules/ContestRulesFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n16#2:61\n1#3:62\n*S KotlinDebug\n*F\n+ 1 ContestRulesFragment.kt\ncom/planner5d/library/contest/view/rules/ContestRulesFragment\n*L\n24#1:61\n*E\n"})
public final class ContestRulesFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f153747e = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f153748f = new i2(j1.d(m.class), new c(), new d(com.planner5d.library.contest.application.a.f148393b.a()), null, 8, null);

    static final class a implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: com.planner5d.library.contest.view.rules.ContestRulesFragment$a$a, reason: collision with other inner class name */
        static final class C1526a implements Function2<c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ContestRulesFragment f153750a;

            C1526a(ContestRulesFragment contestRulesFragment) {
                this.f153750a = contestRulesFragment;
            }

            @o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(c0 c0Var, int i10) {
                if ((i10 & 3) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                if (m0.l0()) {
                    m0.A0(1218757657, i10, -1, "com.planner5d.library.contest.view.rules.ContestRulesFragment.onCreateViewExtended.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContestRulesFragment.kt:46)");
                }
                m.a aVar = (m.a) androidx.compose.runtime.livedata.c.c(this.f153750a.z().W(), c0Var, 0).getValue();
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
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, int i10) {
            if ((i10 & 3) == 2 && c0Var.d()) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(-1374625042, i10, -1, "com.planner5d.library.contest.view.rules.ContestRulesFragment.onCreateViewExtended.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContestRulesFragment.kt:45)");
            }
            ab.d.b(w.e(1218757657, true, new C1526a(ContestRulesFragment.this), c0Var, 54), c0Var, 6);
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
        private final /* synthetic */ Function1 f153751a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153751a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153751a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153751a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestRulesFragment.kt\ncom/planner5d/library/contest/view/rules/ContestRulesFragment\n*L\n1#1,16:1\n24#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestRulesFragment.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153753a;

        public d(com.planner5d.library.view.b bVar) {
            this.f153753a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153753a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(ContestRulesFragment contestRulesFragment, m.a aVar) {
        h0 h0VarA = contestRulesFragment.f153747e.a();
        if (aVar.a()) {
            h0VarA.m();
        } else {
            h0VarA.b();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m z() {
        return (m) this.f153748f.getValue();
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).N(true).K(new k3(com.planner5d.library.contest.e.r.f151897v5, new Object[0])).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController
    @NotNull
    protected View onCreateViewExtended(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(com.planner5d.library.contest.e.l.f151326x0, viewGroup, false);
        db.k kVarA = db.k.a(viewInflate);
        this.f153747e.b(kVarA.f269831c);
        z().W().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.contest.view.rules.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestRulesFragment.A(this.f153776a, (m.a) obj);
            }
        }));
        ComposeView composeView = kVarA.f269835g;
        k4.b bVar = k4.b.f40602b;
        composeView.setViewCompositionStrategy(bVar);
        composeView.setContent(com.planner5d.library.contest.view.rules.b.f153759a.b());
        ComposeView composeView2 = kVarA.f269834f;
        composeView2.setViewCompositionStrategy(bVar);
        composeView2.setContent(w.c(-1374625042, true, new a()));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
