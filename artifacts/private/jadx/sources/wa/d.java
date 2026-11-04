package wa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f385961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f385962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f385963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Guideline f385964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f385965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f385966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f385967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f385968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f385969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f385970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f385971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final EditText f385972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final RecyclerView f385973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ScrollView f385974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f385975o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final TextView f385976s;

    private d(@NonNull View view, @NonNull Guideline guideline, @NonNull FrameLayout frameLayout, @NonNull Guideline guideline2, @NonNull Guideline guideline3, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull View view2, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull EditText editText, @NonNull RecyclerView recyclerView, @NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2) {
        this.f385961a = view;
        this.f385962b = guideline;
        this.f385963c = frameLayout;
        this.f385964d = guideline2;
        this.f385965e = guideline3;
        this.f385966f = imageView;
        this.f385967g = constraintLayout;
        this.f385968h = coordinatorLayout;
        this.f385969i = view2;
        this.f385970j = imageView2;
        this.f385971k = textView;
        this.f385972l = editText;
        this.f385973m = recyclerView;
        this.f385974n = scrollView;
        this.f385975o = linearLayout;
        this.f385976s = textView2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        int i10 = sa.b.i.f369355q1;
        Guideline guideline = (Guideline) b4.c.a(view, i10);
        if (guideline != null) {
            i10 = sa.b.i.f369368r1;
            FrameLayout frameLayout = (FrameLayout) b4.c.a(view, i10);
            if (frameLayout != null) {
                i10 = sa.b.i.f369381s1;
                Guideline guideline2 = (Guideline) b4.c.a(view, i10);
                if (guideline2 != null) {
                    i10 = sa.b.i.f369394t1;
                    Guideline guideline3 = (Guideline) b4.c.a(view, i10);
                    if (guideline3 != null) {
                        i10 = sa.b.i.f369447x2;
                        ImageView imageView = (ImageView) b4.c.a(view, i10);
                        if (imageView != null) {
                            i10 = sa.b.i.f369345p4;
                            ConstraintLayout constraintLayout = (ConstraintLayout) b4.c.a(view, i10);
                            if (constraintLayout != null) {
                                i10 = sa.b.i.f369358q4;
                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) b4.c.a(view, i10);
                                if (coordinatorLayout != null && (viewA = b4.c.a(view, (i10 = sa.b.i.f369371r4))) != null) {
                                    i10 = sa.b.i.f369384s4;
                                    ImageView imageView2 = (ImageView) b4.c.a(view, i10);
                                    if (imageView2 != null) {
                                        i10 = sa.b.i.f369397t4;
                                        TextView textView = (TextView) b4.c.a(view, i10);
                                        if (textView != null) {
                                            i10 = sa.b.i.f369438w6;
                                            EditText editText = (EditText) b4.c.a(view, i10);
                                            if (editText != null) {
                                                i10 = sa.b.i.f369451x6;
                                                RecyclerView recyclerView = (RecyclerView) b4.c.a(view, i10);
                                                if (recyclerView != null) {
                                                    i10 = sa.b.i.f369429va;
                                                    ScrollView scrollView = (ScrollView) b4.c.a(view, i10);
                                                    if (scrollView != null) {
                                                        i10 = sa.b.i.f369442wa;
                                                        LinearLayout linearLayout = (LinearLayout) b4.c.a(view, i10);
                                                        if (linearLayout != null) {
                                                            i10 = sa.b.i.f369189db;
                                                            TextView textView2 = (TextView) b4.c.a(view, i10);
                                                            if (textView2 != null) {
                                                                return new d(view, guideline, frameLayout, guideline2, guideline3, imageView, constraintLayout, coordinatorLayout, viewA, imageView2, textView, editText, recyclerView, scrollView, linearLayout, textView2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static d b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(sa.b.l.f369626s2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f385961a;
    }
}
