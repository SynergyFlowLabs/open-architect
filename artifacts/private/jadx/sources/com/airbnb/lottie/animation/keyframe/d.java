package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d extends g<Float> {
    public d(List<com.airbnb.lottie.value.a<Float>> list) {
        super(list);
    }

    public float q() {
        return r(b(), d());
    }

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
    float r(com.airbnb.lottie.value.a<Float> aVar, float f10) {
        float f11;
        if (aVar.f88869b == null || aVar.f88870c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.j<A> jVar = this.f88085e;
        if (jVar != 0) {
            f11 = f10;
            Float f12 = (Float) jVar.b(aVar.f88874g, aVar.f88875h.floatValue(), aVar.f88869b, aVar.f88870c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return com.airbnb.lottie.utils.i.k(aVar.g(), aVar.d(), f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float i(com.airbnb.lottie.value.a<Float> aVar, float f10) {
        return Float.valueOf(r(aVar, f10));
    }
}
