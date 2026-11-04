package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f274832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f274833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f274834d;

    private k(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout card, @NonNull ImageView image, @NonNull AppCompatTextView title) {
        this.f274831a = rootView;
        this.f274832b = card;
        this.f274833c = image;
        this.f274834d = title;
    }

    @NonNull
    public static k a(@NonNull View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i10 = de.b.i.M4;
        ImageView imageView = (ImageView) b4.c.a(rootView, i10);
        if (imageView != null) {
            i10 = de.b.i.Xa;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b4.c.a(rootView, i10);
            if (appCompatTextView != null) {
                return new k(constraintLayout, constraintLayout, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272563l2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274831a;
    }
}
