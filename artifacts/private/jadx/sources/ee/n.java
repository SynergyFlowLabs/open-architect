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
public final class n implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f274848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f274849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f274850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f274851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f274852f;

    private n(@NonNull ConstraintLayout rootView, @NonNull RecyclerView recyclerView, @NonNull ImageView surveyButtonBack, @NonNull LinearProgressIndicator surveyProgress, @NonNull TextView surveyStepNr, @NonNull TextView surveyTitle) {
        this.f274847a = rootView;
        this.f274848b = recyclerView;
        this.f274849c = surveyButtonBack;
        this.f274850d = surveyProgress;
        this.f274851e = surveyStepNr;
        this.f274852f = surveyTitle;
    }

    @NonNull
    public static n a(@NonNull View rootView) {
        int i10 = de.b.i.f272344s8;
        RecyclerView recyclerView = (RecyclerView) b4.c.a(rootView, i10);
        if (recyclerView != null) {
            i10 = de.b.i.f272181ga;
            ImageView imageView = (ImageView) b4.c.a(rootView, i10);
            if (imageView != null) {
                i10 = de.b.i.f272195ha;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b4.c.a(rootView, i10);
                if (linearProgressIndicator != null) {
                    i10 = de.b.i.f272223ja;
                    TextView textView = (TextView) b4.c.a(rootView, i10);
                    if (textView != null) {
                        i10 = de.b.i.f272293oa;
                        TextView textView2 = (TextView) b4.c.a(rootView, i10);
                        if (textView2 != null) {
                            return new n((ConstraintLayout) rootView, recyclerView, imageView, linearProgressIndicator, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static n c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static n d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272575o2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274847a;
    }
}
