package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1107#2:199\n1085#2,2:200\n1107#2:202\n1085#2,2:203\n424#3,5:205\n643#3,2:210\n429#3,3:212\n472#3:215\n643#3,2:216\n472#3:218\n472#3:220\n436#3,8:221\n516#3:229\n643#3,2:230\n1#4:219\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n*L\n31#1:199\n31#1:200,2\n32#1:202\n32#1:203,2\n35#1:205,5\n36#1:210,2\n35#1:212,3\n78#1:215\n109#1:216,2\n131#1:218\n134#1:220\n138#1:221,8\n155#1:229\n188#1:230,2\n*E\n"})
public final class q implements androidx.compose.foundation.text.input.j.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f19746c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.collection.d<a> f19747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.collection.d<a> f19748b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19752d;

        public a(int i10, int i11, int i12, int i13) {
            this.f19749a = i10;
            this.f19750b = i11;
            this.f19751c = i12;
            this.f19752d = i13;
        }

        public static /* synthetic */ a f(a aVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = aVar.f19749a;
            }
            if ((i14 & 2) != 0) {
                i11 = aVar.f19750b;
            }
            if ((i14 & 4) != 0) {
                i12 = aVar.f19751c;
            }
            if ((i14 & 8) != 0) {
                i13 = aVar.f19752d;
            }
            return aVar.e(i10, i11, i12, i13);
        }

        public final int a() {
            return this.f19749a;
        }

        public final int b() {
            return this.f19750b;
        }

        public final int c() {
            return this.f19751c;
        }

        public final int d() {
            return this.f19752d;
        }

        @NotNull
        public final a e(int i10, int i11, int i12, int i13) {
            return new a(i10, i11, i12, i13);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19749a == aVar.f19749a && this.f19750b == aVar.f19750b && this.f19751c == aVar.f19751c && this.f19752d == aVar.f19752d;
        }

        public final int g() {
            return this.f19752d;
        }

        public final int h() {
            return this.f19751c;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f19749a) * 31) + Integer.hashCode(this.f19750b)) * 31) + Integer.hashCode(this.f19751c)) * 31) + Integer.hashCode(this.f19752d);
        }

        public final int i() {
            return this.f19750b;
        }

        public final int j() {
            return this.f19749a;
        }

        public final void k(int i10) {
            this.f19752d = i10;
        }

        public final void l(int i10) {
            this.f19751c = i10;
        }

        public final void m(int i10) {
            this.f19750b = i10;
        }

        public final void n(int i10) {
            this.f19749a = i10;
        }

        @NotNull
        public String toString() {
            return "Change(preStart=" + this.f19749a + ", preEnd=" + this.f19750b + ", originalStart=" + this.f19751c + ", originalEnd=" + this.f19752d + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void d(a aVar, int i10, int i11, int i12) {
        int i13;
        if (this.f19748b.R() == 0) {
            i13 = 0;
        } else {
            a aVarY = this.f19748b.Y();
            i13 = aVarY.i() - aVarY.g();
        }
        if (aVar == null) {
            int i14 = i10 - i13;
            aVar = new a(i10, i11 + i12, i14, (i11 - i10) + i14);
        } else {
            if (aVar.j() > i10) {
                aVar.n(i10);
                aVar.l(i10);
            }
            if (i11 > aVar.i()) {
                int i15 = aVar.i() - aVar.g();
                aVar.m(i11);
                aVar.k(i11 - i15);
            }
            aVar.m(aVar.i() + i12);
        }
        this.f19748b.d(aVar);
    }

    @Override // androidx.compose.foundation.text.input.j.a
    public int a() {
        return this.f19747a.R();
    }

    @Override // androidx.compose.foundation.text.input.j.a
    public long b(int i10) {
        a aVar = this.f19747a.f35552a[i10];
        return androidx.compose.ui.text.x3.b(aVar.h(), aVar.g());
    }

    @Override // androidx.compose.foundation.text.input.j.a
    public long c(int i10) {
        a aVar = this.f19747a.f35552a[i10];
        return androidx.compose.ui.text.x3.b(aVar.j(), aVar.i());
    }

    public final void e() {
        this.f19747a.r();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    public final void f(int i10, int i11, int i12) {
        int i13;
        if (i10 == i11 && i12 == 0) {
            return;
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int i14 = i12 - (iMax - iMin);
        a aVar = null;
        boolean z10 = false;
        for (int i15 = 0; i15 < this.f19747a.R(); i15++) {
            a aVar2 = this.f19747a.f35552a[i15];
            int iJ = aVar2.j();
            if ((iMin > iJ || iJ > iMax) && (iMin > (i13 = aVar2.i()) || i13 > iMax)) {
                int iJ2 = aVar2.j();
                if (iMin > aVar2.i() || iJ2 > iMin) {
                    int iJ3 = aVar2.j();
                    if (iMax > aVar2.i() || iJ3 > iMax) {
                        if (aVar2.j() > iMax && !z10) {
                            d(aVar, iMin, iMax, i14);
                            z10 = true;
                        }
                        if (z10) {
                            aVar2.n(aVar2.j() + i14);
                            aVar2.m(aVar2.i() + i14);
                        }
                        this.f19748b.d(aVar2);
                    } else if (aVar == null) {
                        aVar = aVar2;
                    } else {
                        aVar.m(aVar2.i());
                        aVar.k(aVar2.g());
                    }
                } else if (aVar == null) {
                    aVar = aVar2;
                } else {
                    aVar.m(aVar2.i());
                    aVar.k(aVar2.g());
                }
            } else if (aVar == null) {
                aVar = aVar2;
            } else {
                aVar.m(aVar2.i());
                aVar.k(aVar2.g());
            }
        }
        if (!z10) {
            d(aVar, iMin, iMax, i14);
        }
        androidx.compose.runtime.collection.d<a> dVar = this.f19747a;
        this.f19747a = this.f19748b;
        this.f19748b = dVar;
        dVar.r();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChangeList(changes=[");
        androidx.compose.runtime.collection.d<a> dVar = this.f19747a;
        a[] aVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            a aVar = aVarArr[i10];
            sb2.append('(' + aVar.h() + AbstractJsonLexerKt.COMMA + aVar.g() + ")->(" + aVar.j() + AbstractJsonLexerKt.COMMA + aVar.i() + ')');
            if (i10 < a() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public q(@Nullable q qVar) {
        androidx.compose.runtime.collection.d<a> dVar;
        this.f19747a = new androidx.compose.runtime.collection.d<>(new a[16], 0);
        this.f19748b = new androidx.compose.runtime.collection.d<>(new a[16], 0);
        if (qVar == null || (dVar = qVar.f19747a) == null) {
            return;
        }
        a[] aVarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            a aVar = aVarArr[i10];
            this.f19747a.d(new a(aVar.j(), aVar.i(), aVar.h(), aVar.g()));
        }
    }

    public /* synthetic */ q(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : qVar);
    }
}
