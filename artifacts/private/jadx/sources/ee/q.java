package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f274860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f274861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f274862d;

    private q(@NonNull ConstraintLayout rootView, @NonNull ImageView icon, @NonNull TextView mainText, @NonNull TextView secondaryText) {
        this.f274859a = rootView;
        this.f274860b = icon;
        this.f274861c = mainText;
        this.f274862d = secondaryText;
    }

    @NonNull
    public static q a(@NonNull View rootView) {
        int i10 = de.b.i.F4;
        ImageView imageView = (ImageView) b4.c.a(rootView, i10);
        if (imageView != null) {
            i10 = de.b.i.f272380v5;
            TextView textView = (TextView) b4.c.a(rootView, i10);
            if (textView != null) {
                i10 = de.b.i.f272110b9;
                TextView textView2 = (TextView) b4.c.a(rootView, i10);
                if (textView2 != null) {
                    return new q((ConstraintLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static q c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static q d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272603v2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274859a;
    }
}
