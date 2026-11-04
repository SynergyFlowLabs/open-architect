package coil.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.collection.g3;
import coil.memory.MemoryCache;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.f0;
import okhttp3.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dimension.kt\ncoil/size/-Dimensions\n+ 4 Contexts.kt\ncoil/util/-Contexts\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,302:1\n1#2:303\n57#3:304\n78#4:305\n78#4:307\n31#5:306\n31#5:308\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n*L\n226#1:304\n258#1:305\n270#1:307\n258#1:306\n270#1:308\n*E\n"})
@oj.i(name = "-Utils")
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static final ColorSpace f87840c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f87842e = "image/jpeg";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f87843f = "image/webp";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f87844g = "image/heic";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f87845h = "image/heif";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f87846i = "android_asset";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final double f87847j = 0.2d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final double f87848k = 0.15d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f87849l = 256;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Bitmap.Config[] f87838a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Bitmap.Config f87839b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final okhttp3.u f87841d = new okhttp3.u.a().i();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f87851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f87852c;

        static {
            int[] iArr = new int[coil.decode.e.values().length];
            try {
                iArr[coil.decode.e.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[coil.decode.e.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[coil.decode.e.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[coil.decode.e.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f87850a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f87851b = iArr2;
            int[] iArr3 = new int[coil.size.h.values().length];
            try {
                iArr3[coil.size.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[coil.size.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f87852c = iArr3;
        }
    }

    public static final boolean A() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean B(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean C(@NotNull coil.intercept.b.a aVar) {
        return (aVar instanceof coil.intercept.c) && ((coil.intercept.c) aVar).k();
    }

    public static final boolean D(@NotNull Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.i);
    }

    @NotNull
    public static final coil.request.o E(@Nullable coil.request.o oVar) {
        if (oVar == null) {
            oVar = coil.request.o.f87735c;
        }
        return oVar;
    }

    @NotNull
    public static final coil.request.s F(@Nullable coil.request.s sVar) {
        if (sVar == null) {
            sVar = coil.request.s.f87751c;
        }
        return sVar;
    }

    @NotNull
    public static final okhttp3.u G(@Nullable okhttp3.u uVar) {
        return uVar == null ? f87841d : uVar;
    }

    @NotNull
    public static final g0 H(@NotNull f0 f0Var) {
        g0 g0VarR = f0Var.r();
        if (g0VarR != null) {
            return g0VarR;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final int I(@NotNull String str, int i10) {
        Long lC1 = StringsKt.c1(str);
        if (lC1 == null) {
            return i10;
        }
        long jLongValue = lC1.longValue();
        if (jLongValue > g3.f12256c) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final int J(@NotNull coil.size.c cVar, @NotNull coil.size.h hVar) {
        if (cVar instanceof coil.size.c.a) {
            return ((coil.size.c.a) cVar).f87767a;
        }
        int i10 = a.f87852c[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new k0();
    }

    @NotNull
    public static final Void K() {
        throw new IllegalStateException("Unsupported");
    }

    public static final int L(@NotNull coil.size.i iVar, @NotNull coil.size.h hVar, @NotNull Function0<Integer> function0) {
        return coil.size.b.f(iVar) ? function0.invoke().intValue() : J(iVar.f(), hVar);
    }

    public static final void a(@NotNull coil.disk.a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final coil.c.a b(@NotNull coil.c.a aVar, @Nullable coil.decode.h.a aVar2) {
        if (aVar2 != null) {
            aVar.j().add(0, aVar2);
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final coil.c.a c(@NotNull coil.c.a aVar, @Nullable Pair<? extends coil.fetch.h.a<?>, ? extends Class<?>> pair) {
        if (pair != 0) {
            aVar.k().add(0, pair);
        }
        return aVar;
    }

    @NotNull
    public static final okhttp3.u.a d(@NotNull okhttp3.u.a aVar, @NotNull String str) {
        int iQ3 = StringsKt.q3(str, AbstractJsonLexerKt.COLON, 0, false, 6, null);
        if (iQ3 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iQ3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.E5(strSubstring).toString();
        String strSubstring2 = str.substring(iQ3 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        aVar.h(string, strSubstring2);
        return aVar;
    }

    public static final int e(@NotNull Context context, double d10) {
        int largeMemoryClass;
        try {
            Object objS = androidx.core.content.d.s(context, ActivityManager.class);
            Intrinsics.checkNotNull(objS);
            ActivityManager activityManager = (ActivityManager) objS;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d11 = 1024;
        return (int) (d10 * ((double) largeMemoryClass) * d11 * d11);
    }

    public static final void f(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double g(@NotNull Context context) {
        double d10 = f87847j;
        try {
            Object objS = androidx.core.content.d.s(context, ActivityManager.class);
            Intrinsics.checkNotNull(objS);
            if (((ActivityManager) objS).isLowRamDevice()) {
                d10 = f87848k;
            }
        } catch (Exception unused) {
        }
        return d10;
    }

    @Nullable
    public static final MemoryCache.b h(@NotNull MemoryCache memoryCache, @Nullable MemoryCache.Key key) {
        if (key != null) {
            return memoryCache.e(key);
        }
        return null;
    }

    @Nullable
    public static final <T> T i(@NotNull a1<? extends T> a1Var) {
        try {
            return a1Var.m();
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final Bitmap.Config j() {
        return f87839b;
    }

    @NotNull
    public static final okhttp3.u k() {
        return f87841d;
    }

    @NotNull
    public static final String l(@NotNull coil.decode.e eVar) {
        int i10 = a.f87850a[eVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return t.f87861b;
        }
        if (i10 == 3) {
            return t.f87862c;
        }
        if (i10 == 4) {
            return t.f87863d;
        }
        throw new k0();
    }

    @NotNull
    public static final coil.d m(@NotNull coil.intercept.b.a aVar) {
        return aVar instanceof coil.intercept.c ? ((coil.intercept.c) aVar).g() : coil.d.f87117b;
    }

    @Nullable
    public static final String n(@NotNull Uri uri) {
        return (String) CollectionsKt.firstOrNull((List) uri.getPathSegments());
    }

    public static final int o(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int p(@NotNull Object obj) {
        return System.identityHashCode(obj);
    }

    @Nullable
    public static final String q(@NotNull MimeTypeMap mimeTypeMap, @Nullable String str) {
        if (str == null || StringsKt.w3(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.q5(StringsKt.s5(StringsKt.A5(StringsKt.A5(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }

    @Nullable
    public static final ColorSpace r() {
        return f87840c;
    }

    public static final int s(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @NotNull
    public static final coil.request.w t(@NotNull View view) {
        coil.request.w wVar;
        Object tag = view.getTag(j4.a.C2237a.f307365a);
        coil.request.w wVar2 = tag instanceof coil.request.w ? (coil.request.w) tag : null;
        if (wVar2 != null) {
            return wVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(j4.a.C2237a.f307365a);
                wVar = tag2 instanceof coil.request.w ? (coil.request.w) tag2 : null;
                if (wVar == null) {
                    wVar = new coil.request.w(view);
                    view.addOnAttachStateChangeListener(wVar);
                    view.setTag(j4.a.C2237a.f307365a, wVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    @NotNull
    public static final File u(@NotNull Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }

    @NotNull
    public static final coil.size.h v(@NotNull ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f87851b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? coil.size.h.FIT : coil.size.h.FILL;
    }

    @NotNull
    public static final Bitmap.Config[] w() {
        return f87838a;
    }

    public static final int x(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final int y(@NotNull coil.size.i iVar, @NotNull coil.size.h hVar, @NotNull Function0<Integer> function0) {
        return coil.size.b.f(iVar) ? function0.invoke().intValue() : J(iVar.e(), hVar);
    }

    public static final boolean z(@NotNull Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), com.facebook.share.internal.k.f101891c) && Intrinsics.areEqual(n(uri), f87846i);
    }
}
