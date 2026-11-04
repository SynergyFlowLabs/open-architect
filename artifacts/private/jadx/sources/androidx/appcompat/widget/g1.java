package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class g1 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f11315c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<g1>> f11316d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f11317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f11318b;

    private g1(@NonNull Context context) {
        super(context);
        if (!u1.d()) {
            this.f11317a = new i1(this, context.getResources());
            this.f11318b = null;
            return;
        }
        u1 u1Var = new u1(this, context.getResources());
        this.f11317a = u1Var;
        Resources.Theme themeNewTheme = u1Var.newTheme();
        this.f11318b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(@NonNull Context context) {
        return ((context instanceof g1) || (context.getResources() instanceof i1) || (context.getResources() instanceof u1) || !u1.d()) ? false : true;
    }

    public static Context b(@NonNull Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f11315c) {
            try {
                ArrayList<WeakReference<g1>> arrayList = f11316d;
                if (arrayList == null) {
                    f11316d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<g1> weakReference = f11316d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f11316d.remove(size);
                        }
                    }
                    for (int size2 = f11316d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<g1> weakReference2 = f11316d.get(size2);
                        g1 g1Var = weakReference2 != null ? weakReference2.get() : null;
                        if (g1Var != null && g1Var.getBaseContext() == context) {
                            return g1Var;
                        }
                    }
                }
                g1 g1Var2 = new g1(context);
                f11316d.add(new WeakReference<>(g1Var2));
                return g1Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f11317a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f11317a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11318b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f11318b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
