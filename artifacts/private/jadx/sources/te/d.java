package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f380883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f380884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f380885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f380886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderBoxV2View f380887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f380888f;

    private d(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull PreloaderBoxV2View preloaderBoxV2View, @NonNull TextView textView) {
        this.f380883a = linearLayout;
        this.f380884b = linearLayout2;
        this.f380885c = imageView;
        this.f380886d = view;
        this.f380887e = preloaderBoxV2View;
        this.f380888f = textView;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = c1.i.N2;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null && (viewA = b4.c.a(view, (i10 = c1.i.O2))) != null) {
            i10 = c1.i.E6;
            PreloaderBoxV2View preloaderBoxV2View = (PreloaderBoxV2View) b4.c.a(view, i10);
            if (preloaderBoxV2View != null) {
                i10 = c1.i.f251985s9;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new d(linearLayout, linearLayout, imageView, viewA, preloaderBoxV2View, textView);
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
        View viewInflate = layoutInflater.inflate(c1.l.f252132a0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f380883a;
    }
}
