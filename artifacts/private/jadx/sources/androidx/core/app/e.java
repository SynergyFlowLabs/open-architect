package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f47011a = "android.activity.usage_time";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f47012b = "android.usage_time_packages";

    private static class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ActivityOptions f47013c;

        a(ActivityOptions activityOptions) {
            this.f47013c = activityOptions;
        }

        @Override // androidx.core.app.e
        public Rect a() {
            return d.a(this.f47013c);
        }

        @Override // androidx.core.app.e
        public void j(@NonNull PendingIntent pendingIntent) {
            c.c(this.f47013c, pendingIntent);
        }

        @Override // androidx.core.app.e
        @NonNull
        public e k(@androidx.annotation.p0 Rect rect) {
            return new a(d.b(this.f47013c, rect));
        }

        @Override // androidx.core.app.e
        @NonNull
        public e l(int i10) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                f.a(this.f47013c, i10);
                return this;
            }
            if (i11 >= 33) {
                C0375e.a(this.f47013c, i10 != 2);
            }
            return this;
        }

        @Override // androidx.core.app.e
        @NonNull
        public e m(boolean z10) {
            return Build.VERSION.SDK_INT < 34 ? this : new a(f.b(this.f47013c, z10));
        }

        @Override // androidx.core.app.e
        public Bundle n() {
            return this.f47013c.toBundle();
        }

        @Override // androidx.core.app.e
        public void o(@NonNull e eVar) {
            if (eVar instanceof a) {
                this.f47013c.update(((a) eVar).f47013c);
            }
        }
    }

    @w0(21)
    static class b {
        private b() {
        }

        static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @w0(23)
    static class c {
        private c() {
        }

        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeClipRevealAnimation(view, i10, i11, i12, i13);
        }

        static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @w0(24)
    static class d {
        private d() {
        }

        static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.e$e, reason: collision with other inner class name */
    @w0(33)
    static class C0375e {
        private C0375e() {
        }

        static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(z10);
        }
    }

    @w0(34)
    static class f {
        private f() {
        }

        static ActivityOptions a(ActivityOptions activityOptions, int i10) {
            return activityOptions.setPendingIntentBackgroundActivityStartMode(i10);
        }

        static ActivityOptions b(ActivityOptions activityOptions, boolean z10) {
            return activityOptions.setShareIdentityEnabled(z10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface g {
    }

    protected e() {
    }

    @NonNull
    public static e b() {
        return new a(c.a());
    }

    @NonNull
    public static e c(@NonNull View view, int i10, int i11, int i12, int i13) {
        return new a(c.b(view, i10, i11, i12, i13));
    }

    @NonNull
    public static e d(@NonNull Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    @NonNull
    public static e e(@NonNull View view, int i10, int i11, int i12, int i13) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13));
    }

    @NonNull
    public static e f(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        return new a(b.a(activity, view, str));
    }

    @NonNull
    public static e g(@NonNull Activity activity, @androidx.annotation.p0 androidx.core.util.p<View, String>... pVarArr) {
        Pair[] pairArr;
        if (pVarArr != null) {
            pairArr = new Pair[pVarArr.length];
            for (int i10 = 0; i10 < pVarArr.length; i10++) {
                androidx.core.util.p<View, String> pVar = pVarArr[i10];
                pairArr[i10] = Pair.create(pVar.f48411a, pVar.f48412b);
            }
        } else {
            pairArr = null;
        }
        return new a(b.b(activity, pairArr));
    }

    @NonNull
    public static e h() {
        return new a(b.c());
    }

    @NonNull
    public static e i(@NonNull View view, @NonNull Bitmap bitmap, int i10, int i11) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11));
    }

    @androidx.annotation.p0
    public Rect a() {
        return null;
    }

    public void j(@NonNull PendingIntent pendingIntent) {
    }

    @NonNull
    public e k(@androidx.annotation.p0 Rect rect) {
        return this;
    }

    @NonNull
    public e l(int i10) {
        return this;
    }

    @NonNull
    public e m(boolean z10) {
        return this;
    }

    @androidx.annotation.p0
    public Bundle n() {
        return null;
    }

    public void o(@NonNull e eVar) {
    }
}
