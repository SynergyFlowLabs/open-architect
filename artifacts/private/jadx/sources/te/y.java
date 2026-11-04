package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.PreloaderBarView;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f381013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f381014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ProgressBar f381015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PreloaderBarView f381016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f381017e;

    private y(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull PreloaderBarView preloaderBarView, @NonNull TextView textView) {
        this.f381013a = frameLayout;
        this.f381014b = linearLayout;
        this.f381015c = progressBar;
        this.f381016d = preloaderBarView;
        this.f381017e = textView;
    }

    @NonNull
    public static y a(@NonNull View view) {
        int i10 = c1.i.I6;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = c1.i.J6;
            ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
            if (progressBar != null) {
                i10 = c1.i.K6;
                PreloaderBarView preloaderBarView = (PreloaderBarView) b4.c.a(view, i10);
                if (preloaderBarView != null) {
                    i10 = c1.i.Y6;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        return new y((FrameLayout) view, linearLayout, progressBar, preloaderBarView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static y c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static y d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.f252198q2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f381013a;
    }
}
