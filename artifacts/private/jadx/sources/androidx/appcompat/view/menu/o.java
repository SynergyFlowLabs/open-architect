package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public interface o {

    public interface a {
        boolean d();

        void e(boolean z10, char c10);

        void g(j jVar, int i10);

        j getItemData();

        boolean h();

        void setCheckable(boolean z10);

        void setChecked(boolean z10);

        void setEnabled(boolean z10);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void a(g gVar);

    int getWindowAnimations();
}
