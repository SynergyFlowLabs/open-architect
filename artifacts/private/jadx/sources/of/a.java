package of;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements b {

    @NotNull
    public static final C2348a Companion = new C2348a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f333629a = "GrowthBook";

    /* JADX INFO: renamed from: of.a$a, reason: collision with other inner class name */
    public static final class C2348a {
        public /* synthetic */ C2348a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2348a() {
        }
    }

    private final void c(String str) {
        System.out.println((Object) ("GrowthBook " + str));
    }

    @Override // of.b
    public void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        c("log: " + message);
    }

    @Override // of.b
    public void b(@NotNull String warnMessage) {
        Intrinsics.checkNotNullParameter(warnMessage, "warnMessage");
        c("warning: " + warnMessage);
    }
}
