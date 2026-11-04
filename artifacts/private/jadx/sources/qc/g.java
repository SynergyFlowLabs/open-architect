package qc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f350339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f350340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f350341c;

    private g(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView) {
        this.f350339a = constraintLayout;
        this.f350340b = imageView;
        this.f350341c = appCompatTextView;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i10 = pc.b.i.f343315o5;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = pc.b.i.f343442wc;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b4.c.a(view, i10);
            if (appCompatTextView != null) {
                return new g((ConstraintLayout) view, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(pc.b.l.f343608j3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f350339a;
    }
}
