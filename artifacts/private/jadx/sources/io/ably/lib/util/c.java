package io.ably.lib.util;

import io.ably.lib.network.r;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class c {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f288209a;

        static {
            int[] iArr = new int[io.ably.lib.http.g.b.values().length];
            f288209a = iArr;
            try {
                iArr[io.ably.lib.http.g.b.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f288209a[io.ably.lib.http.g.b.DIGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static r a(io.ably.lib.types.n nVar) {
        if (nVar.f288129y == null) {
            return null;
        }
        r.a aVarA = r.a();
        aVarA.c(nVar.f288129y.f288023a).f(nVar.f288129y.f288024b).g(nVar.f288129y.f288025c).e(nVar.f288129y.f288026d);
        String[] strArr = nVar.f288129y.f288027e;
        if (strArr != null) {
            aVarA.d(Arrays.asList(strArr));
        }
        int i10 = a.f288209a[nVar.f288129y.f288028f.ordinal()];
        if (i10 == 1) {
            aVarA.a(io.ably.lib.network.q.BASIC);
        } else if (i10 == 2) {
            aVarA.a(io.ably.lib.network.q.DIGEST);
        }
        return aVarA.b();
    }
}
