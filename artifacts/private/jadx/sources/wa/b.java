package wa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f385954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f385955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ShapeableImageView f385956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f385957d;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView) {
        this.f385954a = constraintLayout;
        this.f385955b = constraintLayout2;
        this.f385956c = shapeableImageView;
        this.f385957d = textView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = sa.b.i.N2;
        ShapeableImageView shapeableImageView = (ShapeableImageView) b4.c.a(view, i10);
        if (shapeableImageView != null) {
            i10 = sa.b.i.O2;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new b(constraintLayout, constraintLayout, shapeableImageView, textView);
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
        View viewInflate = layoutInflater.inflate(sa.b.l.f369582h2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f385954a;
    }
}
