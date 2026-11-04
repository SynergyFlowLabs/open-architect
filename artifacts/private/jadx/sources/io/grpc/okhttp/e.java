package io.grpc.okhttp;

import com.superwall.sdk.network.Api;
import io.grpc.f1;
import io.grpc.internal.o3;
import io.grpc.internal.v0;
import io.grpc.v1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.framed.d f290304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.framed.d f290305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.framed.d f290306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.framed.d f290307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.framed.d f290308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.framed.d f290309f;

    static {
        okio.o oVar = io.grpc.okhttp.internal.framed.d.f290506g;
        f290304a = new io.grpc.okhttp.internal.framed.d(oVar, Api.scheme);
        f290305b = new io.grpc.okhttp.internal.framed.d(oVar, "http");
        okio.o oVar2 = io.grpc.okhttp.internal.framed.d.f290504e;
        f290306c = new io.grpc.okhttp.internal.framed.d(oVar2, "POST");
        f290307d = new io.grpc.okhttp.internal.framed.d(oVar2, "GET");
        f290308e = new io.grpc.okhttp.internal.framed.d(v0.f289905j.d(), v0.f289910o);
        f290309f = new io.grpc.okhttp.internal.framed.d("te", v0.f289912q);
    }

    e() {
    }

    private static List<io.grpc.okhttp.internal.framed.d> a(List<io.grpc.okhttp.internal.framed.d> list, v1 v1Var) {
        byte[][] bArrD = o3.d(v1Var);
        for (int i10 = 0; i10 < bArrD.length; i10 += 2) {
            okio.o oVarL0 = okio.o.l0(bArrD[i10]);
            if (oVarL0.v0() != 0 && oVarL0.E(0) != 58) {
                list.add(new io.grpc.okhttp.internal.framed.d(oVarL0, okio.o.l0(bArrD[i10 + 1])));
            }
        }
        return list;
    }

    public static List<io.grpc.okhttp.internal.framed.d> b(int i10, String str, v1 v1Var) {
        ArrayList arrayList = new ArrayList(f1.a(v1Var) + 2);
        arrayList.add(new io.grpc.okhttp.internal.framed.d(io.grpc.okhttp.internal.framed.d.f290503d, "" + i10));
        arrayList.add(new io.grpc.okhttp.internal.framed.d(v0.f289905j.d(), str));
        return a(arrayList, v1Var);
    }

    public static List<io.grpc.okhttp.internal.framed.d> c(v1 v1Var, String str, String str2, String str3, boolean z10, boolean z11) {
        com.google.common.base.j0.F(v1Var, "headers");
        com.google.common.base.j0.F(str, "defaultPath");
        com.google.common.base.j0.F(str2, "authority");
        f(v1Var);
        ArrayList arrayList = new ArrayList(f1.a(v1Var) + 7);
        if (z11) {
            arrayList.add(f290305b);
        } else {
            arrayList.add(f290304a);
        }
        if (z10) {
            arrayList.add(f290307d);
        } else {
            arrayList.add(f290306c);
        }
        arrayList.add(new io.grpc.okhttp.internal.framed.d(io.grpc.okhttp.internal.framed.d.f290507h, str2));
        arrayList.add(new io.grpc.okhttp.internal.framed.d(io.grpc.okhttp.internal.framed.d.f290505f, str));
        arrayList.add(new io.grpc.okhttp.internal.framed.d(v0.f289907l.d(), str3));
        arrayList.add(f290308e);
        arrayList.add(f290309f);
        return a(arrayList, v1Var);
    }

    public static List<io.grpc.okhttp.internal.framed.d> d(v1 v1Var) {
        f(v1Var);
        ArrayList arrayList = new ArrayList(f1.a(v1Var) + 2);
        arrayList.add(new io.grpc.okhttp.internal.framed.d(io.grpc.okhttp.internal.framed.d.f290503d, "200"));
        arrayList.add(f290308e);
        return a(arrayList, v1Var);
    }

    public static List<io.grpc.okhttp.internal.framed.d> e(v1 v1Var, boolean z10) {
        if (!z10) {
            return d(v1Var);
        }
        f(v1Var);
        return a(new ArrayList(f1.a(v1Var)), v1Var);
    }

    private static void f(v1 v1Var) {
        v1Var.j(v0.f289905j);
        v1Var.j(v0.f289906k);
        v1Var.j(v0.f289907l);
    }
}
