package kotlin.internal.jdk8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class a extends kotlin.internal.jdk7.a {

    /* JADX INFO: renamed from: kotlin.internal.jdk8.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    private static final class C2255a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2255a f312508a = new C2255a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @f
        @Nullable
        public static final Integer f312509b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f312509b = num2;
        }

        private C2255a() {
        }
    }

    private final boolean e(int i10) {
        Integer num = C2255a.f312509b;
        return num == null || num.intValue() >= i10;
    }

    @Override // kotlin.internal.l
    @NotNull
    public kotlin.random.f b() {
        return e(34) ? new uj.a() : super.b();
    }

    @Override // kotlin.internal.l
    @Nullable
    public MatchGroup c(@NotNull MatchResult matchResult, @NotNull String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        IntRange intRange = new IntRange(matcher.start(name), matcher.end(name) - 1);
        if (intRange.u().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(name);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRange);
    }
}
