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
import com.planner5d.library.widget.preloader.PreloaderBarView;

/* JADX INFO: loaded from: classes12.dex */
public final class z implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f381018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f381019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f381020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f381021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f381022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f381023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f381024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final FrameLayout f381025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final PreloaderBarView f381026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f381027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f381028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final Button f381029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f381030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f381031n;

    private z(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull PreloaderBarView preloaderBarView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button3, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f381018a = frameLayout;
        this.f381019b = linearLayout;
        this.f381020c = button;
        this.f381021d = button2;
        this.f381022e = linearLayout2;
        this.f381023f = linearLayout3;
        this.f381024g = imageView;
        this.f381025h = frameLayout2;
        this.f381026i = preloaderBarView;
        this.f381027j = textView;
        this.f381028k = textView2;
        this.f381029l = button3;
        this.f381030m = textView3;
        this.f381031n = textView4;
    }

    @NonNull
    public static z a(@NonNull View view) {
        int i10 = c1.i.L6;
        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
        if (linearLayout != null) {
            i10 = c1.i.M6;
            Button button = (Button) b4.c.a(view, i10);
            if (button != null) {
                i10 = c1.i.N6;
                Button button2 = (Button) b4.c.a(view, i10);
                if (button2 != null) {
                    i10 = c1.i.O6;
                    LinearLayout linearLayout2 = (LinearLayout) b4.c.a(view, i10);
                    if (linearLayout2 != null) {
                        i10 = c1.i.P6;
                        LinearLayout linearLayout3 = (LinearLayout) b4.c.a(view, i10);
                        if (linearLayout3 != null) {
                            i10 = c1.i.Q6;
                            ImageView imageView = (ImageView) b4.c.a(view, i10);
                            if (imageView != null) {
                                FrameLayout frameLayout = (FrameLayout) view;
                                i10 = c1.i.S6;
                                PreloaderBarView preloaderBarView = (PreloaderBarView) b4.c.a(view, i10);
                                if (preloaderBarView != null) {
                                    i10 = c1.i.T6;
                                    TextView textView = (TextView) b4.c.a(view, i10);
                                    if (textView != null) {
                                        i10 = c1.i.U6;
                                        TextView textView2 = (TextView) b4.c.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = c1.i.V6;
                                            Button button3 = (Button) b4.c.a(view, i10);
                                            if (button3 != null) {
                                                i10 = c1.i.W6;
                                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                                if (textView3 != null) {
                                                    i10 = c1.i.X6;
                                                    TextView textView4 = (TextView) b4.c.a(view, i10);
                                                    if (textView4 != null) {
                                                        return new z(frameLayout, linearLayout, button, button2, linearLayout2, linearLayout3, imageView, frameLayout, preloaderBarView, textView, textView2, button3, textView3, textView4);
                                                    }
                                                }
                                            }
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
    public static z c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static z d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.f252202r2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f381018a;
    }
}
