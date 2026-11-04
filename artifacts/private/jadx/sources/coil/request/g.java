package coil.request;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nGifs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gifs.kt\ncoil/request/Gifs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
@oj.i(name = "Gifs")
public final class g {
    @i4.a
    @NotNull
    public static final i.a a(@NotNull i.a aVar, @NotNull q4.a aVar2) {
        return i.a.c0(aVar, coil.decode.r.f87203f, aVar2, null, 4, null);
    }

    @i4.a
    @Nullable
    public static final q4.a b(@NotNull o oVar) {
        return (q4.a) oVar.m(coil.decode.r.f87203f);
    }

    @Nullable
    public static final Function0<Unit> c(@NotNull o oVar) {
        return (Function0) oVar.m(coil.decode.r.f87205h);
    }

    @Nullable
    public static final Function0<Unit> d(@NotNull o oVar) {
        return (Function0) oVar.m(coil.decode.r.f87204g);
    }

    @NotNull
    public static final i.a e(@NotNull i.a aVar, @Nullable Function0<Unit> function0) {
        return i.a.c0(aVar, coil.decode.r.f87205h, function0, null, 4, null);
    }

    @NotNull
    public static final i.a f(@NotNull i.a aVar, @Nullable Function0<Unit> function0) {
        return i.a.c0(aVar, coil.decode.r.f87204g, function0, null, 4, null);
    }

    @NotNull
    public static final i.a g(@NotNull i.a aVar, int i10) {
        if (i10 >= -1) {
            boolean z10 = false & false;
            return i.a.c0(aVar, coil.decode.r.f87202e, Integer.valueOf(i10), null, 4, null);
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + i10).toString());
    }

    @Nullable
    public static final Integer h(@NotNull o oVar) {
        return (Integer) oVar.m(coil.decode.r.f87202e);
    }
}
