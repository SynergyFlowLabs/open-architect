package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.util.o;

/* JADX INFO: loaded from: classes2.dex */
class i implements f.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52912c = "MediaSessionManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f52913d = f.f52902c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f52914e = "android.permission.STATUS_BAR_SERVICE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f52915f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f52916g = "enabled_notification_listeners";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f52917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ContentResolver f52918b;

    static class a implements f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f52919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52921c;

        a(String packageName, int pid, int uid) {
            this.f52919a = packageName;
            this.f52920b = pid;
            this.f52921c = uid;
        }

        @Override // androidx.media.f.c
        public int a() {
            return this.f52921c;
        }

        @Override // androidx.media.f.c
        public int b() {
            return this.f52920b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f52920b >= 0 && aVar.f52920b >= 0) {
                return TextUtils.equals(this.f52919a, aVar.f52919a) && this.f52920b == aVar.f52920b && this.f52921c == aVar.f52921c;
            }
            return TextUtils.equals(this.f52919a, aVar.f52919a) && this.f52921c == aVar.f52921c;
        }

        @Override // androidx.media.f.c
        public String getPackageName() {
            return this.f52919a;
        }

        public int hashCode() {
            return o.b(this.f52919a, Integer.valueOf(this.f52921c));
        }
    }

    i(Context context) {
        this.f52917a = context;
        this.f52918b = context.getContentResolver();
    }

    private boolean c(f.c userInfo, String permission) {
        if (userInfo.b() < 0) {
            return this.f52917a.getPackageManager().checkPermission(permission, userInfo.getPackageName()) == 0;
        }
        return this.f52917a.checkPermission(permission, userInfo.b(), userInfo.a()) == 0;
    }

    @Override // androidx.media.f.a
    public boolean a(@NonNull f.c userInfo) {
        try {
            if (this.f52917a.getPackageManager().getApplicationInfo(userInfo.getPackageName(), 0) == null) {
                return false;
            }
            return c(userInfo, f52914e) || c(userInfo, f52915f) || userInfo.a() == 1000 || b(userInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            if (f52913d) {
                userInfo.getPackageName();
            }
            return false;
        }
    }

    boolean b(@NonNull f.c userInfo) {
        String string = Settings.Secure.getString(this.f52918b, f52916g);
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(userInfo.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media.f.a
    public Context getContext() {
        return this.f52917a;
    }
}
