package kotlin.uuid;

import java.io.Serializable;
import java.util.Comparator;
import kotlin.a1;
import kotlin.e1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.uuid.a
@e1(version = "2.0")
public final class d implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f313448e = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f313449f = 128;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f313451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f313452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f313446c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d f313447d = new d(0, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Comparator<d> f313450g = new Comparator() { // from class: kotlin.uuid.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.b((d) obj, (d) obj2);
        }
    };

    @SourceDebugExtension({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/Uuid$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,447:1\n1#2:448\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            if (byteArray.length == 16) {
                return b(g.p(byteArray, 0), g.p(byteArray, 8));
            }
            throw new IllegalArgumentException("Expected exactly 16 bytes");
        }

        @NotNull
        public final d b(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? e() : new d(j10, j11);
        }

        @NotNull
        public final d c(long j10, long j11) {
            return b(j10, j11);
        }

        @NotNull
        public final Comparator<d> d() {
            return d.f313450g;
        }

        @NotNull
        public final d e() {
            return d.f313447d;
        }

        @NotNull
        public final d f(@NotNull String uuidString) {
            Intrinsics.checkNotNullParameter(uuidString, "uuidString");
            if (uuidString.length() != 36) {
                throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
            }
            long jH = kotlin.text.g.H(uuidString, 0, 8, null, 4, null);
            g.m(uuidString, 8);
            long jH2 = kotlin.text.g.H(uuidString, 9, 13, null, 4, null);
            g.m(uuidString, 13);
            long jH3 = kotlin.text.g.H(uuidString, 14, 18, null, 4, null);
            g.m(uuidString, 18);
            long jH4 = kotlin.text.g.H(uuidString, 19, 23, null, 4, null);
            g.m(uuidString, 23);
            return b((jH << 32) | (jH2 << 16) | jH3, kotlin.text.g.H(uuidString, 24, 36, null, 4, null) | (jH4 << 48));
        }

        @NotNull
        public final d g(@NotNull String hexString) {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            if (hexString.length() == 32) {
                return b(kotlin.text.g.H(hexString, 0, 16, null, 4, null), kotlin.text.g.H(hexString, 16, 32, null, 4, null));
            }
            throw new IllegalArgumentException("Expected a 32-char hexadecimal string.");
        }

        @NotNull
        public final d h() {
            return f.f();
        }

        private a() {
        }
    }

    public d(long j10, long j11) {
        this.f313451a = j10;
        this.f313452b = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(d dVar, d dVar2) {
        long j10 = dVar.f313451a;
        return j10 != dVar2.f313451a ? Long.compareUnsigned(y1.n(j10), y1.n(dVar2.f313451a)) : Long.compareUnsigned(y1.n(dVar.f313452b), y1.n(dVar2.f313452b));
    }

    @a1
    public static /* synthetic */ void f() {
    }

    @a1
    public static /* synthetic */ void h() {
    }

    @kotlin.internal.f
    private final <T> T k(Function2<? super Long, ? super Long, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(g()), Long.valueOf(e()));
    }

    @kotlin.internal.f
    private final <T> T l(Function2<? super y1, ? super y1, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(y1.c(y1.n(g())), y1.c(y1.n(e())));
    }

    public final long e() {
        return this.f313452b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f313451a == dVar.f313451a && this.f313452b == dVar.f313452b;
    }

    public final long g() {
        return this.f313451a;
    }

    public int hashCode() {
        long j10 = this.f313451a ^ this.f313452b;
        return ((int) (j10 >> 32)) ^ ((int) j10);
    }

    @NotNull
    public final byte[] i() {
        byte[] bArr = new byte[16];
        g.o(this.f313451a, bArr, 0);
        g.o(this.f313452b, bArr, 8);
        return bArr;
    }

    @NotNull
    public final String j() {
        byte[] bArr = new byte[32];
        g.n(this.f313452b, bArr, 16, 8);
        g.n(this.f313451a, bArr, 0, 8);
        return StringsKt.F1(bArr);
    }

    @NotNull
    public String toString() {
        byte[] bArr = new byte[36];
        g.n(this.f313452b, bArr, 24, 6);
        bArr[23] = 45;
        g.n(this.f313452b >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        g.n(this.f313451a, bArr, 14, 2);
        bArr[13] = 45;
        g.n(this.f313451a >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        g.n(this.f313451a >>> 32, bArr, 0, 4);
        return StringsKt.F1(bArr);
    }
}
