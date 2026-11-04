package coil.transition;

import android.graphics.drawable.Drawable;
import coil.decode.e;
import coil.request.f;
import coil.request.j;
import coil.request.r;
import coil.size.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f87795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f87796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f87797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f87798d;

    /* JADX INFO: renamed from: coil.transition.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
    public static final class C0822a implements c.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f87799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f87800d;

        /* JADX WARN: Multi-variable type inference failed */
        @oj.j
        public C0822a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        @Override // coil.transition.c.a
        @NotNull
        public c a(@NotNull d dVar, @NotNull j jVar) {
            if ((jVar instanceof r) && ((r) jVar).e() != e.MEMORY_CACHE) {
                return new a(dVar, jVar, this.f87799c, this.f87800d);
            }
            return c.a.f87804b.a(dVar, jVar);
        }

        public final int b() {
            return this.f87799c;
        }

        public final boolean c() {
            return this.f87800d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0822a)) {
                return false;
            }
            C0822a c0822a = (C0822a) obj;
            return this.f87799c == c0822a.f87799c && this.f87800d == c0822a.f87800d;
        }

        public int hashCode() {
            return (this.f87799c * 31) + Boolean.hashCode(this.f87800d);
        }

        @oj.j
        public C0822a(int i10) {
            this(i10, false, 2, null);
        }

        @oj.j
        public C0822a(int i10, boolean z10) {
            this.f87799c = i10;
            this.f87800d = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        public /* synthetic */ C0822a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }

    @oj.j
    public a(@NotNull d dVar, @NotNull j jVar) {
        this(dVar, jVar, 0, false, 12, null);
    }

    @Override // coil.transition.c
    public void a() {
        Drawable drawableF = this.f87795a.f();
        Drawable drawableA = this.f87796b.a();
        h hVarJ = this.f87796b.b().J();
        int i10 = this.f87797c;
        j jVar = this.f87796b;
        coil.drawable.a aVar = new coil.drawable.a(drawableF, drawableA, hVarJ, i10, ((jVar instanceof r) && ((r) jVar).h()) ? false : true, this.f87798d);
        j jVar2 = this.f87796b;
        if (jVar2 instanceof r) {
            this.f87795a.onSuccess(aVar);
        } else {
            if (!(jVar2 instanceof f)) {
                throw new k0();
            }
            this.f87795a.onError(aVar);
        }
    }

    public final int b() {
        return this.f87797c;
    }

    public final boolean c() {
        return this.f87798d;
    }

    @oj.j
    public a(@NotNull d dVar, @NotNull j jVar, int i10) {
        this(dVar, jVar, i10, false, 8, null);
    }

    @oj.j
    public a(@NotNull d dVar, @NotNull j jVar, int i10, boolean z10) {
        this.f87795a = dVar;
        this.f87796b = jVar;
        this.f87797c = i10;
        this.f87798d = z10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public /* synthetic */ a(d dVar, j jVar, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, jVar, (i11 & 4) != 0 ? 100 : i10, (i11 & 8) != 0 ? false : z10);
    }
}
