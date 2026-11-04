package com.planner5d.library.dgenerator.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.f;
import kotlin.jvm.internal.Intrinsics;
import mb.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class RestartGenerationDialog extends ContentDialog<Boolean> implements n0 {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private b f160100o3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(RestartGenerationDialog restartGenerationDialog, View view) {
        restartGenerationDialog.sendResultOnce(Boolean.TRUE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        b bVarD = b.d(LayoutInflater.from(root.getContext()), root, false);
        this.f160100o3 = bVarD;
        bVarD.f322855b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RestartGenerationDialog.T(this.f160101a, view);
            }
        });
        ConstraintLayout root2 = bVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return f.m.A0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, f.t.f169922n7);
    }
}
