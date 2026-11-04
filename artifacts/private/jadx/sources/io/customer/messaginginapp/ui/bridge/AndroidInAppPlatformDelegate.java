package io.customer.messaginginapp.ui.bridge;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import androidx.annotation.k1;
import androidx.core.content.d;
import com.google.gson.f;
import io.customer.messaginginapp.ui.extensions.InAppMessageViewExtensionsKt;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@rg.a
@SourceDebugExtension({"SMAP\nInAppPlatformDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppPlatformDelegate.kt\nio/customer/messaginginapp/ui/bridge/AndroidInAppPlatformDelegate\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n29#2:138\n1#3:139\n*S KotlinDebug\n*F\n+ 1 InAppPlatformDelegate.kt\nio/customer/messaginginapp/ui/bridge/AndroidInAppPlatformDelegate\n*L\n96#1:138\n*E\n"})
public class AndroidInAppPlatformDelegate implements InAppPlatformDelegate {

    @NotNull
    private final View view;

    public AndroidInAppPlatformDelegate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    private final Context getContext() {
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    protected static /* synthetic */ void getDefaultAnimDuration$annotations() {
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    @k1
    public void animateViewSize(@Nullable Double d10, @Nullable Double d11, @Nullable Long l10, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1) {
        InAppMessageViewExtensionsKt.animateViewSize(this.view, d10 != null ? Integer.valueOf(dpToPx(d10.doubleValue())) : null, d11 != null ? Integer.valueOf(dpToPx(d11.doubleValue())) : null, l10 != null ? l10.longValue() : getDefaultAnimDuration(), function0, function1);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    public int dpToPx(double d10) {
        return kotlin.math.b.K0(d10 * ((double) getContext().getResources().getDisplayMetrics().density));
    }

    protected final long getDefaultAnimDuration() {
        return this.view.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    @NotNull
    protected final View getView() {
        return this.view;
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    public void openUrl(@NotNull String url, boolean z10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        if (z10) {
            intent.setFlags(872415232);
        }
        d.A(getContext(), intent, null);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    @NotNull
    public URI parseJavaURI(@NotNull String uriString) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        return new URI(uriString);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    @NotNull
    public Map<String, Object> parsePropertiesFromJson(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        byte[] bArrDecode = Base64.decode(json, 0);
        Intrinsics.checkNotNull(bArrDecode);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        Map<String, Object> map = (Map) new f().r(new String(bArrDecode, UTF_8), new HashMap().getClass());
        Intrinsics.checkNotNull(map);
        return map;
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    @NotNull
    public UrlQuerySanitizerWrapper sanitizeUrlQuery(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new AndroidUrlQuerySanitizer(url);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    public boolean shouldDestroyViewOnDetach() {
        Context context = this.view.getContext();
        int i10 = 3 ^ 0;
        Activity activityFindActivity$default = context != null ? InAppMessageViewExtensionsKt.findActivity$default(context, 0, 1, null) : null;
        return activityFindActivity$default == null || activityFindActivity$default.isFinishing() || !activityFindActivity$default.isChangingConfigurations();
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppPlatformDelegate
    public void startActivity(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        getContext().startActivity(intent);
    }
}
