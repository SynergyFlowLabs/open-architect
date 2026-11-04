package com.superwall.sdk.models.internal;

import kotlin.jvm.internal.Intrinsics;
import oj.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@g
public final class UserId {

    @NotNull
    private final String value;

    private /* synthetic */ UserId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UserId m27boximpl(String str) {
        return new UserId(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m28constructorimpl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29equalsimpl(String str, Object obj) {
        if ((obj instanceof UserId) && Intrinsics.areEqual(str, ((UserId) obj).m33unboximpl())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m32toStringimpl(String str) {
        return "UserId(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m29equalsimpl(this.value, obj);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m31hashCodeimpl(this.value);
    }

    public String toString() {
        return m32toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m33unboximpl() {
        return this.value;
    }
}
