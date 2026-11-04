package com.planner5d.library.uploadplan.view.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.widget.VideoView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class ScalingHelpDialog extends ContentDialog<Boolean> implements n0 {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private VideoView f230926o3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(ScalingHelpDialog scalingHelpDialog, View view) {
        scalingHelpDialog.sendResultOnce(Boolean.FALSE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        ie.h hVarD = ie.h.d(LayoutInflater.from(root.getContext()), root, false);
        VideoView videoView = hVarD.f287153d.f287204b;
        this.f230926o3 = videoView;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
            videoView = null;
        }
        videoView.setDataSource(he.b.r.f283894w);
        hVarD.f287151b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScalingHelpDialog.T(this.f230942a, view);
            }
        });
        ConstraintLayout root2 = hVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return he.b.m.A0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, he.b.t.Fg);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        VideoView videoView = this.f230926o3;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
            videoView = null;
        }
        videoView.l();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        VideoView videoView = this.f230926o3;
        if (videoView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoView");
            videoView = null;
        }
        videoView.h();
    }
}
