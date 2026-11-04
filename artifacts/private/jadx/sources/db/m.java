package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.contest.view.archive.ContestActiveView;
import com.planner5d.library.widget.textview.ButtonTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ContestActiveView f269843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ButtonTextView f269844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f269845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f269847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f269848f;

    private m(@NonNull ContestActiveView contestActiveView, @NonNull ButtonTextView buttonTextView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f269843a = contestActiveView;
        this.f269844b = buttonTextView;
        this.f269845c = constraintLayout;
        this.f269846d = textView;
        this.f269847e = textView2;
        this.f269848f = textView3;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150792c3;
        ButtonTextView buttonTextView = (ButtonTextView) b4.c.a(view, i10);
        if (buttonTextView != null) {
            i10 = com.planner5d.library.contest.e.i.f150912k3;
            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
            if (constraintLayout != null) {
                i10 = com.planner5d.library.contest.e.i.f150972o3;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.contest.e.i.f151032s3;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.contest.e.i.H3;
                        TextView textView3 = (TextView) b4.c.a(view, i10);
                        if (textView3 != null) {
                            return new m((ContestActiveView) view, buttonTextView, constraintLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static m c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static m d(@NonNull LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.B2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ContestActiveView getRoot() {
        return this.f269843a;
    }
}
