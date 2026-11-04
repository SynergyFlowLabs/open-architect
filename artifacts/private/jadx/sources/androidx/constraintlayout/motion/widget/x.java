package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45501a = "TransitionBuilder";

    public static t.b a(t tVar, int i10, int i11, androidx.constraintlayout.widget.f fVar, int i12, androidx.constraintlayout.widget.f fVar2) {
        t.b bVar = new t.b(i10, tVar, i11, i12);
        b(tVar, bVar, fVar, fVar2);
        return bVar;
    }

    private static void b(t tVar, t.b bVar, androidx.constraintlayout.widget.f fVar, androidx.constraintlayout.widget.f fVar2) {
        int I = bVar.I();
        int iB = bVar.B();
        tVar.k0(I, fVar);
        tVar.k0(iB, fVar2);
    }

    public static void c(MotionLayout motionLayout) {
        t tVar = motionLayout.f44993a;
        if (tVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!tVar.t0(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (tVar.f45389c == null || tVar.s().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
