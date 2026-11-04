package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f269860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f269861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f269862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f269863d;

    private o(@NonNull View view, @NonNull TextView textView, @NonNull View view2, @NonNull TextView textView2) {
        this.f269860a = view;
        this.f269861b = textView;
        this.f269862c = view2;
        this.f269863d = textView2;
    }

    @NonNull
    public static o a(@NonNull View view) {
        View viewA;
        int i10 = com.planner5d.library.contest.e.i.f150927l3;
        TextView textView = (TextView) b4.c.a(view, i10);
        if (textView != null && (viewA = b4.c.a(view, (i10 = com.planner5d.library.contest.e.i.f150942m3))) != null) {
            i10 = com.planner5d.library.contest.e.i.f150957n3;
            TextView textView2 = (TextView) b4.c.a(view, i10);
            if (textView2 != null) {
                return new o(view, textView, viewA, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static o b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.contest.e.l.D2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f269860a;
    }
}
