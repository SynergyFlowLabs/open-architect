package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47493a = "android.intent.action.CREATE_REMINDER";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f47494b = "android.intent.extra.HTML_TEXT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f47495c = "android.intent.extra.START_PLAYBACK";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47496d = "android.intent.extra.TIME";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f47497e = "android.intent.category.LEANBACK_LAUNCHER";

    @w0(33)
    static class a {
        private a() {
        }

        static <T> T[] a(@NonNull Intent intent, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        static <T> ArrayList<T> b(@NonNull Intent intent, @androidx.annotation.p0 String str, @NonNull Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        static <T> T c(@NonNull Intent intent, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        static <T extends Serializable> T d(@NonNull Intent intent, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    private f() {
    }

    @NonNull
    public static Intent a(@NonNull Context context, @NonNull String str) {
        if (!h0.a(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts(io.sentry.protocol.z.b.f306542i, str, null));
        }
        Intent data = new Intent(h0.f47500b).setData(Uri.fromParts(io.sentry.protocol.z.b.f306542i, str, null));
        return i10 >= 30 ? data : data.setPackage((String) androidx.core.util.t.l(h0.b(context.getPackageManager())));
    }

    @e.a({"ArrayReturn", "NullableCollection"})
    @androidx.annotation.p0
    public static Parcelable[] b(@NonNull Intent intent, @androidx.annotation.p0 String str, @NonNull Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) a.a(intent, str, cls) : intent.getParcelableArrayExtra(str);
    }

    @e.a({"ConcreteCollection", "NullableCollection"})
    @androidx.annotation.p0
    public static <T> ArrayList<T> c(@NonNull Intent intent, @androidx.annotation.p0 String str, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.b(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    @androidx.annotation.p0
    public static <T> T d(@NonNull Intent intent, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.c(intent, str, cls);
        }
        T t10 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @androidx.annotation.p0
    public static <T extends Serializable> T e(@NonNull Intent intent, @androidx.annotation.p0 String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.d(intent, str, cls);
        }
        T t10 = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @NonNull
    public static Intent f(@NonNull String str, @NonNull String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
