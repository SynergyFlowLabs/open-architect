package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final q f287164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f287165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f287166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f287167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f287168f;

    private k(@NonNull ConstraintLayout constraintLayout, @NonNull q qVar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ButtonTextView buttonTextView) {
        this.f287163a = constraintLayout;
        this.f287164b = qVar;
        this.f287165c = textView;
        this.f287166d = textView2;
        this.f287167e = textView3;
        this.f287168f = buttonTextView;
    }

    @NonNull
    public static k a(@NonNull View view) {
        int i10 = he.b.j.W3;
        View viewA = b4.c.a(view, i10);
        if (viewA != null) {
            q qVarA = q.a(viewA);
            i10 = he.b.j.f283221pa;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                i10 = he.b.j.f283245qa;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    i10 = he.b.j.Cu;
                    TextView textView3 = (TextView) b4.c.a(view, i10);
                    if (textView3 != null) {
                        i10 = he.b.j.Fy;
                        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
                        if (buttonTextView != null) {
                            return new k((ConstraintLayout) view, qVarA, textView, textView2, textView3, buttonTextView);
                        }
                    }
                }
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
        View viewInflate = layoutInflater.inflate(he.b.m.f283549a3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287163a;
    }
}
