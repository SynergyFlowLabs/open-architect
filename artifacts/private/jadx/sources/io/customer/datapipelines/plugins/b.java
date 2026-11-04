package io.customer.datapipelines.plugins;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAutomaticActivityScreenTrackingPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomaticActivityScreenTrackingPlugin.kt\nio/customer/datapipelines/plugins/AutomaticActivityScreenTrackingPlugin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class b implements com.segment.analytics.kotlin.core.platform.e, com.segment.analytics.kotlin.android.plugins.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f288320b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f288319a = com.segment.analytics.kotlin.core.platform.e.b.Utility;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ih.e f288321c = eh.d.f274883c.w();

    @Override // com.segment.analytics.kotlin.core.platform.e
    @Nullable
    public BaseEvent a(@NotNull BaseEvent baseEvent) {
        return com.segment.analytics.kotlin.core.platform.e.a.a(this, baseEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        com.segment.analytics.kotlin.core.platform.e.a.b(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f288319a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f288320b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f288320b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @Override // com.segment.analytics.kotlin.android.plugins.c
    public void onActivityCreated(@Nullable Activity activity, @Nullable Bundle bundle) {
        com.segment.analytics.kotlin.android.plugins.c.a.a(this, activity, bundle);
    }

    @Override // com.segment.analytics.kotlin.android.plugins.c
    public void onActivityDestroyed(@Nullable Activity activity) {
        com.segment.analytics.kotlin.android.plugins.c.a.b(this, activity);
    }

    @Override // com.segment.analytics.kotlin.android.plugins.c
    public void onActivityPaused(@Nullable Activity activity) {
        com.segment.analytics.kotlin.android.plugins.c.a.c(this, activity);
    }

    @Override // com.segment.analytics.kotlin.android.plugins.c
    public void onActivityResumed(@Nullable Activity activity) {
        com.segment.analytics.kotlin.android.plugins.c.a.d(this, activity);
    }

    @Override // com.segment.analytics.kotlin.android.plugins.c
    public void onActivitySaveInstanceState(@Nullable Activity activity, @Nullable Bundle bundle) {
        com.segment.analytics.kotlin.android.plugins.c.a.e(this, activity, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[Catch: Exception -> 0x0019, NameNotFoundException -> 0x001d, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x001d, Exception -> 0x0019, blocks: (B:6:0x000b, B:8:0x000f, B:27:0x005e, B:34:0x008a, B:36:0x0091, B:33:0x007d, B:15:0x0022, B:19:0x0032, B:22:0x003a, B:24:0x0046, B:30:0x0066), top: B:50:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.segment.analytics.kotlin.android.plugins.c
    public void onActivityStarted(@Nullable Activity activity) {
        String str;
        String strValueOf;
        Object objM785constructorimpl;
        PackageManager packageManager = activity != 0 ? activity.getPackageManager() : null;
        try {
            if (!(activity instanceof lh.a)) {
                ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity.getComponentName(), 128) : null;
                CharSequence charSequenceLoadLabel = activityInfo != null ? activityInfo.loadLabel(packageManager) : null;
                if (activity != 0) {
                    strValueOf = String.valueOf(charSequenceLoadLabel);
                    if (strValueOf.length() == 0) {
                        String simpleName = activity.getClass().getSimpleName();
                        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                        strValueOf = m.a(simpleName);
                    }
                } else {
                    str = null;
                }
                if (str == null && !StringsKt.w3(str)) {
                    try {
                        Result.a aVar = Result.Companion;
                        io.customer.sdk.l.z(io.customer.sdk.g.f288542m.d(), str, null, 2, null);
                        objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.d(objM785constructorimpl) != null) {
                        com.segment.analytics.kotlin.core.a.m0(j(), str, null, null, null, 14, null);
                    }
                }
                return;
            }
            strValueOf = ((lh.a) activity).getScreenName();
            str = strValueOf;
            if (str == null) {
                return;
            }
            Result.a aVar3 = Result.Companion;
            io.customer.sdk.l.z(io.customer.sdk.g.f288542m.d(), str, null, 2, null);
            objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
            if (Result.d(objM785constructorimpl) != null) {
                com.segment.analytics.kotlin.core.a.m0(j(), str, null, null, null, 14, null);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            ih.e eVar = this.f288321c;
            String message = e10.getMessage();
            if (message == null) {
                message = "Unable to activity screen NameNotFoundException, " + activity;
            }
            ih.e.a.b(eVar, message, null, null, 6, null);
        } catch (Exception e11) {
            ih.e eVar2 = this.f288321c;
            String message2 = e11.getMessage();
            if (message2 == null) {
                message2 = "Unable to activity screen, " + activity;
            }
            ih.e.a.b(eVar2, message2, null, null, 6, null);
        }
    }

    @Override // com.segment.analytics.kotlin.android.plugins.c
    public void onActivityStopped(@Nullable Activity activity) {
        com.segment.analytics.kotlin.android.plugins.c.a.g(this, activity);
    }
}
