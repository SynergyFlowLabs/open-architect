package com.planner5d.library.activity.fragment.dialog;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.core.view.v3;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ContentDialog<T> extends Dialog<T> {

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private TextView f131598l3 = null;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private ImageView f131599m3 = null;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private final com.planner5d.library.widget.preloader.t f131600n3 = new com.planner5d.library.widget.preloader.t();

    public enum a {
        Cancel(com.planner5d.library.view.d.i.O1),
        Middle(com.planner5d.library.view.d.i.Q1),
        Save(com.planner5d.library.view.d.i.R1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.d0
        private final int f131605a;

        a(int i10) {
            this.f131605a = i10;
        }
    }

    private Button F(a aVar) {
        View view = getView();
        if (view == null) {
            return null;
        }
        return (Button) view.findViewById(aVar.f131605a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        try {
            dismiss();
        } catch (IllegalStateException unused) {
        }
    }

    protected abstract View E(@NonNull ViewGroup viewGroup, @p0 Bundle bundle);

    protected int G() {
        return com.planner5d.library.view.d.l.X;
    }

    protected com.planner5d.library.widget.preloader.t H() {
        return this.f131600n3;
    }

    protected void I() {
        this.f131600n3.b(getView()).b();
    }

    protected void K(a aVar, @f1 Integer num, View.OnClickListener onClickListener) {
        Button buttonF = F(aVar);
        if (buttonF != null) {
            if (num != null) {
                buttonF.setText(num.intValue());
            }
            buttonF.setOnClickListener(onClickListener);
            buttonF.setVisibility(0);
        }
    }

    protected void L(View view) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f132056a.J(view2);
                }
            });
        }
    }

    protected void M(a aVar, boolean z10) {
        Button buttonF = F(aVar);
        if (buttonF != null) {
            buttonF.setEnabled(z10);
        }
    }

    protected void N(@p0 Drawable drawable) {
        android.app.Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            if (drawable != null) {
                window.setBackgroundDrawable(drawable);
            }
            window.setLayout(-1, -1);
        }
    }

    protected boolean O(@p0 i iVar) {
        boolean z10 = getResources().getConfiguration().smallestScreenWidthDp < 480;
        if (z10) {
            N(new ColorDrawable(0));
        }
        android.app.Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (iVar != null && window != null) {
            i.c<Integer> cVarA = iVar.a();
            i.a aVarC = iVar.c();
            i.c<Integer> cVarA2 = aVarC.a();
            i.c<Boolean> cVarB = aVarC.b();
            i.a aVarB = iVar.b();
            i.c<Integer> cVarA3 = aVarB.a();
            i.c<Boolean> cVarB2 = aVarB.b();
            window.addFlags((z10 ? cVarA.b() : cVarA.a()).intValue());
            window.clearFlags((z10 ? cVarA.a() : cVarA.b()).intValue());
            window.setStatusBarColor((z10 ? cVarA2.b() : cVarA2.a()).intValue());
            window.setNavigationBarColor((z10 ? cVarA3.b() : cVarA3.a()).intValue());
            v3 v3Var = new v3(window, window.getDecorView());
            v3Var.i((z10 ? cVarB.b() : cVarB.a()).booleanValue());
            v3Var.h((z10 ? cVarB2.b() : cVarB2.a()).booleanValue());
        }
        return z10;
    }

    protected void P(@androidx.annotation.v Integer num, int i10) {
        ImageView imageView = this.f131599m3;
        if (imageView == null) {
            return;
        }
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        this.f131599m3.setVisibility(i10);
    }

    protected void Q(@f1 int i10, Integer num) {
        R(getString(i10), num);
    }

    protected void R(CharSequence charSequence, Integer num) {
        TextView textView = this.f131598l3;
        if (textView != null) {
            textView.setText(charSequence);
            this.f131598l3.setVisibility(0);
        }
        P(num, num == null ? 8 : 0);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected void onActivityCreatedWithSetup(@p0 Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            I();
            View viewE = E(viewGroup, bundle);
            if (viewE != null) {
                ((ViewGroup) viewGroup.findViewById(com.planner5d.library.view.d.i.C2)).addView(viewE);
            }
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.view.d.r.Ve);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m
    @NonNull
    public android.app.Dialog onCreateDialog(@p0 Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        com.planner5d.library.services.s.e(getActivity(), false);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        View viewInflate = layoutInflater.inflate(G(), viewGroup, false);
        this.f131598l3 = (TextView) viewInflate.findViewById(com.planner5d.library.view.d.i.f247077ga);
        this.f131599m3 = (ImageView) viewInflate.findViewById(com.planner5d.library.view.d.i.f247070g3);
        L(viewInflate.findViewById(com.planner5d.library.view.d.i.O1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
    }

    protected void setProgress(String str) {
        this.f131600n3.b(getView()).p(str, false);
    }
}
