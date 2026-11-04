package nd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f332767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f332768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f332769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f332770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f332771e;

    private e(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f332767a = constraintLayout;
        this.f332768b = textView;
        this.f332769c = imageView;
        this.f332770d = textView2;
        this.f332771e = textView3;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = md.b.j.f325352ba;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = md.b.j.Ed;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = md.b.j.Mv;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = md.b.j.Xw;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        return new e((ConstraintLayout) view, textView, imageView, textView2, textView3);
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
        View viewInflate = layoutInflater.inflate(md.b.m.f326209r7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f332767a;
    }
}
