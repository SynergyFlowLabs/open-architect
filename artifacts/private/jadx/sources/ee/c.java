package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f274780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f274781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f274782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f274783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f274784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f274785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ScrollView f274786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f274787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f274788j;

    private c(@NonNull ConstraintLayout rootView, @NonNull ImageView back, @NonNull MaterialButton buttonContinue, @NonNull TextView fullAddress, @NonNull ImageView houseImage, @NonNull LinearLayout houseInfoList, @NonNull TextView idea, @NonNull ScrollView scroll, @NonNull ImageView tip, @NonNull TextView title) {
        this.f274779a = rootView;
        this.f274780b = back;
        this.f274781c = buttonContinue;
        this.f274782d = fullAddress;
        this.f274783e = houseImage;
        this.f274784f = houseInfoList;
        this.f274785g = idea;
        this.f274786h = scroll;
        this.f274787i = tip;
        this.f274788j = title;
    }

    @NonNull
    public static c a(@NonNull View rootView) {
        int i10 = de.b.i.f272311q1;
        ImageView imageView = (ImageView) b4.c.a(rootView, i10);
        if (imageView != null) {
            i10 = de.b.i.U1;
            MaterialButton materialButton = (MaterialButton) b4.c.a(rootView, i10);
            if (materialButton != null) {
                i10 = de.b.i.f272245l4;
                TextView textView = (TextView) b4.c.a(rootView, i10);
                if (textView != null) {
                    i10 = de.b.i.D4;
                    ImageView imageView2 = (ImageView) b4.c.a(rootView, i10);
                    if (imageView2 != null) {
                        i10 = de.b.i.E4;
                        LinearLayout linearLayout = (LinearLayout) b4.c.a(rootView, i10);
                        if (linearLayout != null) {
                            i10 = de.b.i.J4;
                            TextView textView2 = (TextView) b4.c.a(rootView, i10);
                            if (textView2 != null) {
                                i10 = de.b.i.L8;
                                ScrollView scrollView = (ScrollView) b4.c.a(rootView, i10);
                                if (scrollView != null) {
                                    i10 = de.b.i.Wa;
                                    ImageView imageView3 = (ImageView) b4.c.a(rootView, i10);
                                    if (imageView3 != null) {
                                        i10 = de.b.i.Xa;
                                        TextView textView3 = (TextView) b4.c.a(rootView, i10);
                                        if (textView3 != null) {
                                            return new c((ConstraintLayout) rootView, imageView, materialButton, textView, imageView2, linearLayout, textView2, scrollView, imageView3, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272521c2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274779a;
    }
}
