package rd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f366619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f366620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f366621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f366622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f366623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f366624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f366625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f366626h;

    private i(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f366619a = view;
        this.f366620b = frameLayout;
        this.f366621c = imageView;
        this.f366622d = circularProgressIndicator;
        this.f366623e = textView;
        this.f366624f = imageView2;
        this.f366625g = textView2;
        this.f366626h = textView3;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = qd.b.i.f352368d0;
        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
        if (frameLayout != null) {
            i10 = qd.b.i.Z1;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = qd.b.i.f352391f5;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b4.c.a(view, i10);
                if (circularProgressIndicator != null) {
                    i10 = qd.b.i.f352454m5;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = qd.b.i.f352464n6;
                        ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                        if (imageView2 != null) {
                            i10 = qd.b.i.f352473o6;
                            TextView textView2 = (TextView) b4.c.a(view, i10);
                            if (textView2 != null) {
                                i10 = qd.b.i.f352482p6;
                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                if (textView3 != null) {
                                    return new i(view, frameLayout, imageView, circularProgressIndicator, textView, imageView2, textView2, textView3);
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
    public static i b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(qd.b.l.f352664i1, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f366619a;
    }
}
