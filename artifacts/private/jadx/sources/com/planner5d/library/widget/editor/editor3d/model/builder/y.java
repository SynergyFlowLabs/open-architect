package com.planner5d.library.widget.editor.editor3d.model.builder;

import android.graphics.Color;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.services.utility.j3;
import com.planner5d.library.walls.Wall;
import com.planner5d.library.walls.WallHole;
import com.planner5d.library.walls.WallsBuilder3D;
import com.planner5d.library.walls.WallsBuilder3DSide;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nModel3DBuilderWall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Model3DBuilderWall.kt\ncom/planner5d/library/widget/editor/editor3d/model/builder/Model3DBuilderWall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class y extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f255709h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f255710i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final ItemMaterial f255711j = new ItemMaterial((String) null, Color.rgb(Color.red(-14898325), Color.green(-14898325), Color.blue(-14898325)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final dc.d<cc.a> f255712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WallsInfoWall f255713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final WallsBuilder3D.WallPart f255714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.mesh.f f255715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.mesh.d f255716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final WallsBuilder3DSide f255717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final dc.l<cc.a> f255718g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f255719a;

        static {
            int[] iArr = new int[WallsBuilder3D.WallPart.values().length];
            try {
                iArr[WallsBuilder3D.WallPart.SideOutdoor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallsBuilder3D.WallPart.SideIndoor.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WallsBuilder3D.WallPart.AllExceptSides.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WallsBuilder3D.WallPart.CloseStart.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WallsBuilder3D.WallPart.CloseEnd.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WallsBuilder3D.WallPart.CloseTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f255719a = iArr;
        }
    }

    public /* synthetic */ y(dc.d dVar, WallsInfo wallsInfo, WallsInfoWall wallsInfoWall, WallsBuilder3D.WallPart wallPart, WallsBuilder3D.WallPart wallPart2, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, wallsInfo, wallsInfoWall, wallPart, wallPart2, (i10 & 32) != 0 ? 0.0f : f10);
    }

    private final cc.a g(final com.planner5d.library.engine.a aVar, final Function0<? extends dc.e<cc.a>> function0) {
        this.f255715d.a(new d(new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y.k(this.f255706a, aVar, function0);
            }
        }));
        cc.a aVarP = this.f255718g.p();
        if (aVarP != null) {
            return this.f255718g.j(aVarP, this.f255717f);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e h(y yVar, com.planner5d.library.engine.a aVar, ve.b bVar) {
        return yVar.m(aVar, bVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e i(y yVar, com.planner5d.library.engine.a aVar, ve.b bVar) {
        return yVar.m(aVar, bVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e j(y yVar, com.planner5d.library.engine.a aVar, ve.b bVar) {
        return yVar.l(aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.e k(y yVar, com.planner5d.library.engine.a aVar, Function0 function0) {
        yVar.f255718g.f(aVar);
        return (dc.e) function0.invoke();
    }

    private final dc.e<cc.a> l(com.planner5d.library.engine.a aVar, ve.b bVar) {
        dc.l<cc.a> lVar = this.f255718g;
        bc.b bVarE = bVar.e(aVar, false, ItemWall.MATERIAL_CLOSE, "side");
        Intrinsics.checkNotNullExpressionValue(bVarE, "createMaterial(...)");
        return lVar.h(bVarE);
    }

    private final dc.e<cc.a> m(com.planner5d.library.engine.a aVar, ve.b bVar, boolean z10) {
        Wall wall = this.f255713b.getWall();
        Intrinsics.checkNotNull(wall, "null cannot be cast to non-null type com.planner5d.library.model.item.ItemWall");
        dc.l<cc.a> lVar = this.f255718g;
        bc.b bVarB = bVar.b(aVar, true, ((ItemWall) wall).getMaterialSide(!z10));
        Intrinsics.checkNotNullExpressionValue(bVarB, "createMaterial(...)");
        return lVar.i(z10, bVarB);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    @Nullable
    public cc.a a(@NotNull final com.planner5d.library.engine.a application, @NotNull final ve.b manager) throws Exception {
        Function0<? extends dc.e<cc.a>> function0;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (this.f255716e.f180504h) {
            return null;
        }
        switch (b.f255719a[this.f255714c.ordinal()]) {
            case 1:
                function0 = new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return y.h(this.f255697a, application, manager);
                    }
                };
                break;
            case 2:
                function0 = new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return y.i(this.f255700a, application, manager);
                    }
                };
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                function0 = new Function0() { // from class: com.planner5d.library.widget.editor.editor3d.model.builder.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return y.j(this.f255703a, application, manager);
                    }
                };
                break;
            default:
                throw new Exception("All is not supported for walls");
        }
        return g(application, function0);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.model.builder.e
    public void b(@NotNull ve.b manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (this.f255716e.f180504h) {
            return;
        }
        Wall wall = this.f255713b.getWall();
        Intrinsics.checkNotNull(wall, "null cannot be cast to non-null type com.planner5d.library.model.item.ItemWall");
        ItemWall itemWall = (ItemWall) wall;
        manager.u(ItemWall.MATERIAL_CLOSE);
        manager.u(itemWall.getMaterialSide(false));
        manager.u(itemWall.getMaterialSide(true));
    }

    @NotNull
    public final dc.d<cc.a> n() {
        return this.f255712a;
    }

    @NotNull
    public final WallsInfoWall o() {
        return this.f255713b;
    }

    public y(@NotNull dc.d<cc.a> factory, @NotNull WallsInfo info, @NotNull WallsInfoWall wall, @NotNull WallsBuilder3D.WallPart part, @Nullable WallsBuilder3D.WallPart wallPart, float f10) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(part, "part");
        this.f255712a = factory;
        this.f255713b = wall;
        this.f255714c = part;
        com.planner5d.library.math.h hVar = j3.f225291c;
        com.planner5d.library.math.f fVar = com.planner5d.library.math.f.f180474a;
        com.planner5d.library.mesh.i iVar = new com.planner5d.library.mesh.i(hVar, fVar);
        List<WallHole> listA = z.f255720a.a(wall);
        com.planner5d.library.mesh.d dVar = new com.planner5d.library.mesh.d(info, wall, listA, part, wallPart, f10);
        this.f255716e = dVar;
        this.f255715d = iVar.a(dVar);
        this.f255717f = new WallsBuilder3DSide(info, wall, listA, hVar, fVar);
        this.f255718g = factory.g(part, wall);
    }
}
