package com.planner5d.library.activity.fragment.dialog.message;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.s;
import com.planner5d.library.model.manager.n1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class UserMessage extends Message {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @ij.a
    protected n1 f132149o3;

    UserMessage() {
        com.planner5d.library.application.b.r().v0(this);
    }

    private id.b Y() {
        Object objA = A();
        if (objA instanceof id.b) {
            return (id.b) objA;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(Uri uri, View view) {
        startActivity(new Intent("android.intent.action.VIEW", uri));
        dismiss();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.Message
    protected CharSequence U(ViewGroup viewGroup) {
        id.b bVarY = Y();
        if (bVarY == null) {
            return null;
        }
        return bVarY.a(getActivity(), this.f132149o3);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.Message
    protected void W(ViewGroup viewGroup) {
        id.b bVarY = Y();
        TextView textView = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.C5);
        TextView textView2 = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.f168177k5);
        final Uri uriC = bVarY.c(getContext());
        if (bVarY.e()) {
            textView2.setVisibility(8);
        }
        if (!bVarY.d()) {
            setCancelable(false);
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
            }
        }
        if (uriC != null) {
            textView.setText(R.string.ok);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132170a.Z(uriC, view);
                }
            });
        } else if (isCancelable()) {
            textView2.setText(com.planner5d.library.f.s.Z2);
            textView.setVisibility(8);
        } else {
            textView.setText(R.string.ok);
            textView.setEnabled(false);
            textView.setTextColor(androidx.core.content.d.g(viewGroup.getContext(), com.planner5d.library.f.C1549f.O1));
        }
    }

    @Override // androidx.fragment.app.m
    public void dismiss() {
        if (isCancelable()) {
            super.dismiss();
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        if (isCancelable()) {
            return super.onBackPressed();
        }
        s activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        super.dismiss();
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        if (isCancelable()) {
            super.onDismiss(dialogInterface);
        }
    }
}
