package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.tooltip.TooltipContainerView;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f380954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TooltipContainerView f380955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f380956c;

    private l0(@NonNull FrameLayout frameLayout, @NonNull TooltipContainerView tooltipContainerView, @NonNull TextView textView) {
        this.f380954a = frameLayout;
        this.f380955b = tooltipContainerView;
        this.f380956c = textView;
    }

    @NonNull
    public static l0 a(@NonNull View view) {
        int i10 = c1.i.f252040x9;
        TooltipContainerView tooltipContainerView = (TooltipContainerView) b4.c.a(view, i10);
        if (tooltipContainerView != null) {
            i10 = c1.i.f252051y9;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new l0((FrameLayout) view, tooltipContainerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l0 c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static l0 d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.G2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f380954a;
    }
}
