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
public final class o implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f274854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f274855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f274856d;

    private o(@NonNull ConstraintLayout rootView, @NonNull ImageView image, @NonNull AppCompatTextView subtitle, @NonNull AppCompatTextView title) {
        this.f274853a = rootView;
        this.f274854b = image;
        this.f274855c = subtitle;
        this.f274856d = title;
    }

    @NonNull
    public static o a(@NonNull View rootView) {
        int i10 = de.b.i.M4;
        ImageView imageView = (ImageView) b4.c.a(rootView, i10);
        if (imageView != null) {
            i10 = de.b.i.f272167fa;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b4.c.a(rootView, i10);
            if (appCompatTextView != null) {
                i10 = de.b.i.Xa;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b4.c.a(rootView, i10);
                if (appCompatTextView2 != null) {
                    return new o((ConstraintLayout) rootView, imageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static o d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272579p2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274853a;
    }
}
