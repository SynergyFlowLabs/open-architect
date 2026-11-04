package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.planner5d.library.uploadplan.view.widget.RulerImageView;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f287190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f287191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f287192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f287193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f287194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Guideline f287195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f287196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RulerImageView f287197i;

    private n(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull RulerImageView rulerImageView) {
        this.f287189a = constraintLayout;
        this.f287190b = imageView;
        this.f287191c = imageView2;
        this.f287192d = imageView3;
        this.f287193e = imageView4;
        this.f287194f = textView;
        this.f287195g = guideline;
        this.f287196h = textView2;
        this.f287197i = rulerImageView;
    }

    @NonNull
    public static n a(@NonNull View view) {
        int i10 = he.b.j.U4;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = he.b.j.W4;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = he.b.j.Z4;
                ImageView imageView3 = (ImageView) b4.c.a(view, i10);
                if (imageView3 != null) {
                    i10 = he.b.j.f282878b5;
                    ImageView imageView4 = (ImageView) b4.c.a(view, i10);
                    if (imageView4 != null) {
                        i10 = he.b.j.f283221pa;
                        TextView textView = (TextView) b4.c.a(view, i10);
                        if (textView != null) {
                            i10 = he.b.j.f283465zd;
                            Guideline guideline = (Guideline) b4.c.a(view, i10);
                            if (guideline != null) {
                                i10 = he.b.j.Od;
                                TextView textView2 = (TextView) b4.c.a(view, i10);
                                if (textView2 != null) {
                                    i10 = he.b.j.f282961ee;
                                    RulerImageView rulerImageView = (RulerImageView) b4.c.a(view, i10);
                                    if (rulerImageView != null) {
                                        return new n((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, textView, guideline, textView2, rulerImageView);
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
    public static n c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static n d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.f283582d3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287189a;
    }
}
