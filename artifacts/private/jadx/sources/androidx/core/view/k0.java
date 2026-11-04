package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    @androidx.annotation.w0(28)
    static class a {
        private a() {
        }

        static void a(Menu menu, boolean z10) {
            menu.setGroupDividerEnabled(z10);
        }
    }

    private k0() {
    }

    public static void a(@NonNull Menu menu, boolean z10) {
        if (menu instanceof l1.a) {
            ((l1.a) menu).setGroupDividerEnabled(z10);
        } else {
            a.a(menu, z10);
        }
    }

    @androidx.annotation.v0(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void b(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }
}
