package com.planner5d.library.services.utility;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nConsumableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumableValue.kt\ncom/planner5d/library/services/utility/ConsumableValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private r3<T> f225338a;

    public o(T t10) {
        this.f225338a = new r3<>(t10);
    }

    @Nullable
    public final r3<T> a() {
        r3<T> r3Var = this.f225338a;
        if (r3Var == null) {
            return null;
        }
        this.f225338a = null;
        return r3Var;
    }

    @Nullable
    public final r3<T> b() {
        return this.f225338a;
    }
}
