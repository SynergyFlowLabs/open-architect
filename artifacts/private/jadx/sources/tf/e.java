package tf;

import android.content.Context;
import android.content.SharedPreferences;
import com.segment.analytics.kotlin.core.f;
import com.segment.analytics.kotlin.core.s;
import com.segment.analytics.kotlin.core.u;
import com.segment.analytics.kotlin.core.utilities.j;
import java.io.File;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f381033a = new e();

    private e() {
    }

    @Override // com.segment.analytics.kotlin.core.u
    @l(message = "Deprecated in favor of create which takes vararg params", replaceWith = @b1(expression = "createStorage(analytics, store, writeKey, ioDispatcher, application)", imports = {}))
    @NotNull
    public s a(@NotNull com.segment.analytics.kotlin.core.a aVar, @NotNull sovran.kotlin.e eVar, @NotNull String str, @NotNull n0 n0Var, @NotNull Object obj) {
        return u.a.a(this, aVar, eVar, str, n0Var, obj);
    }

    @Override // com.segment.analytics.kotlin.core.u
    @NotNull
    public s b(@NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.length >= 2) {
            Object obj = params[0];
            if ((obj instanceof com.segment.analytics.kotlin.core.a) && (params[1] instanceof Context)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.Analytics");
                com.segment.analytics.kotlin.core.a aVar = (com.segment.analytics.kotlin.core.a) obj;
                Object obj2 = params[1];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.content.Context");
                Context context = (Context) obj2;
                f fVarU = aVar.u();
                File eventDirectory = context.getDir("segment-disk-queue", 0);
                String str = "segment.events.file.index." + fVarU.H();
                SharedPreferences sharedPreferences = context.getSharedPreferences("analytics-android-" + fVarU.H(), 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…}\", Context.MODE_PRIVATE)");
                uf.a aVar2 = new uf.a(sharedPreferences);
                Intrinsics.checkNotNullExpressionValue(eventDirectory, "eventDirectory");
                return new d(aVar2, new j(eventDirectory), aVar.a(), fVarU.H(), str, aVar.e());
            }
        }
        throw new IllegalArgumentException("Invalid parameters for AndroidStorageProvider. \nAndroidStorageProvider requires at least 2 parameters.\n The first argument has to be an instance of Analytics,\n an the second argument has to be an instance of Context");
    }
}
