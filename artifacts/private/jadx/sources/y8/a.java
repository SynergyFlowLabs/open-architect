package y8;

import com.google.firebase.inappmessaging.m;
import com.google.firebase.ktx.Firebase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @NotNull
    public static final m a(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        m mVarM = m.m();
        Intrinsics.checkNotNullExpressionValue(mVarM, "getInstance()");
        return mVarM;
    }
}
