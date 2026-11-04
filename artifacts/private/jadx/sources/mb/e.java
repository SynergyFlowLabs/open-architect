package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.viewpager.widget.ViewPager;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f322870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f322871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewPager f322872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f322873d;

    private e(@NonNull FrameLayout frameLayout, @NonNull ButtonTextView buttonTextView, @NonNull ViewPager viewPager, @NonNull PreloaderSimpleV2View preloaderSimpleV2View) {
        this.f322870a = frameLayout;
        this.f322871b = buttonTextView;
        this.f322872c = viewPager;
        this.f322873d = preloaderSimpleV2View;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = lb.b.j.P5;
        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
        if (buttonTextView != null) {
            i10 = lb.b.j.f320184ue;
            ViewPager viewPager = (ViewPager) b4.c.a(view, i10);
            if (viewPager != null) {
                i10 = lb.b.j.f320208ve;
                PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
                if (preloaderSimpleV2View != null) {
                    return new e((FrameLayout) view, buttonTextView, viewPager, preloaderSimpleV2View);
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
        View viewInflate = layoutInflater.inflate(lb.b.m.B1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f322870a;
    }
}
