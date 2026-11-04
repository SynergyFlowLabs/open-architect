package coil.size;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f87782c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final i f87783d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f87784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f87785b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        c.b bVar = c.b.f87768a;
        f87783d = new i(bVar, bVar);
    }

    public i(@NotNull c cVar, @NotNull c cVar2) {
        this.f87784a = cVar;
        this.f87785b = cVar2;
    }

    public static /* synthetic */ i d(i iVar, c cVar, c cVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = iVar.f87784a;
        }
        if ((i10 & 2) != 0) {
            cVar2 = iVar.f87785b;
        }
        return iVar.c(cVar, cVar2);
    }

    @NotNull
    public final c a() {
        return this.f87784a;
    }

    @NotNull
    public final c b() {
        return this.f87785b;
    }

    @NotNull
    public final i c(@NotNull c cVar, @NotNull c cVar2) {
        return new i(cVar, cVar2);
    }

    @NotNull
    public final c e() {
        return this.f87785b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f87784a, iVar.f87784a) && Intrinsics.areEqual(this.f87785b, iVar.f87785b);
    }

    @NotNull
    public final c f() {
        return this.f87784a;
    }

    public int hashCode() {
        return (this.f87784a.hashCode() * 31) + this.f87785b.hashCode();
    }

    @NotNull
    public String toString() {
        return "Size(width=" + this.f87784a + ", height=" + this.f87785b + ')';
    }
}
