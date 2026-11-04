package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.CompareImagesView;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f322848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f322849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f322850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f322851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f322852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CompareImagesView f322853f;

    private a(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull CompareImagesView compareImagesView) {
        this.f322848a = scrollView;
        this.f322849b = textView;
        this.f322850c = constraintLayout;
        this.f322851d = textView2;
        this.f322852e = textView3;
        this.f322853f = compareImagesView;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = lb.b.j.f320278yc;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = lb.b.j.f320302zc;
            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
            if (constraintLayout != null) {
                i10 = lb.b.j.Ac;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = lb.b.j.Bc;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = lb.b.j.f319823fe;
                        CompareImagesView compareImagesView = (CompareImagesView) b4.c.a(view, i10);
                        if (compareImagesView != null) {
                            return new a((ScrollView) view, textView, constraintLayout, textView2, textView3, compareImagesView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(lb.b.m.T, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f322848a;
    }
}
