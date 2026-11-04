package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o extends g<com.airbnb.lottie.model.b> {

    class a extends com.airbnb.lottie.value.j<com.airbnb.lottie.model.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.b f88129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f88130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.model.b f88131f;

        a(com.airbnb.lottie.value.b bVar, com.airbnb.lottie.value.j jVar, com.airbnb.lottie.model.b bVar2) {
            this.f88129d = bVar;
            this.f88130e = jVar;
            this.f88131f = bVar2;
        }

        @Override // com.airbnb.lottie.value.j
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.airbnb.lottie.model.b a(com.airbnb.lottie.value.b<com.airbnb.lottie.model.b> bVar) {
            this.f88129d.h(bVar.f(), bVar.a(), bVar.g().f88363a, bVar.b().f88363a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f88130e.a(this.f88129d);
            com.airbnb.lottie.model.b bVarB = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f88131f.a(str, bVarB.f88364b, bVarB.f88365c, bVarB.f88366d, bVarB.f88367e, bVarB.f88368f, bVarB.f88369g, bVarB.f88370h, bVarB.f88371i, bVarB.f88372j, bVarB.f88373k, bVarB.f88374l, bVarB.f88375m);
            return this.f88131f;
        }
    }

    public o(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public com.airbnb.lottie.model.b i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.b> aVar, float f10) {
        com.airbnb.lottie.model.b bVar;
        com.airbnb.lottie.value.j<A> jVar = this.f88085e;
        if (jVar == 0) {
            return (f10 != 1.0f || (bVar = aVar.f88870c) == null) ? aVar.f88869b : bVar;
        }
        float f11 = aVar.f88874g;
        Float f12 = aVar.f88875h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        com.airbnb.lottie.model.b bVar2 = aVar.f88869b;
        com.airbnb.lottie.model.b bVar3 = bVar2;
        com.airbnb.lottie.model.b bVar4 = aVar.f88870c;
        return (com.airbnb.lottie.model.b) jVar.b(f11, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void r(com.airbnb.lottie.value.j<String> jVar) {
        super.o(new a(new com.airbnb.lottie.value.b(), jVar, new com.airbnb.lottie.model.b()));
    }
}
