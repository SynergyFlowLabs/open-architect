package ra;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f362233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f362234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f362235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f362236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f362237e;

    private b(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull Button button2, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.f362233a = frameLayout;
        this.f362234b = button;
        this.f362235c = button2;
        this.f362236d = frameLayout2;
        this.f362237e = frameLayout3;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = com.planner5d.library.activity.tutorial.c.i.E1;
        Button button = (Button) b4.c.a(view, i10);
        if (button != null) {
            i10 = com.planner5d.library.activity.tutorial.c.i.H1;
            Button button2 = (Button) b4.c.a(view, i10);
            if (button2 != null) {
                i10 = com.planner5d.library.activity.tutorial.c.i.K1;
                FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
                if (frameLayout != null) {
                    i10 = com.planner5d.library.activity.tutorial.c.i.K6;
                    FrameLayout frameLayout2 = (FrameLayout) b4.c.a(view, i10);
                    if (frameLayout2 != null) {
                        return new b((FrameLayout) view, button, button2, frameLayout, frameLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.activity.tutorial.c.l.f139860k0, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f362233a;
    }
}
