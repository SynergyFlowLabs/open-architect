package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.g1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f10507f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f10509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f10510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f10511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f10512e;

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f10512e == null) {
            Configuration configuration = this.f10511d;
            if (configuration == null || e(configuration)) {
                this.f10512e = super.getResources();
            } else {
                this.f10512e = createConfigurationContext(this.f10511d).getResources();
            }
        }
        return this.f10512e;
    }

    private void d() {
        boolean z10 = this.f10509b == null;
        if (z10) {
            this.f10509b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10509b.setTo(theme);
            }
        }
        f(this.f10509b, this.f10508a, z10);
    }

    @w0(26)
    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f10507f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f10507f = configuration2;
        }
        return configuration.equals(f10507f);
    }

    public void a(Configuration configuration) {
        if (this.f10512e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f10511d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f10511d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f10508a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10510c == null) {
            this.f10510c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10510c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f10509b;
        if (theme != null) {
            return theme;
        }
        if (this.f10508a == 0) {
            this.f10508a = i.a.l.f286314c4;
        }
        d();
        return this.f10509b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f10508a != i10) {
            this.f10508a = i10;
            d();
        }
    }

    public d(Context context, @g1 int i10) {
        super(context);
        this.f10508a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f10509b = theme;
    }
}
