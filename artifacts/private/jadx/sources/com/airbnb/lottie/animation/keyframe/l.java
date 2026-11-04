package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l extends g<com.airbnb.lottie.value.k> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.value.k f88117i;

    public l(List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>> list) {
        super(list);
        this.f88117i = new com.airbnb.lottie.value.k();
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
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k i(com.airbnb.lottie.value.a<com.airbnb.lottie.value.k> aVar, float f10) {
        com.airbnb.lottie.value.k kVar;
        float f11;
        com.airbnb.lottie.value.k kVar2 = aVar.f88869b;
        if (kVar2 == null || (kVar = aVar.f88870c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.k kVar3 = kVar2;
        com.airbnb.lottie.value.k kVar4 = kVar;
        com.airbnb.lottie.value.j<A> jVar = this.f88085e;
        if (jVar != 0) {
            f11 = f10;
            com.airbnb.lottie.value.k kVar5 = (com.airbnb.lottie.value.k) jVar.b(aVar.f88874g, aVar.f88875h.floatValue(), kVar3, kVar4, f11, e(), f());
            if (kVar5 != null) {
                return kVar5;
            }
        } else {
            f11 = f10;
        }
        this.f88117i.d(com.airbnb.lottie.utils.i.k(kVar3.b(), kVar4.b(), f11), com.airbnb.lottie.utils.i.k(kVar3.c(), kVar4.c(), f11));
        return this.f88117i;
    }
}
