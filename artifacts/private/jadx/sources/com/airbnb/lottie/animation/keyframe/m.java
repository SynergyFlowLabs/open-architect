package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.content.t;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m extends a<com.airbnb.lottie.model.content.o, Path> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.o f88118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f88119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f88120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f88121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<t> f88122m;

    public m(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.o>> list) {
        super(list);
        this.f88118i = new com.airbnb.lottie.model.content.o();
        this.f88119j = new Path();
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
    public Path i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.o> aVar, float f10) {
        com.airbnb.lottie.model.content.o oVar = aVar.f88869b;
        com.airbnb.lottie.model.content.o oVar2 = aVar.f88870c;
        this.f88118i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        com.airbnb.lottie.model.content.o oVarF = this.f88118i;
        List<t> list = this.f88122m;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                oVarF = this.f88122m.get(size).f(oVarF);
            }
        }
        com.airbnb.lottie.utils.i.i(oVarF, this.f88119j);
        if (this.f88085e == null) {
            return this.f88119j;
        }
        if (this.f88120k == null) {
            this.f88120k = new Path();
            this.f88121l = new Path();
        }
        com.airbnb.lottie.utils.i.i(oVar, this.f88120k);
        if (oVar2 != null) {
            com.airbnb.lottie.utils.i.i(oVar2, this.f88121l);
        }
        com.airbnb.lottie.value.j<A> jVar = this.f88085e;
        float f11 = aVar.f88874g;
        float fFloatValue = aVar.f88875h.floatValue();
        Path path = this.f88120k;
        return (Path) jVar.b(f11, fFloatValue, path, oVar2 == null ? path : this.f88121l, f10, e(), f());
    }

    public void r(@p0 List<t> list) {
        this.f88122m = list;
    }
}
