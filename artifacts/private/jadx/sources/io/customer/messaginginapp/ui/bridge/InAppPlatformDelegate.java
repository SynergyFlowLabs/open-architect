package io.customer.messaginginapp.ui.bridge;

import android.content.Intent;
import androidx.annotation.k1;
import java.net.URI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@rg.a
public interface InAppPlatformDelegate {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void animateViewSize$default(InAppPlatformDelegate inAppPlatformDelegate, Double d10, Double d11, Long l10, Function0 function0, Function0 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateViewSize");
            }
            if ((i10 & 1) != 0) {
                d10 = null;
            }
            if ((i10 & 2) != 0) {
                d11 = null;
            }
            if ((i10 & 4) != 0) {
                l10 = null;
            }
            if ((i10 & 8) != 0) {
                function0 = null;
            }
            if ((i10 & 16) != 0) {
                function1 = null;
            }
            inAppPlatformDelegate.animateViewSize(d10, d11, l10, function0, function1);
        }
    }

    @k1
    void animateViewSize(@Nullable Double d10, @Nullable Double d11, @Nullable Long l10, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1);

    int dpToPx(double d10);

    void openUrl(@NotNull String str, boolean z10);

    @NotNull
    URI parseJavaURI(@NotNull String str);

    @NotNull
    Map<String, Object> parsePropertiesFromJson(@NotNull String str);

    @NotNull
    UrlQuerySanitizerWrapper sanitizeUrlQuery(@NotNull String str);

    boolean shouldDestroyViewOnDetach();

    void startActivity(@NotNull Intent intent);
}
