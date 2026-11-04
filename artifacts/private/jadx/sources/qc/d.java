package qc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.RoundedCornersLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f350316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f350317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f350318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f350319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f350320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f350321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Guideline f350322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f350323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RecyclerView f350324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f350325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final View f350326k;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull View view) {
        this.f350316a = constraintLayout;
        this.f350317b = imageView;
        this.f350318c = constraintLayout2;
        this.f350319d = roundedCornersLayout;
        this.f350320e = textView;
        this.f350321f = appCompatTextView;
        this.f350322g = guideline;
        this.f350323h = guideline2;
        this.f350324i = recyclerView;
        this.f350325j = textView2;
        this.f350326k = view;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        int i10 = pc.b.i.S1;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = pc.b.i.U1;
            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
            if (constraintLayout != null) {
                i10 = pc.b.i.V1;
                RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
                if (roundedCornersLayout != null) {
                    i10 = pc.b.i.X1;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = pc.b.i.Y1;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) b4.c.a(view, i10);
                        if (appCompatTextView != null) {
                            i10 = pc.b.i.U4;
                            Guideline guideline = (Guideline) b4.c.a(view, i10);
                            if (guideline != null) {
                                i10 = pc.b.i.V4;
                                Guideline guideline2 = (Guideline) b4.c.a(view, i10);
                                if (guideline2 != null) {
                                    i10 = pc.b.i.O9;
                                    RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                                    if (recyclerView != null) {
                                        i10 = pc.b.i.f343442wc;
                                        TextView textView2 = (TextView) b4.c.a(view, i10);
                                        if (textView2 != null && (viewA = b4.c.a(view, (i10 = pc.b.i.f343443wd))) != null) {
                                            return new d((ConstraintLayout) view, imageView, constraintLayout, roundedCornersLayout, textView, appCompatTextView, guideline, guideline2, recyclerView, textView2, viewA);
                                        }
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
    public static d c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(pc.b.l.f343625n0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f350316a;
    }
}
