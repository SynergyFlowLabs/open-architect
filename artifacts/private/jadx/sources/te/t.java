package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.planner5d.library.widget.RoundedCornersLayout;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.PreloaderBoxView;

/* JADX INFO: loaded from: classes12.dex */
public final class t implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedCornersLayout f380994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f380995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f380996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f380997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f380998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxView f380999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f381000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final AppCompatSeekBar f381001i;

    private t(@NonNull View view, @NonNull RoundedCornersLayout roundedCornersLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull View view2, @NonNull PreloaderBoxView preloaderBoxView, @NonNull TextView textView2, @NonNull AppCompatSeekBar appCompatSeekBar) {
        this.f380993a = view;
        this.f380994b = roundedCornersLayout;
        this.f380995c = imageView;
        this.f380996d = imageView2;
        this.f380997e = textView;
        this.f380998f = view2;
        this.f380999g = preloaderBoxView;
        this.f381000h = textView2;
        this.f381001i = appCompatSeekBar;
    }

    @NonNull
    public static t a(@NonNull View view) {
        View viewA;
        int i10 = c1.i.f251790c4;
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) b4.c.a(view, i10);
        if (roundedCornersLayout != null) {
            i10 = c1.i.f251802d4;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = c1.i.f251814e4;
                ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                if (imageView2 != null) {
                    i10 = c1.i.f251991t4;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null && (viewA = b4.c.a(view, (i10 = c1.i.f252035x4))) != null) {
                        i10 = c1.i.E6;
                        PreloaderBoxView preloaderBoxView = (PreloaderBoxView) b4.c.a(view, i10);
                        if (preloaderBoxView != null) {
                            i10 = c1.i.f251961q7;
                            TextView textView2 = (TextView) b4.c.a(view, i10);
                            if (textView2 != null) {
                                i10 = c1.i.Q7;
                                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) b4.c.a(view, i10);
                                if (appCompatSeekBar != null) {
                                    return new t(view, roundedCornersLayout, imageView, imageView2, textView, viewA, preloaderBoxView, textView2, appCompatSeekBar);
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
    public static t b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252174k2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380993a;
    }
}
