package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.o2;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class r extends t implements Iterable<t>, qj.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f38587l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f38588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f38589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f38590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f38591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f38592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f38593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f38594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f38595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<h> f38596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<t> f38597k;

    public static final class a implements Iterator<t>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<t> f38598a;

        a(r rVar) {
            this.f38598a = rVar.f38597k.iterator();
        }

        public final Iterator<t> b() {
            return this.f38598a;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public t next() {
            return this.f38598a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38598a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
        boolean z10 = true | false;
    }

    @NotNull
    public final t d(int i10) {
        return this.f38597k.get(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof r)) {
            r rVar = (r) obj;
            return Intrinsics.areEqual(this.f38588b, rVar.f38588b) && this.f38589c == rVar.f38589c && this.f38590d == rVar.f38590d && this.f38591e == rVar.f38591e && this.f38592f == rVar.f38592f && this.f38593g == rVar.f38593g && this.f38594h == rVar.f38594h && this.f38595i == rVar.f38595i && Intrinsics.areEqual(this.f38596j, rVar.f38596j) && Intrinsics.areEqual(this.f38597k, rVar.f38597k);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.f38588b.hashCode() * 31) + Float.hashCode(this.f38589c)) * 31) + Float.hashCode(this.f38590d)) * 31) + Float.hashCode(this.f38591e)) * 31) + Float.hashCode(this.f38592f)) * 31) + Float.hashCode(this.f38593g)) * 31) + Float.hashCode(this.f38594h)) * 31) + Float.hashCode(this.f38595i)) * 31) + this.f38596j.hashCode()) * 31) + this.f38597k.hashCode();
    }

    @NotNull
    public final List<h> i() {
        return this.f38596j;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<t> iterator() {
        return new a(this);
    }

    @NotNull
    public final String k() {
        return this.f38588b;
    }

    public final float l() {
        return this.f38590d;
    }

    public final float m() {
        return this.f38591e;
    }

    public final float n() {
        return this.f38589c;
    }

    public final float p() {
        return this.f38592f;
    }

    public final float s() {
        return this.f38593g;
    }

    public final int t() {
        return this.f38597k.size();
    }

    public final float u() {
        return this.f38594h;
    }

    public final float v() {
        return this.f38595i;
    }

    public /* synthetic */ r(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? s.h() : list, (i10 & 512) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends h> list, @NotNull List<? extends t> list2) {
        super(null);
        this.f38588b = str;
        this.f38589c = f10;
        this.f38590d = f11;
        this.f38591e = f12;
        this.f38592f = f13;
        this.f38593g = f14;
        this.f38594h = f15;
        this.f38595i = f16;
        this.f38596j = list;
        this.f38597k = list2;
    }
}
