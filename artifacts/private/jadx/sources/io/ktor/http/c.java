package io.ktor.http;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final d f295455a;

    public static final class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f295456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Integer f295457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f295458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f295459e;

        public /* synthetic */ a(int i10, Integer num, boolean z10, boolean z11, d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : dVar);
        }

        public final int b() {
            return this.f295456b;
        }

        public final boolean c() {
            return this.f295458d;
        }

        @Nullable
        public final Integer d() {
            return this.f295457c;
        }

        public final boolean e() {
            return this.f295459e;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.f295456b == this.f295456b && Intrinsics.areEqual(aVar.f295457c, this.f295457c) && aVar.f295458d == this.f295458d && aVar.f295459e == this.f295459e && aVar.a() == a()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f295456b * 31;
            Integer num = this.f295457c;
            int iIntValue = (((((i10 + (num != null ? num.intValue() : 0)) * 31) + Boolean.hashCode(this.f295458d)) * 31) + Boolean.hashCode(this.f295459e)) * 31;
            d dVarA = a();
            return iIntValue + (dVarA != null ? dVarA.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("max-age=" + this.f295456b);
            if (this.f295457c != null) {
                arrayList.add("s-maxage=" + this.f295457c);
            }
            if (this.f295458d) {
                arrayList.add(io.ktor.client.utils.d.f295395i);
            }
            if (this.f295459e) {
                arrayList.add(io.ktor.client.utils.d.f295398l);
            }
            if (a() != null) {
                arrayList.add(a().n());
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        }

        public a(int i10, @Nullable Integer num, boolean z10, boolean z11, @Nullable d dVar) {
            super(dVar);
            this.f295456b = i10;
            this.f295457c = num;
            this.f295458d = z10;
            this.f295459e = z11;
        }
    }

    public static final class b extends c {
        public b(@Nullable d dVar) {
            super(dVar);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && a() == ((b) obj).a();
        }

        public int hashCode() {
            d dVarA = a();
            if (dVarA != null) {
                return dVarA.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            if (a() == null) {
                return io.ktor.client.utils.d.f295392f;
            }
            return "no-cache, " + a().n();
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.c$c, reason: collision with other inner class name */
    public static final class C2076c extends c {
        public C2076c(@Nullable d dVar) {
            super(dVar);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof C2076c) && ((C2076c) obj).a() == a();
        }

        public int hashCode() {
            d dVarA = a();
            if (dVarA != null) {
                return dVarA.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            if (a() == null) {
                return io.ktor.client.utils.d.f295393g;
            }
            return "no-store, " + a().n();
        }
    }

    public enum d {
        Public("public"),
        Private(io.ktor.client.utils.d.f295397k);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f295463e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f295464a;

        static {
            int i10 = 2 ^ 0;
        }

        d(String str) {
            this.f295464a = str;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f295463e;
        }

        @NotNull
        public final String n() {
            return this.f295464a;
        }
    }

    public c(@Nullable d dVar) {
        this.f295455a = dVar;
    }

    @Nullable
    public final d a() {
        return this.f295455a;
    }
}
