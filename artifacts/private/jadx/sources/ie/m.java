package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f287174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f287175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f287176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f287177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f287178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f287179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f287180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f287181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f287182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f287183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f287184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f287185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f287186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f287187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f287188o;

    private m(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextInputEditTextCompat textInputEditTextCompat, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditTextCompat textInputEditTextCompat2, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputEditTextCompat textInputEditTextCompat3, @NonNull TextInputLayout textInputLayout3, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView5) {
        this.f287174a = frameLayout;
        this.f287175b = textView;
        this.f287176c = textView2;
        this.f287177d = textView3;
        this.f287178e = textView4;
        this.f287179f = imageView;
        this.f287180g = imageView2;
        this.f287181h = textInputEditTextCompat;
        this.f287182i = textInputLayout;
        this.f287183j = textInputEditTextCompat2;
        this.f287184k = textInputLayout2;
        this.f287185l = textInputEditTextCompat3;
        this.f287186m = textInputLayout3;
        this.f287187n = buttonTextView;
        this.f287188o = textView5;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i10 = he.b.j.A5;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = he.b.j.G5;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = he.b.j.R9;
                TextView textView3 = (TextView) b4.c.a(view, i10);
                if (textView3 != null) {
                    i10 = he.b.j.f283221pa;
                    TextView textView4 = (TextView) b4.c.a(view, i10);
                    if (textView4 != null) {
                        i10 = he.b.j.Vd;
                        ImageView imageView = (ImageView) b4.c.a(view, i10);
                        if (imageView != null) {
                            i10 = he.b.j.Yh;
                            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                            if (imageView2 != null) {
                                i10 = he.b.j.Or;
                                TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(view, i10);
                                if (textInputEditTextCompat != null) {
                                    i10 = he.b.j.Pr;
                                    TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(view, i10);
                                    if (textInputLayout != null) {
                                        i10 = he.b.j.Qr;
                                        TextInputEditTextCompat textInputEditTextCompat2 = (TextInputEditTextCompat) b4.c.a(view, i10);
                                        if (textInputEditTextCompat2 != null) {
                                            i10 = he.b.j.Rr;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) b4.c.a(view, i10);
                                            if (textInputLayout2 != null) {
                                                i10 = he.b.j.Sr;
                                                TextInputEditTextCompat textInputEditTextCompat3 = (TextInputEditTextCompat) b4.c.a(view, i10);
                                                if (textInputEditTextCompat3 != null) {
                                                    i10 = he.b.j.Tr;
                                                    TextInputLayout textInputLayout3 = (TextInputLayout) b4.c.a(view, i10);
                                                    if (textInputLayout3 != null) {
                                                        i10 = he.b.j.Bu;
                                                        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                                                        if (buttonTextView != null) {
                                                            i10 = he.b.j.rw;
                                                            TextView textView5 = (TextView) b4.c.a(view, i10);
                                                            if (textView5 != null) {
                                                                return new m((FrameLayout) view, textView, textView2, textView3, textView4, imageView, imageView2, textInputEditTextCompat, textInputLayout, textInputEditTextCompat2, textInputLayout2, textInputEditTextCompat3, textInputLayout3, buttonTextView, textView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static m d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.f283571c3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f287174a;
    }
}
