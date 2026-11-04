package com.planner5d.library.widget.editor.editor3d.model.builder;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.services.utility.j3;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class l extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f255666i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ItemGround f255667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f255668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final WallsInfoWall f255669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.engine.a f255670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.engine.rendering.util.a f255671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ItemMaterial f255672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.mesh.f f255673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final dc.b<cc.a> f255674h;

    public l(@NotNull dc.d<cc.a> factory, @NotNull ItemGround itemGround, float f10, boolean z10, boolean z11, @Nullable WallsInfoWall wallsInfoWall) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(itemGround, "itemGround");
        this.f255667a = itemGround;
        this.f255668b = z11;
        this.f255669c = wallsInfoWall;
        com.planner5d.library.mesh.i iVar = new com.planner5d.library.mesh.i(j3.f225291c, com.planner5d.library.math.f.f180474a);
        dc.b<T> bVarH = factory.h();
        this.f255674h = bVarH;
        if (!(itemGround instanceof ItemRoom)) {
            this.f255671e = bVarH.l(f10);
            this.f255672f = itemGround.getMaterialFloor();
            WallsInfo wallsInfo = itemGround.getWallsInfo();
            Intrinsics.checkNotNullExpressionValue(wallsInfo, "getWallsInfo(...)");
            this.f255673g = iVar.a(new com.planner5d.library.mesh.b(wallsInfo, 0.0f, true));
            return;
        }
        if (z11) {
            float f11 = itemGround.height;
            this.f255671e = bVarH.c(f10 + f11);
            this.f255672f = ((ItemRoom) itemGround).getMaterials()[1];
            WallsInfo wallsInfo2 = ((ItemRoom) itemGround).getWallsInfo();
            Intrinsics.checkNotNullExpressionValue(wallsInfo2, "getWallsInfo(...)");
            this.f255673g = iVar.a(new com.planner5d.library.mesh.a(wallsInfo2, f11, !z10));
            return;
        }
        float flooringHeight = ((ItemRoom) itemGround).getFlooringHeight();
        if (wallsInfoWall != null) {
            this.f255671e = bVarH.b(new com.planner5d.library.math.c(new com.planner5d.library.math.k(wallsInfoWall.getBottom().e()), new com.planner5d.library.math.k(wallsInfoWall.getBottom().c())), wallsInfoWall.getWall().getOrigin(new com.planner5d.library.math.k()));
            this.f255672f = ((ItemRoom) itemGround).getMaterialFloor();
            this.f255673g = iVar.a(new com.planner5d.library.mesh.c(wallsInfoWall, 0.0f, flooringHeight));
        } else {
            this.f255671e = bVarH.k(f10 + flooringHeight);
            this.f255672f = ((ItemRoom) itemGround).getMaterialFloor();
            WallsInfo wallsInfo3 = ((ItemRoom) itemGround).getWallsInfo();
            Intrinsics.checkNotNullExpressionValue(wallsInfo3, "getWallsInfo(...)");
            this.f255673g = iVar.a(new com.planner5d.library.mesh.b(wallsInfo3, flooringHeight, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e g(l lVar, ve.b bVar) {
        return lVar.l("ceil", lVar.k(bVar, lVar.f255672f, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e h(l lVar, ve.b bVar) {
        return lVar.l("floor", lVar.k(bVar, lVar.f255672f, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e i(l lVar, ve.b bVar) {
        return lVar.l("flooring_wall", lVar.k(bVar, lVar.f255672f, ((ItemRoom) lVar.f255667a).isSelfIntersecting()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e j(l lVar, ve.b bVar) {
        return lVar.l("floor", lVar.k(bVar, lVar.f255672f, false));
    }

    private final bc.b k(ve.b bVar, ItemMaterial itemMaterial, boolean z10) {
        bc.b bVarB = bVar.b(this.f255670d, true, itemMaterial);
        if (z10) {
            bVarB.Z0(true, true);
        }
        Intrinsics.checkNotNullExpressionValue(bVarB, "apply(...)");
        return bVarB;
    }

    private final dc.e<cc.a> l(String str, bc.b bVar) {
        return this.f255674h.n(str, bVar);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    @Nullable
    public cc.a a(@NotNull com.planner5d.library.engine.a application, @NotNull final ve.b manager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f255674h.f(application);
        this.f255670d = application;
        ItemGround itemGround = this.f255667a;
        if (!(itemGround instanceof ItemRoom)) {
            this.f255673g.a(new d(new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.j(this.f255664a, manager);
                }
            }));
        } else if (this.f255668b) {
            if (((ItemRoom) itemGround).getCeilingHidden()) {
                return null;
            }
            this.f255673g.a(new d(new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.g(this.f255658a, manager);
                }
            }));
        } else {
            if (((ItemRoom) itemGround).getFloorHidden()) {
                return null;
            }
            if (this.f255669c == null) {
                this.f255673g.a(new d(new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.h(this.f255660a, manager);
                    }
                }));
            } else {
                this.f255673g.a(new d(new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l.i(this.f255662a, manager);
                    }
                }));
            }
        }
        return this.f255674h.g(this.f255671e);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    public void b(@NotNull ve.b manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        manager.u(this.f255672f);
    }
}
