package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f269904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f269905b;

    private v(@NonNull View view, @NonNull LinearProgressIndicator linearProgressIndicator) {
        this.f269904a = view;
        this.f269905b = linearProgressIndicator;
    }

    @NonNull
    public static v a(@NonNull View view) {
        int i10 = com.planner5d.library.contest.e.i.f151003q4;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b4.c.a(view, i10);
        if (linearProgressIndicator != null) {
            return new v(view, linearProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static v b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.planner5d.library.contest.e.l.K2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f269904a;
    }
}
