package com.planner5d.library.contest.view.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.widget.preloader.h0;
import com.planner5d.library.widget.textview.ButtonTextView;
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
@SourceDebugExtension({"SMAP\nContestSubmittedDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestSubmittedDialog.kt\ncom/planner5d/library/contest/view/dialog/ContestSubmittedDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n16#2:65\n1#3:66\n*S KotlinDebug\n*F\n+ 1 ContestSubmittedDialog.kt\ncom/planner5d/library/contest/view/dialog/ContestSubmittedDialog\n*L\n17#1:65\n*E\n"})
public final class ContestSubmittedDialog extends ContentDialog<Boolean> implements n0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final f0 f153550o3 = new i2(j1.d(l.class), new b(), new c(com.planner5d.library.contest.application.a.f148393b.a()), null, 8, null);

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f153551a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f153551a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f153551a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f153551a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestSubmittedDialog.kt\ncom/planner5d/library/contest/view/dialog/ContestSubmittedDialog\n*L\n1#1,16:1\n17#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestSubmittedDialog.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153553a;

        public c(com.planner5d.library.view.b bVar) {
            this.f153553a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153553a;
        }
    }

    public ContestSubmittedDialog() {
        int i10 = 3 ^ 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(ContestSubmittedDialog contestSubmittedDialog, View view) {
        contestSubmittedDialog.sendResultOnce(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(db.c cVar, final ContestSubmittedDialog contestSubmittedDialog, Boolean bool) {
        TextView textView = cVar.f269765h;
        Boolean bool2 = Boolean.TRUE;
        int i10 = 4;
        textView.setVisibility(Intrinsics.areEqual(bool, bool2) ? 0 : 4);
        ButtonTextView buttonTextView = cVar.f269761d;
        if (bool != null) {
            i10 = 0;
        }
        buttonTextView.setVisibility(i10);
        h0 h0VarA = contestSubmittedDialog.H().a();
        if (bool == null) {
            h0VarA.m();
        } else {
            h0VarA.b();
        }
        if (Intrinsics.areEqual(bool, bool2)) {
            cVar.f269761d.setText(contestSubmittedDialog.getString(com.planner5d.library.contest.e.r.f151511f4));
            cVar.f269761d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContestSubmittedDialog.Y(this.f153573a, view);
                }
            });
            cVar.f269761d.setBackground(androidx.core.content.d.l(contestSubmittedDialog.requireContext(), com.planner5d.library.contest.e.g.R4));
        } else {
            cVar.f269761d.setText(contestSubmittedDialog.getString(com.planner5d.library.contest.e.r.f151549gi));
            cVar.f269761d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContestSubmittedDialog.Z(this.f153574a, view);
                }
            });
            cVar.f269761d.setBackground(androidx.core.content.d.l(contestSubmittedDialog.requireContext(), com.planner5d.library.contest.e.g.P4));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(ContestSubmittedDialog contestSubmittedDialog, View view) {
        contestSubmittedDialog.sendResultOnce(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(ContestSubmittedDialog contestSubmittedDialog, View view) {
        contestSubmittedDialog.sendResultOnce(Boolean.FALSE);
    }

    private final l a0() {
        return (l) this.f153550o3.getValue();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        final db.c cVarA = db.c.a(LayoutInflater.from(getContext()).inflate(com.planner5d.library.contest.e.l.Y, root, false));
        H().b(cVarA.f269762e);
        cVarA.f269759b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestSubmittedDialog.W(this.f153570a, view);
            }
        });
        a0().W().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.contest.view.dialog.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContestSubmittedDialog.X(cVarA, this, (Boolean) obj);
            }
        }));
        ConstraintLayout root2 = cVarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
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

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.contest.e.s.P5);
    }
}
