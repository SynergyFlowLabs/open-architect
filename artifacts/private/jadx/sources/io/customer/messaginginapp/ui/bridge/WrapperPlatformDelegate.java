package io.customer.messaginginapp.ui.bridge;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@rg.a
@SourceDebugExtension({"SMAP\nWrapperPlatformDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrapperPlatformDelegate.kt\nio/customer/messaginginapp/ui/bridge/WrapperPlatformDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public abstract class WrapperPlatformDelegate extends AndroidInAppPlatformDelegate {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ON_SIZE_CHANGE = "onSizeChange";

    @NotNull
    public static final String ON_STATE_CHANGE = "onStateChange";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperPlatformDelegate(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // io.customer.messaginginapp.ui.bridge.AndroidInAppPlatformDelegate, io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    public void animateViewSize(@Nullable Double d10, @Nullable Double d11, @Nullable Long l10, @Nullable Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        if (function0 != null) {
            function0.invoke();
        }
        long jLongValue = l10 != null ? l10.longValue() : getDefaultAnimDuration();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (d10 != null) {
            if (d10.doubleValue() <= 0.0d) {
                d10 = null;
            }
            if (d10 != null) {
                linkedHashMap.put("width", Double.valueOf(d10.doubleValue()));
            }
        }
        if (d11 != null) {
            linkedHashMap.put("height", Double.valueOf(d11.doubleValue()));
        }
        linkedHashMap.put("duration", Double.valueOf(jLongValue));
        dispatchEvent(ON_SIZE_CHANGE, linkedHashMap);
        if (function1 != null) {
            getView().postDelayed(new Runnable() { // from class: io.customer.messaginginapp.ui.bridge.b
                @Override // java.lang.Runnable
                public final void run() {
                    function1.invoke();
                }
            }, jLongValue);
        }
    }

    protected abstract void dispatchEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map);

    public final void sendLoadingStateEvent(@NotNull WrapperStateEvent state) {
        Intrinsics.checkNotNullParameter(state, "state");
        dispatchEvent(ON_STATE_CHANGE, MapsKt.mapOf(TuplesKt.to("state", state.name())));
    }
}
