package ie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f287133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f287134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f287135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f287136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f287137e;

    private e(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ButtonTextView buttonTextView, @NonNull EditText editText, @NonNull TextView textView) {
        this.f287133a = constraintLayout;
        this.f287134b = imageView;
        this.f287135c = buttonTextView;
        this.f287136d = editText;
        this.f287137e = textView;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i10 = he.b.j.W4;
        ImageView imageView = (ImageView) b4.c.a(view, i10);
        if (imageView != null) {
            i10 = he.b.j.f283072j5;
            ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
            if (buttonTextView != null) {
                i10 = he.b.j.f283367vb;
                EditText editText = (EditText) b4.c.a(view, i10);
                if (editText != null) {
                    i10 = he.b.j.rw;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        return new e((ConstraintLayout) view, imageView, buttonTextView, editText, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(he.b.m.f283558b1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f287133a;
    }
}
