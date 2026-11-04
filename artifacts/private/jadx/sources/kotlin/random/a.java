package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public abstract class a extends f {
    @Override // kotlin.random.f
    public int b(int i10) {
        return g.j(r().nextInt(), i10);
    }

    @Override // kotlin.random.f
    public boolean c() {
        return r().nextBoolean();
    }

    @Override // kotlin.random.f
    @NotNull
    public byte[] e(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        r().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.f
    public double h() {
        return r().nextDouble();
    }

    @Override // kotlin.random.f
    public float k() {
        return r().nextFloat();
    }

    @Override // kotlin.random.f
    public int l() {
        return r().nextInt();
    }

    @Override // kotlin.random.f
    public int m(int i10) {
        return r().nextInt(i10);
    }

    @Override // kotlin.random.f
    public long o() {
        return r().nextLong();
    }

    @NotNull
    public abstract Random r();
}
