package tf;

import android.content.Context;
import android.content.Intent;
import com.segment.analytics.kotlin.core.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAndroidAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAnalytics.kt\ncom/segment/analytics/kotlin/android/AndroidAnalyticsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class a {
    @NotNull
    public static final com.segment.analytics.kotlin.core.a a(@NotNull String writeKey, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(context, "context");
        if (StringsKt.w3(writeKey)) {
            throw new IllegalArgumentException("writeKey cannot be blank ");
        }
        com.segment.analytics.kotlin.core.a aVar = new com.segment.analytics.kotlin.core.a(new f(writeKey, context, e.f381033a, false, false, false, false, 0, 0, null, null, false, null, null, null, null, 65528, null));
        d(aVar);
        return aVar;
    }

    @NotNull
    public static final com.segment.analytics.kotlin.core.a b(@NotNull String writeKey, @NotNull Context context, @NotNull Function1<? super f, Unit> configs) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configs, "configs");
        com.segment.analytics.kotlin.core.a.Companion.d(new b());
        if (StringsKt.w3(writeKey)) {
            throw new IllegalArgumentException("writeKey cannot be blank ");
        }
        f fVar = new f(writeKey, context, e.f381033a, false, false, false, false, 0, 0, null, null, false, null, null, null, null, 65528, null);
        configs.invoke(fVar);
        com.segment.analytics.kotlin.core.a aVar = new com.segment.analytics.kotlin.core.a(fVar);
        d(aVar);
        return aVar;
    }

    public static final void c(@NotNull com.segment.analytics.kotlin.core.a aVar, @Nullable String str, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        new uf.b(aVar).c(str, intent);
    }

    private static final void d(com.segment.analytics.kotlin.core.a aVar) {
        aVar.j(new com.segment.analytics.kotlin.android.plugins.a());
        aVar.j(new com.segment.analytics.kotlin.android.plugins.d());
    }
}
