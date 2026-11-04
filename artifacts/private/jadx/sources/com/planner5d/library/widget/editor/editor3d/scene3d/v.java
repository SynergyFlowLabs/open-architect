package com.planner5d.library.widget.editor.editor3d.scene3d;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes12.dex */
class v implements ac.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f255886d = 0.03f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f255887e = 0.25f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f255888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cc.c[] f255889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f255890c = null;

    v(cc.c[] cVarArr, boolean z10) {
        Float f10 = null;
        this.f255888a = z10;
        this.f255889b = cVarArr;
        boolean z11 = false | false;
        Boolean bool = null;
        for (cc.c cVar : cVarArr) {
            if (cVar.a().iterator().hasNext() && ((bc.b) cVar.a().iterator().next()).f1()) {
                bc.b bVar = (bc.b) cVar.a().iterator().next();
                Float fO0 = bVar.O0();
                boolean zZ1 = bVar.z1();
                Boolean boolValueOf = Boolean.valueOf(zZ1);
                if (f10 == null || bool == null || !bool.booleanValue() || (zZ1 && fO0 != null && fO0.floatValue() < f10.floatValue())) {
                    f10 = fO0;
                    bool = boolValueOf;
                }
            }
        }
        if (f10 == null || bool == null) {
            return;
        }
        d(f10.floatValue());
    }

    private void d(final float f10) {
        this.f255890c = Float.valueOf(f10);
        for (cc.c cVar : this.f255889b) {
            cVar.a().forEach(new Consumer() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.t
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((bc.b) obj).D1(Float.valueOf(f10));
                }
            });
        }
    }

    @Override // ac.l
    public boolean a() {
        float fMin;
        Float f10 = this.f255890c;
        float fFloatValue = f10 == null ? 1.0f : f10.floatValue();
        if (this.f255888a) {
            if (fFloatValue == f255887e) {
                return false;
            }
            fMin = Math.max(fFloatValue - f255886d, f255887e);
        } else {
            if (fFloatValue == 1.0f) {
                for (cc.c cVar : this.f255889b) {
                    cVar.a().forEach(new Consumer() { // from class: com.planner5d.library.widget.editor.editor3d.scene3d.u
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((bc.b) obj).D1(null);
                        }
                    });
                }
                this.f255890c = null;
                return false;
            }
            fMin = Math.min(fFloatValue + f255886d, 1.0f);
        }
        Float f11 = this.f255890c;
        if (f11 == null || f11.floatValue() != fMin) {
            d(fMin);
        }
        this.f255890c = Float.valueOf(fMin);
        return true;
    }
}
