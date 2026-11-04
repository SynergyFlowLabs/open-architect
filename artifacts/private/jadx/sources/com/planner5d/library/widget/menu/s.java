package com.planner5d.library.widget.menu;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.services.utility.q2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class s extends PopupMenu implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f258376a;

    public s(Context context, View view, int i10, int i11, p pVar) {
        this(context, view, i10, i11, pVar, true);
    }

    public static /* synthetic */ boolean a(Context context, p pVar, View view, MenuItem menuItem) {
        if (context instanceof Activity) {
            pVar.a((Activity) context, menuItem);
            return true;
        }
        try {
            pVar.a((Activity) view.getContext(), menuItem);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public MenuItem b(Context context, int i10, int i11) {
        MenuItem menuItemFindItem = getMenu().findItem(i10);
        if (menuItemFindItem != null) {
            menuItemFindItem.setIcon(com.planner5d.library.widget.drawable.c.f254258a.a(context, i11, this.f258376a));
        }
        return menuItemFindItem;
    }

    @Override // com.planner5d.library.widget.menu.o
    public void showMenu(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        show();
    }

    public s(final Context context, final View view, int i10, int i11, final p pVar, boolean z10) {
        super(context, view);
        this.f258376a = Integer.valueOf(androidx.core.content.d.g(context, i11));
        if (z10) {
            try {
                Object objC = q2.c(this, PopupMenu.class, "mPopup");
                objC.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(objC, Boolean.TRUE);
            } catch (Throwable unused) {
            }
        }
        if (i10 > 0) {
            getMenuInflater().inflate(i10, getMenu());
        }
        setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.planner5d.library.widget.menu.r
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return s.a(context, pVar, view, menuItem);
            }
        });
    }
}
