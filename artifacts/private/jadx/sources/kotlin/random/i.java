package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class i extends f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f312899i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f312900j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f312901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f312902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f312903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f312904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f312905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f312906h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f312901c = i10;
        this.f312902d = i11;
        this.f312903e = i12;
        this.f312904f = i13;
        this.f312905g = i14;
        this.f312906h = i15;
        if ((i10 | i11 | i12 | i13 | i14) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i16 = 0; i16 < 64; i16++) {
            l();
        }
    }

    @Override // kotlin.random.f
    public int b(int i10) {
        return g.j(l(), i10);
    }

    @Override // kotlin.random.f
    public int l() {
        int i10 = this.f312901c;
        int i11 = i10 ^ (i10 >>> 2);
        this.f312901c = this.f312902d;
        this.f312902d = this.f312903e;
        this.f312903e = this.f312904f;
        int i12 = this.f312905g;
        this.f312904f = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f312905g = i13;
        int i14 = this.f312906h + 362437;
        this.f312906h = i14;
        return i13 + i14;
    }

    public i(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
