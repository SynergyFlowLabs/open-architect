package io.intercom.android.sdk.m5.navigation.transitions;

import android.os.Bundle;
import androidx.navigation.d3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class TransitionStyleKt {

    @NotNull
    private static final d3<TransitionArgs> TransitionArgNavType = new d3<TransitionArgs>() { // from class: io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt$TransitionArgNavType$1
        private final TransitionArgs toTransitionArgs(String str) {
            Object objR = new com.google.gson.f().r(str, TransitionArgs.class);
            Intrinsics.checkNotNullExpressionValue(objR, "fromJson(...)");
            return (TransitionArgs) objR;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.d3
        public TransitionArgs get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            TransitionArgs transitionArgs = (TransitionArgs) androidx.core.os.d.b(bundle, key, TransitionArgs.class);
            return transitionArgs == null ? new TransitionArgs(null, null, null, null, 15, null) : transitionArgs;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.d3
        public TransitionArgs parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return toTransitionArgs(value);
        }

        @Override // androidx.navigation.d3
        public void put(Bundle bundle, String key, TransitionArgs value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putParcelable(key, value);
        }
    };

    @NotNull
    public static final d3<TransitionArgs> getTransitionArgNavType() {
        return TransitionArgNavType;
    }
}
