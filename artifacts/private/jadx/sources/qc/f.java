package qc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f350337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f350338b;

    private f(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.f350337a = frameLayout;
        this.f350338b = textView;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = pc.b.i.Ga;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            return new f((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(pc.b.l.f343640q0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f350337a;
    }
}
