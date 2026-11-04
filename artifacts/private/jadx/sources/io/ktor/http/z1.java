package io.ktor.http;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class z1 extends io.ktor.util.s1 implements y1 {
    public z1() {
        this(0, 1, null);
    }

    public /* synthetic */ z1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }

    @Override // io.ktor.util.s1, io.ktor.util.p1
    @NotNull
    public x1 build() {
        return new a2(r());
    }

    public z1(int i10) {
        super(true, i10);
    }
}
