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
public final class l implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f287170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f287171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final p f287172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f287173e;

    private l(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonTextView buttonTextView, @NonNull TextView textView, @NonNull p pVar, @NonNull TextView textView2) {
        this.f287169a = constraintLayout;
        this.f287170b = buttonTextView;
        this.f287171c = textView;
        this.f287172d = pVar;
        this.f287173e = textView2;
    }

    @NonNull
    public static l a(@NonNull View view) {
        View viewA;
        int i10 = he.b.j.f283240q5;
        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
        if (buttonTextView != null) {
            i10 = he.b.j.f283221pa;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null && (viewA = b4.c.a(view, (i10 = he.b.j.Ur))) != null) {
                p pVarA = p.a(viewA);
                i10 = he.b.j.rw;
                TextView textView2 = (TextView) b4.c.a(view, i10);
                if (textView2 != null) {
                    return new l((ConstraintLayout) view, buttonTextView, textView, pVarA, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static l d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.f283560b3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287169a;
    }
}
