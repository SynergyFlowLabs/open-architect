package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class k extends androidx.appcompat.view.menu.c implements MenuItem {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f10730q = "MenuItemWrapper";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final l1.b f10731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Method f10732p;

    private class a extends androidx.core.view.b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.view.b.InterfaceC0412b f10733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ActionProvider f10734f;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f10734f = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f10734f.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public boolean c() {
            return this.f10734f.isVisible();
        }

        @Override // androidx.core.view.b
        @NonNull
        public View d() {
            return this.f10734f.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public View e(MenuItem menuItem) {
            return this.f10734f.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean f() {
            return this.f10734f.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void g(SubMenu subMenu) {
            this.f10734f.onPrepareSubMenu(k.this.f(subMenu));
        }

        @Override // androidx.core.view.b
        public boolean h() {
            return this.f10734f.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void i() {
            this.f10734f.refreshVisibility();
        }

        @Override // androidx.core.view.b
        public void l(androidx.core.view.b.InterfaceC0412b interfaceC0412b) {
            this.f10733e = interfaceC0412b;
            ActionProvider actionProvider = this.f10734f;
            if (interfaceC0412b == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            androidx.core.view.b.InterfaceC0412b interfaceC0412b = this.f10733e;
            if (interfaceC0412b != null) {
                interfaceC0412b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f10736a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f10736a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f10736a;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f10736a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f10736a.onActionViewExpanded();
        }
    }

    private class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f10737a;

        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f10737a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f10737a.onMenuItemActionCollapse(k.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f10737a.onMenuItemActionExpand(k.this.e(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f10739a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f10739a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f10739a.onMenuItemClick(k.this.e(menuItem));
        }
    }

    public k(Context context, l1.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f10731o = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f10731o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f10731o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b bVarA = this.f10731o.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f10734f;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f10731o.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f10731o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f10731o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f10731o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f10731o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f10731o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f10731o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f10731o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f10731o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f10731o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f10731o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f10731o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f10731o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f10731o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f10731o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f10731o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f10731o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f10731o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f10731o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f10731o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f10731o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f10731o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f10731o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f10731o.isVisible();
    }

    public void j(boolean z10) {
        try {
            if (this.f10732p == null) {
                this.f10732p = this.f10731o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f10732p.invoke(this.f10731o, Boolean.valueOf(z10));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f10636l, actionProvider);
        l1.b bVar = this.f10731o;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.c(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f10731o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f10731o.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f10731o.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f10731o.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f10731o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f10731o.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f10731o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10731o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10731o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f10731o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f10731o.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10731o.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10731o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f10731o.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f10731o.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f10731o.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f10731o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10731o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f10731o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f10731o.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10731o.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f10731o.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f10731o.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10731o.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f10731o.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f10731o.setActionView(i10);
        View actionView = this.f10731o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f10731o.setActionView(new b(actionView));
        }
        return this;
    }
}
