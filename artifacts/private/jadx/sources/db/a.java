package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.UrlSwitchCompat;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f269740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f269741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f269742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final UrlSwitchCompat f269743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f269744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f269745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f269746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f269747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f269748i;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull UrlSwitchCompat urlSwitchCompat, @NonNull ButtonTextView buttonTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f269740a = constraintLayout;
        this.f269741b = imageView;
        this.f269742c = imageView2;
        this.f269743d = urlSwitchCompat;
        this.f269744e = buttonTextView;
        this.f269745f = constraintLayout2;
        this.f269746g = progressBar;
        this.f269747h = textView;
        this.f269748i = textView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.I3;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.contest.e.i.J3;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = com.planner5d.library.contest.e.i.K3;
                UrlSwitchCompat urlSwitchCompat = (UrlSwitchCompat) b4.c.a(view, i10);
                if (urlSwitchCompat != null) {
                    i10 = com.planner5d.library.contest.e.i.L3;
                    ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                    if (buttonTextView != null) {
                        i10 = com.planner5d.library.contest.e.i.M3;
                        ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                        if (constraintLayout != null) {
                            i10 = com.planner5d.library.contest.e.i.N3;
                            ProgressBar progressBar = (ProgressBar) b4.c.a(view, i10);
                            if (progressBar != null) {
                                i10 = com.planner5d.library.contest.e.i.O3;
                                TextView textView = (TextView) b4.c.a(view, i10);
                                if (textView != null) {
                                    i10 = com.planner5d.library.contest.e.i.P3;
                                    TextView textView2 = (TextView) b4.c.a(view, i10);
                                    if (textView2 != null) {
                                        return new a((ConstraintLayout) view, imageView, imageView2, urlSwitchCompat, buttonTextView, constraintLayout, progressBar, textView, textView2);
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
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.W, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f269740a;
    }
}
