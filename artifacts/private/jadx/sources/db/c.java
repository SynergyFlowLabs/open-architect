package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f269758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f269759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f269760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f269761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f269762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f269763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f269764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f269765h;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ButtonTextView buttonTextView, @NonNull PreloaderSimpleV2View preloaderSimpleV2View, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f269758a = constraintLayout;
        this.f269759b = imageView;
        this.f269760c = imageView2;
        this.f269761d = buttonTextView;
        this.f269762e = preloaderSimpleV2View;
        this.f269763f = textView;
        this.f269764g = textView2;
        this.f269765h = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.S3;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = com.planner5d.library.contest.e.i.T3;
            ImageView imageView2 = (ImageView) b4.c.a(view, i10);
            if (imageView2 != null) {
                i10 = com.planner5d.library.contest.e.i.U3;
                ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                if (buttonTextView != null) {
                    i10 = com.planner5d.library.contest.e.i.V3;
                    PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
                    if (preloaderSimpleV2View != null) {
                        i10 = com.planner5d.library.contest.e.i.W3;
                        TextView textView = (TextView) b4.c.a(view, i10);
                        if (textView != null) {
                            i10 = com.planner5d.library.contest.e.i.X3;
                            TextView textView2 = (TextView) b4.c.a(view, i10);
                            if (textView2 != null) {
                                i10 = com.planner5d.library.contest.e.i.Y3;
                                TextView textView3 = (TextView) b4.c.a(view, i10);
                                if (textView3 != null) {
                                    return new c((ConstraintLayout) view, imageView, imageView2, buttonTextView, preloaderSimpleV2View, textView, textView2, textView3);
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
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.Y, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f269758a;
    }
}
