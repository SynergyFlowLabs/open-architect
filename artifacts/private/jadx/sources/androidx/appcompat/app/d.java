package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.g1;
import androidx.annotation.j0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.u1;
import androidx.core.app.p0;

/* JADX INFO: loaded from: classes.dex */
public class d extends androidx.fragment.app.s implements e, p0.a, androidx.appcompat.app.b.c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private h mDelegate;
    private Resources mResources;

    class a implements androidx.savedstate.j.b {
        a() {
        }

        @Override // androidx.savedstate.j.b
        @NonNull
        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.getDelegate().O(bundle);
            return bundle;
        }
    }

    class b implements androidx.activity.contextaware.d {
        b() {
        }

        @Override // androidx.activity.contextaware.d
        public void a(@NonNull Context context) {
            h delegate = d.this.getDelegate();
            delegate.E();
            delegate.K(d.this.getSavedStateRegistry().a(d.DELEGATE_TAG));
        }
    }

    public d() {
        C();
    }

    private void C() {
        getSavedStateRegistry().d(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private boolean D(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.l, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().f(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().m(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.m, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.K(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int i10 = 7 | 1;
        return true;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@d0 int i10) {
        return (T) getDelegate().s(i10);
    }

    @NonNull
    public h getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = h.n(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.b.c
    @androidx.annotation.p0
    public androidx.appcompat.app.b.InterfaceC0030b getDrawerToggleDelegate() {
        return getDelegate().w();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().z();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && u1.d()) {
            this.mResources = new u1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @androidx.annotation.p0
    public androidx.appcompat.app.a getSupportActionBar() {
        return getDelegate().C();
    }

    @Override // androidx.core.app.p0.a
    @androidx.annotation.p0
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.s.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().F();
    }

    @Override // androidx.activity.l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().J(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull p0 p0Var) {
        p0Var.i(this);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().L();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (D(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    protected void onLocalesChanged(@NonNull androidx.core.os.p pVar) {
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.o() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    protected void onNightModeChanged(int i10) {
    }

    @Override // androidx.activity.l, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().M(bundle);
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().N();
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull p0 p0Var) {
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().P();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().Q();
    }

    @Override // androidx.appcompat.app.e
    @androidx.annotation.i
    public void onSupportActionModeFinished(@NonNull androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    @androidx.annotation.i
    public void onSupportActionModeStarted(@NonNull androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        p0 p0VarM = p0.m(this);
        onCreateSupportNavigateUpTaskStack(p0VarM);
        onPrepareSupportNavigateUpTaskStack(p0VarM);
        p0VarM.w();
        try {
            androidx.core.app.b.D(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().h0(charSequence);
    }

    @Override // androidx.appcompat.app.e
    @androidx.annotation.p0
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(@NonNull androidx.appcompat.view.b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.L()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.l, android.app.Activity
    public void setContentView(@j0 int i10) {
        initializeViewTreeOwners();
        getDelegate().X(i10);
    }

    public void setSupportActionBar(@androidx.annotation.p0 Toolbar toolbar) {
        getDelegate().f0(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@g1 int i10) {
        super.setTheme(i10);
        getDelegate().g0(i10);
    }

    @androidx.annotation.p0
    public androidx.appcompat.view.b startSupportActionMode(@NonNull androidx.appcompat.view.b.a aVar) {
        return getDelegate().i0(aVar);
    }

    @Override // androidx.fragment.app.s
    public void supportInvalidateOptionsMenu() {
        getDelegate().F();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        androidx.core.app.s.g(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().T(i10);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return androidx.core.app.s.h(this, intent);
    }

    @androidx.annotation.o
    public d(@j0 int i10) {
        super(i10);
        C();
    }

    @Override // androidx.activity.l, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().Y(view);
    }

    @Override // androidx.activity.l, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().Z(view, layoutParams);
    }
}
