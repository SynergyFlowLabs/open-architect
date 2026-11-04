package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f380911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f380912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f380913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f380914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f380915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f380916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f380917g;

    private g(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull LinearLayout linearLayout) {
        this.f380911a = constraintLayout;
        this.f380912b = constraintLayout2;
        this.f380913c = recyclerView;
        this.f380914d = textView;
        this.f380915e = textView2;
        this.f380916f = view;
        this.f380917g = linearLayout;
    }

    @NonNull
    public static g a(@NonNull View view) {
        View viewA;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = c1.i.f251966r1;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null) {
            i10 = c1.i.f251977s1;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = c1.i.f251988t1;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null && (viewA = b4.c.a(view, (i10 = c1.i.W2))) != null) {
                    i10 = c1.i.f251996t9;
                    LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                    if (linearLayout != null) {
                        return new g(constraintLayout, constraintLayout, recyclerView, textView, textView2, viewA, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.f252160h0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f380911a;
    }
}
