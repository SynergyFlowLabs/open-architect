package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j extends g<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f88111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f88112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f88113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PathMeasure f88114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i f88115m;

    public j(List<? extends com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f88111i = new PointF();
        int i10 = 6 ^ 2;
        this.f88112j = new float[2];
        this.f88113k = new float[2];
        this.f88114l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f10) {
        float f11;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        if (pathK == null) {
            return aVar.f88869b;
        }
        com.airbnb.lottie.value.j<A> jVar = this.f88085e;
        if (jVar != 0) {
            f11 = f10;
            PointF pointF = (PointF) jVar.b(iVar.f88874g, iVar.f88875h.floatValue(), (PointF) iVar.f88869b, (PointF) iVar.f88870c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        } else {
            f11 = f10;
        }
        if (this.f88115m != iVar) {
            this.f88114l.setPath(pathK, false);
            this.f88115m = iVar;
        }
        float length = this.f88114l.getLength();
        float f12 = f11 * length;
        this.f88114l.getPosTan(f12, this.f88112j, this.f88113k);
        PointF pointF2 = this.f88111i;
        float[] fArr = this.f88112j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f88111i;
            float[] fArr2 = this.f88113k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f88111i;
            float[] fArr3 = this.f88113k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f88111i;
    }
}
