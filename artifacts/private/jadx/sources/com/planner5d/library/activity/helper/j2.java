package com.planner5d.library.activity.helper;

import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class j2 implements com.planner5d.library.model.manager.h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f136981b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.b2 f136982a;

    @ij.a
    public j2(@NotNull com.planner5d.library.model.manager.b2 messageManager) {
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        this.f136982a = messageManager;
    }

    @Override // com.planner5d.library.model.manager.h2
    public void a(@Nullable String str) {
        this.f136982a.r(new ErrorMessageException(com.planner5d.library.f.s.J9, str));
    }

    @Override // java.util.function.Function
    public /* bridge */ /* synthetic */ Unit apply(String str) {
        a(str);
        return Unit.f312394a;
    }
}
