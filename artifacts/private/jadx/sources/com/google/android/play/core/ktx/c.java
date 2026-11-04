package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.h;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.install.InstallState;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.google.android.play.core.appupdate.b f114925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.google.android.play.core.appupdate.a f114926b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull com.google.android.play.core.appupdate.b appUpdateManager, @NotNull com.google.android.play.core.appupdate.a updateInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
            Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
            this.f114925a = appUpdateManager;
            this.f114926b = updateInfo;
        }

        @NotNull
        public final com.google.android.play.core.appupdate.a a() {
            return this.f114926b;
        }

        public final boolean b(@NotNull Activity activity, int i10) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return this.f114925a.f(this.f114926b, activity, com.google.android.play.core.appupdate.d.d(0).a(), i10);
        }

        public final boolean c(@NotNull h<IntentSenderRequest> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
            return this.f114925a.a(this.f114926b, activityResultLauncher, com.google.android.play.core.appupdate.d.d(0).a());
        }

        public final boolean d(@NotNull Fragment fragment, int i10) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            com.google.android.play.core.appupdate.b bVar = this.f114925a;
            com.google.android.play.core.appupdate.a aVar = this.f114926b;
            com.google.android.play.core.appupdate.d dVarA = com.google.android.play.core.appupdate.d.d(0).a();
            Intrinsics.checkNotNullExpressionValue(dVarA, "newBuilder(AppUpdateType.FLEXIBLE).build()");
            return com.google.android.play.core.ktx.a.s(bVar, aVar, fragment, dVarA, i10);
        }

        public final boolean e(@NotNull Activity activity, int i10) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return this.f114925a.f(this.f114926b, activity, com.google.android.play.core.appupdate.d.d(1).a(), i10);
        }

        public final boolean f(@NotNull h<IntentSenderRequest> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
            return this.f114925a.a(this.f114926b, activityResultLauncher, com.google.android.play.core.appupdate.d.d(1).a());
        }

        public final boolean g(@NotNull Fragment fragment, int i10) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            com.google.android.play.core.appupdate.b bVar = this.f114925a;
            com.google.android.play.core.appupdate.a aVar = this.f114926b;
            com.google.android.play.core.appupdate.d dVarA = com.google.android.play.core.appupdate.d.d(1).a();
            Intrinsics.checkNotNullExpressionValue(dVarA, "newBuilder(AppUpdateType.IMMEDIATE).build()");
            return com.google.android.play.core.ktx.a.s(bVar, aVar, fragment, dVarA, i10);
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.google.android.play.core.appupdate.b f114927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull com.google.android.play.core.appupdate.b appUpdateManager) {
            super(null);
            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
            this.f114927a = appUpdateManager;
        }

        @Nullable
        public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
            Object objO = com.google.android.play.core.ktx.a.o(this.f114927a, dVar);
            return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.google.android.play.core.ktx.c$c, reason: collision with other inner class name */
    public static final class C1003c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final InstallState f114928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1003c(@NotNull InstallState installState) {
            super(null);
            Intrinsics.checkNotNullParameter(installState, "installState");
            this.f114928a = installState;
        }

        @NotNull
        public final InstallState a() {
            return this.f114928a;
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f114929a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
