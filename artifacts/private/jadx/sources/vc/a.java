package vc;

import com.planner5d.library.modules.user.user.f1;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final id.a f385720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<d<? super Unit>, Object> f385721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull id.a user, @NotNull Function1<? super d<? super Unit>, ? extends Object> actionToContinue) {
        super("User not agreed with privacy/terms");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(actionToContinue, "actionToContinue");
        this.f385720a = user;
        this.f385721b = actionToContinue;
    }

    @NotNull
    public final Function1<d<? super Unit>, Object> a() {
        return this.f385721b;
    }

    @NotNull
    public final id.a b() {
        return this.f385720a;
    }
}
