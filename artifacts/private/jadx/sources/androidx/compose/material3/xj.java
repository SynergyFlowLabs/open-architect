package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,535:1\n646#2:536\n635#2:537\n646#2:538\n635#2:539\n646#2:540\n635#2:541\n646#2:542\n635#2:543\n646#2:544\n635#2:545\n646#2:546\n635#2:547\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n*L\n299#1:536\n299#1:537\n300#1:538\n300#1:539\n301#1:540\n301#1:541\n302#1:542\n302#1:543\n303#1:544\n303#1:545\n304#1:546\n304#1:547\n*E\n"})
public final class xj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34529g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f34532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f34533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f34534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f34535f;

    public /* synthetic */ xj(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15);
    }

    public static /* synthetic */ xj b(xj xjVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = xjVar.f34530a;
        }
        return xjVar.a(j10, (i10 & 2) != 0 ? xjVar.f34531b : j11, (i10 & 4) != 0 ? xjVar.f34532c : j12, (i10 & 8) != 0 ? xjVar.f34533d : j13, (i10 & 16) != 0 ? xjVar.f34534e : j14, (i10 & 32) != 0 ? xjVar.f34535f : j15);
    }

    @NotNull
    public final xj a(long j10, long j11, long j12, long j13, long j14, long j15) {
        return new xj(j10 != 16 ? j10 : this.f34530a, j11 != 16 ? j11 : this.f34531b, j12 != 16 ? j12 : this.f34532c, j13 != 16 ? j13 : this.f34533d, j14 != 16 ? j14 : this.f34534e, j15 != 16 ? j15 : this.f34535f, null);
    }

    public final long c() {
        return this.f34534e;
    }

    public final long d() {
        return this.f34533d;
    }

    public final long e() {
        return this.f34535f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) obj;
        return androidx.compose.ui.graphics.q0.y(this.f34530a, xjVar.f34530a) && androidx.compose.ui.graphics.q0.y(this.f34531b, xjVar.f34531b) && androidx.compose.ui.graphics.q0.y(this.f34532c, xjVar.f34532c) && androidx.compose.ui.graphics.q0.y(this.f34533d, xjVar.f34533d) && androidx.compose.ui.graphics.q0.y(this.f34534e, xjVar.f34534e) && androidx.compose.ui.graphics.q0.y(this.f34535f, xjVar.f34535f);
    }

    public final long f() {
        return this.f34531b;
    }

    public final long g() {
        return this.f34530a;
    }

    public final long h() {
        return this.f34532c;
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.graphics.q0.K(this.f34530a) * 31) + androidx.compose.ui.graphics.q0.K(this.f34531b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f34532c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f34533d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f34534e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f34535f);
    }

    @androidx.compose.runtime.k7
    public final long i(boolean z10) {
        return z10 ? this.f34531b : this.f34534e;
    }

    @androidx.compose.runtime.k7
    public final long j(boolean z10) {
        return z10 ? this.f34530a : this.f34533d;
    }

    @androidx.compose.runtime.k7
    public final long k(boolean z10) {
        return z10 ? this.f34532c : this.f34535f;
    }

    private xj(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f34530a = j10;
        this.f34531b = j11;
        this.f34532c = j12;
        this.f34533d = j13;
        this.f34534e = j14;
        this.f34535f = j15;
    }
}
