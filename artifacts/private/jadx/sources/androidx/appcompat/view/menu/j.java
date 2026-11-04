package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class j implements l1.b {
    private static final String Q = "MenuItemImpl";
    private static final int R = 3;
    private static final int S = 1;
    private static final int T = 2;
    private static final int U = 4;
    private static final int V = 8;
    private static final int W = 16;
    private static final int X = 32;
    static final int Y = 0;
    private Runnable A;
    private MenuItem.OnMenuItemClickListener B;
    private CharSequence C;
    private CharSequence D;
    private int K;
    private View L;
    private androidx.core.view.b M;
    private MenuItem.OnActionExpandListener N;
    private ContextMenu.ContextMenuInfo P;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f10714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f10715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f10716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f10717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f10718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f10719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Intent f10720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private char f10721s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private char f10723u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f10725w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    g f10727y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private s f10728z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10722t = 4096;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f10724v = 4096;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f10726x = 0;
    private ColorStateList E = null;
    private PorterDuff.Mode F = null;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private int J = 16;
    private boolean O = false;

    class a implements androidx.core.view.b.InterfaceC0412b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0412b
        public void onActionProviderVisibilityChanged(boolean z10) {
            j jVar = j.this;
            jVar.f10727y.N(jVar);
        }
    }

    j(g gVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f10727y = gVar;
        this.f10714l = i11;
        this.f10715m = i10;
        this.f10716n = i12;
        this.f10717o = i13;
        this.f10718p = charSequence;
        this.K = i14;
    }

    private static void f(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = androidx.core.graphics.drawable.c.r(drawable).mutate();
            if (this.G) {
                androidx.core.graphics.drawable.c.o(drawable, this.E);
            }
            if (this.H) {
                androidx.core.graphics.drawable.c.p(drawable, this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    public void A(s sVar) {
        this.f10728z = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    boolean B(boolean z10) {
        int i10 = this.J;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.J = i11;
        return i10 != i11;
    }

    public boolean C() {
        return this.f10727y.D();
    }

    boolean D() {
        return this.f10727y.L() && j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    @Override // l1.b
    public androidx.core.view.b a() {
        return this.M;
    }

    @Override // l1.b
    public boolean b() {
        return (this.K & 2) == 2;
    }

    @Override // l1.b
    @NonNull
    public l1.b c(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.L = null;
        this.M = bVar;
        this.f10727y.O(true);
        androidx.core.view.b bVar3 = this.M;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f10727y.g(this);
        }
        return false;
    }

    @Override // l1.b
    public boolean d() {
        return (b() || q()) ? false : true;
    }

    public void e() {
        this.f10727y.M(this);
    }

    @Override // l1.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f10727y.n(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // l1.b, android.view.MenuItem
    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        View viewE = bVar.e(this);
        this.L = viewE;
        return viewE;
    }

    @Override // l1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f10724v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f10723u;
    }

    @Override // l1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f10715m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f10725w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f10726x == 0) {
            return null;
        }
        Drawable drawableB = j.a.b(this.f10727y.x(), this.f10726x);
        this.f10726x = 0;
        this.f10725w = drawableB;
        return g(drawableB);
    }

    @Override // l1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override // l1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f10720r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f10714l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override // l1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f10722t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f10721s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f10716n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f10728z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f10718p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10719q;
        return charSequence != null ? charSequence : this.f10718p;
    }

    @Override // l1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    Runnable h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f10728z != null;
    }

    public int i() {
        return this.f10717o;
    }

    @Override // l1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.J & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.J & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.M;
        if (bVar == null || !bVar.h()) {
            return (this.J & 8) == 0;
        }
        return (this.J & 8) == 0 && this.M.c();
    }

    char j() {
        return this.f10727y.K() ? this.f10723u : this.f10721s;
    }

    String k() {
        char cJ = j();
        if (cJ == 0) {
            return "";
        }
        Resources resources = this.f10727y.x().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f10727y.x()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(i.a.k.f286286r));
        }
        int i10 = this.f10727y.K() ? this.f10724v : this.f10722t;
        f(sb2, i10, 65536, resources.getString(i.a.k.f286282n));
        f(sb2, i10, 4096, resources.getString(i.a.k.f286278j));
        f(sb2, i10, 2, resources.getString(i.a.k.f286277i));
        f(sb2, i10, 1, resources.getString(i.a.k.f286283o));
        f(sb2, i10, 4, resources.getString(i.a.k.f286285q));
        f(sb2, i10, 8, resources.getString(i.a.k.f286281m));
        if (cJ == '\b') {
            sb2.append(resources.getString(i.a.k.f286279k));
        } else if (cJ == '\n') {
            sb2.append(resources.getString(i.a.k.f286280l));
        } else if (cJ != ' ') {
            sb2.append(cJ);
        } else {
            sb2.append(resources.getString(i.a.k.f286284p));
        }
        return sb2.toString();
    }

    CharSequence l(o.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    public boolean m() {
        androidx.core.view.b bVar;
        if ((this.K & 8) != 0) {
            if (this.L == null && (bVar = this.M) != null) {
                this.L = bVar.e(this);
            }
            if (this.L != null) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f10727y;
        if (gVar.i(gVar, this)) {
            return true;
        }
        Runnable runnable = this.A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f10720r != null) {
            try {
                this.f10727y.x().startActivity(this.f10720r);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        androidx.core.view.b bVar = this.M;
        return bVar != null && bVar.f();
    }

    public boolean o() {
        return (this.J & 32) == 32;
    }

    public boolean p() {
        return (this.J & 4) != 0;
    }

    public boolean q() {
        return (this.K & 1) == 1;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public l1.b setActionView(int i10) {
        Context contextX = this.f10727y.x();
        setActionView(LayoutInflater.from(contextX).inflate(i10, (ViewGroup) new LinearLayout(contextX), false));
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public l1.b setActionView(View view) {
        int i10;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (i10 = this.f10714l) > 0) {
            view.setId(i10);
        }
        this.f10727y.M(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f10723u == c10) {
            return this;
        }
        this.f10723u = Character.toLowerCase(c10);
        this.f10727y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.J;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.J = i11;
        if (i10 != i11) {
            this.f10727y.O(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.J & 4) != 0) {
            this.f10727y.b0(this);
            return this;
        }
        v(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.J |= 16;
        } else {
            this.J &= -17;
        }
        this.f10727y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f10726x = 0;
        this.f10725w = drawable;
        this.I = true;
        this.f10727y.O(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@p0 ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.f10727y.O(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.f10727y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f10720r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f10721s == c10) {
            return this;
        }
        this.f10721s = c10;
        this.f10727y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f10721s = c10;
        this.f10723u = Character.toLowerCase(c11);
        this.f10727y.O(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = i10;
        this.f10727y.M(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f10718p = charSequence;
        this.f10727y.O(false);
        s sVar = this.f10728z;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10719q = charSequence;
        this.f10727y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (B(z10)) {
            this.f10727y.N(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.O = z10;
        this.f10727y.O(false);
    }

    public String toString() {
        CharSequence charSequence = this.f10718p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    void v(boolean z10) {
        int i10 = this.J;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.J = i11;
        if (i10 != i11) {
            this.f10727y.O(false);
        }
    }

    public void w(boolean z10) {
        this.J = (z10 ? 4 : 0) | (this.J & (-5));
    }

    public void x(boolean z10) {
        if (z10) {
            this.J |= 32;
        } else {
            this.J &= -33;
        }
    }

    void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public l1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public l1.b setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.f10727y.O(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public l1.b setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.f10727y.O(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f10723u == c10 && this.f10724v == i10) {
            return this;
        }
        this.f10723u = Character.toLowerCase(c10);
        this.f10724v = KeyEvent.normalizeMetaState(i10);
        this.f10727y.O(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f10721s == c10 && this.f10722t == i10) {
            return this;
        }
        this.f10721s = c10;
        this.f10722t = KeyEvent.normalizeMetaState(i10);
        this.f10727y.O(false);
        return this;
    }

    @Override // l1.b, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10721s = c10;
        this.f10722t = KeyEvent.normalizeMetaState(i10);
        this.f10723u = Character.toLowerCase(c11);
        this.f10724v = KeyEvent.normalizeMetaState(i11);
        this.f10727y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f10725w = null;
        this.f10726x = i10;
        this.I = true;
        this.f10727y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f10727y.x().getString(i10));
    }
}
