package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    @b1({b1.a.LIBRARY})
    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private static final String f51056b = "emoji2.text.DefaultEmojiConfig";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private static final String f51057c = "androidx.content.action.LOAD_EMOJI_FONT";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private static final String f51058d = "emojicompat-emoji-font";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f51059a;

        @b1({b1.a.LIBRARY})
        public a(@p0 b bVar) {
            this.f51059a = bVar == null ? e() : bVar;
        }

        @p0
        private f.d a(@NonNull Context context, @p0 androidx.core.provider.f fVar) {
            if (fVar == null) {
                return null;
            }
            return new l(context, fVar);
        }

        @NonNull
        private List<List<byte[]>> b(@NonNull Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @NonNull
        private androidx.core.provider.f d(@NonNull ProviderInfo providerInfo, @NonNull PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new androidx.core.provider.f(str, str2, f51058d, b(this.f51059a.b(packageManager, str2)));
        }

        @NonNull
        private static b e() {
            return new C0461d();
        }

        private boolean f(@p0 ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @p0
        private ProviderInfo g(@NonNull PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f51059a.c(packageManager, new Intent(f51057c), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoA = this.f51059a.a(it.next());
                if (f(providerInfoA)) {
                    return providerInfoA;
                }
            }
            return null;
        }

        @b1({b1.a.LIBRARY})
        @p0
        public f.d c(@NonNull Context context) {
            return a(context, h(context));
        }

        @l1
        @b1({b1.a.LIBRARY})
        @p0
        androidx.core.provider.f h(@NonNull Context context) {
            PackageManager packageManager = context.getPackageManager();
            androidx.core.util.t.m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoG = g(packageManager);
            if (providerInfoG == null) {
                return null;
            }
            try {
                return d(providerInfoG, packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf(f51056b, e10);
                return null;
            }
        }
    }

    @b1({b1.a.LIBRARY})
    public static class b {
        @p0
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @NonNull
        public List<ResolveInfo> c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i10) {
            return Collections.EMPTY_LIST;
        }
    }

    @w0(19)
    @b1({b1.a.LIBRARY})
    public static class c extends b {
        @Override // androidx.emoji2.text.d.b
        @p0
        public ProviderInfo a(@NonNull ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.d.b
        @NonNull
        public List<ResolveInfo> c(@NonNull PackageManager packageManager, @NonNull Intent intent, int i10) {
            return packageManager.queryIntentContentProviders(intent, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    @w0(28)
    @b1({b1.a.LIBRARY})
    public static class C0461d extends c {
        @Override // androidx.emoji2.text.d.b
        @NonNull
        public Signature[] b(@NonNull PackageManager packageManager, @NonNull String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    private d() {
    }

    @p0
    public static l a(@NonNull Context context) {
        return (l) new a(null).c(context);
    }
}
