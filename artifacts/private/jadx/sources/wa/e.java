package wa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import com.planner5d.library.widget.preloader.shimmer.ShimmerTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f385977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f385978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f385979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialButton f385980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ChipGroup f385981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f385982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f385983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ShimmerTextView f385984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f385985i;

    private e(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull MaterialButton materialButton, @NonNull ChipGroup chipGroup, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ShimmerTextView shimmerTextView, @NonNull TextView textView) {
        this.f385977a = constraintLayout;
        this.f385978b = imageView;
        this.f385979c = imageView2;
        this.f385980d = materialButton;
        this.f385981e = chipGroup;
        this.f385982f = linearLayout;
        this.f385983g = constraintLayout2;
        this.f385984h = shimmerTextView;
        this.f385985i = textView;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = sa.b.i.S1;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = sa.b.i.T1;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = sa.b.i.f369421v2;
                MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
                if (materialButton != null) {
                    i10 = sa.b.i.f369195e3;
                    ChipGroup chipGroup = (ChipGroup) b4.c.a(view, i10);
                    if (chipGroup != null) {
                        i10 = sa.b.i.T5;
                        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                        if (linearLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i10 = sa.b.i.H8;
                            ShimmerTextView shimmerTextView = (ShimmerTextView) b4.c.a(view, i10);
                            if (shimmerTextView != null) {
                                i10 = sa.b.i.Na;
                                TextView textView = (TextView) b4.c.a(view, i10);
                                if (textView != null) {
                                    return new e(constraintLayout, imageView, imageView2, materialButton, chipGroup, linearLayout, constraintLayout, shimmerTextView, textView);
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
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(sa.b.l.f369630t2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f385977a;
    }
}
