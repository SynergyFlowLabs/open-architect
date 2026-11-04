package se;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.Toolbar;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f375985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f375986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Toolbar f375987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f375988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final WebView f375989e;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Toolbar toolbar, @NonNull View view, @NonNull WebView webView) {
        this.f375985a = constraintLayout;
        this.f375986b = imageView;
        this.f375987c = toolbar;
        this.f375988d = view;
        this.f375989e = webView;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.view.d.i.f247159n1;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.view.d.i.f247129ka;
            Toolbar toolbar = (Toolbar) b4.c.a(view, i10);
            if (toolbar != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.view.d.i.f247142la))) != null) {
                i10 = com.planner5d.library.view.d.i.f247000ab;
                WebView webView = (WebView) b4.c.a(view, i10);
                if (webView != null) {
                    return new a((ConstraintLayout) view, imageView, toolbar, viewA, webView);
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
        View viewInflate = layoutInflater.inflate(com.planner5d.library.view.d.l.W, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f375985a;
    }
}
