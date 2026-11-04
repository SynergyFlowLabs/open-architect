package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.preloader.PreloaderShimmerV2View;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f269871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f269872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f269873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f269875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f269876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f269877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f269878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f269879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f269880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final PreloaderShimmerV2View f269881k;

    private q(@NonNull FrameLayout frameLayout, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view, @NonNull PreloaderShimmerV2View preloaderShimmerV2View) {
        this.f269871a = frameLayout;
        this.f269872b = roundedCornersLayout;
        this.f269873c = textView;
        this.f269874d = textView2;
        this.f269875e = imageView;
        this.f269876f = textView3;
        this.f269877g = textView4;
        this.f269878h = textView5;
        this.f269879i = textView6;
        this.f269880j = view;
        this.f269881k = preloaderShimmerV2View;
    }

    @NonNull
    public static q a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.contest.e.i.I2;
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
        if (roundedCornersLayout != null) {
            i10 = com.planner5d.library.contest.e.i.f150792c3;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = com.planner5d.library.contest.e.i.f150822e3;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.contest.e.i.f150897j3;
                    ImageView imageView = (ImageView) b4.c.a(view, i10);
                    if (imageView != null) {
                        i10 = com.planner5d.library.contest.e.i.f151032s3;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            i10 = com.planner5d.library.contest.e.i.G3;
                            TextView textView4 = (TextView) b4.c.a(view, i10);
                            if (textView4 != null) {
                                i10 = com.planner5d.library.contest.e.i.H3;
                                TextView textView5 = (TextView) b4.c.a(view, i10);
                                if (textView5 != null) {
                                    i10 = com.planner5d.library.contest.e.i.R3;
                                    TextView textView6 = (TextView) b4.c.a(view, i10);
                                    if (textView6 != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.contest.e.i.f151079v5))) != null) {
                                        i10 = com.planner5d.library.contest.e.i.f151038s9;
                                        PreloaderShimmerV2View preloaderShimmerV2View = (PreloaderShimmerV2View) b4.c.a(view, i10);
                                        if (preloaderShimmerV2View != null) {
                                            return new q((FrameLayout) view, roundedCornersLayout, textView, textView2, imageView, textView3, textView4, textView5, textView6, viewA, preloaderShimmerV2View);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static q c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static q d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.A2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f269871a;
    }
}
