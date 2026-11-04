package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final String A = "motionProgress";
    public static final String B = "transitionEasing";
    public static final String C = "visibility";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f45121f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f45122g = "alpha";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f45123h = "elevation";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f45124i = "rotation";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f45125j = "rotationX";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f45126k = "rotationY";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f45127l = "transformPivotX";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f45128m = "transformPivotY";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f45129n = "transitionPathRotate";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f45130o = "scaleX";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f45131p = "scaleY";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f45132q = "wavePeriod";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f45133r = "waveOffset";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f45134s = "wavePhase";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f45135t = "waveVariesBy";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f45136u = "translationX";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f45137v = "translationY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f45138w = "translationZ";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f45139x = "progress";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f45140y = "CUSTOM";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f45141z = "curveFit";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f45142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f45143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f45144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f45145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    HashMap<String, androidx.constraintlayout.widget.a> f45146e;

    public f() {
        int i10 = f45121f;
        this.f45142a = i10;
        this.f45143b = i10;
        this.f45144c = null;
    }

    public abstract void a(HashMap<String, androidx.constraintlayout.motion.utils.d> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract f clone();

    public f c(f fVar) {
        this.f45142a = fVar.f45142a;
        this.f45143b = fVar.f45143b;
        this.f45144c = fVar.f45144c;
        this.f45145d = fVar.f45145d;
        this.f45146e = fVar.f45146e;
        return this;
    }

    abstract void d(HashSet<String> hashSet);

    public int e() {
        return this.f45142a;
    }

    abstract void f(Context context, AttributeSet attributeSet);

    boolean g(String str) {
        String str2 = this.f45144c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void h(int i10) {
        this.f45142a = i10;
    }

    public void i(HashMap<String, Integer> map) {
    }

    public abstract void j(String str, Object obj);

    public f k(int i10) {
        this.f45143b = i10;
        return this;
    }

    boolean l(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    float m(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int n(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
