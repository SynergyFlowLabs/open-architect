package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements v {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f43648m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f43649n = "alpha";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f43650o = "elevation";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f43651p = "rotationZ";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f43652q = "rotationX";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f43653r = "transitionPathRotate";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f43654s = "scaleX";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f43655t = "scaleY";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f43656u = "translationX";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f43657v = "translationY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f43658w = "CUSTOM";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f43659x = "visibility";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f43661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f43662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.core.motion.b> f43664l;

    public b() {
        int i10 = f43648m;
        this.f43660h = i10;
        this.f43661i = i10;
        this.f43662j = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        if (i10 != 100) {
            return false;
        }
        this.f43660h = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i10, boolean z10) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (i10 != 101) {
            return false;
        }
        this.f43662j = str;
        return true;
    }

    public abstract void f(HashMap<String, o> map);

    @Override // 
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract b clone();

    public b h(b bVar) {
        this.f43660h = bVar.f43660h;
        this.f43661i = bVar.f43661i;
        this.f43662j = bVar.f43662j;
        this.f43663k = bVar.f43663k;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.f43660h;
    }

    boolean k(String str) {
        String str2 = this.f43662j;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void l(String str, int i10, float f10) {
        this.f43664l.put(str, new androidx.constraintlayout.core.motion.b(str, i10, f10));
    }

    public void m(String str, int i10, int i11) {
        this.f43664l.put(str, new androidx.constraintlayout.core.motion.b(str, i10, i11));
    }

    public void n(String str, int i10, String str2) {
        this.f43664l.put(str, new androidx.constraintlayout.core.motion.b(str, i10, str2));
    }

    public void o(String str, int i10, boolean z10) {
        this.f43664l.put(str, new androidx.constraintlayout.core.motion.b(str, i10, z10));
    }

    public void p(int i10) {
        this.f43660h = i10;
    }

    public void q(HashMap<String, Integer> map) {
    }

    public b r(int i10) {
        this.f43661i = i10;
        return this;
    }

    boolean s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
