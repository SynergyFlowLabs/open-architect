package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static float f44458v = Float.NaN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.e f44459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f44464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f44465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f44467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f44468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f44469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f44470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f44471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f44472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f44473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f44474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f44475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap<String, androidx.constraintlayout.core.motion.b> f44477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f44478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    androidx.constraintlayout.core.motion.utils.u f44479u;

    public v() {
        this.f44459a = null;
        this.f44460b = 0;
        this.f44461c = 0;
        this.f44462d = 0;
        this.f44463e = 0;
        this.f44464f = Float.NaN;
        this.f44465g = Float.NaN;
        this.f44466h = Float.NaN;
        this.f44467i = Float.NaN;
        this.f44468j = Float.NaN;
        this.f44469k = Float.NaN;
        this.f44470l = Float.NaN;
        this.f44471m = Float.NaN;
        this.f44472n = Float.NaN;
        this.f44473o = Float.NaN;
        this.f44474p = Float.NaN;
        this.f44475q = Float.NaN;
        this.f44476r = 0;
        this.f44477s = new HashMap<>();
        this.f44478t = null;
    }

    private static void a(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private static void b(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private static float o(float f10, float f11, float f12, float f13) {
        boolean zIsNaN = Float.isNaN(f10);
        boolean zIsNaN2 = Float.isNaN(f11);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f10 = f12;
        }
        if (zIsNaN2) {
            f11 = f12;
        }
        return f10 + (f13 * (f11 - f10));
    }

    public static void p(int i10, int i11, v vVar, v vVar2, v vVar3, t tVar, float f10) {
        int i12;
        int i13;
        float f11;
        int i14;
        float f12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f13 = 100.0f * f10;
        int i20 = (int) f13;
        int i21 = vVar2.f44460b;
        int i22 = vVar2.f44461c;
        int i23 = vVar3.f44460b;
        int i24 = vVar3.f44461c;
        int i25 = vVar2.f44462d - i21;
        int i26 = vVar2.f44463e - i22;
        int i27 = vVar3.f44462d - i23;
        int i28 = vVar3.f44463e - i24;
        int i29 = i21;
        float f14 = vVar2.f44474p;
        float f15 = vVar3.f44474p;
        if (vVar2.f44476r == 8) {
            int i30 = i29 - ((int) (i27 / 2.0f));
            i13 = i22 - ((int) (i28 / 2.0f));
            if (Float.isNaN(f14)) {
                i29 = i30;
                i12 = i27;
                f11 = 0.0f;
            } else {
                i29 = i30;
                i12 = i27;
                f11 = f14;
            }
        } else {
            i28 = i26;
            i12 = i25;
            i13 = i22;
            f11 = f14;
        }
        if (vVar3.f44476r == 8) {
            i23 -= (int) (i12 / 2.0f);
            i24 -= (int) (i28 / 2.0f);
            if (Float.isNaN(f15)) {
                i14 = i28;
                i27 = i12;
                f15 = 0.0f;
            } else {
                i14 = i28;
                i27 = i12;
            }
        } else {
            i14 = i28;
        }
        if (Float.isNaN(f11) && !Float.isNaN(f15)) {
            f11 = 1.0f;
        }
        if (!Float.isNaN(f11) && Float.isNaN(f15)) {
            f15 = 1.0f;
        }
        int i31 = i23;
        float f16 = vVar2.f44476r == 4 ? 0.0f : f11;
        int i32 = i24;
        float f17 = vVar3.f44476r == 4 ? 0.0f : f15;
        if (vVar.f44459a == null || !tVar.W()) {
            f12 = f10;
            i15 = i31;
            i16 = i32;
            i17 = i13;
        } else {
            t.a aVarC = tVar.C(vVar.f44459a.f44730o, i20);
            int i33 = i13;
            t.a aVarB = tVar.B(vVar.f44459a.f44730o, i20);
            if (aVarC == aVarB) {
                aVarB = null;
            }
            if (aVarC != null) {
                i29 = (int) (aVarC.f44415d * i10);
                i17 = (int) (aVarC.f44416e * i11);
                i18 = aVarC.f44412a;
            } else {
                i18 = 0;
                i17 = i33;
            }
            if (aVarB != null) {
                i15 = (int) (aVarB.f44415d * i10);
                i16 = (int) (aVarB.f44416e * i11);
                i19 = aVarB.f44412a;
            } else {
                i19 = 100;
                i15 = i31;
                i16 = i32;
            }
            f12 = (f13 - i18) / (i19 - i18);
        }
        int i34 = i29;
        vVar.f44459a = vVar2.f44459a;
        int i35 = (int) (i34 + ((i15 - i34) * f12));
        vVar.f44460b = i35;
        int i36 = (int) (i17 + (f12 * (i16 - i17)));
        vVar.f44461c = i36;
        float f18 = 1.0f - f10;
        vVar.f44462d = i35 + ((int) ((i12 * f18) + (i27 * f10)));
        vVar.f44463e = i36 + ((int) ((f18 * i28) + (i14 * f10)));
        vVar.f44464f = o(vVar2.f44464f, vVar3.f44464f, 0.5f, f10);
        vVar.f44465g = o(vVar2.f44465g, vVar3.f44465g, 0.5f, f10);
        vVar.f44466h = o(vVar2.f44466h, vVar3.f44466h, 0.0f, f10);
        vVar.f44467i = o(vVar2.f44467i, vVar3.f44467i, 0.0f, f10);
        vVar.f44468j = o(vVar2.f44468j, vVar3.f44468j, 0.0f, f10);
        vVar.f44472n = o(vVar2.f44472n, vVar3.f44472n, 1.0f, f10);
        vVar.f44473o = o(vVar2.f44473o, vVar3.f44473o, 1.0f, f10);
        vVar.f44469k = o(vVar2.f44469k, vVar3.f44469k, 0.0f, f10);
        vVar.f44470l = o(vVar2.f44470l, vVar3.f44470l, 0.0f, f10);
        vVar.f44471m = o(vVar2.f44471m, vVar3.f44471m, 0.0f, f10);
        vVar.f44474p = o(f16, f17, 1.0f, f10);
        Set<String> setKeySet = vVar3.f44477s.keySet();
        vVar.f44477s.clear();
        for (String str : setKeySet) {
            if (vVar2.f44477s.containsKey(str)) {
                androidx.constraintlayout.core.motion.b bVar = vVar2.f44477s.get(str);
                androidx.constraintlayout.core.motion.b bVar2 = vVar3.f44477s.get(str);
                androidx.constraintlayout.core.motion.b bVar3 = new androidx.constraintlayout.core.motion.b(bVar);
                vVar.f44477s.put(str, bVar3);
                if (bVar.r() == 1) {
                    bVar3.y(Float.valueOf(o(bVar.n(), bVar2.n(), 0.0f, f10)));
                } else {
                    int iR = bVar.r();
                    float[] fArr = new float[iR];
                    float[] fArr2 = new float[iR];
                    bVar.o(fArr);
                    bVar2.o(fArr2);
                    for (int i37 = 0; i37 < iR; i37++) {
                        fArr[i37] = o(fArr[i37], fArr2[i37], 0.0f, f10);
                        bVar3.z(fArr);
                    }
                }
            }
        }
    }

    private void w(StringBuilder sb2, androidx.constraintlayout.core.widgets.d.a aVar) {
        androidx.constraintlayout.core.widgets.d dVarR = this.f44459a.r(aVar);
        if (dVarR != null && dVarR.f44662f != null) {
            sb2.append("Anchor");
            sb2.append(aVar.name());
            sb2.append(": ['");
            String str = dVarR.f44662f.i().f44730o;
            if (str == null) {
                str = "#PARENT";
            }
            sb2.append(str);
            sb2.append("', '");
            sb2.append(dVarR.f44662f.l().name());
            sb2.append("', '");
            sb2.append(dVarR.f44663g);
            sb2.append("'],\n");
        }
    }

    public void A(String str, int i10, boolean z10) {
        if (this.f44477s.containsKey(str)) {
            this.f44477s.get(str).t(z10);
        } else {
            this.f44477s.put(str, new androidx.constraintlayout.core.motion.b(str, i10, z10));
        }
    }

    public void B(androidx.constraintlayout.core.motion.a aVar, float[] fArr) {
    }

    void C(androidx.constraintlayout.core.motion.utils.u uVar) {
        this.f44479u = uVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean D(String str, androidx.constraintlayout.core.parser.c cVar) throws androidx.constraintlayout.core.parser.h {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    b10 = 0;
                }
                break;
            case -1383228885:
                if (str.equals(VerticalAlignment.BOTTOM)) {
                    b10 = 1;
                }
                break;
            case -1349088399:
                if (str.equals(cj.h.L)) {
                    b10 = 2;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 3;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 4;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    b10 = 5;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 6;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 7;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 8;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    b10 = 9;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    b10 = 10;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 11;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    b10 = 17;
                }
                break;
        }
        switch (b10) {
            case 0:
                f44458v = cVar.r();
                break;
            case 1:
                this.f44463e = cVar.s();
                break;
            case 2:
                s(cVar);
                break;
            case 3:
                this.f44466h = cVar.r();
                break;
            case 4:
                this.f44467i = cVar.r();
                break;
            case 5:
                this.f44468j = cVar.r();
                break;
            case 6:
                this.f44469k = cVar.r();
                break;
            case 7:
                this.f44470l = cVar.r();
                break;
            case 8:
                this.f44471m = cVar.r();
                break;
            case 9:
                this.f44464f = cVar.r();
                break;
            case 10:
                this.f44465g = cVar.r();
                break;
            case 11:
                this.f44472n = cVar.r();
                break;
            case 12:
                this.f44473o = cVar.r();
                break;
            case 13:
                this.f44461c = cVar.s();
                break;
            case 14:
                this.f44460b = cVar.s();
                break;
            case 15:
                this.f44474p = cVar.r();
                break;
            case 16:
                this.f44462d = cVar.s();
                break;
            case 17:
                this.f44475q = cVar.r();
                break;
            default:
                return false;
        }
        return true;
    }

    public v E() {
        androidx.constraintlayout.core.widgets.e eVar = this.f44459a;
        if (eVar != null) {
            this.f44460b = eVar.L();
            this.f44461c = this.f44459a.e0();
            this.f44462d = this.f44459a.X();
            this.f44463e = this.f44459a.v();
            G(this.f44459a.f44728n);
        }
        return this;
    }

    public v F(androidx.constraintlayout.core.widgets.e eVar) {
        if (eVar == null) {
            return this;
        }
        this.f44459a = eVar;
        E();
        return this;
    }

    public void G(v vVar) {
        if (vVar != null) {
            this.f44464f = vVar.f44464f;
            this.f44465g = vVar.f44465g;
            this.f44466h = vVar.f44466h;
            this.f44467i = vVar.f44467i;
            this.f44468j = vVar.f44468j;
            this.f44469k = vVar.f44469k;
            this.f44470l = vVar.f44470l;
            this.f44471m = vVar.f44471m;
            this.f44472n = vVar.f44472n;
            this.f44473o = vVar.f44473o;
            this.f44474p = vVar.f44474p;
            this.f44476r = vVar.f44476r;
            C(vVar.f44479u);
            this.f44477s.clear();
            for (androidx.constraintlayout.core.motion.b bVar : vVar.f44477s.values()) {
                this.f44477s.put(bVar.k(), bVar.d());
            }
        }
    }

    public int H() {
        return Math.max(0, this.f44462d - this.f44460b);
    }

    public void c(String str, int i10) {
        y(str, 902, i10);
    }

    public void d(String str, float f10) {
        x(str, 901, f10);
    }

    public float e() {
        int i10 = this.f44460b;
        return i10 + ((this.f44462d - i10) / 2.0f);
    }

    public float f() {
        int i10 = this.f44461c;
        return i10 + ((this.f44463e - i10) / 2.0f);
    }

    public boolean g(@NonNull String str) {
        return this.f44477s.containsKey(str);
    }

    public androidx.constraintlayout.core.motion.b h(String str) {
        return this.f44477s.get(str);
    }

    public Set<String> i() {
        return this.f44477s.keySet();
    }

    public int j(String str) {
        if (this.f44477s.containsKey(str)) {
            return this.f44477s.get(str).g();
        }
        return -21880;
    }

    public float k(String str) {
        if (this.f44477s.containsKey(str)) {
            return this.f44477s.get(str).h();
        }
        return Float.NaN;
    }

    public String l() {
        androidx.constraintlayout.core.widgets.e eVar = this.f44459a;
        return eVar == null ? "unknown" : eVar.f44730o;
    }

    public androidx.constraintlayout.core.motion.utils.u m() {
        return this.f44479u;
    }

    public int n() {
        return Math.max(0, this.f44463e - this.f44461c);
    }

    public boolean q() {
        return Float.isNaN(this.f44466h) && Float.isNaN(this.f44467i) && Float.isNaN(this.f44468j) && Float.isNaN(this.f44469k) && Float.isNaN(this.f44470l) && Float.isNaN(this.f44471m) && Float.isNaN(this.f44472n) && Float.isNaN(this.f44473o) && Float.isNaN(this.f44474p);
    }

    void r(String str) {
        String str2;
        int i10 = 6 | 1;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.f44459a != null) {
            str2 = str3 + "/" + (this.f44459a.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    void s(androidx.constraintlayout.core.parser.c cVar) throws androidx.constraintlayout.core.parser.h {
        androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) cVar;
        int size = fVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.constraintlayout.core.parser.c cVarD0 = ((androidx.constraintlayout.core.parser.d) fVar.P(i10)).D0();
            String strK = cVarD0.k();
            if (strK.matches("#[0-9a-fA-F]+")) {
                y(this.f44478t, 902, Integer.parseInt(strK.substring(1), 16));
            } else if (cVarD0 instanceof androidx.constraintlayout.core.parser.e) {
                x(this.f44478t, 901, cVarD0.r());
            } else {
                z(this.f44478t, androidx.constraintlayout.core.motion.utils.v.b.f43996m, strK);
            }
        }
    }

    void t() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        String str2 = this.f44459a != null ? str + "/" + (this.f44459a.hashCode() % 1000) + " " : str + "/NULL ";
        HashMap<String, androidx.constraintlayout.core.motion.b> map = this.f44477s;
        if (map != null) {
            for (String str3 : map.keySet()) {
                System.out.println(str2 + this.f44477s.get(str3).toString());
            }
        }
    }

    public StringBuilder u(StringBuilder sb2) {
        return v(sb2, false);
    }

    public StringBuilder v(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        b(sb2, "left", this.f44460b);
        b(sb2, "top", this.f44461c);
        b(sb2, "right", this.f44462d);
        b(sb2, VerticalAlignment.BOTTOM, this.f44463e);
        a(sb2, "pivotX", this.f44464f);
        a(sb2, "pivotY", this.f44465g);
        a(sb2, "rotationX", this.f44466h);
        a(sb2, "rotationY", this.f44467i);
        a(sb2, "rotationZ", this.f44468j);
        a(sb2, "translationX", this.f44469k);
        a(sb2, "translationY", this.f44470l);
        a(sb2, "translationZ", this.f44471m);
        a(sb2, "scaleX", this.f44472n);
        a(sb2, "scaleY", this.f44473o);
        a(sb2, "alpha", this.f44474p);
        b(sb2, "visibility", this.f44476r);
        a(sb2, "interpolatedPos", this.f44475q);
        if (this.f44459a != null) {
            for (androidx.constraintlayout.core.widgets.d.a aVar : androidx.constraintlayout.core.widgets.d.a.values()) {
                w(sb2, aVar);
            }
        }
        if (z10) {
            a(sb2, "phone_orientation", f44458v);
        }
        if (z10) {
            a(sb2, "phone_orientation", f44458v);
        }
        if (this.f44477s.size() != 0) {
            sb2.append("custom : {\n");
            for (String str : this.f44477s.keySet()) {
                androidx.constraintlayout.core.motion.b bVar = this.f44477s.get(str);
                sb2.append(str);
                sb2.append(": ");
                switch (bVar.m()) {
                    case 900:
                        sb2.append(bVar.i());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case androidx.constraintlayout.core.motion.utils.v.b.f43998o /* 905 */:
                        sb2.append(bVar.h());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(androidx.constraintlayout.core.motion.b.c(bVar.i()));
                        sb2.append("',\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.v.b.f43996m /* 903 */:
                        sb2.append("'");
                        sb2.append(bVar.l());
                        sb2.append("',\n");
                        break;
                    case androidx.constraintlayout.core.motion.utils.v.b.f43997n /* 904 */:
                        sb2.append("'");
                        sb2.append(bVar.f());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void x(String str, int i10, float f10) {
        if (this.f44477s.containsKey(str)) {
            this.f44477s.get(str).u(f10);
        } else {
            this.f44477s.put(str, new androidx.constraintlayout.core.motion.b(str, i10, f10));
        }
    }

    public void y(String str, int i10, int i11) {
        if (this.f44477s.containsKey(str)) {
            this.f44477s.get(str).v(i11);
        } else {
            this.f44477s.put(str, new androidx.constraintlayout.core.motion.b(str, i10, i11));
        }
    }

    public void z(String str, int i10, String str2) {
        if (this.f44477s.containsKey(str)) {
            this.f44477s.get(str).x(str2);
        } else {
            this.f44477s.put(str, new androidx.constraintlayout.core.motion.b(str, i10, str2));
        }
    }

    public v(androidx.constraintlayout.core.widgets.e eVar) {
        this.f44459a = null;
        this.f44460b = 0;
        this.f44461c = 0;
        this.f44462d = 0;
        this.f44463e = 0;
        this.f44464f = Float.NaN;
        this.f44465g = Float.NaN;
        this.f44466h = Float.NaN;
        this.f44467i = Float.NaN;
        this.f44468j = Float.NaN;
        this.f44469k = Float.NaN;
        this.f44470l = Float.NaN;
        this.f44471m = Float.NaN;
        this.f44472n = Float.NaN;
        this.f44473o = Float.NaN;
        this.f44474p = Float.NaN;
        this.f44475q = Float.NaN;
        this.f44476r = 0;
        this.f44477s = new HashMap<>();
        this.f44478t = null;
        this.f44459a = eVar;
    }

    public v(v vVar) {
        this.f44459a = null;
        this.f44460b = 0;
        this.f44461c = 0;
        this.f44462d = 0;
        this.f44463e = 0;
        this.f44464f = Float.NaN;
        this.f44465g = Float.NaN;
        this.f44466h = Float.NaN;
        this.f44467i = Float.NaN;
        this.f44468j = Float.NaN;
        this.f44469k = Float.NaN;
        this.f44470l = Float.NaN;
        this.f44471m = Float.NaN;
        this.f44472n = Float.NaN;
        this.f44473o = Float.NaN;
        this.f44474p = Float.NaN;
        this.f44475q = Float.NaN;
        this.f44476r = 0;
        this.f44477s = new HashMap<>();
        this.f44478t = null;
        this.f44459a = vVar.f44459a;
        this.f44460b = vVar.f44460b;
        this.f44461c = vVar.f44461c;
        this.f44462d = vVar.f44462d;
        this.f44463e = vVar.f44463e;
        G(vVar);
    }
}
