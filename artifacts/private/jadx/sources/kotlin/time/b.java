package kotlin.time;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {j.class})
@e1(version = "1.9")
public interface b extends TimeMark, Comparable<b> {

    public static final class a {
        public static int a(@NotNull b bVar, @NotNull b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return c.s(bVar.Q(other), c.f313406b.W());
        }

        public static boolean b(@NotNull b bVar) {
            return TimeMark.a.a(bVar);
        }

        public static boolean c(@NotNull b bVar) {
            return TimeMark.a.b(bVar);
        }

        @NotNull
        public static b d(@NotNull b bVar, long j10) {
            return bVar.C(c.R0(j10));
        }
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    b C(long j10);

    @Override // kotlin.time.TimeMark
    @NotNull
    b G(long j10);

    int M1(@NotNull b bVar);

    long Q(@NotNull b bVar);

    boolean equals(@Nullable Object obj);

    int hashCode();
}
