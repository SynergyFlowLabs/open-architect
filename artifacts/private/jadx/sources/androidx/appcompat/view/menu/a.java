package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class a implements l1.b {
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 8;
    private static final int J = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f10611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f10612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f10613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f10614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f10615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Intent f10616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private char f10617r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private char f10619t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f10621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Context f10622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f10623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f10624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f10625z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10618s = 4096;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f10620u = 4096;
    private ColorStateList A = null;
    private PorterDuff.Mode B = null;
    private boolean C = false;
    private boolean D = false;
    private int E = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f10622w = context;
        this.f10611l = i11;
        this.f10612m = i10;
        this.f10613n = i13;
        this.f10614o = charSequence;
    }

    private void e() {
        Drawable drawable = this.f10621v;
        if (drawable != null && (this.C || this.D)) {
            Drawable drawableR = androidx.core.graphics.drawable.c.r(drawable);
            this.f10621v = drawableR;
            Drawable drawableMutate = drawableR.mutate();
            this.f10621v = drawableMutate;
            if (this.C) {
                androidx.core.graphics.drawable.c.o(drawableMutate, this.A);
            }
            if (this.D) {
                androidx.core.graphics.drawable.c.p(this.f10621v, this.B);
            }
        }
    }

    @Override // l1.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // l1.b
    public boolean b() {
        return true;
    }

    @Override // l1.b
    @NonNull
    public l1.b c(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // l1.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // l1.b
    public boolean d() {
        return false;
    }

    @Override // l1.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f10623x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f10616q;
        if (intent == null) {
            return false;
        }
        this.f10622w.startActivity(intent);
        return true;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l1.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // l1.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // l1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f10620u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f10619t;
    }

    @Override // l1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f10624y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f10612m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f10621v;
    }

    @Override // l1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override // l1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f10616q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f10611l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // l1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f10618s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f10617r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f10613n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f10614o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10615p;
        return charSequence != null ? charSequence : this.f10614o;
    }

    @Override // l1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f10625z;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public l1.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z10) {
        this.E = (z10 ? 4 : 0) | (this.E & (-5));
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.E & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.E & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.E & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.E & 8) == 0;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public l1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f10619t = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.E = (z10 ? 1 : 0) | (this.E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.E = (z10 ? 2 : 0) | (this.E & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.E = (z10 ? 16 : 0) | (this.E & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f10621v = drawable;
        e();
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@p0 ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f10616q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f10617r = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10623x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f10617r = c10;
        this.f10619t = Character.toLowerCase(c11);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f10614o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10615p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.E = (this.E & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10619t = Character.toLowerCase(c10);
        this.f10620u = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public l1.b setContentDescription(CharSequence charSequence) {
        this.f10624y = charSequence;
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f10617r = c10;
        this.f10618s = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f10614o = this.f10622w.getResources().getString(i10);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public l1.b setTooltipText(CharSequence charSequence) {
        this.f10625z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f10621v = androidx.core.content.d.l(this.f10622w, i10);
        e();
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10617r = c10;
        this.f10618s = KeyEvent.normalizeMetaState(i10);
        this.f10619t = Character.toLowerCase(c11);
        this.f10620u = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
