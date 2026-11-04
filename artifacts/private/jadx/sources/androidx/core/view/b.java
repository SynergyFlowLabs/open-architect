package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48609d = "ActionProvider(support)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f48611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0412b f48612c;

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0412b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(@NonNull Context context) {
        this.f48610a = context;
    }

    @NonNull
    public Context a() {
        return this.f48610a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    @NonNull
    public abstract View d();

    @NonNull
    public View e(@NonNull MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(@NonNull SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f48612c == null || !h()) {
            return;
        }
        this.f48612c.onActionProviderVisibilityChanged(c());
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f48612c = null;
        this.f48611b = null;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void k(@androidx.annotation.p0 a aVar) {
        this.f48611b = aVar;
    }

    public void l(@androidx.annotation.p0 InterfaceC0412b interfaceC0412b) {
        this.f48612c = interfaceC0412b;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z10) {
        a aVar = this.f48611b;
        if (aVar != null) {
            aVar.a(z10);
        }
    }
}
