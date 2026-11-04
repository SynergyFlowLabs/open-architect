package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class WallsInfoWall {

    @NotNull
    private final c bottom;

    @NotNull
    private final c[] end;

    @NotNull
    private final c middle;

    @NotNull
    private final c[] start;

    @NotNull
    private final c top;

    @NotNull
    private final Wall wall;

    public enum Side {
        Top,
        Bottom,
        Start,
        End;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Side.values().length];
                iArr[Side.Top.ordinal()] = 1;
                iArr[Side.Bottom.ordinal()] = 2;
                iArr[Side.Start.ordinal()] = 3;
                iArr[Side.End.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @NotNull
        public final Side opposite() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return Bottom;
            }
            if (i10 == 2) {
                return Top;
            }
            if (i10 == 3) {
                return End;
            }
            if (i10 == 4) {
                return Start;
            }
            throw new k0();
        }
    }

    public WallsInfoWall(@NotNull Wall wall, @NotNull c top, @NotNull c middle, @NotNull c bottom, @NotNull c[] start, @NotNull c[] end) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(middle, "middle");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.wall = wall;
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
        this.start = start;
        this.end = end;
    }

    @NotNull
    public final c getBottom() {
        return this.bottom;
    }

    @NotNull
    public final c[] getEnd() {
        return this.end;
    }

    @NotNull
    public final c getMiddle() {
        return this.middle;
    }

    @NotNull
    public final k[] getPath() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.start) {
            arrayList.add(new k(cVar.e()));
        }
        arrayList.add(new k(this.top.e()));
        for (int length = this.end.length - 1; -1 < length; length--) {
            arrayList.add(new k(this.end[length].c()));
        }
        arrayList.add(new k(this.bottom.c()));
        arrayList.add(new k(this.bottom.e()));
        Object[] array = arrayList.toArray(new k[0]);
        if (array != null) {
            return (k[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final float[] getPolygonPoints(boolean z10) {
        k[] path = getPath();
        float[] fArr = new float[(path.length - 1) * 2];
        k kVar = new k();
        if (z10) {
            this.wall.getOrigin(kVar);
        }
        int length = path.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 * 2;
                fArr[i11] = path[i10].b(kVar).f180480a;
                fArr[i11 + 1] = path[i10].f180481b;
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return fArr;
    }

    @NotNull
    public final c[] getStart() {
        return this.start;
    }

    @NotNull
    public final c[] getStartOrEnd(@NotNull Side side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return side == Side.Start ? this.start : this.end;
    }

    @NotNull
    public final c getTop() {
        return this.top;
    }

    @NotNull
    public final c getTopOrBottom(@NotNull Side side) {
        Intrinsics.checkNotNullParameter(side, "side");
        return side == Side.Top ? this.top : this.bottom;
    }

    @NotNull
    public final Wall getWall() {
        return this.wall;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WallsInfoWall(w=");
        sb2.append(this.wall);
        sb2.append(" top=");
        sb2.append(this.top);
        sb2.append(" middle=");
        sb2.append(this.middle);
        sb2.append(" bottom=");
        sb2.append(this.bottom);
        sb2.append(" start=");
        int i10 = 3 ^ 0;
        sb2.append(ArraysKt.joinToString$default(this.start, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        sb2.append(" end=");
        sb2.append(ArraysKt.joinToString$default(this.end, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WallsInfoWall(@NotNull WallsInfoWall info) {
        this(info.wall, info.top, info.middle, info.bottom);
        Intrinsics.checkNotNullParameter(info, "info");
    }

    public WallsInfoWall(@NotNull Wall wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        float minimumWidth = wall.getMinimumWidth();
        this.wall = wall;
        c cVar = new c(wall.getPoint(new k(), false, true), wall.getPoint(new k(), false, false));
        this.middle = cVar;
        k kVarO = new k(cVar.b()).O(1);
        k kVarR = new k(kVarO).R(wall.getWidth() - minimumWidth);
        c cVar2 = new c(new k(cVar.e()).b(kVarR), kVarR.b(cVar.c()));
        this.top = cVar2;
        c cVar3 = new c(new k(cVar.e()).b(kVarR.V(kVarO).R(-minimumWidth)), kVarR.b(cVar.c()));
        this.bottom = cVar3;
        c.a aVar = c.f180466e;
        this.start = aVar.e(cVar3.e(), cVar2.e());
        this.end = aVar.e(cVar3.c(), cVar2.c());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WallsInfoWall(@NotNull Wall wall, @NotNull c top, @NotNull c middle, @NotNull c bottom) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(middle, "middle");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        c.a aVar = c.f180466e;
        this(wall, top, middle, bottom, aVar.e(bottom.e(), top.e()), aVar.e(bottom.c(), top.c()));
    }
}
