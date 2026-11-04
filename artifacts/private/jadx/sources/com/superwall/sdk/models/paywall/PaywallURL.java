package com.superwall.sdk.models.paywall;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import oj.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
@g
public final class PaywallURL {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String value;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PaywallURL> serializer() {
            return PaywallURL$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ PaywallURL(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaywallURL m46boximpl(String str) {
        return new PaywallURL(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m47constructorimpl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m48equalsimpl(String str, Object obj) {
        return (obj instanceof PaywallURL) && Intrinsics.areEqual(str, ((PaywallURL) obj).m52unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m49equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m50hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m51toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m48equalsimpl(this.value, obj);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m50hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m51toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m52unboximpl() {
        return this.value;
    }
}
