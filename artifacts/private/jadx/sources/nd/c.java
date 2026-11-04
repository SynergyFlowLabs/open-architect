package nd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f332758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f332759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f332760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f332761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f332762e;

    private c(@NonNull FrameLayout frameLayout, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull PreloaderSimpleV2View preloaderSimpleV2View) {
        this.f332758a = frameLayout;
        this.f332759b = buttonTextView;
        this.f332760c = textView;
        this.f332761d = recyclerView;
        this.f332762e = preloaderSimpleV2View;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = md.b.j.Tq;
        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
        if (buttonTextView != null) {
            i10 = md.b.j.Uq;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = md.b.j.Wq;
                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                if (recyclerView != null) {
                    i10 = md.b.j.Xq;
                    PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
                    if (preloaderSimpleV2View != null) {
                        return new c((FrameLayout) view, buttonTextView, textView, recyclerView, preloaderSimpleV2View);
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
        View viewInflate = layoutInflater.inflate(md.b.m.K2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f332758a;
    }
}
