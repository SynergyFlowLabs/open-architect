package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q3.b("NoOp")
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class w3 extends q3<y1> {
    public w3() {
        super("NoOp");
    }

    @Override // androidx.navigation.q3
    @NotNull
    public y1 c() {
        return new y1(this);
    }

    @Override // androidx.navigation.q3
    @NotNull
    public y1 g(@NotNull y1 destination, @Nullable Bundle bundle, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    @Override // androidx.navigation.q3
    public boolean p() {
        return true;
    }
}
