package com.planner5d.library.contest.view.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.dialog.Dialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.widget.AnimatedImageView;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestSuggestDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestSuggestDialog.kt\ncom/planner5d/library/contest/view/dialog/ContestSuggestDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,101:1\n16#2:102\n257#3,2:103\n*S KotlinDebug\n*F\n+ 1 ContestSuggestDialog.kt\ncom/planner5d/library/contest/view/dialog/ContestSuggestDialog\n*L\n22#1:102\n46#1:103,2\n*E\n"})
public final class ContestSuggestDialog extends Dialog<Boolean> implements n0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.preloader.t f153554l3 = new com.planner5d.library.widget.preloader.t();

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final f0 f153555m3 = new i2(j1.d(s.class), new b(), new c(com.planner5d.library.contest.application.a.f148393b.a()), null, 8, null);

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private db.e f153556n3;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153557a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153557a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153557a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153557a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestSuggestDialog.kt\ncom/planner5d/library/contest/view/dialog/ContestSuggestDialog\n*L\n1#1,16:1\n22#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestSuggestDialog.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153559a;

        public c(com.planner5d.library.view.b bVar) {
            this.f153559a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153559a;
        }
    }

    private final s G() {
        return (s) this.f153555m3.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(ContestSuggestDialog contestSuggestDialog, db.e eVar, s.b bVar) {
        if (bVar.a()) {
            contestSuggestDialog.f153554l3.a().m();
            eVar.f269780i.setVisibility(4);
            String string = contestSuggestDialog.getString(com.planner5d.library.contest.e.r.f151631k4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            eVar.f269776e.setQuantity(string);
            eVar.f269777f.setQuantity(string);
        } else {
            contestSuggestDialog.f153554l3.a().b();
            TextView contestSuggestionSubtitle = eVar.f269780i;
            Intrinsics.checkNotNullExpressionValue(contestSuggestionSubtitle, "contestSuggestionSubtitle");
            int i10 = 1 << 0;
            contestSuggestionSubtitle.setVisibility(0);
            String string2 = contestSuggestDialog.getString(com.planner5d.library.contest.e.r.P3);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            eVar.f269776e.setQuantity(string2 + bVar.b());
            eVar.f269777f.setQuantity(string2 + bVar.c());
        }
        eVar.f269778g.setQuantity(contestSuggestDialog.getString(com.planner5d.library.contest.e.r.O3));
        eVar.f269780i.setText(contestSuggestDialog.getString(com.planner5d.library.contest.e.r.E5, Integer.valueOf(bVar.d())));
        return Unit.f312394a;
    }

    private final void I(boolean z10) {
        db.e eVar = this.f153556n3;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        AnimatedImageView animatedImageView = eVar.f269773b;
        if (z10) {
            animatedImageView.b(com.planner5d.library.contest.e.g.f150705wc);
        } else {
            animatedImageView.c();
        }
    }

    private final void J() {
        db.e eVar = this.f153556n3;
        db.e eVar2 = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        u1.j2(eVar.f269774c, new ef.g(getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.Df)));
        db.e eVar3 = this.f153556n3;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            eVar2 = eVar3;
        }
        eVar2.f269774c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestSuggestDialog.K(this.f153585a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(ContestSuggestDialog contestSuggestDialog, View view) {
        contestSuggestDialog.sendResultOnce(Boolean.FALSE);
    }

    private final void L() {
        db.e eVar = this.f153556n3;
        db.e eVar2 = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        u1.j2(eVar.f269775d, new ef.f(getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.f150340yf), null, 2, null));
        db.e eVar3 = this.f153556n3;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            eVar2 = eVar3;
        }
        eVar2.f269775d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestSuggestDialog.M(this.f153662a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(ContestSuggestDialog contestSuggestDialog, View view) {
        contestSuggestDialog.sendResultOnce(Boolean.TRUE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.contest.e.s.P5);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final db.e eVarC = db.e.c(inflater);
        this.f153556n3 = eVarC;
        this.f153554l3.b(eVarC.f269781j);
        J();
        L();
        G().Y().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.contest.view.dialog.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestSuggestDialog.H(this.f153660a, eVarC, (s.b) obj);
            }
        }));
        ConstraintLayout root = eVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        I(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        I(true);
    }
}
