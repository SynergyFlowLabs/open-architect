package androidx.media3.extractor.flv;

import androidx.annotation.p0;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class d extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f67301e = "onMetaData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f67302f = "duration";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f67303g = "keyframes";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f67304h = "filepositions";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f67305i = "times";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67306j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67307k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f67308l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f67309m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f67310n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f67311o = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f67312p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f67313q = 11;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f67314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f67315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f67316d;

    public d() {
        super(new m());
        this.f67314b = -9223372036854775807L;
        this.f67315c = new long[0];
        this.f67316d = new long[0];
    }

    private static Boolean h(o0 o0Var) {
        return Boolean.valueOf(o0Var.L() == 1);
    }

    @p0
    private static Object i(o0 o0Var, int i10) {
        if (i10 == 0) {
            return k(o0Var);
        }
        if (i10 == 1) {
            return h(o0Var);
        }
        if (i10 == 2) {
            return o(o0Var);
        }
        if (i10 == 3) {
            return m(o0Var);
        }
        if (i10 == 8) {
            return l(o0Var);
        }
        if (i10 == 10) {
            return n(o0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return j(o0Var);
    }

    private static Date j(o0 o0Var) {
        Date date = new Date((long) k(o0Var).doubleValue());
        int i10 = 7 << 2;
        o0Var.b0(2);
        return date;
    }

    private static Double k(o0 o0Var) {
        return Double.valueOf(Double.longBitsToDouble(o0Var.E()));
    }

    private static HashMap<String, Object> l(o0 o0Var) {
        int iP = o0Var.P();
        HashMap<String, Object> map = new HashMap<>(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            String strO = o(o0Var);
            Object objI = i(o0Var, p(o0Var));
            if (objI != null) {
                map.put(strO, objI);
            }
        }
        return map;
    }

    private static HashMap<String, Object> m(o0 o0Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strO = o(o0Var);
            int iP = p(o0Var);
            if (iP == 9) {
                return map;
            }
            Object objI = i(o0Var, iP);
            if (objI != null) {
                map.put(strO, objI);
            }
        }
    }

    private static ArrayList<Object> n(o0 o0Var) {
        int iP = o0Var.P();
        ArrayList<Object> arrayList = new ArrayList<>(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            Object objI = i(o0Var, p(o0Var));
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        return arrayList;
    }

    private static String o(o0 o0Var) {
        int iT = o0Var.T();
        int iF = o0Var.f();
        o0Var.b0(iT);
        return new String(o0Var.e(), iF, iT);
    }

    private static int p(o0 o0Var) {
        return o0Var.L();
    }

    @Override // androidx.media3.extractor.flv.e
    protected boolean b(o0 o0Var) {
        return true;
    }

    @Override // androidx.media3.extractor.flv.e
    protected boolean c(o0 o0Var, long j10) {
        if (p(o0Var) != 2 || !f67301e.equals(o(o0Var)) || o0Var.a() == 0 || p(o0Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapL = l(o0Var);
        Object obj = mapL.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f67314b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapL.get(f67303g);
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get(f67304h);
            Object obj4 = map.get(f67305i);
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f67315c = new long[size];
                this.f67316d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f67315c = new long[0];
                        this.f67316d = new long[0];
                        break;
                    }
                    this.f67315c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f67316d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.flv.e
    public void d() {
    }

    public long e() {
        return this.f67314b;
    }

    public long[] f() {
        return this.f67316d;
    }

    public long[] g() {
        return this.f67315c;
    }
}
