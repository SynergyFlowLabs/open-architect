package com.planner5d.library.activity.fragment.dialog.catalog_unlock;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.databinding.u;
import com.planner5d.library.f;
import com.planner5d.library.widget.q;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class CatalogUnlockDialog extends ContentDialog<Boolean> implements q {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final a0 f132048o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final s0 f132049p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @Nullable
    private p2 f132050q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private u f132051r3;

    public CatalogUnlockDialog() {
        a0 a0VarC = q3.c(null, 1, null);
        this.f132048o3 = a0VarC;
        this.f132049p3 = t0.a(l1.e().plus(a0VarC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(CatalogUnlockDialog catalogUnlockDialog, View view) {
        catalogUnlockDialog.sendResultOnce(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(CatalogUnlockDialog catalogUnlockDialog) {
        u uVar = catalogUnlockDialog.f132051r3;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar = null;
        }
        uVar.f159725c.setEnabled(false);
        catalogUnlockDialog.sendResultOnce(Boolean.FALSE);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        u uVarC = u.c(LayoutInflater.from(getContext()));
        this.f132051r3 = uVarC;
        u uVar = null;
        if (uVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVarC = null;
        }
        uVarC.f159725c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.catalog_unlock.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogUnlockDialog.U(this.f132052a, view);
            }
        });
        u uVar2 = this.f132051r3;
        if (uVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar2 = null;
        }
        L(uVar2.f159724b);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        startCountdown(300, new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.catalog_unlock.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatalogUnlockDialog.V(this.f132053a);
            }
        });
        u uVar3 = this.f132051r3;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            uVar = uVar3;
        }
        ConstraintLayout root2 = uVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return f.m.B0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void sendResultOnce(@Nullable Boolean bool) {
        cancelCountdown();
        super.sendResultOnce(bool);
    }

    @Override // com.planner5d.library.widget.q
    public void cancelCountdown() {
        p2 p2Var = this.f132050q3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f132050q3 = null;
    }

    @Override // com.planner5d.library.widget.q
    @NotNull
    public p2 createCountDownJob(int i10, @NotNull Function0<Unit> function0) {
        return q.a.a(this, i10, function0);
    }

    @Override // com.planner5d.library.widget.q
    public void destroy() {
        q.a.b(this);
    }

    @Override // com.planner5d.library.widget.q
    public int doEverySecond(int i10) {
        u uVar = this.f132051r3;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar = null;
        }
        TextView textView = uVar.f159725c;
        String string = getResources().getString(f.s.uG);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i10 / 60), Integer.valueOf(i10 % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        return i10;
    }

    @Override // com.planner5d.library.widget.q
    @NotNull
    public s0 getScope() {
        return this.f132049p3;
    }

    @Override // com.planner5d.library.widget.q
    @NotNull
    public a0 getScopeJob() {
        return this.f132048o3;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        destroy();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        sendResultOnce(Boolean.FALSE);
        super.onDismiss(dialog);
    }

    @Override // com.planner5d.library.widget.q
    public void startCountdown(int i10, @NotNull Function0<Unit> onTimeRanOut) {
        Intrinsics.checkNotNullParameter(onTimeRanOut, "onTimeRanOut");
        this.f132050q3 = createCountDownJob(i10, onTimeRanOut);
    }
}
