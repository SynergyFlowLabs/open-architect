package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CardView f322879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f322880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f322881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f322882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f322883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f322884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f322885g;

    private g(@NonNull CardView cardView, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ButtonTextView buttonTextView2, @NonNull TextView textView2) {
        this.f322879a = cardView;
        this.f322880b = buttonTextView;
        this.f322881c = textView;
        this.f322882d = imageView;
        this.f322883e = imageView2;
        this.f322884f = buttonTextView2;
        this.f322885g = textView2;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i10 = lb.b.j.f319690a4;
        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
        if (buttonTextView != null) {
            i10 = lb.b.j.f319939ka;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = lb.b.j.Yd;
                ImageView imageView = (ImageView) b4.c.a(view, i10);
                if (imageView != null) {
                    i10 = lb.b.j.f319823fe;
                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                    if (imageView2 != null) {
                        i10 = lb.b.j.Nq;
                        ButtonTextView buttonTextView2 = (ButtonTextView) b4.c.a(view, i10);
                        if (buttonTextView2 != null) {
                            i10 = lb.b.j.jw;
                            TextView textView2 = (TextView) b4.c.a(view, i10);
                            if (textView2 != null) {
                                return new g((CardView) view, buttonTextView, textView, imageView, imageView2, buttonTextView2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(lb.b.m.A7, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f322879a;
    }
}
