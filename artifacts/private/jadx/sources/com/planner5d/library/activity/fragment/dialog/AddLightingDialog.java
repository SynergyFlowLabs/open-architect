package com.planner5d.library.activity.fragment.dialog;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAddLightingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddLightingDialog.kt\ncom/planner5d/library/activity/fragment/dialog/AddLightingDialog\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,67:1\n28#2:68\n*S KotlinDebug\n*F\n+ 1 AddLightingDialog.kt\ncom/planner5d/library/activity/fragment/dialog/AddLightingDialog\n*L\n46#1:68\n*E\n"})
public final class AddLightingDialog extends androidx.fragment.app.m {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private a f131597p1;

    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(AddLightingDialog addLightingDialog, View view) {
        a aVar = addLightingDialog.f131597p1;
        if (aVar != null) {
            aVar.b();
        }
        addLightingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(AddLightingDialog addLightingDialog, View view) {
        a aVar = addLightingDialog.f131597p1;
        if (aVar != null) {
            aVar.a();
        }
        addLightingDialog.dismiss();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.Fg);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public android.app.Dialog onCreateDialog(@Nullable Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        com.planner5d.library.databinding.a aVarD = com.planner5d.library.databinding.a.d(inflater, viewGroup, false);
        aVarD.f158664b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddLightingDialog.C(this.f131653a, view);
            }
        });
        aVarD.f158665c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddLightingDialog.D(this.f132041a, view);
            }
        });
        ConstraintLayout root = aVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.Ah);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        view.setLayoutParams(layoutParams);
    }

    public final void setCallback(@NotNull a callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.f131597p1 = callbacks;
    }
}
