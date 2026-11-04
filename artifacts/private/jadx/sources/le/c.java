package le;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f322670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f322671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f322672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final String f322673d;

        public a(long j10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f322670a = j10;
            this.f322671b = str;
            this.f322672c = str2;
            this.f322673d = str3;
        }

        public static /* synthetic */ a f(a aVar, long j10, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = aVar.f322670a;
            }
            long j11 = j10;
            if ((i10 & 2) != 0) {
                str = aVar.f322671b;
            }
            String str4 = str;
            if ((i10 & 4) != 0) {
                str2 = aVar.f322672c;
            }
            String str5 = str2;
            if ((i10 & 8) != 0) {
                str3 = aVar.f322673d;
            }
            return aVar.e(j11, str4, str5, str3);
        }

        public final long a() {
            return this.f322670a;
        }

        @Nullable
        public final String b() {
            return this.f322671b;
        }

        @Nullable
        public final String c() {
            return this.f322672c;
        }

        @Nullable
        public final String d() {
            return this.f322673d;
        }

        @NotNull
        public final a e(long j10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new a(j10, str, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f322670a == aVar.f322670a && Intrinsics.areEqual(this.f322671b, aVar.f322671b) && Intrinsics.areEqual(this.f322672c, aVar.f322672c) && Intrinsics.areEqual(this.f322673d, aVar.f322673d);
        }

        @Nullable
        public final String g() {
            return this.f322673d;
        }

        @Nullable
        public final String h() {
            return this.f322671b;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f322670a) * 31;
            String str = this.f322671b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f322672c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f322673d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final long i() {
            return this.f322670a;
        }

        @Nullable
        public final String j() {
            return this.f322672c;
        }

        @NotNull
        public String toString() {
            return "RoomStyleForDesignGenerator(remoteId=" + this.f322670a + ", name=" + this.f322671b + ", title=" + this.f322672c + ", imageUri=" + this.f322673d + ")";
        }
    }

    @Nullable
    Object a(@NotNull kotlin.coroutines.d<? super List<a>> dVar) throws IOException;
}
