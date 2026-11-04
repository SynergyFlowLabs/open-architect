package com.google.firebase.sessions;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d1 f125190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f1 f125191b;

    @ij.a
    public v0(@NotNull d1 timeProvider, @NotNull f1 uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f125190a = timeProvider;
        this.f125191b = uuidGenerator;
    }

    private final String b() {
        String string = this.f125191b.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String lowerCase = StringsKt.k2(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public final SessionDetails a(@Nullable SessionDetails sessionDetails) {
        String strG;
        String strB = b();
        if (sessionDetails == null || (strG = sessionDetails.g()) == null) {
            strG = strB;
        }
        return new SessionDetails(strB, strG, sessionDetails != null ? sessionDetails.i() + 1 : 0, this.f125190a.b().f());
    }
}
