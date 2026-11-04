package com.planner5d.library.engine.libgdx.rendering.model.managing;

/* JADX INFO: loaded from: classes5.dex */
public class m extends u4.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a[] f160974e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.planner5d.library.math.m f160975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.planner5d.library.math.m f160976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.planner5d.library.math.k f160977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte f160978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f160979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f160980f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f160981g;

        public a(byte b10, com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2, com.planner5d.library.math.k kVar, float f10, float f11, float f12) {
            com.planner5d.library.math.m mVar3 = new com.planner5d.library.math.m();
            this.f160975a = mVar3;
            com.planner5d.library.math.m mVar4 = new com.planner5d.library.math.m();
            this.f160976b = mVar4;
            this.f160978d = b10;
            mVar3.A0(mVar);
            mVar4.A0(mVar2);
            this.f160977c = new com.planner5d.library.math.k(kVar);
            this.f160979e = f10;
            this.f160980f = f11;
            this.f160981g = f12;
        }
    }

    public m(a[] aVarArr) {
        this.f160974e = aVarArr == null ? new a[0] : aVarArr;
    }
}
