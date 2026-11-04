package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b extends androidx.core.content.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static j f46951g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f46952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f46953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f46954c;

        a(String[] strArr, Activity activity, int i10) {
            this.f46952a = strArr;
            this.f46953b = activity;
            this.f46954c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f46952a.length];
            PackageManager packageManager = this.f46953b.getPackageManager();
            String packageName = this.f46953b.getPackageName();
            int length = this.f46952a.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f46952a[i10], packageName);
            }
            ((i) this.f46953b).onRequestPermissionsResult(this.f46954c, this.f46952a, iArr);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    @w0(21)
    static class C0374b {
        private C0374b() {
        }

        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @w0(22)
    static class c {
        private c() {
        }

        static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    @w0(23)
    static class d {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @w0(28)
    static class e {
        private e() {
        }

        static <T> T a(Activity activity, int i10) {
            return (T) activity.requireViewById(i10);
        }
    }

    @w0(30)
    static class f {
        private f() {
        }

        static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        static void b(@NonNull Activity activity, @androidx.annotation.p0 androidx.core.content.c0 c0Var, @androidx.annotation.p0 Bundle bundle) {
            activity.setLocusContext(c0Var == null ? null : c0Var.c(), bundle);
        }
    }

    @w0(31)
    static class g {
        private g() {
        }

        static boolean a(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @e.a({"BanUncheckedReflection"})
        static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    @w0(32)
    static class h {
        private h() {
        }

        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface i {
        void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    public interface j {
        boolean a(@NonNull Activity activity, @androidx.annotation.g0(from = 0) int i10, int i11, @androidx.annotation.p0 Intent intent);

        boolean b(@NonNull Activity activity, @NonNull String[] strArr, @androidx.annotation.g0(from = 0) int i10);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public interface k {
        void validateRequestPermissionsRequestCode(int i10);
    }

    @w0(21)
    static class l extends SharedElementCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f46955a;

        l(o0 o0Var) {
            this.f46955a = o0Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f46955a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f46955a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f46955a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f46955a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f46955a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f46955a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @w0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f46955a.h(list, list2, new o0.a() { // from class: androidx.core.app.c
                @Override // androidx.core.app.o0.a
                public final void onSharedElementsReady() {
                    b.d.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    protected b() {
    }

    public static /* synthetic */ void C(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.f.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void D(@NonNull Activity activity) {
        activity.finishAffinity();
    }

    public static void E(@NonNull Activity activity) {
        C0374b.a(activity);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public static j F() {
        return f46951g;
    }

    @androidx.annotation.p0
    public static Uri G(@NonNull Activity activity) {
        return c.a(activity);
    }

    @Deprecated
    public static boolean H(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean I(@NonNull Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return g.a(activity);
        }
        if (i10 == 30) {
            return (f.a(activity) == null || f.a(activity).getDisplayId() == 0) ? false : true;
        }
        return (i10 != 29 || activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
    }

    public static void J(@NonNull Activity activity) {
        C0374b.b(activity);
    }

    public static void K(@NonNull Activity activity) {
        activity.recreate();
    }

    @androidx.annotation.p0
    public static androidx.core.view.z L(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        return androidx.core.view.z.b(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(@NonNull Activity activity, @NonNull String[] strArr, @androidx.annotation.g0(from = 0) int i10) {
        j jVar = f46951g;
        if (jVar == null || !jVar.b(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (TextUtils.isEmpty(strArr[i11])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (activity instanceof k) {
                ((k) activity).validateRequestPermissionsRequestCode(i10);
            }
            d.b(activity, strArr, i10);
        }
    }

    @NonNull
    public static <T extends View> T N(@NonNull Activity activity, @androidx.annotation.d0 int i10) {
        return (T) e.a(activity, i10);
    }

    public static void O(@NonNull Activity activity, @androidx.annotation.p0 o0 o0Var) {
        C0374b.c(activity, o0Var != null ? new l(o0Var) : null);
    }

    public static void P(@NonNull Activity activity, @androidx.annotation.p0 o0 o0Var) {
        C0374b.d(activity, o0Var != null ? new l(o0Var) : null);
    }

    public static void Q(@NonNull Activity activity, @androidx.annotation.p0 androidx.core.content.c0 c0Var, @androidx.annotation.p0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            f.b(activity, c0Var, bundle);
        }
    }

    public static void R(@androidx.annotation.p0 j jVar) {
        f46951g = jVar;
    }

    public static boolean S(@NonNull Activity activity, @NonNull String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i10 >= 32) {
            return h.a(activity, str);
        }
        return i10 == 31 ? g.b(activity, str) : d.c(activity, str);
    }

    public static void T(@NonNull Activity activity, @NonNull Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    public static void U(@NonNull Activity activity, @NonNull IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void V(@NonNull Activity activity) {
        C0374b.e(activity);
    }
}
