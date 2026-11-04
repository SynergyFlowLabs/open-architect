package io.intercom.android.sdk.utilities;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.a;
import androidx.core.view.accessibility.j;
import androidx.core.view.u1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class AccessibilityUtils {
    public static final int $stable = 0;

    @NotNull
    public static final AccessibilityUtils INSTANCE = new AccessibilityUtils();

    private AccessibilityUtils() {
    }

    public final void addClickAbilityAnnouncement(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        u1.G1(view, new a() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.addClickAbilityAnnouncement.1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View host, j info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.b(j.a.f48547j);
                info.k1(true);
            }
        });
    }

    public final void addHeadingAnnouncement(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        u1.G1(view, new a() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.addHeadingAnnouncement.1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View host, j info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.z1(true);
            }
        });
    }

    public final void removeClickAbilityAnnouncement(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        u1.G1(view, new a() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.removeClickAbilityAnnouncement.1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View host, j info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.V0(j.a.f48547j);
                info.V0(j.a.f48548k);
                info.k1(false);
                info.I1(false);
            }
        });
    }
}
