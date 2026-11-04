package com.planner5d.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.textview.TextViewWithLine;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f159166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f159168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f159169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f159170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f159171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextViewWithLine f159172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f159173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f159174i;

    private j1(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull TextViewWithLine textViewWithLine, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f159166a = constraintLayout;
        this.f159167b = constraintLayout2;
        this.f159168c = textView;
        this.f159169d = imageView;
        this.f159170e = constraintLayout3;
        this.f159171f = textView2;
        this.f159172g = textViewWithLine;
        this.f159173h = textView3;
        this.f159174i = textView4;
    }

    @NonNull
    public static j1 a(@NonNull View view) {
        int i10 = com.planner5d.library.f.j.f167951am;
        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
        if (constraintLayout != null) {
            i10 = com.planner5d.library.f.j.f167976bm;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.f.j.f168001cm;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                    i10 = com.planner5d.library.f.j.f168050em;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.f.j.f168074fm;
                        TextViewWithLine textViewWithLine = (TextViewWithLine) b4.c.a(view, i10);
                        if (textViewWithLine != null) {
                            i10 = com.planner5d.library.f.j.f168098gm;
                            TextView textView3 = (TextView) b4.c.a(view, i10);
                            if (textView3 != null) {
                                i10 = com.planner5d.library.f.j.f168122hm;
                                TextView textView4 = (TextView) b4.c.a(view, i10);
                                if (textView4 != null) {
                                    return new j1(constraintLayout2, constraintLayout, textView, imageView, constraintLayout2, textView2, textViewWithLine, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static j1 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static j1 d(@NonNull LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.f.m.f168662d2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f159166a;
    }
}
