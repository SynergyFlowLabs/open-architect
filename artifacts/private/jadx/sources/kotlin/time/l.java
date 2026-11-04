package kotlin.time;

import kotlin.Unit;
import kotlin.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,121:1\n50#1,7:122\n113#1,7:129\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n21#1:122,7\n83#1:129,7\n*E\n"})
public final class l {
    @m2(markerClass = {j.class})
    @e1(version = "1.9")
    public static final long a(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long jB = p.b.f313434b.b();
        block.invoke();
        return p.b.a.f(jB);
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.9")
    public static final long b(@NotNull p.b bVar, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        long jB = bVar.b();
        block.invoke();
        return p.b.a.f(jB);
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.9")
    public static final long c(@NotNull p pVar, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TimeMark timeMarkA = pVar.a();
        block.invoke();
        return timeMarkA.k();
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.9")
    @NotNull
    public static final <T> q<T> d(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new q<>(block.invoke(), p.b.a.f(p.b.f313434b.b()), null);
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.9")
    @NotNull
    public static final <T> q<T> e(@NotNull p.b bVar, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new q<>(block.invoke(), p.b.a.f(bVar.b()), null);
    }

    @m2(markerClass = {j.class})
    @e1(version = "1.9")
    @NotNull
    public static final <T> q<T> f(@NotNull p pVar, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new q<>(block.invoke(), pVar.a().k(), null);
    }
}
