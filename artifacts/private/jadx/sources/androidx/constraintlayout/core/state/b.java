package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import com.devtodev.analytics.internal.storage.sqlite.TutorialMarkEntry;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f44234a = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f44235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HashMap<String, String> f44237c;

        a(String str, String str2, HashMap<String, String> map) {
            this.f44235a = str;
            this.f44236b = str2;
            this.f44237c = map;
        }

        public String a() {
            return this.f44235a;
        }

        public HashMap<String, String> b() {
            return this.f44237c;
        }

        public String c() {
            return this.f44236b;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.b$b, reason: collision with other inner class name */
    static class C0359b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f44238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f44239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f44240c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f44242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f44243f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f44245h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f44246i;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f44241d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f44244g = 0.0f;

        C0359b(float f10, float f11, float f12, String str, String str2) {
            this.f44238a = f10;
            this.f44239b = f11;
            this.f44240c = f12;
            this.f44242e = str == null ? "" : str;
            this.f44243f = str2 == null ? "" : str2;
            this.f44246i = f11;
            this.f44245h = f10;
        }

        public ArrayList<String> a() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i10 = (int) this.f44245h;
            int i11 = (int) this.f44246i;
            int i12 = i10;
            while (i10 <= i11) {
                arrayList.add(this.f44242e + i12 + this.f44243f);
                i12 += (int) this.f44240c;
                i10++;
            }
            return arrayList;
        }

        @Override // androidx.constraintlayout.core.state.b.c
        public float value() {
            float f10 = this.f44244g;
            if (f10 >= this.f44246i) {
                this.f44241d = true;
            }
            if (!this.f44241d) {
                this.f44244g = f10 + this.f44240c;
            }
            return this.f44244g;
        }
    }

    interface c {
        float value();
    }

    static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f44247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f44248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f44249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f44250d = false;

        d(float f10, float f11) {
            this.f44247a = f10;
            this.f44248b = f11;
            this.f44249c = f10;
        }

        @Override // androidx.constraintlayout.core.state.b.c
        public float value() {
            if (!this.f44250d) {
                this.f44249c += this.f44248b;
            }
            return this.f44249c;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HashMap<String, Integer> f44251a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HashMap<String, c> f44252b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HashMap<String, ArrayList<String>> f44253c = new HashMap<>();

        float a(Object obj) {
            if (obj instanceof androidx.constraintlayout.core.parser.i) {
                String strK = ((androidx.constraintlayout.core.parser.i) obj).k();
                if (this.f44252b.containsKey(strK)) {
                    return this.f44252b.get(strK).value();
                }
                if (this.f44251a.containsKey(strK)) {
                    return this.f44251a.get(strK).floatValue();
                }
            } else if (obj instanceof androidx.constraintlayout.core.parser.e) {
                return ((androidx.constraintlayout.core.parser.e) obj).r();
            }
            return 0.0f;
        }

        ArrayList<String> b(String str) {
            if (this.f44253c.containsKey(str)) {
                return this.f44253c.get(str);
            }
            return null;
        }

        void c(String str, float f10, float f11) {
            if (this.f44252b.containsKey(str) && (this.f44252b.get(str) instanceof g)) {
                return;
            }
            this.f44252b.put(str, new d(f10, f11));
        }

        void d(String str, float f10, float f11, float f12, String str2, String str3) {
            if (this.f44252b.containsKey(str) && (this.f44252b.get(str) instanceof g)) {
                return;
            }
            C0359b c0359b = new C0359b(f10, f11, f12, str2, str3);
            this.f44252b.put(str, c0359b);
            this.f44253c.put(str, c0359b.a());
        }

        void e(String str, int i10) {
            this.f44251a.put(str, Integer.valueOf(i10));
        }

        void f(String str, ArrayList<String> arrayList) {
            this.f44253c.put(str, arrayList);
        }

        public void g(String str, float f10) {
            this.f44252b.put(str, new g(f10));
        }
    }

    public enum f {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    static class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f44258a;

        g(float f10) {
            this.f44258a = f10;
        }

        @Override // androidx.constraintlayout.core.state.b.c
        public float value() {
            return this.f44258a;
        }
    }

    private static void A(k kVar, e eVar, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        ArrayList<String> arrayListS0 = fVar.s0();
        if (arrayListS0 == null) {
            return;
        }
        for (String str : arrayListS0) {
            androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str);
            if (cVarQ instanceof androidx.constraintlayout.core.parser.e) {
                eVar.e(str, cVarQ.s());
            } else if (cVarQ instanceof androidx.constraintlayout.core.parser.f) {
                androidx.constraintlayout.core.parser.f fVar2 = (androidx.constraintlayout.core.parser.f) cVarQ;
                if (fVar2.q0("from") && fVar2.q0("to")) {
                    eVar.d(str, eVar.a(fVar2.Q("from")), eVar.a(fVar2.Q("to")), 1.0f, fVar2.p0("prefix"), fVar2.p0("postfix"));
                } else if (fVar2.q0("from") && fVar2.q0(TutorialMarkEntry.step)) {
                    eVar.c(str, eVar.a(fVar2.Q("from")), eVar.a(fVar2.Q(TutorialMarkEntry.step)));
                } else if (fVar2.q0("ids")) {
                    androidx.constraintlayout.core.parser.a aVarT = fVar2.T("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i10 = 0; i10 < aVarT.size(); i10++) {
                        arrayList.add(aVarT.l0(i10));
                    }
                    eVar.f(str, arrayList);
                } else if (fVar2.q0("tag")) {
                    eVar.f(str, kVar.p(fVar2.m0("tag")));
                }
            }
        }
    }

    static void B(k kVar, e eVar, androidx.constraintlayout.core.state.a aVar, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        if (aVar.Y() == null) {
            aVar.A0(androidx.constraintlayout.core.state.e.s());
        }
        if (aVar.G() == null) {
            aVar.t0(androidx.constraintlayout.core.state.e.s());
        }
        ArrayList<String> arrayListS0 = fVar.s0();
        if (arrayListS0 == null) {
            return;
        }
        Iterator<String> it = arrayListS0.iterator();
        while (it.hasNext()) {
            a(kVar, eVar, aVar, fVar, it.next());
        }
    }

    static void C(k kVar, e eVar, String str, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        B(kVar, eVar, kVar.f(str), fVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    @b1({b1.a.LIBRARY_GROUP})
    public static void D(@NonNull androidx.constraintlayout.core.parser.f fVar, @NonNull k kVar, @NonNull e eVar) throws androidx.constraintlayout.core.parser.h {
        ArrayList<String> arrayListS0 = fVar.s0();
        if (arrayListS0 == null) {
            return;
        }
        for (String str : arrayListS0) {
            androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str);
            str.getClass();
            switch (str) {
                case "Helpers":
                    if (!(cVarQ instanceof androidx.constraintlayout.core.parser.a)) {
                        break;
                    } else {
                        u(kVar, eVar, (androidx.constraintlayout.core.parser.a) cVarQ);
                        break;
                    }
                    break;
                case "Generate":
                    if (!(cVarQ instanceof androidx.constraintlayout.core.parser.f)) {
                        break;
                    } else {
                        p(kVar, eVar, (androidx.constraintlayout.core.parser.f) cVarQ);
                        break;
                    }
                    break;
                case "Variables":
                    if (!(cVarQ instanceof androidx.constraintlayout.core.parser.f)) {
                        break;
                    } else {
                        A(kVar, eVar, (androidx.constraintlayout.core.parser.f) cVarQ);
                        break;
                    }
                    break;
                default:
                    if (!(cVarQ instanceof androidx.constraintlayout.core.parser.f)) {
                        if (cVarQ instanceof androidx.constraintlayout.core.parser.e) {
                            eVar.e(str, cVarQ.s());
                        }
                        break;
                    } else {
                        androidx.constraintlayout.core.parser.f fVar2 = (androidx.constraintlayout.core.parser.f) cVarQ;
                        String strC = c(fVar2);
                        if (strC == null) {
                            C(kVar, eVar, str, fVar2);
                            break;
                        } else {
                            switch (strC) {
                                case "vGuideline":
                                    s(1, kVar, str, fVar2);
                                    break;
                                case "column":
                                case "row":
                                case "grid":
                                    q(strC, kVar, str, eVar, fVar2);
                                    break;
                                case "hChain":
                                case "vChain":
                                    g(strC, kVar, str, eVar, fVar2);
                                    break;
                                case "barrier":
                                    e(kVar, str, fVar2);
                                    break;
                                case "hFlow":
                                case "vFlow":
                                    o(strC, kVar, str, eVar, fVar2);
                                    break;
                                case "hGuideline":
                                    s(0, kVar, str, fVar2);
                                    break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    private static float E(k kVar, float f10) {
        return kVar.k().a(f10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:4:0x0016  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static void a(k kVar, e eVar, androidx.constraintlayout.core.state.a aVar, androidx.constraintlayout.core.parser.f fVar, String str) throws androidx.constraintlayout.core.parser.h {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                if (!str.equals("centerVertically")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1364013995:
                if (!str.equals("center")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1349088399:
                if (!str.equals(cj.h.L)) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -1249320806:
                if (!str.equals("rotationX")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -1249320805:
                if (!str.equals("rotationY")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -1249320804:
                if (!str.equals("rotationZ")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -1225497657:
                if (!str.equals("translationX")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case -1225497656:
                if (!str.equals("translationY")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case -1225497655:
                if (!str.equals("translationZ")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case -1221029593:
                if (!str.equals("height")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case -1068318794:
                if (!str.equals("motion")) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case -987906986:
                if (!str.equals("pivotX")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case -987906985:
                if (!str.equals("pivotY")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case -908189618:
                if (!str.equals("scaleX")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case -908189617:
                if (!str.equals("scaleY")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case -247669061:
                if (!str.equals("hRtlBias")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case -61505906:
                if (!str.equals("vWeight")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
            case 92909918:
                if (!str.equals("alpha")) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 98116417:
                if (!str.equals("hBias")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116468u;
                }
                break;
            case 111045711:
                if (!str.equals("vBias")) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case 113126854:
                if (!str.equals("width")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116471x;
                }
                break;
            case 398344448:
                if (!str.equals("hWeight")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116472y;
                }
                break;
            case 1404070310:
                if (!str.equals("centerHorizontally")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116473z;
                }
                break;
            case 1941332754:
                if (!str.equals("visibility")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.A;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                String strM0 = fVar.m0(str);
                boolean zEquals = strM0.equals("parent");
                Object obj = strM0;
                if (zEquals) {
                    obj = k.f44330o;
                }
                androidx.constraintlayout.core.state.a aVarF = kVar.f(obj);
                aVar.H0(aVarF);
                aVar.q(aVarF);
                break;
            case 1:
                String strM1 = fVar.m0(str);
                androidx.constraintlayout.core.state.a aVarF2 = strM1.equals("parent") ? kVar.f(k.f44330o) : kVar.f(strM1);
                aVar.D0(aVarF2);
                aVar.C(aVarF2);
                aVar.H0(aVarF2);
                aVar.q(aVarF2);
                break;
            case 2:
                k(fVar, aVar, str);
                break;
            case 3:
                aVar.n0(eVar.a(fVar.Q(str)));
                break;
            case 4:
                aVar.o0(eVar.a(fVar.Q(str)));
                break;
            case 5:
                aVar.p0(eVar.a(fVar.Q(str)));
                break;
            case 6:
                aVar.I0(E(kVar, eVar.a(fVar.Q(str))));
                break;
            case 7:
                aVar.J0(E(kVar, eVar.a(fVar.Q(str))));
                break;
            case 8:
                aVar.K0(E(kVar, eVar.a(fVar.Q(str))));
                break;
            case 9:
                aVar.t0(m(fVar, str, kVar, kVar.k()));
                break;
            case 10:
                x(fVar.Q(str), aVar);
                break;
            case 11:
                aVar.i0(eVar.a(fVar.Q(str)));
                break;
            case 12:
                aVar.j0(eVar.a(fVar.Q(str)));
                break;
            case 13:
                aVar.q0(eVar.a(fVar.Q(str)));
                break;
            case 14:
                aVar.r0(eVar.a(fVar.Q(str)));
                break;
            case 15:
                float fA = eVar.a(fVar.Q(str));
                if (kVar.A()) {
                    fA = 1.0f - fA;
                }
                aVar.a0(fA);
                break;
            case 16:
                aVar.y0(eVar.a(fVar.Q(str)));
                break;
            case 17:
                aVar.g(eVar.a(fVar.Q(str)));
                break;
            case 18:
                aVar.a0(eVar.a(fVar.Q(str)));
                break;
            case 19:
                aVar.M0(eVar.a(fVar.Q(str)));
                break;
            case 20:
                aVar.A0(m(fVar, str, kVar, kVar.k()));
                break;
            case 21:
                aVar.v0(eVar.a(fVar.Q(str)));
                break;
            case 22:
                String strM2 = fVar.m0(str);
                boolean zEquals2 = strM2.equals("parent");
                Object obj2 = strM2;
                if (zEquals2) {
                    obj2 = k.f44330o;
                }
                androidx.constraintlayout.core.state.a aVarF3 = kVar.f(obj2);
                aVar.D0(aVarF3);
                aVar.C(aVarF3);
                break;
            case 23:
                String strM3 = fVar.m0(str);
                strM3.getClass();
                switch (strM3) {
                    case "invisible":
                        aVar.N0(4);
                        aVar.g(0.0f);
                        break;
                    case "gone":
                        aVar.N0(8);
                        break;
                    case "visible":
                        aVar.N0(0);
                        break;
                    default:
                        break;
                }
                break;
            default:
                i(kVar, eVar, fVar, aVar, str);
                break;
        }
    }

    private static int b(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    static String c(androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        Iterator<String> it = fVar.s0().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return fVar.m0("type");
            }
        }
        return null;
    }

    static void d(androidx.constraintlayout.core.parser.f fVar, String str, androidx.constraintlayout.core.parser.f fVar2) throws androidx.constraintlayout.core.parser.h {
        if (!fVar.q0(str)) {
            fVar.t0(str, fVar2);
            return;
        }
        androidx.constraintlayout.core.parser.f fVarC0 = fVar.c0(str);
        for (String str2 : fVar2.s0()) {
            if (str2.equals("clear")) {
                androidx.constraintlayout.core.parser.a aVarT = fVar2.T("clear");
                for (int i10 = 0; i10 < aVarT.size(); i10++) {
                    String strN0 = aVarT.n0(i10);
                    if (strN0 != null) {
                        switch (strN0) {
                            case "transforms":
                                fVarC0.z0("visibility");
                                fVarC0.z0("alpha");
                                fVarC0.z0("pivotX");
                                fVarC0.z0("pivotY");
                                fVarC0.z0("rotationX");
                                fVarC0.z0("rotationY");
                                fVarC0.z0("rotationZ");
                                fVarC0.z0("scaleX");
                                fVarC0.z0("scaleY");
                                fVarC0.z0("translationX");
                                fVarC0.z0("translationY");
                                break;
                            case "constraints":
                                fVarC0.z0("start");
                                fVarC0.z0("end");
                                fVarC0.z0("top");
                                fVarC0.z0(VerticalAlignment.BOTTOM);
                                fVarC0.z0("baseline");
                                fVarC0.z0("center");
                                fVarC0.z0("centerHorizontally");
                                fVarC0.z0("centerVertically");
                                break;
                            case "dimensions":
                                fVarC0.z0("width");
                                fVarC0.z0("height");
                                break;
                            default:
                                fVarC0.z0(strN0);
                                break;
                        }
                    }
                }
            } else {
                fVarC0.t0(str2, fVar2.Q(str2));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    static void e(k kVar, String str, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        boolean zA = kVar.A();
        androidx.constraintlayout.core.state.helpers.c cVarB = kVar.b(str, k.c.END);
        ArrayList<String> arrayListS0 = fVar.s0();
        if (arrayListS0 != null) {
            for (String str2 : arrayListS0) {
                str2.getClass();
                byte b10 = 2;
                switch (str2) {
                    case "margin":
                        float fZ = fVar.Z(str2);
                        if (!Float.isNaN(fZ)) {
                            cVarB.f0(Float.valueOf(E(kVar, fZ)));
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "direction":
                        String strM0 = fVar.m0(str2);
                        strM0.getClass();
                        switch (strM0.hashCode()) {
                            case -1383228885:
                                if (strM0.equals(VerticalAlignment.BOTTOM)) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 100571:
                                if (strM0.equals("end")) {
                                    b10 = 1;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 115029:
                                if (!strM0.equals("top")) {
                                    b10 = -1;
                                }
                                break;
                            case 3317767:
                                if (strM0.equals("left")) {
                                    b10 = 3;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 108511772:
                                if (strM0.equals("right")) {
                                    b10 = 4;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 109757538:
                                if (strM0.equals("start")) {
                                    b10 = 5;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            case 0:
                                cVarB.U0(k.c.BOTTOM);
                                break;
                            case 1:
                                if (zA) {
                                    cVarB.U0(k.c.LEFT);
                                } else {
                                    cVarB.U0(k.c.RIGHT);
                                }
                                break;
                            case 2:
                                cVarB.U0(k.c.TOP);
                                break;
                            case 3:
                                cVarB.U0(k.c.LEFT);
                                break;
                            case 4:
                                cVarB.U0(k.c.RIGHT);
                                break;
                            case 5:
                                if (zA) {
                                    cVarB.U0(k.c.RIGHT);
                                } else {
                                    cVarB.U0(k.c.LEFT);
                                }
                                break;
                        }
                        break;
                    case "contains":
                        androidx.constraintlayout.core.parser.a aVarV = fVar.V(str2);
                        if (aVarV == null) {
                            break;
                        } else {
                            for (int i10 = 0; i10 < aVarV.size(); i10++) {
                                cVarB.P0(kVar.f(aVarV.P(i10).k()));
                            }
                            break;
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    static void f(int i10, k kVar, e eVar, androidx.constraintlayout.core.parser.a aVar) throws androidx.constraintlayout.core.parser.h {
        String strK;
        androidx.constraintlayout.core.state.helpers.d dVarV = i10 == 0 ? kVar.v() : kVar.M();
        androidx.constraintlayout.core.parser.c cVarP = aVar.P(1);
        if (cVarP instanceof androidx.constraintlayout.core.parser.a) {
            androidx.constraintlayout.core.parser.a aVar2 = (androidx.constraintlayout.core.parser.a) cVarP;
            if (aVar2.size() >= 1) {
                for (int i11 = 0; i11 < aVar2.size(); i11++) {
                    dVarV.P0(aVar2.l0(i11));
                }
                if (aVar.size() > 2) {
                    androidx.constraintlayout.core.parser.c cVarP2 = aVar.P(2);
                    if (cVarP2 instanceof androidx.constraintlayout.core.parser.f) {
                        androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) cVarP2;
                        for (String str : fVar.s0()) {
                            str.getClass();
                            if (str.equals("style")) {
                                androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str);
                                if (cVarQ instanceof androidx.constraintlayout.core.parser.a) {
                                    androidx.constraintlayout.core.parser.a aVar3 = (androidx.constraintlayout.core.parser.a) cVarQ;
                                    if (aVar3.size() > 1) {
                                        strK = aVar3.l0(0);
                                        dVarV.n(aVar3.getFloat(1));
                                    } else {
                                        strK = cVarQ.k();
                                    }
                                } else {
                                    strK = cVarQ.k();
                                }
                                strK.getClass();
                                if (strK.equals("packed")) {
                                    dVarV.e1(k.a.PACKED);
                                } else if (strK.equals("spread_inside")) {
                                    dVarV.e1(k.a.SPREAD_INSIDE);
                                } else {
                                    dVarV.e1(k.a.SPREAD);
                                }
                            } else {
                                i(kVar, eVar, fVar, dVarV, str);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x022b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0208 A[SYNTHETIC] */
    private static void g(String str, k kVar, String str2, e eVar, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        androidx.constraintlayout.core.parser.a aVar;
        int i10;
        float f10;
        float fE;
        float fE2;
        float f11;
        float f12;
        String strK;
        int i11 = 0;
        androidx.constraintlayout.core.state.helpers.d dVarV = str.charAt(0) == 'h' ? kVar.v() : kVar.M();
        dVarV.c(str2);
        for (String str3 : fVar.s0()) {
            str3.getClass();
            int i12 = 6;
            int i13 = 3;
            int i14 = 2;
            int i15 = 1;
            int i16 = -1;
            switch (str3) {
                case "bottom":
                    i16 = i11;
                case "contains":
                    i16 = 1;
                case "end":
                    i16 = 2;
                case "top":
                    i16 = 3;
                case "left":
                    i16 = 4;
                case "right":
                    i16 = 5;
                case "start":
                    i16 = 6;
                case "style":
                    i16 = 7;
                default:
                    switch (i16) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            i(kVar, eVar, fVar, dVarV, str3);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            i11 = 0;
                            break;
                        case 1:
                            androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str3);
                            if (cVarQ instanceof androidx.constraintlayout.core.parser.a) {
                                androidx.constraintlayout.core.parser.a aVar2 = (androidx.constraintlayout.core.parser.a) cVarQ;
                                if (aVar2.size() >= 1) {
                                    int i17 = i11;
                                    while (i17 < aVar2.size()) {
                                        androidx.constraintlayout.core.parser.c cVarP = aVar2.P(i17);
                                        if (cVarP instanceof androidx.constraintlayout.core.parser.a) {
                                            androidx.constraintlayout.core.parser.a aVar3 = (androidx.constraintlayout.core.parser.a) cVarP;
                                            if (aVar3.size() > 0) {
                                                String strK2 = aVar3.P(i11).k();
                                                int size = aVar3.size();
                                                if (size != i14) {
                                                    if (size == i13) {
                                                        androidx.constraintlayout.core.parser.a aVar4 = aVar2;
                                                        f10 = aVar3.getFloat(i15);
                                                        aVar = aVar4;
                                                        i17 = i17;
                                                        i15 = i15;
                                                        fE = E(kVar, aVar3.getFloat(i14));
                                                        strK2 = strK2;
                                                        fE2 = Float.NaN;
                                                        i10 = i14;
                                                        f12 = fE;
                                                        f11 = Float.NaN;
                                                    } else if (size == 4) {
                                                        float f13 = aVar3.getFloat(i15);
                                                        float fE3 = E(kVar, aVar3.getFloat(i14));
                                                        i13 = 3;
                                                        androidx.constraintlayout.core.parser.a aVar5 = aVar2;
                                                        f10 = f13;
                                                        aVar = aVar5;
                                                        i15 = i15;
                                                        fE = E(kVar, aVar3.getFloat(3));
                                                        f11 = Float.NaN;
                                                        i10 = i14;
                                                        f12 = fE3;
                                                        i17 = i17;
                                                        strK2 = strK2;
                                                        fE2 = Float.NaN;
                                                    } else if (size != i12) {
                                                        aVar = aVar2;
                                                        f10 = Float.NaN;
                                                        fE = Float.NaN;
                                                    } else {
                                                        float f14 = aVar3.getFloat(i15);
                                                        float fE4 = E(kVar, aVar3.getFloat(i14));
                                                        float fE5 = E(kVar, aVar3.getFloat(i13));
                                                        float fE6 = E(kVar, aVar3.getFloat(4));
                                                        int i18 = i14;
                                                        f12 = fE4;
                                                        aVar = aVar2;
                                                        f10 = f14;
                                                        i10 = i18;
                                                        i15 = i15;
                                                        fE = fE5;
                                                        i17 = i17;
                                                        strK2 = strK2;
                                                        fE2 = E(kVar, aVar3.getFloat(5));
                                                        f11 = fE6;
                                                        i13 = 3;
                                                    }
                                                    dVarV.U0(strK2, f10, f12, fE, f11, fE2);
                                                } else {
                                                    float f15 = aVar3.getFloat(i15);
                                                    androidx.constraintlayout.core.parser.a aVar6 = aVar2;
                                                    f10 = f15;
                                                    aVar = aVar6;
                                                    fE = Float.NaN;
                                                }
                                                f11 = fE;
                                                fE2 = f11;
                                                i10 = i14;
                                                f12 = fE2;
                                                dVarV.U0(strK2, f10, f12, fE, f11, fE2);
                                            } else {
                                                i17 = i17;
                                                aVar = aVar2;
                                                i10 = i14;
                                                i15 = i15;
                                            }
                                        } else {
                                            i17 = i17;
                                            aVar = aVar2;
                                            i10 = i14;
                                            i15 = i15;
                                            dVarV.P0(cVarP.k());
                                        }
                                        i17++;
                                        aVar2 = aVar;
                                        i14 = i10;
                                        i15 = i15;
                                        i11 = 0;
                                        i12 = 6;
                                    }
                                    break;
                                }
                            }
                            System.err.println(str2 + " contains should be an array \"" + cVarQ.k() + "\"");
                            return;
                        case 7:
                            androidx.constraintlayout.core.parser.c cVarQ2 = fVar.Q(str3);
                            if (cVarQ2 instanceof androidx.constraintlayout.core.parser.a) {
                                androidx.constraintlayout.core.parser.a aVar7 = (androidx.constraintlayout.core.parser.a) cVarQ2;
                                if (aVar7.size() > 1) {
                                    strK = aVar7.l0(i11);
                                    dVarV.n(aVar7.getFloat(1));
                                } else {
                                    strK = cVarQ2.k();
                                }
                            } else {
                                strK = cVarQ2.k();
                            }
                            strK.getClass();
                            if (strK.equals("packed")) {
                                dVarV.e1(k.a.PACKED);
                            } else if (strK.equals("spread_inside")) {
                                dVarV.e1(k.a.SPREAD_INSIDE);
                            } else {
                                dVarV.e1(k.a.SPREAD);
                            }
                            break;
                    }
            }
        }
    }

    static long h(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF" + strSubstring;
        }
        return Long.parseLong(strSubstring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x019c  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:167:0x0275  */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0139  */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00da. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    static void i(k kVar, e eVar, androidx.constraintlayout.core.parser.f fVar, androidx.constraintlayout.core.state.a aVar, String str) throws androidx.constraintlayout.core.parser.h {
        boolean z10;
        char c10;
        boolean z11;
        boolean z12;
        ?? r16;
        boolean z13;
        boolean zA = kVar.A();
        boolean z14 = !zA;
        androidx.constraintlayout.core.parser.a aVarV = fVar.V(str);
        if (aVarV == null || aVarV.size() <= 1) {
            String strP0 = fVar.p0(str);
            if (strP0 != null) {
                androidx.constraintlayout.core.state.a aVarF = strP0.equals("parent") ? kVar.f(k.f44330o) : kVar.f(strP0);
                str.getClass();
                switch (str) {
                    case "baseline":
                        kVar.c(aVar.getKey());
                        kVar.c(aVarF.getKey());
                        aVar.k(aVarF);
                        break;
                    case "bottom":
                        aVar.q(aVarF);
                        break;
                    case "end":
                        if (zA) {
                            aVar.c0(aVarF);
                            break;
                        } else {
                            aVar.m0(aVarF);
                            break;
                        }
                        break;
                    case "top":
                        aVar.H0(aVarF);
                        break;
                    case "start":
                        if (zA) {
                            aVar.m0(aVarF);
                            break;
                        } else {
                            aVar.c0(aVarF);
                            break;
                        }
                        break;
                }
            }
            return;
        }
        String strL0 = aVarV.l0(0);
        String strN0 = aVarV.n0(1);
        float fE = aVarV.size() > 2 ? E(kVar, eVar.a(aVarV.h0(2))) : 0.0f;
        float fE2 = aVarV.size() > 3 ? E(kVar, eVar.a(aVarV.h0(3))) : 0.0f;
        androidx.constraintlayout.core.state.a aVarF2 = strL0.equals("parent") ? kVar.f(k.f44330o) : kVar.f(strL0);
        str.getClass();
        float f10 = fE;
        switch (str) {
            case "baseline":
                z10 = true;
                c10 = 2;
                strN0.getClass();
                switch (strN0) {
                    case "baseline":
                        kVar.c(aVar.getKey());
                        kVar.c(aVarF2.getKey());
                        aVar.k(aVarF2);
                        break;
                    case "bottom":
                        kVar.c(aVar.getKey());
                        aVar.l(aVarF2);
                        break;
                    case "top":
                        kVar.c(aVar.getKey());
                        aVar.m(aVarF2);
                        break;
                }
                z11 = z10;
                z12 = false;
                break;
            case "circular":
                z10 = true;
                c10 = 2;
                aVar.u(aVarF2, eVar.a(aVarV.P(1)), aVarV.size() > 2 ? E(kVar, eVar.a(aVarV.h0(2))) : 0.0f);
                z11 = z10;
                z12 = false;
                break;
            case "bottom":
                strN0.getClass();
                switch (strN0) {
                    case "baseline":
                        kVar.c(aVarF2.getKey());
                        aVar.p(aVarF2);
                        break;
                    case "bottom":
                        aVar.q(aVarF2);
                        break;
                    case "top":
                        aVar.r(aVarF2);
                        break;
                }
                z10 = true;
                c10 = 2;
                z11 = z10;
                z12 = false;
                break;
            case "end":
                z11 = zA;
                z10 = true;
                c10 = 2;
                z12 = true;
                break;
            case "top":
                strN0.getClass();
                switch (strN0) {
                    case "baseline":
                        kVar.c(aVarF2.getKey());
                        aVar.F0(aVarF2);
                        break;
                    case "bottom":
                        aVar.G0(aVarF2);
                        break;
                    case "top":
                        aVar.H0(aVarF2);
                        break;
                }
                z10 = true;
                c10 = 2;
                z11 = z10;
                z12 = false;
                break;
            case "left":
                z11 = true;
                z10 = true;
                c10 = 2;
                z12 = true;
                break;
            case "right":
                z11 = false;
                z10 = true;
                c10 = 2;
                z12 = true;
                break;
            case "start":
                z11 = z14;
                z10 = true;
                c10 = 2;
                z12 = true;
                break;
            default:
                z10 = true;
                c10 = 2;
                z11 = z10;
                z12 = false;
                break;
        }
        if (z12) {
            strN0.getClass();
            switch (strN0.hashCode()) {
                case 100571:
                    if (!strN0.equals("end")) {
                        r16 = -1;
                    } else {
                        r16 = 0;
                    }
                    break;
                case 3317767:
                    if (!strN0.equals("left")) {
                        r16 = -1;
                    } else {
                        r16 = z10;
                    }
                    break;
                case 108511772:
                    if (!strN0.equals("right")) {
                        r16 = -1;
                    } else {
                        r16 = c10;
                    }
                    break;
                case 109757538:
                    if (!strN0.equals("start")) {
                        r16 = -1;
                    } else {
                        r16 = 3;
                    }
                    break;
                default:
                    r16 = -1;
                    break;
            }
            switch (r16) {
                case 0:
                    z13 = zA;
                    break;
                case 1:
                default:
                    z13 = z10;
                    break;
                case 2:
                    z13 = false;
                    break;
                case 3:
                    z13 = z14;
                    break;
            }
            if (z11) {
                if (z13) {
                    aVar.c0(aVarF2);
                } else {
                    aVar.d0(aVarF2);
                }
            } else if (z13) {
                aVar.l0(aVarF2);
            } else {
                aVar.m0(aVarF2);
            }
        }
        aVar.f0(Float.valueOf(f10)).h0(Float.valueOf(fE2));
    }

    static void j(androidx.constraintlayout.core.state.c cVar, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        ArrayList<String> arrayListS0 = fVar.s0();
        if (arrayListS0 == null) {
            return;
        }
        for (String str : arrayListS0) {
            androidx.constraintlayout.core.parser.f fVarC0 = fVar.c0(str);
            String strP0 = fVarC0.p0("Extends");
            if (strP0 == null || strP0.isEmpty()) {
                cVar.b(str, fVarC0.L());
            } else {
                String strD = cVar.d(strP0);
                if (strD != null) {
                    androidx.constraintlayout.core.parser.f fVarD = androidx.constraintlayout.core.parser.g.d(strD);
                    ArrayList<String> arrayListS1 = fVarC0.s0();
                    if (arrayListS1 != null) {
                        for (String str2 : arrayListS1) {
                            androidx.constraintlayout.core.parser.c cVarQ = fVarC0.Q(str2);
                            if (cVarQ instanceof androidx.constraintlayout.core.parser.f) {
                                d(fVarD, str2, (androidx.constraintlayout.core.parser.f) cVarQ);
                            }
                        }
                        cVar.b(str, fVarD.L());
                    }
                }
            }
        }
    }

    static void k(androidx.constraintlayout.core.parser.f fVar, androidx.constraintlayout.core.state.a aVar, String str) throws androidx.constraintlayout.core.parser.h {
        ArrayList<String> arrayListS0;
        androidx.constraintlayout.core.parser.f fVarE0 = fVar.e0(str);
        if (fVarE0 == null || (arrayListS0 = fVarE0.s0()) == null) {
            return;
        }
        for (String str2 : arrayListS0) {
            androidx.constraintlayout.core.parser.c cVarQ = fVarE0.Q(str2);
            if (cVarQ instanceof androidx.constraintlayout.core.parser.e) {
                aVar.f(str2, cVarQ.r());
            } else if (cVarQ instanceof androidx.constraintlayout.core.parser.i) {
                long jH = h(cVarQ.k());
                if (jH != -1) {
                    aVar.e(str2, (int) jH);
                }
            }
        }
    }

    public static void l(String str, ArrayList<a> arrayList) throws androidx.constraintlayout.core.parser.h {
        androidx.constraintlayout.core.parser.f fVarD = androidx.constraintlayout.core.parser.g.d(str);
        ArrayList<String> arrayListS0 = fVarD.s0();
        if (arrayListS0 != null && arrayListS0.size() > 0) {
            String str2 = arrayListS0.get(0);
            androidx.constraintlayout.core.parser.c cVarQ = fVarD.Q(str2);
            str2.getClass();
            if (str2.equals("Design") && (cVarQ instanceof androidx.constraintlayout.core.parser.f)) {
                androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) cVarQ;
                ArrayList<String> arrayListS1 = fVar.s0();
                for (int i10 = 0; i10 < arrayListS1.size(); i10++) {
                    String str3 = arrayListS1.get(i10);
                    androidx.constraintlayout.core.parser.f fVar2 = (androidx.constraintlayout.core.parser.f) fVar.Q(str3);
                    System.out.printf("element found " + str3 + "", new Object[0]);
                    String strP0 = fVar2.p0("type");
                    if (strP0 != null) {
                        HashMap map = new HashMap();
                        int size = fVar2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            androidx.constraintlayout.core.parser.d dVar = (androidx.constraintlayout.core.parser.d) fVar2.P(i10);
                            String strK = dVar.k();
                            String strK2 = dVar.D0().k();
                            if (strK2 != null) {
                                map.put(strK, strK2);
                            }
                        }
                        arrayList.add(new a(str2, strP0, map));
                    }
                }
            }
        }
    }

    static androidx.constraintlayout.core.state.e m(androidx.constraintlayout.core.parser.f fVar, String str, k kVar, androidx.constraintlayout.core.state.d dVar) throws androidx.constraintlayout.core.parser.h {
        androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str);
        androidx.constraintlayout.core.state.e eVarK = androidx.constraintlayout.core.state.e.k(0);
        if (cVarQ instanceof androidx.constraintlayout.core.parser.i) {
            return n(cVarQ.k());
        }
        if (cVarQ instanceof androidx.constraintlayout.core.parser.e) {
            return androidx.constraintlayout.core.state.e.k(kVar.g(Float.valueOf(dVar.a(fVar.Y(str)))));
        }
        if (cVarQ instanceof androidx.constraintlayout.core.parser.f) {
            androidx.constraintlayout.core.parser.f fVar2 = (androidx.constraintlayout.core.parser.f) cVarQ;
            String strP0 = fVar2.p0("value");
            if (strP0 != null) {
                eVarK = n(strP0);
            }
            androidx.constraintlayout.core.parser.c cVarI0 = fVar2.i0("min");
            if (cVarI0 != null) {
                if (cVarI0 instanceof androidx.constraintlayout.core.parser.e) {
                    eVarK.z(kVar.g(Float.valueOf(dVar.a(((androidx.constraintlayout.core.parser.e) cVarI0).r()))));
                } else if (cVarI0 instanceof androidx.constraintlayout.core.parser.i) {
                    eVarK.A(androidx.constraintlayout.core.state.e.f44260j);
                }
            }
            androidx.constraintlayout.core.parser.c cVarI1 = fVar2.i0("max");
            if (cVarI1 != null) {
                if (cVarI1 instanceof androidx.constraintlayout.core.parser.e) {
                    eVarK.x(kVar.g(Float.valueOf(dVar.a(((androidx.constraintlayout.core.parser.e) cVarI1).r()))));
                    return eVarK;
                }
                if (cVarI1 instanceof androidx.constraintlayout.core.parser.i) {
                    eVarK.y(androidx.constraintlayout.core.state.e.f44260j);
                }
            }
        }
        return eVarK;
    }

    static androidx.constraintlayout.core.state.e n(String str) {
        androidx.constraintlayout.core.state.e eVarK = androidx.constraintlayout.core.state.e.k(0);
        str.getClass();
        switch (str) {
            case "preferWrap":
                return androidx.constraintlayout.core.state.e.r(androidx.constraintlayout.core.state.e.f44260j);
            case "parent":
                return androidx.constraintlayout.core.state.e.m();
            case "spread":
                return androidx.constraintlayout.core.state.e.r(androidx.constraintlayout.core.state.e.f44261k);
            case "wrap":
                return androidx.constraintlayout.core.state.e.s();
            default:
                if (str.endsWith("%")) {
                    return androidx.constraintlayout.core.state.e.n(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).E(0);
                }
                return str.contains(":") ? androidx.constraintlayout.core.state.e.o(str).F(androidx.constraintlayout.core.state.e.f44261k) : eVarK;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0243  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:140:0x0315  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:194:0x0425  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void o(String str, k kVar, String str2, e eVar, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        int i10;
        float f10;
        int i11;
        String strK;
        String strL0;
        String strL1;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        String strK2;
        String strL2;
        String strL3;
        float fS;
        float f11;
        float f12;
        float f13;
        Float fValueOf4;
        Float fValueOf5;
        Float fValueOf6;
        float f14;
        float fE;
        float f15;
        float f16;
        float f17 = 0.5f;
        Float fValueOf7 = Float.valueOf(0.5f);
        int i12 = 0;
        androidx.constraintlayout.core.state.helpers.f fVarL = kVar.l(str2, str.charAt(0) == 'v');
        for (String str3 : fVar.s0()) {
            str3.getClass();
            int i13 = 4;
            switch (str3.hashCode()) {
                case -1254185091:
                    i10 = str3.equals("hAlign") ? i12 : -1;
                    break;
                case -1237307863:
                    i10 = str3.equals("hStyle") ? 1 : -1;
                    break;
                case -1198076529:
                    i10 = str3.equals("hFlowBias") ? 2 : -1;
                    break;
                case -853376977:
                    i10 = str3.equals("vAlign") ? 3 : -1;
                    break;
                case -836499749:
                    i10 = str3.equals("vStyle") ? 4 : -1;
                    break;
                case -806339567:
                    i10 = str3.equals("padding") ? 5 : -1;
                    break;
                case -732635235:
                    i10 = str3.equals("vFlowBias") ? 6 : -1;
                    break;
                case -567445985:
                    i10 = str3.equals("contains") ? 7 : -1;
                    break;
                case -488900360:
                    i10 = str3.equals("maxElement") ? 8 : -1;
                    break;
                case 3169614:
                    i10 = str3.equals("hGap") ? 9 : -1;
                    break;
                case 3575610:
                    i10 = str3.equals("type") ? 10 : -1;
                    break;
                case 3586688:
                    i10 = str3.equals("vGap") ? 11 : -1;
                    break;
                case 3657802:
                    i10 = str3.equals("wrap") ? 12 : -1;
                    break;
                default:
                    i10 = -1;
                    break;
            }
            switch (i10) {
                case 0:
                    f10 = f17;
                    String strK3 = fVar.Q(str3).k();
                    strK3.getClass();
                    if (strK3.equals("end")) {
                        i11 = 0;
                        fVarL.z1(1);
                    } else if (strK3.equals("start")) {
                        i11 = 0;
                        fVarL.z1(0);
                    } else {
                        fVarL.z1(2);
                        i11 = 0;
                    }
                    i12 = i11;
                    f17 = f10;
                    break;
                case 1:
                    f10 = f17;
                    androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str3);
                    if (cVarQ instanceof androidx.constraintlayout.core.parser.a) {
                        androidx.constraintlayout.core.parser.a aVar = (androidx.constraintlayout.core.parser.a) cVarQ;
                        if (aVar.size() > 1) {
                            strL0 = aVar.l0(0);
                            strK = aVar.l0(1);
                            strL1 = aVar.size() > 2 ? aVar.l0(2) : "";
                        } else {
                            strK = cVarQ.k();
                            strL0 = "";
                            strL1 = strL0;
                        }
                    } else {
                        strK = cVarQ.k();
                        strL0 = "";
                        strL1 = strL0;
                    }
                    if (!strK.equals("")) {
                        fVarL.B1(k.a.n(strK));
                    }
                    if (!strL0.equals("")) {
                        fVarL.w1(k.a.n(strL0));
                    }
                    if (!strL1.equals("")) {
                        fVarL.D1(k.a.n(strL1));
                    }
                    i11 = 0;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 2:
                    f10 = f17;
                    androidx.constraintlayout.core.parser.c cVarQ2 = fVar.Q(str3);
                    if (cVarQ2 instanceof androidx.constraintlayout.core.parser.a) {
                        androidx.constraintlayout.core.parser.a aVar2 = (androidx.constraintlayout.core.parser.a) cVarQ2;
                        if (aVar2.size() > 1) {
                            fValueOf2 = Float.valueOf(aVar2.getFloat(0));
                            fValueOf = Float.valueOf(aVar2.getFloat(1));
                            fValueOf3 = aVar2.size() > 2 ? Float.valueOf(aVar2.getFloat(2)) : fValueOf7;
                        } else {
                            fValueOf = Float.valueOf(cVarQ2.r());
                            fValueOf2 = fValueOf7;
                            fValueOf3 = fValueOf2;
                        }
                    } else {
                        fValueOf = Float.valueOf(cVarQ2.r());
                        fValueOf2 = fValueOf7;
                        fValueOf3 = fValueOf2;
                    }
                    fVarL.a0(fValueOf.floatValue());
                    if (fValueOf2.floatValue() != f10) {
                        fVarL.v1(fValueOf2.floatValue());
                    }
                    if (fValueOf3.floatValue() != f10) {
                        fVarL.C1(fValueOf3.floatValue());
                    }
                    i11 = 0;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 3:
                    f10 = f17;
                    String strK4 = fVar.Q(str3).k();
                    strK4.getClass();
                    switch (strK4) {
                        case "baseline":
                            fVarL.M1(3);
                            break;
                        case "bottom":
                            fVarL.M1(1);
                            break;
                        case "top":
                            fVarL.M1(0);
                            break;
                        default:
                            fVarL.M1(2);
                            break;
                    }
                    i11 = 0;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 4:
                    f10 = f17;
                    androidx.constraintlayout.core.parser.c cVarQ3 = fVar.Q(str3);
                    if (cVarQ3 instanceof androidx.constraintlayout.core.parser.a) {
                        androidx.constraintlayout.core.parser.a aVar3 = (androidx.constraintlayout.core.parser.a) cVarQ3;
                        if (aVar3.size() > 1) {
                            strL2 = aVar3.l0(0);
                            strK2 = aVar3.l0(1);
                            strL3 = aVar3.size() > 2 ? aVar3.l0(2) : "";
                        } else {
                            strK2 = cVarQ3.k();
                            strL2 = "";
                            strL3 = strL2;
                        }
                    } else {
                        strK2 = cVarQ3.k();
                        strL2 = "";
                        strL3 = strL2;
                    }
                    if (!strK2.equals("")) {
                        fVarL.O1(k.a.n(strK2));
                    }
                    if (!strL2.equals("")) {
                        fVarL.y1(k.a.n(strL2));
                    }
                    if (!strL3.equals("")) {
                        fVarL.F1(k.a.n(strL3));
                    }
                    i11 = 0;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 5:
                    f10 = f17;
                    androidx.constraintlayout.core.parser.c cVarQ4 = fVar.Q(str3);
                    if (cVarQ4 instanceof androidx.constraintlayout.core.parser.a) {
                        androidx.constraintlayout.core.parser.a aVar4 = (androidx.constraintlayout.core.parser.a) cVarQ4;
                        if (aVar4.size() > 1) {
                            fS = aVar4.getInt(0);
                            f13 = aVar4.getInt(1);
                            if (aVar4.size() > 2) {
                                f12 = aVar4.getInt(2);
                                try {
                                    f11 = ((androidx.constraintlayout.core.parser.a) cVarQ4).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f11 = 0.0f;
                                }
                            } else {
                                f12 = fS;
                                f11 = f13;
                            }
                        } else {
                            fS = cVarQ4.s();
                            f11 = fS;
                            f12 = f11;
                            f13 = f12;
                        }
                    } else {
                        fS = cVarQ4.s();
                        f11 = fS;
                        f12 = f11;
                        f13 = f12;
                    }
                    fVarL.J1(Math.round(E(kVar, fS)));
                    fVarL.L1(Math.round(E(kVar, f13)));
                    fVarL.K1(Math.round(E(kVar, f12)));
                    fVarL.I1(Math.round(E(kVar, f11)));
                    i11 = 0;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 6:
                    f10 = f17;
                    androidx.constraintlayout.core.parser.c cVarQ5 = fVar.Q(str3);
                    if (cVarQ5 instanceof androidx.constraintlayout.core.parser.a) {
                        androidx.constraintlayout.core.parser.a aVar5 = (androidx.constraintlayout.core.parser.a) cVarQ5;
                        if (aVar5.size() > 1) {
                            fValueOf5 = Float.valueOf(aVar5.getFloat(0));
                            fValueOf4 = Float.valueOf(aVar5.getFloat(1));
                            fValueOf6 = aVar5.size() > 2 ? Float.valueOf(aVar5.getFloat(2)) : fValueOf7;
                        } else {
                            fValueOf4 = Float.valueOf(cVarQ5.r());
                            fValueOf5 = fValueOf7;
                            fValueOf6 = fValueOf5;
                        }
                    } else {
                        fValueOf4 = Float.valueOf(cVarQ5.r());
                        fValueOf5 = fValueOf7;
                        fValueOf6 = fValueOf5;
                    }
                    try {
                        fVarL.M0(fValueOf4.floatValue());
                        if (fValueOf5.floatValue() != f10) {
                            fVarL.x1(fValueOf5.floatValue());
                        }
                        if (fValueOf6.floatValue() != f10) {
                            fVarL.E1(fValueOf6.floatValue());
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    i11 = 0;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 7:
                    androidx.constraintlayout.core.parser.c cVarQ6 = fVar.Q(str3);
                    if (cVarQ6 instanceof androidx.constraintlayout.core.parser.a) {
                        androidx.constraintlayout.core.parser.a aVar6 = (androidx.constraintlayout.core.parser.a) cVarQ6;
                        if (aVar6.size() >= 1) {
                            int i14 = i12;
                            while (i14 < aVar6.size()) {
                                androidx.constraintlayout.core.parser.c cVarP = aVar6.P(i14);
                                float f18 = f17;
                                if (cVarP instanceof androidx.constraintlayout.core.parser.a) {
                                    androidx.constraintlayout.core.parser.a aVar7 = (androidx.constraintlayout.core.parser.a) cVarP;
                                    if (aVar7.size() > 0) {
                                        String strK5 = aVar7.P(i12).k();
                                        int size = aVar7.size();
                                        if (size != 2) {
                                            if (size == 3) {
                                                f16 = aVar7.getFloat(1);
                                                fE = E(kVar, aVar7.getFloat(2));
                                                f15 = fE;
                                            } else if (size != i13) {
                                                f14 = Float.NaN;
                                                fE = Float.NaN;
                                            } else {
                                                f16 = aVar7.getFloat(1);
                                                float fE2 = E(kVar, aVar7.getFloat(2));
                                                fE = E(kVar, aVar7.getFloat(3));
                                                f15 = fE2;
                                            }
                                            f14 = f16;
                                            fVarL.U0(strK5, f14, f15, fE);
                                        } else {
                                            f14 = aVar7.getFloat(1);
                                            fE = Float.NaN;
                                        }
                                        f15 = fE;
                                        fVarL.U0(strK5, f14, f15, fE);
                                    }
                                } else {
                                    fVarL.P0(cVarP.k());
                                }
                                i14++;
                                f17 = f18;
                                i12 = 0;
                                i13 = 4;
                            }
                            f10 = f17;
                            i11 = i12;
                            i12 = i11;
                            f17 = f10;
                            break;
                        }
                    }
                    System.err.println(str2 + " contains should be an array \"" + cVarQ6.k() + "\"");
                    break;
                case 8:
                    fVarL.G1(fVar.Q(str3).s());
                    f10 = f17;
                    i11 = i12;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 9:
                    fVarL.A1(fVar.Q(str3).s());
                    f10 = f17;
                    i11 = i12;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 10:
                    if (fVar.Q(str3).k().equals("hFlow")) {
                        fVarL.H1(i12);
                    } else {
                        fVarL.H1(1);
                    }
                    f10 = f17;
                    i11 = i12;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 11:
                    fVarL.N1(fVar.Q(str3).s());
                    f10 = f17;
                    i11 = i12;
                    i12 = i11;
                    f17 = f10;
                    break;
                case 12:
                    fVarL.P1(k.e.n(fVar.Q(str3).k()));
                    f10 = f17;
                    i11 = i12;
                    i12 = i11;
                    f17 = f10;
                    break;
                default:
                    a(kVar, eVar, kVar.f(str2), fVar, str3);
                    f10 = f17;
                    i11 = i12;
                    i12 = i11;
                    f17 = f10;
                    break;
            }
            return;
        }
    }

    static void p(k kVar, e eVar, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        ArrayList<String> arrayListS0 = fVar.s0();
        if (arrayListS0 == null) {
            return;
        }
        for (String str : arrayListS0) {
            androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str);
            ArrayList<String> arrayListB = eVar.b(str);
            if (arrayListB != null && (cVarQ instanceof androidx.constraintlayout.core.parser.f)) {
                Iterator<String> it = arrayListB.iterator();
                while (it.hasNext()) {
                    C(kVar, eVar, it.next(), (androidx.constraintlayout.core.parser.f) cVarQ);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0243  */
    private static void q(String str, k kVar, String str2, e eVar, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        float fS;
        float f10;
        float f11;
        float f12;
        androidx.constraintlayout.core.state.helpers.g gVarM = kVar.m(str2, str);
        for (String str3 : fVar.s0()) {
            str3.getClass();
            int iS = 0;
            switch (str3) {
                case "orientation":
                    gVarM.n1(fVar.Q(str3).s());
                    break;
                case "padding":
                    androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str3);
                    if (cVarQ instanceof androidx.constraintlayout.core.parser.a) {
                        androidx.constraintlayout.core.parser.a aVar = (androidx.constraintlayout.core.parser.a) cVarQ;
                        if (aVar.size() > 1) {
                            fS = aVar.getInt(0);
                            f12 = aVar.getInt(1);
                            if (aVar.size() > 2) {
                                f11 = aVar.getInt(2);
                                try {
                                    f10 = ((androidx.constraintlayout.core.parser.a) cVarQ).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f10 = 0.0f;
                                }
                            } else {
                                f10 = f12;
                                f11 = fS;
                            }
                        } else {
                            fS = cVarQ.s();
                            f10 = fS;
                            f11 = f10;
                            f12 = f11;
                        }
                    } else {
                        fS = cVarQ.s();
                        f10 = fS;
                        f11 = f10;
                        f12 = f11;
                    }
                    gVarM.q1(Math.round(E(kVar, fS)));
                    gVarM.r1(Math.round(E(kVar, f12)));
                    gVarM.p1(Math.round(E(kVar, f11)));
                    gVarM.o1(Math.round(E(kVar, f10)));
                    break;
                case "contains":
                    androidx.constraintlayout.core.parser.a aVarV = fVar.V(str3);
                    if (aVarV != null) {
                        while (iS < aVarV.size()) {
                            gVarM.P0(kVar.f(aVarV.P(iS).k()));
                            iS++;
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case "hGap":
                    gVarM.m1(E(kVar, fVar.Q(str3).r()));
                    break;
                case "rows":
                    int iS2 = fVar.Q(str3).s();
                    if (iS2 > 0) {
                        gVarM.t1(iS2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "vGap":
                    gVarM.w1(E(kVar, fVar.Q(str3).r()));
                    break;
                case "flags":
                    String strK = "";
                    try {
                        androidx.constraintlayout.core.parser.c cVarQ2 = fVar.Q(str3);
                        if (cVarQ2 instanceof androidx.constraintlayout.core.parser.e) {
                            iS = cVarQ2.s();
                        } else {
                            strK = cVarQ2.k();
                        }
                    } catch (Exception e10) {
                        System.err.println("Error parsing grid flags " + e10);
                    }
                    if (strK != null && !strK.isEmpty()) {
                        gVarM.l1(strK);
                        break;
                    } else {
                        gVarM.k1(iS);
                        break;
                    }
                    break;
                case "skips":
                    String strK2 = fVar.Q(str3).k();
                    if (strK2 == null || !strK2.contains(":")) {
                        break;
                    } else {
                        gVarM.u1(strK2);
                        break;
                    }
                    break;
                case "spans":
                    String strK3 = fVar.Q(str3).k();
                    if (strK3 == null || !strK3.contains(":")) {
                        break;
                    } else {
                        gVarM.v1(strK3);
                        break;
                    }
                    break;
                case "rowWeights":
                    String strK4 = fVar.Q(str3).k();
                    if (strK4 == null || !strK4.contains(",")) {
                        break;
                    } else {
                        gVarM.s1(strK4);
                        break;
                    }
                    break;
                case "columns":
                    int iS3 = fVar.Q(str3).s();
                    if (iS3 > 0) {
                        gVarM.j1(iS3);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "columnWeights":
                    String strK5 = fVar.Q(str3).k();
                    if (strK5 == null || !strK5.contains(",")) {
                        break;
                    } else {
                        gVarM.i1(strK5);
                        break;
                    }
                    break;
                default:
                    a(kVar, eVar, kVar.f(str2), fVar, str3);
                    break;
            }
        }
    }

    static void r(int i10, k kVar, androidx.constraintlayout.core.parser.a aVar) throws androidx.constraintlayout.core.parser.h {
        androidx.constraintlayout.core.parser.f fVar;
        String strP0;
        androidx.constraintlayout.core.parser.c cVarP = aVar.P(1);
        if ((cVarP instanceof androidx.constraintlayout.core.parser.f) && (strP0 = (fVar = (androidx.constraintlayout.core.parser.f) cVarP).p0("id")) != null) {
            s(i10, kVar, strP0, fVar);
        }
    }

    /* JADX WARN: switch over string: strings are not added: [[left]] */
    static void s(int i10, k kVar, String str, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        String next;
        ArrayList<String> arrayListS0 = fVar.s0();
        if (arrayListS0 == null) {
            return;
        }
        androidx.constraintlayout.core.state.a aVarF = kVar.f(str);
        if (i10 == 0) {
            kVar.x(str);
        } else {
            kVar.O(str);
        }
        boolean z10 = !kVar.A() || i10 == 0;
        androidx.constraintlayout.core.state.helpers.h hVar = (androidx.constraintlayout.core.state.helpers.h) aVarF.d();
        Iterator<String> it = arrayListS0.iterator();
        float fY = 0.0f;
        boolean z11 = false;
        while (true) {
            boolean z12 = true;
            while (true) {
                if (!it.hasNext()) {
                    if (z11) {
                        if (z12) {
                            hVar.g(fY);
                            return;
                        } else {
                            hVar.g(1.0f - fY);
                            return;
                        }
                    }
                    if (z12) {
                        hVar.i(Float.valueOf(fY));
                        return;
                    } else {
                        hVar.e(Float.valueOf(fY));
                        return;
                    }
                }
                next = it.next();
                next.getClass();
                switch (next) {
                    case "percent":
                        androidx.constraintlayout.core.parser.a aVarV = fVar.V(next);
                        if (aVarV != null) {
                            if (aVarV.size() > 1) {
                                String strL0 = aVarV.l0(0);
                                float f10 = aVarV.getFloat(1);
                                strL0.getClass();
                                switch (strL0) {
                                    case "end":
                                        z12 = !z10;
                                        fY = f10;
                                        break;
                                    case "left":
                                        z12 = true;
                                        fY = f10;
                                        z11 = true;
                                        break;
                                    case "right":
                                        z12 = false;
                                        fY = f10;
                                        break;
                                    case "start":
                                        z12 = z10;
                                        fY = f10;
                                        break;
                                    default:
                                        fY = f10;
                                        break;
                                }
                            }
                            z11 = true;
                            break;
                        } else {
                            fY = fVar.Y(next);
                            z11 = true;
                            z12 = true;
                            break;
                        }
                        break;
                    case "end":
                        fY = E(kVar, fVar.Y(next));
                        z12 = !z10;
                        break;
                    case "right":
                        fY = E(kVar, fVar.Y(next));
                        z12 = false;
                        break;
                    case "start":
                        fY = E(kVar, fVar.Y(next));
                        z12 = z10;
                        break;
                }
            }
            fY = E(kVar, fVar.Y(next));
        }
    }

    static void t(androidx.constraintlayout.core.state.c cVar, androidx.constraintlayout.core.parser.f fVar) {
        String strP0 = fVar.p0("export");
        if (strP0 != null) {
            cVar.f(strP0);
        }
    }

    static void u(k kVar, e eVar, androidx.constraintlayout.core.parser.a aVar) throws androidx.constraintlayout.core.parser.h {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            androidx.constraintlayout.core.parser.c cVarP = aVar.P(i10);
            if (cVarP instanceof androidx.constraintlayout.core.parser.a) {
                androidx.constraintlayout.core.parser.a aVar2 = (androidx.constraintlayout.core.parser.a) cVarP;
                if (aVar2.size() > 1) {
                    String strL0 = aVar2.l0(0);
                    strL0.getClass();
                    switch (strL0) {
                        case "vGuideline":
                            r(1, kVar, aVar2);
                            break;
                        case "hChain":
                            f(0, kVar, eVar, aVar2);
                            break;
                        case "vChain":
                            f(1, kVar, eVar, aVar2);
                            break;
                        case "hGuideline":
                            r(0, kVar, aVar2);
                            break;
                    }
                }
            }
        }
    }

    public static void v(String str, k kVar, e eVar) throws androidx.constraintlayout.core.parser.h {
        try {
            D(androidx.constraintlayout.core.parser.g.d(str), kVar, eVar);
        } catch (androidx.constraintlayout.core.parser.h e10) {
            System.err.println("Error parsing JSON " + e10);
        }
    }

    public static void w(String str, t tVar, int i10) {
        androidx.constraintlayout.core.parser.f fVarE0;
        try {
            androidx.constraintlayout.core.parser.f fVarD = androidx.constraintlayout.core.parser.g.d(str);
            ArrayList<String> arrayListS0 = fVarD.s0();
            if (arrayListS0 == null) {
                return;
            }
            for (String str2 : arrayListS0) {
                androidx.constraintlayout.core.parser.c cVarQ = fVarD.Q(str2);
                if ((cVarQ instanceof androidx.constraintlayout.core.parser.f) && (fVarE0 = ((androidx.constraintlayout.core.parser.f) cVarQ).e0(cj.h.L)) != null) {
                    for (String str3 : fVarE0.s0()) {
                        androidx.constraintlayout.core.parser.c cVarQ2 = fVarE0.Q(str3);
                        if (cVarQ2 instanceof androidx.constraintlayout.core.parser.e) {
                            tVar.o(i10, str2, str3, cVarQ2.r());
                        } else if (cVarQ2 instanceof androidx.constraintlayout.core.parser.i) {
                            long jH = h(cVarQ2.k());
                            if (jH != -1) {
                                tVar.n(i10, str2, str3, (int) jH);
                            }
                        }
                    }
                }
            }
        } catch (androidx.constraintlayout.core.parser.h e10) {
            System.err.println("Error parsing JSON " + e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    private static void x(androidx.constraintlayout.core.parser.c cVar, androidx.constraintlayout.core.state.a aVar) throws androidx.constraintlayout.core.parser.h {
        if (cVar instanceof androidx.constraintlayout.core.parser.f) {
            androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) cVar;
            androidx.constraintlayout.core.motion.utils.u uVar = new androidx.constraintlayout.core.motion.utils.u();
            ArrayList<String> arrayListS0 = fVar.s0();
            if (arrayListS0 == null) {
                return;
            }
            for (String str : arrayListS0) {
                str.getClass();
                switch (str) {
                    case "stagger":
                        uVar.a(600, fVar.Y(str));
                        break;
                    case "easing":
                        uVar.c(androidx.constraintlayout.core.motion.utils.v.e.f44050s, fVar.m0(str));
                        break;
                    case "quantize":
                        androidx.constraintlayout.core.parser.c cVarQ = fVar.Q(str);
                        if (!(cVarQ instanceof androidx.constraintlayout.core.parser.a)) {
                            uVar.b(androidx.constraintlayout.core.motion.utils.v.e.f44057z, fVar.a0(str));
                            break;
                        } else {
                            androidx.constraintlayout.core.parser.a aVar2 = (androidx.constraintlayout.core.parser.a) cVarQ;
                            int size = aVar2.size();
                            if (size > 0) {
                                uVar.b(androidx.constraintlayout.core.motion.utils.v.e.f44057z, aVar2.getInt(0));
                                if (size > 1) {
                                    uVar.c(androidx.constraintlayout.core.motion.utils.v.e.A, aVar2.l0(1));
                                    if (size > 2) {
                                        uVar.a(androidx.constraintlayout.core.motion.utils.v.e.f44049r, aVar2.getFloat(2));
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case "pathArc":
                        String strM0 = fVar.m0(str);
                        int iB = b(strM0, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                        if (iB != -1) {
                            uVar.b(androidx.constraintlayout.core.motion.utils.v.e.f44054w, iB);
                            break;
                        } else {
                            System.err.println(fVar.t() + " pathArc = '" + strM0 + "'");
                            break;
                        }
                        break;
                    case "relativeTo":
                        uVar.c(androidx.constraintlayout.core.motion.utils.v.e.f44052u, fVar.m0(str));
                        break;
                }
            }
            aVar.f44217l0 = uVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void y(androidx.constraintlayout.core.state.c cVar, String str) {
        byte b10;
        try {
            androidx.constraintlayout.core.parser.f fVarD = androidx.constraintlayout.core.parser.g.d(str);
            ArrayList<String> arrayListS0 = fVarD.s0();
            if (arrayListS0 == null) {
                return;
            }
            for (String str2 : arrayListS0) {
                androidx.constraintlayout.core.parser.c cVarQ = fVarD.Q(str2);
                if (cVarQ instanceof androidx.constraintlayout.core.parser.f) {
                    androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) cVarQ;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -2137403731) {
                        if (iHashCode != -241441378) {
                            if (iHashCode == 1101852654 && str2.equals("ConstraintSets")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                        } else if (str2.equals(androidx.constraintlayout.core.motion.utils.v.h.f44100a)) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (str2.equals("Header")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        j(cVar, fVar);
                    } else if (b10 == 1) {
                        z(cVar, fVar);
                    } else if (b10 == 2) {
                        t(cVar, fVar);
                    }
                }
            }
        } catch (androidx.constraintlayout.core.parser.h e10) {
            System.err.println("Error parsing JSON " + e10);
        }
    }

    static void z(androidx.constraintlayout.core.state.c cVar, androidx.constraintlayout.core.parser.f fVar) throws androidx.constraintlayout.core.parser.h {
        ArrayList<String> arrayListS0 = fVar.s0();
        if (arrayListS0 == null) {
            return;
        }
        for (String str : arrayListS0) {
            cVar.a(str, fVar.c0(str).L());
        }
    }
}
