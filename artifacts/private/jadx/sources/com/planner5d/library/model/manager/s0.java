package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class s0 implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.config.p f197713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f197714d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.planner5d.library.model.p.b f197715e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f197716a;

        static {
            int[] iArr = new int[com.planner5d.library.model.p.b.values().length];
            f197716a = iArr;
            try {
                iArr[com.planner5d.library.model.p.b.big.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f197716a[com.planner5d.library.model.p.b.normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @ij.a
    public s0(com.planner5d.library.model.manager.config.p pVar) {
        this.f197713c = pVar;
    }

    public boolean a() {
        return c() != com.planner5d.library.model.p.b.small;
    }

    @androidx.annotation.m1
    public ac.i b() {
        String strW = this.f197713c.w(com.planner5d.library.services.r.shadowType, ac.i.None.f4880a);
        if (ac.i.VsmHard.f4880a.equals(strW)) {
            return ac.i.SimpleSoft;
        }
        for (ac.i iVar : ac.i.l()) {
            if (iVar.f4880a.equalsIgnoreCase(strW)) {
                return iVar;
            }
        }
        return ac.i.None;
    }

    @androidx.annotation.m1
    public com.planner5d.library.model.p.b c() {
        com.planner5d.library.model.p.b bVar;
        com.planner5d.library.model.p.b bVar2 = this.f197715e;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (this.f197714d) {
            try {
                bVar = this.f197715e;
                if (bVar == null) {
                    bVar = com.planner5d.library.model.p.b.big;
                    int iL = this.f197713c.l(com.planner5d.library.services.r.textureType, bVar.f222457a);
                    for (com.planner5d.library.model.p.b bVar3 : com.planner5d.library.model.p.b.values()) {
                        if (bVar3.f222457a == iL) {
                            bVar = bVar3;
                            break;
                        }
                    }
                    this.f197715e = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public boolean d() {
        com.planner5d.library.model.p.b bVar;
        synchronized (this.f197714d) {
            try {
                int i10 = a.f197716a[c().ordinal()];
                if (i10 == 1) {
                    bVar = com.planner5d.library.model.p.b.normal;
                } else {
                    if (i10 != 2) {
                        return false;
                    }
                    bVar = com.planner5d.library.model.p.b.small;
                }
                return h(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.m1
    public boolean f(ac.i iVar) {
        ac.i iVarB = b();
        this.f197713c.H(com.planner5d.library.services.r.shadowType, iVar.f4880a);
        com.planner5d.library.services.m0.f224437j.t();
        return iVarB == null || !iVarB.f4880a.equalsIgnoreCase(iVar.f4880a);
    }

    @androidx.annotation.m1
    public boolean h(com.planner5d.library.model.p.b bVar) {
        boolean z10;
        synchronized (this.f197714d) {
            try {
                com.planner5d.library.model.p.b bVarC = c();
                this.f197713c.g(com.planner5d.library.services.r.textureType, bVar.f222457a);
                this.f197715e = bVar;
                com.planner5d.library.services.m0.f224437j.t();
                z10 = bVarC.f222457a != bVar.f222457a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
