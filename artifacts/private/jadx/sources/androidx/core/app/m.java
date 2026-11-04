package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.b1;
import androidx.collection.h3;
import androidx.lifecycle.k1;
import androidx.lifecycle.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class m extends Activity implements androidx.lifecycle.o0, androidx.core.view.g0.a {

    @NotNull
    private final h3<Class<? extends a>, a> extraDataMap = new h3<>(0, 1, null);

    @NotNull
    private final q0 lifecycleRegistry = new q0(this);

    @kotlin.l(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static class a {
    }

    private static /* synthetic */ void d() {
    }

    private static /* synthetic */ void e() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean f(java.lang.String[] r4) {
        /*
            r3 = this;
            r3 = 0
            if (r4 == 0) goto L5f
            int r0 = r4.length
            if (r0 != 0) goto L8
            r2 = 2
            goto L5f
        L8:
            r4 = r4[r3]
            int r0 = r4.hashCode()
            r1 = 1
            switch(r0) {
                case -645125871: goto L4c;
                case 100470631: goto L37;
                case 472614934: goto L2e;
                case 1159329357: goto L22;
                case 1455016274: goto L14;
                default: goto L12;
            }
        L12:
            r2 = 4
            goto L5f
        L14:
            java.lang.String r0 = "iastuoll-f"
            java.lang.String r0 = "--autofill"
            boolean r4 = r4.equals(r0)
            r2 = 2
            if (r4 != 0) goto L21
            r2 = 7
            goto L5f
        L21:
            return r1
        L22:
            java.lang.String r0 = "--contentcapture"
            r2 = 1
            boolean r4 = r4.equals(r0)
            r2 = 7
            if (r4 != 0) goto L2d
            goto L5f
        L2d:
            return r1
        L2e:
            java.lang.String r0 = "--list-dumpables"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L43
            goto L5f
        L37:
            java.lang.String r0 = "dplmu-pd-uabm-m"
            java.lang.String r0 = "--dump-dumpable"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L43
            r2 = 0
            goto L5f
        L43:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r0 = 33
            if (r4 < r0) goto L4b
            return r1
        L4b:
            return r3
        L4c:
            java.lang.String r0 = "rotao--ialnns"
            java.lang.String r0 = "--translation"
            boolean r4 = r4.equals(r0)
            r2 = 3
            if (r4 != 0) goto L58
            goto L5f
        L58:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r4 < r0) goto L5f
            return r1
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.m.f(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (androidx.core.view.g0.d(decorView, event)) {
            return true;
        }
        return androidx.core.view.g0.e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (androidx.core.view.g0.d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @kotlin.l(message = "Use {@link View#getTag(int)} with the window's decor view.")
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Nullable
    public <T extends a> T getExtraData(@NotNull Class<T> extraDataClass) {
        Intrinsics.checkNotNullParameter(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    @NotNull
    public androidx.lifecycle.c0 getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        k1.f52422b.d(this);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.lifecycleRegistry.v(androidx.lifecycle.c0.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    @kotlin.l(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void putExtraData(@NotNull a extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.extraDataMap.put((Class<? extends a>) extraData.getClass(), extraData);
    }

    protected final boolean shouldDumpInternalState(@Nullable String[] strArr) {
        return !f(strArr);
    }

    @Override // androidx.core.view.g0.a
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
