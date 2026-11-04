package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.graphics.a0;
import androidx.core.graphics.h0;
import androidx.core.graphics.z;
import androidx.core.util.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String f48131a = "font_results";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f48132b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f48133c = -2;

    public static final class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f48134a = "file_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f48135b = "font_ttc_index";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f48136c = "font_variation_settings";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f48137d = "font_weight";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f48138e = "font_italic";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f48139f = "result_code";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f48140g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f48141h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f48142i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f48143j = 3;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f48149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f48152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f48153e;

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@NonNull Uri uri, @g0(from = 0) int i10, @g0(from = 1, to = 1000) int i11, boolean z10, int i12) {
            this.f48149a = (Uri) t.l(uri);
            this.f48150b = i10;
            this.f48151c = i11;
            this.f48152d = z10;
            this.f48153e = i12;
        }

        static c a(@NonNull Uri uri, @g0(from = 0) int i10, @g0(from = 1, to = 1000) int i11, boolean z10, int i12) {
            return new c(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f48153e;
        }

        @g0(from = 0)
        public int c() {
            return this.f48150b;
        }

        @NonNull
        public Uri d() {
            return this.f48149a;
        }

        @g0(from = 1, to = 1000)
        public int e() {
            return this.f48151c;
        }

        public boolean f() {
            return this.f48152d;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int f48154a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f48155b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f48156c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f48157d = -2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f48158e = -3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f48159f = -4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f48160g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f48161h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f48162i = 3;

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public @interface a {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface) {
        }
    }

    private h() {
    }

    @p0
    public static Typeface a(@NonNull Context context, @p0 CancellationSignal cancellationSignal, @NonNull c[] cVarArr) {
        return a0.d(context, cancellationSignal, cVarArr, 0);
    }

    @NonNull
    public static b b(@NonNull Context context, @p0 CancellationSignal cancellationSignal, @NonNull f fVar) throws PackageManager.NameNotFoundException {
        return e.f(context, z.a(new Object[]{fVar}), cancellationSignal);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, f fVar, @p0 androidx.core.content.res.i.f fVar2, @p0 Handler handler, boolean z10, int i10, int i11) {
        a0.a aVar = new a0.a(fVar2);
        return g(context, z.a(new Object[]{fVar}), i11, z10, i10, androidx.core.content.res.i.f.e(handler), aVar);
    }

    @l1
    @Deprecated
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public static ProviderInfo d(@NonNull PackageManager packageManager, @NonNull f fVar, @p0 Resources resources) throws PackageManager.NameNotFoundException {
        return e.g(packageManager, fVar, resources);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return h0.h(context, cVarArr, cancellationSignal);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public static Typeface f(@NonNull Context context, @NonNull f fVar, int i10, boolean z10, @g0(from = 0) int i11, @NonNull Handler handler, @NonNull d dVar) {
        return g(context, z.a(new Object[]{fVar}), i10, z10, i11, handler, dVar);
    }

    @b1({b1.a.LIBRARY})
    @p0
    public static Typeface g(@NonNull Context context, @NonNull List<f> list, int i10, boolean z10, @g0(from = 0) int i11, @NonNull Handler handler, @NonNull d dVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar, i.b(handler));
        if (!z10) {
            return g.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return g.e(context, list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static void h(@NonNull Context context, @NonNull f fVar, int i10, @p0 Executor executor, @NonNull Executor executor2, @NonNull d dVar) {
        g.d(context.getApplicationContext(), z.a(new Object[]{fVar}), i10, executor, new androidx.core.provider.a(dVar, executor2));
    }

    @Deprecated
    public static void i(@NonNull Context context, @NonNull f fVar, @NonNull d dVar, @NonNull Handler handler) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar);
        g.d(context.getApplicationContext(), z.a(new Object[]{fVar}), 0, i.b(handler), aVar);
    }

    public static void j(@NonNull Context context, @NonNull List<f> list, int i10, @p0 Executor executor, @NonNull Executor executor2, @NonNull d dVar) {
        g.d(context.getApplicationContext(), list, i10, executor, new androidx.core.provider.a(dVar, executor2));
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void k() {
        g.f();
    }

    @l1
    @b1({b1.a.LIBRARY})
    public static void l() {
        g.f();
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f48144c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f48145d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f48146e = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<c[]> f48148b;

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i10, @p0 c[] cVarArr) {
            this.f48147a = i10;
            this.f48148b = Collections.singletonList(cVarArr);
        }

        static b a(int i10, @p0 List<c[]> list) {
            return new b(i10, list);
        }

        static b b(int i10, @p0 c[] cVarArr) {
            return new b(i10, cVarArr);
        }

        public c[] c() {
            return this.f48148b.get(0);
        }

        @NonNull
        public List<c[]> d() {
            return this.f48148b;
        }

        public int e() {
            return this.f48147a;
        }

        boolean f() {
            return this.f48148b.size() > 1;
        }

        b(int i10, @NonNull List<c[]> list) {
            this.f48147a = i10;
            this.f48148b = list;
        }
    }
}
