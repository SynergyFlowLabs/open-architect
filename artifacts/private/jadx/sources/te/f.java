package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f380902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f380903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f380904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f380905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f380906e;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f380902a = constraintLayout;
        this.f380903b = constraintLayout2;
        this.f380904c = view;
        this.f380905d = recyclerView;
        this.f380906e = textView;
    }

    @NonNull
    public static f a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = c1.i.f251907m1;
        View viewA = b4.c.a(view, i10);
        if (viewA != null) {
            i10 = c1.i.f251966r1;
            RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
            if (recyclerView != null) {
                i10 = c1.i.f251988t1;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new f(constraintLayout, constraintLayout, viewA, recyclerView, textView);
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
        View viewInflate = layoutInflater.inflate(c1.l.f252156g0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f380902a;
    }
}
