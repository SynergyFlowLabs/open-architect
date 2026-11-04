package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public interface k0 {
    boolean a();

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    void g(Menu menu, androidx.appcompat.view.menu.n.a aVar);

    CharSequence getTitle();

    void h();

    boolean i();

    boolean j();

    void k(SparseArray<Parcelable> sparseArray);

    void n(SparseArray<Parcelable> sparseArray);

    void p(int i10);

    void r();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setLogo(int i10);

    void setUiOptions(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
