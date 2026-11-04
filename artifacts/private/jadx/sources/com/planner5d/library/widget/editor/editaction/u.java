package com.planner5d.library.widget.editor.editaction;

import android.graphics.PointF;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEarth;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.helper.ItemProjectPosition;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class u extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f254793e = 0;

    @SourceDebugExtension({"SMAP\nMoveFloorItemsAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoveFloorItemsAction.kt\ncom/planner5d/library/widget/editor/editaction/MoveFloorItemsAction$LocationsAndRotations\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n13409#2,2:80\n37#3,2:82\n1#4:84\n*S KotlinDebug\n*F\n+ 1 MoveFloorItemsAction.kt\ncom/planner5d/library/widget/editor/editaction/MoveFloorItemsAction$LocationsAndRotations\n*L\n42#1:80,2\n63#1:82,2\n*E\n"})
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f254794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.math.m[] f254795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final float[] f254796c;

        /* JADX INFO: renamed from: com.planner5d.library.widget.editor.editaction.u$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1725a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f254797a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.OutsidersToCenter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f254797a = iArr;
            }
        }

        public a(@NotNull ItemFloor floor, @NotNull b move) {
            Intrinsics.checkNotNullParameter(floor, "floor");
            Intrinsics.checkNotNullParameter(move, "move");
            this.f254794a = new ArrayList();
            ItemLayout itemLayout = new ItemLayout();
            com.planner5d.library.math.k kVar = new com.planner5d.library.math.k();
            com.planner5d.library.math.k kVar2 = new com.planner5d.library.math.k();
            com.planner5d.library.math.k DEFAULT_SIZE = ItemEarth.DEFAULT_SIZE;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_SIZE, "DEFAULT_SIZE");
            com.planner5d.library.math.k kVar3 = new com.planner5d.library.math.k(DEFAULT_SIZE);
            Item parentItem = floor.getParentItem();
            if (parentItem instanceof ItemProject) {
                ((ItemProject) parentItem).getEarth().getSize(kVar3);
            }
            float f10 = 2;
            com.planner5d.library.math.k kVar4 = new com.planner5d.library.math.k(kVar3.f180480a / f10, kVar3.f180481b / f10);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            com.planner5d.library.math.k kVarR = b(kVar3, floor).R(-1.0f);
            com.planner5d.library.services.c0 c0Var = new com.planner5d.library.services.c0();
            Item[] children = floor.getChildren();
            if (children != null) {
                int length = children.length;
                int i10 = 0;
                while (i10 < length) {
                    Item item = children[i10];
                    Item[] itemArr = children;
                    List<String> list = this.f254794a;
                    String uid = item.getUid();
                    float f11 = f10;
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    list.add(uid);
                    item.getLayout(itemLayout).getPosition(kVar);
                    int i11 = C1725a.f254797a[move.ordinal()];
                    if (i11 == 1) {
                        kVar.b(kVarR);
                        item.getSize(kVar2, true);
                        a(kVar3, kVar, Math.max(kVar2.f180480a, kVar2.f180481b) / f11);
                    } else if (i11 == 2) {
                        item.getSize(kVar2, true);
                        c0Var.p(kVar, kVar2.f180480a, kVar2.f180481b).n(itemLayout.getRotationY());
                        if (c0Var.l(kVar3)) {
                            kVar.V(kVar4);
                        }
                    }
                    arrayList2.add(Float.valueOf(itemLayout.getRotationY()));
                    arrayList.add(new com.planner5d.library.math.m(kVar.f180480a, kVar.f180481b, itemLayout.getPositionZ()));
                    i10++;
                    children = itemArr;
                    f10 = f11;
                }
            }
            this.f254795b = (com.planner5d.library.math.m[]) arrayList.toArray(new com.planner5d.library.math.m[0]);
            this.f254796c = CollectionsKt.toFloatArray(arrayList2);
        }

        private final void a(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, float f10) {
            kVar2.f180480a = kotlin.ranges.r.H(kVar2.f180480a, f10, Math.max(f10, kVar.f180480a - f10));
            kVar2.f180481b = kotlin.ranges.r.H(kVar2.f180481b, f10, Math.max(f10, kVar.f180481b - f10));
        }

        private final com.planner5d.library.math.k b(com.planner5d.library.math.k kVar, ItemFloor itemFloor) {
            PointF center;
            com.planner5d.library.math.k kVar2 = new com.planner5d.library.math.k();
            Item[] children = itemFloor.getChildren();
            if (children != null && (center = ItemProjectPosition.getCenter(children, null, null)) != null) {
                float f10 = 2;
                kVar2.U(center.x, center.y).b0(kVar.f180480a / f10, kVar.f180481b / f10);
            }
            return kVar2;
        }

        @NotNull
        public final com.planner5d.library.math.m[] c() {
            return this.f254795b;
        }

        @NotNull
        public final float[] d() {
            return this.f254796c;
        }

        @NotNull
        public final List<String> e() {
            return this.f254794a;
        }
    }

    public enum b {
        None,
        Center,
        OutsidersToCenter;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f254802e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f254802e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@NotNull ItemFloor item, @NotNull b move) {
        this(new a(item, move));
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(move, "move");
    }

    private u(a aVar) {
        super(aVar.e(), aVar.c(), aVar.d());
    }
}
