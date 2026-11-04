package sb;

import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import com.planner5d.library.walls.WallsInfoWall;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class f extends sb.a implements qb.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f371593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f371594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final WallsInfoWall f371595h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f371596a;

        static {
            int[] iArr = new int[qb.g.b.values().length];
            iArr[qb.g.b.InLine.ordinal()] = 1;
            iArr[qb.g.b.OutLine.ordinal()] = 2;
            f371596a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size, boolean z10, float f10, @NotNull WallsInfoWall info) {
        super(puid, position, rotation, scale, size);
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f371593f = z10;
        this.f371594g = f10;
        this.f371595h = info;
    }

    @Override // qb.g
    @NotNull
    public k c(@Nullable qb.g.b bVar) {
        int i10 = bVar == null ? -1 : a.f371596a[bVar.ordinal()];
        if (i10 == -1) {
            return this.f371595h.getMiddle().e();
        }
        if (i10 == 1) {
            return this.f371595h.getBottom().c();
        }
        if (i10 == 2) {
            return this.f371595h.getTop().e();
        }
        throw new k0();
    }

    @Override // qb.g
    @NotNull
    public k e(@Nullable qb.g.b bVar) {
        int i10 = bVar == null ? -1 : a.f371596a[bVar.ordinal()];
        if (i10 == -1) {
            return this.f371595h.getMiddle().c();
        }
        if (i10 == 1) {
            return this.f371595h.getBottom().e();
        }
        if (i10 == 2) {
            return this.f371595h.getTop().c();
        }
        throw new k0();
    }

    @Override // qb.g
    public float f() {
        return this.f371594g;
    }

    @Override // qb.g
    public boolean isHidden() {
        return this.f371593f;
    }
}
