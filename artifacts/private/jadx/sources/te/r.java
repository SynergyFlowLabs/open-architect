package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f380989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RadioButton f380990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f380991c;

    private r(@NonNull ConstraintLayout constraintLayout, @NonNull RadioButton radioButton, @NonNull TextView textView) {
        this.f380989a = constraintLayout;
        this.f380990b = radioButton;
        this.f380991c = textView;
    }

    @NonNull
    public static r a(@NonNull View view) {
        int i10 = c1.i.f251789c3;
        RadioButton radioButton = (RadioButton) b4.c.a(view, i10);
        if (radioButton != null) {
            i10 = c1.i.f251801d3;
            TextView textView = (TextView) b4.c.a(view, i10);
            if (textView != null) {
                return new r((ConstraintLayout) view, radioButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static r c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static r d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(c1.l.f252166i2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f380989a;
    }
}
