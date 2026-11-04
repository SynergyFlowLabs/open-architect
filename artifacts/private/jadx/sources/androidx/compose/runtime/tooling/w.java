package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36703c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f36705b;

    public w(int i10, @Nullable Integer num) {
        this.f36704a = i10;
        this.f36705b = num;
    }

    public static /* synthetic */ w d(w wVar, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = wVar.f36704a;
        }
        if ((i11 & 2) != 0) {
            num = wVar.f36705b;
        }
        return wVar.c(i10, num);
    }

    public final int a() {
        return this.f36704a;
    }

    @Nullable
    public final Integer b() {
        return this.f36705b;
    }

    @NotNull
    public final w c(int i10, @Nullable Integer num) {
        return new w(i10, num);
    }

    @Nullable
    public final Integer e() {
        return this.f36705b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f36704a == wVar.f36704a && Intrinsics.areEqual(this.f36705b, wVar.f36705b);
    }

    public final int f() {
        return this.f36704a;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f36704a) * 31;
        Integer num = this.f36705b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ObjectLocation(group=" + this.f36704a + ", dataOffset=" + this.f36705b + ')';
    }
}
