package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.widget.ProfileIconView;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f269895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f269896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f269897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f269898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f269899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f269900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f269901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f269902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f269903i;

    private u(@NonNull View view, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull View view2, @NonNull ImageView imageView, @NonNull ProfileIconView profileIconView, @NonNull View view3, @NonNull View view4, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f269895a = view;
        this.f269896b = circularProgressIndicator;
        this.f269897c = view2;
        this.f269898d = imageView;
        this.f269899e = profileIconView;
        this.f269900f = view3;
        this.f269901g = view4;
        this.f269902h = textView;
        this.f269903i = textView2;
    }

    @NonNull
    public static u a(@NonNull View view) {
        View viewA;
        View viewA2;
        View viewA3;
        int i10 = com.planner5d.library.contest.e.i.f150955n1;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b4.c.a(view, i10);
        if (circularProgressIndicator != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.contest.e.i.f151120y1))) != null) {
            i10 = com.planner5d.library.contest.e.i.f150975o6;
            ImageView imageView = (ImageView) b4.c.a(view, i10);
            if (imageView != null) {
                i10 = com.planner5d.library.contest.e.i.f150990p6;
                ProfileIconView profileIconView = (ProfileIconView) b4.c.a(view, i10);
                if (profileIconView != null && (viewA2 = b4.c.a(view, (i10 = com.planner5d.library.contest.e.i.f151084va))) != null && (viewA3 = b4.c.a(view, (i10 = com.planner5d.library.contest.e.i.f151099wa))) != null) {
                    i10 = com.planner5d.library.contest.e.i.Cd;
                    TextView textView = (TextView) b4.c.a(view, i10);
                    if (textView != null) {
                        i10 = com.planner5d.library.contest.e.i.Dd;
                        TextView textView2 = (TextView) b4.c.a(view, i10);
                        if (textView2 != null) {
                            return new u(view, circularProgressIndicator, viewA, imageView, profileIconView, viewA2, viewA3, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static u b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.contest.e.l.J2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f269895a;
    }
}
