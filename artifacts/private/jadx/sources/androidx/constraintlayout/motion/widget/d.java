package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final HashMap<Pair<Integer, Integer>, String> f45110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final HashMap<String, String> f45111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f45112i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final boolean f45113j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f45114k = "DesignTool";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MotionLayout f45115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f45116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f45117c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f45118d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45119e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45120f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f45110g = map;
        HashMap<String, String> map2 = new HashMap<>();
        f45111h = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public d(MotionLayout motionLayout) {
        this.f45115a = motionLayout;
    }

    private static void a(int i10, androidx.constraintlayout.widget.f fVar, View view, HashMap<String, String> map, int i11, int i12) {
        String str = f45110g.get(Pair.create(Integer.valueOf(i11), Integer.valueOf(i12)));
        String str2 = map.get(str);
        if (str2 != null) {
            String str3 = f45111h.get(str);
            fVar.L(view.getId(), i11, Integer.parseInt(str2), i12, str3 != null ? q(i10, map.get(str3)) : 0);
        }
    }

    private static int q(int i10, String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i10) / 160.0f);
    }

    private static void v(int i10, androidx.constraintlayout.widget.f fVar, View view, HashMap<String, String> map) {
        String str = map.get("layout_editor_absoluteX");
        if (str != null) {
            fVar.Z0(view.getId(), q(i10, str));
        }
        String str2 = map.get("layout_editor_absoluteY");
        if (str2 != null) {
            fVar.a1(view.getId(), q(i10, str2));
        }
    }

    private static void x(androidx.constraintlayout.widget.f fVar, View view, HashMap<String, String> map, int i10) {
        String str = map.get(i10 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i10 == 0) {
                fVar.i1(view.getId(), Float.parseFloat(str));
            } else if (i10 == 1) {
                fVar.F1(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void y(int i10, androidx.constraintlayout.widget.f fVar, View view, HashMap<String, String> map, int i11) {
        String str = map.get(i11 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iQ = !str.equalsIgnoreCase("wrap_content") ? q(i10, str) : -2;
            if (i11 == 0) {
                fVar.W(view.getId(), iQ);
                return;
            }
            fVar.P(view.getId(), iQ);
        }
    }

    public boolean A(Object obj, int i10, int i11, float f10, float f11) {
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f45115a;
        if (motionLayout.f44993a != null) {
            o oVar = motionLayout.f45017k.get(obj);
            MotionLayout motionLayout2 = this.f45115a;
            int i12 = (int) (motionLayout2.f45023n * 100.0f);
            if (oVar != null) {
                View view = (View) obj;
                if (motionLayout2.f44993a.T(view, i12)) {
                    float fY = oVar.y(2, f10, f11);
                    float fY2 = oVar.y(5, f10, f11);
                    this.f45115a.f44993a.m0(view, i12, "motion:percentX", Float.valueOf(fY));
                    this.f45115a.f44993a.m0(view, i12, "motion:percentY", Float.valueOf(fY2));
                    this.f45115a.H0();
                    this.f45115a.i0(true);
                    this.f45115a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void B(Object obj, String str, Object obj2) {
        if (obj instanceof f) {
            ((f) obj).j(str, obj2);
            this.f45115a.H0();
            this.f45115a.f45040w = true;
        }
    }

    public void C(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (Objects.equals(this.f45117c, str)) {
            return;
        }
        this.f45117c = str;
        this.f45118d = null;
        MotionLayout motionLayout = this.f45115a;
        if (motionLayout.f44993a == null) {
            motionLayout.f44993a = this.f45116b;
        }
        int iC0 = motionLayout.C0(str);
        this.f45119e = iC0;
        if (iC0 != 0) {
            if (iC0 == this.f45115a.getStartState()) {
                this.f45115a.setProgress(0.0f);
            } else if (iC0 == this.f45115a.getEndState()) {
                this.f45115a.setProgress(1.0f);
            } else {
                this.f45115a.V0(iC0);
                this.f45115a.setProgress(1.0f);
            }
        }
        this.f45115a.requestLayout();
    }

    public void D(float f10) {
        MotionLayout motionLayout = this.f45115a;
        if (motionLayout.f44993a == null) {
            motionLayout.f44993a = this.f45116b;
        }
        motionLayout.setProgress(f10);
        this.f45115a.i0(true);
        this.f45115a.requestLayout();
        this.f45115a.invalidate();
    }

    public void E(String str, String str2) {
        MotionLayout motionLayout = this.f45115a;
        if (motionLayout.f44993a == null) {
            motionLayout.f44993a = this.f45116b;
        }
        int iC0 = motionLayout.C0(str);
        int iC1 = this.f45115a.C0(str2);
        this.f45115a.M0(iC0, iC1);
        this.f45119e = iC0;
        this.f45120f = iC1;
        this.f45117c = str;
        this.f45118d = str2;
    }

    public void F(Object obj, int i10) {
        o oVar;
        if ((obj instanceof View) && (oVar = this.f45115a.f45017k.get(obj)) != null) {
            oVar.S(i10);
            this.f45115a.invalidate();
        }
    }

    public int b(int i10, String str, Object obj, float[] fArr, int i11, float[] fArr2, int i12) {
        o oVar;
        View view = (View) obj;
        if (i10 != 0) {
            MotionLayout motionLayout = this.f45115a;
            if (motionLayout.f44993a == null || view == null || (oVar = motionLayout.f45017k.get(view)) == null) {
                return -1;
            }
        } else {
            oVar = null;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            int iT = this.f45115a.f44993a.t() / 16;
            oVar.f(fArr2, iT);
            return iT;
        }
        if (i10 == 2) {
            int iT2 = this.f45115a.f44993a.t() / 16;
            oVar.e(fArr2, null);
            return iT2;
        }
        if (i10 != 3) {
            return -1;
        }
        this.f45115a.f44993a.t();
        return oVar.l(str, fArr2, i12);
    }

    public void c(boolean z10) {
        this.f45115a.e0(z10);
    }

    public void d(String str) {
        MotionLayout motionLayout = this.f45115a;
        if (motionLayout.f44993a == null) {
            motionLayout.f44993a = this.f45116b;
        }
        int iC0 = motionLayout.C0(str);
        System.out.println(" dumping  " + str + " (" + iC0 + ")");
        try {
            this.f45115a.f44993a.o(iC0).g0(this.f45115a.f44993a, new int[0]);
        } catch (Exception unused) {
        }
    }

    public int e(Object obj, float[] fArr) {
        t tVar = this.f45115a.f44993a;
        if (tVar == null) {
            return -1;
        }
        int iT = tVar.t() / 16;
        o oVar = this.f45115a.f45017k.get(obj);
        if (oVar == null) {
            int i10 = 0 << 0;
            return 0;
        }
        oVar.e(fArr, null);
        return iT;
    }

    public int f(Object obj, float[] fArr, int i10) {
        MotionLayout motionLayout = this.f45115a;
        if (motionLayout.f44993a == null) {
            return -1;
        }
        o oVar = motionLayout.f45017k.get(obj);
        if (oVar == null) {
            int i11 = 3 | 0;
            return 0;
        }
        oVar.f(fArr, i10);
        return i10;
    }

    public void g(Object obj, float[] fArr) {
        t tVar = this.f45115a.f44993a;
        if (tVar == null) {
            return;
        }
        int iT = tVar.t() / 16;
        o oVar = this.f45115a.f45017k.get(obj);
        if (oVar == null) {
            return;
        }
        oVar.h(fArr, iT);
    }

    public String h() {
        int endState = this.f45115a.getEndState();
        if (this.f45120f == endState) {
            return this.f45118d;
        }
        String strQ0 = this.f45115a.q0(endState);
        if (strQ0 != null) {
            this.f45118d = strQ0;
            this.f45120f = endState;
        }
        return strQ0;
    }

    public int i(Object obj, int i10, int[] iArr) {
        o oVar = this.f45115a.f45017k.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.x(i10, iArr);
    }

    public float j(Object obj, int i10, float f10, float f11) {
        o oVar;
        if ((obj instanceof View) && (oVar = this.f45115a.f45017k.get((View) obj)) != null) {
            return oVar.y(i10, f10, f11);
        }
        return 0.0f;
    }

    public int k(Object obj, int[] iArr, float[] fArr) {
        o oVar = this.f45115a.f45017k.get((View) obj);
        if (oVar == null) {
            return 0;
        }
        return oVar.z(iArr, fArr);
    }

    public Object l(int i10, int i11, int i12) {
        MotionLayout motionLayout = this.f45115a;
        t tVar = motionLayout.f44993a;
        if (tVar == null) {
            return null;
        }
        return tVar.y(motionLayout.getContext(), i10, i11, i12);
    }

    public Object m(Object obj, int i10, int i11) {
        if (this.f45115a.f44993a == null) {
            return null;
        }
        int id2 = ((View) obj).getId();
        MotionLayout motionLayout = this.f45115a;
        return motionLayout.f44993a.y(motionLayout.getContext(), i10, id2, i11);
    }

    public Object n(Object obj, float f10, float f11) {
        o oVar;
        View view = (View) obj;
        MotionLayout motionLayout = this.f45115a;
        if (motionLayout.f44993a == null) {
            return -1;
        }
        if (view == null || (oVar = motionLayout.f45017k.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return oVar.B(viewGroup.getWidth(), viewGroup.getHeight(), f10, f11);
    }

    public Boolean o(Object obj, Object obj2, float f10, float f11, String[] strArr, float[] fArr) {
        if (!(obj instanceof k)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.f45115a.f45017k.get(view).N(view, (k) obj, f10, f11, strArr, fArr);
        this.f45115a.H0();
        this.f45115a.f45040w = true;
        return Boolean.TRUE;
    }

    public float p() {
        return this.f45115a.getProgress();
    }

    public String r() {
        int startState = this.f45115a.getStartState();
        if (this.f45119e == startState) {
            return this.f45117c;
        }
        String strQ0 = this.f45115a.q0(startState);
        if (strQ0 != null) {
            this.f45117c = strQ0;
            this.f45119e = startState;
        }
        return this.f45115a.q0(startState);
    }

    public String s() {
        if (this.f45117c != null && this.f45118d != null) {
            float fP = p();
            if (fP <= 0.01f) {
                return this.f45117c;
            }
            if (fP >= 0.99f) {
                return this.f45118d;
            }
        }
        return this.f45117c;
    }

    public long t() {
        return this.f45115a.getTransitionTimeMs();
    }

    public boolean u() {
        return (this.f45117c == null || this.f45118d == null) ? false : true;
    }

    public void w(int i10, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap map = obj2 instanceof HashMap ? (HashMap) obj2 : new HashMap();
        int iC0 = this.f45115a.C0(str);
        androidx.constraintlayout.widget.f fVarO = this.f45115a.f44993a.o(iC0);
        if (fVarO == null) {
            return;
        }
        fVarO.E(view.getId());
        y(i10, fVarO, view, map, 0);
        y(i10, fVarO, view, map, 1);
        a(i10, fVarO, view, map, 6, 6);
        a(i10, fVarO, view, map, 6, 7);
        a(i10, fVarO, view, map, 7, 7);
        a(i10, fVarO, view, map, 7, 6);
        a(i10, fVarO, view, map, 1, 1);
        a(i10, fVarO, view, map, 1, 2);
        a(i10, fVarO, view, map, 2, 2);
        a(i10, fVarO, view, map, 2, 1);
        a(i10, fVarO, view, map, 3, 3);
        a(i10, fVarO, view, map, 3, 4);
        a(i10, fVarO, view, map, 4, 3);
        a(i10, fVarO, view, map, 4, 4);
        int i11 = 6 ^ 5;
        a(i10, fVarO, view, map, 5, 5);
        x(fVarO, view, map, 0);
        x(fVarO, view, map, 1);
        v(i10, fVarO, view, map);
        this.f45115a.a1(iC0, fVarO);
        this.f45115a.requestLayout();
    }

    public void z(Object obj, int i10, String str, Object obj2) {
        t tVar = this.f45115a.f44993a;
        if (tVar != null) {
            tVar.m0((View) obj, i10, str, obj2);
            MotionLayout motionLayout = this.f45115a;
            motionLayout.f45035t = i10 / 100.0f;
            motionLayout.f45025o = 0.0f;
            motionLayout.H0();
            this.f45115a.i0(true);
        }
    }
}
