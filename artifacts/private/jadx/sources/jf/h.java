package jf;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final hf.c f307436a;

    public h(@NotNull hf.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f307436a = builder;
    }

    @Override // jf.e
    @NotNull
    public kf.b k() {
        hf.c cVar = this.f307436a;
        k kVar = new k(0.0f, 0.0f);
        k kVar2 = new k(150.0f, 0.0f);
        kf.e eVar = kf.e.Yellow;
        hf.b bVarD = cVar.b(kVar, kVar2, eVar).d("126", 75, 85);
        hf.c cVar2 = this.f307436a;
        k kVar3 = new k(150.0f, 0.0f);
        k kVar4 = new k(150.0f, -100.0f);
        kf.e eVar2 = kf.e.Purple;
        hf.b bVarB = cVar2.b(kVar3, kVar4, eVar2);
        hf.b bVarC = hf.c.c(this.f307436a, new k(150.0f, -100.0f), new k(350.0f, -100.0f), null, 4, null);
        hf.b bVarB2 = this.f307436a.b(new k(350.0f, -100.0f), new k(350.0f, 0.0f), eVar2);
        hf.c cVar3 = this.f307436a;
        k kVar5 = new k(350.0f, 0.0f);
        k kVar6 = new k(500.0f, 0.0f);
        kf.e eVar3 = kf.e.Green;
        cVar3.b(kVar5, kVar6, eVar3).d("126", 75, 85);
        hf.c cVar4 = this.f307436a;
        k kVar7 = new k(500.0f, 0.0f);
        k kVar8 = new k(500.0f, 400.0f);
        kf.e eVar4 = kf.e.Blue;
        hf.b bVarB3 = cVar4.b(kVar7, kVar8, eVar4);
        hf.b bVarC2 = hf.c.c(this.f307436a, new k(500.0f, 400.0f), new k(0.0f, 400.0f), null, 4, null).c("122", 400, 0);
        return this.f307436a.a(bVarD, bVarC2, 150, 600, eVar4).a(bVarB, this.f307436a.b(new k(0.0f, 400.0f), new k(0.0f, 0.0f), eVar4), 90, 300, eVar).a(bVarB2, bVarB3, 90, 300, eVar3).a(bVarD, bVarC, 60, 200, eVar2).d();
    }
}
