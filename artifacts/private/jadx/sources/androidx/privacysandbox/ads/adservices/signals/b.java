package androidx.privacysandbox.ads.adservices.signals;

import android.adservices.signals.ProtectedSignalsManager;
import android.content.Context;
import androidx.annotation.a1;
import androidx.privacysandbox.ads.adservices.common.q;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f73676a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f73677b = "ProtectedSignalsManager";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @q.c
        @n
        @Nullable
        @e.a({"NewApi"})
        public final b a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (androidx.privacysandbox.ads.adservices.internal.a.f73536a.a() < 12) {
                return null;
            }
            ProtectedSignalsManager protectedSignalsManager = ProtectedSignalsManager.get(context);
            Intrinsics.checkNotNullExpressionValue(protectedSignalsManager, "get(context)");
            return new g(protectedSignalsManager);
        }

        private a() {
        }
    }

    @q.c
    @n
    @Nullable
    @e.a({"NewApi"})
    public static final b a(@NotNull Context context) {
        return f73676a.a(context);
    }

    @a1("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @q.c
    @Nullable
    public abstract Object b(@NotNull h hVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
