package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48898a = "MenuItemCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f48899b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f48900c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f48901d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f48902e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f48903f = 8;

    class a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f48904a;

        a(c cVar) {
            this.f48904a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f48904a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f48904a.onMenuItemActionExpand(menuItem);
        }
    }

    @androidx.annotation.w0(26)
    static class b {
        private b() {
        }

        static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static MenuItem g(MenuItem menuItem, char c10, int i10) {
            return menuItem.setAlphabeticShortcut(c10, i10);
        }

        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem k(MenuItem menuItem, char c10, int i10) {
            return menuItem.setNumericShortcut(c10, i10);
        }

        static MenuItem l(MenuItem menuItem, char c10, char c11, int i10, int i11) {
            return menuItem.setShortcut(c10, c11, i10, i11);
        }

        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private p0() {
    }

    @androidx.annotation.v0(expression = "item.collapseActionView()")
    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @androidx.annotation.v0(expression = "item.expandActionView()")
    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @androidx.annotation.p0
    public static androidx.core.view.b c(@NonNull MenuItem menuItem) {
        if (menuItem instanceof l1.b) {
            return ((l1.b) menuItem).a();
        }
        return null;
    }

    @androidx.annotation.v0(expression = "item.getActionView()")
    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(@NonNull MenuItem menuItem) {
        return menuItem instanceof l1.b ? ((l1.b) menuItem).getAlphabeticModifiers() : b.a(menuItem);
    }

    @androidx.annotation.p0
    public static CharSequence f(@NonNull MenuItem menuItem) {
        return menuItem instanceof l1.b ? ((l1.b) menuItem).getContentDescription() : b.b(menuItem);
    }

    @androidx.annotation.p0
    public static ColorStateList g(@NonNull MenuItem menuItem) {
        return menuItem instanceof l1.b ? ((l1.b) menuItem).getIconTintList() : b.c(menuItem);
    }

    @androidx.annotation.p0
    public static PorterDuff.Mode h(@NonNull MenuItem menuItem) {
        return menuItem instanceof l1.b ? ((l1.b) menuItem).getIconTintMode() : b.d(menuItem);
    }

    public static int i(@NonNull MenuItem menuItem) {
        return menuItem instanceof l1.b ? ((l1.b) menuItem).getNumericModifiers() : b.e(menuItem);
    }

    @androidx.annotation.p0
    public static CharSequence j(@NonNull MenuItem menuItem) {
        return menuItem instanceof l1.b ? ((l1.b) menuItem).getTooltipText() : b.f(menuItem);
    }

    @androidx.annotation.v0(expression = "item.isActionViewExpanded()")
    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @androidx.annotation.p0
    public static MenuItem l(@NonNull MenuItem menuItem, @androidx.annotation.p0 androidx.core.view.b bVar) {
        if (menuItem instanceof l1.b) {
            menuItem = ((l1.b) menuItem).c(bVar);
        }
        return menuItem;
    }

    @androidx.annotation.v0(expression = "item.setActionView(resId)")
    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i10) {
        return menuItem.setActionView(i10);
    }

    @androidx.annotation.v0(expression = "item.setActionView(view)")
    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(@NonNull MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof l1.b) {
            ((l1.b) menuItem).setAlphabeticShortcut(c10, i10);
        } else {
            b.g(menuItem, c10, i10);
        }
    }

    public static void p(@NonNull MenuItem menuItem, @androidx.annotation.p0 CharSequence charSequence) {
        if (menuItem instanceof l1.b) {
            ((l1.b) menuItem).setContentDescription(charSequence);
        } else {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(@NonNull MenuItem menuItem, @androidx.annotation.p0 ColorStateList colorStateList) {
        if (menuItem instanceof l1.b) {
            ((l1.b) menuItem).setIconTintList(colorStateList);
        } else {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(@NonNull MenuItem menuItem, @androidx.annotation.p0 PorterDuff.Mode mode) {
        if (menuItem instanceof l1.b) {
            ((l1.b) menuItem).setIconTintMode(mode);
        } else {
            b.j(menuItem, mode);
        }
    }

    public static void s(@NonNull MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof l1.b) {
            ((l1.b) menuItem).setNumericShortcut(c10, i10);
        } else {
            b.k(menuItem, c10, i10);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(@NonNull MenuItem menuItem, char c10, char c11, int i10, int i11) {
        if (menuItem instanceof l1.b) {
            ((l1.b) menuItem).setShortcut(c10, c11, i10, i11);
        } else {
            b.l(menuItem, c10, c11, i10, i11);
        }
    }

    @androidx.annotation.v0(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void v(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }

    public static void w(@NonNull MenuItem menuItem, @androidx.annotation.p0 CharSequence charSequence) {
        if (menuItem instanceof l1.b) {
            ((l1.b) menuItem).setTooltipText(charSequence);
        } else {
            b.m(menuItem, charSequence);
        }
    }
}
