package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nThrowableExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrowableExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ThrowableExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n11653#2,9:36\n13579#2:45\n13580#2:47\n11662#2:48\n1#3:46\n*S KotlinDebug\n*F\n+ 1 ThrowableExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ThrowableExtensionsKt\n*L\n10#1:36,9\n10#1:45\n10#1:47\n10#1:48\n10#1:46\n*E\n"})
public final class AFd1qSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1qSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.jvm.internal.l0 implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 getMediationNetwork = new AnonymousClass5();

        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            return "at " + stackTraceElement;
        }
    }

    @NotNull
    public static final AFc1cSDK getCurrencyIso4217Code(@NotNull Throwable th2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        String name = th2.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return new AFc1cSDK(name + ": " + str, getMediationNetwork(th2), kotlin.p.i(th2), 0, 8, null);
    }

    @NotNull
    private static String getMediationNetwork(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(th2, "");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!StringsKt.u2(className, "com.appsflyer", false, 2, null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        String str = th2 + "\n" + CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, AnonymousClass5.getMediationNetwork, 30, null);
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1rSDK.getCurrencyIso4217Code(str, org.apache.commons.codec.digest.g.f335251e);
    }
}
