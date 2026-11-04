package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.PreloaderBoxView;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f380890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f380891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f380892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f380893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ScrollView f380894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f380895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxView f380896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f380897h;

    private e(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull PreloaderBoxView preloaderBoxView, @NonNull TextView textView) {
        this.f380890a = frameLayout;
        this.f380891b = button;
        this.f380892c = button2;
        this.f380893d = button3;
        this.f380894e = scrollView;
        this.f380895f = linearLayout;
        this.f380896g = preloaderBoxView;
        this.f380897h = textView;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = c1.i.D1;
        Button button = (Button) b4.c.a(view, i10);
        if (button != null) {
            i10 = c1.i.E1;
            Button button2 = (Button) b4.c.a(view, i10);
            if (button2 != null) {
                i10 = c1.i.F1;
                Button button3 = (Button) b4.c.a(view, i10);
                if (button3 != null) {
                    i10 = c1.i.f251896l2;
                    ScrollView scrollView = (ScrollView) b4.c.a(view, i10);
                    if (scrollView != null) {
                        i10 = c1.i.M2;
                        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                        if (linearLayout != null) {
                            i10 = c1.i.E6;
                            PreloaderBoxView preloaderBoxView = (PreloaderBoxView) b4.c.a(view, i10);
                            if (preloaderBoxView != null) {
                                i10 = c1.i.f251985s9;
                                TextView textView = (TextView) b4.c.a(view, i10);
                                if (textView != null) {
                                    return new e((FrameLayout) view, button, button2, button3, scrollView, linearLayout, preloaderBoxView, textView);
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
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.f252140c0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f380890a;
    }
}
