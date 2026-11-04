package ee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.widget.TextInputEditTextCompat;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f274800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputEditTextCompat f274801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f274802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f274803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f274804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f274805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f274806g;

    private f(@NonNull ConstraintLayout rootView, @NonNull TextInputEditTextCompat addressInput, @NonNull TextInputLayout addressInputLayout, @NonNull View inputCover, @NonNull TextView skip, @NonNull TextView subtitle, @NonNull TextView title) {
        this.f274800a = rootView;
        this.f274801b = addressInput;
        this.f274802c = addressInputLayout;
        this.f274803d = inputCover;
        this.f274804e = skip;
        this.f274805f = subtitle;
        this.f274806g = title;
    }

    @NonNull
    public static f a(@NonNull View rootView) {
        View viewA;
        int i10 = de.b.i.R0;
        TextInputEditTextCompat textInputEditTextCompat = (TextInputEditTextCompat) b4.c.a(rootView, i10);
        if (textInputEditTextCompat != null) {
            i10 = de.b.i.S0;
            TextInputLayout textInputLayout = (TextInputLayout) b4.c.a(rootView, i10);
            if (textInputLayout != null && (viewA = b4.c.a(rootView, (i10 = de.b.i.X4))) != null) {
                i10 = de.b.i.f272264m9;
                TextView textView = (TextView) b4.c.a(rootView, i10);
                if (textView != null) {
                    i10 = de.b.i.f272167fa;
                    TextView textView2 = (TextView) b4.c.a(rootView, i10);
                    if (textView2 != null) {
                        i10 = de.b.i.Xa;
                        TextView textView3 = (TextView) b4.c.a(rootView, i10);
                        if (textView3 != null) {
                            return new f((ConstraintLayout) rootView, textInputEditTextCompat, textInputLayout, viewA, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater inflater, @p0 ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(de.b.l.f272536f2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f274800a;
    }
}
