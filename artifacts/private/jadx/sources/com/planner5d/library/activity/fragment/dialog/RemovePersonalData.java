package com.planner5d.library.activity.fragment.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.planner5d.library.activity.helper.j2;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.manager.b2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class RemovePersonalData extends ContentDialog<Boolean> {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.t f131643o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.m0 f131644p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @ij.a
    protected b2 f131645q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @ij.a
    protected m2 f131646r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @ij.a
    protected j2 f131647s3;

    public RemovePersonalData() {
        com.planner5d.library.application.b.r().M1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        sendResultOnce(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(View view) {
        try {
            dismiss();
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NotNull ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(com.planner5d.library.f.m.X0, viewGroup, false);
        androidx.fragment.app.s activity = getActivity();
        com.planner5d.library.widget.preloader.t tVarH = H();
        b2 b2Var = this.f131645q3;
        com.planner5d.library.modules.user.user.t tVar = this.f131643o3;
        new com.planner5d.library.activity.form.g(activity, viewInflate, tVarH, b2Var, tVar, tVar.a(), (Button) viewGroup.findViewById(com.planner5d.library.f.j.C5), (Button) viewGroup.findViewById(com.planner5d.library.f.j.f168177k5), (TextView) viewGroup.findViewById(com.planner5d.library.f.j.tv), new Runnable() { // from class: com.planner5d.library.activity.fragment.dialog.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f132078a.U();
            }
        }, this.f131644p3, this.f131646r3, this.f131647s3);
        viewGroup.findViewById(com.planner5d.library.f.j.f168105h5).setVisibility(0);
        viewGroup.findViewById(com.planner5d.library.f.j.f168105h5).setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132108a.V(view);
            }
        });
        return viewInflate;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.C0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog
    public void onActivityCreatedWithSetup(Bundle bundle) {
        super.onActivityCreatedWithSetup(bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        sendResultOnce(Boolean.FALSE);
        super.onDismiss(dialogInterface);
    }
}
