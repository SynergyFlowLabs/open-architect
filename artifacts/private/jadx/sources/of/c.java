package of;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements b {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f333630a = "GrowthBook";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        int i10 = 3 << 0;
    }

    @Override // of.b
    public void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // of.b
    public void b(@NotNull String warnMessage) {
        Intrinsics.checkNotNullParameter(warnMessage, "warnMessage");
    }
}
