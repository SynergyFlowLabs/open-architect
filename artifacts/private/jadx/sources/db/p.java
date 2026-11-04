package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.widget.ContestPlaceBadgeView;
import com.planner5d.library.widget.ProfileIconView;
import com.planner5d.library.widget.carousel.CarouselView;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f269864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CarouselView f269865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f269866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProfileIconView f269867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f269868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f269869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ContestPlaceBadgeView f269870g;

    private p(@NonNull View view, @NonNull CarouselView carouselView, @NonNull View view2, @NonNull ProfileIconView profileIconView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ContestPlaceBadgeView contestPlaceBadgeView) {
        this.f269864a = view;
        this.f269865b = carouselView;
        this.f269866c = view2;
        this.f269867d = profileIconView;
        this.f269868e = textView;
        this.f269869f = textView2;
        this.f269870g = contestPlaceBadgeView;
    }

    @NonNull
    public static p a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.contest.e.i.f150784ba;
        CarouselView carouselView = (CarouselView) b4.c.a(view, i10);
        if (carouselView != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.contest.e.i.f150845fb))) != null) {
            i10 = com.planner5d.library.contest.e.i.f151102wd;
            ProfileIconView profileIconView = (ProfileIconView) b4.c.a(view, i10);
            if (profileIconView != null) {
                i10 = com.planner5d.library.contest.e.i.f151117xd;
                TextView textView = (TextView) b4.c.a(view, i10);
                if (textView != null) {
                    i10 = com.planner5d.library.contest.e.i.f151132yd;
                    TextView textView2 = (TextView) b4.c.a(view, i10);
                    if (textView2 != null) {
                        i10 = com.planner5d.library.contest.e.i.f151147zd;
                        ContestPlaceBadgeView contestPlaceBadgeView = (ContestPlaceBadgeView) b4.c.a(view, i10);
                        if (contestPlaceBadgeView != null) {
                            return new p(view, carouselView, viewA, profileIconView, textView, textView2, contestPlaceBadgeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static p b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.contest.e.l.E2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f269864a;
    }
}
