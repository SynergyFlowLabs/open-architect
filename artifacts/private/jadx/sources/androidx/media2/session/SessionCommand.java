package androidx.media2.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionCommand implements androidx.versionedparcelable.h {
    public static final int A = 10001;
    public static final int B = 10002;
    public static final int C = 10003;
    public static final int D = 10004;
    public static final int E = 10005;
    public static final int F = 10006;
    public static final int G = 10007;
    public static final int H = 10008;
    public static final int I = 10009;
    public static final int J = 10010;
    public static final int K = 10011;
    public static final int L = 10012;
    public static final int M = 10013;
    public static final int N = 10014;
    public static final int O = 10015;
    public static final int P = 10016;
    public static final int Q = 10017;
    public static final int R = 10018;
    public static final int S = 10019;
    public static final int T = 11000;
    public static final int U = 11001;
    public static final int V = 11002;
    static final SparseArray<List<Integer>> W;
    public static final int X = 30000;
    public static final int Y = 30001;
    static final SparseArray<List<Integer>> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f58652a0 = 40000;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f58653b0 = 40001;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f58654c0 = 40002;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f58655d0 = 40003;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f58656e0 = 40010;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f58657f0 = 40011;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final SparseArray<List<Integer>> f58658g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f58659h0 = 50000;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f58660i0 = 50001;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f58661j0 = 50002;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f58662k0 = 50003;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f58663l0 = 50004;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f58664m0 = 50005;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f58665n0 = 50006;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f58666t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f58667u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final int f58668v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f58669w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final SparseArray<List<Integer>> f58670x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final SparseArray<List<Integer>> f58671y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f58672z = 10000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f58673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    String f58674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Bundle f58675s;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    @e.a({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    static {
        SparseArray<List<Integer>> sparseArray = new SparseArray<>();
        f58670x = sparseArray;
        SparseArray<List<Integer>> sparseArray2 = new SparseArray<>();
        f58671y = sparseArray2;
        sparseArray.put(1, Arrays.asList(10000, Integer.valueOf(A), Integer.valueOf(B), Integer.valueOf(C), Integer.valueOf(D), Integer.valueOf(T), Integer.valueOf(U), Integer.valueOf(V)));
        sparseArray2.put(1, Arrays.asList(Integer.valueOf(E), Integer.valueOf(F), Integer.valueOf(G), Integer.valueOf(H), Integer.valueOf(I), Integer.valueOf(J), Integer.valueOf(K), Integer.valueOf(L), Integer.valueOf(M), Integer.valueOf(N), Integer.valueOf(O), Integer.valueOf(P), Integer.valueOf(Q), Integer.valueOf(R)));
        sparseArray2.put(2, Collections.singletonList(Integer.valueOf(S)));
        SparseArray<List<Integer>> sparseArray3 = new SparseArray<>();
        W = sparseArray3;
        sparseArray3.put(1, Arrays.asList(Integer.valueOf(X), Integer.valueOf(Y)));
        SparseArray<List<Integer>> sparseArray4 = new SparseArray<>();
        Z = sparseArray4;
        sparseArray4.put(1, Arrays.asList(40000, Integer.valueOf(f58653b0), Integer.valueOf(f58654c0), Integer.valueOf(f58655d0), Integer.valueOf(f58656e0)));
        sparseArray4.put(2, Collections.singletonList(Integer.valueOf(f58657f0)));
        SparseArray<List<Integer>> sparseArray5 = new SparseArray<>();
        f58658g0 = sparseArray5;
        sparseArray5.put(1, Arrays.asList(50000, Integer.valueOf(f58660i0), Integer.valueOf(f58661j0), Integer.valueOf(f58662k0), Integer.valueOf(f58663l0), Integer.valueOf(f58664m0), Integer.valueOf(f58665n0)));
    }

    SessionCommand() {
    }

    public int d() {
        return this.f58673q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        return this.f58673q == sessionCommand.f58673q && TextUtils.equals(this.f58674r, sessionCommand.f58674r);
    }

    @p0
    public String f() {
        return this.f58674r;
    }

    @p0
    public Bundle g() {
        return this.f58675s;
    }

    public int hashCode() {
        return androidx.core.util.o.b(this.f58674r, Integer.valueOf(this.f58673q));
    }

    public SessionCommand(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("commandCode shouldn't be COMMAND_CODE_CUSTOM");
        }
        this.f58673q = i10;
        this.f58674r = null;
        this.f58675s = null;
    }

    public SessionCommand(@NonNull String str, @p0 Bundle bundle) {
        if (str == null) {
            throw new NullPointerException("action shouldn't be null");
        }
        this.f58673q = 0;
        this.f58674r = str;
        this.f58675s = bundle;
    }
}
