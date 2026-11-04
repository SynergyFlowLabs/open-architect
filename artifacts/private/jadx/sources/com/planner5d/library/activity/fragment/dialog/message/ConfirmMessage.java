package com.planner5d.library.activity.fragment.dialog.message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.j0;
import androidx.annotation.q;
import androidx.annotation.v;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;

/* JADX INFO: loaded from: classes6.dex */
public class ConfirmMessage extends ContentDialog<Boolean> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(View view) {
        sendResultOnce(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(View view) {
        sendResultOnce(Boolean.FALSE);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NonNull ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(U(), viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        int i10 = 6 | (-2);
        layoutParams.height = -2;
        viewInflate.setLayoutParams(layoutParams);
        d0(viewGroup);
        ((TextView) viewInflate.findViewById(com.planner5d.library.f.j.yu)).setText(W(viewGroup));
        return viewInflate;
    }

    @j0
    protected int U() {
        return com.planner5d.library.f.m.K0;
    }

    @v
    protected int V() {
        return 0;
    }

    protected CharSequence W(ViewGroup viewGroup) {
        return (CharSequence) A();
    }

    @f1
    protected int X() {
        return com.planner5d.library.f.s.is;
    }

    @f1
    protected int Y() {
        return com.planner5d.library.f.s.XH;
    }

    protected CharSequence Z() {
        return null;
    }

    @q
    protected int a0() {
        return 0;
    }

    protected void d0(ViewGroup viewGroup) {
        TextView textView = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.tv);
        if (Z() == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(Z());
            if (a0() != 0) {
                textView.setPaddingRelative(getResources().getDimensionPixelSize(a0()), textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
            }
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(com.planner5d.library.f.j.f168254na);
        if (imageView != null) {
            if (V() == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(V());
            }
        }
        TextView textView2 = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.C5);
        TextView textView3 = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.f168177k5);
        textView2.setText(Y());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132150a.b0(view);
            }
        });
        textView3.setText(X());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132151a.c0(view);
            }
        });
    }
}
