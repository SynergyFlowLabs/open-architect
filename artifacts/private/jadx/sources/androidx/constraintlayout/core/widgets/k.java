package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44817a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44818b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44819c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44820d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44821e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44822f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44823g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44824h = 64;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44825i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44826j = 256;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f44827k = 512;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44828l = 1024;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f44829m = 257;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static boolean[] f44830n = new boolean[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f44831o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f44832p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f44833q = 2;

    static void a(f fVar, androidx.constraintlayout.core.e eVar, e eVar2) {
        eVar2.f44740t = -1;
        eVar2.f44742u = -1;
        e.b bVar = fVar.f44705b0[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar2.f44705b0[0] == e.b.MATCH_PARENT) {
            int i10 = eVar2.Q.f44663g;
            int iM0 = fVar.m0() - eVar2.S.f44663g;
            d dVar = eVar2.Q;
            dVar.f44665i = eVar.s(dVar);
            d dVar2 = eVar2.S;
            dVar2.f44665i = eVar.s(dVar2);
            eVar.f(eVar2.Q.f44665i, i10);
            eVar.f(eVar2.S.f44665i, iM0);
            eVar2.f44740t = 2;
            eVar2.D1(i10, iM0);
        }
        if (fVar.f44705b0[1] != bVar2 && eVar2.f44705b0[1] == e.b.MATCH_PARENT) {
            int i11 = eVar2.R.f44663g;
            int iD = fVar.D() - eVar2.T.f44663g;
            d dVar3 = eVar2.R;
            dVar3.f44665i = eVar.s(dVar3);
            d dVar4 = eVar2.T;
            dVar4.f44665i = eVar.s(dVar4);
            eVar.f(eVar2.R.f44665i, i11);
            eVar.f(eVar2.T.f44665i, iD);
            if (eVar2.f44729n0 > 0 || eVar2.l0() == 8) {
                d dVar5 = eVar2.U;
                dVar5.f44665i = eVar.s(dVar5);
                eVar.f(eVar2.U.f44665i, eVar2.f44729n0 + i11);
            }
            eVar2.f44742u = 2;
            eVar2.Y1(i11, iD);
        }
    }

    public static final boolean b(int i10, int i11) {
        if ((i10 & i11) != i11) {
            return false;
        }
        int i12 = 7 >> 1;
        return true;
    }
}
