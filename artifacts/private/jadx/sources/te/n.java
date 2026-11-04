package te;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f380964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppCompatEditText f380965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f380966c;

    private n(@NonNull View view, @NonNull AppCompatEditText appCompatEditText, @NonNull View view2) {
        this.f380964a = view;
        this.f380965b = appCompatEditText;
        this.f380966c = view2;
    }

    @NonNull
    public static n a(@NonNull View view) {
        View viewA;
        int i10 = c1.i.f251776b2;
        AppCompatEditText appCompatEditText = (AppCompatEditText) b4.c.a(view, i10);
        if (appCompatEditText == null || (viewA = b4.c.a(view, (i10 = c1.i.f251788c2))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        return new n(view, appCompatEditText, viewA);
    }

    @NonNull
    public static n b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(c1.l.f252146d2, viewGroup);
        return a(viewGroup);
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f380964a;
    }
}
