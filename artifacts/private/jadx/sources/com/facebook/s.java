package com.facebook;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f101768e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f101769f = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f101770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f101771d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public s(@Nullable String str, int i10, @Nullable String str2) {
        super(str);
        this.f101770c = i10;
        this.f101771d = str2;
    }

    public final int c() {
        return this.f101770c;
    }

    @Nullable
    public final String d() {
        return this.f101771d;
    }

    @Override // com.facebook.u, java.lang.Throwable
    @NotNull
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f101770c + ", message: " + getMessage() + ", url: " + this.f101771d + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
