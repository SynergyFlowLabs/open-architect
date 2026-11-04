package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o;
import androidx.media3.common.util.o0;
import androidx.media3.common.v0;
import androidx.media3.extractor.text.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68960c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f68961d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f68962e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f68963f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f68964g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f68965h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f68966i = "NOTE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f68967j = "STYLE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f68968a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f68969b = new b();

    private static int e(o0 o0Var) {
        int i10 = -1;
        int iF = 0;
        while (i10 == -1) {
            iF = o0Var.f();
            String strU = o0Var.u();
            if (strU == null) {
                i10 = 0;
            } else if (f68967j.equals(strU)) {
                i10 = 2;
            } else {
                i10 = strU.startsWith(f68966i) ? 1 : 3;
            }
        }
        o0Var.a0(iF);
        return i10;
    }

    private static void f(o0 o0Var) {
        while (!TextUtils.isEmpty(o0Var.u())) {
        }
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<androidx.media3.extractor.text.d> oVar) {
        d dVarN;
        this.f68968a.Y(bArr, i11 + i10);
        this.f68968a.a0(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.f68968a);
            while (!TextUtils.isEmpty(this.f68968a.u())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iE = e(this.f68968a);
                if (iE == 0) {
                    androidx.media3.extractor.text.h.c(new j(arrayList2), bVar, oVar);
                    return;
                }
                int i12 = 1 << 1;
                if (iE == 1) {
                    f(this.f68968a);
                } else if (iE == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f68968a.u();
                    arrayList.addAll(this.f68969b.d(this.f68968a));
                } else if (iE == 3 && (dVarN = e.n(this.f68968a, arrayList)) != null) {
                    arrayList2.add(dVarN);
                }
            }
        } catch (v0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 1;
    }
}
