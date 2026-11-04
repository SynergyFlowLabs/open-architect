package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.core.view.f2;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public interface l0 {
    void A(int i10);

    int B();

    void C(View view);

    void D();

    void E(Drawable drawable);

    void F(CharSequence charSequence);

    void G(int i10);

    Menu H();

    f2 I(int i10, long j10);

    ViewGroup J();

    void K(boolean z10);

    void L(int i10);

    void M(z0 z0Var);

    boolean N();

    void O(int i10);

    void P(androidx.appcompat.view.menu.n.a aVar, androidx.appcompat.view.menu.g.a aVar2);

    void Q(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void R(SparseArray<Parcelable> sparseArray);

    CharSequence S();

    boolean a();

    void b(Drawable drawable);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g(Menu menu, androidx.appcompat.view.menu.n.a aVar);

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    void h();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    void m(int i10);

    void n(CharSequence charSequence);

    int o();

    void p(int i10);

    int q();

    void r(int i10);

    void s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setLogo(int i10);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    int t();

    void u(boolean z10);

    void v();

    View w();

    void x(Drawable drawable);

    void y(Drawable drawable);

    void z(SparseArray<Parcelable> sparseArray);
}
