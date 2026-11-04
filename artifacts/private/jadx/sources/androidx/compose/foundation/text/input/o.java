package androidx.compose.foundation.text.input;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f20297a = a.f20298a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f20298a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final o f20299b;

        static {
            int i10 = 0;
            f20299b = new b(i10, i10, 3, null);
        }

        private a() {
        }

        @NotNull
        public final o a() {
            return f20299b;
        }
    }

    @o2
    @SourceDebugExtension({"SMAP\nTextFieldLineLimits.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLineLimits.kt\nandroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,91:1\n97#2,4:92\n*S KotlinDebug\n*F\n+ 1 TextFieldLineLimits.kt\nandroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine\n*L\n61#1:92,4\n*E\n"})
    public static final class b implements o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f20300d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f20301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20302c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            int i10 = 0;
            this(i10, i10, 3, null);
        }

        public final int a() {
            return this.f20302c;
        }

        public final int b() {
            return this.f20301b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20301b == bVar.f20301b && this.f20302c == bVar.f20302c;
        }

        public int hashCode() {
            return (this.f20301b * 31) + this.f20302c;
        }

        @NotNull
        public String toString() {
            return "MultiLine(minHeightInLines=" + this.f20301b + ", maxHeightInLines=" + this.f20302c + ')';
        }

        public b(int i10, int i11) {
            this.f20301b = i10;
            this.f20302c = i11;
            boolean z10 = false;
            if (1 <= i10 && i10 <= i11) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            androidx.compose.foundation.internal.e.g("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i10 + ", " + i11);
        }

        public /* synthetic */ b(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 1 : i10, (i12 & 2) != 0 ? Integer.MAX_VALUE : i11);
        }
    }

    @w0(parameters = 1)
    public static final class c implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f20303b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f20304c = 0;

        private c() {
        }

        @NotNull
        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }
}
