package com.facebook.appevents.cloudbridge;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0898a f98605a = new C0898a(null);

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.a$a, reason: collision with other inner class name */
    public static final class C0898a {
        public /* synthetic */ C0898a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(@NotNull String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            if (Intrinsics.areEqual(rawValue, "MOBILE_APP_INSTALL")) {
                return a.MOBILE_APP_INSTALL;
            }
            return Intrinsics.areEqual(rawValue, "CUSTOM_APP_EVENTS") ? a.CUSTOM : a.OTHER;
        }

        private C0898a() {
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] aVarArrValuesCustom = values();
        return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
    }
}
