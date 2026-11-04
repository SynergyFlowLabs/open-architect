package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47845a = "\udfffd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47846b = "m";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<androidx.core.util.p<Rect, Rect>> f47847c = new ThreadLocal<>();

    @w0(23)
    static class a {
        private a() {
        }

        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @w0(29)
    static class b {
        private b() {
        }

        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private l() {
    }

    public static boolean a(@NonNull Paint paint, @NonNull String str) {
        return a.a(paint, str);
    }

    private static androidx.core.util.p<Rect, Rect> b() {
        ThreadLocal<androidx.core.util.p<Rect, Rect>> threadLocal = f47847c;
        androidx.core.util.p<Rect, Rect> pVar = threadLocal.get();
        if (pVar == null) {
            androidx.core.util.p<Rect, Rect> pVar2 = new androidx.core.util.p<>(new Rect(), new Rect());
            threadLocal.set(pVar2);
            return pVar2;
        }
        pVar.f48411a.setEmpty();
        pVar.f48412b.setEmpty();
        return pVar;
    }

    public static boolean c(@NonNull Paint paint, @p0 d dVar) {
        b.a(paint, dVar != null ? e.b.a(dVar) : null);
        return true;
    }
}
