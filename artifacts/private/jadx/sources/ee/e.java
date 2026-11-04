package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f274794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f274795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f274796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f274797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f274798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f274799g;

    private e(@NonNull ConstraintLayout rootView, @NonNull TextInputEditTextCompat addressInput, @NonNull TextInputLayout addressInputLayout, @NonNull RecyclerView addressResultList, @NonNull ImageView backButton, @NonNull View border, @NonNull LinearProgressIndicator progressIndicator) {
        this.f274793a = rootView;
        this.f274794b = addressInput;
        this.f274795c = addressInputLayout;
        this.f274796d = addressResultList;
        this.f274797e = backButton;
        this.f274798f = border;
        this.f274799g = progressIndicator;
    }

    @NonNull
    public static e a(@NonNull View rootView) {
        View viewA;
        int i10 = de.b.i.R0;
        TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(rootView, i10);
        if (textInputEditTextCompat != null) {
            i10 = de.b.i.S0;
            TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(rootView, i10);
            if (textInputLayout != null) {
                i10 = de.b.i.T0;
                RecyclerView recyclerView = (RecyclerView) b4.c.a(rootView, i10);
                if (recyclerView != null) {
                    i10 = de.b.i.f272324r1;
                    ImageView imageView = (ImageView) b4.c.a(rootView, i10);
                    if (imageView != null && (viewA = b4.c.a(rootView, (i10 = de.b.i.f272415y1))) != null) {
                        i10 = de.b.i.f272249l8;
                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b4.c.a(rootView, i10);
                        if (linearProgressIndicator != null) {
                            return new e((ConstraintLayout) rootView, textInputEditTextCompat, textInputLayout, recyclerView, imageView, viewA, linearProgressIndicator);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272531e2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274793a;
    }
}
