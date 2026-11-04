package com.planner5d.library.unity;

import com.planner5d.library.math.k;
import com.planner5d.library.math.n;
import com.planner5d.library.walls.WallHole;
import com.planner5d.library.walls.WallsBuilder3D;
import com.planner5d.library.walls.WallsBuilder3DMesh;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.h f230650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<WallHole> f230651b;

    private static final class a implements WallsBuilder3DMesh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final h f230652a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final h a() {
            return this.f230652a;
        }

        @Override // com.planner5d.library.walls.WallsBuilder3DMesh
        public void buildClose(@NotNull n v10, @NotNull n v11, @NotNull n v12) {
            Intrinsics.checkNotNullParameter(v10, "v0");
            Intrinsics.checkNotNullParameter(v11, "v1");
            Intrinsics.checkNotNullParameter(v12, "v2");
            this.f230652a.a().b(v10).b(v11).b(v12);
        }

        @Override // com.planner5d.library.walls.WallsBuilder3DMesh
        public void buildSide(@NotNull n v10, @NotNull n v11, @NotNull n v12, boolean z10) {
            Intrinsics.checkNotNullParameter(v10, "v0");
            Intrinsics.checkNotNullParameter(v11, "v1");
            Intrinsics.checkNotNullParameter(v12, "v2");
            h hVar = this.f230652a;
            (z10 ? hVar.c() : hVar.b()).b(v10).b(v11).b(v12);
        }

        public a(@NotNull h wall) {
            Intrinsics.checkNotNullParameter(wall, "wall");
            this.f230652a = wall;
        }

        public /* synthetic */ a(h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new h() : hVar);
        }
    }

    public g(@NotNull com.planner5d.library.math.h tessellator, @NotNull List<WallHole> holes) {
        Intrinsics.checkNotNullParameter(tessellator, "tessellator");
        Intrinsics.checkNotNullParameter(holes, "holes");
        this.f230650a = tessellator;
        this.f230651b = holes;
    }

    private final float[] b(WallsInfo wallsInfo) {
        com.planner5d.library.math.h hVar = this.f230650a;
        k[] path = wallsInfo.getPath(WallsInfoWall.Side.Bottom);
        ArrayList arrayList = new ArrayList(path.length);
        for (k kVar : path) {
            arrayList.add(new k(kVar));
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array != null) {
            return hVar.h((k[]) array, true);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    private final e d(WallsInfoWall wallsInfoWall, float f10) {
        e eVar = new e();
        new com.planner5d.library.mesh.k(wallsInfoWall, 0.0f, f10).a(eVar);
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final h e(WallsInfo wallsInfo, WallsInfoWall wallsInfoWall, float f10, WallsBuilder3D.WallPart wallPart) {
        a aVar = new a(null, 1, 0 == true ? 1 : 0);
        new WallsBuilder3D(wallsInfo, wallsInfoWall, WallsBuilder3D.WallPart.All, wallPart, 1.0f, f(wallsInfoWall, f10), this.f230650a, com.planner5d.library.math.f.f180474a, aVar, 0.0f, 512, null).build();
        return aVar.a();
    }

    private final List<WallHole> f(WallsInfoWall wallsInfoWall, float f10) {
        List<WallHole> list = this.f230651b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            WallHole wallHole = (WallHole) obj;
            if (wallHole.getZInProject() + wallHole.height > f10 && wallHole.getZInProject() < wallsInfoWall.getWall().getHeight() + f10 && com.planner5d.library.math.b.f180462a.e(wallsInfoWall.getPolygonPoints(true), wallHole.polygon2D)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final f a(@NotNull WallsInfo info, float f10, @Nullable WallsBuilder3D.WallPart wallPart) {
        Intrinsics.checkNotNullParameter(info, "info");
        float[] fArrB = b(info);
        WallsInfoWall[] wallsInfoWallArr = info.get();
        ArrayList arrayList = new ArrayList(wallsInfoWallArr.length);
        for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
            arrayList.add(e(info, wallsInfoWall, f10, wallPart));
        }
        return new f(fArrB, arrayList);
    }

    @NotNull
    public final List<e> c(@NotNull WallsInfo info, float f10, @Nullable WallsBuilder3D.WallPart wallPart, float f11) {
        Intrinsics.checkNotNullParameter(info, "info");
        WallsInfoWall[] wallsInfoWallArr = info.get();
        ArrayList arrayList = new ArrayList(wallsInfoWallArr.length);
        boolean z10 = true;
        for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
            arrayList.add(d(wallsInfoWall, f11));
        }
        return arrayList;
    }
}
