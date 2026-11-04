package wa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f385986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f385987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f385988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f385989d;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.f385986a = constraintLayout;
        this.f385987b = imageView;
        this.f385988c = constraintLayout2;
        this.f385989d = textView;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = sa.b.i.f369253i5;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = sa.b.i.Na;
            TextView textView = (TextView) b4.c.a(view, i11);
            if (textView != null) {
                return new f(constraintLayout, imageView, constraintLayout, textView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(sa.b.l.f369634u2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f385986a;
    }
}
