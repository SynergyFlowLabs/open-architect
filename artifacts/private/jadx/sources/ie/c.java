package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f287121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f287122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f287123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f287124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f287125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f287126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f287127h;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull TextView textView) {
        this.f287120a = constraintLayout;
        this.f287121b = imageView;
        this.f287122c = imageView2;
        this.f287123d = imageView3;
        this.f287124e = imageView4;
        this.f287125f = imageView5;
        this.f287126g = imageView6;
        this.f287127h = textView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = he.b.j.W4;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = he.b.j.fq;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = he.b.j.gq;
                ImageView imageView3 = (ImageView) b4.c.a(view, i10);
                if (imageView3 != null) {
                    i10 = he.b.j.hq;
                    ImageView imageView4 = (ImageView) b4.c.a(view, i10);
                    if (imageView4 != null) {
                        i10 = he.b.j.iq;
                        ImageView imageView5 = (ImageView) b4.c.a(view, i10);
                        if (imageView5 != null) {
                            i10 = he.b.j.jq;
                            ImageView imageView6 = (ImageView) b4.c.a(view, i10);
                            if (imageView6 != null) {
                                i10 = he.b.j.rw;
                                TextView textView = (TextView) b4.c.a(view, i10);
                                if (textView != null) {
                                    return new c((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView);
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
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.Z0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287120a;
    }
}
