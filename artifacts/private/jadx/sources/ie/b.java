package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.AnimatedVectorImageView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f287116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f287117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AnimatedVectorImageView f287118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f287119e;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView, @NonNull AnimatedVectorImageView animatedVectorImageView, @NonNull TextView textView2) {
        this.f287115a = constraintLayout;
        this.f287116b = buttonTextView;
        this.f287117c = textView;
        this.f287118d = animatedVectorImageView;
        this.f287119e = textView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = he.b.j.f283000g5;
        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
        if (buttonTextView != null) {
            i10 = he.b.j.f283221pa;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = he.b.j.Vd;
                AnimatedVectorImageView animatedVectorImageView = (AnimatedVectorImageView) b4.c.a(view, i10);
                if (animatedVectorImageView != null) {
                    i10 = he.b.j.rw;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        return new b((ConstraintLayout) view, buttonTextView, textView, animatedVectorImageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.Y0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287115a;
    }
}
