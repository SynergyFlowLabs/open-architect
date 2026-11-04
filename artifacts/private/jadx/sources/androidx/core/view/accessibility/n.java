package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.os.p;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f48598b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48599c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48600d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48601e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48602f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48603g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48604h = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48605a;

    @w0(21)
    private static class a {
        private a() {
        }

        static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i10) {
            return accessibilityWindowInfo.getChild(i10);
        }

        static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    @w0(24)
    private static class b {
        private b() {
        }

        static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    @w0(26)
    private static class c {
        private c() {
        }

        static boolean a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    @w0(30)
    private static class d {
        private d() {
        }

        static AccessibilityWindowInfo a() {
            return new AccessibilityWindowInfo();
        }
    }

    @w0(33)
    private static class e {
        private e() {
        }

        static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        public static j c(Object obj, int i10) {
            return j.s2(((AccessibilityWindowInfo) obj).getRoot(i10));
        }
    }

    @w0(34)
    private static class f {
        private f() {
        }

        static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public n() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f48605a = d.a();
        } else {
            this.f48605a = null;
        }
    }

    @p0
    public static n t() {
        return y(a.l());
    }

    @p0
    public static n u(@p0 n nVar) {
        if (nVar == null) {
            return null;
        }
        return y(a.m((AccessibilityWindowInfo) nVar.f48605a));
    }

    private static String w(int i10) {
        if (i10 == 1) {
            return "TYPE_APPLICATION";
        }
        if (i10 == 2) {
            return "TYPE_INPUT_METHOD";
        }
        if (i10 != 3) {
            return i10 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY";
        }
        return "TYPE_SYSTEM";
    }

    static n y(Object obj) {
        if (obj != null) {
            return new n(obj);
        }
        return null;
    }

    @p0
    public j a() {
        return j.s2(b.a((AccessibilityWindowInfo) this.f48605a));
    }

    public void b(@NonNull Rect rect) {
        a.a((AccessibilityWindowInfo) this.f48605a, rect);
    }

    @p0
    public n c(int i10) {
        return y(a.b((AccessibilityWindowInfo) this.f48605a, i10));
    }

    public int d() {
        return a.c((AccessibilityWindowInfo) this.f48605a);
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.a((AccessibilityWindowInfo) this.f48605a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            Object obj2 = this.f48605a;
            if (obj2 == null) {
                return nVar.f48605a == null;
            }
            return obj2.equals(nVar.f48605a);
        }
        return false;
    }

    public int f() {
        return a.d((AccessibilityWindowInfo) this.f48605a);
    }

    public int g() {
        return a.e((AccessibilityWindowInfo) this.f48605a);
    }

    @NonNull
    public p h() {
        return Build.VERSION.SDK_INT >= 34 ? p.o(f.a((AccessibilityWindowInfo) this.f48605a)) : p.g();
    }

    public int hashCode() {
        Object obj = this.f48605a;
        if (obj != null) {
            return obj.hashCode();
        }
        boolean z10 = true;
        return 0;
    }

    @p0
    public n i() {
        return y(a.f((AccessibilityWindowInfo) this.f48605a));
    }

    public void j(@NonNull Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.b((AccessibilityWindowInfo) this.f48605a, region);
            return;
        }
        Rect rect = new Rect();
        a.a((AccessibilityWindowInfo) this.f48605a, rect);
        region.set(rect);
    }

    @p0
    public j k() {
        return j.s2(a.g((AccessibilityWindowInfo) this.f48605a));
    }

    @p0
    public j l(int i10) {
        return Build.VERSION.SDK_INT >= 33 ? e.c(this.f48605a, i10) : k();
    }

    @p0
    public CharSequence m() {
        return b.b((AccessibilityWindowInfo) this.f48605a);
    }

    public long n() {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.b((AccessibilityWindowInfo) this.f48605a);
        }
        return 0L;
    }

    public int o() {
        return a.h((AccessibilityWindowInfo) this.f48605a);
    }

    public boolean p() {
        return a.i((AccessibilityWindowInfo) this.f48605a);
    }

    public boolean q() {
        return a.j((AccessibilityWindowInfo) this.f48605a);
    }

    public boolean r() {
        return a.k((AccessibilityWindowInfo) this.f48605a);
    }

    public boolean s() {
        return c.a((AccessibilityWindowInfo) this.f48605a);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb2.append("AccessibilityWindowInfo[");
        sb2.append("id=");
        sb2.append(f());
        sb2.append(", type=");
        sb2.append(w(o()));
        sb2.append(", layer=");
        sb2.append(g());
        sb2.append(", bounds=");
        sb2.append(rect);
        sb2.append(", focused=");
        sb2.append(r());
        sb2.append(", active=");
        sb2.append(q());
        sb2.append(", hasParent=");
        sb2.append(i() != null);
        sb2.append(", hasChildren=");
        sb2.append(d() > 0);
        sb2.append(", transitionTime=");
        sb2.append(n());
        sb2.append(", locales=");
        sb2.append(h());
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Deprecated
    public void v() {
    }

    @p0
    public AccessibilityWindowInfo x() {
        return (AccessibilityWindowInfo) this.f48605a;
    }

    private n(Object obj) {
        this.f48605a = obj;
    }
}
