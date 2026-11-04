package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomRootActivityArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomRootActivityArgs.kt\nio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class IntercomRootActivityArgsKt {

    @NotNull
    private static final String BUNDLE = "BUNDLE";

    @NotNull
    private static final String BUNDLE_ARGS = "BUNDLE_ARGS";

    @NotNull
    public static final IntercomRootActivityArgs getArgsForIntent(@NotNull Intent intent) {
        IntercomRootActivityArgs intercomRootActivityArgs;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra(BUNDLE);
        return (bundleExtra == null || (intercomRootActivityArgs = (IntercomRootActivityArgs) androidx.core.os.d.b(bundleExtra, BUNDLE_ARGS, IntercomRootActivityArgs.class)) == null) ? IntercomRootActivityArgs.NoContent.INSTANCE : intercomRootActivityArgs;
    }

    @NotNull
    public static final Intent getIntentForArgs(@NotNull Context context, @NotNull IntercomRootActivityArgs intercomRootActivityArgs, @NotNull Class<?> activityName, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intercomRootActivityArgs, "intercomRootActivityArgs");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intent intent = new Intent(context, activityName);
        Bundle bundle = new Bundle();
        bundle.putParcelable(BUNDLE_ARGS, intercomRootActivityArgs);
        intent.putExtra(BUNDLE, bundle);
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        return intent;
    }

    public static /* synthetic */ Intent getIntentForArgs$default(Context context, IntercomRootActivityArgs intercomRootActivityArgs, Class cls, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cls = IntercomRootActivity.class;
        }
        if ((i10 & 8) != 0) {
            num = 268435456;
        }
        return getIntentForArgs(context, intercomRootActivityArgs, cls, num);
    }
}
