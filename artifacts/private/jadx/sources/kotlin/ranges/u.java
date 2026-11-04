package kotlin.ranges;

import java.util.Iterator;
import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.m2;
import kotlin.u1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {kotlin.u.class})
@e1(version = "1.5")
public class u implements Iterable<u1>, qj.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f312949d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f312950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f312951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f312952c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final u a(int i10, int i11, int i12) {
            return new u(i10, i11, i12, null);
        }

        private a() {
        }
    }

    public /* synthetic */ u(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof u) {
            if (isEmpty() && ((u) obj).isEmpty()) {
                return true;
            }
            u uVar = (u) obj;
            if (this.f312950a == uVar.f312950a && this.f312951b == uVar.f312951b && this.f312952c == uVar.f312952c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f312950a * 31) + this.f312951b) * 31) + this.f312952c;
    }

    public boolean isEmpty() {
        if (this.f312952c > 0) {
            return Integer.compareUnsigned(this.f312950a, this.f312951b) > 0;
        }
        return Integer.compareUnsigned(this.f312950a, this.f312951b) < 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<u1> iterator() {
        return new v(this.f312950a, this.f312951b, this.f312952c, null);
    }

    public final int l() {
        return this.f312950a;
    }

    public final int m() {
        return this.f312951b;
    }

    public final int n() {
        return this.f312952c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f312952c > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) u1.u0(this.f312950a));
            sb2.append("..");
            sb2.append((Object) u1.u0(this.f312951b));
            sb2.append(" step ");
            i10 = this.f312952c;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) u1.u0(this.f312950a));
            sb2.append(" downTo ");
            sb2.append((Object) u1.u0(this.f312951b));
            sb2.append(" step ");
            i10 = -this.f312952c;
        }
        sb2.append(i10);
        return sb2.toString();
    }

    private u(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f312950a = i10;
        this.f312951b = kotlin.internal.r.d(i10, i11, i12);
        this.f312952c = i12;
    }
}
