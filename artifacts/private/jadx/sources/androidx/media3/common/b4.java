package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f60456f = "TrackGroup";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f60457g = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f60458h = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f60459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final String f60460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.media3.common.util.b1
    public final int f60461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w[] f60462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60463e;

    @androidx.media3.common.util.b1
    public b4(w... wVarArr) {
        this("", wVarArr);
    }

    @androidx.media3.common.util.b1
    public static b4 b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f60457g);
        return new b4(bundle.getString(f60458h, ""), (w[]) (parcelableArrayList == null ? l6.F() : androidx.media3.common.util.i.d(new com.google.common.base.t() { // from class: androidx.media3.common.a4
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w.e((Bundle) obj);
            }
        }, parcelableArrayList)).toArray(new w[0]));
    }

    private static void e(String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, int i10) {
        androidx.media3.common.util.z.e(f60456f, "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String f(@androidx.annotation.p0 String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int g(int i10) {
        return i10 | 16384;
    }

    private void i() {
        String strF = f(this.f60462d[0].f61750d);
        int iG = g(this.f60462d[0].f61752f);
        int i10 = 1;
        while (true) {
            w[] wVarArr = this.f60462d;
            if (i10 >= wVarArr.length) {
                return;
            }
            if (!strF.equals(f(wVarArr[i10].f61750d))) {
                w[] wVarArr2 = this.f60462d;
                e("languages", wVarArr2[0].f61750d, wVarArr2[i10].f61750d, i10);
                return;
            } else {
                if (iG != g(this.f60462d[i10].f61752f)) {
                    e("role flags", Integer.toBinaryString(this.f60462d[0].f61752f), Integer.toBinaryString(this.f60462d[i10].f61752f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    @androidx.media3.common.util.b1
    @androidx.annotation.j
    public b4 a(String str) {
        return new b4(str, this.f60462d);
    }

    @androidx.media3.common.util.b1
    public w c(int i10) {
        return this.f60462d[i10];
    }

    @androidx.media3.common.util.b1
    public int d(w wVar) {
        int i10 = 0;
        while (true) {
            w[] wVarArr = this.f60462d;
            if (i10 >= wVarArr.length) {
                return -1;
            }
            if (wVar == wVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b4.class == obj.getClass()) {
            b4 b4Var = (b4) obj;
            if (this.f60460b.equals(b4Var.f60460b) && Arrays.equals(this.f60462d, b4Var.f60462d)) {
                return true;
            }
        }
        return false;
    }

    @androidx.media3.common.util.b1
    public Bundle h() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f60462d.length);
        for (w wVar : this.f60462d) {
            arrayList.add(wVar.k());
        }
        bundle.putParcelableArrayList(f60457g, arrayList);
        bundle.putString(f60458h, this.f60460b);
        return bundle;
    }

    public int hashCode() {
        if (this.f60463e == 0) {
            this.f60463e = ((527 + this.f60460b.hashCode()) * 31) + Arrays.hashCode(this.f60462d);
        }
        return this.f60463e;
    }

    public String toString() {
        return this.f60460b + ": " + Arrays.toString(this.f60462d);
    }

    @androidx.media3.common.util.b1
    public b4(String str, w... wVarArr) {
        androidx.media3.common.util.a.a(wVarArr.length > 0);
        this.f60460b = str;
        this.f60462d = wVarArr;
        this.f60459a = wVarArr.length;
        int iM = s0.m(wVarArr[0].f61761o);
        this.f60461c = iM == -1 ? s0.m(wVarArr[0].f61760n) : iM;
        i();
    }
}
