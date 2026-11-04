package com.devtodev.analytics.internal.platform.repository.playservice;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.devtodev.analytics.internal.queue.QueueManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1 extends l0 implements Function0<Unit> {
    final /* synthetic */ IReferrerClientListener $referrerListener;
    final /* synthetic */ int $responseCode;
    final /* synthetic */ ReferrerClient this$0;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        final /* synthetic */ boolean $googlePlayInstantParam;
        final /* synthetic */ long $installBeginTimestampSeconds;
        final /* synthetic */ String $installReferrer;
        final /* synthetic */ long $referrerClickTimestampSeconds;
        final /* synthetic */ IReferrerClientListener $referrerListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IReferrerClientListener iReferrerClientListener, String str, boolean z10, long j10, long j11) {
            super(0);
            this.$referrerListener = iReferrerClientListener;
            this.$installReferrer = str;
            this.$googlePlayInstantParam = z10;
            this.$installBeginTimestampSeconds = j10;
            this.$referrerClickTimestampSeconds = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IReferrerClientListener iReferrerClientListener = this.$referrerListener;
            String installReferrer = this.$installReferrer;
            Intrinsics.checkNotNullExpressionValue(installReferrer, "installReferrer");
            iReferrerClientListener.onReferrerSetup(installReferrer, this.$googlePlayInstantParam, this.$installBeginTimestampSeconds, this.$referrerClickTimestampSeconds);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l0 implements Function0<Unit> {
        final /* synthetic */ IReferrerClientListener $referrerListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IReferrerClientListener iReferrerClientListener) {
            super(0);
            this.$referrerListener = iReferrerClientListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$referrerListener.onReferrerSetupFail();
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends l0 implements Function0<Unit> {
        final /* synthetic */ IReferrerClientListener $referrerListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(IReferrerClientListener iReferrerClientListener) {
            super(0);
            this.$referrerListener = iReferrerClientListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$referrerListener.onReferrerFeatureNotSupported();
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends l0 implements Function0<Unit> {
        final /* synthetic */ IReferrerClientListener $referrerListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(IReferrerClientListener iReferrerClientListener) {
            super(0);
            this.$referrerListener = iReferrerClientListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$referrerListener.onReferrerServiceUnavailable();
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.platform.repository.playservice.ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1$5, reason: invalid class name */
    public static final class AnonymousClass5 extends l0 implements Function0<Unit> {
        final /* synthetic */ IReferrerClientListener $referrerListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(IReferrerClientListener iReferrerClientListener) {
            super(0);
            this.$referrerListener = iReferrerClientListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$referrerListener.onReferrerServiceUnavailable();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferrerClient$startConnection$1$onInstallReferrerSetupFinished$1(int i10, ReferrerClient referrerClient, IReferrerClientListener iReferrerClientListener) {
        super(0);
        this.$responseCode = i10;
        this.this$0 = referrerClient;
        this.$referrerListener = iReferrerClientListener;
        int i11 = 4 ^ 0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        try {
            int i10 = this.$responseCode;
            if (i10 != 0) {
                if (i10 == 1) {
                    QueueManager.Companion.runIncoming(new AnonymousClass4(this.$referrerListener));
                    return;
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    QueueManager.Companion.runIncoming(new AnonymousClass3(this.$referrerListener));
                    return;
                }
            }
            InstallReferrerClient installReferrerClient = this.this$0.getInstallReferrerClient();
            ReferrerDetails installReferrer = installReferrerClient != null ? installReferrerClient.getInstallReferrer() : null;
            if (installReferrer != null) {
                QueueManager.Companion.runIncoming(new AnonymousClass1(this.$referrerListener, installReferrer.getInstallReferrer(), installReferrer.getGooglePlayInstantParam(), installReferrer.getInstallBeginTimestampSeconds(), installReferrer.getReferrerClickTimestampSeconds()));
            } else {
                QueueManager.Companion.runIncoming(new AnonymousClass2(this.$referrerListener));
            }
        } catch (Throwable unused) {
            QueueManager.Companion.runIncoming(new AnonymousClass5(this.$referrerListener));
        }
    }
}
