package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f44326k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f44327l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f44328m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f44329n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Integer f44330o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.state.d f44331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44332b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HashMap<Object, h> f44333c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected HashMap<Object, f> f44334d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    HashMap<String, ArrayList<String>> f44335e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.constraintlayout.core.state.a f44336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<Object> f44338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<androidx.constraintlayout.core.widgets.e> f44339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f44340j;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 androidx.constraintlayout.core.state.k$a, still in use, count: 1, list:
      (r0v0 androidx.constraintlayout.core.state.k$a) from 0x004e: INVOKE 
      (wrap java.util.Map<java.lang.String, androidx.constraintlayout.core.state.k$a>:0x0047: SGET  A[WRAPPED] androidx.constraintlayout.core.state.k.a.d java.util.Map)
      ("spread")
      (r0v0 androidx.constraintlayout.core.state.k$a)
     INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Map<String, a> f44344d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Map<String, Integer> f44345e = new HashMap();

        static {
            f44344d.put("packed", new a());
            f44344d.put("spread_inside", new a());
            f44344d.put("spread", new a());
            f44345e.put("packed", 2);
            f44345e.put("spread_inside", 1);
            f44345e.put("spread", 0);
        }

        private a() {
            super(str, i);
        }

        public static a l(String str) {
            if (f44344d.containsKey(str)) {
                return f44344d.get(str);
            }
            return null;
        }

        public static int n(String str) {
            if (f44345e.containsKey(str)) {
                return f44345e.get(str).intValue();
            }
            return -1;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f44346f.clone();
        }
    }

    public enum b {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum c {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum d {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 androidx.constraintlayout.core.state.k$e, still in use, count: 1, list:
      (r0v0 androidx.constraintlayout.core.state.k$e) from 0x0039: INVOKE 
      (wrap java.util.Map<java.lang.String, androidx.constraintlayout.core.state.k$e>:0x0035: SGET  A[WRAPPED] androidx.constraintlayout.core.state.k.e.d java.util.Map)
      ("none")
      (r0v0 androidx.constraintlayout.core.state.k$e)
     INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e {
        NONE,
        CHAIN,
        ALIGNED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Map<String, e> f44389d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Map<String, Integer> f44390e = new HashMap();

        static {
            f44389d.put("none", new e());
            f44389d.put("chain", new e());
            f44389d.put("aligned", new e());
            f44390e.put("none", 0);
            f44390e.put("chain", 3);
            f44390e.put("aligned", 2);
        }

        private e() {
            super(str, i);
        }

        public static e l(String str) {
            if (f44389d.containsKey(str)) {
                return f44389d.get(str);
            }
            return null;
        }

        public static int n(String str) {
            if (f44390e.containsKey(str)) {
                return f44390e.get(str).intValue();
            }
            return -1;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f44391f.clone();
        }
    }

    public k() {
        androidx.constraintlayout.core.state.a aVar = new androidx.constraintlayout.core.state.a(this);
        this.f44336f = aVar;
        this.f44337g = 0;
        this.f44338h = new ArrayList<>();
        this.f44339i = new ArrayList<>();
        this.f44340j = true;
        Integer num = f44330o;
        aVar.c(num);
        this.f44333c.put(num, aVar);
    }

    private String i() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("__HELPER_KEY_");
        int i10 = this.f44337g;
        this.f44337g = i10 + 1;
        sb2.append(i10);
        sb2.append("__");
        return sb2.toString();
    }

    public boolean A() {
        return !this.f44332b;
    }

    public void B(Object obj, Object obj2) {
        androidx.constraintlayout.core.state.a aVarF = f(obj);
        if (aVarF != null) {
            aVarF.z0(obj2);
        }
    }

    h C(Object obj) {
        return this.f44333c.get(obj);
    }

    public void D() {
        Iterator<Object> it = this.f44333c.keySet().iterator();
        while (it.hasNext()) {
            this.f44333c.get(it.next()).a().R0();
        }
        this.f44333c.clear();
        this.f44333c.put(f44330o, this.f44336f);
        this.f44334d.clear();
        this.f44335e.clear();
        this.f44338h.clear();
        this.f44340j = true;
    }

    public boolean E(int i10) {
        return this.f44336f.G().t(i10);
    }

    public boolean F(int i10) {
        return this.f44336f.Y().t(i10);
    }

    public void G(androidx.constraintlayout.core.state.d dVar) {
        this.f44331a = dVar;
    }

    public k H(androidx.constraintlayout.core.state.e eVar) {
        this.f44336f.t0(eVar);
        return this;
    }

    @Deprecated
    public void I(boolean z10) {
        this.f44332b = z10;
    }

    public void J(boolean z10) {
        this.f44332b = !z10;
    }

    public void K(String str, String str2) {
        ArrayList<String> arrayList;
        androidx.constraintlayout.core.state.a aVarF = f(str);
        if (aVarF != null) {
            aVarF.w0(str2);
            if (this.f44335e.containsKey(str2)) {
                arrayList = this.f44335e.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.f44335e.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public k L(androidx.constraintlayout.core.state.e eVar) {
        this.f44336f.A0(eVar);
        return this;
    }

    public androidx.constraintlayout.core.state.helpers.j M() {
        return (androidx.constraintlayout.core.state.helpers.j) u(null, d.VERTICAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.j N(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.j jVar = (androidx.constraintlayout.core.state.helpers.j) u(null, d.VERTICAL_CHAIN);
        jVar.P0(objArr);
        return jVar;
    }

    public androidx.constraintlayout.core.state.helpers.h O(Object obj) {
        return s(obj, 1);
    }

    public k P(androidx.constraintlayout.core.state.e eVar) {
        return L(eVar);
    }

    public void a(androidx.constraintlayout.core.widgets.f fVar) {
        f fVar2;
        androidx.constraintlayout.core.widgets.j jVarR0;
        androidx.constraintlayout.core.widgets.j jVarR1;
        fVar.q2();
        this.f44336f.Y().j(this, fVar, 0);
        this.f44336f.G().j(this, fVar, 1);
        for (Object obj : this.f44334d.keySet()) {
            androidx.constraintlayout.core.widgets.j jVarR2 = this.f44334d.get(obj).R0();
            if (jVarR2 != null) {
                h hVarF = this.f44333c.get(obj);
                if (hVarF == null) {
                    hVarF = f(obj);
                }
                hVarF.b(jVarR2);
            }
        }
        for (Object obj2 : this.f44333c.keySet()) {
            h hVar = this.f44333c.get(obj2);
            if (hVar != this.f44336f && (hVar.d() instanceof f) && (jVarR1 = ((f) hVar.d()).R0()) != null) {
                h hVarF2 = this.f44333c.get(obj2);
                if (hVarF2 == null) {
                    hVarF2 = f(obj2);
                }
                hVarF2.b(jVarR1);
            }
        }
        Iterator<Object> it = this.f44333c.keySet().iterator();
        while (it.hasNext()) {
            h hVar2 = this.f44333c.get(it.next());
            if (hVar2 != this.f44336f) {
                androidx.constraintlayout.core.widgets.e eVarA = hVar2.a();
                eVarA.k1(hVar2.getKey().toString());
                eVarA.T1(null);
                if (hVar2.d() instanceof androidx.constraintlayout.core.state.helpers.h) {
                    hVar2.apply();
                }
                fVar.a(eVarA);
            } else {
                hVar2.b(fVar);
            }
        }
        Iterator<Object> it2 = this.f44334d.keySet().iterator();
        while (it2.hasNext()) {
            f fVar3 = this.f44334d.get(it2.next());
            if (fVar3.R0() != null) {
                Iterator<Object> it3 = fVar3.f44280o0.iterator();
                while (it3.hasNext()) {
                    fVar3.R0().a(this.f44333c.get(it3.next()).a());
                }
                fVar3.apply();
            } else {
                fVar3.apply();
            }
        }
        Iterator<Object> it4 = this.f44333c.keySet().iterator();
        while (it4.hasNext()) {
            h hVar3 = this.f44333c.get(it4.next());
            if (hVar3 != this.f44336f && (hVar3.d() instanceof f) && (jVarR0 = (fVar2 = (f) hVar3.d()).R0()) != null) {
                for (Object obj3 : fVar2.f44280o0) {
                    h hVar4 = this.f44333c.get(obj3);
                    if (hVar4 != null) {
                        jVarR0.a(hVar4.a());
                    } else if (obj3 instanceof h) {
                        jVarR0.a(((h) obj3).a());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                hVar3.apply();
            }
        }
        for (Object obj4 : this.f44333c.keySet()) {
            h hVar5 = this.f44333c.get(obj4);
            hVar5.apply();
            androidx.constraintlayout.core.widgets.e eVarA2 = hVar5.a();
            if (eVarA2 != null && obj4 != null) {
                eVarA2.f44730o = obj4.toString();
            }
        }
    }

    public androidx.constraintlayout.core.state.helpers.c b(Object obj, c cVar) {
        androidx.constraintlayout.core.state.a aVarF = f(obj);
        if (aVarF.d() == null || !(aVarF.d() instanceof androidx.constraintlayout.core.state.helpers.c)) {
            androidx.constraintlayout.core.state.helpers.c cVar2 = new androidx.constraintlayout.core.state.helpers.c(this);
            cVar2.U0(cVar);
            aVarF.s0(cVar2);
        }
        return (androidx.constraintlayout.core.state.helpers.c) aVarF.d();
    }

    public void c(Object obj) {
        this.f44338h.add(obj);
        this.f44340j = true;
    }

    public androidx.constraintlayout.core.state.helpers.a d(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.a aVar = (androidx.constraintlayout.core.state.helpers.a) u(null, d.ALIGN_HORIZONTALLY);
        aVar.P0(objArr);
        return aVar;
    }

    public androidx.constraintlayout.core.state.helpers.b e(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.b bVar = (androidx.constraintlayout.core.state.helpers.b) u(null, d.ALIGN_VERTICALLY);
        bVar.P0(objArr);
        return bVar;
    }

    public androidx.constraintlayout.core.state.a f(Object obj) {
        h hVarH = this.f44333c.get(obj);
        if (hVarH == null) {
            hVarH = h(obj);
            this.f44333c.put(obj, hVarH);
            hVarH.c(obj);
        }
        if (hVarH instanceof androidx.constraintlayout.core.state.a) {
            return (androidx.constraintlayout.core.state.a) hVarH;
        }
        return null;
    }

    public int g(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public androidx.constraintlayout.core.state.a h(Object obj) {
        return new androidx.constraintlayout.core.state.a(this);
    }

    public void j() {
        for (Object obj : this.f44333c.keySet()) {
            androidx.constraintlayout.core.state.a aVarF = f(obj);
            if (aVarF != null) {
                aVarF.z0(obj);
            }
        }
    }

    androidx.constraintlayout.core.state.d k() {
        return this.f44331a;
    }

    public androidx.constraintlayout.core.state.helpers.f l(Object obj, boolean z10) {
        androidx.constraintlayout.core.state.a aVarF = f(obj);
        if (aVarF.d() == null || !(aVarF.d() instanceof androidx.constraintlayout.core.state.helpers.f)) {
            aVarF.s0(z10 ? new androidx.constraintlayout.core.state.helpers.f(this, d.VERTICAL_FLOW) : new androidx.constraintlayout.core.state.helpers.f(this, d.HORIZONTAL_FLOW));
        }
        return (androidx.constraintlayout.core.state.helpers.f) aVarF.d();
    }

    @NonNull
    public androidx.constraintlayout.core.state.helpers.g m(@NonNull Object obj, @NonNull String str) {
        androidx.constraintlayout.core.state.a aVarF = f(obj);
        if (aVarF.d() == null || !(aVarF.d() instanceof androidx.constraintlayout.core.state.helpers.g)) {
            d dVar = d.GRID;
            if (str.charAt(0) == 'r') {
                dVar = d.ROW;
            } else if (str.charAt(0) == 'c') {
                dVar = d.COLUMN;
            }
            aVarF.s0(new androidx.constraintlayout.core.state.helpers.g(this, dVar));
        }
        return (androidx.constraintlayout.core.state.helpers.g) aVarF.d();
    }

    public androidx.constraintlayout.core.state.helpers.f n() {
        return (androidx.constraintlayout.core.state.helpers.f) u(null, d.HORIZONTAL_FLOW);
    }

    public androidx.constraintlayout.core.state.helpers.f o(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.f fVar = (androidx.constraintlayout.core.state.helpers.f) u(null, d.HORIZONTAL_FLOW);
        fVar.P0(objArr);
        return fVar;
    }

    public ArrayList<String> p(String str) {
        if (this.f44335e.containsKey(str)) {
            return this.f44335e.get(str);
        }
        return null;
    }

    public androidx.constraintlayout.core.state.helpers.f q() {
        return (androidx.constraintlayout.core.state.helpers.f) u(null, d.VERTICAL_FLOW);
    }

    public androidx.constraintlayout.core.state.helpers.f r(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.f fVar = (androidx.constraintlayout.core.state.helpers.f) u(null, d.VERTICAL_FLOW);
        fVar.P0(objArr);
        return fVar;
    }

    public androidx.constraintlayout.core.state.helpers.h s(Object obj, int i10) {
        androidx.constraintlayout.core.state.a aVarF = f(obj);
        if (aVarF.d() == null || !(aVarF.d() instanceof androidx.constraintlayout.core.state.helpers.h)) {
            androidx.constraintlayout.core.state.helpers.h hVar = new androidx.constraintlayout.core.state.helpers.h(this);
            hVar.h(i10);
            hVar.c(obj);
            aVarF.s0(hVar);
        }
        return (androidx.constraintlayout.core.state.helpers.h) aVarF.d();
    }

    public k t(androidx.constraintlayout.core.state.e eVar) {
        return H(eVar);
    }

    public f u(Object obj, d dVar) {
        if (obj == null) {
            obj = i();
        }
        f iVar = this.f44334d.get(obj);
        if (iVar == null) {
            switch (dVar) {
                case HORIZONTAL_CHAIN:
                    iVar = new androidx.constraintlayout.core.state.helpers.i(this);
                    break;
                case VERTICAL_CHAIN:
                    iVar = new androidx.constraintlayout.core.state.helpers.j(this);
                    break;
                case ALIGN_HORIZONTALLY:
                    iVar = new androidx.constraintlayout.core.state.helpers.a(this);
                    break;
                case ALIGN_VERTICALLY:
                    iVar = new androidx.constraintlayout.core.state.helpers.b(this);
                    break;
                case BARRIER:
                    iVar = new androidx.constraintlayout.core.state.helpers.c(this);
                    break;
                case LAYER:
                default:
                    iVar = new f(this, dVar);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    iVar = new androidx.constraintlayout.core.state.helpers.f(this, dVar);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    iVar = new androidx.constraintlayout.core.state.helpers.g(this, dVar);
                    break;
            }
            iVar.c(obj);
            this.f44334d.put(obj, iVar);
        }
        return iVar;
    }

    public androidx.constraintlayout.core.state.helpers.i v() {
        return (androidx.constraintlayout.core.state.helpers.i) u(null, d.HORIZONTAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.i w(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.i iVar = (androidx.constraintlayout.core.state.helpers.i) u(null, d.HORIZONTAL_CHAIN);
        iVar.P0(objArr);
        return iVar;
    }

    public androidx.constraintlayout.core.state.helpers.h x(Object obj) {
        return s(obj, 0);
    }

    public boolean y(androidx.constraintlayout.core.widgets.e eVar) {
        if (this.f44340j) {
            this.f44339i.clear();
            Iterator<Object> it = this.f44338h.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.e eVarA = this.f44333c.get(it.next()).a();
                if (eVarA != null) {
                    this.f44339i.add(eVarA);
                }
            }
            this.f44340j = false;
        }
        return this.f44339i.contains(eVar);
    }

    @Deprecated
    public boolean z() {
        return this.f44332b;
    }
}
