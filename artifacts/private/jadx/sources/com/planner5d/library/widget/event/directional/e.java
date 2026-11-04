package com.planner5d.library.widget.event.directional;

import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
class e extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<Integer> f258161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.k f258162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f258163f;

    e(i iVar) {
        super(iVar);
        this.f258161d = new HashSet();
        this.f258162e = new com.planner5d.library.math.k();
        this.f258163f = new com.planner5d.library.math.k();
    }

    private com.planner5d.library.math.k g(com.planner5d.library.math.k kVar, int i10) {
        if (i10 != 29) {
            if (i10 != 32) {
                if (i10 != 47) {
                    if (i10 != 51) {
                        switch (i10) {
                            case 19:
                                break;
                            case 20:
                                break;
                            case 21:
                                break;
                            case 22:
                                break;
                            default:
                                switch (i10) {
                                    case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                                        break;
                                    case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                                        break;
                                    case 89:
                                        break;
                                    case 90:
                                        break;
                                    default:
                                        return kVar.U(0.0f, 0.0f);
                                }
                                break;
                        }
                    }
                    return kVar.U(0.0f, -1.0f);
                }
                return kVar.U(0.0f, 1.0f);
            }
            return kVar.U(1.0f, 0.0f);
        }
        return kVar.U(-1.0f, 0.0f);
    }

    private void h() {
        this.f258162e.U(0.0f, 0.0f);
        Iterator<Integer> it = this.f258161d.iterator();
        while (it.hasNext()) {
            this.f258162e.b(g(this.f258163f, it.next().intValue()));
        }
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean a(int i10, int i11, int i12, int i13, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean b(int i10, KeyEvent keyEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        int action = keyEvent.getAction();
        if (action == 0) {
            kVar.V(g(this.f258163f, i10));
            if (kVar.f180480a != 0.0f || kVar.f180481b != 0.0f) {
                this.f258161d.add(Integer.valueOf(i10));
            }
            if (this.f258161d.size() > 1) {
                h();
                kVar.V(this.f258162e);
            }
        } else if (action == 1) {
            this.f258161d.remove(Integer.valueOf(i10));
            if (this.f258161d.size() > 0) {
                h();
                kVar.V(this.f258162e);
            }
        }
        return true;
    }

    @Override // com.planner5d.library.widget.event.directional.a
    protected boolean c(MotionEvent motionEvent, com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2) {
        return false;
    }
}
