package yg;

import android.content.Context;
import androidx.core.app.w;
import io.customer.messagingpush.data.model.CustomerIOParsedPushPayload;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface a {

    /* JADX INFO: renamed from: yg.a$a, reason: collision with other inner class name */
    public static final class C2536a {
        @Nullable
        public static Unit a(@NotNull a aVar, @NotNull CustomerIOParsedPushPayload payload, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        public static void b(@NotNull a aVar, @NotNull CustomerIOParsedPushPayload payload, @NotNull w.n builder) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(builder, "builder");
        }
    }

    void a(@NotNull CustomerIOParsedPushPayload customerIOParsedPushPayload, @NotNull w.n nVar);

    @Nullable
    Unit b(@NotNull CustomerIOParsedPushPayload customerIOParsedPushPayload, @NotNull Context context);
}
