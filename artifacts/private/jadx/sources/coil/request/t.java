package coil.request;

import androidx.annotation.x;
import coil.decode.d0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nVideos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Videos.kt\ncoil/request/Videos\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
@oj.i(name = "Videos")
public final class t {
    @NotNull
    public static final i.a a(@NotNull i.a aVar, long j10) {
        if (j10 >= 0) {
            return i.a.c0(aVar, d0.f87148d, Long.valueOf(j10), null, 4, null);
        }
        throw new IllegalArgumentException("frameMicros must be >= 0.");
    }

    @Nullable
    public static final Long b(@NotNull o oVar) {
        return (Long) oVar.m(d0.f87148d);
    }

    @NotNull
    public static final i.a c(@NotNull i.a aVar, long j10) {
        return a(aVar, ((long) 1000) * j10);
    }

    @NotNull
    public static final i.a d(@NotNull i.a aVar, int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            return i.a.c0(aVar, d0.f87150f, Integer.valueOf(i10), null, 4, null);
        }
        throw new IllegalArgumentException(("Invalid video frame option: " + i10 + '.').toString());
    }

    @Nullable
    public static final Integer e(@NotNull o oVar) {
        return (Integer) oVar.m(d0.f87150f);
    }

    @NotNull
    public static final i.a f(@NotNull i.a aVar, @x(from = 0.0d, to = 1.0d) double d10) {
        if (0.0d > d10 || d10 > 1.0d) {
            throw new IllegalArgumentException("framePercent must be in the range [0.0, 1.0].");
        }
        return i.a.c0(aVar, d0.f87149e, Double.valueOf(d10), null, 4, null);
    }

    @Nullable
    public static final Double g(@NotNull o oVar) {
        return (Double) oVar.m(d0.f87149e);
    }
}
