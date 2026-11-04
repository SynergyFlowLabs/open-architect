package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f75521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f75522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f75523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f75524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f75525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f75526f;

    public c0(@NonNull ViewGroup viewGroup) {
        this.f75522b = -1;
        this.f75523c = viewGroup;
    }

    @androidx.annotation.p0
    public static c0 c(@NonNull ViewGroup viewGroup) {
        return (c0) viewGroup.getTag(a0.a.f75499g);
    }

    @NonNull
    public static c0 d(@NonNull ViewGroup viewGroup, @androidx.annotation.j0 int i10, @NonNull Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(a0.a.f75504l);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(a0.a.f75504l, sparseArray);
        }
        c0 c0Var = (c0) sparseArray.get(i10);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(viewGroup, i10, context);
        sparseArray.put(i10, c0Var2);
        return c0Var2;
    }

    static void g(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 c0 c0Var) {
        viewGroup.setTag(a0.a.f75499g, c0Var);
    }

    public void a() {
        if (this.f75522b > 0 || this.f75524d != null) {
            e().removeAllViews();
            if (this.f75522b > 0) {
                LayoutInflater.from(this.f75521a).inflate(this.f75522b, this.f75523c);
            } else {
                this.f75523c.addView(this.f75524d);
            }
        }
        Runnable runnable = this.f75525e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f75523c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f75523c) != this || (runnable = this.f75526f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup e() {
        return this.f75523c;
    }

    boolean f() {
        return this.f75522b > 0;
    }

    public void h(@androidx.annotation.p0 Runnable runnable) {
        this.f75525e = runnable;
    }

    public void i(@androidx.annotation.p0 Runnable runnable) {
        this.f75526f = runnable;
    }

    private c0(ViewGroup viewGroup, int i10, Context context) {
        this.f75521a = context;
        this.f75523c = viewGroup;
        this.f75522b = i10;
    }

    public c0(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f75522b = -1;
        this.f75523c = viewGroup;
        this.f75524d = view;
    }
}
