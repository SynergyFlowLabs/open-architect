package androidx.compose.ui.unit;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,435:1\n49#2:436\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n416#1:436\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f42698e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f42699f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f42701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f42702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f42703d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    public static /* synthetic */ k f(k kVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = kVar.f42700a;
        }
        if ((i10 & 2) != 0) {
            f11 = kVar.f42701b;
        }
        if ((i10 & 4) != 0) {
            f12 = kVar.f42702c;
        }
        if ((i10 & 8) != 0) {
            f13 = kVar.f42703d;
        }
        return kVar.e(f10, f11, f12, f13);
    }

    @k7
    public static /* synthetic */ void h() {
    }

    @k7
    public static /* synthetic */ void j() {
    }

    @k7
    public static /* synthetic */ void l() {
    }

    @k7
    public static /* synthetic */ void n() {
    }

    public final float a() {
        return this.f42700a;
    }

    public final float b() {
        return this.f42701b;
    }

    public final float c() {
        return this.f42702c;
    }

    public final float d() {
        return this.f42703d;
    }

    @NotNull
    public final k e(float f10, float f11, float f12, float f13) {
        return new k(f10, f11, f12, f13, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.x(this.f42700a, kVar.f42700a) && h.x(this.f42701b, kVar.f42701b) && h.x(this.f42702c, kVar.f42702c) && h.x(this.f42703d, kVar.f42703d);
    }

    public final float g() {
        return this.f42703d;
    }

    public int hashCode() {
        return (((((h.D(this.f42700a) * 31) + h.D(this.f42701b)) * 31) + h.D(this.f42702c)) * 31) + h.D(this.f42703d);
    }

    public final float i() {
        return this.f42700a;
    }

    public final float k() {
        return this.f42702c;
    }

    public final float m() {
        return this.f42701b;
    }

    @NotNull
    public String toString() {
        return "DpRect(left=" + ((Object) h.M(this.f42700a)) + ", top=" + ((Object) h.M(this.f42701b)) + ", right=" + ((Object) h.M(this.f42702c)) + ", bottom=" + ((Object) h.M(this.f42703d)) + ')';
    }

    public /* synthetic */ k(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private k(float f10, float f11, float f12, float f13) {
        this.f42700a = f10;
        this.f42701b = f11;
        this.f42702c = f12;
        this.f42703d = f13;
    }

    private k(long j10, long j11) {
        this(j.j(j10), j.l(j10), h.r(j.j(j10) + l.p(j11)), h.r(j.l(j10) + l.m(j11)), null);
    }
}
