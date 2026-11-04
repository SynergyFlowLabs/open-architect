package kotlin.text;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface MatchResult {

    public static final class a {
        @NotNull
        public static b a(@NotNull MatchResult matchResult) {
            return new b(matchResult);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final MatchResult f313195a;

        public b(@NotNull MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.f313195a = match;
        }

        @kotlin.internal.f
        private final String a() {
            return k().c().get(1);
        }

        @kotlin.internal.f
        private final String b() {
            return k().c().get(10);
        }

        @kotlin.internal.f
        private final String c() {
            return k().c().get(2);
        }

        @kotlin.internal.f
        private final String d() {
            return k().c().get(3);
        }

        @kotlin.internal.f
        private final String e() {
            return k().c().get(4);
        }

        @kotlin.internal.f
        private final String f() {
            return k().c().get(5);
        }

        @kotlin.internal.f
        private final String g() {
            return k().c().get(6);
        }

        @kotlin.internal.f
        private final String h() {
            return k().c().get(7);
        }

        @kotlin.internal.f
        private final String i() {
            return k().c().get(8);
        }

        @kotlin.internal.f
        private final String j() {
            return k().c().get(9);
        }

        @NotNull
        public final MatchResult k() {
            return this.f313195a;
        }

        @NotNull
        public final List<String> l() {
            return this.f313195a.c().subList(1, this.f313195a.c().size());
        }
    }

    @NotNull
    b a();

    @NotNull
    j b();

    @NotNull
    List<String> c();

    @NotNull
    String getValue();

    @Nullable
    MatchResult next();

    @NotNull
    IntRange o6();
}
