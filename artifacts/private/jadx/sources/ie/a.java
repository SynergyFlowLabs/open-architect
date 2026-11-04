package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f287107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f287108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f287109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f287110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f287111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f287112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ProgressBar f287113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f287114i;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull ButtonTextView buttonTextView, @NonNull ButtonTextView buttonTextView2, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull TextView textView2) {
        this.f287106a = constraintLayout;
        this.f287107b = view;
        this.f287108c = imageView;
        this.f287109d = buttonTextView;
        this.f287110e = buttonTextView2;
        this.f287111f = textView;
        this.f287112g = imageView2;
        this.f287113h = progressBar;
        this.f287114i = textView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = he.b.j.f283215p4;
        View viewA = b4.c.a(view, i10);
        if (viewA != null) {
            i10 = he.b.j.W4;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = he.b.j.f283120l5;
                ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                if (buttonTextView != null) {
                    i10 = he.b.j.f283289s5;
                    ButtonTextView buttonTextView2 = (ButtonTextView) b4.c.a(view, i10);
                    if (buttonTextView2 != null) {
                        i10 = he.b.j.f283221pa;
                        TextView textView = (TextView) b4.c.a(view, i10);
                        if (textView != null) {
                            i10 = he.b.j.Vd;
                            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                            if (imageView2 != null) {
                                i10 = he.b.j.sn;
                                ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                                if (progressBar != null) {
                                    i10 = he.b.j.rw;
                                    TextView textView2 = (TextView) b4.c.a(view, i10);
                                    if (textView2 != null) {
                                        return new a((ConstraintLayout) view, viewA, imageView, buttonTextView, buttonTextView2, textView, imageView2, progressBar, textView2);
                                    }
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
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.X0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287106a;
    }
}
