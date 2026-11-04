package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f380867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f380868b;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout) {
        this.f380867a = constraintLayout;
        this.f380868b = frameLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = c1.i.f251896l2;
        FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
        if (frameLayout != null) {
            return new b((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.X, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f380867a;
    }
}
