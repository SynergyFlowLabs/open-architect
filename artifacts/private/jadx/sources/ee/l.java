package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f274836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f274837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f274838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f274839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f274840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f274841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f274842h;

    private l(@NonNull ConstraintLayout rootView, @NonNull TextView buttonContinue, @NonNull RecyclerView recyclerView, @NonNull ImageView surveyButtonBack, @NonNull LinearProgressIndicator surveyProgress, @NonNull TextView surveyStepNr, @NonNull TextView surveyTitle, @NonNull View whiteMask) {
        this.f274835a = rootView;
        this.f274836b = buttonContinue;
        this.f274837c = recyclerView;
        this.f274838d = surveyButtonBack;
        this.f274839e = surveyProgress;
        this.f274840f = surveyStepNr;
        this.f274841g = surveyTitle;
        this.f274842h = whiteMask;
    }

    @NonNull
    public static l a(@NonNull View rootView) {
        View viewA;
        int i10 = de.b.i.U1;
        TextView textView = (TextView) b4.c.a(rootView, i10);
        if (textView != null) {
            i10 = de.b.i.f272344s8;
            RecyclerView recyclerView = (RecyclerView) b4.c.a(rootView, i10);
            if (recyclerView != null) {
                i10 = de.b.i.f272181ga;
                ImageView imageView = (ImageView) b4.c.a(rootView, i10);
                if (imageView != null) {
                    i10 = de.b.i.f272195ha;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b4.c.a(rootView, i10);
                    if (linearProgressIndicator != null) {
                        i10 = de.b.i.f272223ja;
                        TextView textView2 = (TextView) b4.c.a(rootView, i10);
                        if (textView2 != null) {
                            i10 = de.b.i.f272293oa;
                            TextView textView3 = (TextView) b4.c.a(rootView, i10);
                            if (textView3 != null && (viewA = b4.c.a(rootView, (i10 = de.b.i.f272141dc))) != null) {
                                return new l((ConstraintLayout) rootView, textView, recyclerView, imageView, linearProgressIndicator, textView2, textView3, viewA);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static l d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272567m2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274835a;
    }
}
