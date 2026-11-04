package l1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public interface b extends MenuItem {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f316131g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f316132h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f316133i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f316134j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f316135k = 8;

    @p0
    androidx.core.view.b a();

    boolean b();

    @NonNull
    b c(@p0 androidx.core.view.b bVar);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @p0
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @p0
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @p0
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @p0
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @p0
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(int i10);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(@p0 View view);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    @NonNull
    b setContentDescription(@p0 CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(@p0 ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(@p0 PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    @Override // android.view.MenuItem
    void setShowAsAction(int i10);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShowAsActionFlags(int i10);

    @Override // android.view.MenuItem
    @NonNull
    b setTooltipText(@p0 CharSequence charSequence);
}
