package jf;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final hf.c f307432a;

    public c(@NotNull hf.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f307432a = builder;
    }

    @Override // jf.e
    @NotNull
    public kf.b k() {
        hf.c cVar = this.f307432a;
        k kVar = new k(5.0f, 23.0f);
        k kVar2 = new k(103.0f, 23.0f);
        kf.e eVar = kf.e.Blue;
        hf.b bVarB = cVar.b(kVar, kVar2, eVar);
        hf.b bVarD = hf.c.c(this.f307432a, new k(103.0f, 23.0f), new k(192.0f, -93.0f), null, 4, null).d("s/2012", 70, 70);
        hf.c.c(this.f307432a, new k(192.0f, -93.0f), new k(333.0f, -93.0f), null, 4, null).d("s/2012", 70, 70);
        hf.b bVarD2 = hf.c.c(this.f307432a, new k(333.0f, -93.0f), new k(421.0f, 23.0f), null, 4, null).d("s/2012", 70, 70);
        hf.c cVar2 = this.f307432a;
        k kVar3 = new k(421.0f, 23.0f);
        k kVar4 = new k(518.0f, 23.0f);
        kf.e eVar2 = kf.e.Yellow;
        cVar2.b(kVar3, kVar4, eVar2);
        hf.c cVar3 = this.f307432a;
        k kVar5 = new k(518.0f, 23.0f);
        k kVar6 = new k(518.0f, 392.0f);
        kf.e eVar3 = kf.e.Orange;
        hf.b bVarB2 = cVar3.b(kVar5, kVar6, eVar3);
        return this.f307432a.a(bVarD, this.f307432a.b(new k(5.0f, 392.0f), new k(5.0f, 23.0f), eVar3), 90, 200, eVar).a(bVarD2, bVarB2, 90, 200, eVar2).a(hf.c.c(this.f307432a, new k(518.0f, 392.0f), new k(5.0f, 392.0f), null, 4, null).c("122", 400, 0), bVarB, 300, 500, eVar3).d();
    }
}
