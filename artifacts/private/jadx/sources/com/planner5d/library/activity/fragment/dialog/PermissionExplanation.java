package com.planner5d.library.activity.fragment.dialog;

import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class PermissionExplanation extends ContentDialog<Boolean> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(View view) {
        sendResultOnce(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(View view) {
        sendResultOnce(Boolean.TRUE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NotNull ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(com.planner5d.library.f.m.R0, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments == null) {
            sendResultOnce(Boolean.FALSE);
            return viewInflate;
        }
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(arguments);
        TextView textView = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.C5);
        TextView textView2 = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.f168177k5);
        ((TextView) viewInflate.findViewById(com.planner5d.library.f.j.yu)).setText(com.planner5d.library.services.textspan.b.d(getString(jVar.c(com.planner5d.library.services.r.explanation, 0), getString(com.planner5d.library.f.s.L1))));
        viewGroup.findViewById(com.planner5d.library.f.j.tv).setVisibility(8);
        if (jVar.f(com.planner5d.library.services.r.required, false)) {
            setCancelable(false);
            textView2.setVisibility(8);
        } else {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133084a.U(view);
                }
            });
        }
        textView.setText(R.string.ok);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133108a.V(view);
            }
        });
        return viewInflate;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        if (isCancelable()) {
            return super.onBackPressed();
        }
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            dismiss();
            activity.finish();
        }
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        sendResultOnce(Boolean.FALSE);
    }
}
