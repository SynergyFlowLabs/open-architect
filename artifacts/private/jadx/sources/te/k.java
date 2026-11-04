package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.slider.DashedProgressSlideIndicator;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f380945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f380946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f380947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final DashedProgressSlideIndicator f380948d;

    private k(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull DashedProgressSlideIndicator dashedProgressSlideIndicator) {
        this.f380945a = constraintLayout;
        this.f380946b = recyclerView;
        this.f380947c = view;
        this.f380948d = dashedProgressSlideIndicator;
    }

    @NonNull
    public static k a(@NonNull View view) {
        View viewA;
        int i10 = c1.i.f251853h7;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
        if (recyclerView != null && (viewA = b4.c.a(view, (i10 = c1.i.f251865i7))) != null) {
            i10 = c1.i.Z7;
            DashedProgressSlideIndicator dashedProgressSlideIndicator = (DashedProgressSlideIndicator) b4.c.a(view, i10);
            if (dashedProgressSlideIndicator != null) {
                return new k((ConstraintLayout) view, recyclerView, viewA, dashedProgressSlideIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static k c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static k d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.f252134a2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f380945a;
    }
}
