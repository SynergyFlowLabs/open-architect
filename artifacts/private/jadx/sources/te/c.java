package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.PreloaderCoverView;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f380873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f380874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f380875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f380876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f380877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f380878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f380879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final PreloaderCoverView f380880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f380881i;

    private c(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull PreloaderCoverView preloaderCoverView, @NonNull TextView textView) {
        this.f380873a = frameLayout;
        this.f380874b = button;
        this.f380875c = button2;
        this.f380876d = button3;
        this.f380877e = frameLayout2;
        this.f380878f = linearLayout;
        this.f380879g = imageView;
        this.f380880h = preloaderCoverView;
        this.f380881i = textView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = c1.i.C1;
        Button button = (Button) b4.c.a(view, i10);
        if (button != null) {
            i10 = c1.i.D1;
            Button button2 = (Button) b4.c.a(view, i10);
            if (button2 != null) {
                i10 = c1.i.F1;
                Button button3 = (Button) b4.c.a(view, i10);
                if (button3 != null) {
                    i10 = c1.i.f251896l2;
                    FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                    if (frameLayout != null) {
                        i10 = c1.i.M2;
                        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                        if (linearLayout != null) {
                            i10 = c1.i.N2;
                            ImageView imageView = (ImageView) b4.c.a(view, i10);
                            if (imageView != null) {
                                i10 = c1.i.E6;
                                PreloaderCoverView preloaderCoverView = (PreloaderCoverView) b4.c.a(view, i10);
                                if (preloaderCoverView != null) {
                                    i10 = c1.i.f251985s9;
                                    TextView textView = (TextView) b4.c.a(view, i10);
                                    if (textView != null) {
                                        return new c((FrameLayout) view, button, button2, button3, frameLayout, linearLayout, imageView, preloaderCoverView, textView);
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
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.Z, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f380873a;
    }
}
