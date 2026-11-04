package se;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f375990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialButton f375991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f375992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialButton f375993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f375994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f375995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f375996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f375997h;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull MaterialButton materialButton3, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull TextView textView) {
        this.f375990a = constraintLayout;
        this.f375991b = materialButton;
        this.f375992c = materialButton2;
        this.f375993d = materialButton3;
        this.f375994e = frameLayout;
        this.f375995f = imageView;
        this.f375996g = preloaderBoxV2View;
        this.f375997h = textView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = com.planner5d.library.view.d.i.O1;
        MaterialButton materialButton = (MaterialButton) b4.c.a(view, i10);
        if (materialButton != null) {
            i10 = com.planner5d.library.view.d.i.Q1;
            MaterialButton materialButton2 = (MaterialButton) b4.c.a(view, i10);
            if (materialButton2 != null) {
                i10 = com.planner5d.library.view.d.i.R1;
                MaterialButton materialButton3 = (MaterialButton) b4.c.a(view, i10);
                if (materialButton3 != null) {
                    i10 = com.planner5d.library.view.d.i.C2;
                    FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                    if (frameLayout != null) {
                        i10 = com.planner5d.library.view.d.i.f247070g3;
                        ImageView imageView = (ImageView) b4.c.a(view, i10);
                        if (imageView != null) {
                            i10 = com.planner5d.library.view.d.i.f247152m7;
                            PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
                            if (preloaderBoxV2View != null) {
                                i10 = com.planner5d.library.view.d.i.f247077ga;
                                TextView textView = (TextView) b4.c.a(view, i10);
                                if (textView != null) {
                                    return new b((ConstraintLayout) view, materialButton, materialButton2, materialButton3, frameLayout, imageView, preloaderBoxV2View, textView);
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
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.view.d.l.X, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f375990a;
    }
}
