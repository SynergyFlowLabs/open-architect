package com.planner5d.library.services;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.g3;
import androidx.core.view.u1;
import com.planner5d.library.application.t5;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f224951a = new s();

    private s() {
    }

    private final androidx.core.graphics.j a(View view) {
        g3 g3VarB = b(view);
        if (g3VarB != null) {
            return g3VarB.f(g3.m.d());
        }
        return null;
    }

    private final boolean d(Context context) {
        if (Build.VERSION.SDK_INT <= 30) {
            try {
                Object systemService = context.getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager == null) {
                    return false;
                }
                Method method = inputMethodManager.getClass().getMethod("getInputMethodWindowVisibleHeight", null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(inputMethodManager, null);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) objInvoke).intValue() > 0;
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
        }
        return false;
    }

    @oj.n
    public static final void e(@Nullable Activity activity, boolean z10) {
        f(activity != null ? activity.getCurrentFocus() : null, z10);
    }

    @oj.n
    public static final void f(@Nullable View view, boolean z10) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) androidx.core.content.d.s(view.getContext(), InputMethodManager.class)) != null) {
            if (z10) {
                inputMethodManager.showSoftInput(view, 0);
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Nullable
    public final g3 b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        g3 g3VarR0 = u1.r0(view);
        if (g3VarR0 == null) {
            t5.f148278a.a(view).d().b("keyboard_insets_missing", null, new Exception("Keyboard insets missing"));
        }
        return g3VarR0;
    }

    public final boolean c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        g3 g3VarB = b(view);
        if (g3VarB == null || !g3VarB.C(g3.m.d())) {
            androidx.core.graphics.j jVarA = a(view);
            if ((jVarA != null ? jVarA.f47826d : 0) <= 0) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (!d(context)) {
                    return false;
                }
            }
        }
        return true;
    }
}
