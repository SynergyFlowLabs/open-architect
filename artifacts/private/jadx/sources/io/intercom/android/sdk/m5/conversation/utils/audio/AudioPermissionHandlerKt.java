package io.intercom.android.sdk.m5.conversation.utils.audio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.compose.g;
import androidx.activity.compose.k;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.utilities.Phrase;
import io.sentry.protocol.z;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.i;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAudioPermissionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioPermissionHandler.kt\nio/intercom/android/sdk/m5/conversation/utils/audio/AudioPermissionHandlerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,149:1\n75#2:150\n75#2:151\n1282#3,6:152\n1282#3,6:158\n1282#3,6:164\n1282#3,6:170\n85#4:176\n117#4,2:177\n*S KotlinDebug\n*F\n+ 1 AudioPermissionHandler.kt\nio/intercom/android/sdk/m5/conversation/utils/audio/AudioPermissionHandlerKt\n*L\n42#1:150\n43#1:151\n44#1:152,6\n48#1:158,6\n57#1:164,6\n89#1:170,6\n44#1:176\n44#1:177,2\n*E\n"})
public final class AudioPermissionHandlerKt {
    @NotNull
    public static final PermissionResult checkAudioPermissionStatus(@NotNull Context context, @Nullable Activity activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!hasRecordAudioPermissionInManifest(context)) {
            return PermissionResult.NotRequired.INSTANCE;
        }
        int iA = androidx.core.content.d.a(context, "android.permission.RECORD_AUDIO");
        if (iA != -1) {
            return iA != 0 ? PermissionResult.Denied.INSTANCE : PermissionResult.Granted.INSTANCE;
        }
        return shouldShowRequestPermissionRationale(activity) ? PermissionResult.PermanentlyDenied.INSTANCE : PermissionResult.Denied.INSTANCE;
    }

    public static final boolean hasRecordAudioPermissionInManifest(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return ArraysKt.contains(strArr, "android.permission.RECORD_AUDIO");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    @NotNull
    public static final Function0<Unit> rememberAudioPermissionHandler(@NotNull final Function0<Unit> onPermissionGranted, @NotNull final Function0<Unit> onPermissionDenied, @Nullable c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(onPermissionGranted, "onPermissionGranted");
        Intrinsics.checkNotNullParameter(onPermissionDenied, "onPermissionDenied");
        c0Var.E(2051621013);
        final Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        final Activity activity = (Activity) c0Var.W(g.a());
        c0Var.E(826575842);
        Object objI0 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = d7.g(Boolean.FALSE, null, 2, null);
            c0Var.Y(objI0);
        }
        final n3 n3Var = (n3) objI0;
        c0Var.A();
        g.b.l lVar = new g.b.l();
        c0Var.E(826581387);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && c0Var.D(onPermissionGranted)) || (i10 & 6) == 4;
        int i11 = (i10 & com.planner5d.library.engine.input.f.b.B) ^ 48;
        boolean z12 = z11 | ((i11 > 32 && c0Var.D(onPermissionDenied)) || (i10 & 48) == 32);
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == aVar.a()) {
            objI1 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.utils.audio.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$4$lambda$3(onPermissionGranted, onPermissionDenied, ((Boolean) obj).booleanValue());
                }
            };
            c0Var.Y(objI1);
        }
        c0Var.A();
        final k kVarA = androidx.activity.compose.d.a(lVar, (Function1) objI1, c0Var, 8);
        c0Var.E(826589549);
        Object objI2 = c0Var.i0();
        if (objI2 == aVar.a()) {
            Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.utils.audio.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$6$lambda$5(context, activity, onPermissionGranted, kVarA, n3Var);
                }
            };
            c0Var.Y(function0);
            objI2 = function0;
        }
        Function0<Unit> function1 = (Function0) objI2;
        c0Var.A();
        if (rememberAudioPermissionHandler$lambda$1(n3Var)) {
            String string = Phrase.from(context, R.string.intercom_need_microphone_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
            String strD = i.d(R.string.intercom_settings, c0Var, 0);
            String strD2 = i.d(R.string.intercom_not_now, c0Var, 0);
            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_microphone);
            c0Var.E(826629471);
            if ((i11 <= 32 || !c0Var.D(onPermissionDenied)) && (i10 & 48) != 32) {
                z10 = false;
            }
            Object objI3 = c0Var.i0();
            if (z10 || objI3 == aVar.a()) {
                objI3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.utils.audio.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$8$lambda$7(onPermissionDenied, n3Var);
                    }
                };
                c0Var.Y(objI3);
            }
            c0Var.A();
            PermissionDeniedDialogKt.PermissionDeniedDialog(null, string, strD, strD2, numValueOf, (Function0) objI3, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.utils.audio.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AudioPermissionHandlerKt.rememberAudioPermissionHandler$lambda$9(context, n3Var);
                }
            }, c0Var, 0, 1);
        }
        c0Var.A();
        return function1;
    }

    private static final boolean rememberAudioPermissionHandler$lambda$1(n3<Boolean> n3Var) {
        return n3Var.getValue().booleanValue();
    }

    private static final void rememberAudioPermissionHandler$lambda$2(n3<Boolean> n3Var, boolean z10) {
        n3Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioPermissionHandler$lambda$4$lambda$3(Function0 onPermissionGranted, Function0 onPermissionDenied, boolean z10) {
        Intrinsics.checkNotNullParameter(onPermissionGranted, "$onPermissionGranted");
        Intrinsics.checkNotNullParameter(onPermissionDenied, "$onPermissionDenied");
        if (z10) {
            onPermissionGranted.invoke();
        } else {
            onPermissionDenied.invoke();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioPermissionHandler$lambda$6$lambda$5(Context context, Activity activity, Function0 onPermissionGranted, k permissionLauncher, n3 showSettingsDialog$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(onPermissionGranted, "$onPermissionGranted");
        Intrinsics.checkNotNullParameter(permissionLauncher, "$permissionLauncher");
        Intrinsics.checkNotNullParameter(showSettingsDialog$delegate, "$showSettingsDialog$delegate");
        PermissionResult permissionResultCheckAudioPermissionStatus = checkAudioPermissionStatus(context, activity);
        if (Intrinsics.areEqual(permissionResultCheckAudioPermissionStatus, PermissionResult.Granted.INSTANCE) || Intrinsics.areEqual(permissionResultCheckAudioPermissionStatus, PermissionResult.NotRequired.INSTANCE)) {
            onPermissionGranted.invoke();
        } else if (Intrinsics.areEqual(permissionResultCheckAudioPermissionStatus, PermissionResult.Denied.INSTANCE)) {
            permissionLauncher.b("android.permission.RECORD_AUDIO");
        } else {
            if (!Intrinsics.areEqual(permissionResultCheckAudioPermissionStatus, PermissionResult.PermanentlyDenied.INSTANCE)) {
                throw new k0();
            }
            rememberAudioPermissionHandler$lambda$2(showSettingsDialog$delegate, true);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioPermissionHandler$lambda$8$lambda$7(Function0 onPermissionDenied, n3 showSettingsDialog$delegate) {
        Intrinsics.checkNotNullParameter(onPermissionDenied, "$onPermissionDenied");
        Intrinsics.checkNotNullParameter(showSettingsDialog$delegate, "$showSettingsDialog$delegate");
        rememberAudioPermissionHandler$lambda$2(showSettingsDialog$delegate, false);
        onPermissionDenied.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberAudioPermissionHandler$lambda$9(Context context, n3 showSettingsDialog$delegate) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(showSettingsDialog$delegate, "$showSettingsDialog$delegate");
        rememberAudioPermissionHandler$lambda$2(showSettingsDialog$delegate, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(z.b.f306542i, context.getPackageName(), null)));
        return Unit.f312394a;
    }

    public static final boolean shouldShowRequestPermissionRationale(@Nullable Activity activity) {
        if (activity != null) {
            return androidx.core.app.b.S(activity, "android.permission.RECORD_AUDIO");
        }
        return false;
    }
}
