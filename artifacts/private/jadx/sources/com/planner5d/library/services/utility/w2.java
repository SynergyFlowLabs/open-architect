package com.planner5d.library.services.utility;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSingleUseReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleUseReference.kt\ncom/planner5d/library/services/utility/SingleUseReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,9:1\n1#2:10\n*E\n"})
public final class w2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private T f229830a;

    public w2(@NotNull T reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f229830a = reference;
    }

    @Nullable
    public final T a() {
        T t10 = this.f229830a;
        this.f229830a = null;
        return t10;
    }
}
