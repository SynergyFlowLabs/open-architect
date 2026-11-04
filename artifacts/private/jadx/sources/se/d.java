package se;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f376000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f376001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f376002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f376003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f376004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f376005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f376006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f376007h;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FrameLayout frameLayout, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull TextView textView4) {
        this.f376000a = constraintLayout;
        this.f376001b = textView;
        this.f376002c = linearLayout;
        this.f376003d = textView2;
        this.f376004e = textView3;
        this.f376005f = frameLayout;
        this.f376006g = preloaderBoxV2View;
        this.f376007h = textView4;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = com.planner5d.library.view.d.i.O1;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = com.planner5d.library.view.d.i.P1;
            LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
            if (linearLayout != null) {
                i10 = com.planner5d.library.view.d.i.Q1;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = com.planner5d.library.view.d.i.R1;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = com.planner5d.library.view.d.i.C2;
                        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                        if (frameLayout != null) {
                            i10 = com.planner5d.library.view.d.i.f247152m7;
                            PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                            if (preloaderBoxV2View != null) {
                                i10 = com.planner5d.library.view.d.i.f247077ga;
                                TextView textView4 = (TextView) b4.c.a(view, i10);
                                if (textView4 != null) {
                                    return new d((ConstraintLayout) view, textView, linearLayout, textView2, textView3, frameLayout, preloaderBoxV2View, textView4);
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
    public static d c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.view.d.l.f247394d0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f376000a;
    }
}
