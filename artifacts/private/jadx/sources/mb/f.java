package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f322874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f322875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f322876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f322877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f322878e;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull PreloaderSimpleV2View preloaderSimpleV2View, @NonNull ButtonTextView buttonTextView, @NonNull a aVar) {
        this.f322874a = constraintLayout;
        this.f322875b = recyclerView;
        this.f322876c = preloaderSimpleV2View;
        this.f322877d = buttonTextView;
        this.f322878e = aVar;
    }

    @NonNull
    public static f a(@NonNull View view) {
        View viewA;
        int i10 = lb.b.j.P3;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null) {
            i10 = lb.b.j.Q3;
            PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
            if (preloaderSimpleV2View != null) {
                i10 = lb.b.j.R3;
                ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                if (buttonTextView != null && (viewA = b4.c.a(view, (i10 = lb.b.j.f319987ma))) != null) {
                    return new f((ConstraintLayout) view, recyclerView, preloaderSimpleV2View, buttonTextView, a.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(lb.b.m.C1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f322874a;
    }
}
