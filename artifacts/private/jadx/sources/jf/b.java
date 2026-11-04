package jf;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final hf.c f307431a;

    public b(@NotNull hf.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f307431a = builder;
    }

    @Override // jf.e
    @NotNull
    public kf.b k() {
        hf.c cVar = this.f307431a;
        k kVar = new k(0.0f, 0.0f);
        k kVar2 = new k(290.0f, 0.0f);
        kf.e eVar = kf.e.Orange;
        hf.b bVarB = cVar.b(kVar, kVar2, eVar);
        hf.c cVar2 = this.f307431a;
        k kVar3 = new k(290.0f, 0.0f);
        k kVar4 = new k(290.0f, 210.0f);
        kf.e eVar2 = kf.e.Blue;
        hf.b bVarD = cVar2.b(kVar3, kVar4, eVar2).d("209", 105, 85);
        hf.c cVar3 = this.f307431a;
        k kVar5 = new k(290.0f, 210.0f);
        k kVar6 = new k(540.0f, 210.0f);
        kf.e eVar3 = kf.e.Purple;
        hf.b bVarB2 = cVar3.b(kVar5, kVar6, eVar3);
        hf.c cVar4 = this.f307431a;
        k kVar7 = new k(540.0f, 210.0f);
        k kVar8 = new k(540.0f, 500.0f);
        kf.e eVar4 = kf.e.Green;
        hf.b bVarD2 = cVar4.b(kVar7, kVar8, eVar4).d("209", androidx.media2.widget.f.i.f59773f0, 85);
        hf.b bVarC = hf.c.c(this.f307431a, new k(540.0f, 500.0f), new k(0.0f, 500.0f), null, 4, null).c("122", 400, 0);
        hf.c cVar5 = this.f307431a;
        k kVar9 = new k(0.0f, 500.0f);
        k kVar10 = new k(0.0f, 0.0f);
        kf.e eVar5 = kf.e.Yellow;
        return this.f307431a.a(bVarB2, bVarB, 170, 300, eVar2).a(bVarD, cVar5.b(kVar9, kVar10, eVar5), 150, 400, eVar).a(bVarB, bVarC, com.rabbitmq.client.a.f264844o, 600, eVar5).a(bVarD, bVarD2, 60, 300, eVar3).a(bVarC, bVarB2, 150, 300, eVar4).d();
    }
}
