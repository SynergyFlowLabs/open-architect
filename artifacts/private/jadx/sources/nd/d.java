package nd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.preloader.PreloaderSimpleV2View;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f332763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f332764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f332765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PreloaderSimpleV2View f332766d;

    private d(@NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull PreloaderSimpleV2View preloaderSimpleV2View) {
        this.f332763a = nestedScrollView;
        this.f332764b = textView;
        this.f332765c = recyclerView;
        this.f332766d = preloaderSimpleV2View;
    }

    @NonNull
    public static d a(@NonNull View view) {
        int i10 = md.b.j.ar;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = md.b.j.dr;
            RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
            if (recyclerView != null) {
                i10 = md.b.j.er;
                PreloaderSimpleV2View preloaderSimpleV2View = (PreloaderSimpleV2View) b4.c.a(view, i10);
                if (preloaderSimpleV2View != null) {
                    return new d((NestedScrollView) view, textView, recyclerView, preloaderSimpleV2View);
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
        View viewInflate = layoutInflater.inflate(md.b.m.L2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f332763a;
    }
}
