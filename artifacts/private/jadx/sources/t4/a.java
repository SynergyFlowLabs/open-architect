package t4;

import com.badlogic.gdx.math.c0;
import com.badlogic.gdx.math.d0;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMathBridging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathBridging.kt\ncom/badlogic/gdx/bridging/MathBridgingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,8:1\n1#2:9\n*E\n"})
public final class a {
    @NotNull
    public static final d0 a(float f10, float f11, float f12) {
        return new d0(f10, f11, f12);
    }

    @Nullable
    public static final c0 b(@Nullable k kVar) {
        if (kVar != null) {
            return new c0(kVar.f180480a, kVar.f180481b);
        }
        return null;
    }

    @Nullable
    public static final d0 c(@Nullable m mVar) {
        if (mVar != null) {
            return new d0(mVar.f180482a, mVar.f180483b, mVar.f180484c);
        }
        return null;
    }
}
