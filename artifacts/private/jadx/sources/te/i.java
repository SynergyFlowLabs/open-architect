package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import com.planner5d.library.widget.AppBarLayout;
import com.planner5d.library.widget.CollapsingToolbarLayout;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f380934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f380935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Toolbar f380936d;

    private i(@NonNull View view, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull Toolbar toolbar) {
        this.f380933a = view;
        this.f380934b = appBarLayout;
        this.f380935c = collapsingToolbarLayout;
        this.f380936d = toolbar;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = c1.i.W0;
        AppBarLayout appBarLayout = (AppBarLayout) b4.c.a(view, i10);
        if (appBarLayout != null) {
            i10 = c1.i.f251764a2;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) b4.c.a(view, i10);
            if (collapsingToolbarLayout != null) {
                i10 = c1.i.f252029w9;
                Toolbar toolbar = (Toolbar) b4.c.a(view, i10);
                if (toolbar != null) {
                    return new i(view, appBarLayout, collapsingToolbarLayout, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252184n0, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380933a;
    }
}
