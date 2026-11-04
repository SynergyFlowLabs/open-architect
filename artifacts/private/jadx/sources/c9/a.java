package c9;

import com.google.firebase.h;
import com.google.firebase.installations.j;
import com.google.firebase.ktx.Firebase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    @NotNull
    public static final j a(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        j jVarU = j.u();
        Intrinsics.checkNotNullExpressionValue(jVarU, "getInstance()");
        return jVarU;
    }

    @NotNull
    public static final j b(@NotNull Firebase firebase, @NotNull h app2) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app2, "app");
        j jVarV = j.v(app2);
        Intrinsics.checkNotNullExpressionValue(jVarV, "getInstance(app)");
        return jVarV;
    }
}
