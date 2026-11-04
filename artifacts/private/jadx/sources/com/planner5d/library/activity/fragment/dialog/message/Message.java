package com.planner5d.library.activity.fragment.dialog.message;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.j0;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.u;

/* JADX INFO: loaded from: classes6.dex */
public class Message extends ContentDialog<Boolean> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(View view) {
        dismiss();
    }

    public static void show(com.planner5d.library.activity.fragment.dialog.k kVar, String str, u<Boolean> uVar) {
        kVar.c(Message.class).m(uVar).k(com.planner5d.library.services.textspan.b.d(str)).g();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NonNull ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(T(), viewGroup, false);
        CharSequence charSequenceU = U(viewGroup);
        if (charSequenceU == null) {
            dismiss();
            return viewInflate;
        }
        viewGroup.findViewById(com.planner5d.library.f.j.tv).setVisibility(8);
        TextView textView = (TextView) viewInflate.findViewById(com.planner5d.library.f.j.yu);
        textView.setText(charSequenceU);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = viewGroup.getContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.Dh);
        textView.setLayoutParams(marginLayoutParams);
        W(viewGroup);
        return viewInflate;
    }

    @j0
    protected int T() {
        return com.planner5d.library.f.m.K0;
    }

    protected CharSequence U(ViewGroup viewGroup) {
        Object objA = A();
        if (objA instanceof CharSequence) {
            return (CharSequence) objA;
        }
        return null;
    }

    protected void W(ViewGroup viewGroup) {
        viewGroup.findViewById(com.planner5d.library.f.j.f168177k5).setVisibility(8);
        TextView textView = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.C5);
        textView.setText(R.string.ok);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132152a.V(view);
            }
        });
    }
}
