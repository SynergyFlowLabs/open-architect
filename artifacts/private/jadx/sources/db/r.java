package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f269882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Group f269883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f269884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269885d;

    private r(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f269882a = constraintLayout;
        this.f269883b = group;
        this.f269884c = imageView;
        this.f269885d = textView;
    }

    @NonNull
    public static r a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f150852g3;
        Group group = (Group) b4.c.a(view, i10);
        if (group != null) {
            i10 = com.planner5d.library.contest.e.i.f150867h3;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.contest.e.i.f150882i3;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    return new r((ConstraintLayout) view, group, imageView, textView);
                }
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
        View viewInflate = layoutInflater.inflate(com.planner5d.library.contest.e.l.F2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // b4.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f269882a;
    }
}
