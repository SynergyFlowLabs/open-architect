package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.airbnb.lottie.LottieAnimationView;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f380908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextSwitcher f380909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f380910d;

    private f0(@NonNull View view, @NonNull LottieAnimationView lottieAnimationView, @NonNull TextSwitcher textSwitcher, @NonNull TextView textView) {
        this.f380907a = view;
        this.f380908b = lottieAnimationView;
        this.f380909c = textSwitcher;
        this.f380910d = textView;
    }

    @NonNull
    public static f0 a(@NonNull View view) {
        int i10 = c1.i.V0;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b4.c.a(view, i10);
        if (lottieAnimationView != null) {
            i10 = c1.i.L8;
            TextSwitcher textSwitcher = (TextSwitcher) b4.c.a(view, i10);
            if (textSwitcher != null) {
                i10 = c1.i.f251985s9;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new f0(view, lottieAnimationView, textSwitcher, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f0 b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252226x2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380907a;
    }
}
