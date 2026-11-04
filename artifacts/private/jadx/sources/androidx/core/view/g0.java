package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f48749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f48750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f48751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f48752d;

    public interface a {
        boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent);
    }

    private g0() {
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f48749a) {
            try {
                f48750b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f48749a = true;
        }
        Method method = f48750b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (u1.z(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerF = f(dialog);
        if (onKeyListenerF != null && onKeyListenerF.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (u1.z(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean d(@NonNull View view, @NonNull KeyEvent keyEvent) {
        return u1.A(view, keyEvent);
    }

    @e.a({"LambdaLast"})
    public static boolean e(@NonNull a aVar, @androidx.annotation.p0 View view, @androidx.annotation.p0 Window.Callback callback, @NonNull KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return aVar.superDispatchKeyEvent(keyEvent);
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!f48751c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f48752d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f48751c = true;
        }
        Field field = f48752d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
