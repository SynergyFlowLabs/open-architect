package rd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f366628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f366629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f366630c;

    private k(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView) {
        this.f366628a = constraintLayout;
        this.f366629b = view;
        this.f366630c = imageView;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = qd.b.i.Y0;
        View viewA = b4.c.a(view, i10);
        if (viewA != null) {
            i10 = qd.b.i.f352378e1;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                return new k((ConstraintLayout) view, viewA, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(qd.b.l.f352670k1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f366628a;
    }
}
