package rd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f366603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f366604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f366605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f366606d;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f366603a = constraintLayout;
        this.f366604b = textView;
        this.f366605c = textView2;
        this.f366606d = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = qd.b.i.f352396g1;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null) {
            i10 = qd.b.i.f352405h1;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                i10 = qd.b.i.f352414i1;
                TextView textView3 = (TextView) b4.c.a(view, i10);
                if (textView3 != null) {
                    return new c((ConstraintLayout) view, textView, textView2, textView3);
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
        View viewInflate = layoutInflater.inflate(qd.b.l.U, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f366603a;
    }
}
