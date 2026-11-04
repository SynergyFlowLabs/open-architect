package x6;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f390615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f390616b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d0
    private int f390617c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f390615a = (View) bVar;
    }

    private void a() {
        ViewParent parent = this.f390615a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).j(this.f390615a);
        }
    }

    @d0
    public int b() {
        return this.f390617c;
    }

    public boolean c() {
        return this.f390616b;
    }

    public void d(@NonNull Bundle bundle) {
        this.f390616b = bundle.getBoolean("expanded", false);
        this.f390617c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f390616b) {
            a();
        }
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f390616b);
        bundle.putInt("expandedComponentIdHint", this.f390617c);
        return bundle;
    }

    public boolean f(boolean z10) {
        if (this.f390616b == z10) {
            return false;
        }
        this.f390616b = z10;
        a();
        return true;
    }

    public void g(@d0 int i10) {
        this.f390617c = i10;
    }
}
