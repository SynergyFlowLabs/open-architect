package v8;

import com.google.firebase.ktx.Firebase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    @NotNull
    public static final com.google.firebase.inappmessaging.display.c a(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        com.google.firebase.inappmessaging.display.c cVarX = com.google.firebase.inappmessaging.display.c.x();
        Intrinsics.checkNotNullExpressionValue(cVarX, "getInstance()");
        return cVarX;
    }
}
