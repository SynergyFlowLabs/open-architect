package com.planner5d.library.legal.view.dialog.agreements;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.k2;
import androidx.core.view.u1;
import androidx.fragment.app.m;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.legal.application.e;
import com.planner5d.library.legal.view.AgreementsVideoView;
import com.planner5d.library.widget.z0;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nAgreementsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgreementsDialog.kt\ncom/planner5d/library/legal/view/dialog/agreements/AgreementsDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,79:1\n16#2:80\n1#3:81\n28#4:82\n*S KotlinDebug\n*F\n+ 1 AgreementsDialog.kt\ncom/planner5d/library/legal/view/dialog/agreements/AgreementsDialog\n*L\n23#1:80\n65#1:82\n*E\n"})
public final class AgreementsDialog extends m {
    private uc.a H1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final f0 f180428p1;

    public static final class a extends Dialog {
        a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            timber.log.b.f381052a.a("User pressed 'back' on agreements dialog. Ignored.", new Object[0]);
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 AgreementsDialog.kt\ncom/planner5d/library/legal/view/dialog/agreements/AgreementsDialog\n*L\n1#1,16:1\n23#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return AgreementsDialog.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f180430a;

        public c(com.planner5d.library.view.b bVar) {
            this.f180430a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f180430a;
        }
    }

    public AgreementsDialog() {
        Function0 function0 = null;
        this.f180428p1 = new i2(j1.d(com.planner5d.library.legal.view.dialog.agreements.c.class), new b(), new c(e.f180321b.a()), function0, 8, null);
    }

    private final com.planner5d.library.legal.view.dialog.agreements.c C() {
        return (com.planner5d.library.legal.view.dialog.agreements.c) this.f180428p1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(AgreementsDialog agreementsDialog) {
        agreementsDialog.F();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3 E(AgreementsVideoView agreementsVideoView, View view, g3 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        agreementsVideoView.setPadding(0, 0, 0, insets.f(g3.m.i()).f47826d);
        return insets;
    }

    private final void F() {
        C().V();
        dismiss();
        androidx.activity.result.b parentFragment = getParentFragment();
        DialogInterface.OnDismissListener onDismissListener = parentFragment instanceof DialogInterface.OnDismissListener ? (DialogInterface.OnDismissListener) parentFragment : null;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(getDialog());
        }
        androidx.activity.result.b parentFragment2 = getParentFragment();
        z0 z0Var = parentFragment2 instanceof z0 ? (z0) parentFragment2 : null;
        if (z0Var != null) {
            z0Var.onChildDialogDismiss(this);
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            k2.c(window, false);
            window.setStatusBarColor(androidx.core.content.d.g(window.getContext(), R.color.transparent));
        }
        uc.a aVar = this.H1;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f381220b.A(new Function0() { // from class: com.planner5d.library.legal.view.dialog.agreements.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgreementsDialog.D(this.f180432a);
            }
        });
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, tc.b.r.D5);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        a aVar = new a(requireContext(), getTheme());
        Window window = aVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        aVar.setCanceledOnTouchOutside(false);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        uc.a aVarD = uc.a.d(inflater, viewGroup, false);
        this.H1 = aVarD;
        final AgreementsVideoView agreementsVideoViewB = aVarD.getRoot();
        u1.j2(agreementsVideoViewB, new b1() { // from class: com.planner5d.library.legal.view.dialog.agreements.a
            @Override // androidx.core.view.b1
            public final g3 b(View view, g3 g3Var) {
                return AgreementsDialog.E(agreementsVideoViewB, view, g3Var);
            }
        });
        Intrinsics.checkNotNullExpressionValue(agreementsVideoViewB, "also(...)");
        return agreementsVideoViewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        uc.a aVar = this.H1;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f381220b.C();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        uc.a aVar = this.H1;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f381220b.B();
    }
}
