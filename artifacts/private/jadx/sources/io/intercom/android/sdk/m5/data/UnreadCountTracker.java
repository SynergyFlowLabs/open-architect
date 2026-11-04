package io.intercom.android.sdk.m5.data;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class UnreadCountTracker {
    public static final int $stable = 8;

    @NotNull
    private final IntercomDataLayer dataLayer;

    @NotNull
    private final ConcurrentHashMap<UnreadConversationCountListener, p2> listeners;

    public UnreadCountTracker(@NotNull IntercomDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        this.dataLayer = dataLayer;
        this.listeners = new ConcurrentHashMap<>();
    }

    public static /* synthetic */ void addListener$default(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            n0Var = l1.a();
        }
        unreadCountTracker.addListener(unreadConversationCountListener, n0Var);
    }

    public final void addListener(@NotNull UnreadConversationCountListener listener, @NotNull n0 dispatcher) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.listeners.put(listener, k.f(t0.a(dispatcher), null, null, new UnreadCountTracker$addListener$job$1(this, listener, null), 3, null));
    }

    @NotNull
    public final IntercomDataLayer getDataLayer() {
        return this.dataLayer;
    }

    @NotNull
    public final ConcurrentHashMap<UnreadConversationCountListener, p2> getListeners() {
        return this.listeners;
    }

    public final void removeListener(@NotNull UnreadConversationCountListener listener) {
        p2 p2VarRemove;
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (!this.listeners.containsKey(listener) || (p2VarRemove = this.listeners.remove(listener)) == null) {
            return;
        }
        p2.a.b(p2VarRemove, null, 1, null);
    }
}
