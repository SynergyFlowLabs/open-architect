package com.superwall.sdk.models.internal;

import kotlin.jvm.internal.Intrinsics;
import oj.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@g
public final class VendorId {

    @NotNull
    private final String value;

    private /* synthetic */ VendorId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VendorId m34boximpl(String str) {
        return new VendorId(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m35constructorimpl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m36equalsimpl(String str, Object obj) {
        return (obj instanceof VendorId) && Intrinsics.areEqual(str, ((VendorId) obj).m40unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m37equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m38hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m39toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m36equalsimpl(this.value, obj);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m38hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m39toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m40unboximpl() {
        return this.value;
    }
}
