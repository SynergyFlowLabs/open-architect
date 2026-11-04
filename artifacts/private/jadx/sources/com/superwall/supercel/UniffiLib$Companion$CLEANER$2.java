package com.superwall.supercel;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
final class UniffiLib$Companion$CLEANER$2 extends l0 implements Function0<UniffiCleaner> {
    public static final UniffiLib$Companion$CLEANER$2 INSTANCE = new UniffiLib$Companion$CLEANER$2();

    UniffiLib$Companion$CLEANER$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final UniffiCleaner invoke() {
        return CELKt.create(UniffiCleaner.Companion);
    }
}
