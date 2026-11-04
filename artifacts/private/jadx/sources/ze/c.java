package ze;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.engine.rendering.util.f;
import com.planner5d.library.engine.rendering.util.i;
import com.planner5d.library.model.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f413501i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final y f413502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f413503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f413504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f413505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final i f413506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f f413507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f413508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f413509h;

    public c(@Nullable y yVar, int i10, float f10, float f11, @NotNull i repeat, @NotNull f alignment, float f12, float f13) {
        Intrinsics.checkNotNullParameter(repeat, "repeat");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f413502a = yVar;
        this.f413503b = i10;
        this.f413504c = f10;
        this.f413505d = f11;
        this.f413506e = repeat;
        this.f413507f = alignment;
        this.f413508g = f12;
        this.f413509h = f13;
    }

    @NotNull
    public final f a() {
        return this.f413507f;
    }

    public final int b() {
        return this.f413503b;
    }

    public final float c() {
        return this.f413508g;
    }

    @NotNull
    public final i d() {
        return this.f413506e;
    }

    public final float e() {
        return this.f413505d;
    }

    public final float f() {
        return this.f413504c;
    }

    @Nullable
    public final y g() {
        return this.f413502a;
    }

    public final float h() {
        return this.f413509h;
    }
}
