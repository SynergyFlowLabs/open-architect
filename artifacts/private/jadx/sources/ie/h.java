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
public final class h implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f287151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f287152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final p f287153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f287154e;

    private h(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull p pVar, @NonNull TextView textView2) {
        this.f287150a = constraintLayout;
        this.f287151b = imageView;
        this.f287152c = textView;
        this.f287153d = pVar;
        this.f287154e = textView2;
    }

    @NonNull
    public static h a(@NonNull View view) {
        View viewA;
        int i10 = he.b.j.W4;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = he.b.j.f283221pa;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null && (viewA = b4.c.a(view, (i10 = he.b.j.Ur))) != null) {
                p pVarA = p.a(viewA);
                i10 = he.b.j.rw;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    return new h((ConstraintLayout) view, imageView, textView, pVarA, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static h c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.f283602f1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287150a;
    }
}
