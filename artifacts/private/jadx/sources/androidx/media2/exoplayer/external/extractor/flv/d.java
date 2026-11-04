package androidx.media2.exoplayer.external.extractor.flv;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.extractor.h;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f54052c = "onMetaData";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f54053d = "duration";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f54054e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f54055f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f54056g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f54057h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f54058i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54059j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f54060k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54061l = 11;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f54062b;

    public d() {
        super(new h());
        this.f54062b = -9223372036854775807L;
    }

    private static Boolean f(x data) {
        return Boolean.valueOf(data.D() == 1);
    }

    @p0
    private static Object g(x data, int type) {
        if (type == 0) {
            return i(data);
        }
        if (type == 1) {
            return f(data);
        }
        if (type == 2) {
            return m(data);
        }
        if (type == 3) {
            return k(data);
        }
        if (type == 8) {
            return j(data);
        }
        if (type == 10) {
            return l(data);
        }
        if (type != 11) {
            return null;
        }
        return h(data);
    }

    private static Date h(x data) {
        Date date = new Date((long) i(data).doubleValue());
        data.R(2);
        return date;
    }

    private static Double i(x data) {
        return Double.valueOf(Double.longBitsToDouble(data.w()));
    }

    private static HashMap<String, Object> j(x data) {
        int iH = data.H();
        HashMap<String, Object> map = new HashMap<>(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            String strM = m(data);
            Object objG = g(data, n(data));
            if (objG != null) {
                map.put(strM, objG);
            }
        }
        return map;
    }

    private static HashMap<String, Object> k(x data) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strM = m(data);
            int iN = n(data);
            if (iN == 9) {
                return map;
            }
            Object objG = g(data, iN);
            if (objG != null) {
                map.put(strM, objG);
            }
        }
    }

    private static ArrayList<Object> l(x data) {
        int iH = data.H();
        ArrayList<Object> arrayList = new ArrayList<>(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            Object objG = g(data, n(data));
            if (objG != null) {
                arrayList.add(objG);
            }
        }
        return arrayList;
    }

    private static String m(x data) {
        int iJ = data.J();
        int iC = data.c();
        data.R(iJ);
        return new String(data.f57720a, iC, iJ);
    }

    private static int n(x data) {
        return data.D();
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    protected boolean b(x data) {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    protected boolean c(x data, long timeUs) throws k0 {
        if (n(data) != 2) {
            throw new k0();
        }
        if (!f54052c.equals(m(data)) || n(data) != 8) {
            return false;
        }
        HashMap<String, Object> mapJ = j(data);
        if (mapJ.containsKey("duration")) {
            double dDoubleValue = ((Double) mapJ.get("duration")).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f54062b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        return false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.flv.e
    public void d() {
    }

    public long e() {
        return this.f54062b;
    }
}
