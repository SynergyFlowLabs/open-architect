package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,769:1\n646#2:770\n635#2:771\n646#2:772\n635#2:773\n646#2:774\n635#2:775\n646#2:776\n635#2:777\n646#2:778\n635#2:779\n646#2:780\n635#2:781\n646#2:782\n635#2:783\n646#2:784\n635#2:785\n646#2:786\n635#2:787\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemColors\n*L\n657#1:770\n657#1:771\n658#1:772\n658#1:773\n659#1:774\n659#1:775\n660#1:776\n660#1:777\n661#1:778\n661#1:779\n662#1:780\n662#1:781\n663#1:782\n663#1:783\n665#1:784\n665#1:785\n667#1:786\n667#1:787\n*E\n"})
public final class ej {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f27360j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f27365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f27366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f27367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f27368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f27369i;

    public /* synthetic */ ej(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    public static /* synthetic */ ej c(ej ejVar, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i10, Object obj) {
        long j19;
        long j20;
        long j21 = (i10 & 1) != 0 ? ejVar.f27361a : j10;
        long j22 = (i10 & 2) != 0 ? ejVar.f27362b : j11;
        long j23 = (i10 & 4) != 0 ? ejVar.f27363c : j12;
        long j24 = (i10 & 8) != 0 ? ejVar.f27364d : j13;
        long j25 = (i10 & 16) != 0 ? ejVar.f27365e : j14;
        long j26 = (i10 & 32) != 0 ? ejVar.f27366f : j15;
        long j27 = (i10 & 64) != 0 ? ejVar.f27367g : j16;
        long j28 = j21;
        long j29 = (i10 & 128) != 0 ? ejVar.f27368h : j17;
        if ((i10 & 256) != 0) {
            j20 = j29;
            j19 = ejVar.f27369i;
        } else {
            j19 = j18;
            j20 = j29;
        }
        return ejVar.b(j28, j22, j23, j24, j25, j26, j27, j20, j19);
    }

    public final long a() {
        return this.f27361a;
    }

    @NotNull
    public final ej b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        return new ej(j10 != 16 ? j10 : this.f27361a, j11 != 16 ? j11 : this.f27362b, j12 != 16 ? j12 : this.f27363c, j13 != 16 ? j13 : this.f27364d, j14 != 16 ? j14 : this.f27365e, j15 != 16 ? j15 : this.f27366f, j16 != 16 ? j16 : this.f27367g, j17 != 16 ? j17 : this.f27368h, j18 != 16 ? j18 : this.f27369i, null);
    }

    public final long d() {
        return this.f27361a;
    }

    public final long e() {
        return this.f27367g;
    }

    public final long f() {
        return this.f27368h;
    }

    public final long g() {
        return this.f27369i;
    }

    public final long h() {
        return this.f27362b;
    }

    public final long i() {
        return this.f27363c;
    }

    public final long j() {
        return this.f27364d;
    }

    public final long k() {
        return this.f27365e;
    }

    public final long l() {
        return this.f27366f;
    }

    @androidx.compose.runtime.k7
    public final long m(boolean z10) {
        return z10 ? this.f27362b : this.f27367g;
    }

    @androidx.compose.runtime.k7
    public final long n(boolean z10) {
        return z10 ? this.f27363c : this.f27368h;
    }

    @androidx.compose.runtime.k7
    public final long o() {
        return this.f27364d;
    }

    @androidx.compose.runtime.k7
    public final long p() {
        return this.f27365e;
    }

    @androidx.compose.runtime.k7
    public final long q(boolean z10) {
        return z10 ? this.f27366f : this.f27369i;
    }

    private ej(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f27361a = j10;
        this.f27362b = j11;
        this.f27363c = j12;
        this.f27364d = j13;
        this.f27365e = j14;
        this.f27366f = j15;
        this.f27367g = j16;
        this.f27368h = j17;
        this.f27369i = j18;
    }
}
