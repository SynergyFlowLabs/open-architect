package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f274844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatCheckBox f274845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f274846d;

    private m(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout card, @NonNull AppCompatCheckBox checkbox, @NonNull ImageView image) {
        this.f274843a = rootView;
        this.f274844b = card;
        this.f274845c = checkbox;
        this.f274846d = image;
    }

    @NonNull
    public static m a(@NonNull View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i10 = de.b.i.f272257m2;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) b4.c.a(rootView, i10);
        if (appCompatCheckBox != null) {
            i10 = de.b.i.M4;
            ImageView imageView = (ImageView) b4.c.a(rootView, i10);
            if (imageView != null) {
                return new m(constraintLayout, constraintLayout, appCompatCheckBox, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static m d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272571n2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274843a;
    }
}
