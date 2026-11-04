package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public interface n {

    public interface a {
        void b(@NonNull g gVar, boolean z10);

        boolean c(@NonNull g gVar);
    }

    void b(g gVar, boolean z10);

    boolean c(g gVar, j jVar);

    Parcelable e();

    void f(boolean z10);

    boolean g();

    int getId();

    boolean h(g gVar, j jVar);

    void i(Context context, g gVar);

    void j(a aVar);

    void l(Parcelable parcelable);

    boolean m(s sVar);

    o n(ViewGroup viewGroup);
}
