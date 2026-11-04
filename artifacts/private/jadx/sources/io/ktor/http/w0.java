package io.ktor.http;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class w0 extends io.ktor.util.s1 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0() {
        this(0, 1, null);
        int i10 = 0 >> 0;
    }

    @Override // io.ktor.util.s1
    protected void s(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        super.s(name);
        d1.f295782a.a(name);
    }

    @Override // io.ktor.util.s1
    protected void t(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.t(value);
        d1.f295782a.b(value);
    }

    @Override // io.ktor.util.s1, io.ktor.util.p1
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public v0 build() {
        return new x0(r());
    }

    public w0(int i10) {
        super(true, i10);
    }

    public /* synthetic */ w0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
