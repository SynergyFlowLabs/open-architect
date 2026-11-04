package com.planner5d.library.widget.editor.itemactionsbar;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.widget.editor.editor2d.Editor2D;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@kotlin.l(message = "Refactor in future")
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nItemActionsPositioningDataLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemActionsPositioningDataLoader.kt\ncom/planner5d/library/widget/editor/itemactionsbar/ItemActionsPositioningDataLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f256987b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f256988c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final com.planner5d.library.math.k f256989d = new com.planner5d.library.math.k(0.0f, -1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final com.planner5d.library.math.k f256990e = new com.planner5d.library.math.k(0.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.widget.editor.a f256991a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f256992d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final PointF f256993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final RectF f256994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final RectF[] f256995c;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b() {
            this(null, null, null, 7, null);
            int i10 = 7 >> 0;
        }

        @NotNull
        public final RectF a() {
            return this.f256994b;
        }

        @NotNull
        public final RectF[] b() {
            return this.f256995c;
        }

        @NotNull
        public final PointF c() {
            return this.f256993a;
        }

        public b(@NotNull PointF itemTopCenterPosition, @NotNull RectF gizmoBoundingBox, @NotNull RectF[] gizmoHandlesBoundingBoxes) {
            Intrinsics.checkNotNullParameter(itemTopCenterPosition, "itemTopCenterPosition");
            Intrinsics.checkNotNullParameter(gizmoBoundingBox, "gizmoBoundingBox");
            Intrinsics.checkNotNullParameter(gizmoHandlesBoundingBoxes, "gizmoHandlesBoundingBoxes");
            this.f256993a = itemTopCenterPosition;
            this.f256994b = gizmoBoundingBox;
            this.f256995c = gizmoHandlesBoundingBoxes;
        }

        public /* synthetic */ b(PointF pointF, RectF rectF, RectF[] rectFArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new PointF() : pointF, (i10 & 2) != 0 ? new RectF() : rectF, (i10 & 4) != 0 ? new RectF[0] : rectFArr);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.widget.editor.itemactionsbar.ItemActionsPositioningDataLoader$getItemPositioningData$2", f = "ItemActionsPositioningDataLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f256996a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Item f256998c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Item item, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f256998c = item;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new c(this.f256998c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f256996a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PointF pointF = new PointF();
            k.this.i(this.f256998c, pointF);
            if (!(k.this.f256991a instanceof Editor2D)) {
                return new b(pointF, null, null, 6, null);
            }
            if (((Editor2D) k.this.f256991a).getScene() == null) {
                return null;
            }
            k kVar = k.this;
            Item item = this.f256998c;
            return new b(pointF, kVar.f((Editor2D) kVar.f256991a, item), kVar.g((Editor2D) kVar.f256991a, item));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super b> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public k(@NotNull com.planner5d.library.widget.editor.a editor) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        this.f256991a = editor;
    }

    private final com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c e(Editor2D editor2D, Item item) {
        com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c cVar = new com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c();
        cVar.v(editor2D.getPainterData(), item);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF f(Editor2D editor2D, Item item) {
        RectF rectFD = e(editor2D, item).d(new RectF());
        Intrinsics.checkNotNull(rectFD);
        k(rectFD, editor2D);
        Intrinsics.checkNotNullExpressionValue(rectFD, "also(...)");
        return rectFD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF[] g(Editor2D editor2D, Item item) {
        RectF[] rectFArrL = e(editor2D, item).l();
        Intrinsics.checkNotNullExpressionValue(rectFArrL, "getBoundsOfHandles(...)");
        for (RectF rectF : rectFArrL) {
            Intrinsics.checkNotNull(rectF);
            k(rectF, editor2D);
        }
        return rectFArrL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Item item, PointF pointF) {
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        com.planner5d.library.math.m mVar2 = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        ItemLayout layout = item.getLayout(new ItemLayout());
        Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k();
        if (item instanceof ItemRoom) {
            ItemRoom itemRoom = (ItemRoom) item;
            com.planner5d.library.math.k topCenterPosition = itemRoom.getTopCenterPosition(kVar);
            Intrinsics.checkNotNullExpressionValue(topCenterPosition, "getTopCenterPosition(...)");
            j(mVar, topCenterPosition);
            com.planner5d.library.math.k bottomCenterPosition = itemRoom.getBottomCenterPosition(kVar);
            Intrinsics.checkNotNullExpressionValue(bottomCenterPosition, "getBottomCenterPosition(...)");
            j(mVar2, bottomCenterPosition);
        } else if (item instanceof ItemWall) {
            com.planner5d.library.math.k centerPosition = ((ItemWall) item).getCenterPosition(new com.planner5d.library.math.k(), new com.planner5d.library.math.k());
            Intrinsics.checkNotNullExpressionValue(centerPosition, "getCenterPosition(...)");
            j(mVar, centerPosition);
            mVar2.A0(mVar);
        } else if (item instanceof ItemPoint) {
            com.planner5d.library.math.k point = ((ItemPoint) item).getPoint(kVar, true);
            mVar.f180482a = point.f180480a;
            mVar.f180483b = point.f180481b;
            mVar2.A0(mVar);
        } else {
            com.planner5d.library.math.k size = item.getSize(kVar, true);
            layout.getEdgeCenterPosition(mVar, size, f256989d);
            layout.getEdgeCenterPosition(mVar2, size, f256990e);
        }
        pointF.set(this.f256991a.x(mVar));
    }

    private final com.planner5d.library.math.m j(com.planner5d.library.math.m mVar, com.planner5d.library.math.k kVar) {
        return mVar.y0(kVar.f180480a, kVar.f180481b, 0.0f);
    }

    private final void k(RectF rectF, Editor2D editor2D) {
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(rectF.left, rectF.top, 0.0f);
        PointF pointFX = editor2D.x(mVar);
        Intrinsics.checkNotNullExpressionValue(pointFX, "unproject(...)");
        mVar.y0(rectF.right, rectF.bottom, 0.0f);
        PointF pointFX2 = editor2D.x(mVar);
        Intrinsics.checkNotNullExpressionValue(pointFX2, "unproject(...)");
        rectF.set(pointFX.x, pointFX.y, pointFX2.x, pointFX2.y);
    }

    @Nullable
    public final Object h(@NotNull Item item, @NotNull kotlin.coroutines.d<? super b> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new c(item, null), dVar);
    }
}
