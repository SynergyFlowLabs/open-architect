package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(28)
final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d1 f18855a = new d1();

    private d1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Context context, TextClassification textClassification, MenuItem menuItem) throws PendingIntent.CanceledException {
        q0.f18920a.a(context, textClassification);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(RemoteAction remoteAction, MenuItem menuItem) throws PendingIntent.CanceledException {
        q0.f18920a.b(remoteAction.getActionIntent());
        return true;
    }

    public final void c(@NotNull Menu menu, int i10, @NotNull final Context context, @NotNull final TextClassification textClassification) {
        MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i10, textClassification.getLabel());
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(textClassification.getIcon());
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.b1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return d1.d(context, textClassification, menuItem);
            }
        });
    }

    public final void e(@NotNull Menu menu, int i10, @NotNull Context context, @NotNull TextClassification textClassification, int i11) {
        if (i11 < 0) {
            c(menu, i10, context, textClassification);
        } else {
            f(menu, i10, context, i11 == 0, textClassification.getActions().get(i11));
        }
    }

    public final void f(@NotNull Menu menu, int i10, @NotNull Context context, boolean z10, @NotNull final RemoteAction remoteAction) {
        int i11 = 0;
        MenuItem menuItemAdd = menu.add(R.id.textAssist, z10 ? 16908353 : 0, i10, remoteAction.getTitle());
        if (z10) {
            i11 = 2;
            int i12 = 7 >> 2;
        }
        menuItemAdd.setShowAsAction(i11);
        if (z10 || remoteAction.shouldShowIcon()) {
            menuItemAdd.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.c1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return d1.g(remoteAction, menuItem);
            }
        });
    }
}
