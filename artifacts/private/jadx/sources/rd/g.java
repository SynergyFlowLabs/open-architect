package rd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f366613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f366614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ComposeView f366615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ComposeView f366616d;

    private g(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ComposeView composeView, @NonNull ComposeView composeView2) {
        this.f366613a = constraintLayout;
        this.f366614b = constraintLayout2;
        this.f366615c = composeView;
        this.f366616d = composeView2;
    }

    @NonNull
    public static g a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = qd.b.i.J1;
        ComposeView composeView = (ComposeView) b4.c.a(view, i10);
        if (composeView != null) {
            i10 = qd.b.i.f352357b7;
            ComposeView composeView2 = (ComposeView) b4.c.a(view, i10);
            if (composeView2 != null) {
                return new g(constraintLayout, constraintLayout, composeView, composeView2);
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
        View viewInflate = layoutInflater.inflate(qd.b.l.f352655f1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f366613a;
    }
}
