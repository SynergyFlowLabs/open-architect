package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f274776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f274777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextSwitcher f274778d;

    private b(@NonNull ConstraintLayout rootView, @NonNull LottieAnimationView animation, @NonNull ImageView backButton, @NonNull TextSwitcher textSwitcher) {
        this.f274775a = rootView;
        this.f274776b = animation;
        this.f274777c = backButton;
        this.f274778d = textSwitcher;
    }

    @NonNull
    public static b a(@NonNull View rootView) {
        int i10 = de.b.i.f272130d1;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b4.c.a(rootView, i10);
        if (lottieAnimationView != null) {
            i10 = de.b.i.f272324r1;
            ImageView imageView = (ImageView) b4.c.a(rootView, i10);
            if (imageView != null) {
                i10 = de.b.i.Na;
                TextSwitcher textSwitcher = (TextSwitcher) b4.c.a(rootView, i10);
                if (textSwitcher != null) {
                    return new b((ConstraintLayout) rootView, lottieAnimationView, imageView, textSwitcher);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272516b2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274775a;
    }
}
